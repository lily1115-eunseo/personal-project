package org.example.personalproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.demoeight.dto.comment.request.CommentSaveRequestDto;
import org.example.demoeight.dto.comment.response.CommentResponseDto;
import org.example.demoeight.dto.comment.response.CommentSaveResponseDto;
import org.example.demoeight.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/schedules/{schedulesId}/comments")
    public CommentSaveResponseDto saveComment(@PathVariable Long scheduleId, @RequestBody CommentSaveRequestDto commentSaveRequestDto) {
        return commentService.saveComment(scheduleId, commentSaveRequestDto);
    }

    @GetMapping("/schedules/comments")
    public List<CommentResponseDto> getComments() {
        return commentService.getComments();
    }
}
