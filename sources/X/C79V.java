package X;

import Y.ARunnableS39S0100000_3;
import Y.AfS55S0100000_3;
import Y.IDLListenerS191S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.79V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79V extends SYL {
    public static final int LLLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    public static final int LLLJIL = C7MY.LIZIZ(48);
    public static final int LLLJL = C7MY.LIZIZ(256);
    public static final int LLLL = C7MY.LIZIZ(20);
    public C73666Sve LLLFF;
    public C79Q LLLFFI;
    public final View LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public int LLLIIIL;
    public final C62822Ol8 LLLIIL;
    public final C62822Ol8 LLLIILIL;
    public C1811278y LLLIL;
    public boolean LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private final Runnable getDiggToScrollRunnable() {
        return (Runnable) this.LLLIILIL.getValue();
    }

    private final Runnable getStartScrollRunnable() {
        return (Runnable) this.LLLIIL.getValue();
    }

    public final void LJLLLL() {
        C71Y.LIZLLL("ReactionBubbleList", "diggCancel");
        if (this.LLLIZZ) {
            this.LLLIIIIL = true;
            return;
        }
        if (getState() == null || getState().LJIIIIZZ() == 0) {
            this.LLLIIIIL = true;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[digg size is: ");
        LIZ.append(getState().LJIIIIZZ());
        LIZ.append(']');
        C71Y.LIZLLL("ReactionBubbleList", X1D.LIZIZ(LIZ));
        setVisibility(0);
        this.LLLIZZ = true;
        this.LLLIIIIL = false;
        LJZ();
        User curUser = HG3.LJIILL().getCurUser();
        for (InterfaceC57784Mm4 interfaceC57784Mm4 : getState().LJII()) {
            if (interfaceC57784Mm4 instanceof C1811078w) {
                C1811078w c1811078w = (C1811078w) interfaceC57784Mm4;
                if (o.LJ(c1811078w.LJLJJL, "like") && o.LJ(c1811078w.LJLILLLLZI.getUid(), curUser.getUid())) {
                    getState().LJIIL(interfaceC57784Mm4);
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[diggCancel finish and state size is: ");
        LIZ2.append(getState().LJIIIIZZ());
        LIZ2.append(']');
        C71Y.LIZLLL("ReactionBubbleList", X1D.LIZIZ(LIZ2));
        postDelayed(getDiggToScrollRunnable(), 40L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        kotlin.jvm.internal.o.LJIIIIZZ(r6, "user");
        getState().LIZIZ(r8.LLLILZLLLI, X.C78939UyV.LJIIL(r6, r8.LLLIL));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLLLL() {
        /*
            r8 = this;
            java.lang.String r3 = "ReactionBubbleList"
            java.lang.String r0 = "diggSuccess"
            X.C71Y.LIZLLL(r3, r0)
            boolean r0 = r8.LLLIZZ
            r2 = 1
            if (r0 == 0) goto Lf
            r8.LLLIIII = r2
            return
        Lf:
            X.Sho r0 = r8.getState()
            if (r0 == 0) goto L1f
            X.Sho r0 = r8.getState()
            int r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L22
        L1f:
            r8.LLLIIII = r2
            return
        L22:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[diggSuccess size is: "
            r1.append(r0)
            X.Sho r0 = r8.getState()
            int r0 = r0.LJIIIIZZ()
            r1.append(r0)
            java.lang.String r0 = ", insert position: "
            r1.append(r0)
            int r0 = r8.LLLILZJ
            r1.append(r0)
            r4 = 93
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C71Y.LIZLLL(r3, r0)
            r0 = 0
            r8.setVisibility(r0)
            r8.LLLIZZ = r2
            r8.LLLIIII = r0
            r8.LJZ()
            int r0 = r8.LLLILZJ
            r8.LLLILZLLLI = r0
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r6 = r0.getCurUser()
            X.Sho r0 = r8.getState()
            java.util.List r0 = r0.LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r7 = r0.iterator()
        L73:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r5 = r7.next()
            r2 = r5
            X.Mm4 r2 = (X.InterfaceC57784Mm4) r2
            boolean r0 = r2 instanceof X.C1811078w
            if (r0 == 0) goto L73
            X.78w r2 = (X.C1811078w) r2
            java.lang.String r1 = r2.LJLJJL
            java.lang.String r0 = "like"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.LJLILLLLZI
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r6.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L73
            if (r5 != 0) goto Lb6
        La2:
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            X.78y r0 = r8.LLLIL
            X.78w r2 = X.C78939UyV.LJIIL(r6, r0)
            X.Sho r1 = r8.getState()
            int r0 = r8.LLLILZLLLI
            r1.LIZIZ(r0, r2)
        Lb6:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[diggSuccess finish insert and state size is: "
            r1.append(r0)
            X.Sho r0 = r8.getState()
            int r0 = r0.LJIIIIZZ()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C71Y.LIZLLL(r3, r0)
            java.lang.Runnable r2 = r8.getDiggToScrollRunnable()
            r0 = 40
            r8.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79V.LJLLLLLL():void");
    }

    public final void LJLZ() {
        C71Y.LIZLLL("ReactionBubbleList", "[startAutoScroll]");
        C79Q c79q = this.LLLFFI;
        if (c79q != null) {
            c79q.LJLJJI = true;
        }
        C73666Sve c73666Sve = this.LLLFF;
        if (c73666Sve != null && !c73666Sve.isDisposed()) {
            return;
        }
        setVisibility(0);
        this.LLLFF = (C73666Sve) new C73735Swl(AbstractC73745Swv.LJ(40L, 40L, TimeUnit.MILLISECONDS, T16.LIZIZ)).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS55S0100000_3(this, 1));
    }

    public final void LJZ() {
        C71Y.LIZLLL("ReactionBubbleList", "[stopAutoScroll]");
        C73666Sve c73666Sve = this.LLLFF;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
    }

    public final boolean LJLLJ() {
        C79Q c79q;
        int LJIIIIZZ = getState().LJIIIIZZ();
        if (LJIIIIZZ > 1) {
            return true;
        }
        if (LJIIIIZZ == 1 && ((c79q = this.LLLFFI) == null || !c79q.LIZJ())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73666Sve c73666Sve = this.LLLFF;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        this.LLLFF = null;
        removeCallbacks(getStartScrollRunnable());
        removeCallbacks(getDiggToScrollRunnable());
    }

    public final C79Q getBubbleListManager() {
        return this.LLLFFI;
    }

    public final int getFirstDataPositionInState() {
        return this.LLLILZ ? 1 : 0;
    }

    public final C1811278y getMMobEventParam() {
        return this.LLLIL;
    }

    public final boolean getReachEnd() {
        return this.LLLI;
    }

    public final boolean getStopFlag() {
        return this.LLLII;
    }

    public final void LJLLL(Comment comment) {
        o.LJIIIZ(comment, "comment");
        C71Y.LIZLLL("ReactionBubbleList", "from outside comment");
        C79Q c79q = this.LLLFFI;
        if (c79q != null && c79q.LJI()) {
            setVisibility(0);
            LJZ();
            if (this.LLLILZJ == 0 || (getState().LJI(this.LLLILZJ - 1) instanceof C1809778j) || (getState().LJI(this.LLLILZJ - 1) instanceof C1809978l)) {
                getState().LIZIZ(this.LLLILZJ, new C1809778j(comment, false, this.LLLIL));
            } else {
                getState().LIZIZ(getFirstDataPositionInState(), new C1809778j(comment, false, this.LLLIL));
            }
            postDelayed(getStartScrollRunnable(), 80L);
        }
    }

    public final void LJZI(boolean z) {
        this.LLLILZ = z;
        this.LLLILZJ = getFirstDataPositionInState();
        ViewGroup.LayoutParams layoutParams = this.LLLFZ.getLayoutParams();
        if (z) {
            layoutParams.height = (this.LLLIIIL - LLLJ) - LLLJIL;
        } else {
            layoutParams.height = this.LLLIIIL - LLLJ;
        }
        this.LLLFZ.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (event.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public final void setBubbleListManager(C79Q c79q) {
        this.LLLFFI = c79q;
    }

    public final void setMMobEventParam(C1811278y c1811278y) {
        this.LLLIL = c1811278y;
    }

    public final void setReachEnd(boolean z) {
        this.LLLI = z;
    }

    public final void setStopFlag(boolean z) {
        this.LLLII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLIIIL = LLLJL;
        this.LLLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1674));
        this.LLLIILIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1673));
        LJII(new C119394mN(0, C7MY.LIZIZ(8), 1), -1);
        setHasFixedSize(true);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.qy, this, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …bble_header, this, false)");
        this.LLLFZ = LLLLIILL;
        LLLLIILL.setTag(2);
        LJLJL(0, LLLLIILL);
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.qy, this, false);
        LJLJJLL(LLLLIILL2);
        LLLLIILL2.setTag(2);
        setItemAnimator(null);
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS191S0100000_3(this, 9));
        this.LLLILZLLLI = -1;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int LJIIIIZZ = getState().LJIIIIZZ();
        if (LJIIIIZZ >= 0) {
            int i5 = 0;
            while (true) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    float top = childAt.getTop();
                    if (top <= 0.0f) {
                        childAt.setVisibility(4);
                        if (o.LJ(childAt.getTag(), 1)) {
                            childAt.setTag(0);
                        }
                    } else {
                        int i6 = -1;
                        if (top <= C7MY.LIZIZ(20)) {
                            childAt.setVisibility(0);
                            childAt.setAlpha(top / LLLL);
                            if (getLayoutManager() != null && C0A2.LJJJLL(childAt) >= LJIIIIZZ && !this.LLLI) {
                                this.LLLI = true;
                                LJZ();
                                postDelayed(new ARunnableS39S0100000_3(this, 203), 40L);
                                if (LJLLJ()) {
                                    postDelayed(getStartScrollRunnable(), 2000L);
                                }
                            }
                        } else if (top <= C7MY.LIZIZ(188)) {
                            childAt.setVisibility(0);
                            childAt.setAlpha(1.0f);
                        } else if (top <= C7MY.LIZIZ(208)) {
                            childAt.setVisibility(0);
                            if (o.LJ(childAt.getTag(), 1) || o.LJ(childAt.getTag(), 2)) {
                                childAt.setAlpha(1.0f);
                            } else {
                                childAt.setAlpha((C7MY.LIZIZ(208) - top) / C7MY.LIZIZ(20));
                            }
                            if (getLayoutManager() != null) {
                                i6 = C0A2.LJJJLL(childAt);
                            }
                            if (i6 >= getFirstDataPositionInState() + 1) {
                                this.LLLILZJ = i6;
                                if (i6 > getState().LJIIIIZZ()) {
                                    this.LLLILZJ = getState().LJIIIIZZ();
                                }
                            }
                        } else {
                            childAt.setVisibility(4);
                            childAt.setAlpha(0.0f);
                            return;
                        }
                    }
                }
                if (i5 != LJIIIIZZ) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }
}
