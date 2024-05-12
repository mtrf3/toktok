package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lqa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55516Lqa extends AbstractC50421Jqb<C56563MHv, C51031K1b<C56563MHv>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return i + 19000;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55516Lqa(AbstractC51036K1g<?, ?> abstractC51036K1g, String str) {
        this.mModel = abstractC51036K1g instanceof C56563MHv ? abstractC51036K1g : new C56563MHv();
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        PRESENTER presenter = this.mPresenter;
        o.LJI(presenter);
        presenter.LJIILL(Integer.valueOf(i), feedParam.getQuestionId(), Integer.valueOf(feedParam.getVideoType()), Boolean.valueOf(z), feedParam.getIds(), Boolean.FALSE);
    }
}
