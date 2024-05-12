package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0Un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08370Un {
    public static final C08370Un LIZLLL = new C08370Un(0, 0, null, null, null, 0, null, null, 0, 262143);
    public final C0VD LIZ;
    public final C0V2 LIZIZ;
    public final C0VB LIZJ;

    public final long LIZIZ() {
        return this.LIZ.LIZ();
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        C0VB c0vb = this.LIZJ;
        if (c0vb != null) {
            i = c0vb.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZIZ()));
        sb.append(", brush=");
        sb.append(this.LIZ.LIZ.LIZLLL());
        sb.append(", alpha=");
        sb.append(this.LIZ.LIZ.LIZ());
        sb.append(", fontSize=");
        sb.append((Object) C23520w8.LIZLLL(this.LIZ.LIZIZ));
        sb.append(", fontWeight=");
        sb.append(this.LIZ.LIZJ);
        sb.append(", fontStyle=");
        sb.append(this.LIZ.LIZLLL);
        sb.append(", fontSynthesis=");
        sb.append(this.LIZ.LJ);
        sb.append(", fontFamily=");
        sb.append(this.LIZ.LJFF);
        sb.append(", fontFeatureSettings=");
        sb.append(this.LIZ.LJI);
        sb.append(", letterSpacing=");
        sb.append((Object) C23520w8.LIZLLL(this.LIZ.LJII));
        sb.append(", baselineShift=");
        sb.append(this.LIZ.LJIIIIZZ);
        sb.append(", textGeometricTransform=");
        sb.append(this.LIZ.LJIIIZ);
        sb.append(", localeList=");
        sb.append(this.LIZ.LJIIJ);
        sb.append(", background=");
        C78920UyC.LJ(this.LIZ.LJIIJJI, sb, ", textDecoration=");
        sb.append(this.LIZ.LJIIL);
        sb.append(", shadow=");
        sb.append(this.LIZ.LJIILIIL);
        sb.append(", textAlign=");
        sb.append(this.LIZIZ.LIZ);
        sb.append(", textDirection=");
        sb.append(this.LIZIZ.LIZIZ);
        sb.append(", lineHeight=");
        sb.append((Object) C23520w8.LIZLLL(this.LIZIZ.LIZJ));
        sb.append(", textIndent=");
        sb.append(this.LIZIZ.LIZLLL);
        sb.append(", platformStyle=");
        sb.append(this.LIZJ);
        sb.append(", lineHeightStyle=");
        sb.append(this.LIZIZ.LJFF);
        sb.append(", lineBreak=");
        sb.append(this.LIZIZ.LJI);
        sb.append(", hyphens=");
        sb.append(this.LIZIZ.LJII);
        sb.append(')');
        return sb.toString();
    }

    public final C08370Un LIZJ(C08370Un c08370Un) {
        if (c08370Un == null || o.LJ(c08370Un, LIZLLL)) {
            return this;
        }
        return new C08370Un(this.LIZ.LIZJ(c08370Un.LIZ), this.LIZIZ.LIZ(c08370Un.LIZIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08370Un)) {
            return false;
        }
        C08370Un c08370Un = (C08370Un) obj;
        if (o.LJ(this.LIZ, c08370Un.LIZ) && o.LJ(this.LIZIZ, c08370Un.LIZIZ) && o.LJ(this.LIZJ, c08370Un.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C08370Un(X.C0VD r4, X.C0V2 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "spanStyle"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.0VA r2 = r4.LJIILJJIL
            X.0V8 r1 = r5.LJ
            if (r2 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
        Le:
            r3.<init>(r4, r5, r0)
            return
        L12:
            X.0VB r0 = new X.0VB
            r0.<init>(r2, r1)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08370Un.<init>(X.0VD, X.0V2):void");
    }

    public C08370Un(C0VD spanStyle, C0V2 c0v2, C0VB c0vb) {
        o.LJIIIZ(spanStyle, "spanStyle");
        this.LIZ = spanStyle;
        this.LIZIZ = c0v2;
        this.LIZJ = c0vb;
    }

    public static C08370Un LIZ(C08370Un c08370Un, long j, long j2, C13640gC c13640gC, AbstractC13490fx abstractC13490fx, int i) {
        C13570g5 c13570g5;
        C13590g7 c13590g7;
        String str;
        long j3;
        C21870tT c21870tT;
        C22140tu c22140tu;
        C33861Uo c33861Uo;
        long j4;
        C22080to c22080to;
        C11770dB c11770dB;
        C22060tm c22060tm;
        C22100tq c22100tq;
        long j5;
        C22160tw c22160tw;
        InterfaceC22120ts LIZ;
        AbstractC13490fx abstractC13490fx2 = abstractC13490fx;
        C13640gC c13640gC2 = c13640gC;
        long j6 = j;
        long j7 = j2;
        if ((i & 1) != 0) {
            j6 = c08370Un.LIZ.LIZ();
        }
        if ((i & 2) != 0) {
            j7 = c08370Un.LIZ.LIZIZ;
        }
        if ((i & 4) != 0) {
            c13640gC2 = c08370Un.LIZ.LIZJ;
        }
        if ((i & 8) != 0) {
            c13570g5 = c08370Un.LIZ.LIZLLL;
        } else {
            c13570g5 = null;
        }
        if ((i & 16) != 0) {
            c13590g7 = c08370Un.LIZ.LJ;
        } else {
            c13590g7 = null;
        }
        if ((i & 32) != 0) {
            abstractC13490fx2 = c08370Un.LIZ.LJFF;
        }
        if ((i & 64) != 0) {
            str = c08370Un.LIZ.LJI;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            j3 = c08370Un.LIZ.LJII;
        } else {
            j3 = 0;
        }
        if ((i & 256) != 0) {
            c21870tT = c08370Un.LIZ.LJIIIIZZ;
        } else {
            c21870tT = null;
        }
        if ((i & 512) != 0) {
            c22140tu = c08370Un.LIZ.LJIIIZ;
        } else {
            c22140tu = null;
        }
        if ((i & 1024) != 0) {
            c33861Uo = c08370Un.LIZ.LJIIJ;
        } else {
            c33861Uo = null;
        }
        if ((i & 2048) != 0) {
            j4 = c08370Un.LIZ.LJIIJJI;
        } else {
            j4 = 0;
        }
        if ((i & 4096) != 0) {
            c22080to = c08370Un.LIZ.LJIIL;
        } else {
            c22080to = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c11770dB = c08370Un.LIZ.LJIILIIL;
        } else {
            c11770dB = null;
        }
        if ((i & 16384) != 0) {
            c22060tm = c08370Un.LIZIZ.LIZ;
        } else {
            c22060tm = null;
        }
        if ((32768 & i) != 0) {
            c22100tq = c08370Un.LIZIZ.LIZIZ;
        } else {
            c22100tq = null;
        }
        if ((65536 & i) != 0) {
            j5 = c08370Un.LIZIZ.LIZJ;
        } else {
            j5 = 0;
        }
        if ((i & 131072) != 0) {
            c22160tw = c08370Un.LIZIZ.LIZLLL;
        } else {
            c22160tw = null;
        }
        c08370Un.getClass();
        if (C11850dJ.LIZJ(j6, c08370Un.LIZ.LIZ())) {
            LIZ = c08370Un.LIZ.LIZ;
        } else {
            InterfaceC22120ts.LIZ.getClass();
            LIZ = C22110tr.LIZ(j6);
        }
        C0VA c0va = c08370Un.LIZ.LJIILJJIL;
        C0VD c0vd = new C0VD(LIZ, j7, c13640gC2, c13570g5, c13590g7, abstractC13490fx2, str, j3, c21870tT, c22140tu, c33861Uo, j4, c22080to, c11770dB, c0va);
        C0V2 c0v2 = c08370Un.LIZIZ;
        return new C08370Un(c0vd, new C0V2(c22060tm, c22100tq, j5, c22160tw, c0v2.LJ, c0v2.LJFF, c0v2.LJI, c0v2.LJII), c08370Un.LIZJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C08370Un(long r30, long r32, X.C13640gC r34, X.C13570g5 r35, X.AbstractC13490fx r36, long r37, X.C22080to r39, X.C22060tm r40, long r41, int r43) {
        /*
            r29 = this;
            r22 = r41
            r20 = r40
            r5 = r34
            r3 = r32
            r6 = r35
            r8 = r36
            r1 = r43
            r10 = r37
            r17 = r39
            r0 = r1 & 1
            if (r0 == 0) goto L18
            long r30 = X.C11850dJ.LJI
        L18:
            r0 = r1 & 2
            if (r0 == 0) goto L1e
            long r3 = X.C23520w8.LIZJ
        L1e:
            r0 = r1 & 4
            r7 = 0
            if (r0 == 0) goto L24
            r5 = r7
        L24:
            r0 = r1 & 8
            if (r0 == 0) goto L29
            r6 = r7
        L29:
            r0 = r1 & 32
            if (r0 == 0) goto L2e
            r8 = r7
        L2e:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L34
            long r10 = X.C23520w8.LIZJ
        L34:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L7d
            long r15 = X.C11850dJ.LJI
        L3a:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L40
            r17 = r7
        L40:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L46
            r20 = r7
        L46:
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L4d
            long r22 = X.C23520w8.LIZJ
        L4d:
            X.0VD r1 = new X.0VD
            X.0tr r0 = X.InterfaceC22120ts.LIZ
            r0.getClass()
            X.0ts r2 = X.C22110tr.LIZ(r30)
            r1 = r1
            r9 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r18 = r7
            r19 = r7
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19)
            X.0V2 r0 = new X.0V2
            r19 = r0
            r21 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r19.<init>(r20, r21, r22, r24, r25, r26, r27, r28)
            r2 = r29
            r2.<init>(r1, r0, r7)
            return
        L7d:
            r15 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08370Un.<init>(long, long, X.0gC, X.0g5, X.0fx, long, X.0to, X.0tm, long, int):void");
    }
}
