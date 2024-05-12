package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class QCV {
    public static final Object LIZIZ = new Object();
    public static volatile QCV LIZJ;
    public final ConcurrentHashMap<ServiceConnection, ServiceConnection> LIZ = new ConcurrentHashMap<>();

    public static QCV LIZIZ() {
        if (LIZJ == null) {
            synchronized (LIZIZ) {
                if (LIZJ == null) {
                    LIZJ = new QCV();
                }
            }
        }
        QCV qcv = LIZJ;
        QH7.LJIIIIZZ(qcv);
        return qcv;
    }

    public final void LIZJ(Context context, ServiceConnection serviceConnection) {
        if ((!(serviceConnection instanceof QCW)) && this.LIZ.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService(this.LIZ.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
            } finally {
                this.LIZ.remove(serviceConnection);
            }
        } else {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
            }
        }
    }

    public final boolean LIZ(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass();
        return LIZLLL(context, intent, serviceConnection, i, null);
    }

    public final boolean LIZLLL(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean LLLJL;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((QCX.LIZ(context).LIZ(0, packageName).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof QCW)) {
            ServiceConnection putIfAbsent = this.LIZ.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                intent.getAction();
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    LLLJL = context.bindService(intent, i, executor, serviceConnection);
                } else {
                    LLLJL = C16880lQ.LLLJL(context, intent, serviceConnection, i);
                }
                if (!LLLJL) {
                    return false;
                }
                return LLLJL;
            } finally {
                this.LIZ.remove(serviceConnection, serviceConnection);
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            return context.bindService(intent, i, executor, serviceConnection);
        }
        return C16880lQ.LLLJL(context, intent, serviceConnection, i);
    }
}
