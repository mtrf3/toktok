package X;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qjn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67835Qjn implements Runnable {
    public final /* synthetic */ ConnectionResult LJLIL;
    public final /* synthetic */ C67829Qjh LJLILLLLZI;

    public RunnableC67835Qjn(C67829Qjh c67829Qjh, ConnectionResult connectionResult) {
        this.LJLILLLLZI = c67829Qjh;
        this.LJLIL = connectionResult;
    }

    public final void LIZ() {
        InterfaceC67936QlQ interfaceC67936QlQ;
        C67829Qjh c67829Qjh = this.LJLILLLLZI;
        C67825Qjd c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) c67829Qjh.LJFF.LJLL).get(c67829Qjh.LIZIZ);
        if (c67825Qjd == null) {
            return;
        }
        if (this.LJLIL.LJJJJZ()) {
            C67829Qjh c67829Qjh2 = this.LJLILLLLZI;
            c67829Qjh2.LJ = true;
            if (c67829Qjh2.LIZ.LIZIZ()) {
                C67829Qjh c67829Qjh3 = this.LJLILLLLZI;
                if (c67829Qjh3.LJ && (interfaceC67936QlQ = c67829Qjh3.LIZJ) != null) {
                    c67829Qjh3.LIZ.LJIILIIL(interfaceC67936QlQ, c67829Qjh3.LIZLLL);
                    return;
                }
                return;
            }
            try {
                InterfaceC67836Qjo interfaceC67836Qjo = this.LJLILLLLZI.LIZ;
                interfaceC67836Qjo.LJIILIIL(null, interfaceC67836Qjo.LIZJ());
                return;
            } catch (SecurityException unused) {
                this.LJLILLLLZI.LIZ.LJIIJ("Failed to get service from broker.");
                c67825Qjd.LJIILJJIL(new ConnectionResult(10), null);
                return;
            }
        }
        c67825Qjd.LJIILJJIL(this.LJLIL, null);
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
}
