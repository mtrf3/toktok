package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: X.SxO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73774SxO<T, K> extends AbstractC73430Srq<T, T> {
    public final InterfaceC48038ItG<? super T, K> LJLILLLLZI;
    public final Callable<? extends Collection<? super K>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73774SxO(AbstractC73672Svk abstractC73672Svk) {
        super(abstractC73672Svk);
        C73689Sw1 c73689Sw1 = C73674Svm.LIZ;
        EnumC163176an enumC163176an = EnumC163176an.LJLIL;
        this.LJLILLLLZI = c73689Sw1;
        this.LJLJI = enumC163176an;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        try {
            Collection<? super K> call = this.LJLJI.call();
            C73320Sq4.LIZ(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.LJLIL.LIZ(new C73837SyP(interfaceC116954iR, this.LJLILLLLZI, call));
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC116954iR);
        }
    }
}
