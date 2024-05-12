package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.IOException;

/* renamed from: X.IsM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47982IsM implements PX8 {
    public final /* synthetic */ InterfaceC47892Iqu LIZ;

    public C47982IsM(C47788IpE c47788IpE) {
        this.LIZ = c47788IpE;
    }

    @Override // X.PX8
    public final void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startTask onFailure: ");
        LIZ.append(iOException.toString());
        TTVideoEngineLog.d("TTHTTPNetwork", X1D.LIZIZ(LIZ));
        ((C47788IpE) this.LIZ).LIZ(new C47789IpF("", -9994, 0, iOException.toString()), null);
    }

    @Override // X.PX8
    public final void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
        int i;
        String str;
        try {
            PVM pvm = c64598PWw.LJLJL;
            try {
                String string = pvm.string();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startTask onResponse body:");
                LIZ.append(string);
                TTVideoEngineLog.d("TTHTTPNetwork", X1D.LIZIZ(LIZ));
                if (!c64598PWw.LIZIZ()) {
                    str = c64598PWw.LJLJJI;
                    i = c64598PWw.LJLJI;
                } else {
                    i = -1;
                    str = null;
                }
                pvm.close();
                if (str == null) {
                    ((C47788IpE) this.LIZ).LIZ(null, string);
                    return;
                }
                if (i == -9979) {
                    ((C47788IpE) this.LIZ).LIZ(new C47789IpF("", -9979, i, str), null);
                } else {
                    ((C47788IpE) this.LIZ).LIZ(new C47789IpF("", -9994, i, str), string);
                }
            } catch (Throwable th) {
                if (pvm != null) {
                    pvm.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
        }
    }
}
