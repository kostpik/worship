package ru.worchip.app.worchip.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalTime;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
public class WorschipItemDay {
    private LocalTime dateWorchip;
    private Set<Holiday> holidays;
    private Set<PartWorship> partWorhips;
}
