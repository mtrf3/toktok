package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.AkQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27106AkQ {
    public final String LIZ;
    public final Boolean LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    public C27106AkQ() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27106AkQ)) {
            return false;
        }
        C27106AkQ c27106AkQ = (C27106AkQ) obj;
        return o.LJ(this.LIZ, c27106AkQ.LIZ) && o.LJ(this.LIZIZ, c27106AkQ.LIZIZ) && o.LJ(this.LIZJ, c27106AkQ.LIZJ) && o.LJ(this.LIZLLL, c27106AkQ.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RechargeCenterEnterParams(phoneNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAutoFill=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", purchasePath=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isMobileNumberComplete=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C27106AkQ(String str, Integer num, String str2, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = bool;
        this.LIZJ = str2;
        this.LIZLLL = num;
    }
}
