package X;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16560ku {
    public final Runnable LIZ;
    public final CopyOnWriteArrayList<InterfaceC16580kw> LIZIZ = new CopyOnWriteArrayList<>();
    public final java.util.Map<InterfaceC16580kw, C16550kt> LIZJ = new HashMap();

    public C16560ku(Runnable runnable) {
        this.LIZ = runnable;
    }

    public final void LIZ(InterfaceC16580kw interfaceC16580kw) {
        this.LIZIZ.remove(interfaceC16580kw);
        C16550kt c16550kt = (C16550kt) ((HashMap) this.LIZJ).remove(interfaceC16580kw);
        if (c16550kt != null) {
            c16550kt.LIZ.removeObserver(c16550kt.LIZIZ);
            c16550kt.LIZIZ = null;
        }
        this.LIZ.run();
    }
}
