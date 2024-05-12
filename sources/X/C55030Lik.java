package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

/* renamed from: X.Lik, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55030Lik extends AbstractC50421Jqb<C55028Lii, C51031K1b<C55028Lii>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT + i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55030Lik(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C55028Lii ? abstractC51036K1g : new C55028Lii();
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        Object microAppId = m89.getMicroAppId();
        Object hashTagName = m89.getHashTagName();
        int cursor = m89.getCursor();
        this.mPresenter.LJIILL(4, microAppId, hashTagName, Integer.valueOf(m89.getCount()), Integer.valueOf(cursor));
    }
}
