package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lxo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55964Lxo {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C55964Lxo() {
        this((Integer) null, (String) (0 == true ? 1 : 0), false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55964Lxo)) {
            return false;
        }
        C55964Lxo c55964Lxo = (C55964Lxo) obj;
        return o.LJ(this.LIZ, c55964Lxo.LIZ) && o.LJ(this.LIZIZ, c55964Lxo.LIZIZ) && o.LJ(this.LIZJ, c55964Lxo.LIZJ) && this.LIZLLL == c55964Lxo.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HamburgerCard(cardType=");
        LIZ.append(this.LIZ);
        LIZ.append(", buttonName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", notify=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableSendButtonShow=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public static C55964Lxo LIZ(C55964Lxo c55964Lxo, Boolean bool) {
        return new C55964Lxo(c55964Lxo.LIZ, c55964Lxo.LIZIZ, bool, c55964Lxo.LIZLLL);
    }

    public /* synthetic */ C55964Lxo(Integer num, String str, boolean z, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (Boolean) null, (i & 8) != 0 ? false : z);
    }

    public C55964Lxo(Integer num, String str, Boolean bool, boolean z) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = bool;
        this.LIZLLL = z;
    }
}
