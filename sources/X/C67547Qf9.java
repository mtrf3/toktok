package X;

import X.C0M9;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qf9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67547Qf9 {
    public int LIZLLL;
    public final C1HQ<C67719Qhv<?>, String> LIZIZ = new C1HQ<>();
    public final C67649Qgn<java.util.Map<C67719Qhv<?>, String>> LIZJ = new C67649Qgn<>();
    public boolean LJ = false;
    public final C1HQ<C67719Qhv<?>, ConnectionResult> LIZ = new C1HQ<>();

    public C67547Qf9(Iterable<? extends InterfaceC67549QfB<?>> iterable) {
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            this.LIZ.put(((InterfaceC67549QfB) it.next()).LIZ(), null);
        }
        this.LIZLLL = ((C0M9.c) this.LIZ.keySet()).size();
    }

    public final void LIZ(C67719Qhv<?> c67719Qhv, ConnectionResult connectionResult, String str) {
        this.LIZ.put(c67719Qhv, connectionResult);
        this.LIZIZ.put(c67719Qhv, str);
        this.LIZLLL--;
        if (!connectionResult.LJJJJZ()) {
            this.LJ = true;
        }
        if (this.LIZLLL == 0) {
            if (this.LJ) {
                this.LIZJ.LIZ(new C67548QfA(this.LIZ));
            } else {
                this.LIZJ.LIZIZ(this.LIZIZ);
            }
        }
    }
}
