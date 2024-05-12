package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VVF extends FrameLayout implements C1V0, InterfaceC33971Uz {
    public VVD LJLIL;
    public boolean LJLILLLLZI;
    public final C16690l7 LJLJI;
    public final C16610kz LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final OverScroller LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public VVI LJLLILLLL;
    public VVJ LJLLJ;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIJ(target, "target");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIJ(target, "target");
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        VVD vvd = this.LJLIL;
        if (vvd != VVD.HORIZONTAL_RIGHT || vvd != VVD.HORIZONTAL_LEFT) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                o.LJFF(childAt, "getChildAt(i)");
                i += childAt.getWidth();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LJLJLLL.computeScrollOffset()) {
            scrollTo(this.LJLJLLL.getCurrX(), this.LJLJLLL.getCurrY());
            VVI vvi = this.LJLLILLLL;
            if (vvi != null) {
                vvi.LIZ(this.LJLJLLL.getCurrX(), this.LJLJLLL.getCurrY(), this.LJLJL, this.LJLJLJ);
            }
            this.LJLJL = this.LJLJLLL.getCurrX();
            this.LJLJLJ = this.LJLJLLL.getCurrY();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        VVD vvd = this.LJLIL;
        if (vvd != VVD.VERTICAL_BOTTOM || vvd != VVD.VERTICAL_TOP) {
            return super.computeVerticalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                o.LJFF(childAt, "getChildAt(i)");
                i += childAt.getHeight();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLJI;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLJJI.LIZLLL;
    }

    public final View getMBounceView() {
        return this.LJLLI;
    }

    public final View getMContentView() {
        return this.LJLL;
    }

    public final boolean getMEnableBounce() {
        return this.LJLILLLLZI;
    }

    public final VVD getMScrollDirection() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VVF(Context context) {
        super(context, null, 0);
        o.LJIIJ(context, "context");
        this.LJLIL = VVD.HORIZONTAL_RIGHT;
        this.LJLJI = new C16690l7();
        this.LJLJJI = new C16610kz(this);
        this.LJLJLLL = new OverScroller(context);
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLJJI.LJIIL(1);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        VVD vvd = this.LJLIL;
        if (vvd == VVD.HORIZONTAL_RIGHT || vvd == VVD.HORIZONTAL_LEFT) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        VVD vvd = this.LJLIL;
        if (vvd == VVD.VERTICAL_TOP || vvd == VVD.VERTICAL_BOTTOM) {
            return true;
        }
        return false;
    }

    public final void setMBounceView(View view) {
        View view2 = this.LJLLI;
        if (view2 != null) {
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            removeView(view2);
        }
        if (view != null) {
            addView(view);
        }
        this.LJLLI = view;
    }

    public final void setMContentView(View view) {
        View view2 = this.LJLL;
        if (view2 != null) {
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            removeView(view2);
        }
        if (view != null) {
            addView(view, -1, -1);
        }
        this.LJLL = view;
    }

    public final void setMEnableBounce(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setMScrollDirection(VVD vvd) {
        o.LJIIJ(vvd, "<set-?>");
        this.LJLIL = vvd;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLJJI.LJIIJ(z);
    }

    public final void setOnBounceScrollListener(VVI vvi) {
        this.LJLLILLLL = vvi;
    }

    public final void setOnScrollToEndListener(VVJ vvj) {
        this.LJLLJ = vvj;
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        VVJ vvj;
        VVJ vvj2;
        VVJ vvj3;
        VVJ vvj4;
        o.LJIIJ(target, "target");
        this.LJLJI.LIZIZ(i);
        if (i == 1) {
            return;
        }
        int i2 = VVG.LJFF[this.LJLIL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 || getScrollY() >= 0) {
                        return;
                    }
                    if (Math.abs(getScrollY()) > this.LJLJJL * 0.88d && (vvj4 = this.LJLLJ) != null) {
                        vvj4.LIZ();
                    }
                    LIZ(this, 0, -getScrollY());
                    return;
                }
                if (getScrollY() <= 0) {
                    return;
                }
                if (getScrollY() > this.LJLJJL * 0.88d && (vvj3 = this.LJLLJ) != null) {
                    vvj3.LIZ();
                }
                LIZ(this, 0, -getScrollY());
                return;
            }
            if (getScrollX() >= 0) {
                return;
            }
            if (Math.abs(getScrollX()) > this.LJLJJL * 0.88d && (vvj2 = this.LJLLJ) != null) {
                vvj2.LIZ();
            }
            LIZ(this, -getScrollX(), 0);
            return;
        }
        if (getScrollX() <= 0) {
            return;
        }
        if (getScrollX() > this.LJLJJL * 0.88d && (vvj = this.LJLLJ) != null) {
            vvj.LIZ();
        }
        LIZ(this, -getScrollX(), 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLJJI.LIZIZ(f, f2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        View view = this.LJLLI;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i4 = VVG.LIZ[this.LJLIL.ordinal()];
                if (i4 != 1 && i4 != 2) {
                    if (i4 == 3 || i4 == 4) {
                        measuredHeight = view.getMeasuredWidth() + marginLayoutParams.rightMargin;
                        i3 = marginLayoutParams.leftMargin;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin;
                    i3 = marginLayoutParams.bottomMargin;
                }
                this.LJLJJL = measuredHeight + i3;
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static void LIZ(VVF vvf, int i, int i2) {
        vvf.LJLJLLL.startScroll(vvf.getScrollX(), vvf.getScrollY(), i, i2);
        vvf.invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLJJI.LIZ(f, f2, z);
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIJ(child, "child");
        o.LJIIJ(target, "target");
        this.LJLJI.LIZ(i, i2);
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIJ(child, "child");
        o.LJIIJ(target, "target");
        if (!this.LJLILLLLZI) {
            return false;
        }
        int i3 = VVG.LIZJ[this.LJLIL.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3 || i3 == 4) {
                if (i != 2) {
                    return false;
                }
            } else {
                throw new C162476Zf();
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] iArr, int i3) {
        o.LJIIJ(target, "target");
        if (i3 != 0) {
            return;
        }
        int i4 = VVG.LIZLLL[this.LJLIL.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    if (!target.canScrollVertically(-1) && i2 < 0) {
                        int abs = Math.abs(getScrollY()) + Math.abs(i2);
                        int i5 = this.LJLJJL;
                        if (abs > i5) {
                            VVI vvi = this.LJLLILLLL;
                            if (vvi != null) {
                                vvi.LIZ(0, -i5, 0, getScrollY());
                            }
                            scrollTo(getScrollX(), -this.LJLJJL);
                        } else {
                            requestDisallowInterceptTouchEvent(true);
                            VVI vvi2 = this.LJLLILLLL;
                            if (vvi2 != null) {
                                vvi2.LIZ(0, getScrollY() + i2, 0, getScrollY());
                            }
                            scrollBy(0, i2);
                        }
                        iArr[1] = i2;
                        this.LJLJLJ = getScrollY();
                        return;
                    }
                    if (i2 <= 0 || getScrollY() >= 0) {
                        return;
                    }
                    if (i2 > Math.abs(getScrollY())) {
                        VVI vvi3 = this.LJLLILLLL;
                        if (vvi3 != null) {
                            vvi3.LIZ(0, 0, 0, -getScrollY());
                        }
                        scrollBy(0, -getScrollY());
                    } else {
                        VVI vvi4 = this.LJLLILLLL;
                        if (vvi4 != null) {
                            vvi4.LIZ(0, getScrollY() + i2, 0, getScrollY());
                        }
                        scrollBy(0, i2);
                    }
                    iArr[1] = i2;
                    this.LJLJLJ = getScrollY();
                    return;
                }
                if (!target.canScrollVertically(1) && i2 > 0) {
                    int scrollY = getScrollY() + i2;
                    int i6 = this.LJLJJL;
                    if (scrollY > i6) {
                        VVI vvi5 = this.LJLLILLLL;
                        if (vvi5 != null) {
                            vvi5.LIZ(0, i6, 0, getScrollY());
                        }
                        scrollTo(getScrollX(), this.LJLJJL);
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                        VVI vvi6 = this.LJLLILLLL;
                        if (vvi6 != null) {
                            vvi6.LIZ(0, getScrollY() + i2, 0, getScrollY());
                        }
                        scrollBy(0, i2);
                    }
                    iArr[1] = i2;
                    this.LJLJLJ = getScrollY();
                    return;
                }
                if (i2 >= 0 || getScrollY() <= 0) {
                    return;
                }
                if (Math.abs(i2) > getScrollY()) {
                    VVI vvi7 = this.LJLLILLLL;
                    if (vvi7 != null) {
                        vvi7.LIZ(0, 0, 0, getScrollY());
                    }
                    scrollBy(0, -getScrollY());
                } else {
                    VVI vvi8 = this.LJLLILLLL;
                    if (vvi8 != null) {
                        vvi8.LIZ(0, getScrollY() + i2, 0, getScrollY());
                    }
                    scrollBy(0, i2);
                }
                iArr[1] = i2;
                this.LJLJLJ = getScrollY();
                return;
            }
            if (!target.canScrollHorizontally(-1) && i < 0) {
                int abs2 = Math.abs(getScrollX()) + Math.abs(i);
                int i7 = this.LJLJJL;
                if (abs2 > i7) {
                    VVI vvi9 = this.LJLLILLLL;
                    if (vvi9 != null) {
                        vvi9.LIZ(-i7, 0, getScrollX(), 0);
                    }
                    scrollTo(-this.LJLJJL, getScrollY());
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    VVI vvi10 = this.LJLLILLLL;
                    if (vvi10 != null) {
                        vvi10.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                    }
                    scrollBy(i, 0);
                }
                iArr[0] = i;
                this.LJLJL = getScrollX();
                return;
            }
            if (i <= 0 || getScrollX() >= 0) {
                return;
            }
            if (i > Math.abs(getScrollX())) {
                VVI vvi11 = this.LJLLILLLL;
                if (vvi11 != null) {
                    vvi11.LIZ(0, 0, -getScrollX(), 0);
                }
                scrollBy(-getScrollX(), 0);
            } else {
                VVI vvi12 = this.LJLLILLLL;
                if (vvi12 != null) {
                    vvi12.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                }
                scrollBy(i, 0);
            }
            iArr[0] = i;
            this.LJLJL = getScrollX();
            return;
        }
        if (!target.canScrollHorizontally(1) && i > 0) {
            int scrollX = getScrollX() + i;
            int i8 = this.LJLJJL;
            if (scrollX > i8) {
                VVI vvi13 = this.LJLLILLLL;
                if (vvi13 != null) {
                    vvi13.LIZ(i8, 0, getScrollX(), 0);
                }
                scrollTo(this.LJLJJL, getScrollY());
            } else {
                requestDisallowInterceptTouchEvent(true);
                VVI vvi14 = this.LJLLILLLL;
                if (vvi14 != null) {
                    vvi14.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                }
                scrollBy(i, 0);
            }
            iArr[0] = i;
            this.LJLJL = getScrollX();
            return;
        }
        if (i >= 0 || getScrollX() <= 0) {
            return;
        }
        if (Math.abs(i) > getScrollX()) {
            VVI vvi15 = this.LJLLILLLL;
            if (vvi15 != null) {
                vvi15.LIZ(0, 0, getScrollX(), 0);
            }
            scrollBy(-getScrollX(), 0);
        } else {
            VVI vvi16 = this.LJLLILLLL;
            if (vvi16 != null) {
                vvi16.LIZ(getScrollX() + i, 0, getScrollX(), 0);
            }
            scrollBy(i, 0);
        }
        iArr[0] = i;
        this.LJLJL = getScrollX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredHeight;
        try {
            super.onLayout(z, getLeft(), getTop(), getRight(), getBottom());
            View view = this.LJLLI;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i6 = VVG.LIZIZ[this.LJLIL.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    i5 = 0;
                                    measuredHeight = 0;
                                } else {
                                    i5 = -(view.getMeasuredWidth() + marginLayoutParams.rightMargin);
                                    measuredHeight = marginLayoutParams.topMargin;
                                }
                            } else {
                                i5 = getMeasuredWidth() + marginLayoutParams.leftMargin;
                                measuredHeight = marginLayoutParams.topMargin;
                            }
                        } else {
                            i5 = marginLayoutParams.leftMargin;
                            measuredHeight = -(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
                        }
                    } else {
                        i5 = marginLayoutParams.leftMargin;
                        measuredHeight = marginLayoutParams.topMargin + getMeasuredHeight();
                    }
                    view.layout(i5, measuredHeight, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + measuredHeight);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception during layout: ");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, "BounceLayout", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIJ(target, "target");
        if (i5 != 1) {
            return;
        }
        int i6 = VVG.LJ[this.LJLIL.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return;
                    }
                    if (this.LJLJJLL && getScrollY() == this.LJLJJL) {
                        LIZ(this, 0, -getScrollY());
                        this.LJLJJLL = false;
                        return;
                    } else {
                        if (i2 <= 0 || i4 <= 0) {
                            return;
                        }
                        LIZ(this, 0, -this.LJLJJL);
                        this.LJLJJLL = true;
                        return;
                    }
                }
                if (this.LJLJJLL && getScrollY() == this.LJLJJL) {
                    LIZ(this, 0, -getScrollY());
                    this.LJLJJLL = false;
                    return;
                } else {
                    if (i2 <= 0 || i4 <= 0) {
                        return;
                    }
                    LIZ(this, 0, this.LJLJJL);
                    this.LJLJJLL = true;
                    return;
                }
            }
            if (this.LJLJJLL && Math.abs(getScrollX()) == this.LJLJJL) {
                LIZ(this, -getScrollX(), 0);
                this.LJLJJLL = false;
                return;
            } else {
                if (i >= 0 || i3 >= 0) {
                    return;
                }
                LIZ(this, -this.LJLJJL, 0);
                this.LJLJJLL = true;
                return;
            }
        }
        if (this.LJLJJLL && Math.abs(getScrollX()) == this.LJLJJL) {
            LIZ(this, -getScrollX(), 0);
            this.LJLJJLL = false;
        } else {
            if (i <= 0 || i3 <= 0) {
                return;
            }
            LIZ(this, this.LJLJJL, 0);
            this.LJLJJLL = true;
        }
    }
}
