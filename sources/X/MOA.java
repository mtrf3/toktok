package X;

import kotlin.jvm.internal.AqS11S2000000_9;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MOA extends AbstractC65781Prl implements InterfaceC88472Yns<US3, C76800UCe> {
    public final /* synthetic */ InterfaceC70422pa LJLIL;
    public final /* synthetic */ LSG LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MOA(InterfaceC70422pa interfaceC70422pa, LSG lsg, String str, String str2) {
        super(1);
        this.LJLIL = interfaceC70422pa;
        this.LJLILLLLZI = lsg;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(US3 us3) {
        US3 buildAuthPipeline = us3;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL(this.LJLIL);
        buildAuthPipeline.LIZJ(new AqS179S0100000_13(this.LJLILLLLZI, 34));
        buildAuthPipeline.LJ(new AqS11S2000000_9(this.LJLJI, this.LJLJJI, 0));
        buildAuthPipeline.LIZIZ(MOC.LJLIL);
        return C76800UCe.LIZ;
    }
}
