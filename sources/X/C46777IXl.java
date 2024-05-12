package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IXl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46777IXl extends AbstractC46781IXp {
    public final IXL LIZ() {
        IXL ixl;
        C46999IcV iSimPlayerPlaySessionConfig = IUA.LIZ.LIZ().getISimPlayerPlaySessionConfig(this.LIZ);
        C46778IXm c46778IXm = new C46778IXm();
        boolean z = this.LIZIZ;
        C46780IXo c46780IXo = c46778IXm.LIZ;
        c46780IXo.LIZ = z;
        Object value = IZ8.LLD.getValue();
        o.LJIIIIZZ(value, "<get-SIM_PLAYER_ASYNC_MODE>(...)");
        if (((Boolean) value).booleanValue()) {
            ixl = new C46748IWi(new IXF(iSimPlayerPlaySessionConfig), c46780IXo);
        } else {
            ixl = new IXL(new IXF(iSimPlayerPlaySessionConfig), c46780IXo);
        }
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("player_init_build_duration", false);
            C56662Kg.LIZ().LIZJ("player_init_build_to_enginepreloader", false);
        }
        return ixl;
    }
}
