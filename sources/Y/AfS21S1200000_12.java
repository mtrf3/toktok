package Y;

import X.C2VO;
import X.C70006Rdi;
import X.ExecutorC142245i8;
import X.InterfaceC64592gB;
import X.InterfaceC74451TJv;
import X.OSZ;
import X.TLJ;
import X.TLS;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;

/* loaded from: classes13.dex */
public class AfS21S1200000_12 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS21S1200000_12 afS21S1200000_12, Object obj) {
        InterfaceC74451TJv<EffectCategoryResponse, Effect> bs0;
        LiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> qq0;
        TLJ tlj = ((TLS) afS21S1200000_12.l1).LJJIIJ;
        if (tlj != null && (bs0 = tlj.bs0()) != null && (qq0 = bs0.qq0()) != null) {
            qq0.observe(((TLS) afS21S1200000_12.l1).LJJIII, new AObserverS80S0100000_12(afS21S1200000_12, 50));
        }
    }

    public static final void accept$1(AfS21S1200000_12 afS21S1200000_12, Object obj) {
        ((C70006Rdi) afS21S1200000_12.l1).LIZLLL = (ProductPackStruct) obj;
        if (C2VO.LIZ().prefetchTimeout * 1000 > 0) {
            ExecutorC142245i8.LJLILLLLZI.LIZ(C2VO.LIZ().prefetchTimeout * 1000, new ARunnableS13S1100000_12((IPdpStarter.PdpEnterParam) afS21S1200000_12.l2, afS21S1200000_12.s0, 3));
        }
    }

    public AfS21S1200000_12(String str, Object obj, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
