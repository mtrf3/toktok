package X;

/* renamed from: X.Lv5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55795Lv5 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C55794Lv4 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55795Lv5(String str, C55794Lv4 c55794Lv4, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = c55794Lv4;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = str6;
        this.LJLJLLL = str7;
        this.LJLL = str8;
        this.LJLLI = str9;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String LIZIZ;
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "previous_page", "mall");
        c27943Axv2.LIZLLL("page_name", "mall_racun_channel");
        c27943Axv2.LIZLLL("list_name", this.LJLIL);
        c27943Axv2.LIZLLL("list_num", Integer.valueOf(this.LJLILLLLZI.LIZIZ));
        c27943Axv2.LIZLLL("enter_from", "mall");
        c27943Axv2.LIZLLL("entrance_form", "mall_racun_channel");
        c27943Axv2.LIZLLL("source_page_type", this.LJLJI);
        c27943Axv2.LIZLLL("item_order", Integer.valueOf(this.LJLJJI));
        c27943Axv2.LIZLLL("author_id", this.LJLJJL);
        c27943Axv2.LIZLLL("product_id", this.LJLJJLL);
        c27943Axv2.LIZLLL("sales_price", this.LJLJL);
        if (this.LJLILLLLZI.LIZ == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJLJ);
            LIZ.append('_');
            LIZ.append(this.LJLJJL);
            LIZ.append('_');
            LIZ.append(this.LJLJJLL);
            LIZ.append('_');
            LIZ.append(this.LJLJJI);
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLJLJ);
            LIZ2.append('_');
            LIZ2.append(this.LJLJJL);
            LIZ2.append('_');
            LIZ2.append(this.LJLJJI);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        c27943Axv2.LIZLLL("track_id", LIZIZ);
        String str = this.LJLJLLL;
        if (str != null) {
            c27943Axv2.LIZLLL("room_id", str);
        }
        String str2 = this.LJLL;
        if (str2 != null) {
            c27943Axv2.LIZLLL("group_id", str2);
        }
        c27943Axv2.LIZLLL("req_params", this.LJLLI);
        c27943Axv2.LIZLLL("request_id", this.LJLJLJ);
        return C76800UCe.LIZ;
    }
}
