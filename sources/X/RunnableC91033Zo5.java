package X;

import android.net.ConnectivityManager;
import com.bytedance.bdlocation.log.Logger;

/* renamed from: X.Zo5, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public class RunnableC91033Zo5 implements Runnable {
    public boolean LJLIL;
    public boolean LJLILLLLZI = true;
    public long LJLJI;
    public final /* synthetic */ C91048ZoK LJLJJI;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkStatusCollectManagers NetworkCollectTask run: interval:");
        LIZ.append(this.LJLJJI.LIZJ);
        Logger.d(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJI < this.LJLJJI.LIZJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NetworkStatusCollectManagers NetworkCollectTask error：timecur：");
            LIZ2.append(currentTimeMillis - this.LJLJI);
            LIZ2.append("--currentTimeMs:");
            LIZ2.append(currentTimeMillis);
            LIZ2.append("--lastScheduleTimeMs:");
            LIZ2.append(this.LJLJI);
            Logger.d(X1D.LIZIZ(LIZ2));
            this.LJLJJI.LJ.removeCallbacksAndMessages(null);
        }
        if (!this.LJLILLLLZI) {
            C91048ZoK c91048ZoK = this.LJLJJI;
            c91048ZoK.LIZLLL(C91048ZoK.LIZJ(C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(c91048ZoK.LJFF, "connectivity"))), false);
            this.LJLJI = currentTimeMillis;
        }
        Logger.d("NetworkStatusCollectManagers NetworkCollectTask run: postDelayed");
        C91048ZoK c91048ZoK2 = this.LJLJJI;
        c91048ZoK2.LJ.postDelayed(this, c91048ZoK2.LIZJ);
        this.LJLILLLLZI = false;
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

    public RunnableC91033Zo5(C91048ZoK c91048ZoK) {
        this.LJLJJI = c91048ZoK;
    }
}
