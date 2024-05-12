package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Lvj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55835Lvj extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI = "mall_area";
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55835Lvj(int i, String str, String str2, String str3, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "mall");
        c27943Axv2.LIZLLL("previous_page", this.LJLIL);
        C56045Lz7.LIZ.getClass();
        c27943Axv2.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        String str2 = this.LJLILLLLZI;
        if (str2 != null && str2.length() > 0) {
            c27943Axv2.LIZLLL("page_skin_type", this.LJLILLLLZI);
        }
        c27943Axv2.LIZLLL("api_type", this.LJLJI);
        if (this.LJLJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c27943Axv2.LIZLLL("is_success", str);
        c27943Axv2.LIZLLL("request_type", Integer.valueOf(this.LJLJJL));
        String str3 = this.LJLJJLL;
        if (str3 != null && str3.length() > 0) {
            c27943Axv2.LIZLLL("fail_reason", this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }
}
