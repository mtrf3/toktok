package X;

/* renamed from: X.UvZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78757UvZ extends AbstractC65781Prl implements InterfaceC88473Ynt<Long, Boolean, String, C76800UCe> {
    public final /* synthetic */ C78758Uva LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ W6U LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78757UvZ(C78758Uva c78758Uva, String str, W6U w6u) {
        super(3);
        this.LJLIL = c78758Uva;
        this.LJLILLLLZI = str;
        this.LJLJI = w6u;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Long l, Boolean bool, String str) {
        C78758Uva c78758Uva = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String w6u = this.LJLJI.toString();
        c78758Uva.getClass();
        C76542zS.LIZJ("rd_tiktokec_lynx_image_preload", new C37300EkS(l.longValue(), str2, bool.booleanValue(), w6u, str));
        return C76800UCe.LIZ;
    }
}
