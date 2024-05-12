package com.ss.android.ugc.aweme.utils;

import X.InterfaceC70593RnB;
import X.TAT;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist.WaistInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;

/* loaded from: classes13.dex */
public class Au2S1S1100000_12 extends TAT {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S1S1100000_12 au2S1S1100000_12, View view) {
        if (view != null) {
            ((WaistInfoViewHolder) au2S1S1100000_12.l1).openPanelWithSchema(au2S1S1100000_12.s0, "discounts_module");
        }
    }

    public static final void LIZ$1(Au2S1S1100000_12 au2S1S1100000_12, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC70593RnB interfaceC70593RnB;
        if (view != null && (interfaceC70593RnB = (commerceProductInfoView = (CommerceProductInfoView) au2S1S1100000_12.l1).couponLogListener) != null) {
            interfaceC70593RnB.LIZIZ(commerceProductInfoView.promotionView, commerceProductInfoView.couponTagShowCount, au2S1S1100000_12.s0);
        }
    }

    public static final void LIZ$2(Au2S1S1100000_12 au2S1S1100000_12, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((ReviewFragmentV1) au2S1S1100000_12.l1).getContext(), au2S1S1100000_12.s0).open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S1S1100000_12(Object obj, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
