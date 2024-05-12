package X;

import java.util.concurrent.Callable;

/* renamed from: X.Srs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73432Srs<T> extends AbstractC73672Svk<T> {
    public final Callable<? extends InterfaceC115714gR<? extends T>> LJLIL;

    public C73432Srs(Callable<? extends InterfaceC115714gR<? extends T>> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        try {
            InterfaceC115714gR<? extends T> call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "null ObservableSource supplied");
            call.LIZ(interfaceC116954iR);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC116954iR);
        }
    }
}
