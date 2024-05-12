package X;

import android.view.View;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L5D extends L4V<EnumC53523KzX, C53464Kya> {
    public static final HashMap<Integer, C53882LCs> LIZJ = new HashMap<>();
    public final EnumC53663L4h LIZ = EnumC53663L4h.LIVE;
    public InterfaceC53713L6f LIZIZ;

    @Override // X.L21
    public final void LIZLLL(L4O l4o) {
    }

    @Override // X.L21
    public final EnumC53663L4h LIZ() {
        return this.LIZ;
    }

    @Override // X.L21
    public final void LIZJ(AUS aus, L69 l69) {
        View LJ = L4V.LJ(this, L4T.AVATAR, l69);
        View LJ2 = L4V.LJ(this, L4T.RING, l69);
        if ((LJ2 instanceof C53873LCj) && LJ != null && (aus instanceof C53464Kya)) {
            int i = ((C53464Kya) aus).LIZ;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (!C52218KeU.LIZ()) {
                    this.LIZIZ = new C53887LCx(EnumC53720L6m.INBOX, LJ, LJ, (C53873LCj) LJ2);
                    return;
                }
                HashMap<Integer, C53882LCs> hashMap = LIZJ;
                if (!hashMap.containsKey(2)) {
                    C53882LCs c53882LCs = new C53882LCs(EnumC53722L6o.SKYLIGHT);
                    c53882LCs.LIZLLL();
                    hashMap.put(2, c53882LCs);
                }
                C53882LCs c53882LCs2 = hashMap.get(2);
                if (c53882LCs2 == null) {
                    return;
                }
                this.LIZIZ = new C53884LCu(c53882LCs2, LJ, LJ, (C53873LCj) LJ2);
                return;
            }
            this.LIZIZ = new C53887LCx(LJ, LJ, (C53873LCj) LJ2);
        }
    }

    @Override // X.L21
    public final void LIZIZ(L4O l4o, L69 l69, L59 command) {
        InterfaceC53713L6f interfaceC53713L6f;
        o.LJIIIZ(command, "command");
        int i = L5A.LIZ[command.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (interfaceC53713L6f = this.LIZIZ) == null) {
                        return;
                    }
                    interfaceC53713L6f.LJII();
                    return;
                }
                InterfaceC53713L6f interfaceC53713L6f2 = this.LIZIZ;
                if (interfaceC53713L6f2 == null) {
                    return;
                }
                interfaceC53713L6f2.LJI();
                return;
            }
            InterfaceC53713L6f interfaceC53713L6f3 = this.LIZIZ;
            if (interfaceC53713L6f3 == null) {
                return;
            }
            interfaceC53713L6f3.LJ();
            return;
        }
        InterfaceC53713L6f interfaceC53713L6f4 = this.LIZIZ;
        if (interfaceC53713L6f4 == null) {
            return;
        }
        interfaceC53713L6f4.LIZ();
    }
}
