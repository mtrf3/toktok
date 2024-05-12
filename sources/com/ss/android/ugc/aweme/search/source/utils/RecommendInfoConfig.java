package com.ss.android.ugc.aweme.search.source.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RecommendInfoConfig extends F9E {

    @InterfaceC65349Pkn("max_gid_count")
    public final int maxGidCount;

    @InterfaceC65349Pkn("max_query_count")
    public final int maxQueryCount;

    @InterfaceC65349Pkn("reporting_time_span_minutes")
    public final int reportingTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecommendInfoConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxGidCount), Integer.valueOf(this.maxQueryCount), Integer.valueOf(this.reportingTime)};
    }

    public RecommendInfoConfig(int i, int i2, int i3) {
        this.maxGidCount = i;
        this.maxQueryCount = i2;
        this.reportingTime = i3;
    }

    public /* synthetic */ RecommendInfoConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 10 : i3);
    }
}
