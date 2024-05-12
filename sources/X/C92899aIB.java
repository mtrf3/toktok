package X;

import java.util.List;

/* renamed from: X.aIB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92899aIB extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ List<InterfaceC91996a3c> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92899aIB(boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, List<? extends InterfaceC91996a3c> list, String str, int i, InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i2, int i3) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88471Ynr;
        this.LJLJLJ = i2;
        this.LJLJLLL = i3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91998a3e.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1, this.LJLJLLL);
        return C76800UCe.LIZ;
    }
}
