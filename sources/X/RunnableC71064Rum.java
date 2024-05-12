package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rum, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71064Rum implements Runnable {
    public final /* synthetic */ C71076Ruy LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ FeedEcCardConfig LJLJI;
    public final /* synthetic */ FeedEcCardStyle LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ EcUgProduct LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    public RunnableC71064Rum(EcUgProduct ecUgProduct, C71076Ruy c71076Ruy, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        this.LJLIL = c71076Ruy;
        this.LJLILLLLZI = aweme;
        this.LJLJI = feedEcCardConfig;
        this.LJLJJI = feedEcCardStyle;
        this.LJLJJL = str;
        this.LJLJJLL = ecUgProduct;
        this.LJLJL = str2;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
    }

    public final void LIZ() {
        int i;
        Object obj;
        String str;
        EcUgProduct.EcUgProductSku ecUgProductSku;
        List<String> list = this.LJLIL.LJFF;
        int i2 = -1;
        if (list != null) {
            Iterator<String> it = list.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (o.LJ(it.next(), this.LJLJJLL.getProductId())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = -1;
        }
        C71065Run.LJIIJJI(list, this.LJLIL.LJI, true, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        EcUgProduct product = this.LJLJJLL;
        Aweme aweme = this.LJLILLLLZI;
        FeedEcCardConfig cardConfig = this.LJLJI;
        String clickArea = this.LJLJJL;
        String purchasePath = this.LJLJL;
        o.LJIIIZ(product, "product");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        o.LJIIIZ(clickArea, "clickArea");
        o.LJIIIZ(purchasePath, "purchasePath");
        java.util.Map LJIIJ = C71065Run.LJIIJ(i, product, aweme, cardConfig);
        LJIIJ.put("click_area", clickArea);
        LJIIJ.put("purchase_path", purchasePath);
        C76542zS.LIZ("tiktokec_product_click", LJIIJ);
        if (o.LJ(this.LJLJJL, "buy_button")) {
            EcUgProduct product2 = this.LJLJJLL;
            Aweme aweme2 = this.LJLILLLLZI;
            FeedEcCardConfig cardConfig2 = this.LJLJI;
            o.LJIIIZ(product2, "product");
            o.LJIIIZ(aweme2, "aweme");
            o.LJIIIZ(cardConfig2, "cardConfig");
            C76542zS.LIZ("tiktokec_button_click", C71065Run.LJIIIZ(i, product2, aweme2, cardConfig2));
        }
        if (this.LJLJLJ) {
            C71066Ruo.LIZIZ(true, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, "click", null, this.LJLJJL, 64);
        }
        if (this.LJLJLLL) {
            EcUgProduct product3 = this.LJLJJLL;
            Aweme aweme3 = this.LJLILLLLZI;
            FeedEcCardConfig cardConfig3 = this.LJLJI;
            o.LJIIIZ(product3, "product");
            o.LJIIIZ(aweme3, "aweme");
            o.LJIIIZ(cardConfig3, "cardConfig");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C71065Run.LIZ(linkedHashMap);
            linkedHashMap.put("previous_page", "fyp_ecom_card_page");
            HashMap<String, Object> LJII = C27739Aud.LJII(product3.getLogExtra());
            String str2 = null;
            if (LJII != null) {
                obj = LJII.get("author_id");
            } else {
                obj = null;
            }
            linkedHashMap.put("author_id", ED2.LIZ(obj));
            String groupId = aweme3.getGroupId();
            o.LJIIIIZZ(groupId, "aweme.groupId");
            linkedHashMap.put("source_content_id", groupId);
            linkedHashMap.put("enter_from_info", "homepage_hot");
            String LIZ = ED2.LIZ(Integer.valueOf(C71065Run.LIZLLL(cardConfig3)));
            linkedHashMap.put("source_module", C71065Run.LJI(LIZ));
            java.util.Map<String, Object> trackParams = cardConfig3.getTrackParams();
            if (trackParams != null) {
                linkedHashMap.put("entrance_form", ED2.LIZ(trackParams.get("entrance_form")));
            }
            List<EcUgProduct.EcUgProductSku> skus = product3.getSkus();
            if (skus != null && (ecUgProductSku = (EcUgProduct.EcUgProductSku) ORZ.LJLLLL(skus)) != null) {
                str = ecUgProductSku.getSkuId();
            } else {
                str = null;
            }
            linkedHashMap.put("sku_id", ED2.LIZ(str));
            String LIZ2 = ED2.LIZ(product3.getProductId());
            linkedHashMap.put("product_id", LIZ2);
            linkedHashMap.put("product_source", ED2.LIZ(product3.getPlatform()));
            String LIZ3 = ED2.LIZ(product3.getSourceFrom());
            if (!ujb.o.LJJJJJL(LIZ3)) {
                linkedHashMap.put("source_from", LIZ3);
            }
            linkedHashMap.put("is_single_sku", 1);
            if (product3.getStatus() != null && product3.getStatus().intValue() > 0) {
                linkedHashMap.put("product_type", product3.getStatus());
            }
            OSZ LJFF = C71065Run.LJFF(product3);
            Object first = LJFF.getFirst();
            Object second = LJFF.getSecond();
            linkedHashMap.put("sales_price", first);
            linkedHashMap.put("original_price", second);
            linkedHashMap.put("follow_status", -1);
            linkedHashMap.put("purchase_path", "skip_pdp");
            Integer bizType = product3.getBizType();
            if (bizType != null) {
                i2 = bizType.intValue();
            }
            linkedHashMap.put("biz_type", ED2.LIZ(Integer.valueOf(i2)));
            String LIZ4 = ED2.LIZ(aweme3.getRequestId());
            linkedHashMap.put("track_id", C71065Run.LIZJ(i + 1, ED2.LIZ(cardConfig3.getUserStatus()), LIZ, ED2.LIZ(cardConfig3.getContentType()), LIZ4, LIZ2));
            linkedHashMap.put("rec_params", C71065Run.LJ(cardConfig3.getProductInfoList(), product3));
            linkedHashMap.put("request_id", LIZ4);
            FeedEcCardConfig.FeedEcCardInfo cardInfo = cardConfig3.getCardInfo();
            if (cardInfo != null) {
                str2 = cardInfo.getSessionId();
            }
            linkedHashMap.put("rec_session_id", ED2.LIZ(str2));
            String LIZIZ = C67722lE.LIZIZ(linkedHashMap);
            if (LIZIZ != null && !ujb.o.LJJJJJL(LIZIZ)) {
                linkedHashMap.put("entrance_info", LIZIZ);
            }
            C76542zS.LIZ("tiktokec_confirm_sku", linkedHashMap);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
