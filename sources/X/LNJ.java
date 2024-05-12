package X;

import androidx.fragment.app.Fragment;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LNJ {
    public final int LIZ;
    public final Fragment LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LNJ)) {
            return false;
        }
        LNJ lnj = (LNJ) obj;
        return this.LIZ == lnj.LIZ && o.LJ(this.LIZIZ, lnj.LIZIZ) && this.LIZJ == lnj.LIZJ && this.LIZLLL == lnj.LIZLLL;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Fragment fragment = this.LIZIZ;
        return ((((i + (fragment == null ? 0 : fragment.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopScrollData(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", fragment=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lastPosition=");
        LIZ.append(this.LIZJ);
        LIZ.append(", originEnterMethod=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public LNJ(int i, Fragment fragment, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = fragment;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
