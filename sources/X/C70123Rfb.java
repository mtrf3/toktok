package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.NumberFormat;
import java.util.HashMap;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rfb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70123Rfb {
    public final PdpViewModel LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C70123Rfb(PdpViewModel pdpViewModel) {
        o.LJIIIZ(pdpViewModel, "pdpViewModel");
        this.LIZ = pdpViewModel;
    }

    public static void LIZ(LaneParams laneParams, BundleInfo bundleInfo) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        HashMap<String, Object> LJII = C27739Aud.LJII(bundleInfo.daInfo);
        Object obj6 = "";
        if (LJII == null || (obj = LJII.get("campaign_type")) == null) {
            obj = "";
        }
        laneParams.plusAssign("campaign_type", obj);
        if (LJII == null || (obj2 = LJII.get("campaign_channel")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("campaign_channel", obj2);
        if (LJII == null || (obj3 = LJII.get("campaign_user_tag")) == null) {
            obj3 = "";
        }
        laneParams.plusAssign("campaign_user_tag", obj3);
        if (LJII == null || (obj4 = LJII.get("campaign_id")) == null) {
            obj4 = "";
        }
        laneParams.plusAssign("campaign_id", obj4);
        if (LJII != null && (obj5 = LJII.get("campaign_cost_role")) != null) {
            obj6 = obj5;
        }
        laneParams.plusAssign("campaign_cost_role", obj6);
    }

    public final void LIZIZ(LaneParams laneParams, BundleInfo bundleInfo) {
        String str;
        String str2;
        laneParams.plusAssign("module_name", "bundle_deal");
        BundleTotalPrice bundleTotalPrice = bundleInfo.totalPrice;
        String str3 = null;
        if (bundleTotalPrice == null || (str2 = bundleTotalPrice.activityId) == null || str2.length() == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        laneParams.plusAssign("is_discounted_bundle_deal", str);
        laneParams.plusAssign("bundle_id", bundleInfo.bundleId);
        ProductPackStruct productPackStruct = this.LIZ.LJLJLLL;
        if (productPackStruct != null) {
            str3 = productPackStruct.productId;
        }
        laneParams.plusAssign("product_id", str3);
    }

    public final void LIZJ(LaneParams laneParams, BundleProduct bundleProduct, int i) {
        String str;
        String str2;
        String str3;
        laneParams.plusAssign("product_id", bundleProduct.productId);
        BundlePrice bundlePrice = bundleProduct.productPrice;
        String str4 = "";
        if (bundlePrice == null || (str = bundlePrice.originalPrice) == null) {
            str = "";
        }
        laneParams.plusAssign("original_price", str);
        BundlePrice bundlePrice2 = bundleProduct.productPrice;
        if (bundlePrice2 == null || (str2 = bundlePrice2.realPrice) == null) {
            str2 = "";
        }
        laneParams.plusAssign("sales_price", str2);
        String str5 = bundleProduct.productSource;
        if (str5 != null) {
            str4 = str5;
        }
        laneParams.plusAssign("product_source", str4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        LIZ.append('_');
        LIZ.append(i + 1);
        laneParams.plusAssign("track_id", X1D.LIZIZ(LIZ));
        BundlePrice bundlePrice3 = bundleProduct.productPrice;
        if (bundlePrice3 != null && (str3 = bundlePrice3.discount) != null && str3.length() > 0) {
            try {
                String substring = bundleProduct.productPrice.discount.substring(1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                laneParams.plusAssign("discount_ratio", NumberFormat.getPercentInstance().parse(substring));
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZLLL(View view, BundleInfo bundleInfo, String str) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(bundleInfo, "bundleInfo");
        InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(view);
        if ((LJIIIZ instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) LJIIIZ) != null) {
            C78946Uyc.LJJII(interfaceC71003Rtn, new C70919RsR(), new AqS53S1200000_12(this, bundleInfo, str, 17));
        }
    }
}
