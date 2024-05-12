package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TVh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74749TVh implements TQF {
    public static final /* synthetic */ int LJIIL = 0;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final TQG LJ;
    public final TQH LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;

    public C74749TVh() {
        this(false, false, null, null, false, false, false, false, false, 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74749TVh)) {
            return false;
        }
        C74749TVh c74749TVh = (C74749TVh) obj;
        return this.LIZ == c74749TVh.LIZ && this.LIZIZ == c74749TVh.LIZIZ && this.LIZJ == c74749TVh.LIZJ && this.LIZLLL == c74749TVh.LIZLLL && o.LJ(this.LJ, c74749TVh.LJ) && o.LJ(this.LJFF, c74749TVh.LJFF) && this.LJI == c74749TVh.LJI && this.LJII == c74749TVh.LJII && this.LJIIIIZZ == c74749TVh.LJIIIIZZ && this.LJIIIZ == c74749TVh.LJIIIZ && this.LJIIJ == c74749TVh.LJIIJ && this.LJIIJJI == c74749TVh.LJIIJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
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
        TQG tqg = this.LJ;
        int hashCode = (i7 + (tqg == null ? 0 : tqg.hashCode())) * 31;
        TQH tqh = this.LJFF;
        int hashCode2 = (hashCode + (tqh != null ? tqh.hashCode() : 0)) * 31;
        ?? r05 = this.LJI;
        int i8 = r05;
        if (r05 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode2 + i8) * 31;
        ?? r06 = this.LJII;
        int i10 = r06;
        if (r06 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r07 = this.LJIIIIZZ;
        int i12 = r07;
        if (r07 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r08 = this.LJIIIZ;
        int i14 = r08;
        if (r08 != 0) {
            i14 = 1;
        }
        return ((((i13 + i14) * 31) + (this.LJIIJ ? 1 : 0)) * 31) + this.LJIIJJI;
    }

    public final boolean LIZ() {
        if (this.LJIIJ || this.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LJIIIZ || this.LJII) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LJI && LIZIZ() && this.LJ != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewDialogUICtrlCmd(showSilentMicBtn=");
        sb.append(this.LIZ);
        sb.append(", showTitle=");
        sb.append(this.LIZIZ);
        sb.append(", showTitleTip=");
        sb.append(this.LIZJ);
        sb.append(", showLeftTopDisconnectBtn=");
        sb.append(this.LIZLLL);
        sb.append(", applyOptPresenter=");
        sb.append(this.LJ);
        sb.append(", beInvitedOptPresenter=");
        sb.append(this.LJFF);
        sb.append(", isSupportPauseLive=");
        sb.append(this.LJI);
        sb.append(", isFromAnchorPermit=");
        sb.append(this.LJII);
        sb.append(", isFromAnchorInvite=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isFromModeratorPermit=");
        sb.append(this.LJIIIZ);
        sb.append(", isFromModeratorInvite=");
        sb.append(this.LJIIJ);
        sb.append(", countdownSeconds=");
        return UPJ.LIZLLL(sb, this.LJIIJJI, ')');
    }

    public C74749TVh(boolean z, boolean z2, TQG tqg, TQH tqh, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        tqg = (i2 & 16) != 0 ? null : tqg;
        tqh = (i2 & 32) != 0 ? null : tqh;
        z3 = (i2 & 64) != 0 ? false : z3;
        z4 = (i2 & 128) != 0 ? false : z4;
        z5 = (i2 & 256) != 0 ? false : z5;
        z6 = (i2 & 512) != 0 ? false : z6;
        z7 = (i2 & 1024) != 0 ? false : z7;
        i = (i2 & 2048) != 0 ? -1 : i;
        this.LIZ = z;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = z2;
        this.LJ = tqg;
        this.LJFF = tqh;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = z6;
        this.LJIIJ = z7;
        this.LJIIJJI = i;
    }
}
