package com.ss.android.ugc.aweme.aigc;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AIGCQuota implements Serializable {

    @InterfaceC65349Pkn("quota_remain")
    public final Integer quotaRemain;

    @InterfaceC65349Pkn("quota_type")
    public final String quotaType;

    public static /* synthetic */ AIGCQuota copy$default(AIGCQuota aIGCQuota, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIGCQuota.quotaType;
        }
        if ((i & 2) != 0) {
            num = aIGCQuota.quotaRemain;
        }
        return aIGCQuota.copy(str, num);
    }

    public final AIGCQuota copy(String str, Integer num) {
        return new AIGCQuota(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCQuota)) {
            return false;
        }
        AIGCQuota aIGCQuota = (AIGCQuota) obj;
        return o.LJ(this.quotaType, aIGCQuota.quotaType) && o.LJ(this.quotaRemain, aIGCQuota.quotaRemain);
    }

    public int hashCode() {
        String str = this.quotaType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quotaRemain;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIGCQuota(quotaType=");
        LIZ.append(this.quotaType);
        LIZ.append(", quotaRemain=");
        return s0.LIZJ(LIZ, this.quotaRemain, ')', LIZ);
    }

    public final Integer getQuotaRemain() {
        return this.quotaRemain;
    }

    public final String getQuotaType() {
        return this.quotaType;
    }

    public AIGCQuota(String str, Integer num) {
        this.quotaType = str;
        this.quotaRemain = num;
    }
}
