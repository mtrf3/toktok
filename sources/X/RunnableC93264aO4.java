package X;

import android.content.Context;
import com.bytedance.pitaya.api.PitayaHostDefault$hostSetup$registeCallback$1;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.thirdcomponent.monitor.Monitor;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;

/* renamed from: X.aO4, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93264aO4 implements Runnable {
    public final /* synthetic */ C93258aNy LJLIL;
    public final /* synthetic */ PTYSetupInfo LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ SetupInfo LJLJJI;
    public final /* synthetic */ PitayaHostDefault$hostSetup$registeCallback$1 LJLJJL;
    public final /* synthetic */ boolean LJLJJLL = false;
    public final /* synthetic */ C34K LJLJL;

    public RunnableC93264aO4(C93258aNy c93258aNy, PTYSetupInfo pTYSetupInfo, Context context, SetupInfo setupInfo, PitayaHostDefault$hostSetup$registeCallback$1 pitayaHostDefault$hostSetup$registeCallback$1, C34K c34k) {
        this.LJLIL = c93258aNy;
        this.LJLILLLLZI = pTYSetupInfo;
        this.LJLJI = context;
        this.LJLJJI = setupInfo;
        this.LJLJJL = pitayaHostDefault$hostSetup$registeCallback$1;
        this.LJLJL = c34k;
    }

    public final void LIZ() {
        Monitor monitor = (Monitor) PitayaInnerServiceProvider.getService(Monitor.class);
        if (monitor != null) {
            monitor.init(this.LJLILLLLZI, "8326", "2.8.0.i18ntob-rc.58", this.LJLJI, "1", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/collect/");
        }
        this.LJLIL.LIZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL.element);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
