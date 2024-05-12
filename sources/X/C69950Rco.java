package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS143S0200000_12;

/* renamed from: X.Rco, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69950Rco extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ ClaimVoucherResponse LJLILLLLZI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69950Rco(PdpViewModel pdpViewModel, ClaimVoucherResponse claimVoucherResponse, InterfaceC71003Rtn interfaceC71003Rtn, View view, String str) {
        super(0);
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = claimVoucherResponse;
        this.LJLJI = interfaceC71003Rtn;
        this.LJLJJI = view;
        this.LJLJJL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        String str2;
        String str3;
        Voucher voucher;
        Voucher voucher2;
        Voucher voucher3;
        Voucher voucher4;
        PdpViewModel pdpViewModel = this.LJLIL;
        pdpViewModel.LLJJIJI = -1L;
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) this.LJLILLLLZI.data;
        String str4 = null;
        if (claimVoucherResponseData != null && (voucher4 = claimVoucherResponseData.getVoucher()) != null) {
            str = voucher4.getDaInfo();
        } else {
            str = null;
        }
        pdpViewModel.LLJJL = str;
        ClaimVoucherResponseData claimVoucherResponseData2 = (ClaimVoucherResponseData) this.LJLILLLLZI.data;
        if (claimVoucherResponseData2 != null && (voucher3 = claimVoucherResponseData2.getVoucher()) != null) {
            str2 = voucher3.getDaInfo();
        } else {
            str2 = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str2);
        InterfaceC71003Rtn interfaceC71003Rtn = this.LJLJI;
        if (interfaceC71003Rtn != null) {
            C78946Uyc.LJJII(interfaceC71003Rtn, new C70883Rrr(), new AqS143S0200000_12((HashMap) LJII, (HashMap<String, Object>) this.LJLILLLLZI, (ClaimVoucherResponse) 9));
        }
        PdpViewModel pdpViewModel2 = this.LJLIL;
        View view = this.LJLJJI;
        String str5 = this.LJLJJL;
        ClaimVoucherResponseData claimVoucherResponseData3 = (ClaimVoucherResponseData) this.LJLILLLLZI.data;
        if (claimVoucherResponseData3 != null && (voucher2 = claimVoucherResponseData3.getVoucher()) != null) {
            str3 = voucher2.getVoucherTypeID();
        } else {
            str3 = null;
        }
        ClaimVoucherResponseData claimVoucherResponseData4 = (ClaimVoucherResponseData) this.LJLILLLLZI.data;
        if (claimVoucherResponseData4 != null && (voucher = claimVoucherResponseData4.getVoucher()) != null) {
            str4 = voucher.getDaInfo();
        }
        pdpViewModel2.Sw0(4, view, str5, str3, str4);
        return C76800UCe.LIZ;
    }
}
