package X;

/* renamed from: X.aEq, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92692aEq extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC91961a33 LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC91961a33, String, Object, C76800UCe> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92692aEq(InterfaceC91961a33 interfaceC91961a33, C92283a8F c92283a8F, InterfaceC88473Ynt<? super InterfaceC91961a33, ? super String, Object, C76800UCe> interfaceC88473Ynt, String str, String str2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.LJLIL = interfaceC91961a33;
        this.LJLILLLLZI = c92283a8F;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLILLLLZI.LJI(((C92230a7O) this.LJLIL).LJLILLLLZI, null, null, false);
        this.LJLILLLLZI.LJIIIZ();
        this.LJLJI.invoke(this.LJLIL, this.LJLJJI, this.LJLJJL);
        this.LJLJJLL.invoke("select_assemble_pi");
        return C76800UCe.LIZ;
    }
}
