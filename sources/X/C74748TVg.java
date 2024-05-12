package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.TVg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74748TVg {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final TT1 LJ;
    public final TT2 LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;

    public C74748TVg() {
        this(false, null, null, false, false, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74748TVg)) {
            return false;
        }
        C74748TVg c74748TVg = (C74748TVg) obj;
        return this.LIZ == c74748TVg.LIZ && this.LIZIZ == c74748TVg.LIZIZ && this.LIZJ == c74748TVg.LIZJ && this.LIZLLL == c74748TVg.LIZLLL && o.LJ(this.LJ, c74748TVg.LJ) && o.LJ(this.LJFF, c74748TVg.LJFF) && this.LJI == c74748TVg.LJI && this.LJII == c74748TVg.LJII && this.LJIIIIZZ == c74748TVg.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.LIZJ;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r04 = this.LIZLLL;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        TT1 tt1 = this.LJ;
        int hashCode = (i7 + (tt1 == null ? 0 : tt1.hashCode())) * 31;
        TT2 tt2 = this.LJFF;
        int hashCode2 = (hashCode + (tt2 != null ? tt2.hashCode() : 0)) * 31;
        ?? r05 = this.LJI;
        int i8 = r05;
        if (r05 != 0) {
            i8 = 1;
        }
        return ((((hashCode2 + i8) * 31) + (this.LJII ? 1 : 0)) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewDialogUICtrlCmd(showSilentMicBtn=");
        LIZ.append(this.LIZ);
        LIZ.append(", showTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showTitleTip=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showTopDisconnectBtn=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", applyOptPresenter=");
        LIZ.append(this.LJ);
        LIZ.append(", beInvitedOptPresenter=");
        LIZ.append(this.LJFF);
        LIZ.append(", isFromAnchorPermit=");
        LIZ.append(this.LJI);
        LIZ.append(", isFromAnchorInvite=");
        LIZ.append(this.LJII);
        LIZ.append(", countdownSeconds=");
        return b0.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C74748TVg(boolean z, TT1 tt1, TT2 tt2, boolean z2, boolean z3, int i) {
        int i2;
        z = (i & 8) != 0 ? false : z;
        tt1 = (i & 16) != 0 ? null : tt1;
        tt2 = (i & 32) != 0 ? null : tt2;
        z2 = (i & 64) != 0 ? false : z2;
        z3 = (i & 128) != 0 ? false : z3;
        if ((i & 256) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = z;
        this.LJ = tt1;
        this.LJFF = tt2;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = i2;
    }
}
