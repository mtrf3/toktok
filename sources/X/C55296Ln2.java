package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ln2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55296Ln2 extends AbstractC50421Jqb<C55289Lmv, C51031K1b<C55289Lmv>> {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55296Ln2(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        this.mModel = (!(abstractC51036K1g instanceof C55289Lmv) || abstractC51036K1g == null) ? new C55289Lmv() : abstractC51036K1g;
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i), feedParam, Integer.valueOf(i2), Boolean.valueOf(z));
    }
}
