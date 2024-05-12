package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.JsQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50534JsQ {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50534JsQ)) {
            return false;
        }
        C50534JsQ c50534JsQ = (C50534JsQ) obj;
        return o.LJ(this.LIZ, c50534JsQ.LIZ) && o.LJ(this.LIZIZ, c50534JsQ.LIZIZ) && o.LJ(this.LIZJ, c50534JsQ.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Integer num = this.LIZJ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedVideoSugChecker(awemeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isNonPersonalizedSearch=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C50534JsQ(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
