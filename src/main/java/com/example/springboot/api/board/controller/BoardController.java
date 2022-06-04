package com.example.springboot.api.board.controller;

import com.example.springboot.api.board.model.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BoardController {
    public BoardController() {
        System.out.println("====> BoardController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello" + name;
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard() {
        BoardVO boardVO = new BoardVO();
        boardVO.setSeq(1);
        boardVO.setTitle("테스트 제목...");
        boardVO.setWriter("테스터");
        boardVO.setContent("테스트 내용입니다....");
        boardVO.setCreateDate(new Date());
        boardVO.setCnt(0);
        return boardVO;
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardVOArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BoardVO boardVO = new BoardVO();
            boardVO.setSeq(i);
            boardVO.setTitle("테스트 제목..." + i);
            boardVO.setWriter("테스터");
            boardVO.setContent(i + "번 테스트 내용입니다....");
            boardVO.setCreateDate(new Date());
            boardVO.setCnt(0);
            boardVOArrayList.add(boardVO);
        }
        return boardVOArrayList;
    }
}
