package X;

import Y.ARunnableS44S0100000_8;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: X.IqK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47856IqK extends C47854IqI {
    public InetAddress LJFF;
    public boolean LJI;
    public Future LJII;

    @Override // X.C47854IqI
    public final void LIZLLL() {
        this.LIZIZ = true;
        Future future = this.LJII;
        if (future != null) {
            future.cancel(true);
            this.LJII = null;
        }
    }

    @Override // X.C47854IqI
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        Future future = this.LJII;
        if (future != null) {
            future.cancel(true);
            this.LJII = null;
        }
    }

    @Override // X.C47854IqI
    public final void LJFF() {
        try {
            this.LJII = EngineThreadPool.addExecuteTask(new ARunnableS44S0100000_8(this, 168));
        } catch (Exception e) {
            LJ(new C47789IpF("kTTVideoErrorDomainLocalDNS", -9968, 0, e.getMessage()));
        }
        this.LIZ.postDelayed(new RunnableC47855IqJ(this), 10000L);
    }

    public C47856IqK(String str) {
        super(str);
        C78253UnR.LJI("LocalDNS", "DNS use LocalDNS");
    }
}
