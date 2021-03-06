package me.lukeben.hooks;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

public class HookManager {

    @Getter
    private static transient final HookManager instance = new HookManager();

    @Getter
    private final List<Hook> hooks = Lists.newArrayList();



}
