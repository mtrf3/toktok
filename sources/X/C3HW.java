package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3HW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C3HW LJLIL = new C3HW();

    public C3HW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C84763XOl.LJI().LJJJJZI(new InterfaceC64592gB() { // from class: X.3VC
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    C34B.LIZIZ("GlobalActionExecutor", "invokeOnAppEnterForegroundActions");
                    C3Y2 c3y2 = new C3Y2("app_enter_foreground");
                    C3VM c3vm = C115114fT.LJI;
                    if (c3vm != null) {
                        c3vm.LIZIZ(c3y2, false);
                    }
                    List LIZJ = ((C169706lK) C115114fT.LJ.getValue()).LIZJ();
                    o.LJIIIIZZ(LIZJ, "enterForegroundActionList.immutableList");
                    Iterator it = LIZJ.iterator();
                    while (it.hasNext()) {
                        ((C3VL) it.next()).LJLIL.invoke();
                    }
                    C3VM c3vm2 = C115114fT.LJI;
                    if (c3vm2 == null) {
                        return;
                    }
                    c3vm2.LIZ(c3y2, C46B.LIZLLL);
                }
            }
        });
        return C76800UCe.LIZ;
    }
}
