package X;

import Y.IDAListenerS72S0100000_3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218478hn extends LinearLayout implements InterfaceC16670l5 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLL;
    public static final C43051mX<Rect> LLILZ;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
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
    public boolean LJZL;
    public ObjectAnimator LL;
    public boolean LLD;
    public final C218528hs LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public View LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final C62822Ol8 LLIIII;
    public boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public boolean LLIIIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public String LLIIZ;
    public boolean LLIL;
    public InterfaceC88472Yns<? super C1801675g, C76800UCe> LLILII;
    public InterfaceC1802475o LLILIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLILL;
    public final IDAListenerS72S0100000_3 LLILLIZIL;
    public final IDAListenerS72S0100000_3 LLILLJJLI;

    static {
        TBV tbv = new TBV(C218478hn.class, "touchScrollingChild", "getTouchScrollingChild()Z", 0);
        C65352Pkq.LIZ.getClass();
        LLILLL = new InterfaceC74236TBo[]{tbv};
        LLILZ = new C43051mX<>(12);
    }

    public final void LJFF() {
        this.LJZL = false;
        setTouchScrollingChild(false);
        this.LLIFFJFJJ = false;
        this.LJLLL = 0.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    public final InterfaceC218598hz getOnShowHeightChangeListener() {
        return null;
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

    public final void setOnShowHeightChangeListener(InterfaceC218598hz interfaceC218598hz) {
    }

    private final boolean getAnimating() {
        if (this.LLIIL || this.LLIILZL) {
            return true;
        }
        return false;
    }

    private final View getCommentListContainer() {
        return (View) this.LLFZ.getValue();
    }

    private final C53860LBw getHandleView() {
        return (C53860LBw) this.LLIIII.getValue();
    }

    private final View getInputView() {
        return (View) this.LLIIIJ.getValue();
    }

    private final float getMaximumVelocity() {
        return ((Number) this.LJLJJI.getValue()).floatValue();
    }

    private final float getMinimumVelocity() {
        return ((Number) this.LJLJI.getValue()).floatValue();
    }

    private final View getPlaceholder() {
        return (View) this.LLFF.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.LLIIJI.getValue();
    }

    private final boolean getTouchScrollingChild() {
        return LIZ(this, LLILLL[0]).booleanValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.LJLILLLLZI.getValue()).intValue();
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.LJLJJL.getValue();
    }

    private final ViewPager getViewPager() {
        return (ViewPager) this.LLI.getValue();
    }

    public final View getCommentBgContainer() {
        return (View) this.LLFFF.getValue();
    }

    public final View getCommentContainer() {
        if (this.LLFII == null) {
            this.LLFII = findViewById(R.id.dd6);
        }
        return this.LLFII;
    }

    public final RecyclerView getScrollingChild() {
        InterfaceC1802475o interfaceC1802475o = this.LLILIL;
        RecyclerView recyclerView = null;
        if (interfaceC1802475o != null) {
            recyclerView = interfaceC1802475o.LJIJJ();
        }
        if (!(recyclerView instanceof RecyclerView) || recyclerView == null) {
            RecyclerView recyclerView2 = getRecyclerView();
            o.LJIIIIZZ(recyclerView2, "recyclerView");
            return recyclerView2;
        }
        return recyclerView;
    }

    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) this.LJLIL.getValue();
    }

    private final int getInputAreaHeight() {
        View inputView = getInputView();
        if (inputView != null) {
            return inputView.getHeight();
        }
        return 0;
    }

    public final boolean getEnableSwipeDown() {
        return this.LLD;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getHideOuterListener() {
        return this.LLIIIZ;
    }

    public final InterfaceC1802475o getScrollableContainer() {
        return this.LLILIL;
    }

    private final void setTouchScrollingChild(boolean z) {
        LIZIZ(LLILLL[0], this, Boolean.valueOf(z));
    }

    public final void LIZLLL(String str) {
        LIZ(str, false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z;
        o.LJIIIZ(ev, "ev");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispatchTouchEvent   ");
        LIZ.append(ev);
        LIZ.append("  ");
        LIZ.append(this.LJLLLL);
        LIZ.append("   ");
        LIZ.append(this.LJLLL);
        C177996yh.LIZIZ("CommentNestedLayout", X1D.LIZIZ(LIZ));
        if (ev.getActionMasked() == 0) {
            this.LJLJJLL = getAnimating();
        }
        if (this.LJLJJLL && !getAnimating() && ev.getActionMasked() == 2) {
            ev.setAction(0);
            this.LJLJJLL = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && this.LJLJL && Math.abs(ev.getRawX() - this.LJLLJ) > getTouchSlop()) {
                if (Math.abs(ev.getRawX() - this.LJLLJ) >= Math.abs(ev.getRawY() - this.LJLLILLLL) * 0.7d) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("horizontalScroll ");
                LIZ2.append(z);
                LIZ2.append(' ');
                LIZ2.append(true ^ LJ(ev, getInputView()));
                LIZ2.append("  slop ");
                LIZ2.append(Math.abs(ev.getRawX() - this.LJLLJ));
                LIZ2.append(' ');
                LIZ2.append(getTouchSlop());
                C177996yh.LIZ("CommentNestedLayout", X1D.LIZIZ(LIZ2));
                this.LJLJL = false;
            }
        } else {
            this.LJLJL = true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        boolean LJ;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInterceptTouchEvent   ");
        LIZ.append(event);
        C177996yh.LIZIZ("CommentNestedLayout", X1D.LIZIZ(LIZ));
        if (event.getAction() == 0 && this.LLIIIILZ && getHeight() - event.getY() > getInputAreaHeight()) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C45804HyK.LJIJJ(context) != null && (interfaceC88472Yns = this.LLIIIZ) != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            this.LLIIIL = true;
            return true;
        }
        if (event.getAction() == 0) {
            this.LLIIIL = false;
        }
        if (!this.LLD) {
            return super.onInterceptTouchEvent(event);
        }
        if (event.getActionMasked() == 0) {
            LJFF();
            float x = event.getX();
            this.LJLJLJ = x;
            this.LJLL = x;
            float y = event.getY();
            this.LJLJLLL = y;
            this.LJLLI = y;
            this.LJLLILLLL = event.getRawY();
            this.LJLLJ = event.getRawX();
            event.getRawX();
            event.getRawY();
            getVelocityTracker().clear();
            getVelocityTracker().addMovement(event);
            this.LLIFFJFJJ = LJ(event, getPlaceholder());
            if (this.LLIILII) {
                if (LJ(event, getScrollingChild()) || LJ(event, getCommentContainer())) {
                    LJ = true;
                } else {
                    LJ = false;
                }
            } else {
                LJ = LJ(event, getScrollingChild());
            }
            setTouchScrollingChild(LJ);
        }
        if (getAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(event);
        }
        if (event.getActionMasked() == 3) {
            LJFF();
        }
        if (event.getActionMasked() == 1) {
            LJFF();
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float y2 = event.getY() - this.LJLLI;
                float x2 = event.getX() - this.LJLL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onInterceptTouchEvent move diffx ");
                LIZ2.append(x2);
                LIZ2.append(" diffy");
                LIZ2.append(y2);
                LIZ2.append(" mTouchPlaceholderChild ");
                LIZ2.append(this.LLIFFJFJJ);
                C177996yh.LIZ("CommentNestedLayout", X1D.LIZIZ(LIZ2));
                if (x2 > 0.0f && Math.abs(x2) > Math.abs(y2) && Math.abs(x2) > getTouchSlop() && this.LLIILII) {
                    this.LLII = true;
                    return true;
                }
                this.LLII = false;
                if (this.LLIFFJFJJ) {
                    return false;
                }
                float y3 = this.LJLLI - event.getY();
                if (!getTouchScrollingChild() && (this.LJZL || Math.abs(y3) > getTouchSlop())) {
                    this.LJZL = true;
                    return true;
                }
            }
        } else if (this.LLIFFJFJJ) {
            return false;
        }
        C177996yh.LIZ("CommentNestedLayout", "final intercept ");
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        o.LJIIIZ(child, "child");
        if (!this.LLD) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStopNestedScroll touchback ");
        LIZ.append(this.LLII);
        LIZ.append(" readyUp ");
        float f = 3;
        LIZ.append(this.LJLZ / f);
        LIZ.append("  tra:");
        LIZ.append(getTranslationY());
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        boolean z = true;
        if (this.LLII) {
            if (getTranslationY() >= this.LJLZ / f) {
                z = false;
            }
            LIZIZ(this, z, false, "slide_right", 2);
        } else {
            if (getTranslationY() * 2 >= this.LJLLLLLL) {
                z = false;
            }
            LIZIZ(this, z, false, "pull_down", 2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        boolean z2;
        AbstractC26257ASf bottomSheetCallback;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouchEvent touch ");
        LIZ.append(event.getX());
        LIZ.append(' ');
        LIZ.append(event.getY());
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (this.LLIIIL) {
            return true;
        }
        if (!this.LLD) {
            return super.onTouchEvent(event);
        }
        if (getAnimating()) {
            return true;
        }
        float f = this.LJLLLLLL - this.LJZ;
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(this, f);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    onStopNestedScroll(this);
                    LJFF();
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" onTouchEvent  move ");
                LIZ2.append(getTouchScrollingChild());
                LIZ2.append("  touchback:");
                LIZ2.append(this.LLII);
                String msg2 = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(msg2, "msg");
                if (this.LLII) {
                    getVelocityTracker().addMovement(event);
                    float rawX = event.getRawX() - this.LJLLJ;
                    float rawY = event.getRawY() - this.LJLLILLLL;
                    if (this.LJZL || Math.abs(rawX) > getTouchSlop()) {
                        this.LJZL = true;
                        onNestedPreScroll(getScrollingChild(), -((int) rawX), -((int) rawY), new int[]{0, 0});
                    }
                    this.LJLLLL = event.getRawX() - this.LJLLJ;
                    this.LJLLJ = event.getRawX();
                } else if (!getTouchScrollingChild()) {
                    getVelocityTracker().addMovement(event);
                    float rawY2 = event.getRawY() - this.LJLLILLLL;
                    float rawX2 = event.getRawX() - this.LJLLJ;
                    if (rawY2 < 0.0f) {
                        float abs = Math.abs(rawY2) + this.LJLLLLLL;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("gestures top  height  ");
                        LIZ3.append(this.LJLLLLLL);
                        LIZ3.append("   next:");
                        LIZ3.append(abs);
                        LIZ3.append("  max:");
                        LIZ3.append(this.LJZI);
                        LIZ3.append(" peek ");
                        LIZ3.append(this.LJZ);
                        String msg3 = X1D.LIZIZ(LIZ3);
                        o.LJIIIZ(msg3, "msg");
                        float f2 = this.LJLLLLLL;
                        float f3 = this.LJZ;
                        if (f2 >= f3 && abs > f3) {
                            getTranslationY();
                        }
                        if (this.LJZL || Math.abs(rawY2) > getTouchSlop()) {
                            this.LJZL = true;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("mDownY :");
                            LIZ4.append(this.LJLJLLL);
                            LIZ4.append("  eventRawY: ");
                            LIZ4.append(event.getRawY());
                            String msg4 = X1D.LIZIZ(LIZ4);
                            o.LJIIIZ(msg4, "msg");
                            onNestedPreScroll(getScrollingChild(), -((int) rawX2), -((int) rawY2), new int[]{0, 0});
                            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LLILL;
                            if (interfaceC88472Yns != null) {
                                interfaceC88472Yns.invoke(Boolean.TRUE);
                            }
                        }
                    } else {
                        float abs2 = this.LJLLLLLL - Math.abs(rawY2);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("gestures to bottom  height  ");
                        LIZ5.append(this.LJLLLLLL);
                        LIZ5.append("   next:");
                        LIZ5.append(abs2);
                        LIZ5.append("  max:");
                        LIZ5.append(this.LJZI);
                        LIZ5.append(" peek ");
                        LIZ5.append(this.LJZ);
                        String msg5 = X1D.LIZIZ(LIZ5);
                        o.LJIIIZ(msg5, "msg");
                        if (this.LJLLLLLL > this.LJZ) {
                            getTranslationY();
                        }
                        if (this.LJZL || Math.abs(rawY2) > getTouchSlop()) {
                            this.LJZL = true;
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("mDownY :");
                            LIZ6.append(this.LJLJLLL);
                            LIZ6.append("  eventRawY: ");
                            LIZ6.append(event.getRawY());
                            String msg6 = X1D.LIZIZ(LIZ6);
                            o.LJIIIZ(msg6, "msg");
                            onNestedPreScroll(getScrollingChild(), -((int) rawX2), -((int) rawY2), new int[]{0, 0});
                            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = this.LLILL;
                            if (interfaceC88472Yns2 != null) {
                                interfaceC88472Yns2.invoke(Boolean.TRUE);
                            }
                        }
                    }
                    this.LJLLL = event.getRawY() - this.LJLLILLLL;
                    this.LJLLILLLL = event.getRawY();
                }
            }
        } else {
            VelocityTracker velocityTracker = getVelocityTracker();
            velocityTracker.computeCurrentVelocity(1000, getMaximumVelocity());
            float yVelocity = velocityTracker.getYVelocity();
            float xVelocity = velocityTracker.getXVelocity();
            if (this.LLII) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("【gestures Lift up】  move x ");
                LIZ7.append(event.getRawX() - this.LJLJLJ);
                String msg7 = X1D.LIZIZ(LIZ7);
                o.LJIIIZ(msg7, "msg");
                if (Math.abs(xVelocity) > getMinimumVelocity() && !getAnimating()) {
                    if (this.LJLLLL < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LIZIZ(this, z2, false, "slide_right", 2);
                    LJFF();
                }
                onStopNestedScroll(this);
                LJFF();
            } else {
                if (!getTouchScrollingChild() && Math.abs(yVelocity) > getMinimumVelocity() && !getAnimating()) {
                    if (this.LJLLL < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZIZ(this, z, false, "pull_down", 2);
                    LJFF();
                }
                onStopNestedScroll(this);
                LJFF();
            }
        }
        return true;
    }

    public final void setCommentContainer(View view) {
        this.LLFII = view;
    }

    public final void setEnableSwipeDown(boolean z) {
        this.LLD = z;
    }

    public final void setEnableSwipeRightToClose(boolean z) {
        this.LLIILII = z;
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        if (C26338AVi.LIZJ(context)) {
            this.LLIILII = false;
        }
    }

    public final void setFocus(boolean z) {
        if (this.LLIL ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLIL = z;
        }
    }

    public final void setHideOuterListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLIIIZ = interfaceC88472Yns;
    }

    public final void setPreScrollChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLILL = interfaceC88472Yns;
    }

    public final void setScrollableContainer(InterfaceC1802475o interfaceC1802475o) {
        this.LLILIL = interfaceC1802475o;
    }

    public final void setShowKeyboard(boolean z) {
        this.LLIIIILZ = z;
        setFocus(!z);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public final void setVisibleChangedListener(InterfaceC88472Yns<? super C1801675g, C76800UCe> interfaceC88472Yns) {
        this.LLILII = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.8hs] */
    public C218478hn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1589));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1588));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1585));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1584));
        this.LJLJJL = C221108m2.LIZIZ(C218568hw.LJLIL);
        this.LJZ = -1.0f;
        int LJJJJJL = C63081OpJ.LJJJJJL(context);
        this.LJZI = LJJJJJL > 0 ? 1.0f * LJJJJJL : 1.0f;
        this.LLD = true;
        final Boolean bool = Boolean.FALSE;
        this.LLF = new AbstractC214518bP<Boolean>(bool) { // from class: X.8hs
            @Override // X.AbstractC214518bP
            public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool2, Boolean bool3) {
                boolean z;
                o.LJIIIZ(property, "property");
                if (bool3.booleanValue() ^ bool2.booleanValue()) {
                    C218478hn c218478hn = this;
                    if (c218478hn.getScrollingChild().computeVerticalScrollExtent() >= this.getScrollingChild().computeVerticalScrollRange()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c218478hn.LLIIJLIL = z;
                }
            }
        };
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1586));
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1580));
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1581));
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1590));
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1582));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1583));
        this.LLIIJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1587));
        this.LLIIZ = "";
        this.LLILLIZIL = new IDAListenerS72S0100000_3(this, 46);
        this.LLILLJJLI = new IDAListenerS72S0100000_3(this, 45);
        setFocus(true);
        setOnKeyListener(new View.OnKeyListener() { // from class: X.8hu
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (C218478hn.this.getEnableSwipeDown()) {
                    C218478hn c218478hn = C218478hn.this;
                    if ((c218478hn.LLIILZL || (!c218478hn.LLIIL && c218478hn.getTranslationY() < c218478hn.LJLLLLLL)) && i == 4) {
                        if (keyEvent.getAction() == 1) {
                            C218478hn.this.LIZ("back_pressed", false, true);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public final void LIZJ(int i, View view) {
        AbstractC26257ASf bottomSheetCallback;
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZIZ(i, view);
        }
    }

    public final boolean LJ(MotionEvent motionEvent, View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        C43051mX<Rect> c43051mX = LLILZ;
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
            LLILZ.LIZ(LIZIZ);
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float LJJJJLI;
        super.onMeasure(i, i2);
        float measuredHeight = getMeasuredHeight() - getPlaceholder().getMeasuredHeight();
        this.LJLLLLLL = measuredHeight;
        if (this.LJZ < 0.0f && measuredHeight > 0.0f) {
            this.LJZ = measuredHeight;
        }
        float measuredHeight2 = getMeasuredHeight();
        if (measuredHeight2 > 0.0f) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LJJJJLI = (measuredHeight2 - C63081OpJ.LJJJJLI(context)) * 1.0f;
        } else {
            int LIZJ = C60996Nwm.LIZJ(getContext());
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LJJJJLI = (LIZJ - C63081OpJ.LJJJJLI(context2)) - C60996Nwm.LIZLLL(getContext());
        }
        this.LJZI = LJJJJLI;
        this.LJLZ = getMeasuredWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.getAnimating()
            if (r0 == 0) goto L7
            return
        L7:
            r6.LLIIZ = r7
            r2 = 0
            if (r8 == 0) goto L88
            r4 = 0
        Ld:
            float r0 = r6.getTranslationY()
            r3 = 1
            r5 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L3a
            if (r8 == 0) goto L7d
            int r0 = r6.getVisibility()
            if (r0 == 0) goto L87
        L1f:
            r1 = 0
        L20:
            r6.setVisibility(r1)
            r6.LJFF()
            if (r9 == 0) goto L3a
            if (r8 == 0) goto L37
            float r1 = r6.LJLLLLLL
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L7b
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = X.C278817o.LIZ(r0)
            float r2 = (float) r0
        L37:
            r6.setTranslationY(r2)
        L3a:
            android.animation.ObjectAnimator r0 = r6.LL
            if (r0 == 0) goto L4b
            boolean r0 = r0.isRunning()
            if (r0 != r3) goto L4b
            android.animation.ObjectAnimator r0 = r6.LL
            if (r0 == 0) goto L4b
            r0.cancel()
        L4b:
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            r0 = 2
            float[] r1 = new float[r0]
            float r0 = r6.getTranslationY()
            r1[r5] = r0
            r1[r3] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r6, r2, r1)
            r6.LL = r2
            if (r2 == 0) goto L77
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            if (r8 == 0) goto L78
            Y.IDAListenerS72S0100000_3 r0 = r6.LLILLIZIL
        L71:
            r2.addListener(r0)
            r2.start()
        L77:
            return
        L78:
            Y.IDAListenerS72S0100000_3 r0 = r6.LLILLJJLI
            goto L71
        L7b:
            r2 = r1
            goto L37
        L7d:
            r1 = 8
            if (r8 != 0) goto L1f
            int r0 = r6.getVisibility()
            if (r0 != r1) goto L20
        L87:
            return
        L88:
            float r4 = r6.LJLLLLLL
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218478hn.LIZ(java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        int i;
        boolean z;
        o.LJIIIZ(target, "target");
        if (!this.LLD) {
            return false;
        }
        if (target instanceof InterfaceC16140kE) {
            i = ((InterfaceC16140kE) target).computeVerticalScrollOffset();
        } else {
            i = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNestedPreFling ");
        LIZ.append(f2);
        LIZ.append(' ');
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (i != 0 || Math.abs(f2) <= 3000.0f) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(this, z, false, "pull_down", 2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartNestedScroll nestedScrollAxes ");
        LIZ.append(i);
        C177996yh.LIZ("CommentNestedLayout", X1D.LIZIZ(LIZ));
        if ((target instanceof InterfaceC16600ky) && (i & 2) != 0) {
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
        if (!this.LLD) {
            return;
        }
        float translationY = getTranslationY();
        StringBuilder LIZJ = C06460Ne.LIZJ("onNestedPreScroll dx:", i, "  dy:", i2, "  translationY:");
        LIZJ.append(translationY);
        String msg = X1D.LIZIZ(LIZJ);
        o.LJIIIZ(msg, "msg");
        float f = -getTranslationY();
        C53860LBw handleView = getHandleView();
        if (handleView != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(this, f);
        }
        int i3 = 0;
        float f2 = 0.0f;
        if (this.LLII) {
            if (translationY > 0.0f) {
                float f3 = translationY - i;
                if (f3 >= 0.0f) {
                    f2 = f3;
                }
                float f4 = this.LJLLLLLL;
                if (f2 > f4) {
                    f2 = f4;
                }
                setTranslationY(f2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onNestedPreScroll mTouchBack translationY:");
                LIZ.append(getTranslationY());
                String msg2 = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg2, "msg");
                if (getTouchScrollingChild() && !this.LLIIJLIL) {
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
            LIZJ2.append(getTouchScrollingChild());
            LIZJ2.append("mHeight:");
            LIZJ2.append(this.LJLLLLLL);
            String msg3 = X1D.LIZIZ(LIZJ2);
            o.LJIIIZ(msg3, "msg");
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
        if (translationY > 0.0f) {
            float f6 = translationY - i2;
            if (f6 >= 0.0f) {
                f2 = f6;
            }
            float f7 = this.LJLLLLLL;
            if (f2 > f7) {
                f2 = f7;
            }
            setTranslationY(f2);
            if (getTouchScrollingChild() && !this.LLIIJLIL) {
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
        LIZJ3.append(getTouchScrollingChild());
        LIZJ3.append("mHeight:");
        LIZJ3.append(this.LJLLLLLL);
        String msg4 = X1D.LIZIZ(LIZJ3);
        o.LJIIIZ(msg4, "msg");
        if (i2 >= 0) {
            return;
        }
        if (i3 != 0 && getTouchScrollingChild()) {
            return;
        }
        float f8 = translationY - i2;
        float f9 = this.LJLLLLLL;
        if (f8 > f9) {
            f8 = f9;
        }
        setTranslationY(f8);
    }

    public static /* synthetic */ void LIZIZ(C218478hn c218478hn, boolean z, boolean z2, String str, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        c218478hn.LIZ(str, z, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNestedScroll dyConsumed ");
        LIZ.append(i2);
        C177996yh.LIZ("CommentNestedLayout", X1D.LIZIZ(LIZ));
    }
}
