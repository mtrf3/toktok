package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rcp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69951Rcp extends AbstractC73391SrD<ClaimVoucherResponse> {
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ RecallBox LJLJJI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        String str;
        ClaimVoucherResponse response = (ClaimVoucherResponse) obj;
        o.LJIIIZ(response, "response");
        if (response.isCodeOK()) {
            PdpViewModel pdpViewModel = this.LJLILLLLZI;
            PdpViewModel.bx0(pdpViewModel, false, true, null, new C69950Rco(pdpViewModel, response, this.LJLJJL, this.LJLJI, this.LJLJJLL), 12);
        } else {
            C26048AKe c26048AKe = new C26048AKe(this.LJLJI);
            c26048AKe.LJI(response.message);
            c26048AKe.LJII();
            RecallBox recallBox = this.LJLJJI;
            if (recallBox != null) {
                str = recallBox.daInfo;
            } else {
                str = null;
            }
            HashMap<String, Object> LJII = C27739Aud.LJII(str);
            InterfaceC71003Rtn interfaceC71003Rtn = this.LJLJJL;
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70883Rrr(), new AqS143S0200000_12((HashMap) LJII, (HashMap<String, Object>) response, (ClaimVoucherResponse) 10));
            }
        }
        dispose();
    }

    public C69951Rcp(PdpViewModel pdpViewModel, View view, RecallBox recallBox, InterfaceC71003Rtn interfaceC71003Rtn, String str) {
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = view;
        this.LJLJJI = recallBox;
        this.LJLJJL = interfaceC71003Rtn;
        this.LJLJJLL = str;
    }
}
