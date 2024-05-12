package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RjD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70347RjD extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70347RjD(int i, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        String str2;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LinkedHashMap<String, Object> linkedHashMap = C70307RiZ.LIZ;
        C27943Axv.LIZ(sendLog, linkedHashMap);
        sendLog.LIZLLL("page_name", "sku");
        if (this.LJLIL <= 6) {
            str = "no_greater_than_6";
        } else {
            str = "greater_than_6";
        }
        sendLog.LIZLLL("sku_show_type", str);
        if (!linkedHashMap.containsKey("previous_page") && (str2 = this.LJLILLLLZI) != null) {
            sendLog.LIZLLL("previous_page", str2);
        }
        String str3 = this.LJLJI;
        if (str3 != null) {
            sendLog.LIZLLL("source_button", str3);
        }
        String str4 = this.LJLJJI;
        if (str4 != null) {
            sendLog.LIZLLL("coupon_id", str4);
        }
        String str5 = this.LJLJJL;
        if (str5 != null) {
            sendLog.LIZLLL("coupon_type_id", str5);
        }
        String str6 = this.LJLJJLL;
        if (str6 != null) {
            sendLog.LIZLLL("coupon_type_info", str6);
        }
        if (o.LJ(this.LJLILLLLZI, "shop_review")) {
            sendLog.LIZLLL("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
            sendLog.LIZLLL("shop_review_cnt", Integer.valueOf(C70691Rol.LJIIZILJ));
        }
        return C76800UCe.LIZ;
    }
}
