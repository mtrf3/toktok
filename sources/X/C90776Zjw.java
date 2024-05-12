package X;

import Y.IDRunnableS30S0200000_24;
import Y.IDRunnableS7S0101000_24;
import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Zjw, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90776Zjw implements NsdListener {
    public final /* synthetic */ C90777Zjx LIZ;

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdRegistered(NsdService nsdService) {
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdUnRegistered(NsdService nsdService) {
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdDiscoveryFinished() {
        this.LIZ.LIZJ.i("NsdClient", "onNsdDiscoveryFinished");
        this.LIZ.LJI.execute(new IDRunnableS86S0100000_24(this, 9));
    }

    public C90776Zjw(C90777Zjx c90777Zjx) {
        this.LIZ = c90777Zjx;
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceFound(NsdService nsdService) {
        CastLogger castLogger = this.LIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdServiceFound: ");
        LIZ.append(nsdService);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceLost(NsdService nsdService) {
        ((ConcurrentHashMap) this.LIZ.LJIILIIL).remove(nsdService.getName());
        CastLogger castLogger = this.LIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdServiceLost:");
        LIZ.append(nsdService);
        LIZ.append(", size:");
        LIZ.append(((ConcurrentHashMap) this.LIZ.LJIILIIL).size());
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        this.LIZ.LIZIZ(nsdService);
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceResolved(NsdService nsdService) {
        ((ConcurrentHashMap) this.LIZ.LJIILIIL).put(nsdService.getName(), nsdService);
        CastLogger castLogger = this.LIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdServiceResolved:");
        LIZ.append(nsdService);
        LIZ.append(", size:");
        LIZ.append(((ConcurrentHashMap) this.LIZ.LJIILIIL).size());
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        C90777Zjx c90777Zjx = this.LIZ;
        synchronized (c90777Zjx.LJJI) {
            ExecutorService executorService = c90777Zjx.LJJIFFI;
            if (executorService == null) {
                c90777Zjx.LIZJ.i("NsdClient", "handleResolvedService: mNsdExecutor is null");
            } else {
                executorService.submit(new IDRunnableS30S0200000_24(c90777Zjx, nsdService, 3));
            }
        }
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdError(String str, int i, String str2) {
        CastLogger castLogger = this.LIZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdError, errorMessage:");
        LIZ.append(str);
        LIZ.append(", errorCode:");
        LIZ.append(i);
        LIZ.append(", errorSource:");
        LIZ.append(str2);
        castLogger.w("NsdClient", X1D.LIZIZ(LIZ));
        this.LIZ.getClass();
        this.LIZ.LJI.execute(new IDRunnableS7S0101000_24(1, this, 3));
    }
}
