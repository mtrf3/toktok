package X;

/* renamed from: X.VRm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79746VRm {
    public final C79753VRt LIZ;
    public final EnumC79692VPk LIZIZ;
    public final EnumC79692VPk LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final int hashCode() {
        return ((((C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31, 31), 31) + this.LJFF) * 31) + (this.LJI ? 1 : 0)) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) this.LIZ.LIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZLLL);
        LIZ.append(" ");
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79746VRm)) {
            return false;
        }
        C79746VRm c79746VRm = (C79746VRm) obj;
        if (!this.LIZ.equals(c79746VRm.LIZ) || this.LIZIZ != c79746VRm.LIZIZ || this.LIZJ != c79746VRm.LIZJ || this.LIZLLL != c79746VRm.LIZLLL || this.LJ != c79746VRm.LJ || this.LJFF != c79746VRm.LJFF || this.LJI != c79746VRm.LJI || this.LJII != c79746VRm.LJII) {
            return false;
        }
        return true;
    }

    public C79746VRm(CharSequence charSequence, C79743VRj c79743VRj, EnumC79692VPk enumC79692VPk, EnumC79692VPk enumC79692VPk2, float f, float f2, int i, boolean z, boolean z2) {
        this.LIZ = new C79753VRt(charSequence, c79743VRj);
        this.LIZLLL = f;
        this.LJ = f2;
        this.LIZIZ = enumC79692VPk;
        this.LIZJ = enumC79692VPk2;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
    }
}
