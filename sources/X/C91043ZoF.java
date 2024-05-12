package X;

import Y.IDRunnableS66S0000000_28;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.thread.ThreadLooperManager;
import com.bytedance.bdlocation.utils.background.ActivityLifecycleUtil;
import com.bytedance.bdlocation.utils.background.BackgroundProvider;
import com.bytedance.bdlocation.utils.background.DefaultBackgroundProvider;
import com.bytedance.bdlocation.utils.network.NetworkManager;

/* renamed from: X.ZoF, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91043ZoF {
    public static C91043ZoF LJII;
    public final Handler LIZ;
    public final Context LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ = true;
    public boolean LJFF = true;
    public final BroadcastReceiver LJI = new C91042ZoE(this);

    public static void LIZ() {
        if (LJII == null) {
            synchronized (C91043ZoF.class) {
                if (LJII == null) {
                    LJII = new C91043ZoF();
                }
            }
        }
    }

    public final void LIZIZ() {
        Logger.d("ColdBootManager registerLocationServiceObserver");
        if (this.LIZIZ == null || this.LJI == null || this.LIZJ) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.location.MODE_CHANGED");
            C16880lQ.LJJLIIIJILLIZJL(this.LJI, this.LIZIZ, intentFilter);
            this.LIZJ = true;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("registerLocationServiceObserver error");
            LIZ.append(th.toString());
            Logger.i(X1D.LIZIZ(LIZ));
        }
    }

    public C91043ZoF() {
        Handler handler = new Handler(ThreadLooperManager.getSchedulerWorker());
        this.LIZ = handler;
        Context context = BDLocationConfig.getContext();
        this.LIZIZ = context;
        if (!BDLocationConfig.isOverSeas()) {
            NetworkManager.getInstance().registerObserver(context);
        }
        Logger.d("ColdBootManager setLegitimate");
        handler.postDelayed(new IDRunnableS66S0000000_28(2), BDLocationConfig.getBootLegitimateTime());
        Logger.d("ColdBootManager registerBackgroundCallback");
        BackgroundProvider appBackgroundProvider = BDLocationConfig.getAppBackgroundProvider();
        BackgroundProvider backgroundProvider = appBackgroundProvider;
        if (appBackgroundProvider == null) {
            DefaultBackgroundProvider defaultBackgroundProvider = new DefaultBackgroundProvider();
            ActivityLifecycleUtil.register(defaultBackgroundProvider);
            ActivityLifecycleUtil.init();
            BDLocationConfig.setAppBackgroundProvider(defaultBackgroundProvider);
            Logger.i("set default AppBackgroundProvider");
            backgroundProvider = defaultBackgroundProvider;
        }
        backgroundProvider.addCallback(new C91052ZoO(this));
        LIZIZ();
        Logger.d("ColdBootManager init`");
    }
}
