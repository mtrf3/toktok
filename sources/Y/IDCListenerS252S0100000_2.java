package Y;

import X.AbstractActivityC162676Zz;
import X.C140525fM;
import X.C157226Fa;
import X.C160316Qx;
import X.C61410O8g;
import X.C6BD;
import X.C6OL;
import X.C6R0;
import X.C81184Vtc;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCListenerS252S0100000_2 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS252S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int LIZJ;
        if (i4 == i8 || !((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).LLLF()) {
            return;
        }
        if (((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).LLLFF() instanceof C157226Fa) {
            Activity activity = ((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).mActivity;
            if (activity != null) {
                LIZJ = C61410O8g.LIZJ(activity);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            Activity activity2 = ((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).mActivity;
            if (activity2 != null) {
                LIZJ = C81184Vtc.LIZJ(activity2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).LLLFF() instanceof C157226Fa) {
            C157226Fa.LIZ.LJIILJJIL(LIZJ);
            ((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).LLLFFI();
            return;
        }
        BaseScreenAdaptScene baseScreenAdaptScene = (BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0;
        if (baseScreenAdaptScene.LJLJLLL == LIZJ) {
            return;
        }
        baseScreenAdaptScene.LJLJLLL = LIZJ;
        baseScreenAdaptScene.LLLFF().LIZJ(LIZJ);
        ((BaseScreenAdaptScene) iDCListenerS252S0100000_2.l0).LLLFFI();
    }

    public static final void onLayoutChange$1(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C6OL c6ol = (C6OL) iDCListenerS252S0100000_2.l0;
        float LIZLLL = c6ol.LIZLLL() / c6ol.LIZJ();
        if (LIZLLL == c6ol.LIZLLL) {
            return;
        }
        c6ol.LIZJ.invoke(Float.valueOf(LIZLLL));
        c6ol.LIZLLL = LIZLLL;
    }

    public static final void onLayoutChange$2(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C6BD c6bd = (C6BD) iDCListenerS252S0100000_2.l0;
        float LIZLLL = c6bd.LIZLLL() / c6bd.LIZJ();
        if (LIZLLL == c6bd.LIZLLL) {
            return;
        }
        c6bd.LIZJ.invoke(Float.valueOf(LIZLLL));
        c6bd.LIZLLL = LIZLLL;
    }

    public static final void onLayoutChange$3(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS252S0100000_2);
        ((C140525fM) iDCListenerS252S0100000_2.l0).LIZLLL();
    }

    public static final void onLayoutChange$4(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int LIZJ;
        AbstractActivityC162676Zz abstractActivityC162676Zz = (AbstractActivityC162676Zz) iDCListenerS252S0100000_2.l0;
        if (i4 != i8) {
            if (abstractActivityC162676Zz.LLIIIJ() instanceof C157226Fa) {
                LIZJ = C61410O8g.LIZJ(abstractActivityC162676Zz);
            } else {
                LIZJ = C81184Vtc.LIZJ(abstractActivityC162676Zz);
            }
            if (abstractActivityC162676Zz.LLIIIJ() instanceof C157226Fa) {
                C157226Fa.LIZ.LJIILJJIL(LIZJ);
                abstractActivityC162676Zz.LLIILII();
                return;
            } else {
                if (abstractActivityC162676Zz.LJLJL == LIZJ) {
                    return;
                }
                abstractActivityC162676Zz.LJLJL = LIZJ;
                abstractActivityC162676Zz.LLIIIJ().LIZJ(LIZJ);
                abstractActivityC162676Zz.LLIILII();
                return;
            }
        }
        abstractActivityC162676Zz.getClass();
    }

    public static final void onLayoutChange$5(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS252S0100000_2);
        C6R0 c6r0 = ((C160316Qx) iDCListenerS252S0100000_2.l0).LJIIJ;
        if (c6r0 != null) {
            c6r0.getVideoEditView().LJJIJLIJ((int) ((C160316Qx) iDCListenerS252S0100000_2.l0).LJIJ().LJ.LJ, (int) ((C160316Qx) iDCListenerS252S0100000_2.l0).LJIJ().LJ.LJFF, false);
            C6R0 c6r02 = ((C160316Qx) iDCListenerS252S0100000_2.l0).LJIIJ;
            if (c6r02 != null) {
                c6r02.getMultiVideoVideoModel().LJLJI.setValue(Long.valueOf(((C160316Qx) iDCListenerS252S0100000_2.l0).LJIJ().LJ.LJ));
                return;
            } else {
                o.LJIJI("stickerDurationEditView");
                throw null;
            }
        }
        o.LJIJI("stickerDurationEditView");
        throw null;
    }

    public static final void onLayoutChange$6(IDCListenerS252S0100000_2 iDCListenerS252S0100000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS252S0100000_2);
        ((C6R0) iDCListenerS252S0100000_2.l0).LIZ();
    }
}
