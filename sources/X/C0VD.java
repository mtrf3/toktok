package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0VD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VD {
    public final InterfaceC22120ts LIZ;
    public final long LIZIZ;
    public final C13640gC LIZJ;
    public final C13570g5 LIZLLL;
    public final C13590g7 LJ;
    public final AbstractC13490fx LJFF;
    public final String LJI;
    public final long LJII;
    public final C21870tT LJIIIIZZ;
    public final C22140tu LJIIIZ;
    public final C33861Uo LJIIJ;
    public final long LJIIJJI;
    public final C22080to LJIIL;
    public final C11770dB LJIILIIL;
    public final C0VA LJIILJJIL;

    public final long LIZ() {
        return this.LIZ.LIZJ();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZ()));
        sb.append(", brush=");
        sb.append(this.LIZ.LIZLLL());
        sb.append(", alpha=");
        sb.append(this.LIZ.LIZ());
        sb.append(", fontSize=");
        sb.append((Object) C23520w8.LIZLLL(this.LIZIZ));
        sb.append(", fontWeight=");
        sb.append(this.LIZJ);
        sb.append(", fontStyle=");
        sb.append(this.LIZLLL);
        sb.append(", fontSynthesis=");
        sb.append(this.LJ);
        sb.append(", fontFamily=");
        sb.append(this.LJFF);
        sb.append(", fontFeatureSettings=");
        sb.append(this.LJI);
        sb.append(", letterSpacing=");
        sb.append((Object) C23520w8.LIZLLL(this.LJII));
        sb.append(", baselineShift=");
        sb.append(this.LJIIIIZZ);
        sb.append(", textGeometricTransform=");
        sb.append(this.LJIIIZ);
        sb.append(", localeList=");
        sb.append(this.LJIIJ);
        sb.append(", background=");
        C78920UyC.LJ(this.LJIIJJI, sb, ", textDecoration=");
        sb.append(this.LJIIL);
        sb.append(", shadow=");
        sb.append(this.LJIILIIL);
        sb.append(", platformStyle=");
        sb.append(this.LJIILJJIL);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int LIZJ = C61876OQe.LIZJ(LIZ()) * 31;
        AbstractC11740d8 LIZLLL = this.LIZ.LIZLLL();
        int i12 = 0;
        if (LIZLLL != null) {
            i = LIZLLL.hashCode();
        } else {
            i = 0;
        }
        int LIZJ2 = JBR.LIZJ(this.LIZIZ, (Float.floatToIntBits(this.LIZ.LIZ()) + ((LIZJ + i) * 31)) * 31, 31);
        C13640gC c13640gC = this.LIZJ;
        if (c13640gC != null) {
            i2 = c13640gC.LJLIL;
        } else {
            i2 = 0;
        }
        int i13 = (LIZJ2 + i2) * 31;
        C13570g5 c13570g5 = this.LIZLLL;
        if (c13570g5 != null) {
            i3 = c13570g5.LIZ;
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        C13590g7 c13590g7 = this.LJ;
        if (c13590g7 != null) {
            i4 = c13590g7.LIZ;
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        AbstractC13490fx abstractC13490fx = this.LJFF;
        if (abstractC13490fx != null) {
            i5 = abstractC13490fx.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        String str = this.LJI;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int LIZJ3 = JBR.LIZJ(this.LJII, (i16 + i6) * 31, 31);
        C21870tT c21870tT = this.LJIIIIZZ;
        if (c21870tT != null) {
            i7 = Float.floatToIntBits(c21870tT.LIZ);
        } else {
            i7 = 0;
        }
        int i17 = (LIZJ3 + i7) * 31;
        C22140tu c22140tu = this.LJIIIZ;
        if (c22140tu != null) {
            i8 = c22140tu.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        C33861Uo c33861Uo = this.LJIIJ;
        if (c33861Uo != null) {
            i9 = c33861Uo.hashCode();
        } else {
            i9 = 0;
        }
        int LIZ = C06540Nm.LIZ(this.LJIIJJI, (i18 + i9) * 31, 31);
        C22080to c22080to = this.LJIIL;
        if (c22080to != null) {
            i10 = c22080to.LIZ;
        } else {
            i10 = 0;
        }
        int i19 = (LIZ + i10) * 31;
        C11770dB c11770dB = this.LJIILIIL;
        if (c11770dB != null) {
            i11 = c11770dB.hashCode();
        } else {
            i11 = 0;
        }
        int i20 = (i19 + i11) * 31;
        C0VA c0va = this.LJIILJJIL;
        if (c0va != null) {
            i12 = c0va.hashCode();
        }
        return i20 + i12;
    }

    public final boolean LIZIZ(C0VD other) {
        o.LJIIIZ(other, "other");
        if (this == other) {
            return true;
        }
        if (C23520w8.LIZ(this.LIZIZ, other.LIZIZ) && o.LJ(this.LIZJ, other.LIZJ) && o.LJ(this.LIZLLL, other.LIZLLL) && o.LJ(this.LJ, other.LJ) && o.LJ(this.LJFF, other.LJFF) && o.LJ(this.LJI, other.LJI) && C23520w8.LIZ(this.LJII, other.LJII) && o.LJ(this.LJIIIIZZ, other.LJIIIIZZ) && o.LJ(this.LJIIIZ, other.LJIIIZ) && o.LJ(this.LJIIJ, other.LJIIJ) && C11850dJ.LIZJ(this.LJIIJJI, other.LJIIJJI) && o.LJ(this.LJIILJJIL, other.LJIILJJIL)) {
            return true;
        }
        return false;
    }

    public final C0VD LIZJ(C0VD c0vd) {
        long j;
        long j2;
        if (c0vd == null) {
            return this;
        }
        InterfaceC22120ts LIZIZ = this.LIZ.LIZIZ(c0vd.LIZ);
        AbstractC13490fx abstractC13490fx = c0vd.LJFF;
        if (abstractC13490fx == null) {
            abstractC13490fx = this.LJFF;
        }
        if (!C79043V0l.LJIILL(c0vd.LIZIZ)) {
            j = c0vd.LIZIZ;
        } else {
            j = this.LIZIZ;
        }
        C13640gC c13640gC = c0vd.LIZJ;
        if (c13640gC == null) {
            c13640gC = this.LIZJ;
        }
        C13570g5 c13570g5 = c0vd.LIZLLL;
        if (c13570g5 == null) {
            c13570g5 = this.LIZLLL;
        }
        C13590g7 c13590g7 = c0vd.LJ;
        if (c13590g7 == null) {
            c13590g7 = this.LJ;
        }
        String str = c0vd.LJI;
        if (str == null) {
            str = this.LJI;
        }
        if (!C79043V0l.LJIILL(c0vd.LJII)) {
            j2 = c0vd.LJII;
        } else {
            j2 = this.LJII;
        }
        C21870tT c21870tT = c0vd.LJIIIIZZ;
        if (c21870tT == null) {
            c21870tT = this.LJIIIIZZ;
        }
        C22140tu c22140tu = c0vd.LJIIIZ;
        if (c22140tu == null) {
            c22140tu = this.LJIIIZ;
        }
        C33861Uo c33861Uo = c0vd.LJIIJ;
        if (c33861Uo == null) {
            c33861Uo = this.LJIIJ;
        }
        long j3 = c0vd.LJIIJJI;
        if (j3 == C11850dJ.LJI) {
            j3 = this.LJIIJJI;
        }
        C22080to c22080to = c0vd.LJIIL;
        if (c22080to == null) {
            c22080to = this.LJIIL;
        }
        C11770dB c11770dB = c0vd.LJIILIIL;
        if (c11770dB == null) {
            c11770dB = this.LJIILIIL;
        }
        C0VA c0va = c0vd.LJIILJJIL;
        C0VA c0va2 = this.LJIILJJIL;
        if (c0va2 != null) {
            c0va = c0va2;
        }
        return new C0VD(LIZIZ, j, c13640gC, c13570g5, c13590g7, abstractC13490fx, str, j2, c21870tT, c22140tu, c33861Uo, j3, c22080to, c11770dB, c0va);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VD)) {
            return false;
        }
        C0VD c0vd = (C0VD) obj;
        if (LIZIZ(c0vd) && o.LJ(this.LIZ, c0vd.LIZ) && o.LJ(this.LJIIL, c0vd.LJIIL) && o.LJ(this.LJIILIIL, c0vd.LJIILIIL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0VD(long j, long j2, C13640gC c13640gC, C13570g5 c13570g5, C13590g7 c13590g7, AbstractC13490fx abstractC13490fx, String str, long j3, C21870tT c21870tT, C22140tu c22140tu, C33861Uo c33861Uo, long j4, C22080to c22080to, C11770dB c11770dB) {
        this(C22110tr.LIZ(j), j2, c13640gC, c13570g5, c13590g7, abstractC13490fx, str, j3, c21870tT, c22140tu, c33861Uo, j4, c22080to, c11770dB, (C0VA) null);
        InterfaceC22120ts.LIZ.getClass();
    }

    public C0VD(long j, long j2, C13640gC c13640gC, C13570g5 c13570g5, C13590g7 c13590g7, AbstractC13490fx abstractC13490fx, String str, long j3, C21870tT c21870tT, C22140tu c22140tu, C33861Uo c33861Uo, long j4, C22080to c22080to, C11770dB c11770dB, int i) {
        this((i & 1) != 0 ? C11850dJ.LJI : j, (i & 2) != 0 ? C23520w8.LIZJ : j2, (i & 4) != 0 ? null : c13640gC, (i & 8) != 0 ? null : c13570g5, (i & 16) != 0 ? null : c13590g7, (i & 32) != 0 ? null : abstractC13490fx, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C23520w8.LIZJ : j3, (i & 256) != 0 ? null : c21870tT, (i & 512) != 0 ? null : c22140tu, (i & 1024) != 0 ? null : c33861Uo, (i & 2048) != 0 ? C11850dJ.LJI : j4, (i & 4096) != 0 ? null : c22080to, (i & FileUtils.BUFFER_SIZE) != 0 ? null : c11770dB);
    }

    public C0VD(InterfaceC22120ts interfaceC22120ts, long j, C13640gC c13640gC, C13570g5 c13570g5, C13590g7 c13590g7, AbstractC13490fx abstractC13490fx, String str, long j2, C21870tT c21870tT, C22140tu c22140tu, C33861Uo c33861Uo, long j3, C22080to c22080to, C11770dB c11770dB, C0VA c0va) {
        this.LIZ = interfaceC22120ts;
        this.LIZIZ = j;
        this.LIZJ = c13640gC;
        this.LIZLLL = c13570g5;
        this.LJ = c13590g7;
        this.LJFF = abstractC13490fx;
        this.LJI = str;
        this.LJII = j2;
        this.LJIIIIZZ = c21870tT;
        this.LJIIIZ = c22140tu;
        this.LJIIJ = c33861Uo;
        this.LJIIJJI = j3;
        this.LJIIL = c22080to;
        this.LJIILIIL = c11770dB;
        this.LJIILJJIL = c0va;
    }
}
