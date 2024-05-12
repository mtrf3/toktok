package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Tmd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75655Tmd extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75607Tlr>, C76800UCe> {
    public static final C75655Tmd LJLIL = new C75655Tmd();

    public C75655Tmd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB interfaceC75441TjB, C75732Tns<C75607Tlr> message) {
        o.LJIIIZ(interfaceC75441TjB, "<anonymous parameter 0>");
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive topic pair first frame message: ");
        LIZ.append(message);
        C0NB.LIZIZ("TopicPairManager", X1D.LIZIZ(LIZ));
        C75650TmY.LJII(EnumC75673Tmv.LINKING_SUCCESS);
        Iterator it = ((ArrayList) C75650TmY.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC75661Tmj) it.next()).LIZIZ(C75650TmY.LJIILIIL);
        }
        return C76800UCe.LIZ;
    }
}
