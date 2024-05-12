package Y;

import X.OO3;
import X.OO7;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS7S0310000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        FrameLayout frameLayout;
        Object obj;
        float bottom = ((((FrameLayout) this.l0).getBottom() + ((FrameLayout) this.l0).getTop()) / 2.0f) - ((((FrameLayout) this.l1).getBottom() + ((FrameLayout) this.l1).getTop()) / 2.0f);
        if (!this.z3 && ((OO3) this.l2).LIZJ == bottom) {
            z = false;
        } else {
            z = true;
        }
        OO3 oo3 = (OO3) this.l2;
        oo3.LIZJ = bottom;
        if (!z || (frameLayout = oo3.LJIL) == null) {
            return;
        }
        if (oo3.LJ < 0.0f || oo3.LJFF < 0.0f) {
            o.LJII(frameLayout.getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
            oo3.LIZLLL = ((View) r0).getMeasuredHeight();
            FrameLayout frameLayout2 = oo3.LJIL;
            if (frameLayout2 != null) {
                obj = frameLayout2.getParent();
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type android.view.ViewGroup");
            float measuredWidth = ((View) obj).getMeasuredWidth();
            float f = oo3.LIZLLL;
            if (f != 0.0f) {
                oo3.LJ = OO3.LJJJJZ / f;
            }
            if (measuredWidth != 0.0f) {
                oo3.LJFF = OO3.LJJJJLL / measuredWidth;
            }
        }
        if (!oo3.LJIIJJI) {
            return;
        }
        oo3.LIZ.LJIIIIZZ("[recoverScalingStates] video scaled");
        oo3.LJIJ(oo3.LJIL, 1.0f);
        oo3.LJIILLIIL(1.0f);
        oo3.LJIIZILJ(1.0f);
        oo3.LJIIIZ(true);
        OO7 oo7 = oo3.LJIJ;
        if (oo7 != null) {
            oo7.setAlpha(1.0f);
        }
        View view = oo3.LJJIIZ;
        if (view == null) {
            return;
        }
        view.setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S0310000_10.LIZ$1():void");
    }

    public static final void run$0(ARunnableS7S0310000_10 aRunnableS7S0310000_10) {
        boolean LIZ;
        try {
            aRunnableS7S0310000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0310000_10 aRunnableS7S0310000_10) {
        boolean LIZ;
        try {
            aRunnableS7S0310000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0310000_10(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }
}
