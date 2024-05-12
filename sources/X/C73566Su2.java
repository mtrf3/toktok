package X;

import java.util.concurrent.Callable;

/* renamed from: X.Su2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73566Su2<T, R> extends AbstractC73672Svk<R> {
    public final T LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super R> interfaceC116954iR) {
        try {
            InterfaceC115714gR<? extends R> apply = this.LJLILLLLZI.apply(this.LJLIL);
            C73320Sq4.LIZ(apply, "The mapper returned a null ObservableSource");
            InterfaceC115714gR<? extends R> interfaceC115714gR = apply;
            if (interfaceC115714gR instanceof Callable) {
                try {
                    Object call = ((Callable) interfaceC115714gR).call();
                    if (call == null) {
                        EnumC73538Sta.complete(interfaceC116954iR);
                        return;
                    }
                    RunnableC73564Su0 runnableC73564Su0 = new RunnableC73564Su0(interfaceC116954iR, call);
                    interfaceC116954iR.onSubscribe(runnableC73564Su0);
                    runnableC73564Su0.run();
                    return;
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    EnumC73538Sta.error(th, interfaceC116954iR);
                    return;
                }
            }
            interfaceC115714gR.LIZ(interfaceC116954iR);
        } catch (Throwable th2) {
            EnumC73538Sta.error(th2, interfaceC116954iR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C73566Su2(InterfaceC48038ItG interfaceC48038ItG, Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
