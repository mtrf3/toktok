package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pvy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66042Pvy implements Runnable {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        InterfaceC37650Eq6 interfaceC37650Eq6;
        if (C37651Eq7.LIZJ()) {
            try {
                long j = this.LJLILLLLZI;
                long j2 = this.LJLJI;
                C66044Pw0 c66044Pw0 = new C66044Pw0(this);
                HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
                if (settingsModel != null && settingsModel.alogEnabled && (interfaceC37650Eq6 = C37651Eq7.LIZJ) != null) {
                    interfaceC37650Eq6.LIZIZ(j, j2, c66044Pw0);
                    return;
                }
                return;
            } catch (Exception e) {
                C66059PwF.LIZIZ(C66043Pvz.LIZIZ("-101", e.getMessage()));
                C66059PwF.LIZIZ(new C65852Psu((Thread) null, (Throwable) e, "label_upload_alog", (java.util.Map) (0 == true ? 1 : 0), 25));
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryAgain:");
        LIZ.append("-103");
        C66063PwJ.LIZIZ("ALogUploader", X1D.LIZIZ(LIZ));
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i <= 6) {
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(this, 10000L);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isFirstStart=");
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        LIZ2.append(heliosEnvImpl2.LIZLLL);
        C66059PwF.LIZIZ(C66043Pvz.LIZIZ("-103", X1D.LIZIZ(LIZ2)));
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

    public RunnableC66042Pvy(long j, long j2) {
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
