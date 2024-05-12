package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IOG implements Runnable {
    public final /* synthetic */ int LJLIL = 1;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    C67761Qib c67761Qib = (C67761Qib) this.LJLILLLLZI;
                    c67761Qib.LIZLLL.cancelAvailabilityErrorNotifications(c67761Qib.LIZJ);
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    ((InterfaceC65784Pro) this.LJLILLLLZI).invoke();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public IOG(C35603DyB function) {
        o.LJIIIZ(function, "function");
        this.LJLILLLLZI = function;
    }

    public IOG(C67761Qib c67761Qib) {
        this.LJLILLLLZI = c67761Qib;
    }
}
