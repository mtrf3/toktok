package X;

import Y.ARunnableS2S0111000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vox, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80895Vox extends FrameLayout implements C1V0, InterfaceC33971Uz {
    public RecyclerView LJLIL;
    public final C16690l7 LJLILLLLZI;
    public final C16610kz LJLJI;
    public final int[] LJLJJI;
    public boolean LJLJJL;
    public InterfaceC80914VpG LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public VelocityTracker LJLLLLLL;
    public final boolean LJLZ;
    public InterfaceC80921VpN LJZ;
    public boolean LJZI;
    public EnumC80901Vp3 LJZL;
    public CT4 LL;
    public float LLD;
    public final C80910VpC LLF;
    public float LLFF;
    public float LLFFF;
    public final C00Q LLFII;
    public float LLFZ;
    public final C39661h4 LLI;
    public InterfaceC80920VpM LLIFFJFJJ;
    public InterfaceC80919VpL LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    public final void LIZ() {
        C39661h4 c39661h4 = this.LLI;
        if (c39661h4.LJFF) {
            c39661h4.LIZLLL();
        }
    }

    public final int getHeaderHeight() {
        InterfaceC80914VpG interfaceC80914VpG = this.LJLJJLL;
        if (interfaceC80914VpG != null) {
            return interfaceC80914VpG.getActualHeight();
        }
        return 0;
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() <= 2) {
            if (getChildCount() == 2) {
                if (getChildAt(0) instanceof InterfaceC80914VpG) {
                    if (getChildAt(1) instanceof InterfaceC80914VpG) {
                        throw new IllegalArgumentException("Header view must as first child");
                    }
                } else {
                    throw new IllegalArgumentException("Spring layout just have one child view");
                }
            }
            int childCount = getChildCount();
            if (childCount < 0) {
                return null;
            }
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof InterfaceC80914VpG) && childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        int childCount2 = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            if (viewGroup.getChildAt(i2) instanceof RecyclerView) {
                                View childAt2 = viewGroup.getChildAt(i2);
                                o.LJII(childAt2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                                this.LJLIL = (RecyclerView) childAt2;
                            }
                        }
                    }
                    return childAt;
                }
                if (i == childCount) {
                    return null;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("Spring layout just have one child view");
        }
    }

    public final boolean LIZLLL() {
        if (getScrollY() == 0 && this.LLIIIL && getHeaderHeight() > 0) {
            return true;
        }
        return false;
    }

    public final void LJ() {
        int i;
        if (getNestedScrollY() != 0) {
            if (getNestedScrollY() < 0) {
                i = -1;
            } else {
                i = 1;
            }
            LIZJ(this, i, true, Float.valueOf(0.0f), 8);
        }
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        scrollTo(0, getHeaderHeight());
        this.LJLLLLLL = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJLLLLLL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        LIZ();
        this.LJLLLLLL = null;
    }

    public final boolean getContentScrollWhenRefreshDone() {
        return this.LJZI;
    }

    public final int getHoverBottomHeight() {
        return this.LLIIIILZ;
    }

    public final float getMaxOverScrollDistance() {
        return this.LLFF;
    }

    public final InterfaceC80914VpG getNestedHeader() {
        return this.LJLJJLL;
    }

    @Override // android.view.View
    public final EnumC80901Vp3 getOverScrollMode() {
        return this.LJZL;
    }

    public final float getRubberBandCoefficient() {
        return this.LLFFF;
    }

    public final CT4 getScrollMode() {
        return this.LL;
    }

    public final float getSpringStiffness() {
        return this.LLFZ;
    }

    public final void LJFF(int i) {
        int i2;
        InterfaceC80914VpG interfaceC80914VpG;
        InterfaceC80914VpG interfaceC80914VpG2;
        boolean z = true;
        if (Math.abs(i) <= 1) {
            return;
        }
        this.LJLJLJ = this.LLF.LIZIZ(getNestedScrollY()) + i;
        int headerHeight = getHeaderHeight();
        C80910VpC c80910VpC = this.LLF;
        int i3 = this.LJLJLJ;
        int nestedScrollY = getNestedScrollY() + i;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        scrollTo(0, c80910VpC.LIZ(i3, nestedScrollY, i2) + headerHeight);
        if (getNestedScrollY() < 0 && this.LL == CT4.REFRESH) {
            LJI(true, false);
        }
        this.LJLJLJ = this.LLF.LIZIZ(getNestedScrollY());
        if (getNestedScrollY() >= 0) {
            if (this.LJLJL && (interfaceC80914VpG2 = this.LJLJJLL) != null) {
                interfaceC80914VpG2.LJJJJJL(true);
            }
            z = false;
        } else if (!this.LJLJL && (interfaceC80914VpG = this.LJLJJLL) != null) {
            interfaceC80914VpG.LJJJJJL(false);
        }
        this.LJLJL = z;
        InterfaceC80914VpG interfaceC80914VpG3 = this.LJLJJLL;
        if (interfaceC80914VpG3 != null) {
            interfaceC80914VpG3.LIZIZ(getNestedScrollY(), false);
        }
        InterfaceC80921VpN interfaceC80921VpN = this.LJZ;
        if (interfaceC80921VpN != null) {
            interfaceC80921VpN.LIZ(getNestedScrollY(), this.LJLJLJ, false);
        }
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLJI.LJIIL(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        if (r2.canScrollVertically(1) == true) goto L62;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80895Vox.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean z;
        boolean z2;
        int i;
        o.LJIIIZ(ev, "ev");
        try {
            z = false;
            i = 0;
            z2 = false;
            z2 = false;
            z2 = false;
            z = false;
            z = false;
        } catch (Exception unused) {
        }
        if (this.LJLLLL) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 0) {
            if (getNestedScrollY() == 0) {
                z3 = false;
            }
            this.LJLLL = z3;
            if (LIZLLL()) {
                this.LJLLL = false;
            }
            this.LJLLI = ev.getPointerId(0);
            this.LJLL = O6R.LJJIIZ(ev.getY());
            this.LJLJLLL = O6R.LJJIIZ(ev.getX());
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLLI) {
                            if (ev.getActionIndex() == 0) {
                                i = 1;
                            }
                            this.LJLLI = ev.getPointerId(i);
                            this.LJLL = O6R.LJJIIZ(ev.getY(i));
                            this.LJLJLLL = O6R.LJJIIZ(ev.getX(i));
                        }
                    } else {
                        this.LJLLI = ev.getPointerId(ev.getActionIndex());
                        this.LJLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                        this.LJLJLLL = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                    }
                } else {
                    this.LJLLL = false;
                    this.LJLL = 0;
                    this.LJLJLLL = 0;
                    LJ();
                }
            } else {
                View nestedChild = getNestedChild();
                if (nestedChild != null) {
                    int findPointerIndex = ev.findPointerIndex(this.LJLLI);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                    int i2 = this.LJLL - LJJIIZ;
                    this.LJLL = LJJIIZ;
                    int LJJIIZ2 = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                    int i3 = this.LJLJLLL - LJJIIZ2;
                    this.LJLJLLL = LJJIIZ2;
                    if (Math.abs(i2) > Math.abs(i3)) {
                        if (LIZLLL()) {
                            this.LJLLL = true;
                        } else if (i2 > 0) {
                            int i4 = C80904Vp6.LIZ[this.LJZL.ordinal()];
                            if ((i4 == 1 || i4 == 2) && !nestedChild.canScrollVertically(1) && getNestedScrollY() + i2 > 0) {
                                z2 = true;
                            }
                            this.LJLLL = z2;
                        } else if (i2 < 0) {
                            int i5 = C80904Vp6.LIZ[this.LJZL.ordinal()];
                            if ((i5 == 1 || i5 == 3) && !nestedChild.canScrollVertically(-1) && getNestedScrollY() + i2 < 0) {
                                z = true;
                            }
                            this.LJLLL = z;
                        }
                    }
                }
            }
        } else {
            this.LJLLL = false;
            this.LJLL = 0;
            this.LJLJLLL = 0;
            LJ();
        }
        return this.LJLLL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        o.LJIIIZ(child, "child");
        LJIILJJIL(0, child);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLLLL) {
            return super.onTouchEvent(ev);
        }
        int actionMasked = ev.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            this.LJLLI = ev.getPointerId(0);
            this.LJLL = O6R.LJJIIZ(ev.getY());
            this.LJLJLLL = O6R.LJJIIZ(ev.getX());
            LIZ();
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLLI) {
                            if (ev.getActionIndex() == 0) {
                                i = 1;
                            }
                            this.LJLLI = ev.getPointerId(i);
                            this.LJLL = O6R.LJJIIZ(ev.getY(i));
                            this.LJLJLLL = O6R.LJJIIZ(ev.getX(i));
                        }
                    } else {
                        this.LJLLI = ev.getPointerId(ev.getActionIndex());
                        this.LJLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                        this.LJLJLLL = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                    }
                } else {
                    this.LJLLL = false;
                    this.LJLL = 0;
                    this.LJLJLLL = 0;
                    LJ();
                }
            } else {
                int findPointerIndex = ev.findPointerIndex(this.LJLLI);
                if (findPointerIndex < 0) {
                    return false;
                }
                int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                int i2 = this.LJLL - LJJIIZ;
                this.LJLL = LJJIIZ;
                LJFF(i2);
            }
        } else {
            this.LJLLL = false;
            this.LJLL = 0;
            this.LJLJLLL = 0;
            LJ();
        }
        return this.LJLLL;
    }

    public final void setContentScrollWhenRefreshDone(boolean z) {
        this.LJZI = z;
    }

    public final void setHoverAtBottom(boolean z) {
        if (this.LLIIII == z) {
            return;
        }
        this.LLIIII = z;
        int i = 1;
        if (z) {
            if (!this.LLIIIJ) {
                this.LLIIIJ = true;
                InterfaceC80919VpL interfaceC80919VpL = this.LLII;
                if (interfaceC80919VpL != null) {
                    interfaceC80919VpL.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLIIIJ) {
            return;
        }
        this.LLIIIJ = false;
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZJ(this, i, this.LLIIII, Float.valueOf(0.0f), 8);
    }

    public final void setHoverBottomHeight(int i) {
        this.LLIIIILZ = i;
    }

    public final void setMaxOverScrollDistance(float f) {
        if (f >= 1.0f) {
            this.LLFF = f;
            this.LLF.LIZ = f;
            C39661h4 c39661h4 = this.LLI;
            if (c39661h4 != null) {
                c39661h4.LJI = (f - 1) + getHeaderHeight();
            }
            C39661h4 c39661h42 = this.LLI;
            if (c39661h42 != null) {
                c39661h42.LJII = (-this.LLFF) + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setNestedHeader(InterfaceC80914VpG interfaceC80914VpG) {
        int i;
        int i2;
        this.LJLJJLL = interfaceC80914VpG;
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                if (!(getChildAt(i3) instanceof InterfaceC80914VpG)) {
                    if (i3 == childCount) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(getChildAt(i3))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused) {
                    }
                    removeViewAt(i3);
                }
            }
        }
        if (this.LLI.LJFF) {
            LIZ();
            scrollTo(0, 0);
        }
        if (!(interfaceC80914VpG instanceof View)) {
            this.LJLJJLL = null;
            LJI(false, false);
            this.LLIIIZ = false;
            scrollTo(0, 0);
            return;
        }
        Object obj = this.LJLJJLL;
        o.LJII(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        InterfaceC80914VpG interfaceC80914VpG2 = this.LJLJJLL;
        if (interfaceC80914VpG2 != null) {
            i = interfaceC80914VpG2.getActualHeight();
        } else {
            i = 0;
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, i));
        this.LLI.LJI = (this.LLFF - 1) + interfaceC80914VpG.getActualHeight();
        InterfaceC80914VpG interfaceC80914VpG3 = this.LJLJJLL;
        if (interfaceC80914VpG3 != null) {
            i2 = interfaceC80914VpG3.getActualHeight();
        } else {
            i2 = 0;
        }
        scrollTo(0, i2);
        InterfaceC80914VpG interfaceC80914VpG4 = this.LJLJJLL;
        if (interfaceC80914VpG4 != null) {
            interfaceC80914VpG4.LIZ(this.LLIIIL);
        }
    }

    public final void setOnHoverBottomListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLII = new C80911VpD(listener);
    }

    public final void setOnRefreshListener(InterfaceC65784Pro<C76800UCe> refreshListener) {
        o.LJIIIZ(refreshListener, "refreshListener");
        this.LLIFFJFJJ = new C80912VpE(refreshListener);
    }

    public final void setOnScrollChangeListener(InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Boolean, C76800UCe> scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJZ = new C79872VWi(scrollListener);
    }

    public final void setOverScrollMode(EnumC80901Vp3 enumC80901Vp3) {
        o.LJIIIZ(enumC80901Vp3, "<set-?>");
        this.LJZL = enumC80901Vp3;
    }

    public final void setRefreshing(boolean z) {
        LJI(z, false);
    }

    public final void setRubberBandCoefficient(float f) {
        this.LLFFF = f;
        this.LLF.LIZIZ = f;
    }

    public final void setScrollMode(CT4 ct4) {
        o.LJIIIZ(ct4, "<set-?>");
        this.LL = ct4;
    }

    public final void setSpringStiffness(float f) {
        this.LLFZ = f;
        this.LLFII.LIZIZ(f);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLJI.LJIIJJI(i, 0);
    }

    public final void setOnHoverBottomListener(InterfaceC80919VpL listener) {
        o.LJIIIZ(listener, "listener");
        this.LLII = listener;
    }

    public final void setOnRefreshListener(InterfaceC80920VpM refreshListener) {
        o.LJIIIZ(refreshListener, "refreshListener");
        this.LLIFFJFJJ = refreshListener;
    }

    public final void setOnScrollChangeListener(InterfaceC80921VpN scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJZ = scrollListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80895Vox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = new int[2];
        EnumC80901Vp3 enumC80901Vp3 = EnumC80901Vp3.ALWAYS;
        this.LJZL = enumC80901Vp3;
        CT4 ct4 = CT4.NONE;
        this.LL = ct4;
        this.LLF = new C80910VpC();
        this.LLFF = 2000.0f;
        this.LLFFF = 0.55f;
        C00Q c00q = new C00Q();
        c00q.LIZ(1.0f);
        c00q.LJIIIIZZ = 0.0f;
        this.LLFII = c00q;
        this.LLFZ = 100.0f;
        C39661h4 c39661h4 = new C39661h4(this, C17T.LJIJJLI);
        c39661h4.LJIL = c00q;
        c00q.LIZIZ(this.LLFZ);
        float f = this.LLFF;
        float f2 = 1;
        c39661h4.LJII = (-f) + f2;
        c39661h4.LJI = (f - f2) + getHeaderHeight();
        c39661h4.LIZJ(new C80899Vp1(this));
        c39661h4.LIZIZ(new C80909VpB(this));
        this.LLI = c39661h4;
        this.LLIIIILZ = -1;
        if (getChildCount() <= 1) {
            this.LJLILLLLZI = new C16690l7();
            this.LJLJI = new C16610kz(this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.axo, R.attr.axp, R.attr.axq}, 0, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…gLayout, defStyleAttr, 0)");
            this.LL = obtainStyledAttributes.getInt(2, 0) == 1 ? CT4.REFRESH : ct4;
            int i = obtainStyledAttributes.getInt(1, 3);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        enumC80901Vp3 = EnumC80901Vp3.ONLY_BOTTOM;
                    }
                } else {
                    enumC80901Vp3 = EnumC80901Vp3.ONLY_TOP;
                }
            } else {
                enumC80901Vp3 = EnumC80901Vp3.NONE;
            }
            this.LJZL = enumC80901Vp3;
            this.LJLZ = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    public final void LJI(boolean z, boolean z2) {
        if (this.LLIIIL == z) {
            return;
        }
        this.LLIIIL = z;
        int i = 1;
        if (z) {
            if (!this.LLIIIZ) {
                this.LLIIIZ = true;
                InterfaceC80920VpM interfaceC80920VpM = this.LLIFFJFJJ;
                if (interfaceC80920VpM != null) {
                    interfaceC80920VpM.LJ();
                }
                InterfaceC80914VpG interfaceC80914VpG = this.LJLJJLL;
                if (interfaceC80914VpG != null) {
                    interfaceC80914VpG.LIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLIIIZ) {
            return;
        }
        this.LLIIIZ = false;
        InterfaceC80914VpG interfaceC80914VpG2 = this.LJLJJLL;
        if (interfaceC80914VpG2 != null) {
            interfaceC80914VpG2.LIZ(false);
        }
        LIZ();
        if (this.LJZI && z2) {
            RecyclerView recyclerView = this.LJLIL;
            if (recyclerView == null) {
                return;
            }
            recyclerView.post(new ARunnableS2S0111000_14(this, 0));
            return;
        }
        if (this.LJLLL) {
            return;
        }
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZJ(this, i, z, Float.valueOf(0.0f), 8);
    }

    public final boolean LJIIIZ(int i, int i2) {
        View nestedChild = getNestedChild();
        if (nestedChild == null) {
            return false;
        }
        if (LIZLLL() && Math.abs(i2) > Math.abs(i)) {
            return true;
        }
        float f = i2;
        if (f > 0.0f) {
            int i3 = C80904Vp6.LIZ[this.LJZL.ordinal()];
            if ((i3 != 1 && i3 != 2) || nestedChild.canScrollVertically(1) || getNestedScrollY() + i2 <= 0) {
                return false;
            }
            return true;
        }
        if (f >= -0.0f) {
            return false;
        }
        int i4 = C80904Vp6.LIZ[this.LJZL.ordinal()];
        if ((i4 != 1 && i4 != 3) || nestedChild.canScrollVertically(-1) || getNestedScrollY() + i2 >= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        o.LJIIIZ(target, "target");
        this.LJLILLLLZI.LIZIZ(i);
        this.LJLLLL = false;
        if (i == 0) {
            LJ();
        }
        LJIIIIZZ(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLJI.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLJI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        this.LLD = f2;
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        LJIILL(child, target, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        return LJJLIIJ(child, target, i, 0);
    }

    public final void LIZIZ(int i, boolean z, Float f, boolean z2) {
        float f2;
        LIZ();
        if (i != 0) {
            VelocityTracker velocityTracker = this.LJLLLLLL;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.LLD);
            }
            if (f != null) {
                f2 = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.LJLLLLLL;
                if (velocityTracker2 != null) {
                    f2 = velocityTracker2.getYVelocity(this.LJLLI);
                } else {
                    f2 = 0.0f;
                }
                if (i >= 0 ? f2 < 0.0f : f2 > 0.0f) {
                    f2 = -f2;
                }
            }
            C39661h4 c39661h4 = this.LLI;
            if (i < 0 && this.LL == CT4.REFRESH && z && ((getNestedScrollY() < (-getHeaderHeight()) || this.LLIIIZ) && !this.LJLJJL)) {
                c39661h4.LJIL.LIZIZ(this.LLFZ);
                c39661h4.LJIL.LJIIIIZZ = 0.0f;
                if (!this.LLIIIZ) {
                    LJI(true, false);
                }
                this.LJLJJL = true;
            } else {
                int nestedScrollY = getNestedScrollY();
                int i2 = this.LLIIIILZ;
                if (1 <= i2 && i2 <= nestedScrollY && z) {
                    c39661h4.LJIL.LIZIZ(this.LLFZ);
                    c39661h4.LJIL.LJIIIIZZ = this.LLIIIILZ;
                    if (!this.LLIIIJ) {
                        setHoverAtBottom(true);
                    }
                } else if (!z2) {
                    c39661h4.LJIL.LJIIIIZZ = getHeaderHeight();
                    c39661h4.LJIL.LIZIZ(10000.0f);
                } else {
                    c39661h4.LJIL.LIZIZ(this.LLFZ);
                    c39661h4.LJIL.LJIIIIZZ = 0.0f;
                    LJI(true, false);
                }
            }
            c39661h4.LIZ = f2 / 2.0f;
            getScrollY();
            c39661h4.LJIIIZ();
        }
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        this.LJLILLLLZI.LIZ(i, i2);
        this.LJLJI.LJIIJJI(2, i2);
        if (!this.LJLZ) {
            this.LJLLLL = true;
        }
        if (i2 == 0 && this.LJLLLL) {
            LIZ();
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        getNestedScrollY();
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        LJJIIJ(target, i, i2, consumed, 0);
    }

    public static /* synthetic */ void LIZJ(C80895Vox c80895Vox, int i, boolean z, Float f, int i2) {
        if ((i2 & 4) != 0) {
            f = null;
        }
        c80895Vox.LIZIZ(i, z, f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // X.C1V0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(android.view.View r3, int r4, int r5, int[] r6, int r7) {
        /*
            r2 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "consumed"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = r2.LJLLLL
            if (r0 == 0) goto L12
            boolean r0 = r2.LJLZ
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            int r0 = r2.getNestedScrollY()
            if (r0 == 0) goto L44
            int r0 = r2.getNestedScrollY()
            if (r0 >= 0) goto L48
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 < 0) goto L2b
            int r0 = r2.getNestedScrollY()
        L2a:
            int r5 = -r0
        L2b:
            int r0 = r2.getNestedScrollY()
            r1 = 1
            if (r0 <= 0) goto L3d
            boolean r0 = r3.canScrollVertically(r1)
            if (r0 == 0) goto L3d
            int r0 = r2.getNestedScrollY()
            int r5 = -r0
        L3d:
            r6[r1] = r5
            if (r7 != 0) goto L44
            r2.LJFF(r5)
        L44:
            r2.getNestedScrollY()
            goto L12
        L48:
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 > 0) goto L2b
            int r0 = r2.getNestedScrollY()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80895Vox.LJJIIJ(android.view.View, int, int, int[], int):void");
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLJI.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int headerHeight = getHeaderHeight();
        Object obj = this.LJLJJLL;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), headerHeight);
        }
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            C17M.LIZIZ(nestedChild, headerHeight, 0, headerHeight, nestedChild.getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        LJJIJIL(target, i, i2, i3, i4, 0, this.LJLJJI);
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(target, "target");
        LJJIJIL(target, i, i2, i3, i4, i5, this.LJLJJI);
    }

    public final void LJJIJIL(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        int i6;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (!this.LJLLLL || this.LJLZ || i4 == 0 || getNestedScrollY() != 0) {
            return;
        }
        if (i4 >= 0 ? this.LJZL != EnumC80901Vp3.ONLY_BOTTOM : this.LJZL != EnumC80901Vp3.ONLY_TOP) {
            if (this.LJZL != EnumC80901Vp3.ALWAYS) {
                return;
            }
        }
        if (i5 == 0) {
            LJFF(i4);
            return;
        }
        boolean z = true;
        if (i5 != 1 || i2 == 0) {
            return;
        }
        if (i4 < 0) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        if (!this.LLIIIZ && !this.LLIIIJ) {
            z = false;
        }
        LIZJ(this, i6, z, null, 12);
    }
}
