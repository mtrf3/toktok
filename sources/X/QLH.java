package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public final class QLH extends RunnableC39007FSp {
    public final /* synthetic */ QLV LJLJJL;

    public final void LIZJ() {
        super.run();
        DeviceRegisterManager.tryWaitDeviceIdInit();
        try {
            LinkedList linkedList = new LinkedList();
            synchronized (this.LJLJJL.LIZ) {
                linkedList.addAll(this.LJLJJL.LIZ);
                this.LJLJJL.LIZ.clear();
            }
            while (!linkedList.isEmpty()) {
                QLO qlo = (QLO) linkedList.poll();
                AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(null, qlo.LIZ, qlo.LIZIZ, qlo.LIZJ, qlo.LIZLLL, qlo.LJ, qlo.LJFF, qlo.LJI);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QLH(QLV qlv) {
        super((Object) null);
        this.LJLJJL = qlv;
    }
}
