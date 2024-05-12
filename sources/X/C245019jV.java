package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245019jV extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, C236019Ob, C76800UCe> {
    public static final C245019jV LJLIL = new C245019jV();

    public C245019jV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 receiver, C236019Ob c236019Ob) {
        o.LJIIIZ(receiver, "$receiver");
        List LJ = C2MW.LIZ().LJ(5);
        if (LJ != null && !LJ.isEmpty()) {
            C245039jX.LJI.getClass();
            Iterator LJ2 = C06540Nm.LJ((HashMap) C245039jX.LJFF.getValue(), "instanceMap.values");
            while (LJ2.hasNext()) {
                ((C245039jX) LJ2.next()).LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
