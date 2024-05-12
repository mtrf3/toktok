package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18590oB {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C08440Uu LIZ;
    public final C08370Un LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final InterfaceC23370vt LJFF;
    public final InterfaceC13480fw LJI;
    public final List<C08410Ur<C0V4>> LJII;
    public C1NB LJIIIIZZ;
    public EnumC23500w6 LJIIIZ;

    public final void LIZIZ(EnumC23500w6 layoutDirection) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        C1NB c1nb = this.LJIIIIZZ;
        if (c1nb == null || layoutDirection != this.LJIIIZ || c1nb.LIZIZ()) {
            this.LJIIIZ = layoutDirection;
            c1nb = new C1NB(this.LIZ, C08430Ut.LIZ(this.LIZIZ, layoutDirection), this.LJII, this.LJFF, this.LJI);
        }
        this.LJIIIIZZ = c1nb;
    }

    public final C0VG LIZ(long j, EnumC23500w6 layoutDirection, C0VG c0vg) {
        int LJII;
        int i;
        boolean z;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (c0vg != null) {
            C08440Uu text = this.LIZ;
            C08370Un style = this.LIZIZ;
            List<C08410Ur<C0V4>> placeholders = this.LJII;
            int i2 = this.LIZJ;
            boolean z2 = this.LIZLLL;
            int i3 = this.LJ;
            InterfaceC23370vt density = this.LJFF;
            InterfaceC13480fw fontFamilyResolver = this.LJI;
            o.LJIIIZ(text, "text");
            o.LJIIIZ(style, "style");
            o.LJIIIZ(placeholders, "placeholders");
            o.LJIIIZ(density, "density");
            o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
            C0VF c0vf = c0vg.LIZ;
            if (!c0vg.LIZIZ.LIZ.LIZIZ() && o.LJ(c0vf.LIZ, text)) {
                C08370Un c08370Un = c0vf.LIZIZ;
                c08370Un.getClass();
                if ((c08370Un == style || (o.LJ(c08370Un.LIZIZ, style.LIZIZ) && c08370Un.LIZ.LIZIZ(style.LIZ))) && o.LJ(c0vf.LIZJ, placeholders) && c0vf.LIZLLL == i2 && c0vf.LJ == z2 && c0vf.LJFF == i3 && o.LJ(c0vf.LJI, density) && c0vf.LJII == layoutDirection && o.LJ(c0vf.LJIIIIZZ, fontFamilyResolver) && C23360vs.LJIIIZ(j) == C23360vs.LJIIIZ(c0vf.LJIIIZ) && ((!z2 && i3 != 2) || (C23360vs.LJII(j) == C23360vs.LJII(c0vf.LJIIIZ) && C23360vs.LJI(j) == C23360vs.LJI(c0vf.LJIIIZ)))) {
                    C0VF c0vf2 = c0vg.LIZ;
                    return new C0VG(new C0VF(c0vf2.LIZ, this.LIZIZ, c0vf2.LIZJ, c0vf2.LIZLLL, c0vf2.LJ, c0vf2.LJFF, c0vf2.LJI, c0vf2.LJII, c0vf2.LJIIIIZZ, j), c0vg.LIZIZ, C78555UsJ.LJIIIIZZ(j, C78996UzQ.LIZIZ(C77119UOl.LIZIZ(c0vg.LIZIZ.LIZLLL), C77119UOl.LIZIZ(c0vg.LIZIZ.LJ))));
                }
            }
        }
        LIZIZ(layoutDirection);
        int LJIIIZ = C23360vs.LJIIIZ(j);
        if ((this.LIZLLL || this.LJ == 2) && C23360vs.LIZLLL(j)) {
            LJII = C23360vs.LJII(j);
        } else {
            LJII = Integer.MAX_VALUE;
        }
        if (!this.LIZLLL && this.LJ == 2) {
            i = 1;
        } else {
            i = this.LIZJ;
        }
        if (LJIIIZ != LJII) {
            C1NB c1nb = this.LJIIIIZZ;
            if (c1nb != null) {
                LJII = C78842Uww.LJIIL(C77119UOl.LIZIZ(c1nb.LIZ()), LJIIIZ, LJII);
            } else {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
        }
        C1NB c1nb2 = this.LJIIIIZZ;
        if (c1nb2 != null) {
            long LJ = C78555UsJ.LJ(LJII, C23360vs.LJI(j), 5);
            if (this.LJ == 2) {
                z = true;
            } else {
                z = false;
            }
            C08490Uz c08490Uz = new C08490Uz(c1nb2, LJ, i, z);
            return new C0VG(new C0VF(this.LIZ, this.LIZIZ, this.LJII, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, layoutDirection, this.LJI, j), c08490Uz, C78555UsJ.LJIIIIZZ(j, C78996UzQ.LIZIZ(C77119UOl.LIZIZ(c08490Uz.LIZLLL), C77119UOl.LIZIZ(c08490Uz.LJ))));
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public C18590oB(C08440Uu c08440Uu, C08370Un c08370Un, int i, boolean z, int i2, InterfaceC23370vt interfaceC23370vt, InterfaceC13480fw interfaceC13480fw, List list) {
        this.LIZ = c08440Uu;
        this.LIZIZ = c08370Un;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = i2;
        this.LJFF = interfaceC23370vt;
        this.LJI = interfaceC13480fw;
        this.LJII = list;
        if (i > 0) {
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18590oB(X.C08440Uu r2, X.C08370Un r3, int r4, boolean r5, int r6, X.InterfaceC23370vt r7, X.InterfaceC13480fw r8, int r9) {
        /*
            r1 = this;
            r0 = r9 & 4
            if (r0 == 0) goto L7
            r4 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r0 = r9 & 8
            if (r0 == 0) goto Lc
            r5 = 1
        Lc:
            r0 = r9 & 16
            if (r0 == 0) goto L11
            r6 = 1
        L11:
            r0 = r9 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1b
            X.OQg r9 = X.C61878OQg.INSTANCE
        L17:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L1b:
            r9 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18590oB.<init>(X.0Uu, X.0Un, int, boolean, int, X.0vt, X.0fw, int):void");
    }
}
