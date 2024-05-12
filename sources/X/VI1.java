package X;

import J.N;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.EarlyTraceEvent;
import com.ttnet.org.chromium.base.TraceEvent;

/* loaded from: classes15.dex */
public final class VI1 extends VI2 implements MessageQueue.IdleHandler {
    public long LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;

    public final void LIZJ() {
        if (TraceEvent.LJLILLLLZI && !this.LJLJL) {
            this.LJLILLLLZI = SystemClock.elapsedRealtime();
            C16880lQ.LJLI(Looper.myQueue(), this);
            this.LJLJL = true;
        } else {
            if (!this.LJLJL || TraceEvent.LJLILLLLZI) {
                return;
            }
            Looper.myQueue().removeIdleHandler(this);
            this.LJLJL = false;
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LJLILLLLZI == 0) {
            this.LJLILLLLZI = elapsedRealtime;
        }
        long j = elapsedRealtime - this.LJLILLLLZI;
        this.LJLJJL++;
        StringBuilder LIZ = X1D.LIZ();
        String LIZ2 = C08380Uo.LIZ(LIZ, this.LJLJJLL, " tasks since last idle.", LIZ);
        EarlyTraceEvent.LIZ("Looper.queueIdle", false);
        if (TraceEvent.LJLILLLLZI) {
            N.MajVTFsV("Looper.queueIdle", LIZ2);
        }
        if (j > 48) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.LJLJJI);
            LIZ3.append(" tasks and ");
            LIZ3.append(this.LJLJJL);
            LIZ3.append(" idles processed so far, ");
            V10.LJFF(LIZ3, this.LJLJJLL, " tasks bursted and ", j);
            LIZ3.append("ms elapsed since last idle");
            String LIZIZ = X1D.LIZIZ(LIZ3);
            if (TraceEvent.LJLILLLLZI) {
                N.Mz5qii_R("TraceEvent.LooperMonitor:IdleStats", LIZIZ);
            }
        }
        this.LJLILLLLZI = elapsedRealtime;
        this.LJLJJLL = 0;
        return true;
    }

    @Override // X.VI2
    public final void LIZ(String str) {
        if (this.LJLJJLL == 0) {
            EarlyTraceEvent.LIZJ("Looper.queueIdle", false);
            if (TraceEvent.LJLILLLLZI) {
                N.M5yUVmrW("Looper.queueIdle", null);
            }
        }
        this.LJLJI = SystemClock.elapsedRealtime();
        LIZJ();
        super.LIZ(str);
    }

    @Override // X.VI2
    public final void LIZIZ(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJI;
        if (elapsedRealtime > 16) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("observed a task that took ");
            LIZ.append(elapsedRealtime);
            LIZ.append("ms: ");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (TraceEvent.LJLILLLLZI) {
                N.Mz5qii_R("TraceEvent.LooperMonitor:IdleStats", LIZIZ);
            }
        }
        super.LIZIZ(str);
        LIZJ();
        this.LJLJJI++;
        this.LJLJJLL++;
    }
}
