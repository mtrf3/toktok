package X;

import kotlin.jvm.internal.o;

/* renamed from: X.C0s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30638C0s extends C1E1 {
    public final /* synthetic */ InterfaceC30642C0w LIZ;

    public C30638C0s(InterfaceC30645C0z interfaceC30645C0z) {
        this.LIZ = interfaceC30645C0z;
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZ(C04120Ee pollInfo) {
        o.LJIIIZ(pollInfo, "pollInfo");
        InterfaceC30644C0y interfaceC30644C0y = (InterfaceC30644C0y) this.LIZ;
        if (interfaceC30644C0y != null) {
            interfaceC30644C0y.LJIILIIL(O6R.LJJIJ((((float) pollInfo.LIZIZ) * 1.0f) / 1000));
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZIZ(C04120Ee c04120Ee) {
        InterfaceC30644C0y interfaceC30644C0y = (InterfaceC30644C0y) this.LIZ;
        if (interfaceC30644C0y != null) {
            interfaceC30644C0y.LJ();
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJ(C04120Ee pollInfo) {
        o.LJIIIZ(pollInfo, "pollInfo");
        InterfaceC30644C0y interfaceC30644C0y = (InterfaceC30644C0y) this.LIZ;
        if (interfaceC30644C0y != null) {
            interfaceC30644C0y.LJI();
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJFF(C04120Ee c04120Ee) {
        InterfaceC30645C0z interfaceC30645C0z = (InterfaceC30645C0z) this.LIZ;
        if (interfaceC30645C0z != null) {
            interfaceC30645C0z.LJJJLL();
        }
    }
}
