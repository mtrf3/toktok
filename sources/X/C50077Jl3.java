package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Jl3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50077Jl3 extends AbstractC50421Jqb<C51648KOu, C51031K1b<C51648KOu>> {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C50077Jl3(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C51648KOu ? abstractC51036K1g : null;
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.mModel != 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i));
    }
}
