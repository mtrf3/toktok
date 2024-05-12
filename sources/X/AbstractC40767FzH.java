package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40767FzH implements InterfaceC40766FzG {
    public final G0D LIZ;
    public final List<G1A<?>> LIZIZ = new ArrayList();
    public final EnumC40773FzN LIZJ = EnumC40773FzN.ALL_MATCH;

    @Override // X.InterfaceC40766FzG
    public final List<G1A<?>> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC40766FzG
    public final G0D context() {
        return this.LIZ;
    }

    public AbstractC40767FzH(G0D g0d) {
        this.LIZ = g0d;
    }

    public final void LIZLLL(G14 g14) {
        ((ArrayList) this.LIZIZ).add(g14);
    }

    @Override // X.InterfaceC40766FzG
    public final boolean LIZIZ(int i, List<? extends G1A<?>> list) {
        InterfaceC40796Fzk uch;
        List<G1A<?>> list2 = this.LIZIZ;
        EnumC40773FzN enumC40773FzN = this.LIZJ;
        o.LJIIIZ(enumC40773FzN, "<this>");
        int i2 = C40772FzM.LIZ[enumC40773FzN.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                uch = new C73974T1m();
            } else {
                throw new C162476Zf();
            }
        } else {
            uch = new UCH();
        }
        List LIZ = uch.LIZ(i, list2, list);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("steps:");
        LIZ2.append(C32151Nz.LJJIJ(this.LIZIZ));
        LIZ2.append(" \n index:");
        LIZ2.append(i);
        LIZ2.append(" \n updateResult:");
        LIZ2.append(C32151Nz.LJJIJ(LIZ));
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        if (o.LJ(LIZ, this.LIZIZ)) {
            return false;
        }
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZIZ).addAll(LIZ);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("final steps:");
        LIZ3.append(C32151Nz.LJJIJ(this.LIZIZ));
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ3));
        return true;
    }
}
