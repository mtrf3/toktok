package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.play.core.assetpacks.r2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.26x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC531926x extends ViewGroup implements InterfaceC43251mr {
    public final C25730zh LJLIL;
    public View LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public boolean LJLJJI;
    public InterfaceC07790Sh LJLJJL;
    public InterfaceC88472Yns<? super InterfaceC07790Sh, C76800UCe> LJLJJLL;
    public InterfaceC23370vt LJLJL;
    public InterfaceC88472Yns<? super InterfaceC23370vt, C76800UCe> LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public InterfaceC36571c5 LJLL;
    public final C0OJ LJLLI;
    public final IDqS416S0100000 LJLLILLLL;
    public final IDqS420S0100000 LJLLJ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLL;
    public final int[] LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public final C16690l7 LJZ;
    public final C29321Dc LJZI;

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLILLLLZI;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJZ;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            return view.isNestedScrollingEnabled();
        }
        return super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0OJ c0oj = this.LJLLI;
        c0oj.getClass();
        c0oj.LJ = C0O8.LIZJ(c0oj.LIZIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1IK c1ik = this.LJLLI.LJ;
        if (c1ik != null) {
            c1ik.dispose();
        }
        this.LJLLI.LIZ();
    }

    public final InterfaceC23370vt getDensity() {
        return this.LJLJL;
    }

    public final C29321Dc getLayoutNode() {
        return this.LJZI;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLJLLL;
    }

    public final InterfaceC07790Sh getModifier() {
        return this.LJLJJL;
    }

    public final InterfaceC88472Yns<InterfaceC23370vt, C76800UCe> getOnDensityChanged$ui_release() {
        return this.LJLJLJ;
    }

    public final InterfaceC88472Yns<InterfaceC07790Sh, C76800UCe> getOnModifierChanged$ui_release() {
        return this.LJLJJLL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.LJLLL;
    }

    public final InterfaceC36571c5 getSavedStateRegistryOwner() {
        return this.LJLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getUpdate() {
        return this.LJLJI;
    }

    public final View getView() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.LJLLLL);
        int[] iArr = this.LJLLLL;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.LJLLLL[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (Build.VERSION.SDK_INT < 23 && i == 0) {
            this.LJZI.LJJII();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC23370vt value) {
        o.LJIIIZ(value, "value");
        if (value != this.LJLJL) {
            this.LJLJL = value;
            InterfaceC88472Yns<? super InterfaceC23370vt, C76800UCe> interfaceC88472Yns = this.LJLJLJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.LJLJLLL) {
            this.LJLJLLL = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(InterfaceC07790Sh value) {
        o.LJIIIZ(value, "value");
        if (value != this.LJLJJL) {
            this.LJLJJL = value;
            InterfaceC88472Yns<? super InterfaceC07790Sh, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC88472Yns<? super InterfaceC23370vt, C76800UCe> interfaceC88472Yns) {
        this.LJLJLJ = interfaceC88472Yns;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC88472Yns<? super InterfaceC07790Sh, C76800UCe> interfaceC88472Yns) {
        this.LJLJJLL = interfaceC88472Yns;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLLL = interfaceC88472Yns;
    }

    public final void setSavedStateRegistryOwner(InterfaceC36571c5 interfaceC36571c5) {
        if (interfaceC36571c5 != this.LJLL) {
            this.LJLL = interfaceC36571c5;
            C10A.LIZIZ(this, interfaceC36571c5);
        }
    }

    public final void setUpdate(InterfaceC65784Pro<C76800UCe> value) {
        o.LJIIIZ(value, "value");
        this.LJLJI = value;
        this.LJLJJI = true;
        this.LJLLJ.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.LJLILLLLZI) {
            this.LJLILLLLZI = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.LJLLJ.invoke();
            }
        }
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        o.LJIIIZ(target, "target");
        this.LJZ.LIZIZ(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.LJZI.LJJII();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        super.onDescendantInvalidated(child, target);
        this.LJZI.LJJII();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.LJLILLLLZI;
        int i4 = 0;
        if (view2 != null) {
            i3 = view2.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            i4 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.LJLLLLLL = i;
        this.LJLZ = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC531926x(Context context, AbstractC24810yD abstractC24810yD, C25730zh dispatcher) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LJLIL = dispatcher;
        if (abstractC24810yD != null) {
            setTag(R.id.a4z, abstractC24810yD);
        }
        setSaveFromParentEnabled(false);
        this.LJLJI = C531826w.LJLIL;
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        this.LJLJJL = c1m1;
        this.LJLJL = new C35431aF(1.0f, 1.0f);
        final C55572Gb c55572Gb = (C55572Gb) this;
        this.LJLLI = new C0OJ(new IDqS416S0100000(c55572Gb, 315));
        this.LJLLILLLL = new IDqS416S0100000(c55572Gb, 314);
        this.LJLLJ = new IDqS420S0100000(c55572Gb, 175);
        this.LJLLLL = new int[2];
        this.LJLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJZ = new C16690l7();
        final C29321Dc c29321Dc = new C29321Dc(false, 3, 0);
        o.LJIIIZ(c1m1, "<this>");
        C533227k c533227k = new C533227k();
        c533227k.LJLIL = new IDqS416S0100000(c55572Gb, 342);
        C44241oS c44241oS = new C44241oS();
        C44241oS c44241oS2 = c533227k.LJLILLLLZI;
        if (c44241oS2 != null) {
            c44241oS2.LJLIL = null;
        }
        c533227k.LJLILLLLZI = c44241oS;
        c44241oS.LJLIL = c533227k;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c44241oS);
        InterfaceC07790Sh LJJIIJZLJL = V0N.LJJIIJZLJL(r2.LJI(c533227k, new IDqS172S0200000(c29321Dc, c55572Gb, 89)), new IDqS172S0200000(c29321Dc, c55572Gb, 90));
        c29321Dc.LIZLLL(this.LJLJJL.LLLIIIL(LJJIIJZLJL));
        this.LJLJJLL = new IDqS172S0200000(c29321Dc, LJJIIJZLJL, 86);
        c29321Dc.LIZIZ(this.LJLJL);
        this.LJLJLJ = new IDqS416S0100000(c29321Dc, 313);
        C68322mC c68322mC = new C68322mC();
        c29321Dc.LLIIIZ = new IDqS28S0300000(c55572Gb, c29321Dc, c68322mC, 26);
        c29321Dc.LLIIJI = new IDqS172S0200000(c55572Gb, c68322mC, 87);
        c29321Dc.LJFF(new InterfaceC273215k() { // from class: X.1bI
            public final int LJFF(int i) {
                AbstractC531926x abstractC531926x = c55572Gb;
                ViewGroup.LayoutParams layoutParams = abstractC531926x.getLayoutParams();
                o.LJI(layoutParams);
                abstractC531926x.measure(AbstractC531926x.LIZ(abstractC531926x, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c55572Gb.getMeasuredHeight();
            }

            public final int LJI(int i) {
                AbstractC531926x abstractC531926x = c55572Gb;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AbstractC531926x abstractC531926x2 = c55572Gb;
                ViewGroup.LayoutParams layoutParams = abstractC531926x2.getLayoutParams();
                o.LJI(layoutParams);
                abstractC531926x.measure(makeMeasureSpec, AbstractC531926x.LIZ(abstractC531926x2, 0, i, layoutParams.height));
                return c55572Gb.getMeasuredWidth();
            }

            @Override // X.InterfaceC273215k
            public final int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
                o.LJIIIZ(abstractC538029g, "<this>");
                return LJI(i);
            }

            @Override // X.InterfaceC273215k
            public final int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
                o.LJIIIZ(abstractC538029g, "<this>");
                return LJI(i);
            }

            @Override // X.InterfaceC273215k
            public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                InterfaceC273515n LJJLIL;
                o.LJIIIZ(measure, "$this$measure");
                o.LJIIIZ(measurables, "measurables");
                if (C23360vs.LJIIIZ(j) != 0) {
                    c55572Gb.getChildAt(0).setMinimumWidth(C23360vs.LJIIIZ(j));
                }
                if (C23360vs.LJIIIIZZ(j) != 0) {
                    c55572Gb.getChildAt(0).setMinimumHeight(C23360vs.LJIIIIZZ(j));
                }
                AbstractC531926x abstractC531926x = c55572Gb;
                int LJIIIZ = C23360vs.LJIIIZ(j);
                int LJII = C23360vs.LJII(j);
                ViewGroup.LayoutParams layoutParams = c55572Gb.getLayoutParams();
                o.LJI(layoutParams);
                int LIZ = AbstractC531926x.LIZ(abstractC531926x, LJIIIZ, LJII, layoutParams.width);
                AbstractC531926x abstractC531926x2 = c55572Gb;
                int LJIIIIZZ = C23360vs.LJIIIIZZ(j);
                int LJI = C23360vs.LJI(j);
                ViewGroup.LayoutParams layoutParams2 = c55572Gb.getLayoutParams();
                o.LJI(layoutParams2);
                abstractC531926x.measure(LIZ, AbstractC531926x.LIZ(abstractC531926x2, LJIIIIZZ, LJI, layoutParams2.height));
                LJJLIL = measure.LJJLIL(c55572Gb.getMeasuredWidth(), c55572Gb.getMeasuredHeight(), C113554cx.LJJJLIIL(), new IDqS172S0200000(c29321Dc, c55572Gb, 88));
                return LJJLIL;
            }

            @Override // X.InterfaceC273215k
            public final int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
                o.LJIIIZ(abstractC538029g, "<this>");
                return LJFF(i);
            }

            @Override // X.InterfaceC273215k
            public final int LJ(AbstractC538029g abstractC538029g, List list, int i) {
                o.LJIIIZ(abstractC538029g, "<this>");
                return LJFF(i);
            }
        });
        this.LJZI = c29321Dc;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        XKX.LIZLLL(this.LJLIL.LIZLLL(), null, null, new C55562Ga(this, C78983UzD.LJFF(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    public static final int LIZ(AbstractC531926x abstractC531926x, int i, int i2, int i3) {
        abstractC531926x.getClass();
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(C78842Uww.LJIIL(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        this.LJZ.LIZ(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        XKX.LIZLLL(this.LJLIL.LIZLLL(), null, null, new C2GZ(z, this, C78983UzD.LJFF(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] iArr, int i3) {
        int i4;
        long j;
        o.LJIIIZ(target, "target");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C25730zh c25730zh = this.LJLIL;
        float f = -1;
        long LIZ = C78923UyF.LIZ(i * f, i2 * f);
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        C27C c27c = c25730zh.LIZJ;
        if (c27c != null) {
            j = c27c.LIZIZ(i4, LIZ);
        } else {
            j = C10370av.LIZIZ;
        }
        iArr[0] = V1B.LJJIIJZLJL(C10370av.LIZLLL(j));
        iArr[1] = V1B.LJJIIJZLJL(C10370av.LJ(j));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        int i6;
        o.LJIIIZ(target, "target");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C25730zh c25730zh = this.LJLIL;
        float f = -1;
        long LIZ = C78923UyF.LIZ(i * f, i2 * f);
        long LIZ2 = C78923UyF.LIZ(i3 * f, i4 * f);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        c25730zh.LIZIZ(i6, LIZ, LIZ2);
    }

    @Override // X.InterfaceC43251mr
    public final void LJJIJIL(View target, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        o.LJIIIZ(target, "target");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C25730zh c25730zh = this.LJLIL;
        float f = -1;
        long LIZ = C78923UyF.LIZ(i * f, i2 * f);
        long LIZ2 = C78923UyF.LIZ(i3 * f, i4 * f);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        long LIZIZ = c25730zh.LIZIZ(i6, LIZ, LIZ2);
        iArr[0] = V1B.LJJIIJZLJL(C10370av.LIZLLL(LIZIZ));
        iArr[1] = V1B.LJJIIJZLJL(C10370av.LJ(LIZIZ));
    }
}
