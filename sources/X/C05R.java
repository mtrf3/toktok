package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.05R, reason: invalid class name */
/* loaded from: classes.dex */
public class C05R {
    public C40061hi LIZ = new C40061hi();
    public C40061hi LIZIZ = new C40061hi();
    public AnonymousClass064 LIZJ = null;
    public AnonymousClass064 LIZLLL = null;
    public int LJ;
    public int LJFF;
    public final /* synthetic */ C45601qe LJI;

    public final void LIZ() {
        C018205i LIZJ;
        C018205i LIZJ2;
        int childCount = this.LJI.getChildCount();
        this.LJI.LJLL.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LJI.getChildAt(i);
            this.LJI.LJLL.put(childAt, new C267313d(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = this.LJI.getChildAt(i2);
            C267313d c267313d = this.LJI.LJLL.get(childAt2);
            if (c267313d != null) {
                if (this.LIZJ != null && (LIZJ2 = LIZJ(this.LIZ, childAt2)) != null) {
                    AnonymousClass064 anonymousClass064 = this.LIZJ;
                    C267513f c267513f = c267313d.LIZLLL;
                    c267513f.LJLJI = 0.0f;
                    c267513f.LJLJJI = 0.0f;
                    c267313d.LIZLLL(c267513f);
                    C267513f c267513f2 = c267313d.LIZLLL;
                    float x = LIZJ2.getX();
                    float y = LIZJ2.getY();
                    float width = LIZJ2.getWidth();
                    float height = LIZJ2.getHeight();
                    c267513f2.LJLJJL = x;
                    c267513f2.LJLJJLL = y;
                    c267513f2.LJLJL = width;
                    c267513f2.LJLJLJ = height;
                    C019905z LJIILL = anonymousClass064.LJIILL(c267313d.LIZIZ);
                    c267313d.LIZLLL.LIZJ(LJIILL);
                    c267313d.LJIIIZ = LJIILL.LIZJ.LJFF;
                    c267313d.LJFF.LJ(LIZJ2, anonymousClass064, c267313d.LIZIZ);
                }
                if (this.LIZLLL != null && (LIZJ = LIZJ(this.LIZIZ, childAt2)) != null) {
                    AnonymousClass064 anonymousClass0642 = this.LIZLLL;
                    C267513f c267513f3 = c267313d.LJ;
                    c267513f3.LJLJI = 1.0f;
                    c267513f3.LJLJJI = 1.0f;
                    c267313d.LIZLLL(c267513f3);
                    C267513f c267513f4 = c267313d.LJ;
                    float x2 = LIZJ.getX();
                    float y2 = LIZJ.getY();
                    float width2 = LIZJ.getWidth();
                    float height2 = LIZJ.getHeight();
                    c267513f4.LJLJJL = x2;
                    c267513f4.LJLJJLL = y2;
                    c267513f4.LJLJL = width2;
                    c267513f4.LJLJLJ = height2;
                    c267313d.LJ.LIZJ(anonymousClass0642.LJIILL(c267313d.LIZIZ));
                    c267313d.LJI.LJ(LIZJ, anonymousClass0642, c267313d.LIZIZ);
                }
            }
        }
    }

    public final void LJ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        int i;
        C45601qe c45601qe = this.LJI;
        int i2 = c45601qe.LJLJL;
        int i3 = c45601qe.LJLJLJ;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        C45601qe c45601qe2 = this.LJI;
        c45601qe2.LLILLJJLI = mode;
        c45601qe2.LLILLL = mode2;
        int optimizationLevel = c45601qe2.getOptimizationLevel();
        C45601qe c45601qe3 = this.LJI;
        if (c45601qe3.LJLJJL == c45601qe3.getStartState()) {
            this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
            if (this.LIZJ != null) {
                this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
            }
        } else {
            if (this.LIZJ != null) {
                this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
            }
            this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
        }
        int i4 = 0;
        boolean z5 = true;
        if (!(this.LJI.getParent() instanceof C45601qe) || mode != 1073741824 || mode2 != 1073741824) {
            C45601qe c45601qe4 = this.LJI;
            c45601qe4.LLILLJJLI = mode;
            c45601qe4.LLILLL = mode2;
            if (c45601qe4.LJLJJL == c45601qe4.getStartState()) {
                this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
                if (this.LIZJ != null) {
                    this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
                }
            } else {
                if (this.LIZJ != null) {
                    this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
                }
                this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
            }
            this.LJI.LLILII = this.LIZ.getWidth();
            this.LJI.LLILIL = this.LIZ.getHeight();
            this.LJI.LLILL = this.LIZIZ.getWidth();
            this.LJI.LLILLIZIL = this.LIZIZ.getHeight();
            C45601qe c45601qe5 = this.LJI;
            if (c45601qe5.LLILII != c45601qe5.LLILL || c45601qe5.LLILIL != c45601qe5.LLILLIZIL) {
                z = true;
            } else {
                z = false;
            }
            c45601qe5.LLIL = z;
        }
        C45601qe c45601qe6 = this.LJI;
        int i5 = c45601qe6.LLILII;
        int i6 = c45601qe6.LLILIL;
        int i7 = c45601qe6.LLILLJJLI;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((c45601qe6.LLILZ * (c45601qe6.LLILL - i5)) + i5);
        }
        int i8 = c45601qe6.LLILLL;
        if (i8 == Integer.MIN_VALUE || i8 == 0) {
            i6 = (int) ((c45601qe6.LLILZ * (c45601qe6.LLILLIZIL - i6)) + i6);
        }
        C40061hi c40061hi = this.LIZ;
        if (c40061hi.LJIILIIL || this.LIZIZ.LJIILIIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c40061hi.LJIILJJIL || this.LIZIZ.LJIILJJIL) {
            z3 = true;
        } else {
            z3 = false;
        }
        c45601qe6.resolveMeasuredDimension(i2, i3, i5, i6, z2, z3);
        C45601qe c45601qe7 = this.LJI;
        int childCount = c45601qe7.getChildCount();
        c45601qe7.LLJ.LIZ();
        c45601qe7.LJZ = true;
        int width = c45601qe7.getWidth();
        int height = c45601qe7.getHeight();
        C05Y c05y = c45601qe7.LJLIL.LIZJ;
        if (c05y != null && (i = c05y.LJIILL) != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C267313d c267313d = c45601qe7.LJLL.get(c45601qe7.getChildAt(i9));
                if (c267313d != null) {
                    c267313d.LJJIFFI = i;
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            C267313d c267313d2 = c45601qe7.LJLL.get(c45601qe7.getChildAt(i10));
            if (c267313d2 != null) {
                c45601qe7.LJLIL.LJ(c267313d2);
                c267313d2.LJ(c45601qe7.getNanoTime(), width, height);
            }
        }
        C05Y c05y2 = c45601qe7.LJLIL.LIZJ;
        if (c05y2 != null) {
            float f3 = c05y2.LJIIIIZZ;
            if (f3 != 0.0f) {
                if (f3 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float abs = Math.abs(f3);
                float f4 = -3.4028235E38f;
                float f5 = Float.MAX_VALUE;
                int i11 = 0;
                float f6 = Float.MAX_VALUE;
                float f7 = -3.4028235E38f;
                while (true) {
                    if (i11 < childCount) {
                        C267313d c267313d3 = c45601qe7.LJLL.get(c45601qe7.getChildAt(i11));
                        if (!Float.isNaN(c267313d3.LJIIIZ)) {
                            break;
                        }
                        C267513f c267513f = c267313d3.LJ;
                        float f8 = c267513f.LJLJJL;
                        float f9 = c267513f.LJLJJLL;
                        if (z4) {
                            f2 = f9 - f8;
                        } else {
                            f2 = f9 + f8;
                        }
                        f6 = Math.min(f6, f2);
                        f7 = Math.max(f7, f2);
                        i11++;
                    } else {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        C267313d c267313d4 = c45601qe7.LJLL.get(c45601qe7.getChildAt(i12));
                        if (!Float.isNaN(c267313d4.LJIIIZ)) {
                            f5 = Math.min(f5, c267313d4.LJIIIZ);
                            f4 = Math.max(f4, c267313d4.LJIIIZ);
                        }
                    }
                    while (i4 < childCount) {
                        C267313d c267313d5 = c45601qe7.LJLL.get(c45601qe7.getChildAt(i4));
                        if (!Float.isNaN(c267313d5.LJIIIZ)) {
                            c267313d5.LJIIJJI = 1.0f / (1.0f - abs);
                            if (z4) {
                                c267313d5.LJIIJ = abs - (((f4 - c267313d5.LJIIIZ) / (f4 - f5)) * abs);
                            } else {
                                c267313d5.LJIIJ = abs - (((c267313d5.LJIIIZ - f5) * abs) / (f4 - f5));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                while (i4 < childCount) {
                    C267313d c267313d6 = c45601qe7.LJLL.get(c45601qe7.getChildAt(i4));
                    C267513f c267513f2 = c267313d6.LJ;
                    float f10 = c267513f2.LJLJJL;
                    float f11 = c267513f2.LJLJJLL;
                    if (z4) {
                        f = f11 - f10;
                    } else {
                        f = f11 + f10;
                    }
                    c267313d6.LJIIJJI = 1.0f / (1.0f - abs);
                    c267313d6.LJIIJ = abs - (((f - f6) * abs) / (f7 - f6));
                    i4++;
                }
            }
        }
    }

    public C05R(C45601qe c45601qe) {
        this.LJI = c45601qe;
    }

    public static void LIZIZ(C40061hi c40061hi, C40061hi c40061hi2) {
        C018205i c018205i;
        ArrayList<C018205i> arrayList = c40061hi.LIZ;
        HashMap<C018205i, C018205i> hashMap = new HashMap<>();
        hashMap.put(c40061hi, c40061hi2);
        c40061hi2.LIZ.clear();
        c40061hi2.copy(c40061hi, hashMap);
        Iterator<C018205i> it = arrayList.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            if (next instanceof C40051hh) {
                c018205i = new C40051hh();
            } else if (next instanceof C1AC) {
                c018205i = new C1AC();
            } else if (next instanceof C45611qf) {
                c018205i = new C45611qf();
            } else if (next instanceof InterfaceC018505l) {
                c018205i = new C1AD();
            } else {
                c018205i = new C018205i();
            }
            c40061hi2.LIZ.add(c018205i);
            C018205i c018205i2 = c018205i.mParent;
            if (c018205i2 != null) {
                ((C1AE) c018205i2).LIZ.remove(c018205i);
                c018205i.reset();
            }
            c018205i.mParent = c40061hi2;
            hashMap.put(next, c018205i);
        }
        Iterator<C018205i> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C018205i next2 = it2.next();
            hashMap.get(next2).copy(next2, hashMap);
        }
    }

    public static C018205i LIZJ(C40061hi c40061hi, View view) {
        if (c40061hi.mCompanionWidget == view) {
            return c40061hi;
        }
        ArrayList<C018205i> arrayList = c40061hi.LIZ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C018205i c018205i = (C018205i) ListProtector.get(arrayList, i);
            if (c018205i.mCompanionWidget == view) {
                return c018205i;
            }
        }
        return null;
    }

    public final void LIZLLL(AnonymousClass064 anonymousClass064, AnonymousClass064 anonymousClass0642) {
        this.LIZJ = anonymousClass064;
        this.LIZLLL = anonymousClass0642;
        this.LIZ = new C40061hi();
        C40061hi c40061hi = new C40061hi();
        this.LIZIZ = c40061hi;
        C40061hi c40061hi2 = this.LIZ;
        C40061hi c40061hi3 = this.LJI.mLayoutWidget;
        AnonymousClass169 anonymousClass169 = c40061hi3.LIZLLL;
        c40061hi2.LIZLLL = anonymousClass169;
        c40061hi2.LIZJ.LJFF = anonymousClass169;
        AnonymousClass169 anonymousClass1692 = c40061hi3.LIZLLL;
        c40061hi.LIZLLL = anonymousClass1692;
        c40061hi.LIZJ.LJFF = anonymousClass1692;
        c40061hi2.LIZ.clear();
        this.LIZIZ.LIZ.clear();
        LIZIZ(this.LJI.mLayoutWidget, this.LIZ);
        LIZIZ(this.LJI.mLayoutWidget, this.LIZIZ);
        if (this.LJI.LJLLL > 0.5d) {
            if (anonymousClass064 != null) {
                LJFF(this.LIZ, anonymousClass064);
            }
            LJFF(this.LIZIZ, anonymousClass0642);
        } else {
            LJFF(this.LIZIZ, anonymousClass0642);
            if (anonymousClass064 != null) {
                LJFF(this.LIZ, anonymousClass064);
            }
        }
        this.LIZ.LJ = this.LJI.isRtl();
        C40061hi c40061hi4 = this.LIZ;
        c40061hi4.LIZIZ.LIZJ(c40061hi4);
        this.LIZIZ.LJ = this.LJI.isRtl();
        C40061hi c40061hi5 = this.LIZIZ;
        c40061hi5.LIZIZ.LIZJ(c40061hi5);
        ViewGroup.LayoutParams layoutParams = this.LJI.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C40061hi c40061hi6 = this.LIZ;
                EnumC018105h enumC018105h = EnumC018105h.WRAP_CONTENT;
                c40061hi6.setHorizontalDimensionBehaviour(enumC018105h);
                this.LIZIZ.setHorizontalDimensionBehaviour(enumC018105h);
            }
            if (layoutParams.height == -2) {
                C40061hi c40061hi7 = this.LIZ;
                EnumC018105h enumC018105h2 = EnumC018105h.WRAP_CONTENT;
                c40061hi7.setVerticalDimensionBehaviour(enumC018105h2);
                this.LIZIZ.setVerticalDimensionBehaviour(enumC018105h2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(C40061hi c40061hi, AnonymousClass064 anonymousClass064) {
        SparseArray<C018205i> sparseArray = new SparseArray<>();
        C1AI c1ai = new C1AI();
        sparseArray.clear();
        sparseArray.put(0, c40061hi);
        sparseArray.put(this.LJI.getId(), c40061hi);
        Iterator<C018205i> it = c40061hi.LIZ.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            sparseArray.put(((View) next.mCompanionWidget).getId(), next);
        }
        Iterator<C018205i> it2 = c40061hi.LIZ.iterator();
        while (it2.hasNext()) {
            C018205i next2 = it2.next();
            View view = (View) next2.mCompanionWidget;
            int id = view.getId();
            if (anonymousClass064.LIZJ.containsKey(Integer.valueOf(id))) {
                anonymousClass064.LIZJ.get(Integer.valueOf(id)).LIZ(c1ai);
            }
            next2.setWidth(anonymousClass064.LJIILL(view.getId()).LIZLLL.LIZJ);
            next2.setHeight(anonymousClass064.LJIILL(view.getId()).LIZLLL.LIZLLL);
            if (view instanceof AbstractC019505v) {
                AbstractC019505v abstractC019505v = (AbstractC019505v) view;
                int id2 = abstractC019505v.getId();
                if (anonymousClass064.LIZJ.containsKey(Integer.valueOf(id2))) {
                    C019905z c019905z = anonymousClass064.LIZJ.get(Integer.valueOf(id2));
                    if (next2 instanceof C1AD) {
                        abstractC019505v.loadParameters(c019905z, (C1AD) next2, c1ai, sparseArray);
                    }
                }
                if (view instanceof C1AF) {
                    ((AbstractC019505v) view).validateParams();
                }
            }
            c1ai.resolveLayoutDirection(this.LJI.getLayoutDirection());
            this.LJI.applyConstraintsFromLayoutParams(false, view, next2, c1ai, sparseArray);
            if (anonymousClass064.LJIILL(view.getId()).LIZIZ.LIZJ == 1) {
                next2.mVisibility = view.getVisibility();
            } else {
                next2.mVisibility = anonymousClass064.LJIILL(view.getId()).LIZIZ.LIZIZ;
            }
        }
        Iterator<C018205i> it3 = c40061hi.LIZ.iterator();
        while (it3.hasNext()) {
            C018205i next3 = it3.next();
            if (next3 instanceof C40071hj) {
                AbstractC019505v abstractC019505v2 = (AbstractC019505v) next3.mCompanionWidget;
                InterfaceC018505l interfaceC018505l = (InterfaceC018505l) next3;
                abstractC019505v2.updatePreLayout(c40061hi, interfaceC018505l, sparseArray);
                C1AD c1ad = (C1AD) interfaceC018505l;
                for (int i = 0; i < c1ad.LIZIZ; i++) {
                    C018205i c018205i = c1ad.LIZ[i];
                    if (c018205i != null) {
                        c018205i.mInVirtuaLayout = true;
                    }
                }
            }
        }
    }
}
