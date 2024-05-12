package X;

/* loaded from: classes9.dex */
public final class KKV extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KKV(String str, String str2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from", "mall");
        c27943Axv2.LIZLLL("page_name", "mall");
        c27943Axv2.LIZLLL("previous_page", this.LJLIL);
        c27943Axv2.LIZLLL("words_source", "search_bar_outer");
        c27943Axv2.LIZLLL("search_keyword", this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
