package com.spring.db.jdbc.score.repository;

import java.util.List;

import com.spring.db.jdbc.score.model.ScoreVO;

public interface IScoreDAO {
	
	//점수를 등록하는 기능
	void insertScore(ScoreVO scores);
	
	//점수 전체 조회 기능
	List<ScoreVO> selectAllScores();
	
	//점수 삭제 기능
	void deleteScore(int stuNum);
	
	//점수 개별 조회 기능
	ScoreVO selectOne(int stuNum);

}







