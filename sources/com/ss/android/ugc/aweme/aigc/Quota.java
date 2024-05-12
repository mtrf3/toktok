package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Quota extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("quota_remain")
    public final Integer quotaRemain;

    @InterfaceC65349Pkn("job_type")
    public final String quotaType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quota)) {
            return false;
        }
        Quota quota = (Quota) obj;
        return o.LJ(this.quotaType, quota.quotaType) && o.LJ(this.quotaRemain, quota.quotaRemain);
    }

    public final int hashCode() {
        String str = this.quotaType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quotaRemain;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Quota(quotaType=");
        LIZ.append(this.quotaType);
        LIZ.append(", quotaRemain=");
        return s0.LIZJ(LIZ, this.quotaRemain, ')', LIZ);
    }

    public Quota(String str, Integer num) {
        this.quotaType = str;
        this.quotaRemain = num;
    }
}
