package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVV implements Z8C {
    public final /* synthetic */ NVO LIZ;

    @Override // X.Z8C
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.Z8C
    public final void finish() {
    }

    public NVV(NVO nvo) {
        this.LIZ = nvo;
    }

    @Override // X.Z8C
    public final void LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJLIL.LJIIIIZZ(activity);
        this.LIZ.LJ();
        this.LIZ.getClass();
        this.LIZ.LJJLIIIJILLIZJL("onCreate");
    }

    @Override // X.Z8C
    public final void LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void LJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void LJFF(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onActivityPostDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LLLJL();
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            C59832Ne0.LIZ(this.LIZ.LJLJL);
        }
        this.LIZ.LJJLIIIJJI(activity);
        this.LIZ.LJJLIIIJILLIZJL("onDestroy");
    }

    @Override // X.Z8C
    public final void onActivityPostPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJJLIIIJILLIZJL("onPause");
        NVO nvo = this.LIZ;
        WebKitView webKitView = nvo.LJLJL;
        if (webKitView != null) {
            webKitView.onPause();
            if (nvo.LJJLIIIIJ()) {
                webKitView.pauseTimers();
            }
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LIZ.LJLIL.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJFF(this.LIZ.LJLJL, false);
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NVO nvo2 = this.LIZ;
            C59832Ne0.LIZIZ(nvo2.LJLLLLLL, nvo2.LJLJL);
        }
        long currentTimeMillis = System.currentTimeMillis();
        NVO nvo3 = this.LIZ;
        long j = currentTimeMillis - nvo3.LJZL;
        nvo3.LJZL = 0L;
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(j, "duration").LIZ);
        this.LIZ.LJJLIIIJJIZ(activity);
    }

    @Override // X.Z8C
    public final void onActivityPostResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJJLIIIJILLIZJL("onResume");
        WebKitView webKitView = this.LIZ.LJLJL;
        if (webKitView != null) {
            webKitView.onResume();
            webKitView.resumeTimers();
        }
        this.LIZ.LJLIL.LIZ(WalletBusiness.class);
        this.LIZ.LJZL = System.currentTimeMillis();
        NVO nvo = this.LIZ;
        nvo.getClass();
        C58909NAb.LIZ.getClass();
        InterfaceC59440NUm LIZ = NH3.LIZ();
        if (LIZ != null) {
            ((NTF) LIZ).LIZJ(nvo, nvo.LJLJL);
        }
    }

    @Override // X.Z8C
    public final void onActivityPostStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJJLIIIJILLIZJL("onStart");
    }

    @Override // X.Z8C
    public final void onActivityPostStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJJLIIIJILLIZJL("onStop");
    }

    @Override // X.Z8C
    public final void onActivityPreDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onActivityPrePaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onActivityPreResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onActivityPreStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onActivityPreStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.Z8C
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.Z8C
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // X.Z8C
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // X.Z8C
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE = this.LIZ.LJLJJLL;
        if (viewOnClickListenerC59660NbE == null) {
            return;
        }
        viewOnClickListenerC59660NbE.setLayoutParams(new FrameLayout.LayoutParams((int) KL2.LIZJ(activity, newConfig.screenWidthDp), (int) KL2.LIZJ(activity, newConfig.screenHeightDp)));
    }

    @Override // X.Z8C
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LIZ.LJLIL.LIZ(WalletBusiness.class) != null) {
            WalletBusiness.LIZ(this.LIZ.LJLLI, i, i2, intent);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.Z8C
    public final void LJI(Activity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(activity, i, grantResults);
    }
}
