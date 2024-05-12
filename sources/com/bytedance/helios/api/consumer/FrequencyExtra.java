package com.bytedance.helios.api.consumer;

import X.F9E;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FrequencyExtra extends F9E {
    public Set<FrequencyLog> frequencyLogs;
    public Set<String> frequencyNames;

    /* JADX WARN: Multi-variable type inference failed */
    public FrequencyExtra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrequencyExtra copy$default(FrequencyExtra frequencyExtra, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = frequencyExtra.frequencyNames;
        }
        if ((i & 2) != 0) {
            set2 = frequencyExtra.frequencyLogs;
        }
        return frequencyExtra.copy(set, set2);
    }

    public final FrequencyExtra copy(Set<String> frequencyNames, Set<FrequencyLog> frequencyLogs) {
        o.LJIIIZ(frequencyNames, "frequencyNames");
        o.LJIIIZ(frequencyLogs, "frequencyLogs");
        return new FrequencyExtra(frequencyNames, frequencyLogs);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.frequencyNames, this.frequencyLogs};
    }

    public final Set<FrequencyLog> getFrequencyLogs() {
        return this.frequencyLogs;
    }

    public final Set<String> getFrequencyNames() {
        return this.frequencyNames;
    }

    public final void setFrequencyLogs(Set<FrequencyLog> set) {
        o.LJIIIZ(set, "<set-?>");
        this.frequencyLogs = set;
    }

    public final void setFrequencyNames(Set<String> set) {
        o.LJIIIZ(set, "<set-?>");
        this.frequencyNames = set;
    }

    public FrequencyExtra(Set<String> frequencyNames, Set<FrequencyLog> frequencyLogs) {
        o.LJIIIZ(frequencyNames, "frequencyNames");
        o.LJIIIZ(frequencyLogs, "frequencyLogs");
        this.frequencyNames = frequencyNames;
        this.frequencyLogs = frequencyLogs;
    }

    public /* synthetic */ FrequencyExtra(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : set, (i & 2) != 0 ? new LinkedHashSet() : set2);
    }
}
