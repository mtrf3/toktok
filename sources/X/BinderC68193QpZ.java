package X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QpZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC68193QpZ extends AbstractBinderC68215Qpv {
    public final AtomicReference LJLIL = new AtomicReference();
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC68139Qoh
    public final void LJJJZ(Bundle bundle) {
        synchronized (this.LJLIL) {
            try {
                this.LJLIL.set(bundle);
                this.LJLILLLLZI = true;
            } finally {
                this.LJLIL.notify();
            }
        }
    }

    public final Bundle LLJI(long j) {
        Bundle bundle;
        synchronized (this.LJLIL) {
            if (!this.LJLILLLLZI) {
                try {
                    this.LJLIL.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.LJLIL.get();
        }
        return bundle;
    }

    public final String LLJJIII(long j) {
        return (String) LLZZJLIL(LLJI(j), String.class);
    }

    public static final Object LLZZJLIL(Bundle bundle, Class cls) {
        Object LLJJIII;
        if (bundle != null && (LLJJIII = C16880lQ.LLJJIII(bundle, "r")) != null) {
            try {
                LLJJIII = cls.cast(LLJJIII);
                return LLJJIII;
            } catch (ClassCastException e) {
                C16880lQ.LJLLILLLL(cls);
                C16880lQ.LJLLILLLL(LLJJIII.getClass());
                throw e;
            }
        }
        return null;
    }
}
