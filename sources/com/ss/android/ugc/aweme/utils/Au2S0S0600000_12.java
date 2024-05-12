package com.ss.android.ugc.aweme.utils;

import X.C68322mC;
import X.C69951Rcp;
import X.C69961Rcz;
import X.C69964Rd2;
import X.C70101RfF;
import X.InterfaceC71003Rtn;
import X.InterfaceC79150V4o;
import X.SY4;
import X.TAT;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.api.ClaimVoucherApi;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S0S0600000_12 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S0600000_12 au2S0S0600000_12, View view) {
        if (view != null) {
            ((View) au2S0S0600000_12.l0).setVisibility(8);
            InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) ((C68322mC) au2S0S0600000_12.l1).element;
            if (interfaceC79150V4o != null) {
                interfaceC79150V4o.LIZIZ(null);
            }
            C69964Rd2.LIZIZ((InterfaceC71003Rtn) au2S0S0600000_12.l2, (Map) au2S0S0600000_12.l3, "use", "top_voucher_remind");
            PdpViewModel.Tw0(9, 12, (View) au2S0S0600000_12.l0, (PdpViewModel) au2S0S0600000_12.l4, ((RecallBox) au2S0S0600000_12.l5).daInfo);
        }
    }

    public static final void LIZ$1(Au2S0S0600000_12 au2S0S0600000_12, View view) {
        boolean z;
        String str;
        String str2;
        ProductBase productBase;
        ProductPrice productPrice;
        if (view != null) {
            VoucherBox voucherBox = ((RecallBox) au2S0S0600000_12.l0).voucherBox;
            if (voucherBox != null) {
                z = o.LJ(voucherBox.isClaimed, Boolean.TRUE);
            } else {
                z = false;
            }
            if (z) {
                C69964Rd2.LIZIZ((InterfaceC71003Rtn) au2S0S0600000_12.l1, (HashMap) au2S0S0600000_12.l2, "use", "pdp_top");
            } else {
                C69964Rd2.LIZIZ((InterfaceC71003Rtn) au2S0S0600000_12.l1, (HashMap) au2S0S0600000_12.l2, "claim", "pdp_top");
            }
            ((SY4) ((View) au2S0S0600000_12.l3).findViewById(R.id.ic3)).setLoading(true);
            VoucherBox voucherBox2 = ((RecallBox) au2S0S0600000_12.l0).voucherBox;
            if (voucherBox2 != null && (str = voucherBox2.voucherTypeId) != null) {
                PdpViewModel pdpViewModel = (PdpViewModel) au2S0S0600000_12.l4;
                o.LJIIIIZZ(((ViewGroup) au2S0S0600000_12.l5).getContext(), "parent.context");
                ViewGroup view2 = (ViewGroup) au2S0S0600000_12.l5;
                RecallBox recallBox = (RecallBox) au2S0S0600000_12.l0;
                InterfaceC71003Rtn interfaceC71003Rtn = (InterfaceC71003Rtn) au2S0S0600000_12.l1;
                pdpViewModel.getClass();
                o.LJIIIZ(view2, "view");
                o.LJIIIZ(recallBox, "recallBox");
                VoucherBox voucherBox3 = recallBox.voucherBox;
                if (voucherBox3 != null && o.LJ(voucherBox3.isClaimed, Boolean.TRUE)) {
                    pdpViewModel.LLJJIJI = -1L;
                    PdpViewModel.Tw0(4, 12, view2, pdpViewModel, recallBox.daInfo);
                    return;
                }
                ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
                    str2 = productPrice.realPrice;
                } else {
                    str2 = null;
                }
                C70101RfF c70101RfF = IPdpStarter.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LJLJJLL;
                c70101RfF.getClass();
                int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam);
                C69961Rcz c69961Rcz = ClaimVoucherApi.LIZ;
                ClaimVoucherRequest claimVoucherRequest = new ClaimVoucherRequest(str, 1, Integer.valueOf(LIZIZ));
                c69961Rcz.getClass();
                C69961Rcz.LIZ(claimVoucherRequest).LIZ(new C69951Rcp(pdpViewModel, view2, recallBox, interfaceC71003Rtn, str2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S0600000_12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
