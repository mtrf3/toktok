package X;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Iw6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48214Iw6 implements Runnable {
    public final long LJLIL;
    public final PowerManager.WakeLock LJLILLLLZI;
    public final FirebaseMessaging LJLJI;
    public final PThreadPoolExecutor LJLJJI = new PThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39014FSw("firebase-iid-executor"));

    public final boolean LIZJ() {
        try {
            return this.LJLJI.LIZ() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message) || e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final boolean LIZIZ() {
        NetworkInfo LJJLI;
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LJLJI.LIZLLL, "connectivity");
        if (connectivityManager != null && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null && LJJLI.isConnected()) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        if (C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
            this.LJLILLLLZI.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.LJLJI;
                synchronized (firebaseMessaging) {
                    firebaseMessaging.LJIIJJI = true;
                }
            } catch (IOException unused) {
                this.LJLJI.LJI(false);
                if (!C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
                    return;
                }
            }
            if (!this.LJLJI.LJIIJ.LIZLLL()) {
                this.LJLJI.LJI(false);
                if (C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
                    this.LJLILLLLZI.release();
                    return;
                }
                return;
            }
            if (C48215Iw7.LIZ().LIZIZ(this.LJLJI.LIZLLL) && !LIZIZ()) {
                C48213Iw5 c48213Iw5 = new C48213Iw5(this);
                C16880lQ.LJJLIIIJILLIZJL(c48213Iw5, c48213Iw5.LIZ.LJLJI.LIZLLL, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
                    this.LJLILLLLZI.release();
                    return;
                }
                return;
            }
            if (LIZJ()) {
                this.LJLJI.LJI(false);
            } else {
                this.LJLJI.LJIIIIZZ(this.LJLIL);
            }
            if (!C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
                return;
            }
            this.LJLILLLLZI.release();
        } catch (Throwable th) {
            if (C48215Iw7.LIZ().LIZJ(this.LJLJI.LIZLLL)) {
                this.LJLILLLLZI.release();
            }
            throw th;
        }
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

    public RunnableC48214Iw6(FirebaseMessaging firebaseMessaging, long j) {
        this.LJLJI = firebaseMessaging;
        this.LJLIL = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) C16880lQ.LLILL(firebaseMessaging.LIZLLL, "power")).newWakeLock(1, "fiid-sync");
        this.LJLILLLLZI = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
