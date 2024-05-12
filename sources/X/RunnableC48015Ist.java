package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;

/* renamed from: X.Ist, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48015Ist implements Runnable {
    public static final Object LJLJJLL = new Object();
    public static Boolean LJLJL = null;
    public static Boolean LJLJLJ = null;
    public final Context LJLIL;
    public final QY5 LJLILLLLZI;
    public final PowerManager.WakeLock LJLJI;
    public final C48127Iuh LJLJJI;
    public final long LJLJJL;

    public final synchronized boolean LIZLLL() {
        boolean z;
        NetworkInfo LJJLI;
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LJLIL, "connectivity");
        if (connectivityManager != null && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null) {
            if (LJJLI.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final void LIZ() {
        if (LIZJ(this.LJLIL)) {
            this.LJLJI.acquire(C48016Isu.LIZ);
        }
        try {
            try {
                C48127Iuh c48127Iuh = this.LJLJJI;
                synchronized (c48127Iuh) {
                    c48127Iuh.LJI = true;
                }
            } catch (Throwable th) {
                if (LIZJ(this.LJLIL)) {
                    try {
                        this.LJLJI.release();
                    } catch (RuntimeException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            this.LJLJJI.LJ(false);
            if (!LIZJ(this.LJLIL)) {
                return;
            }
        }
        if (!this.LJLILLLLZI.LIZLLL()) {
            this.LJLJJI.LJ(false);
            if (LIZJ(this.LJLIL)) {
                try {
                    this.LJLJI.release();
                    return;
                } catch (RuntimeException unused3) {
                    return;
                }
            }
            return;
        }
        if (LIZIZ(this.LJLIL) && !LIZLLL()) {
            C16880lQ.LJJLIIIJILLIZJL(new C47963Is3(this, this), this.LJLIL, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (LIZJ(this.LJLIL)) {
                try {
                    this.LJLJI.release();
                    return;
                } catch (RuntimeException unused4) {
                    return;
                }
            }
            return;
        }
        if (this.LJLJJI.LJFF()) {
            this.LJLJJI.LJ(false);
        } else {
            this.LJLJJI.LJI(this.LJLJJL);
        }
        if (!LIZJ(this.LJLIL)) {
            return;
        }
        try {
            this.LJLJI.release();
        } catch (RuntimeException unused5) {
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

    public static boolean LIZIZ(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (LJLJJLL) {
            Boolean bool = LJLJLJ;
            if (bool == null) {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    booleanValue = true;
                } else {
                    booleanValue = false;
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            LJLJLJ = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean LIZJ(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (LJLJJLL) {
            Boolean bool = LJLJL;
            if (bool == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    booleanValue = true;
                } else {
                    booleanValue = false;
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            LJLJL = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public RunnableC48015Ist(C48127Iuh c48127Iuh, Context context, QY5 qy5, long j) {
        this.LJLJJI = c48127Iuh;
        this.LJLIL = context;
        this.LJLJJL = j;
        this.LJLILLLLZI = qy5;
        this.LJLJI = ((PowerManager) C16880lQ.LLILL(context, "power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
