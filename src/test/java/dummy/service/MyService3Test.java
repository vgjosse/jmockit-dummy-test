package dummy.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dummy.dao.IMyDao;
import dummy.dto.MyDto3;
import dummy.service.impl.MyService;
import mockit.FullVerifications;
import mockit.Injectable;
import mockit.Tested;

class MyService3Test {

	@Tested
	private MyService myService;

	@Injectable
	private IMyDao myDaoMock;

	@Test
	void testDoSomething() {
		int nbInsert = 3;

		myService.insertMyDto3(nbInsert);

		new FullVerifications() {
			{
				List<MyDto3> actualMyDtos = new ArrayList<>();
				myDaoMock.insertMyDto(withCapture(actualMyDtos));

				assertEquals(nbInsert, actualMyDtos.size());
			}
		};
	}

}
