package X;

/* renamed from: X.Azx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28069Azx extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28069Azx(String str, boolean z, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = str4;
        this.LJLJLJ = str5;
        this.LJLJLLL = str6;
        this.LJLL = str7;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "payment_method");
        String str = this.LJLIL;
        if (str != null) {
            c27943Axv2.LIZLLL("previous_page", str);
        }
        c27943Axv2.LIZLLL("is_success", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        String str2 = this.LJLJI;
        if (str2 != null) {
            c27943Axv2.LIZLLL("error_code", str2);
        }
        String str3 = this.LJLJJI;
        if (str3 != null) {
            c27943Axv2.LIZLLL("fail_reason", str3);
        }
        c27943Axv2.LIZLLL("api_duration", Long.valueOf(this.LJLJJL));
        c27943Axv2.LIZLLL("duration", Long.valueOf(this.LJLJJLL));
        c27943Axv2.LIZLLL("total_duration", Long.valueOf(this.LJLJJL + this.LJLJJLL));
        String str4 = this.LJLJL;
        if (str4 != null) {
            c27943Axv2.LIZLLL("entrance_info", str4);
        }
        String str5 = this.LJLJLJ;
        if (str5 != null) {
            c27943Axv2.LIZLLL("entrance_form", str5);
        }
        String str6 = this.LJLJLLL;
        if (str6 != null) {
            c27943Axv2.LIZLLL("source_page_type", str6);
        }
        String str7 = this.LJLL;
        if (str7 != null) {
            c27943Axv2.LIZLLL("order_id", str7);
        }
        return C76800UCe.LIZ;
    }
}
