package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.PriceDaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.model.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71324Ryy extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ShopWindowAnchorModel LJLILLLLZI;
    public final /* synthetic */ C71335Rz9 LJLJI;
    public final /* synthetic */ String LJLJJI = "video_comment_shopping_list";
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ CommonVideoAnchorModel LJLJL;
    public final /* synthetic */ Boolean LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71324Ryy(int i, ShopWindowAnchorModel shopWindowAnchorModel, C71335Rz9 c71335Rz9, String str, String str2, CommonVideoAnchorModel commonVideoAnchorModel, Boolean bool, String str3, String str4, String str5, String str6) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = shopWindowAnchorModel;
        this.LJLJI = c71335Rz9;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = commonVideoAnchorModel;
        this.LJLJLJ = bool;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        String str2;
        String str3;
        int i;
        ProductPrice productPrice;
        String str4;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        AwemeRawAd awemeRawAd2;
        Long adId;
        ProductPrice productPrice2;
        String str5;
        ProductPrice productPrice3;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C71360RzY.LIZ(Integer.valueOf(this.LJLIL), null, null, this.LJLILLLLZI, this.LJLJI.LJLJJI, sendLog);
        sendLog.LIZLLL("previous_page", this.LJLJJI);
        sendLog.LIZLLL("source_button", "add_to_cart");
        sendLog.LIZLLL("cart_form", "add_to_cart");
        CommonVideoAnchorModel commonVideoAnchorModel = this.LJLJI.LJLJJI;
        String str6 = "";
        if (commonVideoAnchorModel == null || (str = commonVideoAnchorModel.getAid()) == null) {
            str = "";
        }
        sendLog.LIZLLL("source_content_id", str);
        sendLog.LIZLLL("sku_id", this.LJLJJL);
        sendLog.LIZLLL("is_single_sku", "1");
        Integer num = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJI.LJLJI, this.LJLIL)).LIZ.productStatus;
        int value = EnumC71325Ryz.ProductStatusOnSales.getValue();
        if (num != null && num.intValue() == value) {
            str2 = "1";
        } else {
            int value2 = EnumC71325Ryz.ProductStatusStock.getValue();
            if (num == null || num.intValue() != value2) {
                str2 = "3";
            } else {
                str2 = "2";
            }
        }
        sendLog.LIZLLL("product_type", str2);
        ProductBase productBase = this.LJLILLLLZI.LIZ.productBase;
        if (productBase == null || (productPrice3 = productBase.price) == null || (str3 = productPrice3.originalPrice) == null) {
            str3 = "";
        }
        sendLog.LIZLLL("original_price", str3);
        ProductBase productBase2 = this.LJLILLLLZI.LIZ.productBase;
        if (productBase2 != null && (productPrice2 = productBase2.price) != null && (str5 = productPrice2.realPrice) != null) {
            str6 = str5;
        }
        sendLog.LIZLLL("sale_price", str6);
        String str7 = this.LJLJJLL;
        if (str7 != null) {
            sendLog.LIZLLL("cart_item_id", str7);
        }
        CommonVideoAnchorModel commonVideoAnchorModel2 = this.LJLJL;
        if (commonVideoAnchorModel2 != null) {
            i = o.LJ(commonVideoAnchorModel2.isAd(), Boolean.TRUE);
        } else {
            i = 0;
        }
        sendLog.LIZLLL("is_ad", Integer.valueOf(i));
        CommonVideoAnchorModel commonVideoAnchorModel3 = this.LJLJL;
        if (commonVideoAnchorModel3 != null && (awemeRawAd2 = commonVideoAnchorModel3.getAwemeRawAd()) != null && (adId = awemeRawAd2.getAdId()) != null) {
            sendLog.LIZLLL("ad_id", Long.valueOf(adId.longValue()));
        }
        CommonVideoAnchorModel commonVideoAnchorModel4 = this.LJLJL;
        if (commonVideoAnchorModel4 != null && (awemeRawAd = commonVideoAnchorModel4.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
            sendLog.LIZLLL("creative_id", creativeIdStr);
        }
        sendLog.LIZLLL("is_success", Integer.valueOf(o.LJ(this.LJLJLJ, Boolean.TRUE) ? 1 : 0));
        String str8 = this.LJLJLLL;
        if (str8 != null) {
            sendLog.LIZLLL("fail_reason", str8);
        }
        sendLog.LIZLLL("add_sku_num", "1");
        String str9 = this.LJLL;
        if (str9 != null) {
            sendLog.LIZLLL("sku_num_before", str9);
        }
        String str10 = this.LJLLI;
        if (str10 != null) {
            sendLog.LIZLLL("sku_num_after", str10);
        }
        java.util.Map<String, ? extends Object> map = this.LJLILLLLZI.LIZ.promotionLogExtraInfo;
        if (map != null) {
            sendLog.LJ(map);
        }
        ProductBase productBase3 = this.LJLILLLLZI.LIZ.productBase;
        if (productBase3 != null && (productPrice = productBase3.price) != null && (str4 = productPrice.daInfo) != null) {
            PriceDaInfo priceDaInfo = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str4, C65330PkU.LIZJ(C65352Pkq.LJI(PriceDaInfo.class)));
                if (!(fromJson instanceof PriceDaInfo)) {
                    fromJson = null;
                }
                priceDaInfo = (PriceDaInfo) fromJson;
            } catch (s unused) {
            }
            if (priceDaInfo != null) {
                String str11 = priceDaInfo.originPriceValue;
                if (str11 != null) {
                    sendLog.LIZLLL("original_price_value", str11);
                }
                String str12 = priceDaInfo.availablePriceValue;
                if (str12 != null) {
                    sendLog.LIZLLL("sale_price_value", str12);
                }
                String str13 = priceDaInfo.currency;
                if (str13 != null) {
                    sendLog.LIZLLL("currency", str13);
                }
            }
        }
        String str14 = this.LJLLILLLL;
        if (str14 != null) {
            sendLog.LIZLLL("entrance_form", str14);
        }
        return C76800UCe.LIZ;
    }
}
