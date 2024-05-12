package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.U5c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76616U5c {
    public static final C76616U5c LIZ = new C76616U5c();
    public static final HashMap<String, InterfaceC74805TXl> LIZIZ = new HashMap<>();

    public final synchronized <T extends InterfaceC74805TXl> T LIZ(String key) {
        T t;
        InterfaceC74805TXl interfaceC74805TXl;
        o.LJIIIZ(key, "key");
        try {
            interfaceC74805TXl = LIZIZ.get(key);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ServiceManager getService error: ");
            LIZ2.append(th);
            U4R.LIZIZ("LinkMicService", X1D.LIZIZ(LIZ2));
        }
        if (interfaceC74805TXl instanceof InterfaceC74805TXl) {
            t = (T) interfaceC74805TXl;
        }
        t = null;
        return t;
    }

    public final synchronized void LIZIZ(String str, C76614U5a c76614U5a) {
        LIZIZ.put(str, c76614U5a);
    }
}
