package org.example.personalproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.demoeight.dto.board.request.BoardSaveRequestDto;
import org.example.demoeight.dto.board.request.BoardUpdateRequestDto;
import org.example.demoeight.dto.board.response.BoardSaveResponseDto;
import org.example.demoeight.dto.board.response.BoardSimpleResponseDto;
import org.example.demoeight.dto.board.response.BoardUpdateResponseDto;
import org.example.demoeight.service.BoardService;
import org.example.personalproject.dto.board.request.ScheduleSaveRequestDto;
import org.example.personalproject.dto.board.request.ScheduleUpdateRequestDto;
import org.example.personalproject.dto.board.response.ScheduleSaveResponseDto;
import org.example.personalproject.dto.board.response.ScheduleSimpleResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleSaveResponseDto> saveBoard(@RequestBody ScheduleSaveRequestDto boardSaveRequestDto) {
        return ResponseEntity.ok(ScheduleService.saveBoard(boardSaveRequestDto));
    }

    @GetMapping("/schedules")
    public ResponseEntity<Page<ScheduleSimpleResponseDto>> getSchedules(
            @RequestParam(defaultValue = "1", required = false) int page,
            @RequestParam(defaultValue = "10", required = false) int size
    ) {
        return ResponseEntity.ok(scheduleService.getSchedules(page, size));
    }

    @PutMapping("/schedules/{scheduleId}")
    public ResponseEntity<ScheduleSaveResponseDto> updateSchedule(@PathVariable Long scheduleId, @RequestBody ScheduleUpdateRequestDto scheduleUpdateRequestDto) {
        return ResponseEntity.ok(scheduleService.updateSchedule(scheduleId, scheduleUpdateRequestDto));
    }

    @DeleteMapping("/schedules/{scheduleId}")
    public void deleteSchedule(@PathVariable Long scheduleId) {
        scheduleService.deleteSchedule(scheduleId);
    }
}
