package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;

/* loaded from: classes13.dex */
public final class RYL<T> implements InterfaceC64592gB {
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RYL(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i) {
        this.LJLIL = pdpEnterParam;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        c69995RdX.getClass();
        C69995RdX.LJLJL = currentTimeMillis;
        if (EcPdpSlowFuncOpt.LIZIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C69918RcI(this.LJLIL.clone(), this.LJLILLLLZI, this.LJLJI, null), 3);
        } else {
            C69995RdX.LLLZI(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        }
    }
}
