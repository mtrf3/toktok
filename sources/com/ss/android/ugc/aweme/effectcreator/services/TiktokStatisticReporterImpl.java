package com.ss.android.ugc.aweme.effectcreator.services;

import X.C113554cx;
import X.FMX;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokStatisticReporterImpl implements StatisticReporter {
    private final Map<String, String> appendAMECommonParam(Map<String, String> map) {
        Map<String, String> LJJLIL = C113554cx.LJJLIL(map);
        LJJLIL.put("is_ame_data", "1");
        return LJJLIL;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter
    public void onEvent(String eventName) {
        o.LJIIIZ(eventName, "eventName");
        onEvent(eventName, C113554cx.LJJJLIIL());
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter
    public void onEvent(String eventName, Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(map, "map");
        FMX.LJIIL(eventName, appendAMECommonParam(map));
    }
}
