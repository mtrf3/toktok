package X;

import Y.AUListenerS96S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.KPr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51671KPr extends ViewGroup {
    public static final int LJLZ;
    public static final int LJZ;
    public static final long LJZI;
    public static final int LJZL;
    public static final float LL;
    public static final int LLD;
    public static final int LLF;
    public final boolean LJLIL;
    public final C42505GmD LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public InterfaceC51672KPs LJLLLLLL;

    public final void LIZJ() {
        this.LJLL = false;
        this.LJLLI = false;
        getVelocityTracker().clear();
    }

    static {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
        LJLZ = LJJIIZ;
        int LIZIZ = C7MY.LIZIZ(4);
        LJZ = LIZIZ;
        LJZI = 300L;
        LJZL = C7MY.LIZIZ(25);
        LL = 0.6f;
        LLD = C7MY.LIZIZ(52);
        LLF = LJJIIZ + LIZIZ;
    }

    private final VelocityTracker getVelocityTracker() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-velocityTracker>(...)");
        return (VelocityTracker) value;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
        } else {
            throw new IllegalStateException();
        }
    }

    public final InterfaceC51672KPs getDrawerListener() {
        return this.LJLLLLLL;
    }

    private final void setDrawerOpenRatio(float f) {
        this.LJLLLL = f;
        InterfaceC51672KPs interfaceC51672KPs = this.LJLLLLLL;
        if (interfaceC51672KPs != null) {
            interfaceC51672KPs.LIZIZ(f);
        }
    }

    public final void LIZIZ(int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLLL, i);
        ofInt.setInterpolator(C55953Lxd.LIZLLL());
        ValueAnimator duration = ofInt.setDuration(LJZI);
        duration.addUpdateListener(new AUListenerS96S0100000_8(this, 0));
        duration.start();
    }

    public final void LIZLLL(float f) {
        float f2;
        if (this.LJLIL) {
            f2 = f - this.LJLJLJ;
        } else {
            f2 = this.LJLJLJ - f;
        }
        this.LJLJLJ = f;
        int i = this.LJLLL;
        int i2 = ((int) f2) + i;
        int i3 = LJLZ;
        if (i2 >= i3) {
            i2 = i3;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        if (i2 == i) {
            return;
        }
        setDrawerWidth(i2);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LJLLJ) {
            return false;
        }
        if (this.LJLIL) {
            if (i < 0) {
                if (this.LJLLL == 0) {
                    return true;
                }
            } else if (i > 0 && this.LJLLL == LJLZ) {
                return true;
            }
        } else if (i > 0) {
            if (this.LJLLL == 0) {
                return true;
            }
        } else if (i < 0 && this.LJLLL == LJLZ) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        float f;
        o.LJIIIZ(ev, "ev");
        if (!this.LJLLJ) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked != 0) {
                if (this.LJLL) {
                    return true;
                }
                if (this.LJLLI) {
                    return false;
                }
            }
            int actionMasked2 = ev.getActionMasked();
            if (actionMasked2 != 0) {
                if (actionMasked2 == 2) {
                    float x = ev.getX() - this.LJLJLJ;
                    float y = ev.getY() - this.LJLJL;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    int i = this.LJLLL;
                    int i2 = LJLZ;
                    if (i == i2 || x == 0.0f || !LIZ(this, false, (int) x, (int) ev.getX(), (int) ev.getY())) {
                        int i3 = this.LJLJI;
                        float f2 = i3;
                        if (abs > f2 && abs * 0.5f > abs2) {
                            if (this.LJLLL == i2 && ((x < 0.0f && !this.LJLIL) || (x > 0.0f && this.LJLIL))) {
                                this.LJLLI = true;
                                return false;
                            }
                            this.LJLL = true;
                            if (x > 0.0f) {
                                f = this.LJLJJLL + i3;
                            } else {
                                f = this.LJLJJLL - i3;
                            }
                            this.LJLJLJ = f;
                            this.LJLJLLL = getY();
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        } else if (abs2 > f2) {
                            this.LJLLI = true;
                        }
                        if (this.LJLL) {
                            LIZLLL(ev.getX());
                        }
                    } else {
                        this.LJLLI = true;
                        this.LJLJLJ = ev.getX();
                        this.LJLJLLL = ev.getY();
                        return false;
                    }
                }
            } else {
                this.LJLJJLL = ev.getX();
                this.LJLJLJ = ev.getX();
                this.LJLJL = ev.getY();
                this.LJLJLLL = ev.getY();
                this.LJLLI = false;
                LIZJ();
            }
            getVelocityTracker().addMovement(ev);
            return this.LJLL;
        }
        LIZJ();
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        float f;
        o.LJIIIZ(event, "event");
        if (!this.LJLLJ) {
            return false;
        }
        if (event.getActionMasked() == 0 && event.getEdgeFlags() != 0) {
            return false;
        }
        getVelocityTracker().addMovement(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.LJLL) {
                        LIZJ();
                        LJ(getX() - this.LJLJJLL, getVelocityTracker().getXVelocity());
                        getVelocityTracker().clear();
                    }
                } else {
                    if (!this.LJLL) {
                        float x = event.getX() - this.LJLJLJ;
                        float y = event.getY() - this.LJLJLLL;
                        float abs = Math.abs(x);
                        float abs2 = Math.abs(y);
                        int i = this.LJLJI;
                        if (abs > i && abs > abs2) {
                            this.LJLL = true;
                            if (x > 0.0f) {
                                f = this.LJLJJLL + i;
                            } else {
                                f = this.LJLJJLL - i;
                            }
                            this.LJLJLJ = f;
                            this.LJLJLLL = getY();
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                    if (this.LJLL) {
                        LIZLLL(event.getX());
                    }
                }
            } else if (this.LJLL) {
                LIZJ();
                getVelocityTracker().computeCurrentVelocity(1000, this.LJLJJL);
                LJ(getX() - this.LJLJJLL, getVelocityTracker().getXVelocity());
                getVelocityTracker().clear();
            }
        } else {
            this.LJLJJLL = event.getX();
            this.LJLJLJ = event.getX();
            this.LJLJL = event.getY();
            this.LJLJLLL = event.getY();
        }
        return true;
    }

    public final void setDrawerListener(InterfaceC51672KPs interfaceC51672KPs) {
        this.LJLLLLLL = interfaceC51672KPs;
    }

    public final void setDrawerWidth(int i) {
        if (i < 0 || this.LJLLL == i) {
            return;
        }
        this.LJLLL = i;
        View childAt = getChildAt(0);
        int i2 = LJLZ;
        if (i == i2) {
            childAt.setOutlineProvider(this.LJLILLLLZI);
            childAt.setClipToOutline(true);
        } else {
            childAt.setOutlineProvider(null);
            childAt.setClipToOutline(false);
        }
        setDrawerOpenRatio(this.LJLLL / i2);
        requestLayout();
    }

    public final void setEnable(boolean z) {
        this.LJLLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51671KPr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C90193gN.LIZ();
        this.LJLILLLLZI = new C42505GmD();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLJI = viewConfiguration.getScaledTouchSlop();
        this.LJLJJI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJJL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LJLLILLLL = C221108m2.LIZIZ(C51673KPt.LJLIL);
    }

    public final void LJ(float f, float f2) {
        if (Math.abs(f) > LJZL && Math.abs(f2) > this.LJLJJI) {
            if ((f2 > 0.0f && !this.LJLIL) || (this.LJLIL && f2 < 0.0f)) {
                LIZIZ(0);
                InterfaceC51672KPs interfaceC51672KPs = this.LJLLLLLL;
                if (interfaceC51672KPs != null) {
                    interfaceC51672KPs.LIZJ();
                    return;
                }
                return;
            }
            LIZIZ(LJLZ);
            InterfaceC51672KPs interfaceC51672KPs2 = this.LJLLLLLL;
            if (interfaceC51672KPs2 == null) {
                return;
            }
            interfaceC51672KPs2.LIZ();
            return;
        }
        int i = this.LJLLL;
        int i2 = LJLZ;
        if (i > i2 / 2) {
            LIZIZ(i2);
            InterfaceC51672KPs interfaceC51672KPs3 = this.LJLLLLLL;
            if (interfaceC51672KPs3 == null) {
                return;
            }
            interfaceC51672KPs3.LIZ();
            return;
        }
        LIZIZ(0);
        InterfaceC51672KPs interfaceC51672KPs4 = this.LJLLLLLL;
        if (interfaceC51672KPs4 == null) {
            return;
        }
        interfaceC51672KPs4.LIZJ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = size - LJLZ;
        int i4 = LJZ;
        View childAt = getChildAt(0);
        int i5 = (size - this.LJLLL) - ((int) (i4 * this.LJLLLL));
        childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, mode), View.MeasureSpec.makeMeasureSpec((int) ((i5 / getMeasuredWidth()) * getMeasuredHeight()), mode2));
        getChildAt(1).measure(i, View.MeasureSpec.makeMeasureSpec((int) ((i3 - i4) / (size / size2)), mode2));
        setMeasuredDimension(size, size2);
    }

    public final boolean LIZ(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i;
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && LIZ(childAt, true, i6, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (!this.LJLIL) {
                i6 = -i6;
            }
            if (view.canScrollHorizontally(i6)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = (getMeasuredHeight() - ((int) ((getMeasuredHeight() / getMeasuredWidth()) * (getMeasuredWidth() - LLF)))) - LLD;
        int measuredHeight2 = getMeasuredHeight();
        float f = measuredHeight;
        float f2 = this.LJLLLL * f;
        float f3 = LL;
        int i5 = measuredHeight2 - ((int) (f2 * f3));
        int measuredHeight3 = getMeasuredHeight() - ((int) (f * f3));
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        if (this.LJLIL) {
            childAt.layout(this.LJLLL, i5 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth() + this.LJLLL, i5);
            childAt2.layout(this.LJLLL - childAt2.getMeasuredWidth(), measuredHeight3 - childAt2.getMeasuredHeight(), this.LJLLL, measuredHeight3);
            return;
        }
        int i6 = (int) (LJZ * this.LJLLLL);
        childAt.layout(i6, i5 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth() + i6, i5);
        int width = getWidth() - this.LJLLL;
        childAt2.layout(width, measuredHeight3 - childAt2.getMeasuredHeight(), childAt2.getMeasuredWidth() + width, measuredHeight3);
    }
}
