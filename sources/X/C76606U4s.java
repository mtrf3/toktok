package X;

import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* renamed from: X.U4s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76606U4s {
    public final int LIZ;
    public final String LIZIZ;
    public final BizChangeLayoutParams LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public C76606U4s() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76606U4s)) {
            return false;
        }
        C76606U4s c76606U4s = (C76606U4s) obj;
        return this.LIZ == c76606U4s.LIZ && o.LJ(this.LIZIZ, c76606U4s.LIZIZ) && o.LJ(this.LIZJ, c76606U4s.LIZJ) && o.LJ(this.LIZLLL, c76606U4s.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BizChangeLayoutParams bizChangeLayoutParams = this.LIZJ;
        int hashCode2 = (hashCode + (bizChangeLayoutParams == null ? 0 : bizChangeLayoutParams.hashCode())) * 31;
        java.util.Map<String, String> map = this.LIZLLL;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeMaxPositionParam(maxPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", layoutId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bizChangeLayoutParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", customData=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76606U4s(int i, String str, BizChangeLayoutParams bizChangeLayoutParams) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = bizChangeLayoutParams;
        this.LIZLLL = null;
    }
}
