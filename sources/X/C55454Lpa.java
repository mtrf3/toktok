package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lpa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55454Lpa extends AbstractC50421Jqb<C54886LgQ, C51031K1b<C54886LgQ>> {
    public C55454Lpa(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C54886LgQ ? abstractC51036K1g : null;
        this.mPresenter = new C55456Lpc();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        PRESENTER presenter = this.mPresenter;
        Object[] objArr = new Object[8];
        objArr[0] = feedParam.getUid();
        int i3 = 1;
        objArr[1] = feedParam.getSecUid();
        objArr[2] = Long.valueOf(feedParam.getMaxCursor());
        objArr[3] = 0L;
        objArr[4] = 6;
        if (feedParam.getMaxCursor() != 0) {
            i3 = 4;
        }
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = feedParam.getAdvId();
        objArr[7] = "";
        presenter.LJIILL(objArr);
    }
}
