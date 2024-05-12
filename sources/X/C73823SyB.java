package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SyB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73823SyB<T> extends AbstractC73638SvC<T> {
    public final InterfaceC73471SsV<? extends T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final boolean LJLJJL = false;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        C73616Suq c73616Suq = new C73616Suq();
        interfaceC73463SsN.onSubscribe(c73616Suq);
        this.LJLIL.LIZ(new C73824SyC(this, c73616Suq, interfaceC73463SsN));
    }

    public C73823SyB(InterfaceC73471SsV interfaceC73471SsV, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73471SsV;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
