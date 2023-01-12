package dummy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dummy.dao.IMyDao;
import dummy.dto.MyDto1;
import dummy.dto.MyDto2;
import dummy.dto.MyDto3;
import dummy.service.IMyService;

@Service
public class MyService implements IMyService {

	private static final String LABEL = "label";

	@Autowired
	private IMyDao myDao;

	@Override
	public void insertMyDto1(final int nbInsert) {
		for (int i = 0; i < nbInsert; i++) {
			myDao.insertMyDto(new MyDto1(i, LABEL + i));
		}
	}

	@Override
	public void insertMyDto2(final int nbInsert) {
		for (int i = 0; i < nbInsert; i++) {
			myDao.insertMyDto(new MyDto2(i, LABEL + i));
		}
	}

	@Override
	public void insertMyDto3(final int nbInsert) {
		for (int i = 0; i < nbInsert; i++) {
			myDao.insertMyDto(new MyDto3(i, LABEL + i));
		}
	}

}
