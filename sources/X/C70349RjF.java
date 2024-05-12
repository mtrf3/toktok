package X;

import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RjF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70349RjF extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C70354RjK LJLJLLL;
    public final /* synthetic */ HeaderBannerDaInfo LJLL;
    public final /* synthetic */ Boolean LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ String LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70349RjF(C70354RjK c70354RjK, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, java.util.Map map, java.util.Map map2) {
        super(1);
        this.LJLIL = map;
        this.LJLILLLLZI = map2;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = num;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLJLJ = str5;
        this.LJLJLLL = c70354RjK;
        this.LJLL = headerBannerDaInfo;
        this.LJLLI = bool;
        this.LJLLILLLL = str6;
        this.LJLLJ = str7;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        java.util.Map<String, ? extends Object> LJII;
        Object obj2;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ(this.LJLIL);
        java.util.Map<String, ? extends Object> map = this.LJLILLLLZI;
        if (map != null) {
            sendLog.LJ(map);
        } else if (o.LJ(this.LJLIL.get("previous_page"), "product_review")) {
            sendLog.LJ(C70666RoM.LIZIZ());
        } else if (o.LJ(this.LJLIL.get("previous_page"), "shop_review")) {
            sendLog.LJ(C70666RoM.LIZJ());
        }
        Object obj3 = this.LJLJI;
        if (obj3 != null) {
            sendLog.LIZLLL("source_button", obj3);
        }
        Object obj4 = this.LJLJJI;
        if (obj4 != null) {
            sendLog.LIZLLL("sku_id", obj4);
        }
        Integer num = this.LJLJJL;
        if (num != null) {
            num.intValue();
            sendLog.LIZLLL("is_single_sku", num);
        }
        Object obj5 = this.LJLJJLL;
        if (obj5 != null) {
            sendLog.LIZLLL("cart_form", obj5);
        }
        Object obj6 = this.LJLJL;
        if (obj6 != null) {
            sendLog.LIZLLL("page_name", obj6);
        }
        if (!this.LJLIL.containsKey("previous_page") && (obj2 = this.LJLJLJ) != null) {
            sendLog.LIZLLL("previous_page", obj2);
        }
        if (o.LJ(this.LJLJL, "shop_review") || o.LJ(this.LJLJL, "product_review")) {
            sendLog.LIZLLL("previous_page", "product_detail");
        }
        sendLog.LIZLLL("traceparent", PII.LIZIZ());
        C70354RjK c70354RjK = this.LJLJLLL;
        if (c70354RjK != null) {
            C70355RjL.LIZLLL(c70354RjK, sendLog);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LJLL;
        if (headerBannerDaInfo != null) {
            sendLog.LIZLLL("rights_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            sendLog.LIZLLL("rights_content", headerBannerDaInfo.rightsContent);
        }
        Boolean bool = this.LJLLI;
        if (bool != null) {
            bool.booleanValue();
            sendLog.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str = this.LJLLILLLL;
        if (str != null && (LJII = C27739Aud.LJII(str)) != null) {
            sendLog.LJ(LJII);
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(this.LJLLJ);
        if (LJII2 != null && (obj = LJII2.get("logo_type")) != null) {
            sendLog.LIZJ("logo_type", obj);
        }
        return C76800UCe.LIZ;
    }
}
