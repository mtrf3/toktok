package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MJF implements MJP {
    public final /* synthetic */ DiscoverAndSearchFragment LIZ;

    public MJF(DiscoverAndSearchFragment discoverAndSearchFragment) {
        this.LIZ = discoverAndSearchFragment;
    }

    @Override // X.MJP
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        this.LIZ.wl("normal_search");
    }

    @Override // X.MJP
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        if (this.LIZ.mo49getActivity() != null && MSAdaptionService.LJIIL().LIZIZ(this.LIZ.mo49getActivity())) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZ);
            c26045AKb.LJIIIZ(this.LIZ.getString(R.string.f1i));
            c26045AKb.LJIIJ();
            return;
        }
        FMX.LJIILL("qr_code_scan_enter", new OSZ("discovery", "enter_from"));
        Context context = this.LIZ.getContext();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - DiscoverAndSearchFragment.LLFZ < 1000) {
            return;
        }
        DiscoverAndSearchFragment.LLFZ = elapsedRealtime;
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aweme/scan");
        buildRoute.withParam("finishAfterScan", false);
        buildRoute.open();
    }
}
