package X;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.04r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016504r {
    public InterfaceC23370vt LIZ;
    public boolean LIZIZ;
    public final Outline LIZJ;
    public long LIZLLL;
    public InterfaceC11790dD LJ;
    public C1QX LJFF;
    public InterfaceC11610cv LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public InterfaceC11610cv LJIIIZ;
    public C10410az LJIIJ;
    public float LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public EnumC23500w6 LJIILL;
    public AbstractC11540co LJIILLIIL;

    public final void LJ() {
        if (this.LJII) {
            this.LJIIL = C10370av.LIZIZ;
            long j = this.LIZLLL;
            this.LJIILIIL = j;
            this.LJIIJJI = 0.0f;
            this.LJI = null;
            this.LJII = false;
            this.LJIIIIZZ = false;
            if (this.LJIILJJIL && C10430b1.LIZLLL(j) > 0.0f && C10430b1.LIZIZ(this.LIZLLL) > 0.0f) {
                this.LIZIZ = true;
                AbstractC11540co LIZ = this.LJ.LIZ(this.LIZLLL, this.LJIILL, this.LIZ);
                this.LJIILLIIL = LIZ;
                if (LIZ instanceof C1QT) {
                    C10390ax c10390ax = ((C1QT) LIZ).LIZ;
                    this.LJIIL = C78923UyF.LIZ(c10390ax.LIZ, c10390ax.LIZIZ);
                    this.LJIILIIL = C1DF.LIZIZ(c10390ax.LIZJ - c10390ax.LIZ, c10390ax.LIZLLL - c10390ax.LIZIZ);
                    this.LIZJ.setRect(O6R.LJJIIZ(c10390ax.LIZ), O6R.LJJIIZ(c10390ax.LIZIZ), O6R.LJJIIZ(c10390ax.LIZJ), O6R.LJJIIZ(c10390ax.LIZLLL));
                    return;
                }
                if (LIZ instanceof C1QU) {
                    C10410az c10410az = ((C1QU) LIZ).LIZ;
                    float LIZIZ = C10340as.LIZIZ(c10410az.LJ);
                    this.LJIIL = C78923UyF.LIZ(c10410az.LIZ, c10410az.LIZIZ);
                    this.LJIILIIL = C1DF.LIZIZ(c10410az.LIZJ - c10410az.LIZ, c10410az.LIZLLL - c10410az.LIZIZ);
                    if (C78926UyI.LJJIJIIJI(c10410az)) {
                        this.LIZJ.setRoundRect(O6R.LJJIIZ(c10410az.LIZ), O6R.LJJIIZ(c10410az.LIZIZ), O6R.LJJIIZ(c10410az.LIZJ), O6R.LJJIIZ(c10410az.LIZLLL), LIZIZ);
                        this.LJIIJJI = LIZIZ;
                        return;
                    }
                    C1QX c1qx = this.LJFF;
                    if (c1qx == null) {
                        c1qx = C1JI.LIZ();
                        this.LJFF = c1qx;
                    }
                    c1qx.reset();
                    c1qx.LJ(c10410az);
                    LJFF(c1qx);
                    return;
                }
                if (!(LIZ instanceof C1QS)) {
                    return;
                }
                LIZ.getClass();
                LJFF(null);
                return;
            }
            this.LIZJ.setEmpty();
        }
    }

    public final Outline LIZIZ() {
        LJ();
        if (!this.LJIILJJIL || !this.LIZIZ) {
            return null;
        }
        return this.LIZJ;
    }

    public C016504r(InterfaceC23370vt density) {
        o.LJIIIZ(density, "density");
        this.LIZ = density;
        this.LIZIZ = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.LIZJ = outline;
        long j = C10430b1.LIZIZ;
        this.LIZLLL = j;
        this.LJ = C11710d5.LIZ;
        this.LJIIL = C10370av.LIZIZ;
        this.LJIILIIL = j;
        this.LJIILL = EnumC23500w6.Ltr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (X.C10340as.LIZIZ(r9.LJ) == r7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC11750d9 r18) {
        /*
            r17 = this;
            java.lang.String r0 = "canvas"
            r11 = r18
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            r3 = r17
            r3.LJ()
            X.0cv r0 = r3.LJI
            if (r0 == 0) goto L14
            X.GFJ.LIZ(r11, r0)
        L13:
            return
        L14:
            float r7 = r3.LJIIJJI
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto Laf
            X.0cv r2 = r3.LJIIIZ
            X.0az r9 = r3.LJIIJ
            if (r2 == 0) goto L2d
            long r0 = r3.LJIIL
            long r5 = r3.LJIILIIL
            if (r9 == 0) goto L2d
            boolean r4 = X.C78926UyI.LJJIJIIJI(r9)
            if (r4 != 0) goto L72
        L2d:
            long r0 = r3.LJIIL
            float r6 = X.C10370av.LIZLLL(r0)
            long r0 = r3.LJIIL
            float r7 = X.C10370av.LJ(r0)
            long r0 = r3.LJIIL
            float r4 = X.C10370av.LIZLLL(r0)
            long r0 = r3.LJIILIIL
            float r8 = X.C10430b1.LIZLLL(r0)
            float r8 = r8 + r4
            long r0 = r3.LJIIL
            float r4 = X.C10370av.LJ(r0)
            long r0 = r3.LJIILIIL
            float r9 = X.C10430b1.LIZIZ(r0)
            float r9 = r9 + r4
            float r0 = r3.LJIIJJI
            long r4 = X.C78897Uxp.LJI(r0, r0)
            X.0az r0 = X.C78926UyI.LIZLLL(r4, r6, r7, r8, r9)
            if (r2 != 0) goto L6e
            X.1QX r2 = X.C1JI.LIZ()
        L63:
            r2.LJ(r0)
            r3.LJIIJ = r0
            r3.LJIIIZ = r2
        L6a:
            X.GFJ.LIZ(r11, r2)
            goto L13
        L6e:
            r2.reset()
            goto L63
        L72:
            float r8 = r9.LIZ
            float r4 = X.C10370av.LIZLLL(r0)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L2d
            float r8 = r9.LIZIZ
            float r4 = X.C10370av.LJ(r0)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L2d
            float r10 = r9.LIZJ
            float r8 = X.C10370av.LIZLLL(r0)
            float r4 = X.C10430b1.LIZLLL(r5)
            float r4 = r4 + r8
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 != 0) goto L2d
            float r4 = r9.LIZLLL
            float r1 = X.C10370av.LJ(r0)
            float r0 = X.C10430b1.LIZIZ(r5)
            float r0 = r0 + r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L2d
            long r0 = r9.LJ
            float r0 = X.C10340as.LIZIZ(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L2d
            goto L6a
        Laf:
            long r0 = r3.LJIIL
            float r12 = X.C10370av.LIZLLL(r0)
            long r0 = r3.LJIIL
            float r13 = X.C10370av.LJ(r0)
            long r0 = r3.LJIIL
            float r2 = X.C10370av.LIZLLL(r0)
            long r0 = r3.LJIILIIL
            float r14 = X.C10430b1.LIZLLL(r0)
            float r14 = r14 + r2
            long r0 = r3.LJIIL
            float r2 = X.C10370av.LJ(r0)
            long r0 = r3.LJIILIIL
            float r15 = X.C10430b1.LIZIZ(r0)
            float r15 = r15 + r2
            r16 = 1
            r11.LIZLLL(r12, r13, r14, r15, r16)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016504r.LIZ(X.0d9):void");
    }

    public final boolean LIZJ(long j) {
        AbstractC11540co abstractC11540co;
        if (!this.LJIILJJIL || (abstractC11540co = this.LJIILLIIL) == null) {
            return true;
        }
        float LIZLLL = C10370av.LIZLLL(j);
        float LJ = C10370av.LJ(j);
        if (abstractC11540co instanceof C1QT) {
            C10390ax c10390ax = ((C1QT) abstractC11540co).LIZ;
            if (c10390ax.LIZ <= LIZLLL && LIZLLL < c10390ax.LIZJ && c10390ax.LIZIZ <= LJ && LJ < c10390ax.LIZLLL) {
                return true;
            }
        } else if (abstractC11540co instanceof C1QU) {
            C10410az c10410az = ((C1QU) abstractC11540co).LIZ;
            if (LIZLLL >= c10410az.LIZ && LIZLLL < c10410az.LIZJ && LJ >= c10410az.LIZIZ && LJ < c10410az.LIZLLL) {
                if (C10340as.LIZIZ(c10410az.LJFF) + C10340as.LIZIZ(c10410az.LJ) <= c10410az.LIZJ - c10410az.LIZ) {
                    if (C10340as.LIZIZ(c10410az.LJI) + C10340as.LIZIZ(c10410az.LJII) <= c10410az.LIZJ - c10410az.LIZ) {
                        if (C10340as.LIZJ(c10410az.LJII) + C10340as.LIZJ(c10410az.LJ) <= c10410az.LIZLLL - c10410az.LIZIZ) {
                            if (C10340as.LIZJ(c10410az.LJI) + C10340as.LIZJ(c10410az.LJFF) <= c10410az.LIZLLL - c10410az.LIZIZ) {
                                float LIZIZ = C10340as.LIZIZ(c10410az.LJ) + c10410az.LIZ;
                                float LIZJ = C10340as.LIZJ(c10410az.LJ) + c10410az.LIZIZ;
                                float LIZIZ2 = c10410az.LIZJ - C10340as.LIZIZ(c10410az.LJFF);
                                float LIZJ2 = c10410az.LIZIZ + C10340as.LIZJ(c10410az.LJFF);
                                float LIZIZ3 = c10410az.LIZJ - C10340as.LIZIZ(c10410az.LJI);
                                float LIZJ3 = c10410az.LIZLLL - C10340as.LIZJ(c10410az.LJI);
                                float LIZJ4 = c10410az.LIZLLL - C10340as.LIZJ(c10410az.LJII);
                                float LIZIZ4 = C10340as.LIZIZ(c10410az.LJII) + c10410az.LIZ;
                                if (LIZLLL < LIZIZ && LJ < LIZJ) {
                                    return C1A7.LJJIII(c10410az.LJ, LIZLLL, LJ, LIZIZ, LIZJ);
                                }
                                if (LIZLLL < LIZIZ4 && LJ > LIZJ4) {
                                    return C1A7.LJJIII(c10410az.LJII, LIZLLL, LJ, LIZIZ4, LIZJ4);
                                }
                                if (LIZLLL > LIZIZ2 && LJ < LIZJ2) {
                                    return C1A7.LJJIII(c10410az.LJFF, LIZLLL, LJ, LIZIZ2, LIZJ2);
                                }
                                if (LIZLLL <= LIZIZ3 || LJ <= LIZJ3) {
                                    return true;
                                }
                                return C1A7.LJJIII(c10410az.LJI, LIZLLL, LJ, LIZIZ3, LIZJ3);
                            }
                        }
                    }
                }
                C1QX LIZ = C1JI.LIZ();
                LIZ.LJ(c10410az);
                return C1A7.LJJII(LIZ, LIZLLL, LJ);
            }
        } else {
            if (abstractC11540co instanceof C1QS) {
                return C1A7.LJJII(null, LIZLLL, LJ);
            }
            throw new C162476Zf();
        }
        return false;
    }

    public final void LJFF(InterfaceC11610cv interfaceC11610cv) {
        if (Build.VERSION.SDK_INT > 28 || interfaceC11610cv.LIZJ()) {
            Outline outline = this.LIZJ;
            if (interfaceC11610cv instanceof C1QX) {
                outline.setConvexPath(((C1QX) interfaceC11610cv).LIZIZ);
                this.LJIIIIZZ = !this.LIZJ.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.LIZIZ = false;
            this.LIZJ.setEmpty();
            this.LJIIIIZZ = true;
        }
        this.LJI = interfaceC11610cv;
    }

    public final boolean LIZLLL(InterfaceC11790dD shape, float f, boolean z, float f2, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
        boolean z2;
        o.LJIIIZ(shape, "shape");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(density, "density");
        this.LIZJ.setAlpha(f);
        boolean z3 = !o.LJ(this.LJ, shape);
        if (z3) {
            this.LJ = shape;
            this.LJII = true;
        }
        if (z || f2 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJIILJJIL != z2) {
            this.LJIILJJIL = z2;
            this.LJII = true;
        }
        if (this.LJIILL != layoutDirection) {
            this.LJIILL = layoutDirection;
            this.LJII = true;
        }
        if (!o.LJ(this.LIZ, density)) {
            this.LIZ = density;
            this.LJII = true;
        }
        return z3;
    }
}
