package com.ss.android.ugc.aweme.services.publish;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MobParam {
    public final String creationId;
    public final String enterFrom;
    public final String shootWay;

    public static /* synthetic */ MobParam copy$default(MobParam mobParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobParam.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = mobParam.shootWay;
        }
        if ((i & 4) != 0) {
            str3 = mobParam.creationId;
        }
        return mobParam.copy(str, str2, str3);
    }

    public final MobParam copy(String str, String str2, String str3) {
        return new MobParam(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobParam)) {
            return false;
        }
        MobParam mobParam = (MobParam) obj;
        return o.LJ(this.enterFrom, mobParam.enterFrom) && o.LJ(this.shootWay, mobParam.shootWay) && o.LJ(this.creationId, mobParam.creationId);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shootWay;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobParam(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", creationId=");
        return q.LIZIZ(LIZ, this.creationId, ')', LIZ);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public MobParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
    }
}
