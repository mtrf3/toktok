package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;

/* renamed from: X.Fhj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39679Fhj implements InterfaceC67781Qiv {
    public final Object LJLIL;

    public /* synthetic */ C39679Fhj(C67757QiX c67757QiX) {
        this.LJLIL = c67757QiX;
    }

    public /* synthetic */ C39679Fhj(EnumC125884wq operation) {
        o.LJIIIZ(operation, "operation");
        this.LJLIL = operation;
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZIZ(Bundle bundle) {
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            C67757QiX c67757QiX = (C67757QiX) this.LJLIL;
            Bundle bundle2 = c67757QiX.LJLJLLL;
            if (bundle2 == null) {
                c67757QiX.LJLJLLL = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            Object obj = this.LJLIL;
            ((C67757QiX) obj).LJLL = ConnectionResult.RESULT_SUCCESS;
            C67757QiX.LJIIJJI((C67757QiX) obj);
        } finally {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
        }
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZJ(ConnectionResult connectionResult) {
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            Object obj = this.LJLIL;
            ((C67757QiX) obj).LJLL = connectionResult;
            C67757QiX.LJIIJJI((C67757QiX) obj);
        } finally {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
        }
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZ(int i, boolean z) {
        Lock lock;
        ConnectionResult connectionResult;
        ((C67757QiX) this.LJLIL).LJLLJ.lock();
        try {
            C67757QiX c67757QiX = (C67757QiX) this.LJLIL;
            if (c67757QiX.LJLLILLLL || (connectionResult = c67757QiX.LJLLI) == null || !connectionResult.LJJJJZ()) {
                Object obj = this.LJLIL;
                ((C67757QiX) obj).LJLLILLLL = false;
                C67757QiX.LJIIJ((C67757QiX) obj, i, z);
                lock = ((C67757QiX) this.LJLIL).LJLLJ;
            } else {
                Object obj2 = this.LJLIL;
                ((C67757QiX) obj2).LJLLILLLL = true;
                ((C67757QiX) obj2).LJLJJL.v7(i);
                lock = ((C67757QiX) this.LJLIL).LJLLJ;
            }
            lock.unlock();
        } catch (Throwable th) {
            ((C67757QiX) this.LJLIL).LJLLJ.unlock();
            throw th;
        }
    }
}
