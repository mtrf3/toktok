package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50721yu extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ AbstractC39201gK LJLIL;
    public final /* synthetic */ InterfaceC39071g7 LJLILLLLZI;
    public final /* synthetic */ InterfaceC44861pS LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC07760Se LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50721yu(AbstractC39201gK abstractC39201gK, InterfaceC39071g7 interfaceC39071g7, InterfaceC44861pS interfaceC44861pS, int i, int i2, InterfaceC07760Se interfaceC07760Se) {
        super(1);
        this.LJLIL = abstractC39201gK;
        this.LJLILLLLZI = interfaceC39071g7;
        this.LJLJI = interfaceC44861pS;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = interfaceC07760Se;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x abstractC274515x) {
        AbstractC274515x layout = abstractC274515x;
        o.LJIIIZ(layout, "$this$layout");
        C0YZ.LIZIZ(layout, this.LJLIL, this.LJLILLLLZI, this.LJLJI.getLayoutDirection(), this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
