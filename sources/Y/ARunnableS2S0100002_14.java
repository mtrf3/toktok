package Y;

import X.AbstractC224038ql;
import X.AnonymousClass636;
import X.C136845Yq;
import X.C45804HyK;
import X.C60996Nwm;
import X.C79895VXf;
import X.C79898VXi;
import X.C81259Vup;
import X.C81260Vuq;
import X.C81261Vur;
import X.KL2;
import X.Y1G;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS2S0100002_14 implements Runnable {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ViewGroup.LayoutParams layoutParams;
        AbstractC224038ql abstractC224038ql = (AbstractC224038ql) this.l0;
        if (abstractC224038ql.LJLJJL == null) {
            Activity LJIJJ = C45804HyK.LJIJJ(((AbstractC224038ql) this.l0).LJLILLLLZI);
            o.LJI(LJIJJ);
            abstractC224038ql.LJLJJL = new C81259Vup(LJIJJ);
            C81259Vup c81259Vup = ((AbstractC224038ql) this.l0).LJLJJL;
            if (c81259Vup != null) {
                c81259Vup.LJIILL = 300L;
                c81259Vup.LJIIIIZZ = false;
                C136845Yq c136845Yq = c81259Vup.LIZIZ;
                if (c136845Yq != null) {
                    c136845Yq.setNeedPath(false);
                }
            }
            AbstractC224038ql abstractC224038ql2 = (AbstractC224038ql) this.l0;
            C81259Vup c81259Vup2 = abstractC224038ql2.LJLJJL;
            if (c81259Vup2 != null) {
                c81259Vup2.LJIIIZ = true;
                c81259Vup2.LJIIJ = true;
                c81259Vup2.LJ(abstractC224038ql2.LJIILLIIL());
            }
            AbstractC224038ql abstractC224038ql3 = (AbstractC224038ql) this.l0;
            C81259Vup c81259Vup3 = abstractC224038ql3.LJLJJL;
            o.LJI(c81259Vup3);
            abstractC224038ql3.LJIILJJIL(c81259Vup3);
        }
        AbstractC224038ql abstractC224038ql4 = (AbstractC224038ql) this.l0;
        C81259Vup c81259Vup4 = abstractC224038ql4.LJLJJL;
        if (c81259Vup4 != null) {
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.ed, abstractC224038ql4.LJLILLLLZI);
            c81259Vup4.LJII = LJIIIIZZ;
            C136845Yq c136845Yq2 = c81259Vup4.LIZIZ;
            if (c136845Yq2 != null) {
                c136845Yq2.setBgColor(LJIIIIZZ);
            }
        }
        C81259Vup c81259Vup5 = ((AbstractC224038ql) this.l0).LJLJJL;
        if (c81259Vup5 != null) {
            c81259Vup5.LIZJ();
        }
        if (((AbstractC224038ql) this.l0).LJLJJL != null && r0.LIZIZ() > C60996Nwm.LJIIIIZZ(((AbstractC224038ql) this.l0).LJLILLLLZI) - KL2.LIZJ(((AbstractC224038ql) this.l0).LJLILLLLZI, 32.0f)) {
            C81259Vup c81259Vup6 = ((AbstractC224038ql) this.l0).LJLJJL;
            o.LJI(c81259Vup6);
            int LJIIIIZZ2 = (int) (C60996Nwm.LJIIIIZZ(((AbstractC224038ql) this.l0).LJLILLLLZI) - KL2.LIZJ(((AbstractC224038ql) this.l0).LJLILLLLZI, 32.0f));
            c81259Vup6.LIZJ = LJIIIIZZ2;
            c81259Vup6.setWidth(LJIIIIZZ2);
            C136845Yq.LLFFF = LJIIIIZZ2;
            C81259Vup c81259Vup7 = ((AbstractC224038ql) this.l0).LJLJJL;
            o.LJI(c81259Vup7);
            View contentView = c81259Vup7.getContentView();
            o.LJII(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt = ((ViewGroup) contentView).getChildAt(0);
            if (childAt != null) {
                layoutParams = childAt.getLayoutParams();
            } else {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = (int) KL2.LIZJ(((AbstractC224038ql) this.l0).LJLILLLLZI, 12.0f);
                layoutParams2.rightMargin = (int) KL2.LIZJ(((AbstractC224038ql) this.l0).LJLILLLLZI, 12.0f);
            }
            C81259Vup c81259Vup8 = ((AbstractC224038ql) this.l0).LJLJJL;
            o.LJI(c81259Vup8);
            View contentView2 = c81259Vup8.getContentView();
            o.LJII(contentView2, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) contentView2).getChildAt(0);
            if (childAt2 != null) {
                childAt2.setLayoutParams(layoutParams2);
            }
            C81259Vup c81259Vup9 = ((AbstractC224038ql) this.l0).LJLJJL;
            if (c81259Vup9 != null) {
                c81259Vup9.LIZJ();
            }
        }
        int[] iArr = new int[2];
        ((AbstractC224038ql) this.l0).LJLJI.getLocationOnScreen(iArr);
        AbstractC224038ql abstractC224038ql5 = (AbstractC224038ql) this.l0;
        C81259Vup c81259Vup10 = abstractC224038ql5.LJLJJL;
        if (c81259Vup10 != null) {
            c81259Vup10.LJIIZILJ = new C81260Vuq(this.f1, this.f2, iArr);
            c81259Vup10.LJIJ = new C81261Vur(abstractC224038ql5);
            c81259Vup10.setOnDismissListener(new Y1G(abstractC224038ql5));
        }
        AbstractC224038ql abstractC224038ql6 = (AbstractC224038ql) this.l0;
        C81259Vup c81259Vup11 = abstractC224038ql6.LJLJJL;
        if (c81259Vup11 == null) {
            return;
        }
        c81259Vup11.LJIIL = -1L;
        c81259Vup11.LJFF(abstractC224038ql6.LJLJI);
    }

    public static final void run$0(ARunnableS2S0100002_14 aRunnableS2S0100002_14) {
        boolean LIZ;
        try {
            C79895VXf c79895VXf = (C79895VXf) aRunnableS2S0100002_14.l0;
            c79895VXf.LJLJJL.LIZLLL(aRunnableS2S0100002_14.f1, aRunnableS2S0100002_14.f2, c79895VXf.LJLILLLLZI, c79895VXf.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0100002_14 aRunnableS2S0100002_14) {
        boolean LIZ;
        try {
            C79898VXi c79898VXi = (C79898VXi) aRunnableS2S0100002_14.l0;
            c79898VXi.LJLZ.LIZLLL(aRunnableS2S0100002_14.f1, aRunnableS2S0100002_14.f2, c79898VXi.LJLLL, c79898VXi.LJLLLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S0100002_14 aRunnableS2S0100002_14) {
        boolean LIZ;
        try {
            aRunnableS2S0100002_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0100002_14(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
