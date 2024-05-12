package X;

/* renamed from: X.KTi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51766KTi extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51766KTi(String str, String str2, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "previous_page", "mall");
        c27943Axv2.LIZLLL("page_name", "mall_racun_channel");
        c27943Axv2.LIZLLL("enter_from_merge", "mall_racun_channel");
        c27943Axv2.LIZLLL("enter_method", "live_cover");
        c27943Axv2.LIZLLL("room_id", this.LJLIL);
        c27943Axv2.LIZLLL("anchor_id", this.LJLILLLLZI);
        c27943Axv2.LIZLLL("action_type", "click");
        c27943Axv2.LIZLLL("request_id", this.LJLJI);
        return C76800UCe.LIZ;
    }
}
