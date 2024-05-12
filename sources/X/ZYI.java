package X;

import Y.IDRunnableS1S1200000_24;
import Y.IDRunnableS5S1100000_24;
import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.utils.DLNAOptionUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZYI {
    public final ZWQ LIZ;
    public final C90555ZgN LIZIZ;
    public final C90421ZeD LIZJ;

    public final void LIZIZ() {
        ZWQ zwq = this.LIZ;
        if (zwq != null) {
            synchronized (zwq) {
                Logger.i("NsdServer", "stopServer");
                zwq.LJIIJJI.post(new IDRunnableS86S0100000_24(zwq, 0));
            }
        }
        C90555ZgN c90555ZgN = this.LIZIZ;
        if (c90555ZgN != null) {
            c90555ZgN.LJ();
        }
        C90421ZeD c90421ZeD = this.LIZJ;
        c90421ZeD.getClass();
        String str = C90421ZeD.LJ;
        Logger.d(str, "stopServer");
        if (!DLNAOptionUtils.isEnableSinkSsdpServer()) {
            Logger.d(str, "stopServer ssdp server is not open");
        } else {
            if (c90421ZeD.LIZ == null || !((ArrayList) c90421ZeD.LIZJ).contains("BDLink")) {
                return;
            }
            c90421ZeD.LIZLLL.execute(new IDRunnableS86S0100000_24(c90421ZeD, 15));
        }
    }

    public ZYI(ICastSink iCastSink, ICastSink iCastSink2) {
        this.LIZ = new ZWQ(iCastSink, iCastSink2);
        this.LIZIZ = new C90555ZgN(iCastSink, iCastSink2);
        this.LIZJ = new C90421ZeD(iCastSink, iCastSink2);
    }

    public final void LIZ(String str, List<String> list) {
        ZWQ zwq = this.LIZ;
        if (zwq != null) {
            synchronized (zwq) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startServer: ");
                LIZ.append(str);
                Logger.i("NsdServer", X1D.LIZIZ(LIZ));
                zwq.LJIIJJI.post(new IDRunnableS1S1200000_24(zwq, str, list, 0));
            }
        }
        C90555ZgN c90555ZgN = this.LIZIZ;
        if (c90555ZgN != null) {
            c90555ZgN.LIZLLL(str, list);
        }
        C90421ZeD c90421ZeD = this.LIZJ;
        c90421ZeD.getClass();
        String str2 = C90421ZeD.LJ;
        Logger.d(str2, "startServer");
        if (!DLNAOptionUtils.isEnableSinkSsdpServer()) {
            Logger.d(str2, "startServer ssdp server is not open");
            return;
        }
        ((ArrayList) c90421ZeD.LIZJ).addAll(list);
        if (c90421ZeD.LIZ == null || !((ArrayList) c90421ZeD.LIZJ).contains("BDLink")) {
            return;
        }
        c90421ZeD.LIZLLL.execute(new IDRunnableS5S1100000_24(c90421ZeD, str, 0));
    }
}
