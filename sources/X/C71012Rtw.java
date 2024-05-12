package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rtw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71012Rtw extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ C48502J1u LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI = "skip_pdp";
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ java.util.Map<String, String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71012Rtw(C48502J1u c48502J1u, String str, String str2, String str3, Integer num, java.util.Map map) {
        super(1);
        this.LJLIL = c48502J1u;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = num;
        this.LJLJL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String LIZJ = this.LJLIL.LIZJ("page_name");
        String str = "";
        if (LIZJ == null) {
            LIZJ = "";
        }
        sendLog.LIZJ("page_name", LIZJ);
        String LIZJ2 = this.LJLIL.LIZJ("author_id");
        if (LIZJ2 == null) {
            LIZJ2 = "";
        }
        sendLog.LIZJ("author_id", LIZJ2);
        String LIZJ3 = this.LJLIL.LIZJ("entrance_form");
        if (LIZJ3 == null) {
            LIZJ3 = "";
        }
        sendLog.LIZJ("entrance_form", LIZJ3);
        sendLog.LIZJ("source_page_type", "live");
        sendLog.LIZJ("previous_page", "live");
        String LIZJ4 = this.LJLIL.LIZJ("room_id");
        if (LIZJ4 == null) {
            LIZJ4 = "";
        }
        sendLog.LIZJ("source_content_id", LIZJ4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("_temai_");
        LIZ.append(this.LJLJI);
        sendLog.LIZJ("enter_from_info", X1D.LIZIZ(LIZ));
        String LIZJ5 = this.LJLIL.LIZJ("product_id");
        if (LIZJ5 == null) {
            LIZJ5 = "";
        }
        sendLog.LIZJ("product_id", LIZJ5);
        String LIZJ6 = this.LJLIL.LIZJ("product_source");
        if (LIZJ6 == null) {
            LIZJ6 = "";
        }
        sendLog.LIZJ("product_source", LIZJ6);
        String LIZJ7 = this.LJLIL.LIZJ("source_from");
        if (LIZJ7 == null) {
            LIZJ7 = "";
        }
        sendLog.LIZJ("source_from", LIZJ7);
        String LIZJ8 = this.LJLIL.LIZJ("source");
        if (LIZJ8 == null) {
            LIZJ8 = "";
        }
        sendLog.LIZJ("source", LIZJ8);
        sendLog.LIZJ("purchase_path", this.LJLJJI);
        sendLog.LIZJ("entrance_info", C27739Aud.LJI(C71011Rtv.LIZ(C71011Rtv.LIZLLL, this.LJLIL)));
        String LIZJ9 = this.LJLIL.LIZJ("source_module");
        if (LIZJ9 != null) {
            sendLog.LIZJ("source_module", LIZJ9);
        }
        String LIZJ10 = this.LJLIL.LIZJ("is_ad");
        if (LIZJ10 == null) {
            LIZJ10 = "";
        }
        sendLog.LIZJ("is_ad", LIZJ10);
        String LIZJ11 = this.LJLIL.LIZJ("ad_id");
        if (LIZJ11 == null) {
            LIZJ11 = "";
        }
        sendLog.LIZJ("ad_id", LIZJ11);
        String LIZJ12 = this.LJLIL.LIZJ("creative_id");
        if (LIZJ12 == null) {
            LIZJ12 = "";
        }
        sendLog.LIZJ("creative_id", LIZJ12);
        String LIZJ13 = this.LJLIL.LIZJ("track_id");
        if (LIZJ13 != null) {
            sendLog.LIZJ("track_id", LIZJ13);
        }
        String LIZJ14 = this.LJLIL.LIZJ("saleable_sku_num");
        if (LIZJ14 != null) {
            str = LIZJ14;
        }
        sendLog.LIZJ("saleable_sku_num", str);
        String str2 = this.LJLJJL;
        if (str2 != null) {
            sendLog.LIZJ("sku_id", str2);
        }
        Integer num = this.LJLJJLL;
        if (num != null) {
            sendLog.LIZJ("quantity", Integer.valueOf(num.intValue()));
        }
        String str3 = this.LJLJL.get("rights_cnt");
        if (str3 != null) {
            sendLog.LIZJ("rights_cnt", str3);
        }
        String str4 = this.LJLJL.get("rights_content");
        if (str4 != null) {
            sendLog.LIZJ("rights_content", str4);
        }
        return C76800UCe.LIZ;
    }
}
