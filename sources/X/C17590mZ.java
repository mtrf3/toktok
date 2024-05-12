package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17590mZ {
    public final List<AbstractC17560mW> LIZ = new ArrayList();
    public final C17580mY LIZIZ = new C17580mY(0);
    public final C17580mY LIZJ = new C17580mY(0);
    public final C17580mY LIZLLL = new C17580mY(0);
    public final C17580mY LJ = new C17580mY(0);

    public final void LIZJ(InterfaceC11610cv target) {
        o.LJIIIZ(target, "target");
        target.reset();
        this.LIZIZ.LIZ();
        this.LIZJ.LIZ();
        this.LIZLLL.LIZ();
        this.LJ.LIZ();
        ArrayList arrayList = (ArrayList) this.LIZ;
        int size = arrayList.size();
        AbstractC17560mW abstractC17560mW = null;
        int i = 0;
        while (i < size) {
            AbstractC17560mW abstractC17560mW2 = (AbstractC17560mW) ListProtector.get(arrayList, i);
            if (abstractC17560mW == null) {
                abstractC17560mW = abstractC17560mW2;
            }
            if (abstractC17560mW2 instanceof C1WP) {
                C17580mY c17580mY = this.LIZIZ;
                C17580mY c17580mY2 = this.LIZLLL;
                c17580mY.LIZ = c17580mY2.LIZ;
                c17580mY.LIZIZ = c17580mY2.LIZIZ;
                C17580mY c17580mY3 = this.LIZJ;
                c17580mY3.LIZ = c17580mY2.LIZ;
                c17580mY3.LIZIZ = c17580mY2.LIZIZ;
                target.close();
                C17580mY c17580mY4 = this.LIZIZ;
                target.LIZIZ(c17580mY4.LIZ, c17580mY4.LIZIZ);
            } else if (abstractC17560mW2 instanceof C34251Wb) {
                C34251Wb c34251Wb = (C34251Wb) abstractC17560mW2;
                C17580mY c17580mY5 = this.LIZIZ;
                float f = c17580mY5.LIZ;
                float f2 = c34251Wb.LIZJ;
                c17580mY5.LIZ = f + f2;
                float f3 = c17580mY5.LIZIZ;
                float f4 = c34251Wb.LIZLLL;
                c17580mY5.LIZIZ = f3 + f4;
                target.LJII(f2, f4);
                C17580mY c17580mY6 = this.LIZLLL;
                C17580mY c17580mY7 = this.LIZIZ;
                c17580mY6.LIZ = c17580mY7.LIZ;
                c17580mY6.LIZIZ = c17580mY7.LIZIZ;
            } else if (abstractC17560mW2 instanceof C1WT) {
                C1WT c1wt = (C1WT) abstractC17560mW2;
                C17580mY c17580mY8 = this.LIZIZ;
                float f5 = c1wt.LIZJ;
                c17580mY8.LIZ = f5;
                float f6 = c1wt.LIZLLL;
                c17580mY8.LIZIZ = f6;
                target.LIZIZ(f5, f6);
                C17580mY c17580mY9 = this.LIZLLL;
                C17580mY c17580mY10 = this.LIZIZ;
                c17580mY9.LIZ = c17580mY10.LIZ;
                c17580mY9.LIZIZ = c17580mY10.LIZIZ;
            } else if (abstractC17560mW2 instanceof C34241Wa) {
                C34241Wa c34241Wa = (C34241Wa) abstractC17560mW2;
                target.LJI(c34241Wa.LIZJ, c34241Wa.LIZLLL);
                C17580mY c17580mY11 = this.LIZIZ;
                c17580mY11.LIZ += c34241Wa.LIZJ;
                c17580mY11.LIZIZ += c34241Wa.LIZLLL;
            } else if (abstractC17560mW2 instanceof C1WS) {
                C1WS c1ws = (C1WS) abstractC17560mW2;
                target.LJIIJ(c1ws.LIZJ, c1ws.LIZLLL);
                C17580mY c17580mY12 = this.LIZIZ;
                c17580mY12.LIZ = c1ws.LIZJ;
                c17580mY12.LIZIZ = c1ws.LIZLLL;
            } else if (abstractC17560mW2 instanceof C1WZ) {
                C1WZ c1wz = (C1WZ) abstractC17560mW2;
                target.LJI(c1wz.LIZJ, 0.0f);
                this.LIZIZ.LIZ += c1wz.LIZJ;
            } else if (abstractC17560mW2 instanceof C1WR) {
                C1WR c1wr = (C1WR) abstractC17560mW2;
                target.LJIIJ(c1wr.LIZJ, this.LIZIZ.LIZIZ);
                this.LIZIZ.LIZ = c1wr.LIZJ;
            } else if (abstractC17560mW2 instanceof C34291Wf) {
                C34291Wf c34291Wf = (C34291Wf) abstractC17560mW2;
                target.LJI(0.0f, c34291Wf.LIZJ);
                this.LIZIZ.LIZIZ += c34291Wf.LIZJ;
            } else if (abstractC17560mW2 instanceof C34301Wg) {
                C34301Wg c34301Wg = (C34301Wg) abstractC17560mW2;
                target.LJIIJ(this.LIZIZ.LIZ, c34301Wg.LIZJ);
                this.LIZIZ.LIZIZ = c34301Wg.LIZJ;
            } else if (abstractC17560mW2 instanceof C1WY) {
                C1WY c1wy = (C1WY) abstractC17560mW2;
                target.LJIIIIZZ(c1wy.LIZJ, c1wy.LIZLLL, c1wy.LJ, c1wy.LJFF, c1wy.LJI, c1wy.LJII);
                C17580mY c17580mY13 = this.LIZJ;
                C17580mY c17580mY14 = this.LIZIZ;
                c17580mY13.LIZ = c17580mY14.LIZ + c1wy.LJ;
                c17580mY13.LIZIZ = c17580mY14.LIZIZ + c1wy.LJFF;
                c17580mY14.LIZ += c1wy.LJI;
                c17580mY14.LIZIZ += c1wy.LJII;
            } else if (abstractC17560mW2 instanceof C1WQ) {
                C1WQ c1wq = (C1WQ) abstractC17560mW2;
                target.LJFF(c1wq.LIZJ, c1wq.LIZLLL, c1wq.LJ, c1wq.LJFF, c1wq.LJI, c1wq.LJII);
                C17580mY c17580mY15 = this.LIZJ;
                c17580mY15.LIZ = c1wq.LJ;
                c17580mY15.LIZIZ = c1wq.LJFF;
                C17580mY c17580mY16 = this.LIZIZ;
                c17580mY16.LIZ = c1wq.LJI;
                c17580mY16.LIZIZ = c1wq.LJII;
            } else if (abstractC17560mW2 instanceof C34271Wd) {
                C34271Wd c34271Wd = (C34271Wd) abstractC17560mW2;
                o.LJI(abstractC17560mW);
                if (abstractC17560mW.LIZ) {
                    C17580mY c17580mY17 = this.LJ;
                    C17580mY c17580mY18 = this.LIZIZ;
                    float f7 = c17580mY18.LIZ;
                    C17580mY c17580mY19 = this.LIZJ;
                    c17580mY17.LIZ = f7 - c17580mY19.LIZ;
                    c17580mY17.LIZIZ = c17580mY18.LIZIZ - c17580mY19.LIZIZ;
                } else {
                    this.LJ.LIZ();
                }
                C17580mY c17580mY20 = this.LJ;
                target.LJIIIIZZ(c17580mY20.LIZ, c17580mY20.LIZIZ, c34271Wd.LIZJ, c34271Wd.LIZLLL, c34271Wd.LJ, c34271Wd.LJFF);
                C17580mY c17580mY21 = this.LIZJ;
                C17580mY c17580mY22 = this.LIZIZ;
                c17580mY21.LIZ = c17580mY22.LIZ + c34271Wd.LIZJ;
                c17580mY21.LIZIZ = c17580mY22.LIZIZ + c34271Wd.LIZLLL;
                c17580mY22.LIZ += c34271Wd.LJ;
                c17580mY22.LIZIZ += c34271Wd.LJFF;
            } else if (abstractC17560mW2 instanceof C1WV) {
                C1WV c1wv = (C1WV) abstractC17560mW2;
                o.LJI(abstractC17560mW);
                if (abstractC17560mW.LIZ) {
                    C17580mY c17580mY23 = this.LJ;
                    float f8 = 2;
                    C17580mY c17580mY24 = this.LIZIZ;
                    float f9 = c17580mY24.LIZ * f8;
                    C17580mY c17580mY25 = this.LIZJ;
                    c17580mY23.LIZ = f9 - c17580mY25.LIZ;
                    c17580mY23.LIZIZ = (f8 * c17580mY24.LIZIZ) - c17580mY25.LIZIZ;
                } else {
                    C17580mY c17580mY26 = this.LJ;
                    C17580mY c17580mY27 = this.LIZIZ;
                    c17580mY26.LIZ = c17580mY27.LIZ;
                    c17580mY26.LIZIZ = c17580mY27.LIZIZ;
                }
                C17580mY c17580mY28 = this.LJ;
                target.LJFF(c17580mY28.LIZ, c17580mY28.LIZIZ, c1wv.LIZJ, c1wv.LIZLLL, c1wv.LJ, c1wv.LJFF);
                C17580mY c17580mY29 = this.LIZJ;
                c17580mY29.LIZ = c1wv.LIZJ;
                c17580mY29.LIZIZ = c1wv.LIZLLL;
                C17580mY c17580mY30 = this.LIZIZ;
                c17580mY30.LIZ = c1wv.LJ;
                c17580mY30.LIZIZ = c1wv.LJFF;
            } else if (abstractC17560mW2 instanceof C34261Wc) {
                C34261Wc c34261Wc = (C34261Wc) abstractC17560mW2;
                target.LIZ(c34261Wc.LIZJ, c34261Wc.LIZLLL, c34261Wc.LJ, c34261Wc.LJFF);
                C17580mY c17580mY31 = this.LIZJ;
                C17580mY c17580mY32 = this.LIZIZ;
                c17580mY31.LIZ = c17580mY32.LIZ + c34261Wc.LIZJ;
                c17580mY31.LIZIZ = c17580mY32.LIZIZ + c34261Wc.LIZLLL;
                c17580mY32.LIZ += c34261Wc.LJ;
                c17580mY32.LIZIZ += c34261Wc.LJFF;
            } else if (abstractC17560mW2 instanceof C1WU) {
                C1WU c1wu = (C1WU) abstractC17560mW2;
                target.LIZLLL(c1wu.LIZJ, c1wu.LIZLLL, c1wu.LJ, c1wu.LJFF);
                C17580mY c17580mY33 = this.LIZJ;
                c17580mY33.LIZ = c1wu.LIZJ;
                c17580mY33.LIZIZ = c1wu.LIZLLL;
                C17580mY c17580mY34 = this.LIZIZ;
                c17580mY34.LIZ = c1wu.LJ;
                c17580mY34.LIZIZ = c1wu.LJFF;
            } else if (abstractC17560mW2 instanceof C34281We) {
                C34281We c34281We = (C34281We) abstractC17560mW2;
                o.LJI(abstractC17560mW);
                if (abstractC17560mW.LIZIZ) {
                    C17580mY c17580mY35 = this.LJ;
                    C17580mY c17580mY36 = this.LIZIZ;
                    float f10 = c17580mY36.LIZ;
                    C17580mY c17580mY37 = this.LIZJ;
                    c17580mY35.LIZ = f10 - c17580mY37.LIZ;
                    c17580mY35.LIZIZ = c17580mY36.LIZIZ - c17580mY37.LIZIZ;
                } else {
                    this.LJ.LIZ();
                }
                C17580mY c17580mY38 = this.LJ;
                target.LIZ(c17580mY38.LIZ, c17580mY38.LIZIZ, c34281We.LIZJ, c34281We.LIZLLL);
                C17580mY c17580mY39 = this.LIZJ;
                C17580mY c17580mY40 = this.LIZIZ;
                float f11 = c17580mY40.LIZ;
                C17580mY c17580mY41 = this.LJ;
                c17580mY39.LIZ = f11 + c17580mY41.LIZ;
                c17580mY39.LIZIZ = c17580mY40.LIZIZ + c17580mY41.LIZIZ;
                c17580mY40.LIZ += c34281We.LIZJ;
                c17580mY40.LIZIZ += c34281We.LIZLLL;
            } else if (abstractC17560mW2 instanceof C1WW) {
                C1WW c1ww = (C1WW) abstractC17560mW2;
                o.LJI(abstractC17560mW);
                if (abstractC17560mW.LIZIZ) {
                    C17580mY c17580mY42 = this.LJ;
                    float f12 = 2;
                    C17580mY c17580mY43 = this.LIZIZ;
                    float f13 = c17580mY43.LIZ * f12;
                    C17580mY c17580mY44 = this.LIZJ;
                    c17580mY42.LIZ = f13 - c17580mY44.LIZ;
                    c17580mY42.LIZIZ = (f12 * c17580mY43.LIZIZ) - c17580mY44.LIZIZ;
                } else {
                    C17580mY c17580mY45 = this.LJ;
                    C17580mY c17580mY46 = this.LIZIZ;
                    c17580mY45.LIZ = c17580mY46.LIZ;
                    c17580mY45.LIZIZ = c17580mY46.LIZIZ;
                }
                C17580mY c17580mY47 = this.LJ;
                target.LIZLLL(c17580mY47.LIZ, c17580mY47.LIZIZ, c1ww.LIZJ, c1ww.LIZLLL);
                C17580mY c17580mY48 = this.LIZJ;
                C17580mY c17580mY49 = this.LJ;
                c17580mY48.LIZ = c17580mY49.LIZ;
                c17580mY48.LIZIZ = c17580mY49.LIZIZ;
                C17580mY c17580mY50 = this.LIZIZ;
                c17580mY50.LIZ = c1ww.LIZJ;
                c17580mY50.LIZIZ = c1ww.LIZLLL;
            } else if (abstractC17560mW2 instanceof C1WX) {
                C1WX c1wx = (C1WX) abstractC17560mW2;
                float f14 = c1wx.LJII;
                C17580mY c17580mY51 = this.LIZIZ;
                float f15 = c17580mY51.LIZ;
                float f16 = f14 + f15;
                float f17 = c1wx.LJIIIIZZ;
                float f18 = c17580mY51.LIZIZ;
                float f19 = f17 + f18;
                LIZIZ(target, f15, f18, f16, f19, c1wx.LIZJ, c1wx.LIZLLL, c1wx.LJ, c1wx.LJFF, c1wx.LJI);
                C17580mY c17580mY52 = this.LIZIZ;
                c17580mY52.LIZ = f16;
                c17580mY52.LIZIZ = f19;
                C17580mY c17580mY53 = this.LIZJ;
                c17580mY53.LIZ = f16;
                c17580mY53.LIZIZ = f19;
            } else if (abstractC17560mW2 instanceof C1WO) {
                C1WO c1wo = (C1WO) abstractC17560mW2;
                C17580mY c17580mY54 = this.LIZIZ;
                LIZIZ(target, c17580mY54.LIZ, c17580mY54.LIZIZ, c1wo.LJII, c1wo.LJIIIIZZ, c1wo.LIZJ, c1wo.LIZLLL, c1wo.LJ, c1wo.LJFF, c1wo.LJI);
                C17580mY c17580mY55 = this.LIZIZ;
                float f20 = c1wo.LJII;
                c17580mY55.LIZ = f20;
                float f21 = c1wo.LJIIIIZZ;
                c17580mY55.LIZIZ = f21;
                C17580mY c17580mY56 = this.LIZJ;
                c17580mY56.LIZ = f20;
                c17580mY56.LIZIZ = f21;
            }
            i++;
            abstractC17560mW = abstractC17560mW2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.List] */
    public final void LIZ(char c, float[] fArr) {
        ?? arrayList;
        boolean z;
        char c2;
        boolean z2;
        boolean z3;
        char c3;
        boolean z4;
        List<AbstractC17560mW> list = this.LIZ;
        if (c == 'z' || c == 'Z') {
            arrayList = C47261Igj.LJJIJ(C1WP.LIZJ);
        } else {
            char c4 = 2;
            if (c == 'm') {
                C40511Fv9 LJIL = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                arrayList = new ArrayList(C32I.LJJL(LJIL, 10));
                C118234kV it = LJIL.iterator();
                while (it.LJLJI) {
                    int nextInt = it.nextInt();
                    float[] LJIJJLI = C61898ORa.LJIJJLI(nextInt, nextInt + 2, fArr);
                    float f = LJIJJLI[0];
                    float f2 = LJIJJLI[1];
                    AbstractC17560mW c34251Wb = new C34251Wb(f, f2);
                    if (c34251Wb instanceof C1WT) {
                        if (nextInt > 0) {
                            c34251Wb = new C1WS(f, f2);
                        }
                    } else if (nextInt > 0) {
                        c34251Wb = new C34241Wa(f, f2);
                    }
                    arrayList.add(c34251Wb);
                }
            } else if (c == 'M') {
                C40511Fv9 LJIL2 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                arrayList = new ArrayList(C32I.LJJL(LJIL2, 10));
                C118234kV it2 = LJIL2.iterator();
                while (it2.LJLJI) {
                    int nextInt2 = it2.nextInt();
                    float[] LJIJJLI2 = C61898ORa.LJIJJLI(nextInt2, nextInt2 + 2, fArr);
                    float f3 = LJIJJLI2[0];
                    float f4 = LJIJJLI2[1];
                    AbstractC17560mW c1wt = new C1WT(f3, f4);
                    if (nextInt2 > 0) {
                        c1wt = new C1WS(f3, f4);
                    } else if (c1wt instanceof C34251Wb) {
                    }
                    arrayList.add(c1wt);
                }
            } else if (c == 'l') {
                C40511Fv9 LJIL3 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                arrayList = new ArrayList(C32I.LJJL(LJIL3, 10));
                C118234kV it3 = LJIL3.iterator();
                while (it3.LJLJI) {
                    int nextInt3 = it3.nextInt();
                    float[] LJIJJLI3 = C61898ORa.LJIJJLI(nextInt3, nextInt3 + 2, fArr);
                    float f5 = LJIJJLI3[0];
                    float f6 = LJIJJLI3[1];
                    AbstractC17560mW c34241Wa = new C34241Wa(f5, f6);
                    if ((c34241Wa instanceof C1WT) && nextInt3 > 0) {
                        c34241Wa = new C1WS(f5, f6);
                    } else if ((c34241Wa instanceof C34251Wb) && nextInt3 > 0) {
                        c34241Wa = new C34241Wa(f5, f6);
                    }
                    arrayList.add(c34241Wa);
                }
            } else if (c == 'L') {
                C40511Fv9 LJIL4 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                arrayList = new ArrayList(C32I.LJJL(LJIL4, 10));
                C118234kV it4 = LJIL4.iterator();
                while (it4.LJLJI) {
                    int nextInt4 = it4.nextInt();
                    float[] LJIJJLI4 = C61898ORa.LJIJJLI(nextInt4, nextInt4 + 2, fArr);
                    float f7 = LJIJJLI4[0];
                    float f8 = LJIJJLI4[1];
                    AbstractC17560mW c1ws = new C1WS(f7, f8);
                    if ((c1ws instanceof C1WT) && nextInt4 > 0) {
                        c1ws = new C1WS(f7, f8);
                    } else if ((c1ws instanceof C34251Wb) && nextInt4 > 0) {
                        c1ws = new C34241Wa(f7, f8);
                    }
                    arrayList.add(c1ws);
                }
            } else if (c == 'h') {
                C40511Fv9 LJIL5 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 1), 1);
                arrayList = new ArrayList(C32I.LJJL(LJIL5, 10));
                C118234kV it5 = LJIL5.iterator();
                while (it5.LJLJI) {
                    int nextInt5 = it5.nextInt();
                    float[] LJIJJLI5 = C61898ORa.LJIJJLI(nextInt5, nextInt5 + 1, fArr);
                    float f9 = LJIJJLI5[0];
                    AbstractC17560mW c1wz = new C1WZ(f9);
                    if ((c1wz instanceof C1WT) && nextInt5 > 0) {
                        c1wz = new C1WS(f9, LJIJJLI5[1]);
                    } else if ((c1wz instanceof C34251Wb) && nextInt5 > 0) {
                        c1wz = new C34241Wa(f9, LJIJJLI5[1]);
                    }
                    arrayList.add(c1wz);
                }
            } else if (c == 'H') {
                C40511Fv9 LJIL6 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 1), 1);
                arrayList = new ArrayList(C32I.LJJL(LJIL6, 10));
                C118234kV it6 = LJIL6.iterator();
                while (it6.LJLJI) {
                    int nextInt6 = it6.nextInt();
                    float[] LJIJJLI6 = C61898ORa.LJIJJLI(nextInt6, nextInt6 + 1, fArr);
                    float f10 = LJIJJLI6[0];
                    AbstractC17560mW c1wr = new C1WR(f10);
                    if ((c1wr instanceof C1WT) && nextInt6 > 0) {
                        c1wr = new C1WS(f10, LJIJJLI6[1]);
                    } else if ((c1wr instanceof C34251Wb) && nextInt6 > 0) {
                        c1wr = new C34241Wa(f10, LJIJJLI6[1]);
                    }
                    arrayList.add(c1wr);
                }
            } else if (c == 'v') {
                C40511Fv9 LJIL7 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 1), 1);
                arrayList = new ArrayList(C32I.LJJL(LJIL7, 10));
                C118234kV it7 = LJIL7.iterator();
                while (it7.LJLJI) {
                    int nextInt7 = it7.nextInt();
                    float[] LJIJJLI7 = C61898ORa.LJIJJLI(nextInt7, nextInt7 + 1, fArr);
                    float f11 = LJIJJLI7[0];
                    AbstractC17560mW c34291Wf = new C34291Wf(f11);
                    if ((c34291Wf instanceof C1WT) && nextInt7 > 0) {
                        c34291Wf = new C1WS(f11, LJIJJLI7[1]);
                    } else if ((c34291Wf instanceof C34251Wb) && nextInt7 > 0) {
                        c34291Wf = new C34241Wa(f11, LJIJJLI7[1]);
                    }
                    arrayList.add(c34291Wf);
                }
            } else if (c == 'V') {
                C40511Fv9 LJIL8 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 1), 1);
                arrayList = new ArrayList(C32I.LJJL(LJIL8, 10));
                C118234kV it8 = LJIL8.iterator();
                while (it8.LJLJI) {
                    int nextInt8 = it8.nextInt();
                    float[] LJIJJLI8 = C61898ORa.LJIJJLI(nextInt8, nextInt8 + 1, fArr);
                    float f12 = LJIJJLI8[0];
                    AbstractC17560mW c34301Wg = new C34301Wg(f12);
                    if ((c34301Wg instanceof C1WT) && nextInt8 > 0) {
                        c34301Wg = new C1WS(f12, LJIJJLI8[1]);
                    } else if ((c34301Wg instanceof C34251Wb) && nextInt8 > 0) {
                        c34301Wg = new C34241Wa(f12, LJIJJLI8[1]);
                    }
                    arrayList.add(c34301Wg);
                }
            } else {
                char c5 = 5;
                char c6 = 3;
                if (c == 'c') {
                    C40511Fv9 LJIL9 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(C32I.LJJL(LJIL9, 10));
                    C118234kV it9 = LJIL9.iterator();
                    while (it9.LJLJI) {
                        int nextInt9 = it9.nextInt();
                        float[] LJIJJLI9 = C61898ORa.LJIJJLI(nextInt9, nextInt9 + 6, fArr);
                        float f13 = LJIJJLI9[0];
                        float f14 = LJIJJLI9[1];
                        float f15 = LJIJJLI9[2];
                        float f16 = LJIJJLI9[c6];
                        float f17 = LJIJJLI9[4];
                        float f18 = LJIJJLI9[c5];
                        AbstractC17560mW abstractC17560mW = r13;
                        AbstractC17560mW c1wy = new C1WY(f13, f14, f15, f16, f17, f18);
                        if ((c1wy instanceof C1WT) && nextInt9 > 0) {
                            abstractC17560mW = new C1WS(f13, f14);
                        } else if ((abstractC17560mW instanceof C34251Wb) && nextInt9 > 0) {
                            abstractC17560mW = new C34241Wa(f13, f14);
                        }
                        arrayList.add(abstractC17560mW);
                        c5 = 5;
                        c6 = 3;
                    }
                } else if (c == 'C') {
                    C40511Fv9 LJIL10 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(C32I.LJJL(LJIL10, 10));
                    C118234kV it10 = LJIL10.iterator();
                    while (it10.LJLJI) {
                        int nextInt10 = it10.nextInt();
                        float[] LJIJJLI10 = C61898ORa.LJIJJLI(nextInt10, nextInt10 + 6, fArr);
                        float f19 = LJIJJLI10[0];
                        float f20 = LJIJJLI10[1];
                        AbstractC17560mW c1wq = new C1WQ(f19, f20, LJIJJLI10[2], LJIJJLI10[3], LJIJJLI10[4], LJIJJLI10[5]);
                        if ((c1wq instanceof C1WT) && nextInt10 > 0) {
                            c1wq = new C1WS(f19, f20);
                        } else if ((c1wq instanceof C34251Wb) && nextInt10 > 0) {
                            c1wq = new C34241Wa(f19, f20);
                        }
                        arrayList.add(c1wq);
                    }
                } else if (c == 's') {
                    C40511Fv9 LJIL11 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C32I.LJJL(LJIL11, 10));
                    C118234kV it11 = LJIL11.iterator();
                    while (it11.LJLJI) {
                        int nextInt11 = it11.nextInt();
                        float[] LJIJJLI11 = C61898ORa.LJIJJLI(nextInt11, nextInt11 + 4, fArr);
                        float f21 = LJIJJLI11[0];
                        float f22 = LJIJJLI11[1];
                        AbstractC17560mW c34271Wd = new C34271Wd(f21, f22, LJIJJLI11[2], LJIJJLI11[3]);
                        if ((c34271Wd instanceof C1WT) && nextInt11 > 0) {
                            c34271Wd = new C1WS(f21, f22);
                        } else if ((c34271Wd instanceof C34251Wb) && nextInt11 > 0) {
                            c34271Wd = new C34241Wa(f21, f22);
                        }
                        arrayList.add(c34271Wd);
                    }
                } else if (c == 'S') {
                    C40511Fv9 LJIL12 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C32I.LJJL(LJIL12, 10));
                    C118234kV it12 = LJIL12.iterator();
                    while (it12.LJLJI) {
                        int nextInt12 = it12.nextInt();
                        float[] LJIJJLI12 = C61898ORa.LJIJJLI(nextInt12, nextInt12 + 4, fArr);
                        float f23 = LJIJJLI12[0];
                        float f24 = LJIJJLI12[1];
                        AbstractC17560mW c1wv = new C1WV(f23, f24, LJIJJLI12[2], LJIJJLI12[3]);
                        if ((c1wv instanceof C1WT) && nextInt12 > 0) {
                            c1wv = new C1WS(f23, f24);
                        } else if ((c1wv instanceof C34251Wb) && nextInt12 > 0) {
                            c1wv = new C34241Wa(f23, f24);
                        }
                        arrayList.add(c1wv);
                    }
                } else if (c == 'q') {
                    C40511Fv9 LJIL13 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C32I.LJJL(LJIL13, 10));
                    C118234kV it13 = LJIL13.iterator();
                    while (it13.LJLJI) {
                        int nextInt13 = it13.nextInt();
                        float[] LJIJJLI13 = C61898ORa.LJIJJLI(nextInt13, nextInt13 + 4, fArr);
                        float f25 = LJIJJLI13[0];
                        float f26 = LJIJJLI13[1];
                        AbstractC17560mW c34261Wc = new C34261Wc(f25, f26, LJIJJLI13[2], LJIJJLI13[3]);
                        if ((c34261Wc instanceof C1WT) && nextInt13 > 0) {
                            c34261Wc = new C1WS(f25, f26);
                        } else if ((c34261Wc instanceof C34251Wb) && nextInt13 > 0) {
                            c34261Wc = new C34241Wa(f25, f26);
                        }
                        arrayList.add(c34261Wc);
                    }
                } else if (c == 'Q') {
                    C40511Fv9 LJIL14 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C32I.LJJL(LJIL14, 10));
                    C118234kV it14 = LJIL14.iterator();
                    while (it14.LJLJI) {
                        int nextInt14 = it14.nextInt();
                        float[] LJIJJLI14 = C61898ORa.LJIJJLI(nextInt14, nextInt14 + 4, fArr);
                        float f27 = LJIJJLI14[0];
                        float f28 = LJIJJLI14[1];
                        AbstractC17560mW c1wu = new C1WU(f27, f28, LJIJJLI14[2], LJIJJLI14[3]);
                        if ((c1wu instanceof C1WT) && nextInt14 > 0) {
                            c1wu = new C1WS(f27, f28);
                        } else if ((c1wu instanceof C34251Wb) && nextInt14 > 0) {
                            c1wu = new C34241Wa(f27, f28);
                        }
                        arrayList.add(c1wu);
                    }
                } else if (c == 't') {
                    C40511Fv9 LJIL15 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(C32I.LJJL(LJIL15, 10));
                    C118234kV it15 = LJIL15.iterator();
                    while (it15.LJLJI) {
                        int nextInt15 = it15.nextInt();
                        float[] LJIJJLI15 = C61898ORa.LJIJJLI(nextInt15, nextInt15 + 2, fArr);
                        float f29 = LJIJJLI15[0];
                        float f30 = LJIJJLI15[1];
                        AbstractC17560mW c34281We = new C34281We(f29, f30);
                        if ((c34281We instanceof C1WT) && nextInt15 > 0) {
                            c34281We = new C1WS(f29, f30);
                        } else if ((c34281We instanceof C34251Wb) && nextInt15 > 0) {
                            c34281We = new C34241Wa(f29, f30);
                        }
                        arrayList.add(c34281We);
                    }
                } else if (c == 'T') {
                    C40511Fv9 LJIL16 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(C32I.LJJL(LJIL16, 10));
                    C118234kV it16 = LJIL16.iterator();
                    while (it16.LJLJI) {
                        int nextInt16 = it16.nextInt();
                        float[] LJIJJLI16 = C61898ORa.LJIJJLI(nextInt16, nextInt16 + 2, fArr);
                        float f31 = LJIJJLI16[0];
                        float f32 = LJIJJLI16[1];
                        AbstractC17560mW c1ww = new C1WW(f31, f32);
                        if ((c1ww instanceof C1WT) && nextInt16 > 0) {
                            c1ww = new C1WS(f31, f32);
                        } else if ((c1ww instanceof C34251Wb) && nextInt16 > 0) {
                            c1ww = new C34241Wa(f31, f32);
                        }
                        arrayList.add(c1ww);
                    }
                } else if (c == 'a') {
                    C40511Fv9 LJIL17 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(C32I.LJJL(LJIL17, 10));
                    C118234kV it17 = LJIL17.iterator();
                    while (it17.LJLJI) {
                        int nextInt17 = it17.nextInt();
                        float[] LJIJJLI17 = C61898ORa.LJIJJLI(nextInt17, nextInt17 + 7, fArr);
                        float f33 = LJIJJLI17[0];
                        float f34 = LJIJJLI17[1];
                        float f35 = LJIJJLI17[c4];
                        if (Float.compare(LJIJJLI17[3], 0.0f) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (Float.compare(LJIJJLI17[4], 0.0f) != 0) {
                            c3 = 5;
                            z4 = true;
                        } else {
                            c3 = 5;
                            z4 = false;
                        }
                        AbstractC17560mW abstractC17560mW2 = r13;
                        AbstractC17560mW c1wx = new C1WX(f33, f34, f35, z3, z4, LJIJJLI17[c3], LJIJJLI17[6]);
                        if ((c1wx instanceof C1WT) && nextInt17 > 0) {
                            abstractC17560mW2 = new C1WS(LJIJJLI17[0], LJIJJLI17[1]);
                        } else if ((abstractC17560mW2 instanceof C34251Wb) && nextInt17 > 0) {
                            abstractC17560mW2 = new C34241Wa(LJIJJLI17[0], LJIJJLI17[1]);
                        }
                        arrayList.add(abstractC17560mW2);
                        c4 = 2;
                    }
                } else if (c == 'A') {
                    C40511Fv9 LJIL18 = C78842Uww.LJIL(new C40517FvF(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(C32I.LJJL(LJIL18, 10));
                    C118234kV it18 = LJIL18.iterator();
                    while (it18.LJLJI) {
                        int nextInt18 = it18.nextInt();
                        float[] LJIJJLI18 = C61898ORa.LJIJJLI(nextInt18, nextInt18 + 7, fArr);
                        float f36 = LJIJJLI18[0];
                        float f37 = LJIJJLI18[1];
                        float f38 = LJIJJLI18[2];
                        if (Float.compare(LJIJJLI18[3], 0.0f) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Float.compare(LJIJJLI18[4], 0.0f) != 0) {
                            c2 = 5;
                            z2 = true;
                        } else {
                            c2 = 5;
                            z2 = false;
                        }
                        AbstractC17560mW c1wo = new C1WO(f36, f37, f38, z, z2, LJIJJLI18[c2], LJIJJLI18[6]);
                        if ((c1wo instanceof C1WT) && nextInt18 > 0) {
                            c1wo = new C1WS(LJIJJLI18[0], LJIJJLI18[1]);
                        } else if ((c1wo instanceof C34251Wb) && nextInt18 > 0) {
                            c1wo = new C34241Wa(LJIJJLI18[0], LJIJJLI18[1]);
                        }
                        arrayList.add(c1wo);
                    }
                } else {
                    throw new IllegalArgumentException(C42398GkU.LIZIZ("Unknown command for: ", c));
                }
            }
        }
        ((ArrayList) list).addAll(arrayList);
    }

    public static void LIZIZ(InterfaceC11610cv interfaceC11610cv, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d;
        double d11 = d2;
        double d12 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double LIZ = C7MY.LIZ(d11, sin, d10 * cos, d5);
        double LIZ2 = C7MY.LIZ(d11, cos, (-d10) * sin, d6);
        double LIZ3 = C7MY.LIZ(d4, sin, d3 * cos, d5);
        double LIZ4 = C7MY.LIZ(d4, cos, (-d3) * sin, d6);
        double d13 = LIZ - LIZ3;
        double d14 = LIZ2 - LIZ4;
        double d15 = 2;
        double d16 = (LIZ + LIZ3) / d15;
        double d17 = (LIZ2 + LIZ4) / d15;
        double d18 = (d14 * d14) + (d13 * d13);
        if (d18 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            double sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            LIZIZ(interfaceC11610cv, d10, d11, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = d13 * sqrt2;
        double d21 = sqrt2 * d14;
        if (z == z2) {
            d8 = d16 - d21;
            d9 = d17 + d20;
        } else {
            d8 = d16 + d21;
            d9 = d17 - d20;
        }
        double atan2 = Math.atan2(LIZ2 - d9, LIZ - d8);
        double atan22 = Math.atan2(LIZ4 - d9, LIZ3 - d8) - atan2;
        if (atan22 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (atan22 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d22 = d8 * d5;
        double d23 = d9 * d6;
        double d24 = (d22 * cos) - (d23 * sin);
        double d25 = (d23 * cos) + (d22 * sin);
        double d26 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d26) / 3.141592653589793d));
        double cos2 = Math.cos(d12);
        double sin2 = Math.sin(d12);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d5;
        double d28 = d27 * cos2;
        double d29 = d6 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d6 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d35 = atan2 + d34;
            double sin4 = Math.sin(d35);
            double cos4 = Math.cos(d35);
            double LIZ5 = C207798Dn.LIZ(d5, cos2, cos4, d24) - (d29 * sin4);
            double LIZ6 = (d32 * sin4) + C207798Dn.LIZ(d5, sin2, cos4, d25);
            double d36 = (d28 * sin4) - (d29 * cos4);
            double d37 = (cos4 * d32) + (sin4 * d31);
            double d38 = d35 - atan2;
            double tan = Math.tan(d38 / d15);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d26) - 1) * Math.sin(d38)) / 3;
            interfaceC11610cv.LJFF((float) ((d30 * sqrt3) + d10), (float) ((d33 * sqrt3) + d11), (float) (LIZ5 - (sqrt3 * d36)), (float) (LIZ6 - (sqrt3 * d37)), (float) LIZ5, (float) LIZ6);
            i++;
            d10 = LIZ5;
            d11 = LIZ6;
            atan2 = d35;
            d33 = d37;
            d30 = d36;
        }
    }
}
