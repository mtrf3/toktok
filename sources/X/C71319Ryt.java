package X;

import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71319Ryt extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ ProductListModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71319Ryt(int i, int i2, ProductListModel productListModel, ShopWindowAnchorModel shopWindowAnchorModel, String str, java.util.Map map) {
        super(1);
        this.LJLIL = productListModel;
        this.LJLILLLLZI = i;
        this.LJLJI = shopWindowAnchorModel;
        this.LJLJJI = str;
        this.LJLJJL = i2;
        this.LJLJJLL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        ShopWindowExtraModel shopWindowExtraModel;
        Long l;
        Object l2;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object aid = this.LJLIL.getAid();
        Object obj = "";
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
        Object requestId = this.LJLIL.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        sendLog.LIZLLL("request_id", requestId);
        sendLog.LIZLLL("is_ad", Integer.valueOf(o.LJ(this.LJLIL.isAd(), Boolean.TRUE) ? 1 : 0));
        sendLog.LIZLLL("item_order", Integer.valueOf(this.LJLILLLLZI + 1));
        sendLog.LIZLLL("is_self", Integer.valueOf(o.LJ(this.LJLIL.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        sendLog.LIZLLL("page_name", "video");
        sendLog.LIZLLL("source_page_type", "video");
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJI;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null && (l = shopWindowExtraModel.productId) != null && (l2 = l.toString()) != null) {
            obj = l2;
        }
        sendLog.LIZLLL("product_id", obj);
        sendLog.LIZLLL("button_name", this.LJLJJI);
        sendLog.LIZLLL("video_shopping_list_style", String.valueOf(this.LJLJJL));
        java.util.Map<String, Object> map = this.LJLJJLL;
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
