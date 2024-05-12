package X;

import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;

/* renamed from: X.UdS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77634UdS<T> implements InterfaceC86003Zc {
    public final /* synthetic */ C77631UdP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC77685UeH LJLJJL;
    public final /* synthetic */ RecommendStrategyParam LJLJJLL;

    public C77634UdS(C77631UdP c77631UdP, int i, long j, long j2, EnumC77641UdZ enumC77641UdZ, RecommendStrategyParam recommendStrategyParam) {
        this.LJLIL = c77631UdP;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = enumC77641UdZ;
        this.LJLJJLL = recommendStrategyParam;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77626UdK> interfaceC73573Su9) {
        try {
            interfaceC73573Su9.onNext(this.LJLIL.LJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, false, this.LJLJJLL, false));
            interfaceC73573Su9.onComplete();
        } catch (Throwable th) {
            if (interfaceC73573Su9.isDisposed()) {
                C0NB.LJFF("RechargeService", " queryDiamond disposed", th);
            } else {
                interfaceC73573Su9.onError(th);
            }
        }
    }
}
