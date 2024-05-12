package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pgp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65103Pgp {
    public final List<InterfaceC64917Pdp> LIZ = new ArrayList();
    public final List<InterfaceC65108Pgu> LIZIZ = new ArrayList();
    public final List<InterfaceC64900PdY> LIZJ = new ArrayList();
    public final List<InterfaceC64924Pdw> LIZLLL = new ArrayList();
    public final List<InterfaceC65104Pgq> LJ = new ArrayList();

    public final void LIZ(InterfaceC65105Pgr partner) {
        o.LJIIIZ(partner, "partner");
        if (partner instanceof InterfaceC65104Pgq) {
            ((ArrayList) this.LJ).add(partner);
            return;
        }
        if (partner instanceof InterfaceC64917Pdp) {
            ((ArrayList) this.LIZ).add(partner);
        }
        if (partner instanceof InterfaceC64924Pdw) {
            ((ArrayList) this.LIZLLL).add(partner);
        }
        if (partner instanceof InterfaceC64900PdY) {
            ((ArrayList) this.LIZJ).add(partner);
        }
        if (partner instanceof InterfaceC65108Pgu) {
            ((ArrayList) this.LIZIZ).add(partner);
        }
    }

    public final void LIZIZ(C65103Pgp superGroup) {
        o.LJIIIZ(superGroup, "superGroup");
        ((ArrayList) this.LIZ).addAll(superGroup.LIZ);
        ((ArrayList) this.LIZIZ).addAll(superGroup.LIZIZ);
        ((ArrayList) this.LIZJ).addAll(superGroup.LIZJ);
        ((ArrayList) this.LIZLLL).addAll(superGroup.LIZLLL);
        ((ArrayList) this.LJ).addAll(superGroup.LJ);
    }
}
