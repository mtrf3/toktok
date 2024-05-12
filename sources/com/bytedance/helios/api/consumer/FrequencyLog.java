package com.bytedance.helios.api.consumer;

import X.F9E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FrequencyLog extends F9E {
    public final Map<String, Integer> apiCallCountMap;
    public final int callCount;
    public final int callThreshold;
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrequencyLog copy$default(FrequencyLog frequencyLog, String str, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = frequencyLog.name;
        }
        if ((i3 & 2) != 0) {
            i = frequencyLog.callCount;
        }
        if ((i3 & 4) != 0) {
            i2 = frequencyLog.callThreshold;
        }
        if ((i3 & 8) != 0) {
            map = frequencyLog.apiCallCountMap;
        }
        return frequencyLog.copy(str, i, i2, map);
    }

    public final FrequencyLog copy(String name, int i, int i2, Map<String, Integer> apiCallCountMap) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(apiCallCountMap, "apiCallCountMap");
        return new FrequencyLog(name, i, i2, apiCallCountMap);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, Integer.valueOf(this.callCount), Integer.valueOf(this.callThreshold), this.apiCallCountMap};
    }

    public final Map<String, Integer> getApiCallCountMap() {
        return this.apiCallCountMap;
    }

    public final int getCallCount() {
        return this.callCount;
    }

    public final int getCallThreshold() {
        return this.callThreshold;
    }

    public final String getName() {
        return this.name;
    }

    public FrequencyLog(String name, int i, int i2, Map<String, Integer> apiCallCountMap) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(apiCallCountMap, "apiCallCountMap");
        this.name = name;
        this.callCount = i;
        this.callThreshold = i2;
        this.apiCallCountMap = apiCallCountMap;
    }

    public /* synthetic */ FrequencyLog(String str, int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? new LinkedHashMap() : map);
    }
}
