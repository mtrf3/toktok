package X;

import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import com.bytedance.bdturing.verify.RiskControlService;

/* loaded from: classes12.dex */
public final class QNF implements InterfaceC66884QMu {
    public final /* synthetic */ RiskControlService LIZ;
    public final /* synthetic */ QNH LIZIZ;
    public final /* synthetic */ QNS LIZJ;

    public QNF(RiskControlService riskControlService, QNH qnh, QNS qns) {
        this.LIZ = riskControlService;
        this.LIZIZ = qnh;
        this.LIZJ = qns;
    }

    @Override // X.InterfaceC66884QMu
    public final void LIZ(int i, long j, String str) {
        Activity activity;
        Activity activity2 = this.LIZIZ.LIZ;
        if ((activity2 == null || !activity2.isFinishing()) && (activity = this.LIZIZ.LIZ) != null) {
            activity.runOnUiThread(new ARunnableS47S0100000_11(this, 16));
        }
    }
}
