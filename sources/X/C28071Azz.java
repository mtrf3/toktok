package X;

/* renamed from: X.Azz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28071Azz extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28071Azz(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "toast_name", "error_remind");
        String str = this.LJLIL;
        if (str != null) {
            c27943Axv2.LIZLLL("toast_content", str);
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            c27943Axv2.LIZLLL("error_code", str2);
        }
        c27943Axv2.LIZLLL("request_name", this.LJLJI);
        String str3 = this.LJLJJI;
        if (str3 != null) {
            c27943Axv2.LIZLLL("previous_page", str3);
        }
        String str4 = this.LJLJJL;
        if (str4 != null) {
            c27943Axv2.LIZLLL("page_name", str4);
        }
        return C76800UCe.LIZ;
    }
}
