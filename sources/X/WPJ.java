package X;

import Y.ALAdapterS11S0100000_14;
import Y.AObserverS66S0200000_2;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPJ {
    public static final /* synthetic */ int LJIIL = 0;
    public final WPK LIZ;
    public WPI LIZIZ;
    public FilterBean LIZJ;
    public FilterBean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public final ALAdapterS11S0100000_14 LJI;
    public final AUListenerS101S0100000_14 LJII;
    public final InterfaceC152085y0 LJIIIIZZ;
    public final InterfaceC147145q2 LJIIIZ;
    public final InterfaceC82236WPg LJIIJ;
    public final LiveData<C140415fB> LJIIJJI;

    public final void LIZ(float f) {
        char c;
        int i;
        FilterBean LJIILJJIL;
        if (f == 0.0f) {
            c = 0;
        } else if (f < 0.0f) {
            c = 65535;
        } else {
            c = 1;
        }
        WPX LJJJJIZL = this.LJIIJ.LJJJJIZL();
        int LJIJ = TMC.LJIJ(this.LIZJ, LJJJJIZL);
        if (c == 0) {
            i = LJIJ;
        } else if (c == 65535) {
            i = LJIJ;
            LJIJ--;
        } else {
            i = LJIJ + 1;
        }
        FilterBean filterBean = null;
        if (LJIJ < 0) {
            LJIILJJIL = null;
        } else {
            LJIILJJIL = TMC.LJIILJJIL(LJJJJIZL, LJIJ);
        }
        if (i < TMC.LJIIZILJ(LJJJJIZL).size()) {
            filterBean = TMC.LJIILJJIL(LJJJJIZL, i);
        }
        WPI wpi = this.LIZIZ;
        if (wpi != null) {
            wpi.LIZIZ(LJIILJJIL, filterBean, f);
        }
    }

    public final boolean LIZIZ(float f, float f2) {
        ValueAnimator ofFloat;
        float abs;
        float abs2;
        if (!this.LJ) {
            return false;
        }
        int width = this.LJIIIIZZ.getRootView().getWidth();
        WPX filterSource = this.LJIIJ.LJJJJIZL();
        if (Math.signum(f2) == Math.signum(f)) {
            this.LIZLLL = this.LIZJ;
            ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
            o.LJIIIIZZ(ofFloat, "ValueAnimator.ofFloat(fraction, 0f)");
            abs2 = Math.abs(f);
        } else {
            if (f >= 1.0E-5f) {
                o.LJIIIZ(filterSource, "filterSource");
                this.LIZLLL = TMC.LJIILJJIL(filterSource, Math.max(0, TMC.LJIJ(this.LIZJ, filterSource) - 1));
                ofFloat = ValueAnimator.ofFloat(f2, -1.0f);
                o.LJIIIIZZ(ofFloat, "ValueAnimator.ofFloat(fraction, -1f)");
            } else {
                o.LJIIIZ(filterSource, "filterSource");
                this.LIZLLL = TMC.LJIILJJIL(filterSource, Math.min(TMC.LJIIZILJ(filterSource).size() - 1, TMC.LJIJ(this.LIZJ, filterSource) + 1));
                ofFloat = ValueAnimator.ofFloat(f2, 1.0f);
                o.LJIIIIZZ(ofFloat, "ValueAnimator.ofFloat(fraction, 1f)");
            }
            abs2 = Math.abs(f);
        }
        long min = Math.min(abs / ((abs2 / 1000) / 2), 400L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(min);
        ofFloat.addUpdateListener(this.LJII);
        ofFloat.addListener(this.LJI);
        ofFloat.start();
        return true;
    }

    public WPJ(WPF wpf, InterfaceC152085y0 gestureService, InterfaceC147145q2 filterIndicatorApi, InterfaceC82236WPg filterRepository, LiveData currentSelectedFilter, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(gestureService, "gestureService");
        o.LJIIIZ(filterIndicatorApi, "filterIndicatorApi");
        o.LJIIIZ(filterRepository, "filterRepository");
        o.LJIIIZ(currentSelectedFilter, "currentSelectedFilter");
        this.LJIIIIZZ = gestureService;
        this.LJIIIZ = filterIndicatorApi;
        this.LJIIJ = filterRepository;
        this.LJIIJJI = currentSelectedFilter;
        WPK wpk = new WPK(this, gestureService.getRootView());
        this.LIZ = wpk;
        this.LJFF = -1;
        gestureService.LIZIZ(new C6V4(0, wpk));
        currentSelectedFilter.observe(wpf, new AObserverS66S0200000_2(this, aqS180S0100000_14, 20));
        this.LJI = new ALAdapterS11S0100000_14(this, 34);
        this.LJII = new AUListenerS101S0100000_14(this, 45);
    }
}
