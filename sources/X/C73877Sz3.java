package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Sz3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73877Sz3<T> extends AbstractC73430Srq<T, T> {
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final boolean LJLJJL;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73844SyW c73844SyW = new C73844SyW(interfaceC116954iR);
        if (this.LJLJJL) {
            this.LJLIL.LIZ(new C73880Sz6(c73844SyW, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        } else {
            this.LJLIL.LIZ(new C73882Sz8(c73844SyW, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        }
    }

    public C73877Sz3(InterfaceC115714gR interfaceC115714gR, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
        this.LJLJJL = false;
    }
}
