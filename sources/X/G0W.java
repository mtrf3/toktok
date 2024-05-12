package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0W extends G14<C40787Fzb> {
    @Override // X.G14, X.G1A
    public final void LIZJ() {
        InterfaceC40806Fzu interfaceC40806Fzu;
        G0D LIZ = C40751Fz1.LIZ();
        if (LIZ != null && (interfaceC40806Fzu = (InterfaceC40806Fzu) LIZ.LIZ(InterfaceC40806Fzu.class)) != null) {
            interfaceC40806Fzu.Vf0(null);
        }
    }

    @Override // X.G1A
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_LYNX_EXPERIENCE_ID;
    }

    @Override // X.G1A
    public final G04<C40787Fzb> LIZ(G0D context, G15 flowEngine) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        return new G0V(context, flowEngine);
    }
}
