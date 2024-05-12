package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.android.gms.cloudmessaging.zzd;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class QY9 {
    public static int LJII;
    public static PendingIntent LJIIIIZZ;
    public static final QYP LJIIIZ = QYP.LJLIL;
    public static final Pattern LJIIJ = PatternProtector.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context LIZIZ;
    public final QY7 LIZJ;
    public final PThreadScheduledThreadPoolExecutor LIZLLL;
    public Messenger LJFF;
    public zzd LJI;
    public final C0MA<String, C67649Qgn<Bundle>> LIZ = new C0MA<>();
    public final Messenger LJ = new Messenger(new QYA(this, C16880lQ.LLJJJJ()));

    public static synchronized String LIZIZ() {
        String num;
        synchronized (QY9.class) {
            int i = LJII;
            LJII = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public QY9(Context context) {
        this.LIZIZ = context;
        this.LIZJ = new QY7(context);
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("messaging/Rpc"));
        pThreadScheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        pThreadScheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.LIZLLL = pThreadScheduledThreadPoolExecutor;
    }

    public final C67646Qgk LIZ(Bundle bundle) {
        final String LIZIZ = LIZIZ();
        final C67649Qgn<Bundle> c67649Qgn = new C67649Qgn<>();
        synchronized (this.LIZ) {
            this.LIZ.put(LIZIZ, c67649Qgn);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.LIZJ.LIZ() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        LIZJ(this.LIZIZ, intent);
        intent.putExtra("kid", FP1.LIZLLL(new StringBuilder(String.valueOf(LIZIZ).length() + 5), "|ID|", LIZIZ, "|"));
        if (android.util.Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(C16880lQ.LLJJIJI(intent)).length() + 8);
        }
        intent.putExtra("google.messenger", this.LJ);
        if (this.LJFF != null || this.LJI != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.LJFF;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.LJI.LJLIL;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.LIZLLL.schedule(new Runnable() { // from class: X.QYH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C67649Qgn.this.LIZJ(new IOException("TIMEOUT"));
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c67649Qgn.LIZ.LIZJ(LJIIIZ, new InterfaceC67661Qgz() { // from class: X.QYI
                @Override // X.InterfaceC67661Qgz
                public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                    QY9 qy9 = QY9.this;
                    String str = LIZIZ;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (qy9.LIZ) {
                        qy9.LIZ.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return c67649Qgn.LIZ;
        }
        if (this.LIZJ.LIZ() == 2) {
            this.LIZIZ.sendBroadcast(intent);
        } else {
            C16880lQ.LLLL(this.LIZIZ, intent);
        }
        final ScheduledFuture schedule2 = this.LIZLLL.schedule(new Runnable() { // from class: X.QYH
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C67649Qgn.this.LIZJ(new IOException("TIMEOUT"));
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c67649Qgn.LIZ.LIZJ(LJIIIZ, new InterfaceC67661Qgz() { // from class: X.QYI
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                QY9 qy9 = QY9.this;
                String str = LIZIZ;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (qy9.LIZ) {
                    qy9.LIZ.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return c67649Qgn.LIZ;
    }

    public static synchronized void LIZJ(Context context, Intent intent) {
        synchronized (QY9.class) {
            if (LJIIIIZZ == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                LJIIIIZZ = PendingIntent.getBroadcast(context, 0, intent2, C38532FAi.LIZ);
            }
            intent.putExtra("app", LJIIIIZZ);
        }
    }

    public final void LIZLLL(Bundle bundle, String str) {
        synchronized (this.LIZ) {
            C67649Qgn<Bundle> remove = this.LIZ.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                }
                return;
            }
            remove.LIZIZ(bundle);
        }
    }
}
