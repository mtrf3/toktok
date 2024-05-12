package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVU implements InterfaceC60850NuQ {
    public final /* synthetic */ NVO LJLIL;

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC60850NuQ
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC60850NuQ
    public final void finish() {
    }

    @Override // X.M2J
    public final void release() {
    }

    public NVU(NVO nvo) {
        this.LJLIL = nvo;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJJLIIIJILLIZJL("onPause");
        NVO nvo = this.LJLIL;
        WebKitView webKitView = nvo.LJLJL;
        if (webKitView != null) {
            webKitView.onPause();
            if (nvo.LJJLIIIIJ()) {
                webKitView.pauseTimers();
            }
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLIL.LJLIL.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJFF(this.LJLIL.LJLJL, false);
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NVO nvo2 = this.LJLIL;
            C59832Ne0.LIZIZ(nvo2.LJLLLLLL, nvo2.LJLJL);
        }
        long currentTimeMillis = System.currentTimeMillis();
        NVO nvo3 = this.LJLIL;
        long j = currentTimeMillis - nvo3.LJZL;
        nvo3.LJZL = 0L;
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(j, "duration").LIZ);
        this.LJLIL.LJJLIIIJJIZ(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LLLJL();
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            C59832Ne0.LIZ(this.LJLIL.LJLJL);
        }
        this.LJLIL.LJJLIIIJJI(activity);
        this.LJLIL.LJJLIIIJILLIZJL("onDestroy");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJJLIIIJILLIZJL("onStop");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJJLIIIJILLIZJL("onStart");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIFFI(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJJLIIIJILLIZJL("onResume");
        WebKitView webKitView = this.LJLIL.LJLJL;
        if (webKitView != null) {
            webKitView.onResume();
            webKitView.resumeTimers();
        }
        this.LJLIL.LJLIL.LIZ(WalletBusiness.class);
        this.LJLIL.LJZL = System.currentTimeMillis();
        NVO nvo = this.LJLIL;
        nvo.getClass();
        C58909NAb.LIZ.getClass();
        InterfaceC59440NUm LIZ = NH3.LIZ();
        if (LIZ != null) {
            ((NTF) LIZ).LIZJ(nvo, nvo.LJLJL);
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final boolean LJJIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        return false;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJLIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIZ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIJ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIIZZ(SparkActivity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE = this.LJLIL.LJLJJLL;
        if (viewOnClickListenerC59660NbE == null) {
            return;
        }
        viewOnClickListenerC59660NbE.setLayoutParams(new FrameLayout.LayoutParams((int) KL2.LIZJ(activity, newConfig.screenWidthDp), (int) KL2.LIZJ(activity, newConfig.screenHeightDp)));
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIZ(SparkActivity activity, boolean z) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILLIIL(SparkActivity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJLIL.LJIIIIZZ(activity);
        this.LJLIL.LJ();
        this.LJLIL.getClass();
        this.LJLIL.LJJLIIIJILLIZJL("onCreate");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJZLJL(SparkActivity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZ(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIIJIL(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LJLIL.LJLIL.LIZ(WalletBusiness.class) != null) {
            WalletBusiness.LIZ(this.LJLIL.LJLLI, i, i2, intent);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(activity, i, grantResults);
    }
}
