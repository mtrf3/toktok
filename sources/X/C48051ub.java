package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48051ub extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ AbstractC39201gK[] LJLIL;
    public final /* synthetic */ C1IA LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48051ub(AbstractC39201gK[] abstractC39201gKArr, C1IA c1ia, int i, int i2) {
        super(1);
        this.LJLIL = abstractC39201gKArr;
        this.LJLILLLLZI = c1ia;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK[] abstractC39201gKArr = this.LJLIL;
        C1IA c1ia = this.LJLILLLLZI;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        int length = abstractC39201gKArr.length;
        int i3 = 0;
        while (i3 < length) {
            AbstractC39201gK abstractC39201gK = abstractC39201gKArr[i3];
            i3++;
            if (abstractC39201gK != null) {
                long q = c1ia.LIZ.LIZIZ.q(C78996UzQ.LIZIZ(abstractC39201gK.LJLIL, abstractC39201gK.LJLILLLLZI), C78996UzQ.LIZIZ(i, i2), EnumC23500w6.Ltr);
                AbstractC274515x.LIZJ(abstractC39201gK, (int) (q >> 32), C23450w1.LIZJ(q), 0.0f);
            }
        }
        return C76800UCe.LIZ;
    }
}
