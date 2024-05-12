package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.StP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73527StP<T> extends AbstractC73528StQ<T, T> {
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL.LIZ(new RunnableC73515StD(interfaceC73509St7, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
    }

    public C73527StP(long j, C73531StT c73531StT, AbstractC73946T0k abstractC73946T0k, TimeUnit timeUnit) {
        super(c73531StT);
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
