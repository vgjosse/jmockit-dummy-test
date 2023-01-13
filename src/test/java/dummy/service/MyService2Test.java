package dummy.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dummy.dao.IMyDao;
import dummy.dto.MyDto2;
import dummy.service.impl.MyService;
import mockit.FullVerifications;
import mockit.Injectable;
import mockit.Tested;

class MyService2Test {

	@Tested
	private MyService myService;

	@Injectable
	private IMyDao myDaoMock;

	@Test
	void testDoSomething() {
		int nbInsert = 2;

		myService.insertMyDto2(nbInsert);

		new FullVerifications() {
			{
				List<MyDto2> actualMyDtos = new ArrayList<>();
				myDaoMock.insertMyDto(withCapture(actualMyDtos));
				times = nbInsert;

				assertEquals(nbInsert, actualMyDtos.size());
			}
		};
	}

}
