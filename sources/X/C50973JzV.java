package X;

import java.lang.ref.Reference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JzV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50973JzV {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C50974JzW.LJLIL);
    public int LIZIZ;

    public final void LIZ(Object event) {
        o.LJIIIZ(event, "event");
        for (Reference reference : (List) this.LIZ.getValue()) {
            InterfaceC50976JzY interfaceC50976JzY = (InterfaceC50976JzY) reference.get();
            if (interfaceC50976JzY == null) {
                ((List) this.LIZ.getValue()).remove(reference);
            } else if (o.LJ(interfaceC50976JzY.LIZ(), event.getClass())) {
                interfaceC50976JzY.LIZIZ();
            }
        }
    }
}
