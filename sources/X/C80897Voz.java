package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Voz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80897Voz extends FrameLayout implements C1V0, InterfaceC33971Uz {
    public final C16690l7 LJLIL;
    public final C16610kz LJLILLLLZI;
    public final int[] LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public VelocityTracker LJLLILLLL;
    public InterfaceC80918VpK LJLLJ;
    public EnumC80901Vp3 LJLLL;
    public float LJLLLL;
    public final C80910VpC LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public final C00Q LJZI;
    public float LJZL;
    public final C39661h4 LL;

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() <= 2) {
            int childCount = getChildCount();
            if (childCount < 0) {
                return null;
            }
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                if (childAt != null) {
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

    public final int getNestedScrollX() {
        return getScrollX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLILLLL = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            VelocityTracker velocityTracker = this.LJLLILLLL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LL.LIZLLL();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final float getMaxOverScrollDistance() {
        return this.LJLZ;
    }

    @Override // android.view.View
    public final EnumC80901Vp3 getOverScrollMode() {
        return this.LJLLL;
    }

    public final float getRubberBandCoefficient() {
        return this.LJZ;
    }

    public final float getSpringStiffness() {
        return this.LJZL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80897Voz(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJI = new int[2];
        this.LJLLL = EnumC80901Vp3.ALWAYS;
        this.LJLLLLLL = new C80910VpC();
        this.LJLZ = 2000.0f;
        this.LJZ = 0.55f;
        C00Q c00q = new C00Q();
        c00q.LIZ(1.0f);
        c00q.LJIIIIZZ = 0.0f;
        this.LJZI = c00q;
        this.LJZL = 100.0f;
        C39661h4 c39661h4 = new C39661h4(this, C17T.LJIJJ);
        c39661h4.LJIL = c00q;
        c00q.LIZIZ(this.LJZL);
        float f = this.LJLZ;
        float f2 = 1;
        c39661h4.LJII = (-f) + f2;
        c39661h4.LJI = f - f2;
        c39661h4.LIZJ(new C80907Vp9(this));
        c39661h4.LIZIZ(new C80908VpA(this));
        this.LL = c39661h4;
        if (getChildCount() <= 1) {
            this.LJLIL = new C16690l7();
            this.LJLILLLLZI = new C16610kz(this);
            return;
        }
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    public final void LIZIZ(int i) {
        int i2 = 1;
        if (Math.abs(i) <= 1) {
            return;
        }
        int LIZIZ = this.LJLLLLLL.LIZIZ(getNestedScrollX()) + i;
        this.LJLJJI = LIZIZ;
        C80910VpC c80910VpC = this.LJLLLLLL;
        int nestedScrollX = getNestedScrollX() + i;
        if (i <= 0) {
            i2 = -1;
        }
        scrollTo(c80910VpC.LIZ(LIZIZ, nestedScrollX, i2), 0);
        this.LJLJJI = this.LJLLLLLL.LIZIZ(getNestedScrollX());
        InterfaceC80918VpK interfaceC80918VpK = this.LJLLJ;
        if (interfaceC80918VpK != null) {
            interfaceC80918VpK.LIZ(getNestedScrollX(), this.LJLJJI, false);
        }
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLILLLLZI.LJIIL(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        if (r0 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        if ((getNestedScrollX() + r4) <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017a, code lost:
    
        if (r1 != 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if ((getNestedScrollX() + r4) >= 0) goto L42;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80897Voz.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
        if (this.LJLLI) {
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
                            if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLJL) {
                                if (ev.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LJLJL = ev.getPointerId(i);
                                this.LJLJJLL = O6R.LJJIIZ(ev.getY(i));
                                this.LJLJJL = O6R.LJJIIZ(ev.getX(i));
                            }
                        } else {
                            this.LJLJL = ev.getPointerId(ev.getActionIndex());
                            this.LJLJJLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                            this.LJLJJL = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        }
                    } else {
                        this.LJLL = false;
                        this.LJLJJLL = 0;
                        this.LJLJJL = 0;
                        if (getNestedScrollX() != 0) {
                            if (getNestedScrollX() >= 0) {
                                i2 = 1;
                            }
                            LIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    View nestedChild = getNestedChild();
                    if (nestedChild != null) {
                        int findPointerIndex = ev.findPointerIndex(this.LJLJL);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                        int i3 = this.LJLJJLL - LJJIIZ;
                        this.LJLJJLL = LJJIIZ;
                        int LJJIIZ2 = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        int i4 = this.LJLJJL - LJJIIZ2;
                        this.LJLJJL = LJJIIZ2;
                        if (Math.abs(i4) > 10.0f && Math.abs(i4) > Math.abs(i3)) {
                            if (i4 > 0) {
                                int i5 = C80903Vp5.LIZ[this.LJLLL.ordinal()];
                                if ((i5 == 1 || i5 == 2) && !nestedChild.canScrollHorizontally(1) && getNestedScrollX() + i4 > 0) {
                                    z2 = true;
                                }
                                this.LJLL = z2;
                            } else if (i4 < 0) {
                                int i6 = C80903Vp5.LIZ[this.LJLLL.ordinal()];
                                if ((i6 == 1 || i6 == 3) && !nestedChild.canScrollHorizontally(-1) && getNestedScrollX() + i4 < 0) {
                                    z = true;
                                }
                                this.LJLL = z;
                            }
                        }
                    }
                }
            } else {
                this.LJLL = false;
                this.LJLJJLL = 0;
                this.LJLJJL = 0;
                if (getNestedScrollX() != 0) {
                    if (getNestedScrollX() >= 0) {
                        i2 = 1;
                    }
                    LIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            if (getNestedScrollX() == 0) {
                z3 = false;
            }
            this.LJLL = z3;
            this.LJLJL = ev.getPointerId(0);
            this.LJLJJLL = O6R.LJJIIZ(ev.getY());
            this.LJLJJL = O6R.LJJIIZ(ev.getX());
        }
        return this.LJLL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        o.LJIIIZ(child, "child");
        LJIILJJIL(0, child);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLLI) {
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
                            if (actionMasked == 6 && ev.getPointerId(ev.getActionIndex()) == this.LJLJL) {
                                if (ev.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LJLJL = ev.getPointerId(i);
                                this.LJLJJLL = O6R.LJJIIZ(ev.getY(i));
                                this.LJLJJL = O6R.LJJIIZ(ev.getX(i));
                            }
                        } else {
                            this.LJLJL = ev.getPointerId(ev.getActionIndex());
                            this.LJLJJLL = O6R.LJJIIZ(ev.getY(ev.getActionIndex()));
                            this.LJLJJL = O6R.LJJIIZ(ev.getX(ev.getActionIndex()));
                        }
                    } else {
                        this.LJLL = false;
                        this.LJLJJLL = 0;
                        this.LJLJJL = 0;
                        if (getNestedScrollX() != 0) {
                            if (getNestedScrollX() >= 0) {
                                i2 = 1;
                            }
                            LIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    int findPointerIndex = ev.findPointerIndex(this.LJLJL);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int LJJIIZ = O6R.LJJIIZ(ev.getY(findPointerIndex));
                    int LJJIIZ2 = O6R.LJJIIZ(ev.getX(findPointerIndex));
                    int i3 = this.LJLJJL - LJJIIZ2;
                    this.LJLJJLL = LJJIIZ;
                    this.LJLJJL = LJJIIZ2;
                    LIZIZ(i3);
                }
            } else {
                this.LJLL = false;
                this.LJLJJLL = 0;
                this.LJLJJL = 0;
                if (getNestedScrollX() != 0) {
                    if (getNestedScrollX() >= 0) {
                        i2 = 1;
                    }
                    LIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            this.LJLJL = ev.getPointerId(0);
            this.LJLJJLL = O6R.LJJIIZ(ev.getY());
            this.LJLJJL = O6R.LJJIIZ(ev.getX());
            C39661h4 c39661h4 = this.LL;
            if (c39661h4.LJFF) {
                c39661h4.LIZLLL();
            }
        }
        return this.LJLL;
    }

    public final void setMaxOverScrollDistance(float f) {
        if (f >= 1.0f) {
            this.LJLZ = f;
            this.LJLLLLLL.LIZ = f;
            C39661h4 c39661h4 = this.LL;
            float f2 = 1;
            c39661h4.LJI = f - f2;
            c39661h4.LJII = (-f) + f2;
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setOnScrollChangeListener(InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Boolean, C76800UCe> scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJLLJ = new C80900Vp2(scrollListener);
    }

    public final void setOverScrollMode(EnumC80901Vp3 enumC80901Vp3) {
        o.LJIIIZ(enumC80901Vp3, "<set-?>");
        this.LJLLL = enumC80901Vp3;
    }

    public final void setRubberBandCoefficient(float f) {
        this.LJZ = f;
        this.LJLLLLLL.LIZIZ = f;
    }

    public final void setSpringStiffness(float f) {
        this.LJZL = f;
        this.LJZI.LIZIZ(f);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLILLLLZI.LJIIJJI(i, 0);
    }

    public final void setOnScrollChangeListener(InterfaceC80918VpK scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJLLJ = scrollListener;
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        int i2;
        o.LJIIIZ(target, "target");
        this.LJLIL.LIZIZ(i);
        this.LJLLI = false;
        if (i == 0 && getNestedScrollX() != 0) {
            if (getNestedScrollX() < 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            LIZ(i2, true, Float.valueOf(0.0f));
        }
        LJIIIIZZ(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLILLLLZI.LIZIZ(f, f2);
    }

    public final void LIZ(int i, boolean z, Float f) {
        float f2;
        C39661h4 c39661h4 = this.LL;
        if (c39661h4.LJFF) {
            c39661h4.LIZLLL();
        }
        if (i != 0) {
            VelocityTracker velocityTracker = this.LJLLILLLL;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.LJLLLL);
            }
            if (f != null) {
                f2 = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.LJLLILLLL;
                if (velocityTracker2 != null) {
                    f2 = velocityTracker2.getYVelocity(this.LJLJL);
                } else {
                    f2 = 0.0f;
                }
                if (i >= 0 ? f2 < 0.0f : f2 > 0.0f) {
                    f2 = -f2;
                }
            }
            C39661h4 c39661h42 = this.LL;
            c39661h42.LIZ = f2 / 2.0f;
            getScrollX();
            c39661h42.LJIIIZ();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLILLLLZI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        this.LJLLLL = f;
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

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        this.LJLIL.LIZ(i, i2);
        this.LJLILLLLZI.LJIIJJI(1, i2);
        this.LJLLI = true;
        if (i2 == 0) {
            C39661h4 c39661h4 = this.LL;
            if (c39661h4.LJFF) {
                c39661h4.LIZLLL();
            }
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        getNestedScrollX();
        if ((i & 1) != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // X.C1V0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(android.view.View r2, int r3, int r4, int[] r5, int r6) {
        /*
            r1 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "consumed"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = r1.LJLLI
            if (r0 == 0) goto L31
            int r0 = r1.getNestedScrollX()
            if (r0 == 0) goto L2e
            int r0 = r1.getNestedScrollX()
            if (r0 >= 0) goto L32
            int r0 = r1.getNestedScrollX()
            int r0 = r0 + r3
            if (r0 < 0) goto L26
            int r0 = r1.getNestedScrollX()
        L25:
            int r3 = -r0
        L26:
            r0 = 0
            r5[r0] = r3
            if (r6 != 0) goto L2e
            r1.LIZIZ(r3)
        L2e:
            r1.getNestedScrollX()
        L31:
            return
        L32:
            int r0 = r1.getNestedScrollX()
            int r0 = r0 + r3
            if (r0 > 0) goto L26
            int r0 = r1.getNestedScrollX()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80897Voz.LJJIIJ(android.view.View, int, int, int[], int):void");
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLILLLLZI.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            nestedChild.layout(0, 0, nestedChild.getMeasuredWidth(), nestedChild.getMeasuredHeight());
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

    public final void LJJIJIL(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.LJLLI && i3 != 0 && getNestedScrollX() == 0) {
            if (i3 >= 0 ? this.LJLLL != EnumC80901Vp3.ONLY_RIGHT : this.LJLLL != EnumC80901Vp3.ONLY_LEFT) {
                if (this.LJLLL != EnumC80901Vp3.ALWAYS) {
                    return;
                }
            }
            if (i5 == 0) {
                LIZIZ(i3);
                return;
            }
            int i6 = 1;
            if (i5 != 1 || i == 0) {
                return;
            }
            if (i3 < 0) {
                i6 = -1;
            }
            LIZ(i6, false, null);
        }
    }
}
