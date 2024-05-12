package X;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.bytedance.apm6.traffic.TrafficTransportService;

/* loaded from: classes12.dex */
public final class PHT implements PHP {
    public PHW LJLIL;
    public boolean LJLILLLLZI;
    public final ServiceConnectionC64187PHb LJLJI = new ServiceConnectionC64187PHb(this);

    @Override // X.PHP
    public final void LIZIZ(PGK pgk) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SubCollector updateConfig: ");
            LIZ.append(pgk.LIZIZ);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        if (pgk.LIZIZ) {
            EGD.LIZ.start();
        }
    }

    @Override // X.PHP
    public final void LJJJJJ(String str) {
        PHW phw = this.LJLIL;
        if (phw != null) {
            try {
                phw.LJJJJJ(str);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // X.PHP
    public final void LIZ(boolean z, boolean z2) {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        PGH.LIZ(PHB.class);
        Application application = C78248UnM.LJLJJI;
        C16880lQ.LLLJL(application, new Intent(application, (Class<?>) TrafficTransportService.class), this.LJLJI, 1);
    }

    @Override // X.PHP
    public final void LJJJLIIL(String str, boolean z) {
        PHW phw = this.LJLIL;
        if (phw != null) {
            try {
                phw.LJJJLIIL(str, z);
            } catch (RemoteException unused) {
            }
        }
    }
}
