package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Ce6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31810Ce6 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final ViewGroup LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31810Ce6)) {
            return false;
        }
        C31810Ce6 c31810Ce6 = (C31810Ce6) obj;
        return this.LIZ == c31810Ce6.LIZ && this.LIZIZ == c31810Ce6.LIZIZ && this.LIZJ == c31810Ce6.LIZJ && this.LIZLLL == c31810Ce6.LIZLLL && o.LJ(this.LJ, c31810Ce6.LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode() + (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginLayoutParam(height=");
        LIZ.append(this.LIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", id=");
        LIZ.append(this.LIZJ);
        LIZ.append(", visibility=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", parent=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C31810Ce6(int i, int i2, int i3, int i4, ViewGroup viewGroup) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = viewGroup;
    }
}
