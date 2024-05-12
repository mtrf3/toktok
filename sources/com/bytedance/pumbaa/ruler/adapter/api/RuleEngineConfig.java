package com.bytedance.pumbaa.ruler.adapter.api;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RuleEngineConfig extends F9E {

    @InterfaceC65349Pkn("ab_tag")
    public final String abTag;

    @InterfaceC65349Pkn("enable_api_strategy")
    public final boolean enableApiStrategy;

    @InterfaceC65349Pkn("enable_app_log")
    public final boolean enableAppLog;

    @InterfaceC65349Pkn("enable_bpea_ruler_filter")
    public final boolean enableBPEARulerFilter;

    @InterfaceC65349Pkn("enable_disk_cache")
    public final boolean enableDiskCache;

    @InterfaceC65349Pkn("enable_fff")
    public final boolean enableFFF;

    @InterfaceC65349Pkn("enable_instruction_list")
    public final boolean enableInstructionList;

    @InterfaceC65349Pkn("enable_precache_cel")
    public final boolean enablePrecacheCel;

    @InterfaceC65349Pkn("enable_rule_engine")
    public final boolean enableRuleEngine;

    @InterfaceC65349Pkn("enable_rule_engine_for_bpea")
    public final boolean enableRuleEngineForBpea;

    @InterfaceC65349Pkn("enable_rule_engine_for_bpea_block")
    public final boolean enableRuleEngineForBpeaBlock;

    @InterfaceC65349Pkn("enable_simplify_set_select")
    public final boolean enableSimplifySetSelect;

    @InterfaceC65349Pkn("enable_strategy_select_cache")
    public final boolean enableStrategySelectCache;

    @InterfaceC65349Pkn("expression_cache_size")
    public final int expressionCacheSize;

    @InterfaceC65349Pkn("global_sample_rate")
    public final m globalSampleRate;

    @InterfaceC65349Pkn("log_level")
    public final int logLevel;

    @InterfaceC65349Pkn("main_thread_lock_time")
    public final Long mainThreadLockTime;

    @InterfaceC65349Pkn("precache_rules")
    public final List<String> precacheRules;

    @InterfaceC65349Pkn("sync_cache_delay")
    public final Long syncCacheDelay;

    public RuleEngineConfig() {
        this(false, 0, false, 0, false, null, null, false, false, false, false, false, false, null, null, false, false, false, null, 524287, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableRuleEngine), Integer.valueOf(this.expressionCacheSize), Boolean.valueOf(this.enableAppLog), Integer.valueOf(this.logLevel), Boolean.valueOf(this.enablePrecacheCel), this.precacheRules, this.mainThreadLockTime, Boolean.valueOf(this.enableStrategySelectCache), Boolean.valueOf(this.enableApiStrategy), Boolean.valueOf(this.enableSimplifySetSelect), Boolean.valueOf(this.enableInstructionList), Boolean.valueOf(this.enableRuleEngineForBpea), Boolean.valueOf(this.enableRuleEngineForBpeaBlock), this.syncCacheDelay, this.globalSampleRate, Boolean.valueOf(this.enableDiskCache), Boolean.valueOf(this.enableBPEARulerFilter), Boolean.valueOf(this.enableFFF), this.abTag};
    }

    public RuleEngineConfig(boolean z, int i, boolean z2, int i2, boolean z3, List<String> precacheRules, Long l, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Long l2, m mVar, boolean z10, boolean z11, boolean z12, String str) {
        o.LJIIIZ(precacheRules, "precacheRules");
        this.enableRuleEngine = z;
        this.expressionCacheSize = i;
        this.enableAppLog = z2;
        this.logLevel = i2;
        this.enablePrecacheCel = z3;
        this.precacheRules = precacheRules;
        this.mainThreadLockTime = l;
        this.enableStrategySelectCache = z4;
        this.enableApiStrategy = z5;
        this.enableSimplifySetSelect = z6;
        this.enableInstructionList = z7;
        this.enableRuleEngineForBpea = z8;
        this.enableRuleEngineForBpeaBlock = z9;
        this.syncCacheDelay = l2;
        this.globalSampleRate = mVar;
        this.enableDiskCache = z10;
        this.enableBPEARulerFilter = z11;
        this.enableFFF = z12;
        this.abTag = str;
    }

    public RuleEngineConfig(boolean z, int i, boolean z2, int i2, boolean z3, List list, Long l, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Long l2, m mVar, boolean z10, boolean z11, boolean z12, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 100 : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 5 : i2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? C61878OQg.INSTANCE : list, (i3 & 64) != 0 ? null : l, (i3 & 128) != 0 ? true : z4, (i3 & 256) != 0 ? false : z5, (i3 & 512) != 0 ? true : z6, (i3 & 1024) != 0 ? false : z7, (i3 & 2048) != 0 ? false : z8, (i3 & 4096) != 0 ? false : z9, (i3 & FileUtils.BUFFER_SIZE) != 0 ? 0L : l2, (i3 & 16384) != 0 ? null : mVar, (32768 & i3) != 0 ? true : z10, (65536 & i3) != 0 ? false : z11, (131072 & i3) != 0 ? false : z12, (i3 & 262144) != 0 ? null : str);
    }
}
