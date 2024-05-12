package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.Voy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80896Voy extends FrameLayout implements C1V0, InterfaceC33971Uz {
    public final C16690l7 LJLIL;
    public final C16610kz LJLILLLLZI;
    public final int[] LJLJI;
    public boolean LJLJJI;
    public InterfaceC80914VpG LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public VelocityTracker LJLLLL;
    public boolean LJLLLLLL;
    public InterfaceC80923VpP LJLZ;
    public EnumC80902Vp4 LJZ;
    public C8BJ LJZI;
    public float LJZL;
    public final C80910VpC LL;
    public float LLD;
    public float LLF;
    public final C00Q LLFF;
    public float LLFFF;
    public final C39661h4 LLFII;
    public boolean LLFZ;
    public final C62822Ol8 LLI;
    public boolean LLIFFJFJJ;
    public InterfaceC74170T9a LLII;
    public InterfaceC80922VpO LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C80896Voy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    private final ValueAnimator getManuallyRefreshAnimator() {
        return (ValueAnimator) this.LLI.getValue();
    }

    public final void LIZ() {
        C39661h4 c39661h4 = this.LLFII;
        if (c39661h4.LJFF) {
            c39661h4.LIZLLL();
        }
        if (this.LLFZ && getManuallyRefreshAnimator().isRunning()) {
            getManuallyRefreshAnimator().cancel();
        }
    }

    public final void LIZLLL() {
        InterfaceC80914VpG interfaceC80914VpG = this.LJLJJL;
        if (interfaceC80914VpG != null) {
            int actualHeight = interfaceC80914VpG.getActualHeight();
            setRefreshing(true);
            this.LLFZ = true;
            InterfaceC80914VpG interfaceC80914VpG2 = this.LJLJJL;
            if (interfaceC80914VpG2 != null) {
                interfaceC80914VpG2.LIZ(true);
            }
            InterfaceC80914VpG interfaceC80914VpG3 = this.LJLJJL;
            if (interfaceC80914VpG3 != null) {
                interfaceC80914VpG3.LJJJJJL(false);
            }
            LIZ();
            getManuallyRefreshAnimator().setIntValues(actualHeight, 0);
            getManuallyRefreshAnimator().start();
        }
    }

    public final int getHeaderHeight() {
        InterfaceC80914VpG interfaceC80914VpG = this.LJLJJL;
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
            int i = 0;
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
            while (true) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof InterfaceC80914VpG) && childAt != null) {
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

    public final boolean LIZJ() {
        if (getScrollY() == 0 && this.LLIIIZ && getHeaderHeight() > 0) {
            return true;
        }
        return false;
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLLL = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJLLLL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        LIZ();
    }

    public final int getHoverBottomHeight() {
        return this.LLIIIJ;
    }

    public final float getMaxOverScrollDistance() {
        return this.LLD;
    }

    public final InterfaceC80914VpG getNestedHeader() {
        return this.LJLJJL;
    }

    @Override // android.view.View
    public final EnumC80902Vp4 getOverScrollMode() {
        return this.LJZ;
    }

    public final float getRubberBandCoefficient() {
        return this.LLF;
    }

    public final C8BJ getScrollMode() {
        return this.LJZI;
    }

    public final float getSpringStiffness() {
        return this.LLFFF;
    }

    public final void LJ(float f) {
        boolean z;
        EnumC80902Vp4 enumC80902Vp4 = this.LJZ;
        if (enumC80902Vp4 != EnumC80902Vp4.ALWAYS && enumC80902Vp4 != EnumC80902Vp4.ONLY_TOP) {
            return;
        }
        if (this.LLIIJI || this.LLIIIL) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(-1, z, Float.valueOf(f));
    }

    public final void LJFF(int i) {
        int i2;
        InterfaceC80914VpG interfaceC80914VpG;
        InterfaceC80914VpG interfaceC80914VpG2;
        boolean z = true;
        if (Math.abs(i) <= 1) {
            return;
        }
        this.LJLJL = this.LL.LIZIZ(getNestedScrollY()) + i;
        int headerHeight = getHeaderHeight();
        C80910VpC c80910VpC = this.LL;
        int i3 = this.LJLJL;
        int nestedScrollY = getNestedScrollY() + i;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        scrollTo(0, c80910VpC.LIZ(i3, nestedScrollY, i2) + headerHeight);
        this.LJLJL = this.LL.LIZIZ(getNestedScrollY());
        if (getNestedScrollY() >= 0) {
            if (this.LJLJJLL && (interfaceC80914VpG2 = this.LJLJJL) != null) {
                interfaceC80914VpG2.LJJJJJL(true);
            }
            z = false;
        } else if (!this.LJLJJLL && (interfaceC80914VpG = this.LJLJJL) != null) {
            interfaceC80914VpG.LJJJJJL(false);
        }
        this.LJLJJLL = z;
        InterfaceC80914VpG interfaceC80914VpG3 = this.LJLJJL;
        if (interfaceC80914VpG3 != null) {
            interfaceC80914VpG3.LIZIZ(getNestedScrollY(), false);
        }
        InterfaceC80923VpP interfaceC80923VpP = this.LJLZ;
        if (interfaceC80923VpP != null) {
            interfaceC80923VpP.LIZ(getNestedScrollY(), this.LJLJL, false);
        }
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLILLLLZI.LJIIL(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r0 != 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0164, code lost:
    
        if ((getNestedScrollY() + r4) <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017b, code lost:
    
        if (r1 != 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        if ((getNestedScrollY() + r4) >= 0) goto L44;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80896Voy.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        boolean z = false;
        int i = 0;
        r2 = false;
        r2 = false;
        boolean z2 = false;
        z = false;
        z = false;
        if (this.LJLLL) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 0) {
            int i2 = -1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLL) {
                                if (ev.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LJLL = ev.getPointerId(i);
                                this.LJLJLLL = O6R.LJJIIZ(ev.getY(i));
                                this.LJLJLJ = O6R.LJJIIZ(ev.getX(i));
                            }
                        } else {
                            this.LJLL = ev.getPointerId(ev.getActionIndex());
                            this.LJLJLLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                            this.LJLJLJ = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        }
                    } else {
                        this.LJLLJ = false;
                        this.LJLJLLL = 0;
                        this.LJLJLJ = 0;
                        if (getNestedScrollY() != 0) {
                            if (getNestedScrollY() >= 0) {
                                i2 = 1;
                            }
                            LIZIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    View nestedChild = getNestedChild();
                    if (nestedChild != null) {
                        int findPointerIndex = ev.findPointerIndex(this.LJLL);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                        int i3 = this.LJLJLLL - LJJIIZ;
                        this.LJLJLLL = LJJIIZ;
                        int LJJIIZ2 = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        int i4 = this.LJLJLJ - LJJIIZ2;
                        this.LJLJLJ = LJJIIZ2;
                        if (Math.abs(i3) > 10.0f && Math.abs(i3) > Math.abs(i4)) {
                            if (LIZJ()) {
                                this.LJLLJ = true;
                            } else if (i3 > 0) {
                                int i5 = C80905Vp7.LIZ[this.LJZ.ordinal()];
                                if ((i5 == 1 || i5 == 2) && !nestedChild.canScrollVertically(1) && getNestedScrollY() + i3 > 0) {
                                    z2 = true;
                                }
                                this.LJLLJ = z2;
                            } else if (i3 < 0) {
                                int i6 = C80905Vp7.LIZ[this.LJZ.ordinal()];
                                if ((i6 == 1 || i6 == 3) && !nestedChild.canScrollVertically(-1) && getNestedScrollY() + i3 < 0) {
                                    z = true;
                                }
                                this.LJLLJ = z;
                            }
                        }
                    }
                }
            } else {
                this.LJLLJ = false;
                this.LJLJLLL = 0;
                this.LJLJLJ = 0;
                if (getNestedScrollY() != 0) {
                    if (getNestedScrollY() >= 0) {
                        i2 = 1;
                    }
                    LIZIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            if (getNestedScrollY() == 0) {
                z3 = false;
            }
            this.LJLLJ = z3;
            if (LIZJ()) {
                this.LJLLJ = false;
            }
            this.LJLL = ev.getPointerId(0);
            this.LJLJLLL = O6R.LJJIIZ(ev.getY());
            this.LJLJLJ = O6R.LJJIIZ(ev.getX());
        }
        return this.LJLLJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        o.LJIIIZ(child, "child");
        LJIILJJIL(0, child);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLLL) {
            return super.onTouchEvent(ev);
        }
        int actionMasked = ev.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            int i2 = -1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLL) {
                                if (ev.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LJLL = ev.getPointerId(i);
                                this.LJLJLLL = O6R.LJJIIZ(ev.getY(i));
                                this.LJLJLJ = O6R.LJJIIZ(ev.getX(i));
                            }
                        } else {
                            this.LJLL = ev.getPointerId(ev.getActionIndex());
                            this.LJLJLLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                            this.LJLJLJ = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        }
                    } else {
                        this.LJLLJ = false;
                        this.LJLJLLL = 0;
                        this.LJLJLJ = 0;
                        if (getNestedScrollY() != 0) {
                            if (getNestedScrollY() >= 0) {
                                i2 = 1;
                            }
                            LIZIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    int findPointerIndex = ev.findPointerIndex(this.LJLL);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                    int i3 = this.LJLJLLL - LJJIIZ;
                    this.LJLJLLL = LJJIIZ;
                    LJFF(i3);
                }
            } else {
                this.LJLLJ = false;
                this.LJLJLLL = 0;
                this.LJLJLJ = 0;
                if (getNestedScrollY() != 0) {
                    if (getNestedScrollY() >= 0) {
                        i2 = 1;
                    }
                    LIZIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            this.LJLL = ev.getPointerId(0);
            this.LJLJLLL = O6R.LJJIIZ(ev.getY());
            this.LJLJLJ = O6R.LJJIIZ(ev.getX());
            LIZ();
        }
        return this.LJLLJ;
    }

    public final void setHoverAtBottom(boolean z) {
        if (this.LLIIIILZ == z) {
            return;
        }
        this.LLIIIILZ = z;
        int i = 1;
        if (z) {
            if (!this.LLIIIL) {
                this.LLIIIL = true;
                InterfaceC80922VpO interfaceC80922VpO = this.LLIIII;
                if (interfaceC80922VpO != null) {
                    interfaceC80922VpO.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLIIIL) {
            return;
        }
        this.LLIIIL = false;
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZIZ(i, this.LLIIIILZ, Float.valueOf(0.0f));
    }

    public final void setHoverBottomHeight(int i) {
        this.LLIIIJ = i;
    }

    public final void setMaxOverScrollDistance(float f) {
        if (f >= 1.0f) {
            this.LLD = f;
            this.LL.LIZ = f;
            C39661h4 c39661h4 = this.LLFII;
            if (c39661h4 != null) {
                c39661h4.LJI = (f - 1) + getHeaderHeight();
            }
            C39661h4 c39661h42 = this.LLFII;
            if (c39661h42 != null) {
                c39661h42.LJII = (-this.LLD) + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setNestedHeader(InterfaceC80914VpG interfaceC80914VpG) {
        int i;
        int i2;
        this.LJLJJL = interfaceC80914VpG;
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
        if (this.LLFII.LJFF) {
            LIZ();
            scrollTo(0, 0);
        }
        if (!(interfaceC80914VpG instanceof View)) {
            this.LJLJJL = null;
            setRefreshing(false);
            this.LLIIJI = false;
            scrollTo(0, 0);
            return;
        }
        Object obj = this.LJLJJL;
        o.LJII(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        InterfaceC80914VpG interfaceC80914VpG2 = this.LJLJJL;
        if (interfaceC80914VpG2 != null) {
            i = interfaceC80914VpG2.getActualHeight();
        } else {
            i = 0;
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, i));
        this.LLFII.LJI = (this.LLD - 1) + interfaceC80914VpG.getActualHeight();
        InterfaceC80914VpG interfaceC80914VpG3 = this.LJLJJL;
        if (interfaceC80914VpG3 != null) {
            i2 = interfaceC80914VpG3.getActualHeight();
        } else {
            i2 = 0;
        }
        scrollTo(0, i2);
        InterfaceC80914VpG interfaceC80914VpG4 = this.LJLJJL;
        if (interfaceC80914VpG4 != null) {
            interfaceC80914VpG4.LIZ(this.LLIIIZ);
        }
    }

    public final void setNestedScrollEnabledWhenNonTouch(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setOnHoverBottomListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIII = new C80913VpF(listener);
    }

    public final void setOnRefreshListener(InterfaceC65784Pro<C76800UCe> refreshListener) {
        o.LJIIIZ(refreshListener, "refreshListener");
        this.LLII = new C74094T6c(refreshListener);
    }

    public final void setOnScrollChangeListener(InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Boolean, C76800UCe> scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJLZ = new M2W(scrollListener);
    }

    public final void setOverScrollMode(EnumC80902Vp4 enumC80902Vp4) {
        o.LJIIIZ(enumC80902Vp4, "<set-?>");
        this.LJZ = enumC80902Vp4;
    }

    public final void setRefreshing(boolean z) {
        if (this.LLIIIZ == z) {
            return;
        }
        this.LLIIIZ = z;
        int i = 1;
        if (z) {
            if (!this.LLIIJI) {
                this.LLIIJI = true;
                InterfaceC74170T9a interfaceC74170T9a = this.LLII;
                if (interfaceC74170T9a != null) {
                    interfaceC74170T9a.LJ();
                }
                InterfaceC80914VpG interfaceC80914VpG = this.LJLJJL;
                if (interfaceC80914VpG != null) {
                    interfaceC80914VpG.LIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLIIJI) {
            return;
        }
        this.LLIIJI = false;
        InterfaceC80914VpG interfaceC80914VpG2 = this.LJLJJL;
        if (interfaceC80914VpG2 != null) {
            interfaceC80914VpG2.LIZ(false);
        }
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZIZ(i, this.LLIIIZ, Float.valueOf(0.0f));
    }

    public final void setRubberBandCoefficient(float f) {
        this.LLF = f;
        this.LL.LIZIZ = f;
    }

    public final void setScrollMode(C8BJ c8bj) {
        o.LJIIIZ(c8bj, "<set-?>");
        this.LJZI = c8bj;
    }

    public final void setSpringStiffness(float f) {
        this.LLFFF = f;
        this.LLFF.LIZIZ(f);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLILLLLZI.LJIIJJI(i, 0);
    }

    public final void setOnHoverBottomListener(InterfaceC80922VpO listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIII = listener;
    }

    public final void setOnRefreshListener(InterfaceC74170T9a refreshListener) {
        o.LJIIIZ(refreshListener, "refreshListener");
        this.LLII = refreshListener;
    }

    public final void setOnScrollChangeListener(InterfaceC80923VpP scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJLZ = scrollListener;
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        int i2;
        o.LJIIIZ(target, "target");
        this.LJLIL.LIZIZ(i);
        if (i == 0 && getNestedScrollY() != 0) {
            if (getNestedScrollY() < 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            LIZIZ(i2, true, Float.valueOf(0.0f));
        }
        LJIIIIZZ(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLILLLLZI.LIZIZ(f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80896Voy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJI = new int[2];
        EnumC80902Vp4 enumC80902Vp4 = EnumC80902Vp4.ALWAYS;
        this.LJZ = enumC80902Vp4;
        C8BJ c8bj = C8BJ.NONE;
        this.LJZI = c8bj;
        this.LL = new C80910VpC();
        this.LLD = 2000.0f;
        this.LLF = 0.55f;
        C00Q c00q = new C00Q();
        c00q.LIZ(1.0f);
        c00q.LJIIIIZZ = 0.0f;
        this.LLFF = c00q;
        this.LLFFF = 100.0f;
        C39661h4 c39661h4 = new C39661h4(this, C17T.LJIJJLI);
        c39661h4.LJIL = c00q;
        c00q.LIZIZ(this.LLFFF);
        float f = this.LLD;
        float f2 = 1;
        c39661h4.LJII = (-f) + f2;
        c39661h4.LJI = (f - f2) + getHeaderHeight();
        c39661h4.LIZJ(new C80898Vp0(this));
        c39661h4.LIZIZ(new C80906Vp8(this));
        this.LLFII = c39661h4;
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 63));
        this.LLIFFJFJJ = true;
        this.LLIIIJ = -1;
        if (getChildCount() <= 1) {
            this.LJLIL = new C16690l7();
            this.LJLILLLLZI = new C16610kz(this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqz, R.attr.bss, R.attr.bt_}, i, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…gLayout, defStyleAttr, 0)");
            this.LJZI = obtainStyledAttributes.getInt(2, 0) == 1 ? C8BJ.REFRESH : c8bj;
            int i2 = obtainStyledAttributes.getInt(1, 3);
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        enumC80902Vp4 = EnumC80902Vp4.ONLY_BOTTOM;
                    }
                } else {
                    enumC80902Vp4 = EnumC80902Vp4.ONLY_TOP;
                }
            } else {
                enumC80902Vp4 = EnumC80902Vp4.NONE;
            }
            this.LJZ = enumC80902Vp4;
            this.LJLLLLLL = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    public final void LIZIZ(int i, boolean z, Float f) {
        float f2;
        LIZ();
        if (i != 0) {
            VelocityTracker velocityTracker = this.LJLLLL;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.LJZL);
            }
            if (f != null) {
                f2 = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.LJLLLL;
                if (velocityTracker2 != null) {
                    f2 = velocityTracker2.getYVelocity(this.LJLL);
                } else {
                    f2 = 0.0f;
                }
                if (i >= 0 ? f2 < 0.0f : f2 > 0.0f) {
                    f2 = -f2;
                }
            }
            C39661h4 c39661h4 = this.LLFII;
            if (i < 0 && this.LJZI == C8BJ.REFRESH && z && ((getNestedScrollY() < (-getHeaderHeight()) || this.LLIIJI) && !this.LJLJJI)) {
                c39661h4.LJIL.LJIIIIZZ = 0.0f;
                if (!this.LLIIJI) {
                    setRefreshing(true);
                }
                this.LJLJJI = true;
            } else {
                int nestedScrollY = getNestedScrollY();
                int i2 = this.LLIIIJ;
                if (1 <= i2 && i2 <= nestedScrollY && z) {
                    c39661h4.LJIL.LJIIIIZZ = i2;
                    if (!this.LLIIIL) {
                        setHoverAtBottom(true);
                    }
                } else {
                    c39661h4.LJIL.LJIIIIZZ = getHeaderHeight();
                }
            }
            c39661h4.LIZ = f2 / 2.0f;
            getScrollY();
            c39661h4.LJIIIZ();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLILLLLZI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        this.LJZL = f2;
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

    public /* synthetic */ C80896Voy(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        this.LJLIL.LIZ(i, i2);
        this.LJLILLLLZI.LJIIJJI(2, i2);
        if (!this.LJLLLLLL) {
            this.LJLLL = true;
        }
        if (i2 == 0) {
            LIZ();
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        boolean z;
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        getNestedScrollY();
        if (this.LLIFFJFJJ || i2 != 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 0 || !z) {
            return false;
        }
        return true;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
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
            boolean r0 = r2.LJLLL
            if (r0 == 0) goto L12
            boolean r0 = r2.LJLLLLLL
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            int r0 = r2.getNestedScrollY()
            if (r0 == 0) goto L51
            int r0 = r2.getNestedScrollY()
            if (r0 >= 0) goto L55
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 < 0) goto L2b
            int r0 = r2.getNestedScrollY()
        L2a:
            int r5 = -r0
        L2b:
            int r0 = r2.getNestedScrollY()
            r1 = 1
            if (r0 <= 0) goto L38
            boolean r0 = r3.canScrollVertically(r1)
            if (r0 != 0) goto L45
        L38:
            int r0 = r2.getNestedScrollY()
            if (r0 >= 0) goto L4a
            r0 = -1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L4a
        L45:
            int r0 = r2.getNestedScrollY()
            int r5 = -r0
        L4a:
            r6[r1] = r5
            if (r7 != 0) goto L51
            r2.LJFF(r5)
        L51:
            r2.getNestedScrollY()
            goto L12
        L55:
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 > 0) goto L2b
            int r0 = r2.getNestedScrollY()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80896Voy.LJJIIJ(android.view.View, int, int, int[], int):void");
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLILLLLZI.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int headerHeight = getHeaderHeight();
        Object obj = this.LJLJJL;
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
        LJJIJIL(target, i, i2, i3, i4, 0, this.LJLJI);
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(target, "target");
        LJJIJIL(target, i, i2, i3, i4, i5, this.LJLJI);
    }

    public final void LJJIJIL(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        int i6;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (!this.LJLLL || this.LJLLLLLL || i4 == 0 || getNestedScrollY() != 0) {
            return;
        }
        if (i4 >= 0 ? this.LJZ != EnumC80902Vp4.ONLY_BOTTOM : this.LJZ != EnumC80902Vp4.ONLY_TOP) {
            if (this.LJZ != EnumC80902Vp4.ALWAYS) {
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
        if (!this.LLIIJI && !this.LLIIIL) {
            z = false;
        }
        LIZIZ(i6, z, null);
    }
}
