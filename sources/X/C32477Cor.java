package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cor, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32477Cor {
    public final C32515CpT LIZ;
    public final C32476Coq LIZIZ;

    public C32477Cor() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32477Cor)) {
            return false;
        }
        C32477Cor c32477Cor = (C32477Cor) obj;
        return o.LJ(this.LIZ, c32477Cor.LIZ) && o.LJ(this.LIZIZ, c32477Cor.LIZIZ);
    }

    public final int hashCode() {
        C32515CpT c32515CpT = this.LIZ;
        int hashCode = (c32515CpT == null ? 0 : c32515CpT.hashCode()) * 31;
        C32476Coq c32476Coq = this.LIZIZ;
        return hashCode + (c32476Coq != null ? c32476Coq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveGoalGift(goalGetInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", goalGiftListInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32477Cor(C32515CpT c32515CpT, C32476Coq c32476Coq) {
        this.LIZ = c32515CpT;
        this.LIZIZ = c32476Coq;
    }
}
