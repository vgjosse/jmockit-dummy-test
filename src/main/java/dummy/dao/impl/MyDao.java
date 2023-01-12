package dummy.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import dummy.dao.IMyDao;
import dummy.dto.AbstractMyDto;

@Repository
public class MyDao implements IMyDao {

	private static final Logger LOGGER = LogManager.getLogger(MyDao.class);

	@Override
	public void insertMyDto(final AbstractMyDto myDto) {
		LOGGER.info("Insert {} - id {}", myDto.getClass().getSimpleName(), myDto.getId());
	}

}
