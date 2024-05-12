package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.ConsistentContentAndAdChoiceFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G0p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40827G0p extends G0C<C40795Fzj> {
    public final C62822Ol8 LIZLLL;

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_CONSISTENT_CONTENT_AND_AD_CHOICES_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        if (((IConsistentContentAndAdChoiceService) this.LIZLLL.getValue()).LIZ() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40827G0p(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        this.LIZLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 5));
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        super.LIZ(context, c35656Dz2, interfaceC88472Yns);
        ConsistentContentAndAdChoiceFragment LIZLLL = ((IConsistentContentAndAdChoiceService) this.LIZLLL.getValue()).LIZLLL();
        if (LIZLLL == null) {
            LIZLLL();
        } else {
            ((InterfaceC40755Fz5) context.LJLILLLLZI).LJ().invoke(LIZLLL, Boolean.TRUE);
        }
    }
}
