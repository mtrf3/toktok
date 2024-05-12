package X;

import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KNz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51627KNz<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC88472Yns<T, C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJLJI;
    public InterfaceC92693kP LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        if (interfaceC92693kP != null) {
            return interfaceC92693kP.isDisposed();
        }
        return true;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        try {
            try {
                this.LJLILLLLZI.invoke();
            } catch (Exception e) {
                onError(e);
            }
        } finally {
            dispose();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        try {
            try {
                this.LJLJI.invoke(e);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } finally {
            dispose();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        try {
            this.LJLIL.invoke(t);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLJJI = d;
    }

    public C51627KNz(AqS139S0200000_8 aqS139S0200000_8, AqS139S0200000_8 aqS139S0200000_82) {
        KO3 onExecuteOnceComplete = KO3.LJLIL;
        o.LJIIIZ(onExecuteOnceComplete, "onExecuteOnceComplete");
        this.LJLIL = aqS139S0200000_8;
        this.LJLILLLLZI = onExecuteOnceComplete;
        this.LJLJI = aqS139S0200000_82;
    }
}
