package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBB extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KBB(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = i;
        this.LJLJLJ = str7;
        this.LJLJLLL = str8;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("previous_page", this.LJLIL);
        sendLog.LIZLLL("deeplink_type", this.LJLILLLLZI);
        sendLog.LIZLLL("top_product_ids", this.LJLJI);
        sendLog.LIZLLL("creative_id", this.LJLJJI);
        sendLog.LIZLLL("campaign_id", this.LJLJJL);
        sendLog.LIZLLL("schema", this.LJLJJLL);
        sendLog.LIZLLL("is_success", Integer.valueOf(this.LJLJL));
        String str = this.LJLJLJ;
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("error_msg", str);
        sendLog.LIZLLL(WM7.SCENE_SERVICE, this.LJLJLLL);
        return C76800UCe.LIZ;
    }
}
