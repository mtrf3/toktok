package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xfs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85428Xfs {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C85433Xfx LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85428Xfs)) {
            return false;
        }
        C85428Xfs c85428Xfs = (C85428Xfs) obj;
        return this.LIZ == c85428Xfs.LIZ && o.LJ(this.LIZIZ, c85428Xfs.LIZIZ) && this.LIZJ == c85428Xfs.LIZJ && o.LJ(this.LIZLLL, c85428Xfs.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        return this.LIZLLL.hashCode() + ((((i + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixPowerData(btnAble=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectedMixId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", item=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C85428Xfs(boolean z, String str, int i, C85433Xfx item) {
        o.LJIIIZ(item, "item");
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = item;
    }
}
