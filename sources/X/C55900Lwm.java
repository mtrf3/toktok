package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lwm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55900Lwm extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ boolean LJLL = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55900Lwm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = str7;
        this.LJLJLJ = str8;
        this.LJLJLLL = str9;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("is_success", this.LJLIL);
        String str = this.LJLILLLLZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("deeplink_type", str);
        String str3 = this.LJLJI;
        if (str3 == null) {
            str3 = "";
        }
        sendLog.LIZLLL("top_product_id", str3);
        String str4 = this.LJLJJI;
        if (str4 == null) {
            str4 = "";
        }
        sendLog.LIZLLL("error_info", str4);
        String str5 = this.LJLJJL;
        if (str5 == null) {
            str5 = "";
        }
        sendLog.LIZLLL("position_type", str5);
        String str6 = this.LJLJJLL;
        if (str6 == null) {
            str6 = "";
        }
        sendLog.LIZLLL("previous_page", str6);
        String str7 = this.LJLJL;
        if (str7 == null) {
            str7 = "";
        }
        sendLog.LIZLLL("schema", str7);
        String str8 = this.LJLJLJ;
        if (str8 == null) {
            str8 = "";
        }
        sendLog.LIZLLL("creative_id", str8);
        String str9 = this.LJLJLLL;
        if (str9 != null) {
            str2 = str9;
        }
        sendLog.LIZLLL("campaign_id", str2);
        sendLog.LIZLLL("has_landing_deeplink", Integer.valueOf(this.LJLL ? 1 : 0));
        return C76800UCe.LIZ;
    }
}
