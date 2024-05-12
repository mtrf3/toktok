package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.QkK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67868QkK extends AbstractC67866QkI {
    public final HashMap<C65428Pm4, ServiceConnectionC67867QkJ> LIZLLL = new HashMap<>();
    public final Context LJ;
    public volatile HandlerC67913Ql3 LJFF;
    public final QCV LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public C67868QkK(Context context, Looper looper) {
        C67869QkL c67869QkL = new C67869QkL(this);
        this.LJ = C16880lQ.LLLLL(context);
        this.LJFF = new HandlerC67913Ql3(looper, c67869QkL);
        this.LJI = QCV.LIZIZ();
        this.LJII = 5000L;
        this.LJIIIIZZ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    }

    @Override // X.AbstractC67866QkI
    public final boolean LIZLLL(C65428Pm4 c65428Pm4, ServiceConnectionC67871QkN serviceConnectionC67871QkN, String str, Executor executor) {
        boolean z;
        synchronized (this.LIZLLL) {
            ServiceConnectionC67867QkJ serviceConnectionC67867QkJ = this.LIZLLL.get(c65428Pm4);
            if (serviceConnectionC67867QkJ == null) {
                serviceConnectionC67867QkJ = new ServiceConnectionC67867QkJ(this, c65428Pm4);
                ((HashMap) serviceConnectionC67867QkJ.LJLIL).put(serviceConnectionC67871QkN, serviceConnectionC67871QkN);
                serviceConnectionC67867QkJ.LIZ(executor);
                this.LIZLLL.put(c65428Pm4, serviceConnectionC67867QkJ);
            } else {
                this.LJFF.removeMessages(0, c65428Pm4);
                if (!((HashMap) serviceConnectionC67867QkJ.LJLIL).containsKey(serviceConnectionC67871QkN)) {
                    ((HashMap) serviceConnectionC67867QkJ.LJLIL).put(serviceConnectionC67871QkN, serviceConnectionC67871QkN);
                    int i = serviceConnectionC67867QkJ.LJLILLLLZI;
                    if (i != 1) {
                        if (i == 2) {
                            serviceConnectionC67867QkJ.LIZ(executor);
                        }
                    } else {
                        serviceConnectionC67871QkN.onServiceConnected(serviceConnectionC67867QkJ.LJLJJLL, serviceConnectionC67867QkJ.LJLJJI);
                    }
                } else {
                    String c65428Pm42 = c65428Pm4.toString();
                    StringBuilder sb = new StringBuilder(c65428Pm42.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(c65428Pm42);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = serviceConnectionC67867QkJ.LJLJI;
        }
        return z;
    }
}
