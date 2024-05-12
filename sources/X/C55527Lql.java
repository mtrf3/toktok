package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lql, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55527Lql extends AbstractC50421Jqb<C55781Lur, C51031K1b<C55781Lur>> {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55527Lql(AbstractC51036K1g abstractC51036K1g, M89 param) {
        o.LJIIIZ(param, "param");
        this.mModel = abstractC51036K1g instanceof C55781Lur ? abstractC51036K1g : new C55781Lur(0L);
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i), feedParam, Integer.valueOf(i2), Boolean.valueOf(z));
    }
}
