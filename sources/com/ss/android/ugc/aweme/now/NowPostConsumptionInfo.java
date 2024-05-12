package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostConsumptionInfo implements Serializable {

    @InterfaceC65349Pkn("blur_type")
    public int blurType;

    @InterfaceC65349Pkn("forced_visibility")
    public NowForcedVisibility nowForcedVisibility;

    /* JADX WARN: Multi-variable type inference failed */
    public NowPostConsumptionInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NowPostConsumptionInfo copy$default(NowPostConsumptionInfo nowPostConsumptionInfo, NowForcedVisibility nowForcedVisibility, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nowForcedVisibility = nowPostConsumptionInfo.nowForcedVisibility;
        }
        if ((i2 & 2) != 0) {
            i = nowPostConsumptionInfo.blurType;
        }
        return nowPostConsumptionInfo.copy(nowForcedVisibility, i);
    }

    public final NowPostConsumptionInfo copy(NowForcedVisibility nowForcedVisibility, int i) {
        return new NowPostConsumptionInfo(nowForcedVisibility, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowPostConsumptionInfo)) {
            return false;
        }
        NowPostConsumptionInfo nowPostConsumptionInfo = (NowPostConsumptionInfo) obj;
        return o.LJ(this.nowForcedVisibility, nowPostConsumptionInfo.nowForcedVisibility) && this.blurType == nowPostConsumptionInfo.blurType;
    }

    public int hashCode() {
        NowForcedVisibility nowForcedVisibility = this.nowForcedVisibility;
        return ((nowForcedVisibility == null ? 0 : nowForcedVisibility.hashCode()) * 31) + this.blurType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPostConsumptionInfo(nowForcedVisibility=");
        LIZ.append(this.nowForcedVisibility);
        LIZ.append(", blurType=");
        return b0.LIZJ(LIZ, this.blurType, ')', LIZ);
    }

    public final int getBlurType() {
        return this.blurType;
    }

    public final NowForcedVisibility getNowForcedVisibility() {
        return this.nowForcedVisibility;
    }

    public NowPostConsumptionInfo(NowForcedVisibility nowForcedVisibility, int i) {
        this.nowForcedVisibility = nowForcedVisibility;
        this.blurType = i;
    }

    public /* synthetic */ NowPostConsumptionInfo(NowForcedVisibility nowForcedVisibility, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : nowForcedVisibility, (i2 & 2) != 0 ? 0 : i);
    }
}
