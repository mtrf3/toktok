package com.ss.android.ugc.aweme.nows.campaign.p004new.year;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowNewYearEventConfig {

    @InterfaceC65349Pkn("chrisTime")
    public final NowNewYearTimeRange chrisTime;

    @InterfaceC65349Pkn("newYearTime")
    public final NowNewYearTimeRange newYearTime;

    @InterfaceC65349Pkn("regions")
    public final m regions;

    /* JADX WARN: Multi-variable type inference failed */
    public NowNewYearEventConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowNewYearEventConfig)) {
            return false;
        }
        NowNewYearEventConfig nowNewYearEventConfig = (NowNewYearEventConfig) obj;
        return o.LJ(this.regions, nowNewYearEventConfig.regions) && o.LJ(this.chrisTime, nowNewYearEventConfig.chrisTime) && o.LJ(this.newYearTime, nowNewYearEventConfig.newYearTime);
    }

    public final int hashCode() {
        m mVar = this.regions;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        NowNewYearTimeRange nowNewYearTimeRange = this.chrisTime;
        int hashCode2 = (hashCode + (nowNewYearTimeRange == null ? 0 : nowNewYearTimeRange.hashCode())) * 31;
        NowNewYearTimeRange nowNewYearTimeRange2 = this.newYearTime;
        return hashCode2 + (nowNewYearTimeRange2 != null ? nowNewYearTimeRange2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowNewYearEventConfig(regions=");
        LIZ.append(this.regions);
        LIZ.append(", chrisTime=");
        LIZ.append(this.chrisTime);
        LIZ.append(", newYearTime=");
        LIZ.append(this.newYearTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NowNewYearEventConfig(m mVar, NowNewYearTimeRange nowNewYearTimeRange, NowNewYearTimeRange nowNewYearTimeRange2) {
        this.regions = mVar;
        this.chrisTime = nowNewYearTimeRange;
        this.newYearTime = nowNewYearTimeRange2;
    }

    public /* synthetic */ NowNewYearEventConfig(m mVar, NowNewYearTimeRange nowNewYearTimeRange, NowNewYearTimeRange nowNewYearTimeRange2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? null : nowNewYearTimeRange, (i & 4) != 0 ? null : nowNewYearTimeRange2);
    }
}
