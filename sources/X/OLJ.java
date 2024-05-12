package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLJ implements InterfaceC61746OLe {
    public final /* synthetic */ OLL LIZ;

    public final void LIZJ() {
        OLL oll = this.LIZ;
        oll.LJLJL = false;
        oll.setVisibility(8);
        OLO olo = oll.LJLIL;
        if (olo != null) {
            olo.LIZJ();
        }
    }

    public OLJ(OLL oll) {
        this.LIZ = oll;
    }

    @Override // X.InterfaceC61746OLe
    public final void LIZ(int i, VSAProductCardsResponse.ProductDetail productDetail) {
        o.LJIIIZ(productDetail, "productDetail");
        this.LIZ.LIZJ(i, productDetail);
    }

    @Override // X.InterfaceC61746OLe
    public final void LIZIZ(int i, VSAProductCardsResponse.ProductDetail productDetail) {
        String str;
        String str2;
        String str3;
        List<PromotionItem> list;
        PromotionItem promotionItem;
        o.LJIIIZ(productDetail, "productDetail");
        OLL oll = this.LIZ;
        oll.LJLJJI = i;
        oll.LJLJJL = productDetail;
        OLO olo = oll.LJLIL;
        if (olo != null) {
            olo.LJFF(i, productDetail);
        }
        int i2 = oll.LJLJLLL;
        oll.LJLJLLL = i2 + 1;
        if (i2 <= i) {
            OLI cardType = oll.LJLJI;
            int i3 = oll.LJLJJI;
            java.util.Map<String, String> trackParams = oll.LJLILLLLZI;
            o.LJIIIZ(cardType, "cardType");
            o.LJIIIZ(trackParams, "trackParams");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            OLH.LIZ(linkedHashMap);
            linkedHashMap.put("card_name", cardType.getValue());
            linkedHashMap.put("entrance_form", cardType.getValue());
            String LIZ = ED2.LIZ(productDetail.getProductId());
            linkedHashMap.put("product_id", LIZ);
            linkedHashMap.put("biz_type", Integer.valueOf(productDetail.getBizType()));
            VSAProductCardsResponse.PriceDetail price = productDetail.getPrice();
            Integer num = null;
            if (price != null) {
                str = price.getCurrency();
            } else {
                str = null;
            }
            String LIZ2 = ED2.LIZ(str);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2);
            VSAProductCardsResponse.PriceDetail price2 = productDetail.getPrice();
            if (price2 != null) {
                str2 = price2.getMinRealPriceValue();
            } else {
                str2 = null;
            }
            LIZ3.append(ED2.LIZ(str2));
            linkedHashMap.put("sales_price", X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZ2);
            VSAProductCardsResponse.PriceDetail price3 = productDetail.getPrice();
            if (price3 != null) {
                str3 = price3.getMinOriginPriceValue();
            } else {
                str3 = null;
            }
            LIZ4.append(ED2.LIZ(str3));
            linkedHashMap.put("original_price", X1D.LIZIZ(LIZ4));
            PromotionView promotion = productDetail.getPromotion();
            if (promotion != null && (list = promotion.promotion_items) != null && (promotionItem = (PromotionItem) ORZ.LJLLLL(list)) != null) {
                num = promotionItem.getType();
            }
            linkedHashMap.put("ad_benefit_type", ED2.LIZ(num));
            linkedHashMap.put("item_order", Integer.valueOf(i3 + 1));
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) trackParams;
            linkedHashMap.put("group_id", ED2.LIZ(linkedHashMap2.get("group_id")));
            linkedHashMap.put("ad_id", ED2.LIZ(linkedHashMap2.get("ad_id")));
            linkedHashMap.put("creative_id", ED2.LIZ(linkedHashMap2.get("creative_id")));
            String LIZ5 = ED2.LIZ(linkedHashMap2.get("log_id"));
            linkedHashMap.put("request_id", LIZ5);
            linkedHashMap.put("track_id", OLH.LIZIZ(i3, LIZ5, LIZ));
            C76542zS.LIZ("tiktokec_card_show", linkedHashMap);
            if (cardType == OLI.AD_SINGLE_BUBBLE) {
                C76542zS.LIZ("tiktokec_product_show", linkedHashMap);
            }
            C61503OBv.LIZ(EnumC61504OBw.CARD_ITEM_SHOW);
        }
        if (oll.LJLJLJ) {
            oll.LJLJLJ = false;
            C61503OBv.LIZ(EnumC61504OBw.CARD_SHOW);
        }
    }
}
