package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import java.net.MalformedURLException;

/* renamed from: X.Pao, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64730Pao implements InterfaceC64790Pbm {
    public static volatile C64730Pao LIZJ;
    public final C64693PaD LIZ;
    public volatile int LIZIZ;

    public C64730Pao(C64693PaD c64693PaD) {
        this.LIZ = c64693PaD;
    }

    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        EnumC64762PbK enumC64762PbK;
        try {
            return this.LIZ.LIZ(request);
        } catch (Throwable th) {
            if (!(th instanceof MalformedURLException) && ((th.getMessage() == null || !th.getMessage().contains("MalformedURLException")) && ((enumC64762PbK = QE7.LIZ().LIZ) == EnumC64762PbK.PRE_INIT || enumC64762PbK == EnumC64762PbK.FORCE_INIT))) {
                int i = this.LIZIZ + 1;
                this.LIZIZ = i;
                if (i > 3) {
                    C64752PbA.LIZJ = true;
                    String LJJIL = V1M.LJJIL(th);
                    C64752PbA.LJ = LJJIL;
                    if (LJJIL.length() > 256) {
                        C64752PbA.LJ = C64752PbA.LJ.substring(0, 256);
                    }
                }
            }
            TTNetInit.notifyColdStartFinish();
            Context context = TTNetInit.getTTNetDepend().getContext();
            C64667PZn LJII = C64667PZn.LJII(context);
            if (C36841Ed3.LIZJ(context)) {
                C64728Pam LJFF = C64728Pam.LJFF();
                LJII.getClass();
                C64667PZn.LJIILJJIL = LJFF;
            }
            return LJII.LIZ(request);
        }
    }
}
