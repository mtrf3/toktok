package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: X.SwU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73718SwU<T, U extends Collection<? super T>> extends AbstractC73430Srq<T, U> {
    public final Callable<U> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super U> interfaceC116954iR) {
        try {
            U call = this.LJLILLLLZI.call();
            C73320Sq4.LIZ(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.LJLIL.LIZ(new C73720SwW(interfaceC116954iR, call));
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC116954iR);
        }
    }

    public C73718SwU(InterfaceC115714gR interfaceC115714gR, J0W j0w) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = j0w;
    }
}
