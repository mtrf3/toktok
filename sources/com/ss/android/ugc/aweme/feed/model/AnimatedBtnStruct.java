package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AnimatedBtnStruct implements Serializable {

    @InterfaceC65349Pkn("appear_time")
    public Integer appearTime;

    @InterfaceC65349Pkn("continuous_show_count")
    public Integer continuousShowCount;

    @InterfaceC65349Pkn("interval_days")
    public Integer intervalDays;

    @InterfaceC65349Pkn("scenario")
    public Integer scenario;

    @InterfaceC65349Pkn("show_count_per_interval")
    public Integer showCountPerInterval;

    @InterfaceC65349Pkn("silence_days")
    public Integer silenceDays;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedBtnStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AnimatedBtnStruct copy$default(AnimatedBtnStruct animatedBtnStruct, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = animatedBtnStruct.scenario;
        }
        if ((i & 2) != 0) {
            num2 = animatedBtnStruct.appearTime;
        }
        if ((i & 4) != 0) {
            num3 = animatedBtnStruct.continuousShowCount;
        }
        if ((i & 8) != 0) {
            num4 = animatedBtnStruct.silenceDays;
        }
        if ((i & 16) != 0) {
            num5 = animatedBtnStruct.showCountPerInterval;
        }
        if ((i & 32) != 0) {
            num6 = animatedBtnStruct.intervalDays;
        }
        return animatedBtnStruct.copy(num, num2, num3, num4, num5, num6);
    }

    public final AnimatedBtnStruct copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new AnimatedBtnStruct(num, num2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatedBtnStruct)) {
            return false;
        }
        AnimatedBtnStruct animatedBtnStruct = (AnimatedBtnStruct) obj;
        return o.LJ(this.scenario, animatedBtnStruct.scenario) && o.LJ(this.appearTime, animatedBtnStruct.appearTime) && o.LJ(this.continuousShowCount, animatedBtnStruct.continuousShowCount) && o.LJ(this.silenceDays, animatedBtnStruct.silenceDays) && o.LJ(this.showCountPerInterval, animatedBtnStruct.showCountPerInterval) && o.LJ(this.intervalDays, animatedBtnStruct.intervalDays);
    }

    public int hashCode() {
        Integer num = this.scenario;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.appearTime;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.continuousShowCount;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.silenceDays;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.showCountPerInterval;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.intervalDays;
        return hashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatedBtnStruct(scenario=");
        LIZ.append(this.scenario);
        LIZ.append(", appearTime=");
        LIZ.append(this.appearTime);
        LIZ.append(", continuousShowCount=");
        LIZ.append(this.continuousShowCount);
        LIZ.append(", silenceDays=");
        LIZ.append(this.silenceDays);
        LIZ.append(", showCountPerInterval=");
        LIZ.append(this.showCountPerInterval);
        LIZ.append(", intervalDays=");
        return s0.LIZJ(LIZ, this.intervalDays, ')', LIZ);
    }

    public final Integer getAppearTime() {
        return this.appearTime;
    }

    public final Integer getContinuousShowCount() {
        return this.continuousShowCount;
    }

    public final Integer getIntervalDays() {
        return this.intervalDays;
    }

    public final Integer getScenario() {
        return this.scenario;
    }

    public final Integer getShowCountPerInterval() {
        return this.showCountPerInterval;
    }

    public final Integer getSilenceDays() {
        return this.silenceDays;
    }

    public AnimatedBtnStruct(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.scenario = num;
        this.appearTime = num2;
        this.continuousShowCount = num3;
        this.silenceDays = num4;
        this.showCountPerInterval = num5;
        this.intervalDays = num6;
    }

    public /* synthetic */ AnimatedBtnStruct(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Integer.valueOf(AnimatedBtnScenario.UNKNOWN.getValue()) : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) == 0 ? num6 : null);
    }
}
