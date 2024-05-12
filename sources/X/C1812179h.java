package X;

import Y.ARunnableS39S0100000_3;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.79h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812179h extends SYL {
    public C73666Sve LLLFF;
    public final View LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public final boolean LLLIIIIL;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LJLLJ() {
        int i;
        int LIZIZ = C7MY.LIZIZ(56);
        Interpolator LIZLLL = C55953Lxd.LIZLLL();
        if (this.LLLIIIIL) {
            i = 700;
        } else {
            i = 550;
        }
        LJLIIL(0, LIZIZ, LIZLLL, i, false);
    }

    public final void LJLLLL() {
        long j;
        C71Y.LIZLLL("InteractionBubbleList", "[startAutoScroll]");
        this.LLLII = false;
        C73666Sve c73666Sve = this.LLLFF;
        if (c73666Sve != null && !c73666Sve.isDisposed()) {
            return;
        }
        C71Y.LIZ("InteractionBubbleList", "startAutoScroll: start real");
        setVisibility(0);
        if (this.LLLIIIIL && this.LLLFZ) {
            C71Y.LIZ("InteractionBubbleList", "new turn: trigger scroll");
            LJLLJ();
            this.LLLFZ = false;
        }
        if (this.LLLIIIIL) {
            j = 1600;
        } else {
            j = 2000;
        }
        this.LLLFF = (C73666Sve) new C73735Swl(AbstractC73745Swv.LJ(j, j, TimeUnit.MILLISECONDS, T16.LIZIZ)).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS55S0100000_3(this, 2));
    }

    public final void LJLLLLLL() {
        C71Y.LIZLLL("InteractionBubbleList", "[stopAutoScroll]");
        if (!this.LLLIIIIL) {
            C73666Sve c73666Sve = this.LLLFF;
            if (c73666Sve != null) {
                c73666Sve.dispose();
                return;
            }
            return;
        }
        this.LLLII = true;
    }

    public final void LJLLL() {
        LJLLLLLL();
        LJLI(0);
        if (this.LLLIIIIL) {
            C78886Uxe.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(104)), this.LLLFFI);
            this.LLLI = false;
            this.LLLFZ = true;
            this.LLLII = false;
        }
        getState().LJFF();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73666Sve c73666Sve = this.LLLFF;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        this.LLLFF = null;
    }

    public final int getCaptionFlag() {
        return this.LLLIIII;
    }

    public final boolean getReachEnd() {
        return this.LLLI;
    }

    public final boolean getStopFlag() {
        return this.LLLII;
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

    public final void setCaptionFlag(int i) {
        this.LLLIIII = i;
    }

    public final void setNewTurn(boolean z) {
        this.LLLFZ = z;
    }

    public final void setReachEnd(boolean z) {
        this.LLLI = z;
    }

    public final void setStopFlag(boolean z) {
        this.LLLII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812179h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLFZ = true;
        this.LLLIIIIL = C1806977h.LIZ();
        LJII(new C119394mN(0, C7MY.LIZIZ(8), 1), -1);
        setHasFixedSize(true);
        C210228Mw c210228Mw = C210228Mw.LIZIZ;
        View LIZIZ = c210228Mw.LIZIZ(context, R.layout.baj, this, null);
        this.LLLFFI = LIZIZ;
        LJLJL(0, LIZIZ);
        LJLJJLL(c210228Mw.LIZIZ(context, R.layout.baj, this, null));
        setItemAnimator(null);
        C71Y.LIZ("InteractionBubbleList", "init");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int LJJJLL;
        int LJJIIZ;
        long j;
        super.onScrollChanged(i, i2, i3, i4);
        int LJIIIIZZ = getState().LJIIIIZZ() + this.LLLIIII;
        if (LJIIIIZZ >= 0) {
            int i5 = 0;
            while (true) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    float top = childAt.getTop();
                    float f = 0.0f;
                    if (top <= 0.0f) {
                        childAt.setVisibility(4);
                    } else {
                        int i6 = -1;
                        if (top <= C7MY.LIZIZ(56)) {
                            childAt.setVisibility(0);
                            if (this.LLLIIIIL) {
                                top -= C7MY.LIZIZ(16);
                                LJJIIZ = C47135Ieh.LIZ(16, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                            } else {
                                LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
                            }
                            float f2 = top / LJJIIZ;
                            if (f2 >= 0.0f) {
                                f = f2;
                            }
                            childAt.setAlpha(f);
                            if (getLayoutManager() != null) {
                                i6 = C0A2.LJJJLL(childAt);
                            }
                            if ((i6 - getHeaderCount()) + 1 == getState().LJIIIIZZ()) {
                                boolean z = this.LLLIIIIL;
                                if (z) {
                                    if (!this.LLLI) {
                                        this.LLLI = true;
                                    }
                                }
                                ARunnableS39S0100000_3 aRunnableS39S0100000_3 = new ARunnableS39S0100000_3(this, 207);
                                if (z) {
                                    j = 1600;
                                } else {
                                    j = 2000;
                                }
                                postDelayed(aRunnableS39S0100000_3, j);
                            }
                        } else if (top <= C47135Ieh.LIZ(56, C7MY.LIZIZ(168))) {
                            childAt.setVisibility(0);
                            childAt.setAlpha(1.0f);
                        } else if (top <= C7MY.LIZIZ(168)) {
                            childAt.setVisibility(0);
                            float LJJIIZ2 = (((O6R.LJJIIZ(C32151Nz.LJIIZILJ(168)) - top) - C7MY.LIZIZ(56)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))) / O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
                            if (LJJIIZ2 >= 0.0f) {
                                f = LJJIIZ2;
                            }
                            childAt.setAlpha(f);
                            if (getLayoutManager() != null && (LJJJLL = C0A2.LJJJLL(childAt)) >= 1 && LJJJLL > getState().LJIIIIZZ()) {
                                getState().LJIIIIZZ();
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
