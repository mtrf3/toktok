package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;

/* renamed from: X.Lqe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55520Lqe extends AbstractC50421Jqb<C56542MHa, C51031K1b<C56542MHa>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return i + LivePlayerResourceReleaseSetting.ENABLE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55520Lqe(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C56542MHa ? abstractC51036K1g : new C56542MHa();
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.mPresenter.LJIILL(Integer.valueOf(i), m89.getMusicId(), Integer.valueOf(m89.getVideoType()));
    }
}
