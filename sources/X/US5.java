package X;

import kotlin.jvm.internal.AqS14S2000000_13;
import kotlin.jvm.internal.AqS37S0001000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US5 extends AbstractC65781Prl implements InterfaceC88472Yns<US3, C76800UCe> {
    public final /* synthetic */ InterfaceC70422pa LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ UR7 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public US5(InterfaceC70422pa interfaceC70422pa, int i, String str, String str2, UR7 ur7) {
        super(1);
        this.LJLIL = interfaceC70422pa;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = ur7;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(US3 us3) {
        US3 buildAuthPipeline = us3;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL(this.LJLIL);
        buildAuthPipeline.LIZJ(new AqS37S0001000_13(this.LJLILLLLZI, 7));
        buildAuthPipeline.LJ(new AqS14S2000000_13(this.LJLJI, this.LJLJJI, 0));
        buildAuthPipeline.LIZIZ(new URW(this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
