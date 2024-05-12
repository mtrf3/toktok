package com.ss.android.ugc.aweme.feed.motivatelogin;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MotivateLoginPopupFreqParams {

    @InterfaceC65349Pkn("max_impr_per_round_interval")
    public final Integer maxImprPerRoundInterval;

    @InterfaceC65349Pkn("per_round_interval")
    public final Integer maxPerRoundInterval;

    @InterfaceC65349Pkn("per_time_range")
    public final Integer maxPerTimeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public MotivateLoginPopupFreqParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotivateLoginPopupFreqParams)) {
            return false;
        }
        MotivateLoginPopupFreqParams motivateLoginPopupFreqParams = (MotivateLoginPopupFreqParams) obj;
        return o.LJ(this.maxPerTimeRange, motivateLoginPopupFreqParams.maxPerTimeRange) && o.LJ(this.maxImprPerRoundInterval, motivateLoginPopupFreqParams.maxImprPerRoundInterval) && o.LJ(this.maxPerRoundInterval, motivateLoginPopupFreqParams.maxPerRoundInterval);
    }

    public final int hashCode() {
        Integer num = this.maxPerTimeRange;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxImprPerRoundInterval;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxPerRoundInterval;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MotivateLoginPopupFreqParams(maxPerTimeRange=");
        LIZ.append(this.maxPerTimeRange);
        LIZ.append(", maxImprPerRoundInterval=");
        LIZ.append(this.maxImprPerRoundInterval);
        LIZ.append(", maxPerRoundInterval=");
        return s0.LIZJ(LIZ, this.maxPerRoundInterval, ')', LIZ);
    }

    public MotivateLoginPopupFreqParams(Integer num, Integer num2, Integer num3) {
        this.maxPerTimeRange = num;
        this.maxImprPerRoundInterval = num2;
        this.maxPerRoundInterval = num3;
    }

    public /* synthetic */ MotivateLoginPopupFreqParams(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 24 : num, (i & 2) != 0 ? 3 : num2, (i & 4) != 0 ? 7 : num3);
    }
}
