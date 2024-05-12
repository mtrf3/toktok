package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48101ug extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ AbstractC39201gK LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48101ug(AbstractC39201gK abstractC39201gK, long j, long j2) {
        super(1);
        this.LJLIL = abstractC39201gK;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK abstractC39201gK = this.LJLIL;
        long j = this.LJLILLLLZI;
        AbstractC274515x.LIZJ(abstractC39201gK, ((int) (this.LJLJI >> 32)) + ((int) (j >> 32)), C23450w1.LIZJ(this.LJLJI) + C23450w1.LIZJ(j), 0.0f);
        return C76800UCe.LIZ;
    }
}
