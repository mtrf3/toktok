package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.3wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100113wN {
    public final C2068389v LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100113wN)) {
            return false;
        }
        C100113wN c100113wN = (C100113wN) obj;
        return o.LJ(this.LIZ, c100113wN.LIZ) && this.LIZIZ == c100113wN.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxIconWithDesc(tuxIcon=");
        LIZ.append(this.LIZ);
        LIZ.append(", descStringRes=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C100113wN(C2068389v tuxIcon, int i) {
        o.LJIIIZ(tuxIcon, "tuxIcon");
        this.LIZ = tuxIcon;
        this.LIZIZ = i;
    }
}
