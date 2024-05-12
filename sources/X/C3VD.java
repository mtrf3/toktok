package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3VD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VD extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C3VD LJLIL = new C3VD();

    public C3VD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C34B.LIZIZ("GlobalActionExecutor", "invokeOnColdStartActions");
        C3Y2 c3y2 = new C3Y2("cold_start");
        C3VM c3vm = C115114fT.LJI;
        if (c3vm != null) {
            c3vm.LIZIZ(c3y2, false);
        }
        List LIZJ = ((C169706lK) C115114fT.LIZ.getValue()).LIZJ();
        o.LJIIIIZZ(LIZJ, "coldStartActionList.immutableList");
        Iterator it = LIZJ.iterator();
        while (it.hasNext()) {
            ((C3VL) it.next()).LJLIL.invoke();
        }
        C3VM c3vm2 = C115114fT.LJI;
        if (c3vm2 != null) {
            c3vm2.LIZ(c3y2, C46B.LIZLLL);
        }
        return C76800UCe.LIZ;
    }
}
