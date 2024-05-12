package com.bytedance.helios.sdk.appops;

import X.C36836Ecy;
import X.C65852Psu;
import X.C65972Puq;
import X.C66030Pvm;
import X.C66031Pvn;
import X.C66059PwF;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66045Pw1;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.helios.api.HeliosService;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AppOpsService implements HeliosService {
    public Context mContext;
    public boolean mEnabled;

    @Override // X.InterfaceC66032Pvo
    public void onNewSettings(SettingsModel settingsModel) {
    }

    public void stop() {
    }

    @Override // com.bytedance.helios.api.HeliosService
    public void start() {
        if (this.mEnabled && C36836Ecy.LIZIZ(this.mContext)) {
            Context context = this.mContext;
            o.LJIIIZ(context, "context");
            if (AppOpsMonitor.LJFF == null) {
                synchronized (AppOpsMonitor.class) {
                    if (AppOpsMonitor.LJFF == null) {
                        AppOpsMonitor.LJFF = new AppOpsMonitor(context);
                    }
                }
            }
            AppOpsMonitor appOpsMonitor = AppOpsMonitor.LJFF;
            if (appOpsMonitor != null) {
                try {
                    AppOpsManager appOpsManager = appOpsMonitor.LIZ;
                    if (appOpsManager != null) {
                        HandlerThreadC64418PPy.LIZ();
                        appOpsManager.setOnOpNotedCallback(HandlerThreadC64418PPy.LJLJJL, appOpsMonitor.LIZLLL);
                    }
                } catch (Exception e) {
                    C66059PwF.LIZIZ(new C65852Psu((Thread) null, e, "label_app_ops_listen", (Map) null, 25));
                }
                Context context2 = appOpsMonitor.LIZIZ;
                if (context2 == null || !C36836Ecy.LIZIZ(context2)) {
                    return;
                }
                AppOpsManager appOpsManager2 = appOpsMonitor.LIZ;
                o.LJI(appOpsManager2);
                String[] strArr = AppOpsMonitor.LJ;
                HandlerThreadC64418PPy.LIZ();
                appOpsManager2.startWatchingActive(strArr, HandlerThreadC64418PPy.LJLJJL, appOpsMonitor.LIZJ);
            }
        }
    }

    @Override // X.InterfaceC66049Pw5
    public void init(Application application, InterfaceC66045Pw1 interfaceC66045Pw1, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mContext = application;
            C66031Pvn LJFF = interfaceC66045Pw1.LJFF();
            LJFF.getClass();
            this.mEnabled = C65972Puq.LJ.LIZLLL(new C66030Pvm(LJFF).LIZ().sampleRateConfig.appOpsConfig);
        }
    }
}
