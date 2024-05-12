package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VWa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79864VWa extends C45621qg {
    public float LLFII;
    public float LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public final C16610kz LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        View view = this.LLIFFJFJJ;
        if (view != null) {
            if (C29306Beo.LJJIIJ(view)) {
                View view2 = this.LLIFFJFJJ;
                if (view2 != null) {
                    int translationY = (int) view2.getTranslationY();
                    View view3 = this.LLIFFJFJJ;
                    if (view3 != null) {
                        if (translationY > (-view3.getHeight())) {
                            return 1.0f;
                        }
                        return 0.0f;
                    }
                    o.LJIJI("bottom");
                    throw null;
                }
                o.LJIJI("bottom");
                throw null;
            }
            return 0.0f;
        }
        o.LJIJI("bottom");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof ScrollHeaderBehavior) {
                this.LLI = childAt;
            }
            if (c06c instanceof SuctionBottomBehavior) {
                this.LLIFFJFJJ = childAt;
                this.LLIIIILZ = ((SuctionBottomBehavior) c06c).LJ;
            }
        }
    }

    public final boolean getFixTouchWhenScroll() {
        return this.LLIIIJ;
    }

    public final int getLastHeight() {
        return this.LLIIIL;
    }

    public final void LJIJJLI(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i < 0) {
            View view = this.LLI;
            if (view != null) {
                return view.canScrollVertically(i);
            }
            o.LJIJI("header");
            throw null;
        }
        View view2 = this.LLIFFJFJJ;
        if (view2 != null) {
            int translationY = (int) view2.getTranslationY();
            View view3 = this.LLIFFJFJJ;
            if (view3 != null) {
                if (translationY == (-view3.getHeight())) {
                    View view4 = this.LLI;
                    if (view4 != null) {
                        if (!view4.canScrollVertically(i)) {
                            return false;
                        }
                    } else {
                        o.LJIJI("header");
                        throw null;
                    }
                }
                return true;
            }
            o.LJIJI("bottom");
            throw null;
        }
        o.LJIJI("bottom");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        int i;
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            this.LLIIIL = getHeight();
            this.LLFII = ev.getY();
            this.LLFZ = ev.getX();
            this.LLIIII = false;
            LJIJJLI(true);
        } else if (ev.getAction() == 2) {
            if (this.LLIIIJ && (i = this.LLIIIL) != 0) {
                ev.offsetLocation(0.0f, i - getHeight());
            }
            float y = ev.getY() - this.LLFII;
            if (Math.abs(y) < Math.abs(ev.getX() - this.LLFZ) && !this.LLIIII) {
                LJIJJLI(false);
            } else if (y > 0.0f) {
                View view = this.LLI;
                if (view != null) {
                    if (!view.canScrollVertically(-1)) {
                        View view2 = this.LLI;
                        if (view2 != null) {
                            if ((view2.getMeasuredHeight() == getMeasuredHeight() || !this.LLIIIILZ) && !this.LLIIII) {
                                LJIJJLI(false);
                            }
                        } else {
                            o.LJIJI("header");
                            throw null;
                        }
                    }
                    this.LLIIII = true;
                    LJIJJLI(true);
                } else {
                    o.LJIJI("header");
                    throw null;
                }
            } else if (y < 0.0f) {
                View view3 = this.LLIFFJFJJ;
                if (view3 != null) {
                    int translationY = (int) view3.getTranslationY();
                    View view4 = this.LLIFFJFJJ;
                    if (view4 != null) {
                        if (translationY == (-view4.getHeight())) {
                            View view5 = this.LLI;
                            if (view5 != null) {
                                if (!view5.canScrollVertically(1) && !this.LLIIII) {
                                    LJIJJLI(false);
                                }
                            } else {
                                o.LJIJI("header");
                                throw null;
                            }
                        }
                        this.LLIIII = true;
                        LJIJJLI(true);
                    } else {
                        o.LJIJI("bottom");
                        throw null;
                    }
                } else {
                    o.LJIJI("bottom");
                    throw null;
                }
            }
        }
        if (ev.getAction() == 1 || ev.getAction() == 3) {
            this.LLIIIL = 0;
        }
        if (ev.getAction() == 2) {
            if (!this.LLIIII) {
                return true;
            }
            return super.dispatchTouchEvent(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void setFixTouchWhenScroll(boolean z) {
        this.LLIIIJ = z;
    }

    public final void setLastHeight(int i) {
        this.LLIIIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79864VWa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16610kz c16610kz = new C16610kz(this);
        this.LLII = c16610kz;
        setWillNotDraw(false);
        c16610kz.LJIIJ(true);
    }

    @Override // X.C45621qg, X.C1V0
    public final void LJIILJJIL(int i, View target) {
        o.LJIIIZ(target, "target");
        super.LJIILJJIL(i, target);
        this.LLII.LJIIL(0);
    }

    @Override // X.C45621qg, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        this.LLII.LIZIZ(f, f2);
        return super.onNestedPreFling(target, f, f2);
    }

    @Override // X.C45621qg, X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        this.LLII.LJIIJJI(i, i2);
        super.LJJLIIJ(child, target, i, i2);
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C45621qg, X.InterfaceC43251mr
    public final void LJJIJIL(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        C80895Vox c80895Vox;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        super.LJJIJIL(target, i, i2, i3, i4, i5, consumed);
        if (i4 < 0 && (getParent() instanceof C80895Vox) && i5 == 1) {
            ViewParent parent = getParent();
            Boolean bool = null;
            if ((parent instanceof C80895Vox) && (c80895Vox = (C80895Vox) parent) != null) {
                EnumC80901Vp3 enumC80901Vp3 = c80895Vox.LJZL;
                boolean z = false;
                if ((enumC80901Vp3 == EnumC80901Vp3.ALWAYS || enumC80901Vp3 == EnumC80901Vp3.ONLY_TOP) && c80895Vox.getNestedScrollY() == 0) {
                    if (c80895Vox.LLIIIZ || c80895Vox.LLIIIJ) {
                        z = true;
                    }
                    c80895Vox.LIZIZ(-1, z, null, true);
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (C29306Beo.LJJIFFI(bool)) {
                consumed[1] = i4;
            }
        }
    }
}
