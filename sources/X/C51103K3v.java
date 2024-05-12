package X;

import kotlin.jvm.internal.o;

/* renamed from: X.K3v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51103K3v extends AbstractC50421Jqb<C43325GzR, C51031K1b<C43325GzR>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return this.mModel.isDataEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C51103K3v() {
        this.mModel = new C43325GzR();
        this.mPresenter = new C51031K1b();
    }
}
