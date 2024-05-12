package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RjC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70346RjC extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ SkuItem LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70346RjC(int i, long j, SkuItem skuItem, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = str2;
        this.LJLJJLL = skuItem;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
        this.LJLL = str6;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        Price price;
        String priceVal;
        String str;
        Object obj2;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LinkedHashMap<String, Object> linkedHashMap = C70307RiZ.LIZ;
        C27943Axv.LIZ(sendLog, linkedHashMap);
        sendLog.LIZLLL("page_name", "sku");
        if (this.LJLIL <= 6) {
            obj = "no_greater_than_6";
        } else {
            obj = "greater_than_6";
        }
        sendLog.LIZLLL("sku_show_type", obj);
        sendLog.LIZLLL("stay_time", Long.valueOf(this.LJLILLLLZI));
        sendLog.LIZLLL("quit_type", this.LJLJI);
        sendLog.LIZLLL("is_load_data", Integer.valueOf(this.LJLJJI ? 1 : 0));
        if (!linkedHashMap.containsKey("previous_page") && (obj2 = this.LJLJJL) != null) {
            sendLog.LIZLLL("previous_page", obj2);
        }
        SkuItem skuItem = this.LJLJJLL;
        if (skuItem != null) {
            String str2 = skuItem.skuId;
            if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                sendLog.LIZLLL("sku_id", str2);
            }
            SkuPrice skuPrice = skuItem.price;
            if (skuPrice != null && (str = skuPrice.originalPriceVal) != null && !ujb.o.LJJJJJL(str)) {
                sendLog.LIZLLL("original_price", str);
            }
            SkuPrice skuPrice2 = skuItem.price;
            if (skuPrice2 != null && (price = skuPrice2.realPrice) != null && (priceVal = price.getPriceVal()) != null && !ujb.o.LJJJJJL(priceVal)) {
                sendLog.LIZLLL("sale_price", priceVal);
            }
        }
        Object obj3 = this.LJLJL;
        if (obj3 != null) {
            sendLog.LIZLLL("source_button", obj3);
        }
        Object obj4 = this.LJLJLJ;
        if (obj4 != null) {
            sendLog.LIZLLL("coupon_id", obj4);
        }
        Object obj5 = this.LJLJLLL;
        if (obj5 != null) {
            sendLog.LIZLLL("coupon_type_id", obj5);
        }
        Object obj6 = this.LJLL;
        if (obj6 != null) {
            sendLog.LIZLLL("coupon_type_info", obj6);
        }
        if (o.LJ(this.LJLJJL, "shop_review")) {
            sendLog.LIZLLL("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
            sendLog.LIZLLL("shop_review_cnt", Integer.valueOf(C70691Rol.LJIIZILJ));
        }
        return C76800UCe.LIZ;
    }
}
