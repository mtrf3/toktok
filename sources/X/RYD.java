package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYD extends AbstractC73391SrD<ClaimVoucherResponse> {
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ Voucher LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        LIZ(1, null, "");
        dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        LIZ(1, null, "");
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
        int i = 1;
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
                if (claimVoucherResponseData2 != null && o.LJ(claimVoucherResponseData2.getCanRetry(), Boolean.FALSE)) {
                    i = 4;
                }
            }
        } else {
            ClaimVoucherResponseData claimVoucherResponseData3 = (ClaimVoucherResponseData) response.data;
            if (claimVoucherResponseData3 != null && o.LJ(claimVoucherResponseData3.getCanRetry(), Boolean.FALSE)) {
                i = 4;
            }
            valueOf = String.valueOf(response.code);
        }
        ClaimVoucherResponseData claimVoucherResponseData4 = (ClaimVoucherResponseData) response.data;
        if (claimVoucherResponseData4 != null) {
            voucher = claimVoucherResponseData4.getVoucher();
        } else {
            voucher = null;
        }
        LIZ(i, voucher, valueOf);
        dispose();
    }

    public final void LIZ(int i, Voucher voucher, String reason) {
        Voucher voucher2;
        int i2;
        ProductPackStruct productPackStruct;
        List<PromotionDiscount> list;
        List<Voucher> list2;
        o.LJIIIZ(reason, "reason");
        PdpViewModel pdpViewModel = this.LJLILLLLZI;
        View view = this.LJLJI;
        pdpViewModel.getClass();
        PdpViewModel.lx0(i, view);
        if (voucher != null && (productPackStruct = this.LJLILLLLZI.LJLJLLL) != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    List<Voucher> LLJILJILJ = ORZ.LLJILJILJ(list2);
                    int size = ((ArrayList) LLJILJILJ).size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (o.LJ(((Voucher) ListProtector.get(LLJILJILJ, i3)).getVoucherTypeID(), voucher.getVoucherTypeID())) {
                            ListProtector.set(LLJILJILJ, i3, voucher);
                            break;
                        }
                        i3++;
                    }
                    promotionDiscount.discounts = LLJILJILJ;
                }
            }
        }
        PdpViewModel pdpViewModel2 = this.LJLILLLLZI;
        C70414RkI c70414RkI = pdpViewModel2.LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLIL(pdpViewModel2.LJLJLLL);
        }
        PdpViewModel pdpViewModel3 = this.LJLILLLLZI;
        pdpViewModel3.setState(new AqS178S0100000_12(pdpViewModel3, 64));
        C70414RkI c70414RkI2 = this.LJLILLLLZI.LLFII;
        if (c70414RkI2 != null) {
            if (voucher == null) {
                voucher2 = this.LJLJJI;
            } else {
                voucher2 = voucher;
            }
            if (i == 3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c70414RkI2.LJJIIJZLJL(voucher2, i2, reason, this.LJLJJL, Boolean.FALSE);
        }
        if (i == 3 && voucher != null) {
            this.LJLILLLLZI.getClass();
            PdpViewModel.ex0(voucher);
        }
    }

    public RYD(PdpViewModel pdpViewModel, View view, Voucher voucher, int i) {
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = view;
        this.LJLJJI = voucher;
        this.LJLJJL = i;
    }
}
