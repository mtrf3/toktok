package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InnerPushConfig implements Serializable {

    @InterfaceC65349Pkn("avoid_scenes")
    public final List<Integer> avoidScenarios;

    @InterfaceC65349Pkn("freq_control_strategy")
    public final InnerPushFreqControlStrategy freqControlStrategy;

    @InterfaceC65349Pkn("popup_duration_seconds")
    public final int popupDurationSeconds;

    @InterfaceC65349Pkn("priority")
    public final int priority;

    @InterfaceC65349Pkn("ttl_seconds")
    public final long ttlSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushConfig() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 31
            r0 = r9
            r5 = r3
            r6 = r4
            r8 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerPushConfig copy$default(InnerPushConfig innerPushConfig, long j, InnerPushFreqControlStrategy innerPushFreqControlStrategy, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = innerPushConfig.ttlSeconds;
        }
        if ((i3 & 2) != 0) {
            innerPushFreqControlStrategy = innerPushConfig.freqControlStrategy;
        }
        if ((i3 & 4) != 0) {
            i = innerPushConfig.priority;
        }
        if ((i3 & 8) != 0) {
            list = innerPushConfig.avoidScenarios;
        }
        if ((i3 & 16) != 0) {
            i2 = innerPushConfig.popupDurationSeconds;
        }
        return innerPushConfig.copy(j, innerPushFreqControlStrategy, i, list, i2);
    }

    public final InnerPushConfig copy(long j, InnerPushFreqControlStrategy innerPushFreqControlStrategy, int i, List<Integer> list, int i2) {
        return new InnerPushConfig(j, innerPushFreqControlStrategy, i, list, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushConfig)) {
            return false;
        }
        InnerPushConfig innerPushConfig = (InnerPushConfig) obj;
        return this.ttlSeconds == innerPushConfig.ttlSeconds && o.LJ(this.freqControlStrategy, innerPushConfig.freqControlStrategy) && this.priority == innerPushConfig.priority && o.LJ(this.avoidScenarios, innerPushConfig.avoidScenarios) && this.popupDurationSeconds == innerPushConfig.popupDurationSeconds;
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.ttlSeconds) * 31;
        InnerPushFreqControlStrategy innerPushFreqControlStrategy = this.freqControlStrategy;
        int hashCode = (((LLJIJIL + (innerPushFreqControlStrategy == null ? 0 : innerPushFreqControlStrategy.hashCode())) * 31) + this.priority) * 31;
        List<Integer> list = this.avoidScenarios;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.popupDurationSeconds;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPushConfig(ttlSeconds=");
        LIZ.append(this.ttlSeconds);
        LIZ.append(", freqControlStrategy=");
        LIZ.append(this.freqControlStrategy);
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append(", avoidScenarios=");
        LIZ.append(this.avoidScenarios);
        LIZ.append(", popupDurationSeconds=");
        return b0.LIZJ(LIZ, this.popupDurationSeconds, ')', LIZ);
    }

    public final List<Integer> getAvoidScenarios() {
        return this.avoidScenarios;
    }

    public final InnerPushFreqControlStrategy getFreqControlStrategy() {
        return this.freqControlStrategy;
    }

    public final int getPopupDurationSeconds() {
        return this.popupDurationSeconds;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final long getTtlSeconds() {
        return this.ttlSeconds;
    }

    public InnerPushConfig(long j, InnerPushFreqControlStrategy innerPushFreqControlStrategy, int i, List<Integer> list, int i2) {
        this.ttlSeconds = j;
        this.freqControlStrategy = innerPushFreqControlStrategy;
        this.priority = i;
        this.avoidScenarios = list;
        this.popupDurationSeconds = i2;
    }

    public /* synthetic */ InnerPushConfig(long j, InnerPushFreqControlStrategy innerPushFreqControlStrategy, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? null : innerPushFreqControlStrategy, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? list : null, (i3 & 16) != 0 ? 5 : i2);
    }
}
