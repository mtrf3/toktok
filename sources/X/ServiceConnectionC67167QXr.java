package X;

import Y.ARunnableS10S0101000_6;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.QXr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67167QXr implements ServiceConnection {
    public final Context LJLIL;
    public final Intent LJLILLLLZI;
    public final ScheduledExecutorService LJLJI;
    public final Queue<C67168QXs> LJLJJI;
    public BinderC67171QXv LJLJJL;
    public boolean LJLJJLL;

    public final synchronized void LIZ() {
        while (!((ArrayDeque) this.LJLJJI).isEmpty()) {
            BinderC67171QXv binderC67171QXv = this.LJLJJL;
            if (binderC67171QXv != null && binderC67171QXv.isBinderAlive()) {
                this.LJLJJL.LIZ((C67168QXs) ((ArrayDeque) this.LJLJJI).poll());
            } else {
                LIZJ();
                return;
            }
        }
    }

    public final void LIZJ() {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("binder is dead. start connection? ");
            LIZ.append(!this.LJLJJLL);
            X1D.LIZIZ(LIZ);
        }
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        try {
            if (QCV.LIZIZ().LIZ(this.LJLIL, this.LJLILLLLZI, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.LJLJJLL = false;
        while (!((ArrayDeque) this.LJLJJI).isEmpty()) {
            ((C67168QXs) ((ArrayDeque) this.LJLJJI).poll()).LIZIZ.LIZLLL(null);
        }
    }

    public ServiceConnectionC67167QXr(Context context) {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(0, new ThreadFactoryC39014FSw("Firebase-FirebaseInstanceIdServiceConnection"));
        this.LJLJJI = new ArrayDeque();
        this.LJLJJLL = false;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLIL = LLLLL;
        this.LJLILLLLZI = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(LLLLL.getPackageName());
        this.LJLJI = pThreadScheduledThreadPoolExecutor;
    }

    public final synchronized C67646Qgk LIZIZ(Intent intent) {
        C67168QXs c67168QXs;
        boolean z;
        long j;
        c67168QXs = new C67168QXs(intent);
        ScheduledExecutorService scheduledExecutorService = this.LJLJI;
        if ((c67168QXs.LIZ.getFlags() & 268435456) != 0) {
            z = true;
        } else {
            z = false;
        }
        ARunnableS10S0101000_6 aRunnableS10S0101000_6 = new ARunnableS10S0101000_6(1, c67168QXs, 13);
        if (!z) {
            j = 9000;
        } else {
            j = C67159QXj.LIZ;
        }
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(aRunnableS10S0101000_6, j, TimeUnit.MILLISECONDS);
        c67168QXs.LIZIZ.LIZ.LIZJ(scheduledExecutorService, new InterfaceC67661Qgz() { // from class: X.QXt
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                schedule.cancel(false);
            }
        });
        ((ArrayDeque) this.LJLJJI).add(c67168QXs);
        LIZ();
        return c67168QXs.LIZIZ.LIZ;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        LIZ();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLJJLL = false;
        if (!(iBinder instanceof BinderC67171QXv)) {
            while (!((ArrayDeque) this.LJLJJI).isEmpty()) {
                ((C67168QXs) ((ArrayDeque) this.LJLJJI).poll()).LIZIZ.LIZLLL(null);
            }
        } else {
            this.LJLJJL = (BinderC67171QXv) iBinder;
            LIZ();
        }
    }
}
