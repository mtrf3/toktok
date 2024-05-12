package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jng, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50240Jng {
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50240Jng)) {
            return false;
        }
        C50240Jng c50240Jng = (C50240Jng) obj;
        return o.LJ(this.LIZ, c50240Jng.LIZ) && this.LIZIZ == c50240Jng.LIZIZ && o.LJ(this.LIZJ, c50240Jng.LIZJ) && o.LJ(this.LIZLLL, c50240Jng.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchThemeInfo(theme=");
        LIZ.append(this.LIZ);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", maxIndex=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isFromActivityCard=");
        return C78920UyC.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C50240Jng(String str, int i, Integer num, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = bool;
    }
}
