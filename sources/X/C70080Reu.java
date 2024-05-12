package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS36S0300000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Reu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70080Reu extends TAT {
    public final /* synthetic */ PdpBottomNavBarWidget LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ AddToCartButton LJLJJLL;
    public final /* synthetic */ View LJLJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        AddToCartButton addToCartButton;
        Integer num;
        String str;
        PurchaseLimit purchaseLimit;
        String str2;
        View view2;
        if (view != null) {
            if (this.LJLJJI.getViewModel().LLIIIILZ) {
                FFL LJIIIZ = FFL.LJIIIZ();
                AnchorPdpPreloadModel anchorPdpPreloadModel = C70084Rey.LIZ;
                LJIIIZ.getClass();
                AnchorPdpPreloadModel anchorPdpPreloadModel2 = (AnchorPdpPreloadModel) FFL.LJIJ(true, "ec_anchor_pdp_preload_opt_android", 31744, AnchorPdpPreloadModel.class, anchorPdpPreloadModel);
                if (anchorPdpPreloadModel2 != null) {
                    anchorPdpPreloadModel = anchorPdpPreloadModel2;
                }
                if (anchorPdpPreloadModel.enable == 1) {
                    String string = this.LJLJJI.getContext().getString(R.string.f3i);
                    C26048AKe c26048AKe = new C26048AKe(view);
                    c26048AKe.LJI(string);
                    c26048AKe.LJII();
                    return;
                }
            }
            PurchaseLimit purchaseLimit2 = null;
            String str3 = "1";
            String str4 = "unable_to_cart";
            if (this.LJLJJI.getViewModel().sw0()) {
                this.LJLJJI.getViewModel().LLJJJ = true;
                if (this.LJLJJL) {
                    AddToCartButton addToCartButton2 = this.LJLJJLL;
                    if (addToCartButton2 != null && (str2 = addToCartButton2.clickHint) != null && (view2 = this.LJLJJI.contentView) != null) {
                        C26048AKe c26048AKe2 = new C26048AKe(view2);
                        c26048AKe2.LJI(str2);
                        c26048AKe2.LJII();
                    }
                    ProductPackStruct productPackStruct = this.LJLJJI.getViewModel().LJLJLLL;
                    if (productPackStruct != null && (purchaseLimit = productPackStruct.purchaseLimit) != null) {
                        str = purchaseLimit.LIZ(this.LJLJJI.getViewModel().lw0());
                    } else {
                        str = null;
                    }
                    if (C78685UuP.LJJJZ(str)) {
                        C78946Uyc.LJJIIJ(this.LJLJL, new C70947Rst(), new AqS178S0100000_12(this.LJLJJI, 141));
                    }
                } else {
                    PdpViewModel viewModel = this.LJLJJI.getViewModel();
                    PdpBottomNavBarWidget pdpBottomNavBarWidget = this.LJLJJI;
                    viewModel.Jv0(pdpBottomNavBarWidget.contentView, new IDqS36S0300000_4(pdpBottomNavBarWidget, view, this.LJLJL, 0));
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLJJI), null, null, new C27567Arr(this.LJLJJI, null), 3);
                }
                if (this.LJLJJI.getViewModel().uw0()) {
                    ProductPackStruct productPackStruct2 = this.LJLJJI.getViewModel().LJLJLLL;
                    if (productPackStruct2 != null && (addToCartButton = productPackStruct2.addToCartButton) != null && (num = addToCartButton.status) != null && num.intValue() == 1) {
                        str4 = "able_to_cart";
                    }
                    IEventCenter LIZ = C26059AKp.LIZ();
                    String jSONObject = C65232Piu.LIZJ("button_type", str4).toString();
                    o.LJIIIIZZ(jSONObject, "JSONObject().apply {\n   …             }.toString()");
                    LIZ.LIZ("ec_add_cart_click", jSONObject);
                    return;
                }
                C70414RkI c70414RkI = this.LJLJJI.getViewModel().LLFII;
                if (c70414RkI != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    if (!view.isEnabled()) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_clickable", str3);
                    if (!this.LJLJJL) {
                        str4 = "able_to_cart";
                    }
                    hashMap.put("button_type", str4);
                    RT2 rt2 = PurchaseLimit.Companion;
                    ProductPackStruct productPackStruct3 = this.LJLJJI.getViewModel().LJLJLLL;
                    if (productPackStruct3 != null) {
                        purchaseLimit2 = productPackStruct3.purchaseLimit;
                    }
                    String lw0 = this.LJLJJI.getViewModel().lw0();
                    rt2.getClass();
                    hashMap.put("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit2, lw0));
                    c70414RkI.LJJI("add_to_cart", hashMap);
                }
                C70414RkI c70414RkI2 = this.LJLJJI.getViewModel().LLFII;
                if (c70414RkI2 == null) {
                    return;
                }
                C70414RkI.LJJIL(c70414RkI2, "add_to_cart", null, null, null, null, 30);
                return;
            }
            C70414RkI c70414RkI3 = this.LJLJJI.getViewModel().LLFII;
            if (c70414RkI3 == null) {
                return;
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            if (!view.isEnabled()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap2.put("is_clickable", str3);
            if (!this.LJLJJL) {
                str4 = "able_to_cart";
            }
            hashMap2.put("button_type", str4);
            RT2 rt22 = PurchaseLimit.Companion;
            ProductPackStruct productPackStruct4 = this.LJLJJI.getViewModel().LJLJLLL;
            if (productPackStruct4 != null) {
                purchaseLimit2 = productPackStruct4.purchaseLimit;
            }
            String lw02 = this.LJLJJI.getViewModel().lw0();
            rt22.getClass();
            hashMap2.put("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit2, lw02));
            c70414RkI3.LJJI("add_to_cart", hashMap2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70080Reu(PdpBottomNavBarWidget pdpBottomNavBarWidget, boolean z, AddToCartButton addToCartButton, View view) {
        super(700L);
        this.LJLJJI = pdpBottomNavBarWidget;
        this.LJLJJL = z;
        this.LJLJJLL = addToCartButton;
        this.LJLJL = view;
    }
}
