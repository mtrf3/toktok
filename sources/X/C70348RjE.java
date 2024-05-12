package X;

import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.RjE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70348RjE extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Integer LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ Integer LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ Integer LJLLJ;
    public final /* synthetic */ String LJLLL;
    public final /* synthetic */ String LJLLLL;
    public final /* synthetic */ Integer LJLLLLLL;
    public final /* synthetic */ String LJLZ;
    public final /* synthetic */ String LJZ;
    public final /* synthetic */ String LJZI;
    public final /* synthetic */ Boolean LJZL;
    public final /* synthetic */ C70354RjK LL;
    public final /* synthetic */ HeaderBannerDaInfo LLD;
    public final /* synthetic */ Boolean LLF;
    public final /* synthetic */ String LLFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70348RjE(C70354RjK c70354RjK, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, java.util.Map map, java.util.Map map2) {
        super(1);
        this.LJLIL = map;
        this.LJLILLLLZI = map2;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = num;
        this.LJLJL = str4;
        this.LJLJLJ = num2;
        this.LJLJLLL = str5;
        this.LJLL = num3;
        this.LJLLI = num4;
        this.LJLLILLLL = str6;
        this.LJLLJ = num5;
        this.LJLLL = str7;
        this.LJLLLL = str8;
        this.LJLLLLLL = num6;
        this.LJLZ = str9;
        this.LJZ = str10;
        this.LJZI = str11;
        this.LJZL = bool;
        this.LL = c70354RjK;
        this.LLD = headerBannerDaInfo;
        this.LLF = bool2;
        this.LLFF = str12;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        java.util.Map<String, ? extends Object> map = this.LJLIL;
        if (map == null) {
            map = C70307RiZ.LIZ;
        }
        sendLog.LJ(map);
        java.util.Map<String, ? extends Object> map2 = this.LJLILLLLZI;
        if (map2 != null) {
            sendLog.LJ(map2);
        } else if (o.LJ(map.get("previous_page"), "product_review")) {
            sendLog.LJ(C70666RoM.LIZIZ());
        } else if (o.LJ(map.get("previous_page"), "shop_review")) {
            sendLog.LJ(C70666RoM.LIZJ());
        }
        Object obj2 = this.LJLJI;
        if (obj2 != null) {
            sendLog.LIZLLL("cart_item_id", obj2);
        }
        Object obj3 = this.LJLJJI;
        if (obj3 != null) {
            sendLog.LIZLLL("source_button", obj3);
        }
        Object obj4 = this.LJLJJL;
        if (obj4 != null) {
            sendLog.LIZLLL("sku_id", obj4);
        }
        Integer num = this.LJLJJLL;
        if (num != null) {
            num.intValue();
            sendLog.LIZLLL("is_single_sku", num);
        }
        Object obj5 = this.LJLJL;
        if (obj5 != null) {
            sendLog.LIZLLL("cart_form", obj5);
        }
        Integer num2 = this.LJLJLJ;
        if (num2 != null) {
            num2.intValue();
            sendLog.LIZLLL("is_success", num2);
        }
        Object obj6 = this.LJLJLLL;
        if (obj6 != null) {
            sendLog.LIZLLL("fail_reason", obj6);
        }
        Integer num3 = this.LJLL;
        if (num3 != null) {
            num3.intValue();
            sendLog.LIZLLL("add_sku_num", num3);
        }
        Integer num4 = this.LJLLI;
        if (num4 != null) {
            num4.intValue();
            sendLog.LIZLLL("sku_num_before", num4);
        }
        Object obj7 = this.LJLLILLLL;
        if (obj7 != null) {
            sendLog.LIZLLL("flashsale_status", obj7);
        }
        Integer num5 = this.LJLLJ;
        if (num5 != null) {
            num5.intValue();
            sendLog.LIZLLL("sku_num_after", num5);
        }
        Object obj8 = this.LJLLL;
        if (obj8 != null) {
            sendLog.LIZLLL("page_name", obj8);
        }
        if (!map.containsKey("previous_page") && (obj = this.LJLLLL) != null) {
            sendLog.LIZLLL("previous_page", obj);
        }
        if (o.LJ(this.LJLLL, "shop_review") || o.LJ(this.LJLLL, "product_review")) {
            sendLog.LIZLLL("previous_page", "product_detail");
        }
        sendLog.LIZLLL("traceparent", PII.LIZIZ());
        Integer num6 = this.LJLLLLLL;
        if (num6 != null) {
            sendLog.LIZLLL("is_coupon_tips_shown", Integer.valueOf(num6.intValue()));
        }
        Object obj9 = this.LJLZ;
        if (obj9 != null) {
            sendLog.LIZLLL("coupon_id", obj9);
        }
        Object obj10 = this.LJZ;
        if (obj10 != null) {
            sendLog.LIZLLL("coupon_type_id", obj10);
        }
        Object obj11 = this.LJZI;
        if (obj11 != null) {
            sendLog.LIZLLL("coupon_type_info", obj11);
        }
        Boolean bool = this.LJZL;
        if (bool != null) {
            sendLog.LIZLLL("is_coupon_reminder_shown", Boolean.valueOf(bool.booleanValue()));
        }
        C70354RjK c70354RjK = this.LL;
        if (c70354RjK != null) {
            C70355RjL.LIZLLL(c70354RjK, sendLog);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LLD;
        if (headerBannerDaInfo != null) {
            sendLog.LIZLLL("rights_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            sendLog.LIZLLL("rights_content", headerBannerDaInfo.rightsContent);
        }
        Boolean bool2 = this.LLF;
        if (bool2 != null) {
            bool2.booleanValue();
            sendLog.LIZLLL("is_load_data", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        C1DF.LIZJ(C70307RiZ.LIZ, false, sendLog, false, null);
        java.util.Map<String, ? extends Object> LJII = C27739Aud.LJII(this.LLFF);
        if (LJII != null) {
            sendLog.LJ(LJII);
        }
        return C76800UCe.LIZ;
    }
}
