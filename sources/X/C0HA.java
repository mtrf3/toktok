package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.Callable;

/* renamed from: X.0HA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HA implements ServiceConnection {
    public final Object LJLIL = new Object();
    public final C0H4 LJLILLLLZI;
    public final /* synthetic */ C1FD LJLJI;

    public /* synthetic */ C0HA(C1FD c1fd, C0H4 c0h4) {
        this.LJLJI = c1fd;
        this.LJLILLLLZI = c0h4;
    }

    public final void LIZ(C0HE c0he) {
        synchronized (this.LJLIL) {
            C0H4 c0h4 = this.LJLILLLLZI;
            if (c0h4 != null) {
                c0h4.onBillingSetupFinished(c0he);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLJI.LJFF = null;
        this.LJLJI.LIZ = 0;
        synchronized (this.LJLIL) {
            C0H4 c0h4 = this.LJLILLLLZI;
            if (c0h4 != null) {
                c0h4.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC40594FwU c40591FwR;
        C36864EdQ.LJFF("BillingClient", "Billing service connected.");
        C1FD c1fd = this.LJLJI;
        if (iBinder == null) {
            c40591FwR = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof InterfaceC40594FwU) {
                c40591FwR = (InterfaceC40594FwU) queryLocalInterface;
            } else {
                c40591FwR = new C40591FwR(iBinder);
            }
        }
        c1fd.LJFF = c40591FwR;
        C1FD c1fd2 = this.LJLJI;
        if (c1fd2.LJIIJJI(new Callable() { // from class: X.0H2
            /* JADX WARN: Code restructure failed: missing block: B:96:0x00f6, code lost:
            
                if (r5 != 0) goto L89;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 263
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0H2.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: X.0H3
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C0HA c0ha = C0HA.this;
                    c0ha.LJLJI.LIZ = 0;
                    c0ha.LJLJI.LJFF = null;
                    c0ha.LIZ(C0HD.LJIIL);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, c1fd2.LJIIIIZZ()) == null) {
            LIZ(this.LJLJI.LJIIJ());
        }
    }
}
