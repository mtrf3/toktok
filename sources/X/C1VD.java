package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1VD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VD implements InterfaceC121064p4 {
    public static final C1VD LIZ = new C1VD();
    public static final Collection<InterfaceC17120lo> LIZIZ = Collections.synchronizedCollection(new ArrayList());
    public static boolean LIZJ;

    public final void LIZIZ(InterfaceC17120lo interfaceC17120lo) {
        try {
            Collection<InterfaceC17120lo> collection = LIZIZ;
            if (!collection.contains(interfaceC17120lo)) {
                collection.add(interfaceC17120lo);
            }
            if (!collection.isEmpty()) {
                synchronized (this) {
                    if (!LIZJ) {
                        BZJ.LIZ.getClass();
                        BU1.LIZIZ.add(this);
                        LIZJ = true;
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC121064p4
    public final void LIZ(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        try {
            Collection<InterfaceC17120lo> eventTrigger = LIZIZ;
            o.LJIIIIZZ(eventTrigger, "eventTrigger");
            Iterator<InterfaceC17120lo> it = eventTrigger.iterator();
            while (it.hasNext()) {
                it.next().onEvent(eventName);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
