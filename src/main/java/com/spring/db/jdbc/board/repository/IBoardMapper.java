package com.spring.db.jdbc.board.repository;

import java.util.List;

import com.spring.db.jdbc.board.model.BoardVO;

public interface IBoardMapper {

	//게시글 등록
	void insertArticle(BoardVO article);
	
	//게시글 전체 목록 가져오기
	List<BoardVO> getArticles();
	
	//게시글 삭제
	void deleteArticle(int index);
	
	//게시글 상세 내용 보기
	BoardVO getContent(int index);
	
	//게시글 수정
	void modifyArticle(BoardVO article);

	
}
