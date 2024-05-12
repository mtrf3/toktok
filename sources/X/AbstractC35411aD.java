package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35411aD implements C0SU {
    public final boolean LIZ;
    public final float LIZIZ;
    public final InterfaceC24760y8<C11850dJ> LIZJ;

    public AbstractC35411aD() {
        throw null;
    }

    public abstract AbstractC35421aE LIZIZ(C0X9 c0x9, boolean z, float f, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, InterfaceC24520xk interfaceC24520xk);

    public final int hashCode() {
        return this.LIZJ.hashCode() + C47959Irz.LIZIZ(this.LIZIZ, C16880lQ.LLJILJIL(this.LIZ) * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC35411aD)) {
            return false;
        }
        AbstractC35411aD abstractC35411aD = (AbstractC35411aD) obj;
        if (this.LIZ == abstractC35411aD.LIZ && C23390vv.LIZJ(this.LIZIZ, abstractC35411aD.LIZIZ) && o.LJ(this.LIZJ, abstractC35411aD.LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // X.C0SU
    public final C0SW LIZ(C0X9 interactionSource, InterfaceC24520xk interfaceC24520xk) {
        long LIZ;
        o.LJIIIZ(interactionSource, "interactionSource");
        interfaceC24520xk.LJJIIJ(988743187);
        InterfaceC23280vk interfaceC23280vk = (InterfaceC23280vk) interfaceC24520xk.LJIILLIIL(C23290vl.LIZ);
        interfaceC24520xk.LJJIIJ(-1524341038);
        if (this.LIZJ.getValue().LIZ != C11850dJ.LJI) {
            LIZ = this.LIZJ.getValue().LIZ;
        } else {
            LIZ = interfaceC23280vk.LIZ(interfaceC24520xk);
        }
        interfaceC24520xk.LJJIJIIJIL();
        AbstractC35421aE LIZIZ = LIZIZ(interactionSource, this.LIZ, this.LIZIZ, C78966Uyw.LJJJJIZL(new C11850dJ(LIZ), interfaceC24520xk), C78966Uyw.LJJJJIZL(interfaceC23280vk.LIZIZ(interfaceC24520xk), interfaceC24520xk), interfaceC24520xk);
        C24610xt.LIZLLL(LIZIZ, interactionSource, new C2G4(interactionSource, LIZIZ, null), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LIZIZ;
    }

    public AbstractC35411aD(boolean z, float f, InterfaceC35811ar interfaceC35811ar) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = interfaceC35811ar;
    }
}
