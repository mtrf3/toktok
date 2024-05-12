package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Szf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73915Szf<T> extends AbstractC73672Svk<T> implements InterfaceC92693kP {
    public final InterfaceC73916Szg LJLIL;
    public final String LJLILLLLZI = "UplinkRequestObservable";
    public final AtomicReference<InterfaceC92693kP> LJLJI = new AtomicReference<>();
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLJI);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(this.LJLJI.get());
    }

    public C73915Szf(YMG ymg) {
        this.LJLIL = ymg;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (interfaceC116954iR != null) {
            interfaceC116954iR.onSubscribe(this);
        }
        this.LJLIL.LIZ(new C73914Sze(interfaceC116954iR, this));
    }
}
