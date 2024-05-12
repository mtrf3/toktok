package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50901zC extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ C50911zD LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AbstractC39201gK LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC44861pS LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50901zC(C50911zD c50911zD, int i, AbstractC39201gK abstractC39201gK, int i2, InterfaceC44861pS interfaceC44861pS) {
        super(1);
        this.LJLIL = c50911zD;
        this.LJLILLLLZI = i;
        this.LJLJI = abstractC39201gK;
        this.LJLJJI = i2;
        this.LJLJJL = interfaceC44861pS;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x layout) {
        o.LJIIIZ(layout, "$this$layout");
        InterfaceC88471Ynr<C23490w5, EnumC23500w6, C23450w1> interfaceC88471Ynr = this.LJLIL.LJLJJI;
        int i = this.LJLILLLLZI;
        AbstractC39201gK abstractC39201gK = this.LJLJI;
        AbstractC274515x.LJ(this.LJLJI, interfaceC88471Ynr.invoke(new C23490w5(C78996UzQ.LIZIZ(i - abstractC39201gK.LJLIL, this.LJLJJI - abstractC39201gK.LJLILLLLZI)), this.LJLJJL.getLayoutDirection()).LIZ, 0.0f);
        return C76800UCe.LIZ;
    }
}
