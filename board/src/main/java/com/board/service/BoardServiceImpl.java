package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDao;
import com.board.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDao dao;
 
 @Override
 public List<Board> list() throws Exception {

  return dao.list();
 }

@Override
public void write(Board board) throws Exception {
	// TODO Auto-generated method stub
	dao.write(board);
}

@Override
public Board view(int bno) throws Exception {
	// TODO Auto-generated method stub
	return dao.view(bno);
}

@Override
public void modify(Board board) throws Exception {
	// TODO Auto-generated method stub
	dao.modify(board);
}

@Override
public void delete(int bno) throws Exception {
	// TODO Auto-generated method stub
	dao.delete(bno);
}

@Override
public int count() throws Exception {
	// TODO Auto-generated method stub
	return dao.count();
}

@Override
public List listPage(int displayPost, int postNum) throws Exception {
	// TODO Auto-generated method stub
	return dao.listPage(displayPost, postNum);
}

//게시물 목록 + 페이징 + 검색
@Override
public List<Board> listPageSearch(
int displayPost, int postNum, String searchType, String keyword) throws Exception {
return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
}

//게시물 총 갯수
@Override
public int searchCount(String searchType, String keyword) throws Exception {
return dao.searchCount(searchType, keyword);
}



}