package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sz5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73879Sz5<T, U, R> extends AtomicReference<U> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -312246233408980075L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final RTU<? super T, ? super U, ? extends R> LJLILLLLZI;
    public final AtomicReference<InterfaceC92693kP> LJLJI = new AtomicReference<>();
    public final AtomicReference<InterfaceC92693kP> LJLJJI = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLJI);
        EnumC73418Sre.dispose(this.LJLJJI);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(this.LJLJI.get());
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLJJI);
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        EnumC73418Sre.dispose(this.LJLJJI);
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        U u = get();
        if (u != null) {
            try {
                R apply = this.LJLILLLLZI.apply(t, u);
                C73320Sq4.LIZ(apply, "The combiner returned a null value");
                this.LJLIL.onNext(apply);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                dispose();
                this.LJLIL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLJI, interfaceC92693kP);
    }

    public C73879Sz5(C73844SyW c73844SyW, RTU rtu) {
        this.LJLIL = c73844SyW;
        this.LJLILLLLZI = rtu;
    }
}
