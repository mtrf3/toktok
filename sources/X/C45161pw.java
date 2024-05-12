package X;

import Y.IDLAdapterS2S0100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.widget.ContentFrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.1pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45161pw extends ViewGroup implements AnonymousClass037, InterfaceC16670l5, C1V0, InterfaceC43251mr {
    public static final int[] LLI = {R.attr.u1, android.R.attr.windowContentOverlay};
    public int LJLIL;
    public int LJLILLLLZI;
    public ContentFrameLayout LJLJI;
    public C02R LJLJJI;
    public AnonymousClass039 LJLJJL;
    public Drawable LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final Rect LJLLL;
    public final Rect LJLLLL;
    public final Rect LJLLLLLL;
    public C16800lI LJLZ;
    public C16800lI LJZ;
    public C16800lI LJZI;
    public C16800lI LJZL;
    public C02S LL;
    public OverScroller LLD;
    public ViewPropertyAnimator LLF;
    public final IDLAdapterS2S0100000 LLFF;
    public final IDRunnableS85S0100000 LLFFF;
    public final IDRunnableS85S0100000 LLFII;
    public final C16690l7 LLFZ;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LJIIJ() {
        removeCallbacks(this.LLFFF);
        removeCallbacks(this.LLFII);
        ViewPropertyAnimator viewPropertyAnimator = this.LLF;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void LJIIL() {
        AnonymousClass039 wrapper;
        if (this.LJLJI == null) {
            this.LJLJI = (ContentFrameLayout) findViewById(R.id.nl);
            this.LJLJJI = (C02R) findViewById(R.id.nn);
            KeyEvent.Callback findViewById = findViewById(R.id.nk);
            if (findViewById instanceof AnonymousClass039) {
                wrapper = (AnonymousClass039) findViewById;
            } else if (findViewById instanceof C011902x) {
                wrapper = ((C011902x) findViewById).getWrapper();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can't make a decor toolbar out of ");
                LIZ.append(C16880lQ.LJLLJ(findViewById.getClass()));
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            this.LJLJJL = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C02T();
    }

    public int getActionBarHideOffset() {
        C02R c02r = this.LJLJJI;
        if (c02r != null) {
            return -((int) c02r.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LLFZ;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // X.AnonymousClass037
    public final boolean LIZ() {
        LJIIL();
        return this.LJLJJL.LIZ();
    }

    @Override // X.AnonymousClass037
    public final boolean LIZIZ() {
        LJIIL();
        return this.LJLJJL.LIZIZ();
    }

    @Override // X.AnonymousClass037
    public final boolean LIZJ() {
        LJIIL();
        return this.LJLJJL.LIZJ();
    }

    @Override // X.AnonymousClass037
    public final boolean LJ() {
        LJIIL();
        return this.LJLJJL.LJ();
    }

    @Override // X.AnonymousClass037
    public final boolean LJFF() {
        LJIIL();
        return this.LJLJJL.LJFF();
    }

    @Override // X.AnonymousClass037
    public final void LJI() {
        LJIIL();
        this.LJLJJL.LJI();
    }

    @Override // X.AnonymousClass037
    public final void LJIIIIZZ() {
        LJIIL();
        this.LJLJJL.LJIIJJI();
    }

    public CharSequence getTitle() {
        LJIIL();
        return this.LJLJJL.getTitle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIJ();
    }

    @Override // X.AnonymousClass037
    public final void LJII(int i) {
        LJIIL();
        if (i != 2) {
            if (i != 5) {
                if (i != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            this.LJLJJL.LJIIZILJ();
            return;
        }
        this.LJLJJL.LJIIIZ();
    }

    public final void LJIIJJI(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(LLI);
        boolean z2 = false;
        this.LJLIL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.LJLJJLL = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.LJLJL = z2;
        this.LLD = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C02T;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.LJLJJLL != null && !this.LJLJL) {
            if (this.LJLJJI.getVisibility() == 0) {
                i = (int) (this.LJLJJI.getTranslationY() + this.LJLJJI.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.LJLJJLL.setBounds(0, i, getWidth(), this.LJLJJLL.getIntrinsicHeight() + i);
            this.LJLJJLL.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C02T(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (r6 != false) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.LJIIL()
            X.0lI r5 = X.C16800lI.LJIIJ(r7, r8)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r3 = r5.LIZJ()
            int r2 = r5.LJ()
            int r1 = r5.LIZLLL()
            int r0 = r5.LIZIZ()
            r4.<init>(r3, r2, r1, r0)
            X.02R r1 = r7.LJLJJI
            r0 = 0
            boolean r6 = LJIIIZ(r1, r4, r0)
            android.graphics.Rect r0 = r7.LJLLL
            X.C16360ka.LIZIZ(r7, r5, r0)
            android.graphics.Rect r0 = r7.LJLLL
            int r4 = r0.left
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            X.0lF r0 = r5.LIZ
            X.0lI r1 = r0.LJIIL(r4, r3, r2, r1)
            r7.LJLZ = r1
            X.0lI r0 = r7.LJZ
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            X.0lI r0 = r7.LJLZ
            r7.LJZ = r0
            r6 = 1
        L47:
            android.graphics.Rect r1 = r7.LJLLLL
            android.graphics.Rect r0 = r7.LJLLL
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L72
            android.graphics.Rect r1 = r7.LJLLLL
            android.graphics.Rect r0 = r7.LJLLL
            r1.set(r0)
        L58:
            r7.requestLayout()
        L5b:
            X.0lF r0 = r5.LIZ
            X.0lI r0 = r0.LIZ()
            X.0lF r0 = r0.LIZ
            X.0lI r0 = r0.LIZJ()
            X.0lF r0 = r0.LIZ
            X.0lI r0 = r0.LIZIZ()
            android.view.WindowInsets r0 = r0.LJIIIZ()
            return r0
        L72:
            if (r6 == 0) goto L5b
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45161pw.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LJIIJJI(getContext());
        C16340kY.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.LJLL && !this.LJLLI) {
            if (this.LJLLILLLL <= this.LJLJJI.getHeight()) {
                LJIIJ();
                postDelayed(this.LLFFF, 600L);
            } else {
                LJIIJ();
                postDelayed(this.LLFII, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        LJIIL();
        int i2 = this.LJLLJ ^ i;
        this.LJLLJ = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C02S c02s = this.LL;
        if (c02s != null) {
            ((C280718h) c02s).LJIILL = !z2;
            if (z || !z2) {
                C280718h c280718h = (C280718h) c02s;
                if (c280718h.LJIIZILJ) {
                    c280718h.LJIIZILJ = false;
                    c280718h.LJIJJLI(true);
                }
            } else {
                C280718h c280718h2 = (C280718h) c02s;
                if (!c280718h2.LJIIZILJ) {
                    c280718h2.LJIIZILJ = true;
                    c280718h2.LJIJJLI(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.LL != null) {
            C16340kY.LIZJ(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.LJLILLLLZI = i;
        C02S c02s = this.LL;
        if (c02s != null) {
            ((C280718h) c02s).LJIILJJIL = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        LJIIJ();
        this.LJLJJI.setTranslationY(-Math.max(0, Math.min(i, this.LJLJJI.getHeight())));
    }

    public void setActionBarVisibilityCallback(C02S c02s) {
        this.LL = c02s;
        if (getWindowToken() != null) {
            ((C280718h) this.LL).LJIILJJIL = this.LJLILLLLZI;
            int i = this.LJLLJ;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C16340kY.LIZJ(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.LJLJLLL = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.LJLL) {
            this.LJLL = z;
            if (!z) {
                LJIIJ();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        LJIIL();
        this.LJLJJL.setIcon(i);
    }

    public void setLogo(int i) {
        LJIIL();
        this.LJLJJL.LJIJ(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.LJLJLJ = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJL = z2;
    }

    @Override // X.AnonymousClass037
    public void setWindowCallback(Window.Callback callback) {
        LJIIL();
        this.LJLJJL.setWindowCallback(callback);
    }

    @Override // X.AnonymousClass037
    public void setWindowTitle(CharSequence charSequence) {
        LJIIL();
        this.LJLJJL.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C02T(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        LJIIL();
        this.LJLJJL.setIcon(drawable);
    }

    public C45161pw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLL = new Rect();
        this.LJLLLL = new Rect();
        this.LJLLLLLL = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C16800lI c16800lI = C16800lI.LIZIZ;
        this.LJLZ = c16800lI;
        this.LJZ = c16800lI;
        this.LJZI = c16800lI;
        this.LJZL = c16800lI;
        this.LLFF = new IDLAdapterS2S0100000(this, 1);
        this.LLFFF = new IDRunnableS85S0100000(this, 5);
        this.LLFII = new IDRunnableS85S0100000(this, 6);
        LJIIJJI(context);
        this.LLFZ = new C16690l7();
    }

    @Override // X.AnonymousClass037
    public final void LIZLLL(C281318n c281318n, C18M c18m) {
        LJIIL();
        this.LJLJJL.LIZLLL(c281318n, c18m);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        LJIIL();
        measureChildWithMargins(this.LJLJJI, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJI.getLayoutParams();
        int max = Math.max(0, this.LJLJJI.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        int max2 = Math.max(0, this.LJLJJI.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.LJLJJI.getMeasuredState());
        if ((C16300kU.LJI(this) & 256) != 0) {
            z = true;
            measuredHeight = this.LJLIL;
            if (this.LJLJLLL && this.LJLJJI.getTabContainer() != null) {
                measuredHeight += this.LJLIL;
            }
        } else {
            z = false;
            measuredHeight = this.LJLJJI.getVisibility() != 8 ? this.LJLJJI.getMeasuredHeight() : 0;
        }
        this.LJLLLLLL.set(this.LJLLL);
        C16800lI c16800lI = this.LJLZ;
        this.LJZI = c16800lI;
        if (!this.LJLJLJ && !z) {
            Rect rect = this.LJLLLLLL;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.LJZI = c16800lI.LIZ.LJIIL(0, measuredHeight, 0, 0);
        } else {
            C07310Ql LIZIZ = C07310Ql.LIZIZ(c16800lI.LIZJ(), this.LJZI.LJ() + measuredHeight, this.LJZI.LIZLLL(), this.LJZI.LIZIZ());
            C16750lD c16750lD = new C16750lD(this.LJZI);
            c16750lD.LIZ.LJFF(LIZIZ);
            this.LJZI = c16750lD.LIZ();
        }
        LJIIIZ(this.LJLJI, this.LJLLLLLL, true);
        if (!this.LJZL.equals(this.LJZI)) {
            C16800lI c16800lI2 = this.LJZI;
            this.LJZL = c16800lI2;
            h0.LIZIZ(this.LJLJI, c16800lI2);
        }
        measureChildWithMargins(this.LJLJI, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
        int max3 = Math.max(max, this.LJLJI.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin);
        int max4 = Math.max(max2, this.LJLJI.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.LJLJI.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public static boolean LJIIIZ(View view, Rect rect, boolean z) {
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            marginLayoutParams.leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = marginLayoutParams.topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            marginLayoutParams.topMargin = i4;
            z2 = true;
        }
        int i5 = marginLayoutParams.rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            marginLayoutParams.rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = marginLayoutParams.bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                marginLayoutParams.bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C280718h c280718h;
        C25660za c25660za;
        this.LLFZ.LIZ(i, 0);
        this.LJLLILLLL = getActionBarHideOffset();
        LJIIJ();
        C02S c02s = this.LL;
        if (c02s != null && (c25660za = (c280718h = (C280718h) c02s).LJIJJ) != null) {
            c25660za.LIZ();
            c280718h.LJIJJ = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.LJLJJI.getVisibility() != 0) {
            return false;
        }
        return this.LJLL;
    }

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.LJLL || !z) {
            return false;
        }
        this.LLD.fling(0, 0, 0, (int) f2, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
        if (this.LLD.getFinalY() > this.LJLJJI.getHeight()) {
            LJIIJ();
            this.LLFII.run();
        } else {
            LJIIJ();
            this.LLFFF.run();
        }
        this.LJLLI = true;
        return true;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.LJLLILLLL + i2;
        this.LJLLILLLL = i5;
        setActionBarHideOffset(i5);
    }

    @Override // X.C1V0
    public final void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC43251mr
    public final void LJJIJIL(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJJ(view, i, i2, i3, i4, i5);
    }
}
