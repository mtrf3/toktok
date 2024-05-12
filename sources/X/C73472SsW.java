package X;

import Y.ACallableS32S1200000_1;
import java.util.concurrent.Callable;

/* renamed from: X.SsW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73472SsW<T> extends AbstractC73638SvC<T> {
    public final Callable<? extends InterfaceC73471SsV<? extends T>> LJLIL;

    public C73472SsW(ACallableS32S1200000_1 aCallableS32S1200000_1) {
        this.LJLIL = aCallableS32S1200000_1;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        try {
            InterfaceC73471SsV<? extends T> call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "The singleSupplier returned a null SingleSource");
            call.LIZ(interfaceC73463SsN);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC73463SsN);
        }
    }
}
