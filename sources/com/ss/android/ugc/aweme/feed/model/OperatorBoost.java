package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class OperatorBoost extends F9E implements Serializable {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("target_vv")
    public long targetVv;

    public OperatorBoost() {
    }

    public static /* synthetic */ OperatorBoost copy$default(OperatorBoost operatorBoost, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = operatorBoost.targetVv;
        }
        if ((i & 2) != 0) {
            j2 = operatorBoost.endTime;
        }
        if ((i & 4) != 0) {
            str = operatorBoost.region;
        }
        return operatorBoost.copy(j, j2, str);
    }

    public final OperatorBoost copy(long j, long j2, String region) {
        o.LJIIIZ(region, "region");
        return new OperatorBoost(j, j2, region);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.targetVv), Long.valueOf(this.endTime), this.region};
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getRegion() {
        return this.region;
    }

    public final long getTargetVv() {
        return this.targetVv;
    }

    public OperatorBoost(long j, long j2, String region) {
        o.LJIIIZ(region, "region");
        this.targetVv = j;
        this.endTime = j2;
        this.region = region;
    }
}
