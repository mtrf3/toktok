package X;

import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.Fhk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39680Fhk implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ Object LJLILLLLZI;

    public final void LIZ() {
        ((C67757QiX) this.LJLILLLLZI).LJLLJ.lock();
        try {
            C67757QiX.LJIIJJI((C67757QiX) this.LJLILLLLZI);
        } finally {
            ((C67757QiX) this.LJLILLLLZI).LJLLJ.unlock();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
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

    public RunnableC39680Fhk(C67757QiX c67757QiX) {
        this.LJLILLLLZI = c67757QiX;
    }

    public RunnableC39680Fhk(AqS158S0100000_8 aqS158S0100000_8) {
        this.LJLILLLLZI = aqS158S0100000_8;
    }
}
