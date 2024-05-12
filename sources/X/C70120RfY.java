package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.text.NumberFormat;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RfY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70120RfY {
    public final PdpViewModel LIZ;
    public String LIZIZ;

    public C70120RfY(PdpViewModel pdpViewModel) {
        o.LJIIIZ(pdpViewModel, "pdpViewModel");
        this.LIZ = pdpViewModel;
    }

    public static void LIZIZ(InterfaceC71003Rtn trackNode, String str) {
        o.LJIIIZ(trackNode, "trackNode");
        C78946Uyc.LJJII(trackNode, new C70919RsR(), new AqS35S1000000_12(str, 48));
    }

    public final void LIZ(LaneParams laneParams, Feed feed, int i) {
        String str;
        String str2;
        String str3;
        Price price;
        String str4;
        Price price2;
        Price price3;
        if (feed == null) {
            return;
        }
        String str5 = feed.id;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        laneParams.plusAssign("product_id", str5);
        laneParams.plusAssign("parent_product_id", this.LIZ.jw0());
        FeedProduct feedProduct = feed.product;
        if (feedProduct == null || (price3 = feedProduct.price) == null || (str = price3.maxPrice) == null) {
            str = "";
        }
        laneParams.plusAssign("original_price", str);
        FeedProduct feedProduct2 = feed.product;
        if (feedProduct2 == null || (price2 = feedProduct2.price) == null || (str2 = price2.minPrice) == null) {
            str2 = "";
        }
        laneParams.plusAssign("sales_price", str2);
        String str7 = this.LIZIZ;
        if (str7 == null) {
            str7 = "";
        }
        laneParams.plusAssign("request_id", str7);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append('_');
        LIZ.append(feed.id);
        LIZ.append('_');
        LIZ.append(i + 1);
        laneParams.plusAssign("track_id", X1D.LIZIZ(LIZ));
        FeedProduct feedProduct3 = feed.product;
        if (feedProduct3 != null && (price = feedProduct3.price) != null && (str4 = price.discount) != null && str4.length() > 0) {
            try {
                String substring = feed.product.price.discount.substring(1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                laneParams.plusAssign("discount_ratio", NumberFormat.getPercentInstance().parse(substring));
            } catch (Exception unused) {
            }
        }
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        FeedExtra feedExtra = feed.extra;
        if (feedExtra != null && (str3 = feedExtra.recommendInfo) != null) {
            str6 = str3;
        }
        laneParams.plusAssign("rec_params", str6);
    }
}
