package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V1g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79064V1g extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ AbstractC39201gK LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79064V1g(int i, AbstractC39201gK abstractC39201gK, int i2) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = abstractC39201gK;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC274515x.LIZJ(this.LJLILLLLZI, O6R.LJJIIZ((this.LJLIL - this.LJLILLLLZI.LJLIL) / 2.0f), O6R.LJJIIZ((this.LJLJI - this.LJLILLLLZI.LJLILLLLZI) / 2.0f), 0.0f);
        return C76800UCe.LIZ;
    }
}
