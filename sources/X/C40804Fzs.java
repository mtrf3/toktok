package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fzs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40804Fzs {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C40769FzJ LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40804Fzs)) {
            return false;
        }
        C40804Fzs c40804Fzs = (C40804Fzs) obj;
        return this.LIZ == c40804Fzs.LIZ && this.LIZIZ == c40804Fzs.LIZIZ && this.LIZJ == c40804Fzs.LIZJ && this.LIZLLL == c40804Fzs.LIZLLL && o.LJ(this.LJ, c40804Fzs.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.LIZIZ) * 31;
        ?? r02 = this.LIZJ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        C40769FzJ c40769FzJ = this.LJ;
        return i3 + (c40769FzJ == null ? 0 : c40769FzJ.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SceneIntentParam(requireLogin=");
        LIZ.append(this.LIZ);
        LIZ.append(", nujOptimizeOption=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isSavedInstanceState=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isLaunchedFromMain=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", deeplinkData=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C40804Fzs(boolean z, int i, boolean z2, boolean z3, C40769FzJ c40769FzJ) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = c40769FzJ;
    }
}
