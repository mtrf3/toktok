package com.ss.android.ugc.aweme.comment.widget;

import X.AbstractC26257ASf;
import X.C00F;
import X.C06460Ne;
import X.C17N;
import X.C218488ho;
import X.C218498hp;
import X.C26338AVi;
import X.C34K;
import X.C43051mX;
import X.C53860LBw;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71K;
import X.C71Y;
import X.C73021SlF;
import X.C75E;
import X.C75O;
import X.C75R;
import X.C76800UCe;
import X.C8RO;
import X.InterfaceC16140kE;
import X.InterfaceC16600ky;
import X.InterfaceC16670l5;
import X.InterfaceC218588hy;
import X.InterfaceC74236TBo;
import X.InterfaceC88472Yns;
import X.OGG;
import X.TBV;
import X.X1D;
import Y.AUListenerS92S0100000_3;
import Y.IDAListenerS37S0200000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentNestedLayout extends FrameLayout implements InterfaceC16670l5 {
    public static final C218488ho LLJILJILJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJILLL;
    public static final C43051mX<Rect> LLJJ;
    public static final C8RO LLJJI;
    public int LJLIL;
    public InterfaceC218588hy LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public final float LL;
    public boolean LLD;
    public ObjectAnimator LLF;
    public ValueAnimator LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public C75O LLI;
    public final C218498hp LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public View LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public OGG LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public final C62822Ol8 LLIILII;
    public final List<View> LLIILZL;
    public final C62822Ol8 LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final Set<C75R> LLIZ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLIZLLLIL;
    public final IDAListenerS72S0100000_3 LLJ;
    public final IDAListenerS72S0100000_3 LLJI;
    public final boolean LLJIJIL;
    public int LLJILJIL;

    static {
        TBV tbv = new TBV(CommentNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0);
        C65352Pkq.LIZ.getClass();
        LLJILLL = new InterfaceC74236TBo[]{tbv};
        LLJILJILJ = new C218488ho();
        LLJJ = new C43051mX<>(12);
        LLJJI = new C8RO("commentVideoShrink");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LJIIIIZZ() {
        this.LLD = false;
        setMTouchScrollingChild(false);
        this.LLIIJI = false;
        this.LLIIJLIL = false;
        this.LJLLLL = 0.0f;
        this.LLILL = false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
    }

    private final C53860LBw getHandleView() {
        return (C53860LBw) this.LLIILII.getValue();
    }

    private final boolean getMAnimating() {
        if (this.LLILII || this.LLILLIZIL) {
            return true;
        }
        return false;
    }

    private final View getMCommentListContainer() {
        return (View) this.LLIIIL.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.LJLJJLL.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.LJLJJL.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.LLII.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.LLIIZ.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return LIZ(this, LLJILLL[0]).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.LJLJJI.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.LJLJL.getValue();
    }

    private final LinearLayout getNestedLinearLayout() {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-nestedLinearLayout>(...)");
        return (LinearLayout) value;
    }

    public final boolean LJI() {
        if (this.LLILLIZIL) {
            return true;
        }
        if (!this.LLILII) {
            if (LJ()) {
                if (getTranslationX() < this.LJZ) {
                    return true;
                }
            } else if (getTranslationY() < this.LJLZ) {
                return true;
            }
        }
        return false;
    }

    public final View getCommentContainer() {
        if (this.LLIIIJ == null) {
            this.LLIIIJ = findViewById(R.id.dd6);
        }
        return this.LLIIIJ;
    }

    public final View getMCommentBgContainer() {
        return (View) this.LLIIIILZ.getValue();
    }

    public final RecyclerView getMScrollingChild() {
        RecyclerView recyclerView;
        OGG ogg = this.LLIIIZ;
        View view = null;
        if (ogg != null) {
            view = ogg.LJIJJ();
        }
        if (!(view instanceof RecyclerView) || (recyclerView = (RecyclerView) view) == null) {
            RecyclerView mRecyclerView = getMRecyclerView();
            o.LJIIIIZZ(mRecyclerView, "mRecyclerView");
            return mRecyclerView;
        }
        return recyclerView;
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.LJLJI.getValue();
    }

    public final boolean LJ() {
        if (getNestedLinearLayout().getOrientation() == 0) {
            return true;
        }
        return false;
    }

    public final View getPlaceHolderView() {
        View mPlaceholder = getMPlaceholder();
        o.LJIIIIZZ(mPlaceholder, "mPlaceholder");
        return mPlaceholder;
    }

    public final boolean getBackFromVideo() {
        return this.LLFFF;
    }

    public final boolean getEnableDragToExpand() {
        return this.LLFZ;
    }

    public final boolean getEnableSwipeDown() {
        return this.LLFII;
    }

    public final boolean getHaveBangs() {
        return this.LLJIJIL;
    }

    public final int getNotchHeight() {
        return this.LLJILJIL;
    }

    public final C75O getOnShowHeightChangeListener() {
        return this.LLI;
    }

    public final List<View> getRequireInterceptChildList() {
        return this.LLIILZL;
    }

    public final OGG getScrollableContainer() {
        return this.LLIIIZ;
    }

    private final void setMTouchScrollingChild(boolean z) {
        LIZIZ(LLJILLL[0], this, Boolean.valueOf(z));
    }

    public final void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hide comment page ");
        LIZ.append(str);
        C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZ));
        if (!this.LLFFF) {
            LIZ(str, false, true);
        } else {
            this.LLFFF = false;
        }
    }

    public final void LJII(C75E c75e) {
        Iterator<C75R> it = this.LLIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c75e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (LJI() && keyEvent != null && keyEvent.getKeyCode() == 4 && this.LLILZ) {
            this.LLILZIL = true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0) {
            this.LJLJLJ = getMAnimating();
        }
        if (this.LJLJLJ && !getMAnimating() && ev.getActionMasked() == 2) {
            ev.setAction(0);
            this.LJLJLJ = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        float x;
        float f;
        boolean z;
        o.LJIIIZ(event, "event");
        if (!this.LLFII) {
            return super.onInterceptTouchEvent(event);
        }
        if (event.getActionMasked() == 0) {
            LJIIIIZZ();
            float x2 = event.getX();
            this.LJLJLLL = x2;
            this.LJLLI = x2;
            float y = event.getY();
            this.LJLL = y;
            this.LJLLILLLL = y;
            this.LJLLJ = event.getRawY();
            this.LJLLL = event.getRawX();
            event.getRawX();
            event.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(event);
            this.LLIIJI = LJFF(event, getMPlaceholder());
            if (!C71K.LIZIZ() || !this.LLILZ) {
                z = false;
            } else {
                Iterator it = ((ArrayList) this.LLIILZL).iterator();
                z = false;
                while (it.hasNext()) {
                    if (LJFF(event, (View) it.next())) {
                        z = true;
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isInRequireInterceptChildList ");
                LIZ.append(z);
                C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZ));
            }
            this.LLIIJLIL = z;
            setMTouchScrollingChild(LJFF(event, getMScrollingChild()));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(event);
        }
        if (event.getActionMasked() == 3) {
            LJIIIIZZ();
        }
        if (event.getActionMasked() == 1) {
            LJIIIIZZ();
        }
        if (this.LLIIJLIL) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float y2 = event.getY() - this.LJLLILLLL;
                Context context = getContext();
                o.LJIIIIZZ(context, "this.context");
                if (C26338AVi.LIZJ(context)) {
                    x = this.LJLLI;
                    f = event.getX();
                } else {
                    x = event.getX();
                    f = this.LJLLI;
                }
                float f2 = x - f;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onInterceptTouchEvent move diffx ");
                LIZ2.append(f2);
                LIZ2.append(" diffy");
                LIZ2.append(y2);
                LIZ2.append(" mTouchPlaceholderChild ");
                LIZ2.append(this.LLIIJI);
                C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ2));
                if (f2 > 0.0f && Math.abs(f2) > Math.abs(y2) && Math.abs(f2) > getMTouchSlop() && this.LLILIL && this.LLILL) {
                    this.LLIIL = true;
                    return true;
                }
                this.LLIIL = false;
                if (this.LLIIJI) {
                    return false;
                }
                float y3 = this.LJLLILLLL - event.getY();
                if (!getMTouchScrollingChild() && (this.LLD || Math.abs(y3) > getMTouchSlop())) {
                    this.LLD = true;
                    return true;
                }
            }
        } else {
            if (this.LLIIJI) {
                return false;
            }
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "this.context");
            if (C26338AVi.LIZJ(context2)) {
                if (event.getX() > this.LJZ * 0.9d) {
                    this.LLILL = true;
                }
            } else if (event.getX() < this.LJZ * 0.1d) {
                this.LLILL = true;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        o.LJIIIZ(child, "child");
        if (!this.LLFII) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStopNestedScroll touchback ");
        LIZ.append(this.LLIIL);
        LIZ.append(", threshold height ");
        float f = 2;
        LIZ.append(this.LJLZ / f);
        LIZ.append("  tra:");
        LIZ.append(getTranslationY());
        C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ));
        boolean z = true;
        if (this.LLIIL) {
            if (getTranslationY() * f >= this.LJLZ) {
                z = false;
            }
            LIZIZ(this, z, false, "slide_right", 2);
        } else {
            if (getTranslationY() * f >= this.LJLZ) {
                z = false;
            }
            LIZIZ(this, z, false, "slide_down", 2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        boolean z7;
        float rawX;
        float f2;
        float rawX2;
        float f3;
        AbstractC26257ASf bottomSheetCallback;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouchEvent touch ");
        LIZ.append(event.getX());
        LIZ.append(' ');
        LIZ.append(event.getY());
        C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ));
        if (!this.LLFII) {
            return super.onTouchEvent(event);
        }
        if (getMAnimating()) {
            return true;
        }
        float f4 = this.LJLZ - this.LJZL;
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(this, f4);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    C71Y.LIZ("xjcccc", "【gestures】 ACTION_CANCEL");
                    onStopNestedScroll(this);
                    LJIIIIZZ();
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" onTouchEvent  move ");
                LIZ2.append(getMTouchScrollingChild());
                LIZ2.append("  touchback:");
                LIZ2.append(this.LLIIL);
                C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ2));
                if (this.LLIIL) {
                    C71Y.LIZ("xjcccc", " onTouchEvent move back ");
                    getMVelocityTracker().addMovement(event);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "this.context");
                    if (C26338AVi.LIZJ(context)) {
                        rawX = this.LJLLL;
                        f2 = event.getRawX();
                    } else {
                        rawX = event.getRawX();
                        f2 = this.LJLLL;
                    }
                    float f5 = rawX - f2;
                    float rawY = event.getRawY() - this.LJLLJ;
                    if (this.LLD || Math.abs(f5) > getMTouchSlop()) {
                        this.LLD = true;
                        onNestedPreScroll(getMScrollingChild(), (int) ((-f5) * this.LJZI), -((int) rawY), new int[]{0, 0});
                    }
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "this.context");
                    if (C26338AVi.LIZJ(context2)) {
                        rawX2 = this.LJLLL;
                        f3 = event.getRawX();
                    } else {
                        rawX2 = event.getRawX();
                        f3 = this.LJLLL;
                    }
                    this.LJLLLLLL = rawX2 - f3;
                    this.LJLLL = event.getRawX();
                } else if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(event);
                    float rawY2 = event.getRawY() - this.LJLLJ;
                    float rawX3 = event.getRawX() - this.LJLLL;
                    if (rawY2 < 0.0f) {
                        float abs = Math.abs(rawY2) + this.LJLZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("gestures top  height  ");
                        LIZ3.append(this.LJLZ);
                        LIZ3.append("   next:");
                        LIZ3.append(abs);
                        LIZ3.append("  max:");
                        LIZ3.append(this.LL);
                        LIZ3.append(" peek ");
                        LIZ3.append(this.LJZL);
                        C71Y.LIZ("xjccccc", X1D.LIZIZ(LIZ3));
                        float f6 = this.LJLZ;
                        float f7 = this.LJZL;
                        if (f6 >= f7 && abs > f7 && getTranslationY() == 0.0f && this.LLFZ) {
                            C71Y.LIZ("xjccccc", "gestures top  base peek  to top,change heoght");
                            ViewGroup.LayoutParams layoutParams = getMCommentBgContainer().getLayoutParams();
                            layoutParams.height = (int) Math.min(abs, this.LL);
                            getMCommentBgContainer().setLayoutParams(layoutParams);
                        } else {
                            C71Y.LIZ("xjccccc", "gestures top  base peek to bottom,trans");
                            if (this.LLD || Math.abs(rawY2) > getMTouchSlop()) {
                                this.LLD = true;
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("mDownY :");
                                LIZ4.append(this.LJLL);
                                LIZ4.append("  eventRawY: ");
                                LIZ4.append(event.getRawY());
                                C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ4));
                                onNestedPreScroll(getMScrollingChild(), -((int) rawX3), -((int) rawY2), new int[]{0, 0});
                                InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LLIZLLLIL;
                                if (interfaceC88472Yns != null) {
                                    interfaceC88472Yns.invoke(Boolean.TRUE);
                                }
                            }
                        }
                    } else {
                        float abs2 = this.LJLZ - Math.abs(rawY2);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("gestures to bottom  height  ");
                        LIZ5.append(this.LJLZ);
                        LIZ5.append("   next:");
                        LIZ5.append(abs2);
                        LIZ5.append("  max:");
                        LIZ5.append(this.LL);
                        LIZ5.append(" peek ");
                        LIZ5.append(this.LJZL);
                        C71Y.LIZ("xjccccc", X1D.LIZIZ(LIZ5));
                        if (this.LJLZ > this.LJZL && getTranslationY() == 0.0f && this.LLFZ) {
                            C71Y.LIZ("xjccccc", "gestures to bottom  base peek  to top,change heoght");
                            ViewGroup.LayoutParams layoutParams2 = getMCommentBgContainer().getLayoutParams();
                            layoutParams2.height = (int) Math.max(abs2, this.LJZL);
                            getMCommentBgContainer().setLayoutParams(layoutParams2);
                        } else {
                            C71Y.LIZ("xjccccc", "gestures to bottom  base peek to bottom,trans");
                            if (this.LLD || Math.abs(rawY2) > getMTouchSlop()) {
                                this.LLD = true;
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("mDownY :");
                                LIZ6.append(this.LJLL);
                                LIZ6.append("  eventRawY: ");
                                LIZ6.append(event.getRawY());
                                C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ6));
                                onNestedPreScroll(getMScrollingChild(), -((int) rawX3), -((int) rawY2), new int[]{0, 0});
                                InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = this.LLIZLLLIL;
                                if (interfaceC88472Yns2 != null) {
                                    interfaceC88472Yns2.invoke(Boolean.TRUE);
                                }
                            }
                        }
                    }
                    this.LJLLLL = event.getRawY() - this.LJLLJ;
                    this.LJLLJ = event.getRawY();
                }
            }
        } else {
            C71Y.LIZ("xjcccc", "【gestures】 ACTION_UP");
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            float yVelocity = mVelocityTracker.getYVelocity();
            float xVelocity = mVelocityTracker.getXVelocity();
            if (this.LLIIL) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("【gestures Lift up】  move x ");
                LIZ7.append(event.getRawX() - this.LJLJLLL);
                C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ7));
                if (Math.abs(xVelocity) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.LJLLLLLL < 0.0f) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    LIZIZ(this, z7, false, "slide_right", 2);
                    LJIIIIZZ();
                }
                onStopNestedScroll(this);
                LJIIIIZZ();
            } else if (!getMTouchScrollingChild() && this.LLFZ) {
                if (this.LJLZ > this.LJZL) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("【gestures Lift up】  move initialVelocityY");
                    LIZ8.append(yVelocity);
                    C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ8));
                    if (Math.abs(yVelocity) > getMMinimumVelocity() && !this.LLILLJJLI) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (yVelocity < 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!this.LLILLJJLI) {
                        C34K c34k = new C34K();
                        StringBuilder LIZLLL = C00F.LIZLLL("isFling:", z4, "  isScrollToTop:", z5, " max:");
                        LIZLLL.append(this.LL);
                        LIZLLL.append("  current:");
                        LIZLLL.append(this.LJLZ);
                        LIZLLL.append(' ');
                        LIZLLL.append(this.LJZL);
                        C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZLLL));
                        if (z4) {
                            c34k.element = z5;
                        } else {
                            if (this.LL - getMCommentBgContainer().getMeasuredHeight() < (this.LL - this.LJZL) / 2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            c34k.element = z6;
                        }
                        float f8 = this.LJLZ;
                        if (c34k.element) {
                            f = this.LL;
                        } else {
                            f = this.LJZL;
                        }
                        ValueAnimator valueAnimator = this.LLFF;
                        if ((valueAnimator == null || !valueAnimator.isRunning()) && this.LJLZ != f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f);
                            this.LLFF = ofFloat;
                            if (ofFloat != null) {
                                ofFloat.addUpdateListener(new AUListenerS92S0100000_3(this, 31));
                            }
                            ValueAnimator valueAnimator2 = this.LLFF;
                            if (valueAnimator2 != null) {
                                valueAnimator2.addListener(new IDAListenerS37S0200000_3(this, c34k, 3));
                            }
                            C218488ho c218488ho = LLJILJILJ;
                            ValueAnimator valueAnimator3 = this.LLFF;
                            c218488ho.getClass();
                            C218488ho.LIZ(valueAnimator3, 1.0f);
                            ValueAnimator valueAnimator4 = this.LLFF;
                            if (valueAnimator4 != null) {
                                valueAnimator4.start();
                            }
                        }
                    }
                } else {
                    if (Math.abs(yVelocity) > getMMinimumVelocity() && !getMAnimating()) {
                        if (this.LJLLLL < 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        LIZIZ(this, z3, false, "slide_down", 2);
                    }
                    onStopNestedScroll(this);
                }
                LJIIIIZZ();
            } else {
                if (!getMTouchScrollingChild() && Math.abs(yVelocity) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.LJLLLL < 0.0f) {
                        i = 2;
                        z = false;
                        z2 = true;
                    } else {
                        i = 2;
                        z = false;
                        z2 = false;
                    }
                    LIZIZ(this, z2, z, "slide_down", i);
                    LJIIIIZZ();
                }
                onStopNestedScroll(this);
                LJIIIIZZ();
            }
        }
        return true;
    }

    public final void setBackFromVideo(boolean z) {
        this.LLFFF = z;
    }

    public final void setCommentContainer(View view) {
        this.LLIIIJ = view;
    }

    public final void setEnableDragToExpand(boolean z) {
        this.LLFZ = z;
    }

    public final void setEnableSwipeDown(boolean z) {
        this.LLFII = z;
    }

    public final void setEnableSwipeRightToClose(boolean z) {
        this.LLILIL = z;
    }

    public final void setMIsFocus(boolean z) {
        if (this.LLILZLL ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLILZLL = z;
        }
    }

    public final void setNotchHeight(int i) {
        this.LLJILJIL = i;
    }

    public final void setOnScrollStateChangedListener(InterfaceC218588hy interfaceC218588hy) {
        this.LJLILLLLZI = interfaceC218588hy;
    }

    public final void setOnShowHeightChangeListener(C75O c75o) {
        this.LLI = c75o;
    }

    public final void setOrientation(int i) {
        getNestedLinearLayout().setOrientation(i);
    }

    public final void setPreScrollChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLIZLLLIL = interfaceC88472Yns;
    }

    public final void setScrollableContainer(OGG ogg) {
        this.LLIIIZ = ogg;
    }

    public final void setShowKeyboard(boolean z) {
        this.LLILZ = z;
        setMIsFocus(!z);
    }

    public final void setStateInternal(int i) {
        int i2 = this.LJLIL;
        if (i2 == i) {
            return;
        }
        InterfaceC218588hy interfaceC218588hy = this.LJLILLLLZI;
        if (interfaceC218588hy != null) {
            interfaceC218588hy.LIZ(i2, i);
        }
        this.LJLIL = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C75O c75o = this.LLI;
        if (c75o != null) {
            c75o.O4(Math.max(0.0f, this.LJLZ - f), this.LJLZ);
        }
    }

    public final void LIZJ(int i, View view) {
        AbstractC26257ASf bottomSheetCallback;
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZIZ(i, view);
        }
    }

    public final boolean LJFF(MotionEvent motionEvent, View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        C43051mX<Rect> c43051mX = LLJJ;
        Rect LIZIZ = c43051mX.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new Rect();
        }
        C73021SlF.LIZ(this, view, LIZIZ);
        try {
            boolean contains = LIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            LIZIZ.setEmpty();
            c43051mX.LIZ(LIZIZ);
            return contains;
        } catch (Throwable th) {
            LIZIZ.setEmpty();
            LLJJ.LIZ(LIZIZ);
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (LJ()) {
            this.LJLZ = getMeasuredHeight();
            this.LJZ = getMeasuredWidth() - getMPlaceholder().getMeasuredWidth();
        } else {
            this.LJLZ = getMeasuredHeight() - getMPlaceholder().getMeasuredHeight();
            float measuredWidth = getMeasuredWidth();
            this.LJZ = measuredWidth;
            this.LJZI = this.LJLZ / measuredWidth;
        }
        if (this.LJZL < 0.0f) {
            float f = this.LJLZ;
            if (f > 0.0f) {
                this.LJZL = f;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.8hp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommentNestedLayout(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZ(String str, boolean z, boolean z2) {
        float f;
        IDAListenerS72S0100000_3 iDAListenerS72S0100000_3;
        ObjectAnimator objectAnimator;
        float f2;
        IDAListenerS72S0100000_3 iDAListenerS72S0100000_32;
        ObjectAnimator objectAnimator2;
        if (getMAnimating()) {
            return;
        }
        this.LLILLL = str;
        float f3 = 0.0f;
        int i = 8;
        if (LJ()) {
            if (z) {
                f2 = 0.0f;
            } else {
                Context context = getContext();
                o.LJIIIIZZ(context, "this.context");
                if (C26338AVi.LIZJ(context)) {
                    f2 = -this.LJZ;
                } else {
                    f2 = this.LJZ;
                }
            }
            if (getTranslationX() == f2) {
                if (z) {
                    if (getVisibility() != 0) {
                        i = 0;
                    } else {
                        return;
                    }
                } else if (getVisibility() == 8) {
                    return;
                }
                setVisibility(i);
                LJIIIIZZ();
                if (z2) {
                    if (z) {
                        if (this.LJZ <= 0.0f) {
                            f3 = C17N.LJIILL(365.0d);
                        } else {
                            f3 = this.LJLZ;
                        }
                    }
                    setTranslationX(f3);
                }
            }
            ObjectAnimator objectAnimator3 = this.LLF;
            if (objectAnimator3 != null && objectAnimator3.isRunning() && (objectAnimator2 = this.LLF) != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<CommentNestedLayout, Float>) View.TRANSLATION_X, getTranslationX(), f2);
            this.LLF = ofFloat;
            LLJILJILJ.getClass();
            C218488ho.LIZ(ofFloat, 1.0f);
            ObjectAnimator objectAnimator4 = this.LLF;
            o.LJI(objectAnimator4);
            if (z) {
                iDAListenerS72S0100000_32 = this.LLJ;
            } else {
                iDAListenerS72S0100000_32 = this.LLJI;
            }
            objectAnimator4.addListener(iDAListenerS72S0100000_32);
            ObjectAnimator objectAnimator5 = this.LLF;
            o.LJI(objectAnimator5);
            objectAnimator5.start();
            return;
        }
        C71Y.LIZ("xjccccc", "animateToVisibleVertical " + z + " ");
        if (z) {
            f = 0.0f;
        } else {
            f = this.LJLZ;
        }
        if (getTranslationY() == f) {
            if (z) {
                if (getVisibility() == 0) {
                    return;
                } else {
                    i = 0;
                }
            } else if (getVisibility() == 8) {
                return;
            }
            setVisibility(i);
            LJIIIIZZ();
            if (z2) {
                if (z) {
                    float f4 = this.LJLZ;
                    if (f4 <= 0.0f) {
                        f3 = C17N.LJIILL(500.0d);
                    } else {
                        f3 = f4;
                    }
                }
                setTranslationY(f3);
            }
        }
        ObjectAnimator objectAnimator6 = this.LLF;
        if (objectAnimator6 != null && objectAnimator6.isRunning() && (objectAnimator = this.LLF) != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<CommentNestedLayout, Float>) View.TRANSLATION_Y, getTranslationY(), f);
        this.LLF = ofFloat2;
        C218488ho c218488ho = LLJILJILJ;
        float abs = Math.abs((f - getTranslationY()) / this.LJLZ);
        c218488ho.getClass();
        C218488ho.LIZ(ofFloat2, abs);
        ObjectAnimator objectAnimator7 = this.LLF;
        o.LJI(objectAnimator7);
        if (z) {
            iDAListenerS72S0100000_3 = this.LLJ;
        } else {
            iDAListenerS72S0100000_3 = this.LLJI;
        }
        objectAnimator7.addListener(iDAListenerS72S0100000_3);
        ObjectAnimator objectAnimator8 = this.LLF;
        o.LJI(objectAnimator8);
        objectAnimator8.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        boolean z;
        o.LJIIIZ(target, "target");
        if (!this.LLFII) {
            return false;
        }
        if ((target instanceof InterfaceC16140kE) && ((InterfaceC16140kE) target).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(this, z, false, "slide_down", 2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartNestedScroll nestedScrollAxes ");
        LIZ.append(child);
        LIZ.append(' ');
        LIZ.append(i);
        C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ));
        Iterator<View> it = this.LLIILZL.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getId() == child.getId()) {
                z = false;
            }
        }
        if ((target instanceof InterfaceC16600ky) && (i & 2) != 0 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        AbstractC26257ASf bottomSheetCallback;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (!this.LLFII) {
            return;
        }
        float translationY = getTranslationY();
        StringBuilder LIZJ = C06460Ne.LIZJ("onNestedPreScroll dx:", i, "  dy:", i2, "  translationY:");
        LIZJ.append(translationY);
        C71Y.LIZ("xjcccccc", X1D.LIZIZ(LIZJ));
        float f = -getTranslationY();
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(this, f);
        }
        setStateInternal(2);
        int i3 = 0;
        float f2 = 0.0f;
        if (this.LLIIL) {
            C71Y.LIZ("xjcccccc", "onNestedPreScroll mTouchBack");
            if (translationY > 0.0f) {
                float f3 = translationY - i;
                if (f3 >= 0.0f) {
                    f2 = f3;
                }
                float f4 = this.LJLZ;
                if (f2 > f4) {
                    f2 = f4;
                }
                setTranslationY(f2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onNestedPreScroll mTouchBack translationY:");
                LIZ.append(getTranslationY());
                C71Y.LIZ("xjcccccc", X1D.LIZIZ(LIZ));
                if (getMTouchScrollingChild() && !this.LLIL) {
                    consumed[1] = consumed[1] + i;
                    return;
                }
                return;
            }
            if (translationY != 0.0f) {
                return;
            }
            if (target instanceof InterfaceC16140kE) {
                i3 = ((InterfaceC16140kE) target).computeVerticalScrollOffset();
            }
            StringBuilder LIZJ2 = C06460Ne.LIZJ("onNestedPreScroll ty=0 dy:", i2, " offsetY:", i3, " mTouchScrollingChild:");
            LIZJ2.append(getMTouchScrollingChild());
            LIZJ2.append("mHeight:");
            LIZJ2.append(this.LJLZ);
            C71Y.LIZ("xjccccc", X1D.LIZIZ(LIZJ2));
            if (i >= 0) {
                return;
            }
            float f5 = translationY - i;
            if (f5 >= 0.0f) {
                f2 = f5;
            }
            setTranslationY(f2);
            return;
        }
        C71Y.LIZ("xjcccccc", "onNestedPreScroll normal touch");
        if (translationY > 0.0f) {
            float f6 = translationY - i2;
            if (f6 >= 0.0f) {
                f2 = f6;
            }
            float f7 = this.LJLZ;
            if (f2 > f7) {
                f2 = f7;
            }
            setTranslationY(f2);
            if (getMTouchScrollingChild() && !this.LLIL) {
                consumed[1] = consumed[1] + i2;
                return;
            }
            return;
        }
        if (translationY != 0.0f) {
            return;
        }
        if (target instanceof InterfaceC16140kE) {
            i3 = ((InterfaceC16140kE) target).computeVerticalScrollOffset();
        }
        StringBuilder LIZJ3 = C06460Ne.LIZJ("onNestedPreScroll ty=0 dy:", i2, " offsetY:", i3, " mTouchScrollingChild:");
        LIZJ3.append(getMTouchScrollingChild());
        LIZJ3.append("mHeight:");
        LIZJ3.append(this.LJLZ);
        C71Y.LIZ("xjccccc", X1D.LIZIZ(LIZJ3));
        if (i2 >= 0) {
            return;
        }
        if (i3 != 0 && getMTouchScrollingChild()) {
            return;
        }
        float f8 = translationY - i2;
        float f9 = this.LJLZ;
        if (f8 > f9) {
            f8 = f9;
        }
        setTranslationY(f8);
    }

    public static /* synthetic */ void LIZIZ(CommentNestedLayout commentNestedLayout, boolean z, boolean z2, String str, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        commentNestedLayout.LIZ(str, z, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNestedScroll dyConsumed ");
        LIZ.append(i2);
        C71Y.LIZ("xjcccc", X1D.LIZIZ(LIZ));
    }
}
