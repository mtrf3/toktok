package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aKI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93030aKI extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC06520Nk, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC91781a09 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93030aKI(String str, InterfaceC91781a09 interfaceC91781a09, int i) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC91781a09;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC06520Nk AnimatedVisibility, InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        C92099a5H.LIZJ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, ((this.LJLJI >> 3) & 14) | 64, 0);
        return C76800UCe.LIZ;
    }
}
