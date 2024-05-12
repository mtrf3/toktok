package com.ss.android.ugc.aweme.utils;

import X.C113554cx;
import X.C26059AKp;
import X.C27739Aud;
import X.OSZ;
import X.TAT;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;

/* loaded from: classes13.dex */
public class Au2S3S0210000_12 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void LIZ$0(Au2S3S0210000_12 au2S3S0210000_12, View view) {
        String str;
        if (view != null && ((SkuPanelBottomWidget) au2S3S0210000_12.l0).clickable) {
            C26059AKp.LIZ().LIZ("ec_sku_user_transform", C27739Aud.LJI(C113554cx.LJJLIIIIJ(new OSZ("trans_from_type", "2"))));
            if (au2S3S0210000_12.z2) {
                SkuPanelViewModel viewModel = ((SkuPanelBottomWidget) au2S3S0210000_12.l0).getViewModel();
                AddToCartButton addToCartButton = (AddToCartButton) au2S3S0210000_12.l1;
                if (addToCartButton != null) {
                    str = addToCartButton.clickHint;
                } else {
                    str = null;
                }
                SkuPanelViewModel.Uv0(viewModel, str);
                return;
            }
            SkuPanelBottomWidget skuPanelBottomWidget = (SkuPanelBottomWidget) au2S3S0210000_12.l0;
            int i = skuPanelBottomWidget.clickFrom;
            if (i == 3) {
                skuPanelBottomWidget.checkMchessPropAndChangeSkuItem();
            } else if (i == 10) {
                skuPanelBottomWidget.checkMchessPropAndReplaceItem();
            } else {
                skuPanelBottomWidget.checkMchessPropAndBuyNow();
            }
        }
    }

    public static final void LIZ$1(Au2S3S0210000_12 au2S3S0210000_12, View view) {
        String str;
        if (view != null && ((SkuPanelBottomWidget) au2S3S0210000_12.l0).clickable) {
            C26059AKp.LIZ().LIZ("ec_sku_user_transform", C27739Aud.LJI(C113554cx.LJJLIIIIJ(new OSZ("trans_from_type", "1"))));
            if (au2S3S0210000_12.z2) {
                SkuPanelViewModel viewModel = ((SkuPanelBottomWidget) au2S3S0210000_12.l0).getViewModel();
                AddToCartButton addToCartButton = (AddToCartButton) au2S3S0210000_12.l1;
                if (addToCartButton != null) {
                    str = addToCartButton.clickHint;
                } else {
                    str = null;
                }
                SkuPanelViewModel.Uv0(viewModel, str);
                return;
            }
            ((SkuPanelBottomWidget) au2S3S0210000_12.l0).checkMchessPropAndAddCart();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(com.ss.android.ugc.aweme.utils.Au2S3S0210000_12 r32, android.view.View r33) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S3S0210000_12.LIZ$2(com.ss.android.ugc.aweme.utils.Au2S3S0210000_12, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S3S0210000_12(Object obj, boolean z, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
