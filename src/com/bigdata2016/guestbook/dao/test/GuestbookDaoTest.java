package com.bigdata2016.guestbook.dao.test;

import java.util.List;

import com.bigdata2016.guestbook.dao.GuestbookDao;
import com.bigdata2016.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		
		insertTest();
		
		//selectTest();
		
		//deleteTest();
		
	}
	
	public static void deleteTest() {
		GuestbookDao dao = new GuestbookDao();
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(13L);
		vo.setPassword("1234");
		
		dao.delete(vo);
	}
	
	public static void selectTest() {
		GuestbookDao dao = new GuestbookDao();
		List<GuestbookVo> list =  dao.getList();
		for( GuestbookVo vo : list ) {
			System.out.println( vo );
		}
	}
	
	public static void insertTest(){
		GuestbookDao dao = new GuestbookDao();
		GuestbookVo vo = new GuestbookVo();
		vo.setName( "둘리2" );
		vo.setPassword( "1234" );
		vo.setMessage( "호이2" );
		
		dao.insert( vo );
	}
}
