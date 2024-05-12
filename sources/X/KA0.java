package X;

import Y.ACallableS85S0200000_8;
import Y.AgS25S0210000_8;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA0 implements KCK {
    public final /* synthetic */ EcSearchSugAssemVM LIZ;

    @Override // X.KCK
    public final void onFail() {
        this.LIZ.gv0("no_data");
        this.LIZ.setState(C51270KAg.LJLIL);
    }

    public KA0(EcSearchSugAssemVM ecSearchSugAssemVM) {
        this.LIZ = ecSearchSugAssemVM;
    }

    @Override // X.KCK
    public final void LIZ(String keyword) {
        KAC Yr0;
        o.LJIIIZ(keyword, "keyword");
        ISearchSugContextAbility iSearchSugContextAbility = this.LIZ.LJLILLLLZI;
        if (iSearchSugContextAbility != null && (Yr0 = iSearchSugContextAbility.Yr0()) != null && Yr0.LIZJ) {
            SearchMiddleForEcService.LJJJJLI().LIZ(keyword);
        } else {
            ((ArrayList) C51249K9l.LJ).add(keyword);
        }
    }

    @Override // X.KCK
    public final void LIZIZ(EcSearchSugResponse ecSearchSugResponse, boolean z) {
        KAU kau;
        ISearchSugContextAbility iSearchSugContextAbility = this.LIZ.LJLILLLLZI;
        if (iSearchSugContextAbility != null) {
            kau = iSearchSugContextAbility.getPageState();
        } else {
            kau = null;
        }
        if (kau != KAU.SUG) {
            this.LIZ.gv0("has_left");
            return;
        }
        if (!z) {
            Long l = ecSearchSugResponse.requestOrder;
            o.LJIIIIZZ(l, "response.requestOrder");
            long longValue = l.longValue();
            KCM.LJJIL.getClass();
            if (longValue < KCN.LIZJ) {
                this.LIZ.gv0("sug_order_failed");
                return;
            }
        }
        KCN kcn = KCM.LJJIL;
        Long l2 = ecSearchSugResponse.requestOrder;
        o.LJIIIIZZ(l2, "response.requestOrder");
        long longValue2 = l2.longValue();
        kcn.getClass();
        KCN.LIZJ = longValue2;
        EcSearchSugAssemVM ecSearchSugAssemVM = this.LIZ;
        ecSearchSugAssemVM.LJLJLJ = ecSearchSugResponse.logPb;
        ecSearchSugAssemVM.LJLJLLL = ecSearchSugResponse.recommendWordMob;
        C10K.LIZJ(new ACallableS85S0200000_8(ecSearchSugAssemVM, ecSearchSugResponse, 6)).LJ(new AgS25S0210000_8(this.LIZ, ecSearchSugResponse, z, 1), C10K.LJIIIIZZ, null);
    }
}
