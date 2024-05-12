package X;

import android.os.RemoteException;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class X3W implements Runnable {
    public final /* synthetic */ SparseArray LJLIL;
    public final /* synthetic */ HashMap LJLILLLLZI;
    public final /* synthetic */ List LJLJI;
    public final /* synthetic */ X3X LJLJJI;
    public final /* synthetic */ ServiceConnectionC84229X3x LJLJJL;

    public final void LIZ() {
        boolean z;
        X3X x3x;
        Future<?> future;
        ServiceConnectionC84229X3x serviceConnectionC84229X3x = this.LJLJJL;
        X3V x3v = new X3V(this);
        synchronized (serviceConnectionC84229X3x) {
            InterfaceC84230X3y interfaceC84230X3y = serviceConnectionC84229X3x.LJLIL;
            if (interfaceC84230X3y != null) {
                try {
                    interfaceC84230X3y.q0(x3v);
                } catch (RemoteException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else {
                serviceConnectionC84229X3x.LJLJI = x3v;
            }
        }
        boolean z2 = false;
        try {
            z = !this.LJLJJL.LJLJL.await(5000L, TimeUnit.MILLISECONDS);
            if (z && (future = this.LJLJJL.LJLJJLL) != null) {
                future.cancel(true);
            }
        } catch (Throwable unused) {
            z = false;
        }
        ServiceConnectionC84229X3x serviceConnectionC84229X3x2 = this.LJLJJL;
        if (this.LJLILLLLZI != null && this.LJLJI != null) {
            z2 = true;
        }
        serviceConnectionC84229X3x2.getClass();
        try {
            InterfaceC84230X3y interfaceC84230X3y2 = serviceConnectionC84229X3x2.LJLIL;
            if (interfaceC84230X3y2 != null) {
                interfaceC84230X3y2.LLIIIJ(z2);
            }
        } catch (RemoteException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (z && (x3x = this.LJLJJI) != null) {
            ((C84225X3t) x3x).LIZ();
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

    public X3W(ServiceConnectionC84229X3x serviceConnectionC84229X3x, SparseArray sparseArray, HashMap hashMap, List list, C84225X3t c84225X3t) {
        this.LJLJJL = serviceConnectionC84229X3x;
        this.LJLIL = sparseArray;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = list;
        this.LJLJJI = c84225X3t;
    }
}
