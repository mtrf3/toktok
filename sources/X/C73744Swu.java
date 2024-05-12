package X;

import java.util.concurrent.Callable;

/* renamed from: X.Swu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73744Swu<T, R> extends AbstractC73745Swv<R> {
    public final T LJLILLLLZI;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends R>> LJLJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super R> interfaceC73740Swq) {
        try {
            InterfaceC73650SvO<? extends R> apply = this.LJLJI.apply(this.LJLILLLLZI);
            C73320Sq4.LIZ(apply, "The mapper returned a null Publisher");
            InterfaceC73650SvO<? extends R> interfaceC73650SvO = apply;
            if (interfaceC73650SvO instanceof Callable) {
                try {
                    Object call = ((Callable) interfaceC73650SvO).call();
                    if (call == null) {
                        EnumC73747Swx.complete(interfaceC73740Swq);
                        return;
                    } else {
                        interfaceC73740Swq.onSubscribe(new C73741Swr(interfaceC73740Swq, call));
                        return;
                    }
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    EnumC73747Swx.error(th, interfaceC73740Swq);
                    return;
                }
            }
            interfaceC73650SvO.subscribe(interfaceC73740Swq);
        } catch (Throwable th2) {
            EnumC73747Swx.error(th2, interfaceC73740Swq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C73744Swu(InterfaceC48038ItG interfaceC48038ItG, Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI = interfaceC48038ItG;
    }
}
