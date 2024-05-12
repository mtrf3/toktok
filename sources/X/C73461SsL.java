package X;

import java.util.concurrent.Callable;

/* renamed from: X.SsL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73461SsL<T> extends AbstractC73638SvC<T> {
    public final InterfaceC73445Ss5 LJLIL;
    public final Callable<? extends T> LJLILLLLZI;
    public final T LJLJI;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLIL.LIZ(new C73462SsM(this, interfaceC73463SsN));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C73461SsL(InterfaceC73445Ss5 interfaceC73445Ss5, Callable callable, C76800UCe c76800UCe) {
        this.LJLIL = interfaceC73445Ss5;
        this.LJLJI = c76800UCe;
        this.LJLILLLLZI = callable;
    }
}
