package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.C1A8;
import X.C1B3;
import X.C1B6;
import X.C1GE;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C40517FvF;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70695Rop;
import X.C78685UuP;
import X.C79234V7u;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.O6R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpReviewWidget extends JediBaseWidget {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return R.layout.a3q;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        String str;
        Float f;
        Integer num;
        Integer num2;
        String str2;
        List<ReviewAspectPercentageCard> list;
        int i;
        int i2;
        int i3;
        float f2;
        CartEntry cartEntry;
        boolean z;
        boolean z2;
        Integer num3;
        boolean z3;
        boolean z4;
        boolean z5;
        HashMap<String, Object> hashMap;
        SellerInfo sellerInfo;
        String str3;
        SellerInfo sellerInfo2;
        String str4;
        ProductPackStruct productPackStruct;
        SellerInfo sellerInfo3;
        String str5;
        Integer num4;
        ProductPackStruct productPackStruct2;
        ProductPackStruct productPackStruct3;
        AddToCartButton addToCartButton;
        Integer num5;
        ShareInfo shareInfo;
        String str6;
        Integer num6;
        ProductDetailReview productDetailReview;
        SellerInfo sellerInfo4;
        ShopReviewEntry shopReviewEntry;
        ProductDetailReview productDetailReview2;
        ProductDetailReview productDetailReview3;
        super.onCreate();
        ProductPackStruct productPackStruct4 = getViewModel().LJLJLLL;
        Integer num7 = null;
        if (productPackStruct4 != null) {
            str = productPackStruct4.productId;
        } else {
            str = null;
        }
        ProductPackStruct productPackStruct5 = getViewModel().LJLJLLL;
        if (productPackStruct5 != null && (productDetailReview3 = productPackStruct5.review) != null) {
            f = productDetailReview3.rating;
        } else {
            f = null;
        }
        ProductPackStruct productPackStruct6 = getViewModel().LJLJLLL;
        if (productPackStruct6 != null && (productDetailReview2 = productPackStruct6.review) != null) {
            num = productDetailReview2.reviewCount;
        } else {
            num = null;
        }
        ProductPackStruct productPackStruct7 = getViewModel().LJLJLLL;
        if (productPackStruct7 != null && (shopReviewEntry = productPackStruct7.shopReview) != null) {
            num2 = shopReviewEntry.reviewCount;
        } else {
            num2 = null;
        }
        PdpReviewClickEvent pdpReviewClickEvent = getViewModel().LLJJ;
        ProductPackStruct productPackStruct8 = getViewModel().LJLJLLL;
        if (productPackStruct8 != null && (sellerInfo4 = productPackStruct8.sellerInfo) != null) {
            str2 = sellerInfo4.sellerId;
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct9 = getViewModel().LJLJLLL;
        if (productPackStruct9 != null && (productDetailReview = productPackStruct9.review) != null) {
            list = productDetailReview.reviewAspectPercentageCards;
        } else {
            list = null;
        }
        boolean LJIILIIL = C1GE.LJIILIIL(list);
        ProductPackStruct productPackStruct10 = getViewModel().LJLJLLL;
        if (productPackStruct10 != null && (num6 = productPackStruct10.bizType) != null) {
            i = num6.intValue();
        } else {
            i = -1;
        }
        ECBaseJediFragment LIZ = C70695Rop.LIZ();
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
        boolean z6 = false;
        LIZ2.LJIIJJI(R.anim.b5, R.anim.b6, 0, 0);
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString("product_id", str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        bundle.putInt("review_count", i2);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 0;
        }
        bundle.putInt("shop_review_cnt", i3);
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = -1.0f;
        }
        bundle.putFloat("review_score", f2);
        bundle.putParcelable("review_click_event", pdpReviewClickEvent);
        PdpViewModel viewModel = getViewModel();
        ProductPackStruct productPackStruct11 = getViewModel().LJLJLLL;
        if (productPackStruct11 != null) {
            cartEntry = productPackStruct11.cartEntry;
        } else {
            cartEntry = null;
        }
        viewModel.getClass();
        if (cartEntry != null && (str6 = cartEntry.link) != null && C78685UuP.LJJJZ(str6) && !getViewModel().tw0()) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("is_cart_entry_show", z);
        ProductPackStruct productPackStruct12 = getViewModel().LJLJLLL;
        if (productPackStruct12 != null && (shareInfo = productPackStruct12.shareInfo) != null) {
            z2 = o.LJ(shareInfo.canShare, Boolean.TRUE);
        } else {
            z2 = false;
        }
        bundle.putBoolean("is_share_icon_show", z2);
        ProductPackStruct productPackStruct13 = getViewModel().LJLJLLL;
        if (productPackStruct13 != null) {
            num3 = productPackStruct13.status;
        } else {
            num3 = null;
        }
        if (num3 == null || new C40517FvF(2, 4).LJIILJJIL(num3.intValue()) || ((productPackStruct3 = getViewModel().LJLJLLL) != null && (addToCartButton = productPackStruct3.addToCartButton) != null && (num5 = addToCartButton.status) != null && num5.intValue() == 3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        bundle.putBoolean("is_add_cart_btn_show", z3);
        ProductPackStruct productPackStruct14 = getViewModel().LJLJLLL;
        if (productPackStruct14 == null || (num4 = productPackStruct14.status) == null || new C40517FvF(2, 4).LJIILJJIL(num4.intValue()) || (productPackStruct2 = getViewModel().LJLJLLL) == null || productPackStruct2.buyButton == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        bundle.putBoolean("is_buy_now_btn_show", z4);
        ProductPackStruct productPackStruct15 = getViewModel().LJLJLLL;
        if (productPackStruct15 == null || (sellerInfo2 = productPackStruct15.sellerInfo) == null || (str4 = sellerInfo2.imSchema) == null || ujb.o.LJJJJJL(str4) || (productPackStruct = getViewModel().LJLJLLL) == null || (sellerInfo3 = productPackStruct.sellerInfo) == null || (str5 = sellerInfo3.name) == null || str5.length() == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        bundle.putBoolean("is_store_btn_show", z5);
        ProductPackStruct productPackStruct16 = getViewModel().LJLJLLL;
        if (productPackStruct16 == null || (sellerInfo = productPackStruct16.sellerInfo) == null || (str3 = sellerInfo.imSchema) == null || ujb.o.LJJJJJL(str3)) {
            z6 = true;
        }
        bundle.putBoolean("is_im_chat_btn_show", !z6);
        bundle.putInt("review_body_content", getViewModel().aw0());
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("seller_id", str2);
        IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        } else {
            hashMap = null;
        }
        bundle.putSerializable("pdp_track_param", hashMap);
        bundle.putBoolean("is_over_fit_show", LJIILIIL);
        bundle.putInt("biz_type", i);
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if (interfaceC36571c5 instanceof InterfaceC71003Rtn) {
            String LJJIIZI = C79234V7u.LJJIIZI((InterfaceC71003Rtn) interfaceC36571c5, new AqS178S0100000_12(this, 148));
            C1A8.LJIJI(LJJIIZI, new AqS178S0100000_12(this, 147));
            C79234V7u.LJJIJLIJ(bundle, LJJIIZI);
        }
        View view = this.contentView;
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                num7 = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)) + C63081OpJ.LJJJJLI(context));
            }
            C26338AVi.LJIIIZ(view, null, num7, null, null, 29);
        }
        LIZ.setArguments(bundle);
        LIZ2.LJIIJ(LIZ, "PRODUCT_COMMENT_FRAGMENT_TAG", R.id.j0s);
        LIZ2.LJI();
    }

    public PdpReviewWidget(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        new LinkedHashMap();
        this.LJLIL = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 154));
    }
}
