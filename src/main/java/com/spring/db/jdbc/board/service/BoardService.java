package com.spring.db.jdbc.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.jdbc.board.model.BoardVO;
import com.spring.db.jdbc.board.repository.IBoardDAO;
import com.spring.db.jdbc.board.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {

	//JDBC Template을 이용한 SQL 처리.
//	@Autowired
//	private IBoardDAO dao;
	
	//MyBatis를 이용한 SQL 처리.
	@Autowired
	private IBoardMapper mapper;
	
	@Override
	public void insertArticle(BoardVO article) {
		mapper.insertArticle(article);
	}

	@Override
	public List<BoardVO> getArticles() {
		return mapper.getArticles();
	}

	@Override
	public void deleteArticle(int index) {
		mapper.deleteArticle(index);
	}

	@Override
	public BoardVO getContent(int index) {
		return mapper.getContent(index);
	}

	@Override
	public void modifyArticle(BoardVO article) {
		mapper.modifyArticle(article);
	}

}






