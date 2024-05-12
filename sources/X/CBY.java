package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBY extends C61491OBj {
    public boolean LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC60833Nu9, C76800UCe> LJLL;

    public CBY(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJLL = aqS171S0100000_5;
    }

    @Override // X.C61491OBj
    public final void LJL(String schema, String biz, C60737Nsb c60737Nsb, C30941Ji c30941Ji) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(biz, "biz");
        super.LJL(schema, biz, c60737Nsb, c30941Ji);
        this.LJLJLLL = true;
        C0NB.LJIIIZ("HybridPerf", "eoy quiz card preload fail");
        C0K2.LJII(2, "ttlive_eoy_quiz_opt_monitor", C113554cx.LJJLIIIJLLLLLLLZ(new LinkedHashMap()));
    }

    @Override // X.C61491OBj
    public final void LJLI(String schema, String biz, C60737Nsb c60737Nsb, InterfaceC60833Nu9 interfaceC60833Nu9) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(biz, "biz");
        super.LJLI(schema, biz, c60737Nsb, interfaceC60833Nu9);
        if (this.LJLJLLL) {
            return;
        }
        C0NB.LJIIIZ("HybridPerf", "eoy quiz card preload success");
        InterfaceC88472Yns<InterfaceC60833Nu9, C76800UCe> interfaceC88472Yns = this.LJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(interfaceC60833Nu9);
        }
        C0K2.LJII(1, "ttlive_eoy_quiz_opt_monitor", C113554cx.LJJLIIIJLLLLLLLZ(new LinkedHashMap()));
    }
}
