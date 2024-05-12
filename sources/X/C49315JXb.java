package X;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JXb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49315JXb {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C49317JXd.LJLIL);
    public int LIZIZ;

    public final List<WeakReference<InterfaceC49318JXe<?>>> LIZJ() {
        return (List) this.LIZ.getValue();
    }

    public final void LIZ(InterfaceC49318JXe<?> eventListener) {
        o.LJIIIZ(eventListener, "eventListener");
        LIZJ().add(new WeakReference<>(eventListener));
    }

    public final void LIZIZ(Object event) {
        o.LJIIIZ(event, "event");
        for (WeakReference<InterfaceC49318JXe<?>> weakReference : LIZJ()) {
            InterfaceC49318JXe<?> interfaceC49318JXe = weakReference.get();
            if (interfaceC49318JXe == null) {
                LIZJ().remove(weakReference);
            } else if (o.LJ(interfaceC49318JXe.LIZ(), event.getClass())) {
                interfaceC49318JXe.LIZIZ(event);
            }
        }
    }
}
