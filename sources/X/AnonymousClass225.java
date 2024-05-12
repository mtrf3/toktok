package X;

/* renamed from: X.225, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass225 extends AbstractC65781Prl implements InterfaceC88472Yns<C1V9, C1V9> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass225(String str, String str2, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C1V9 invoke(C1V9 c1v9) {
        C1V9 c1v92 = c1v9;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String str3 = this.LJLJI;
        if (c1v92 == null) {
            c1v92 = new C1V9(0);
        }
        C1V9.LJ(c1v92, "infra_unistore_kv_create_repo_dev", str, str2, str3, null, null, 112);
        return c1v92;
    }
}
