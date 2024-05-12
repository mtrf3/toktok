package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KNv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51623KNv extends AbstractC50421Jqb<C51621KNt, C51031K1b<C51621KNt>> {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C51623KNv(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C51621KNt ? abstractC51036K1g : null;
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i));
    }
}
