package X;

import Y.AfS0S0500100_12;
import android.text.TextUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rej, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70069Rej extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C70006Rdi LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ C70500Rlg LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70069Rej(C70006Rdi c70006Rdi, IPdpStarter.PdpEnterParam pdpEnterParam, C70500Rlg c70500Rlg, ActivityC45651qj activityC45651qj, long j) {
        super(0);
        this.LJLIL = c70006Rdi;
        this.LJLILLLLZI = pdpEnterParam;
        this.LJLJI = c70500Rlg;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        String str;
        ProductPackStruct productPackStruct = this.LJLIL.LIZLLL;
        boolean z2 = false;
        if (productPackStruct != null) {
            if (TextUtils.isEmpty(this.LJLILLLLZI.getChainKey()) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
                HashMap<String, Object> visitReportParams = this.LJLILLLLZI.getVisitReportParams();
                if (visitReportParams != null) {
                    visitReportParams.put("chain_key", productPackStruct.chainKey);
                }
                this.LJLILLLLZI.setChainKey(productPackStruct.chainKey);
            }
            InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
            C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
            String req = this.LJLIL.LIZ;
            c69995RdX.getClass();
            o.LJIIIZ(req, "req");
            C69995RdX.LJLJLJ.remove(req);
            C69995RdX.LJLJLLL.remove(req);
            C70500Rlg.LIZLLL(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, productPackStruct, this.LJLJJL, this.LJLIL.LIZIZ);
            u.LJJIIJZLJL("open 1", this.LJLILLLLZI.getTrackParams());
        } else {
            C34K c34k = new C34K();
            if (PdpViewModel.LLLJIL.get(this.LJLILLLLZI.getProductId()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJLILLLLZI.getPdpCacheKey() != null && C78685UuP.LJJJZ(this.LJLILLLLZI.getPdpCacheKey())) {
                z2 = true;
            }
            if (!this.LJLILLLLZI.getPdpPreParam().isEmpty()) {
                c34k.element = true;
            }
            if (z2 || z) {
                c34k.element = true;
            }
            C70500Rlg c70500Rlg = this.LJLJI;
            C70006Rdi c70006Rdi = this.LJLIL;
            AbstractC73672Svk<ProductPackStruct> abstractC73672Svk = c70006Rdi.LIZJ;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLILLLLZI;
            ActivityC45651qj activityC45651qj = this.LJLJJI;
            long j = this.LJLJJL;
            c70500Rlg.LIZIZ = (C73411SrX) abstractC73672Svk.LJJJLIIL(new AfS0S0500100_12(j, activityC45651qj, c70006Rdi, pdpEnterParam, c70500Rlg, c34k, 0), new AfS0S0500100_12(j, activityC45651qj, c70006Rdi, pdpEnterParam, c70500Rlg, c34k, 1));
            if (c34k.element) {
                C70500Rlg.LIZLLL(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, null, this.LJLJJL, this.LJLIL.LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
