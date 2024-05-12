package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYE extends AbstractC73391SrD<ClaimVoucherResponse> {
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Voucher LJLJJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLILLLLZI.Uw0(this.LJLJI, this.LJLJJI, 1, "", null, this.LJLJJL);
        dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLILLLLZI.Uw0(this.LJLJI, this.LJLJJI, 1, "", null, this.LJLJJL);
        dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        String valueOf;
        Voucher voucher;
        boolean z;
        Voucher voucher2;
        String voucherID;
        Response response = (Response) obj;
        o.LJIIIZ(response, "response");
        int i = 4;
        boolean z2 = false;
        if (response.isCodeOK()) {
            ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) response.data;
            if (claimVoucherResponseData != null && (voucher2 = claimVoucherResponseData.getVoucher()) != null && (voucherID = voucher2.getVoucherID()) != null && C78857UxB.LJJJIL(voucherID)) {
                z = true;
            } else {
                z = false;
            }
            valueOf = "";
            if (z) {
                i = 3;
            } else {
                ClaimVoucherResponseData claimVoucherResponseData2 = (ClaimVoucherResponseData) response.data;
                if (claimVoucherResponseData2 != null) {
                    z2 = o.LJ(claimVoucherResponseData2.getCanRetry(), Boolean.FALSE);
                }
                if (z2) {
                    i = 4;
                } else {
                    i = 1;
                }
            }
        } else {
            ClaimVoucherResponseData claimVoucherResponseData3 = (ClaimVoucherResponseData) response.data;
            if (claimVoucherResponseData3 == null || !o.LJ(claimVoucherResponseData3.getCanRetry(), Boolean.FALSE)) {
                i = 1;
            }
            valueOf = String.valueOf(response.code);
        }
        PdpViewModel pdpViewModel = this.LJLILLLLZI;
        Context context = this.LJLJI;
        int i2 = this.LJLJJI;
        ClaimVoucherResponseData claimVoucherResponseData4 = (ClaimVoucherResponseData) response.data;
        if (claimVoucherResponseData4 != null) {
            voucher = claimVoucherResponseData4.getVoucher();
        } else {
            voucher = null;
        }
        pdpViewModel.Uw0(context, i2, i, valueOf, voucher, this.LJLJJL);
        dispose();
    }

    public RYE(PdpViewModel pdpViewModel, Context context, int i, Voucher voucher) {
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = context;
        this.LJLJJI = i;
        this.LJLJJL = voucher;
    }
}
