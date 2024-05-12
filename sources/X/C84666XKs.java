package X;

import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84666XKs extends XLA implements InterfaceC77431UaB {
    public final XL8 LJLJJL;

    @Override // X.InterfaceC77431UaB
    public final InterfaceC79150V4o getParent() {
        return LJJIII();
    }

    public C84666XKs(JobSupport jobSupport) {
        this.LJLJJL = jobSupport;
    }

    @Override // X.InterfaceC77431UaB
    public final boolean LJII(Throwable th) {
        return LJJIII().LJJJJI(th);
    }

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        this.LJLJJL.LJIIJJI(LJJIII());
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }
}
