package X;

import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSO implements InterfaceC82311WSd {
    public final /* synthetic */ AqS164S0100000_14 LIZ;

    public WSO(AqS164S0100000_14 aqS164S0100000_14) {
        this.LIZ = aqS164S0100000_14;
    }

    @Override // X.InterfaceC82311WSd
    public final void LIZIZ(EnumC82314WSg type) {
        o.LJIIIZ(type, "type");
        ((WSN) this.LIZ.l0).LJJLIIIJJI(type);
    }

    @Override // X.InterfaceC82311WSd
    public final void LIZ(float f, LDV type) {
        o.LJIIIZ(type, "type");
        ((WSN) this.LIZ.l0).LJJLIIIJILLIZJL(f, type);
    }
}
