package dummy.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dummy.dao.IMyDao;
import dummy.dto.MyDto1;
import dummy.service.impl.MyService;
import mockit.FullVerifications;
import mockit.Injectable;
import mockit.Tested;

class MyServiceTest {

	@Tested
	private MyService myService;

	@Injectable
	private IMyDao myDaoMock;

	@Test
	void testDoSomething() {
		int nbInsert = 1;

		myService.insertMyDto1(nbInsert);

		new FullVerifications() {
			{
				List<MyDto1> actualMyDtos = new ArrayList<>();
				myDaoMock.insertMyDto(withCapture(actualMyDtos));

				assertEquals(nbInsert, actualMyDtos.size());
			}
		};
	}

}
