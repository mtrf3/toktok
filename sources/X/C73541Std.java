package X;

import java.util.concurrent.Callable;

/* renamed from: X.Std, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73541Std extends AbstractC73547Stj {
    public final Callable<? extends InterfaceC73445Ss5> LJLIL;

    public C73541Std(Callable<? extends InterfaceC73445Ss5> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        try {
            InterfaceC73445Ss5 call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "The completableSupplier returned a null CompletableSource");
            call.LIZ(interfaceC73442Ss2);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC73442Ss2);
        }
    }
}
