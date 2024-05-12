package X;

import android.text.TextUtils;

/* renamed from: X.Lqg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55522Lqg extends AbstractC50421Jqb<MH1, C51031K1b<MH1>> {
    public final String LJLIL;

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        if (TextUtils.equals("from_discovery_challenge", this.LJLIL)) {
            return 9000;
        }
        return i + 3000;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55522Lqg(AbstractC51036K1g abstractC51036K1g, String str) {
        MH1 mh1;
        this.mModel = abstractC51036K1g instanceof MH1 ? abstractC51036K1g : new MH1();
        this.mPresenter = new C51031K1b();
        this.LJLIL = str;
        if (TextUtils.equals("from_discovery_challenge", str) && (mh1 = this.mModel) != null) {
            MH1 mh12 = mh1;
            if (!TextUtils.isEmpty("discovery_challenge_video")) {
                mh12.LJLJI = "discovery_challenge_video";
            }
        }
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.mPresenter.LJIILL(Integer.valueOf(i), m89.getChallengeId(), Integer.valueOf(m89.getVideoType()), Boolean.FALSE);
    }
}
