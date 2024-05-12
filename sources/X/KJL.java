package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJL implements KG2 {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZLLL;
    public int LJ;
    public final Rect LJFF = new Rect();

    public final int LJFF() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final KJM LJI() {
        boolean z;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            z = viewGroup.getLocalVisibleRect(this.LJFF);
        } else {
            z = true;
        }
        Rect rect = this.LJFF;
        if (rect.top == 0) {
            return KJO.LIZIZ;
        }
        if (!z) {
            return KJN.LIZIZ;
        }
        KJP kjp = KJP.LIZIZ;
        kjp.LIZ = (r2 - r0) / rect.bottom;
        return kjp;
    }

    @Override // X.KG2
    public final boolean LIZ() {
        if (o.LJ(LJI(), KJN.LIZIZ)) {
            if (this.LJ != LJFF()) {
                LJII(LJFF());
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.KG2
    public final boolean LIZJ() {
        if (o.LJ(LJI(), KJO.LIZIZ)) {
            if (this.LJ != 0) {
                LJII(0);
            }
            return false;
        }
        return true;
    }

    @Override // X.KG2
    public final void LJ() {
        KJM LJI = LJI();
        if (o.LJ(LJI, KJO.LIZIZ)) {
            LJII(0);
            return;
        }
        if (o.LJ(LJI, KJN.LIZIZ)) {
            View view = this.LIZIZ;
            if (view != null) {
                view.scrollBy(0, -LJFF());
            }
            LJII(0);
            return;
        }
        int i = this.LJ;
        if (i <= 0) {
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            view2.scrollBy(0, -i);
        }
        LJII(0);
    }

    public final void LJII(int i) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        this.LJ = i;
        View view = this.LIZIZ;
        int i3 = 0;
        if (view != null && view.getMeasuredHeight() != 0) {
            ViewGroup viewGroup = this.LIZJ;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    View view2 = this.LIZIZ;
                    if (view2 != null) {
                        i2 = view2.getMeasuredHeight();
                    } else {
                        i2 = 0;
                    }
                    ViewGroup viewGroup2 = this.LIZ;
                    if (viewGroup2 != null) {
                        i3 = viewGroup2.getMeasuredHeight();
                    }
                    layoutParams.height = (i2 - i3) + i;
                }
            } else {
                layoutParams = null;
            }
            ViewGroup viewGroup3 = this.LIZJ;
            if (viewGroup3 != null) {
                viewGroup3.setLayoutParams(layoutParams);
            }
            if (LJI().LIZ <= 0.7f) {
                this.LIZLLL.invoke(Boolean.FALSE);
            } else {
                this.LIZLLL.invoke(Boolean.TRUE);
            }
        }
    }

    @Override // X.KG2
    public final void LIZIZ(int i, int[] offsetInWindow) {
        o.LJIIIZ(offsetInWindow, "offsetInWindow");
        if (this.LJ + i <= LJFF()) {
            View view = this.LIZIZ;
            if (view != null) {
                view.scrollBy(0, i);
            }
            LJII(this.LJ + i);
            offsetInWindow[1] = i;
            return;
        }
        if (this.LJ + i <= LJFF() || this.LJ >= LJFF()) {
            return;
        }
        int LJFF = LJFF() - this.LJ;
        View view2 = this.LIZIZ;
        if (view2 != null) {
            view2.scrollBy(0, LJFF);
        }
        LJII(this.LJ + LJFF);
        offsetInWindow[1] = LJFF;
    }

    @Override // X.KG2
    public final void LIZLLL(int i, int[] offsetInWindow) {
        o.LJIIIZ(offsetInWindow, "offsetInWindow");
        if (Math.abs(this.LJ + i) <= LJFF() && this.LJ + i >= 0) {
            View view = this.LIZIZ;
            if (view != null) {
                view.scrollBy(0, i);
            }
            LJII(this.LJ + i);
            offsetInWindow[1] = i;
            return;
        }
        int i2 = this.LJ;
        if (i2 <= 0) {
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            view2.scrollBy(0, -i2);
        }
        int i3 = this.LJ;
        LJII((-i3) + i3);
        offsetInWindow[1] = -this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KJL(ViewGroup viewGroup, View view, ViewGroup viewGroup2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = viewGroup2;
        this.LIZLLL = interfaceC88472Yns;
    }
}
