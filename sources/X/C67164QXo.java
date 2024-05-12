package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.QXo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67164QXo {
    public static final Object LIZJ = new Object();
    public static ServiceConnectionC67167QXr LIZLLL;
    public final Context LIZ;
    public final QY0 LIZIZ = new QY0();

    public C67164QXo(Context context) {
        this.LIZ = context;
    }

    public static ServiceConnectionC67167QXr LIZIZ(Context context) {
        ServiceConnectionC67167QXr serviceConnectionC67167QXr;
        synchronized (LIZJ) {
            if (LIZLLL == null) {
                LIZLLL = new ServiceConnectionC67167QXr(context);
            }
            serviceConnectionC67167QXr = LIZLLL;
        }
        return serviceConnectionC67167QXr;
    }

    public final AbstractC67638Qgc<Integer> LIZJ(final Intent intent) {
        boolean z;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "gcm.rawData64");
        boolean z2 = false;
        if (LLJJIJIIJIL != null) {
            intent.putExtra("rawData", Base64.decode(LLJJIJIIJIL, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.LIZ;
        if (C44389HbV.LIZ() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return LIZ(context, intent);
        }
        return C67637Qgb.LIZJ(new Callable() { // from class: X.QSn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName LLLL;
                Context context2 = context;
                Intent intent2 = intent;
                C48215Iw7 LIZ = C48215Iw7.LIZ();
                ((ArrayDeque) LIZ.LIZLLL).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (LIZ) {
                    str = LIZ.LIZ;
                    if (str == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(context2.getPackageName());
                                    LIZ2.append(serviceInfo.name);
                                    LIZ.LIZ = X1D.LIZIZ(LIZ2);
                                } else {
                                    LIZ.LIZ = serviceInfo.name;
                                }
                                str = LIZ.LIZ;
                            }
                            str = null;
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (LIZ.LIZJ(context2)) {
                        LLLL = C67159QXj.LIZJ(context2, intent3);
                    } else {
                        LLLL = C16880lQ.LLLL(context2, intent3);
                    }
                    if (LLLL == null) {
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException unused) {
                    i = 402;
                } catch (SecurityException unused2) {
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }, this.LIZIZ).LJII(this.LIZIZ, new InterfaceC67660Qgy() { // from class: X.QXp
            @Override // X.InterfaceC67660Qgy
            public final Object LIZJ(AbstractC67638Qgc abstractC67638Qgc) {
                Context context2 = context;
                Intent intent2 = intent;
                if (!C44389HbV.LIZ() || ((Integer) abstractC67638Qgc.LJIIIZ()).intValue() != 402) {
                    return abstractC67638Qgc;
                }
                return C67164QXo.LIZ(context2, intent2).LJI(new QY0(), new UPJ());
            }
        });
    }

    public static C67646Qgk LIZ(Context context, final Intent intent) {
        if (C48215Iw7.LIZ().LIZJ(context)) {
            ServiceConnectionC67167QXr LIZIZ = LIZIZ(context);
            synchronized (C67159QXj.LIZIZ) {
                C67159QXj.LIZ(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    C67159QXj.LIZJ.LIZ(C67159QXj.LIZ);
                }
                LIZIZ.LIZIZ(intent).LIZJ(new Executor() { // from class: X.QY1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new InterfaceC67661Qgz() { // from class: X.QXn
                    @Override // X.InterfaceC67661Qgz
                    public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                        C67159QXj.LIZIZ(intent);
                    }
                });
            }
        } else {
            LIZIZ(context).LIZIZ(intent);
        }
        return C67637Qgb.LJ(-1);
    }
}
