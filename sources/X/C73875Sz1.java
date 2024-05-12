package X;

import java.util.concurrent.Callable;

/* renamed from: X.Sz1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73875Sz1<T, U> extends AbstractC73430Srq<T, U> {
    public final Callable<? extends U> LJLILLLLZI;
    public final InterfaceC73459SsJ<? super U, ? super T> LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super U> interfaceC116954iR) {
        try {
            U call = this.LJLILLLLZI.call();
            C73320Sq4.LIZ(call, "The initialSupplier returned a null value");
            this.LJLIL.LIZ(new C73876Sz2(interfaceC116954iR, call, this.LJLJI));
        } catch (Throwable th) {
            EnumC73538Sta.error(th, interfaceC116954iR);
        }
    }

    public C73875Sz1(InterfaceC115714gR<T> interfaceC115714gR, Callable<? extends U> callable, InterfaceC73459SsJ<? super U, ? super T> interfaceC73459SsJ) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = callable;
        this.LJLJI = interfaceC73459SsJ;
    }
}
