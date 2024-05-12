package Y;

import X.C15380j0;
import X.C32676Cs4;
import X.C32694CsM;
import X.C32792Ctw;
import X.CCJ;
import X.RunnableC31065CHd;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;

/* loaded from: classes6.dex */
public class IDDListenerS392S0100000_5 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            case 4:
                return onPreDraw$4(this);
            case 5:
                return onPreDraw$5(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        C32676Cs4 c32676Cs4 = (C32676Cs4) iDDListenerS392S0100000_5.l0;
        if (c32676Cs4.LLJJI) {
            c32676Cs4.LLJJI = false;
            C32694CsM.LJJIJIL = SystemClock.uptimeMillis();
            long uptimeMillis = SystemClock.uptimeMillis();
            C32676Cs4 c32676Cs42 = (C32676Cs4) iDDListenerS392S0100000_5.l0;
            long j = uptimeMillis - c32676Cs42.LLJJIJI;
            C32694CsM.LJIL = j;
            C32792Ctw.LIZIZ(j, c32676Cs42.LLJJIJIIJIL);
        }
        RunnableC31065CHd runnableC31065CHd = ((C32676Cs4) iDDListenerS392S0100000_5.l0).LJLZ;
        if (runnableC31065CHd != null && (viewTreeObserver = runnableC31065CHd.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS392S0100000_5);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewTreeObserver viewTreeObserver;
        View view = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS392S0100000_5);
        }
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            View view2 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
            if (view2 != null) {
                View view3 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
                if (view3 != null) {
                    i3 = view3.getWidth();
                } else {
                    i3 = 0;
                }
                int i5 = (-i3) * 2;
                View view4 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
                if (view4 != null) {
                    i4 = view4.getWidth();
                } else {
                    i4 = 0;
                }
                view2.setPadding(i5, 0, i4 * 2, 0);
                return true;
            }
            return true;
        }
        View view5 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view5 == null) {
            return true;
        }
        View view6 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view6 != null) {
            i = view6.getWidth();
        } else {
            i = 0;
        }
        int i6 = i * 2;
        View view7 = ((LandscapePublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view7 != null) {
            i2 = view7.getWidth();
        } else {
            i2 = 0;
        }
        view5.setPadding(i6, 0, (-i2) * 2, 0);
        return true;
    }

    public static final boolean onPreDraw$2(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        View view = ((PortraitPublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS392S0100000_5);
        }
        View view2 = ((PortraitPublicScreenWidget) iDDListenerS392S0100000_5.l0).getView();
        if (view2 == null) {
            return true;
        }
        view2.setAlpha(0.0f);
        return true;
    }

    public static final boolean onPreDraw$3(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        ((View) iDDListenerS392S0100000_5.l0).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS392S0100000_5);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) iDDListenerS392S0100000_5.l0).getLayoutParams();
        marginLayoutParams.setMarginStart(((View) iDDListenerS392S0100000_5.l0).getWidth() * 2);
        ((View) iDDListenerS392S0100000_5.l0).setLayoutParams(marginLayoutParams);
        return true;
    }

    public static final boolean onPreDraw$4(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        ((View) iDDListenerS392S0100000_5.l0).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS392S0100000_5);
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            View view = (View) iDDListenerS392S0100000_5.l0;
            view.setPadding((-view.getWidth()) * 2, 0, ((View) iDDListenerS392S0100000_5.l0).getWidth() * 2, 0);
            return true;
        }
        View view2 = (View) iDDListenerS392S0100000_5.l0;
        view2.setPadding(view2.getWidth() * 2, 0, (-((View) iDDListenerS392S0100000_5.l0).getWidth()) * 2, 0);
        return true;
    }

    public static final boolean onPreDraw$5(IDDListenerS392S0100000_5 iDDListenerS392S0100000_5) {
        ((View) iDDListenerS392S0100000_5.l0).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS392S0100000_5);
        ((View) iDDListenerS392S0100000_5.l0).setAlpha(0.0f);
        return true;
    }

    public IDDListenerS392S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
