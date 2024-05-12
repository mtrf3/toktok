package X;

import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71327Rz1 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ ProductListModel LJLIL;
    public final /* synthetic */ ShopWindowAnchorModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71327Rz1(ProductListModel productListModel, ShopWindowAnchorModel shopWindowAnchorModel, int i, String str, String str2, int i2, java.util.Map<String, ? extends Object> map) {
        super(1);
        this.LJLIL = productListModel;
        this.LJLILLLLZI = shopWindowAnchorModel;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = i2;
        this.LJLJL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        Object obj2;
        Object LJIIIZ;
        Object enterListForm;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object aid = this.LJLIL.getAid();
        Object obj3 = "";
        if (aid == null) {
            aid = "";
        }
        sendLog.LIZLLL("group_id", aid);
        Object authorUid = this.LJLIL.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        sendLog.LIZLLL("author_id", authorUid);
        Object eventType = this.LJLIL.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        sendLog.LIZLLL("enter_from", eventType);
        sendLog.LIZLLL("anchor_show_type", "video_cart_tag");
        sendLog.LIZLLL("product_source", String.valueOf(this.LJLILLLLZI.LIZ.platform));
        Object obj4 = this.LJLILLLLZI.LIZ.source;
        if (obj4 == null) {
            obj4 = "";
        }
        sendLog.LIZLLL("source", obj4);
        sendLog.LIZLLL("product_id", String.valueOf(this.LJLILLLLZI.LIZ.productId));
        Boolean isAd = this.LJLIL.isAd();
        Boolean bool = Boolean.TRUE;
        sendLog.LIZLLL("is_ad", Integer.valueOf(o.LJ(isAd, bool) ? 1 : 0));
        if (!o.LJ(this.LJLIL.isAd(), bool) || (awemeRawAd2 = this.LJLIL.getAwemeRawAd()) == null || (adId = awemeRawAd2.getAdId()) == null) {
            obj = "";
        } else {
            obj = String.valueOf(adId);
        }
        sendLog.LIZLLL("ad_id", obj);
        if (!o.LJ(this.LJLIL.isAd(), bool) || (awemeRawAd = this.LJLIL.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            obj2 = "";
        } else {
            obj2 = String.valueOf(creativeId);
        }
        sendLog.LIZLLL("creative_id", obj2);
        Object requestId = this.LJLIL.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        sendLog.LIZLLL("request_id", requestId);
        sendLog.LIZLLL("is_self", Integer.valueOf(o.LJ(this.LJLIL.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        sendLog.LIZLLL("page_name", "video");
        sendLog.LIZLLL("source_page_type", "video");
        sendLog.LIZLLL("item_order", String.valueOf(this.LJLJI + 1));
        sendLog.LIZLLL("button_name", this.LJLJJI);
        Object obj5 = this.LJLJJL;
        if (obj5 != null) {
            obj3 = obj5;
        }
        sendLog.LIZLLL("button_type", obj3);
        sendLog.LIZLLL("video_shopping_list_style", Integer.valueOf(this.LJLJJLL));
        sendLog.LIZLLL("list_name", "video_shopping_list");
        ProductListModel productListModel = this.LJLIL;
        Object obj6 = "video_multi_anchor";
        if ((productListModel == null || (LJIIIZ = productListModel.getEntranceForm()) == null) && (LJIIIZ = C71360RzY.LJIIIZ(this.LJLIL, true)) == null) {
            LJIIIZ = "video_multi_anchor";
        }
        sendLog.LIZLLL("entrance_form", LJIIIZ);
        ProductListModel productListModel2 = this.LJLIL;
        if (productListModel2 != null && (enterListForm = productListModel2.getEnterListForm()) != null) {
            obj6 = enterListForm;
        }
        sendLog.LIZLLL("enter_list_form", obj6);
        java.util.Map<String, Object> map = this.LJLJL;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            sendLog.LJ(linkedHashMap);
        }
        return C76800UCe.LIZ;
    }
}
