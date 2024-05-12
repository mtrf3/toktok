package com.ss.android.ugc.aweme.service;

import X.C79062V1e;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowEnterPublishParams implements Serializable {
    public final String enterFrom;
    public final String enterMethod;
    public final String enterPosition;
    public final String shootWay;

    public static /* synthetic */ NowEnterPublishParams copy$default(NowEnterPublishParams nowEnterPublishParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nowEnterPublishParams.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = nowEnterPublishParams.enterMethod;
        }
        if ((i & 4) != 0) {
            str3 = nowEnterPublishParams.enterPosition;
        }
        if ((i & 8) != 0) {
            str4 = nowEnterPublishParams.shootWay;
        }
        return nowEnterPublishParams.copy(str, str2, str3, str4);
    }

    public final NowEnterPublishParams copy(String enterFrom, String enterMethod, String str, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new NowEnterPublishParams(enterFrom, enterMethod, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowEnterPublishParams)) {
            return false;
        }
        NowEnterPublishParams nowEnterPublishParams = (NowEnterPublishParams) obj;
        return o.LJ(this.enterFrom, nowEnterPublishParams.enterFrom) && o.LJ(this.enterMethod, nowEnterPublishParams.enterMethod) && o.LJ(this.enterPosition, nowEnterPublishParams.enterPosition) && o.LJ(this.shootWay, nowEnterPublishParams.shootWay);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.enterMethod, this.enterFrom.hashCode() * 31, 31);
        String str = this.enterPosition;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.shootWay;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowEnterPublishParams(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", enterPosition=");
        LIZ.append(this.enterPosition);
        LIZ.append(", shootWay=");
        return q.LIZIZ(LIZ, this.shootWay, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public NowEnterPublishParams(String enterFrom, String enterMethod, String str, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.enterFrom = enterFrom;
        this.enterMethod = enterMethod;
        this.enterPosition = str;
        this.shootWay = str2;
    }
}
