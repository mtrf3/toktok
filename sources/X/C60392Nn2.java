package X;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nn2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60392Nn2 implements InterfaceC60324Nlw {
    public static volatile InterfaceC60324Nlw LIZIZ = new C60341NmD();
    public final ConcurrentHashMap<String, C60378Nmo> LIZ = new ConcurrentHashMap<>();

    public static C60393Nn3 LJIIJ(String sessionId) {
        String str;
        InterfaceC60397Nn7 interfaceC60397Nn7;
        o.LJIIJ(sessionId, "sessionId");
        C60394Nn4 c60394Nn4 = C60394Nn4.LIZIZ;
        c60394Nn4.getClass();
        SoftReference softReference = (SoftReference) ((LinkedHashMap) c60394Nn4.LIZ).get(sessionId);
        if (softReference == null || (interfaceC60397Nn7 = (InterfaceC60397Nn7) softReference.get()) == null) {
            if (sessionId.length() == 0) {
                str = (String) C60394Nn4.LIZJ.invoke();
            } else {
                str = sessionId;
            }
            SoftReference<InterfaceC60397Nn7> softReference2 = new SoftReference<>(new C60393Nn3(str));
            c60394Nn4.LIZ.put(sessionId, softReference2);
            interfaceC60397Nn7 = softReference2.get();
        }
        if (!(interfaceC60397Nn7 instanceof C60393Nn3)) {
            interfaceC60397Nn7 = null;
        }
        return (C60393Nn3) interfaceC60397Nn7;
    }

    @Override // X.InterfaceC60324Nlw
    public final <T extends InterfaceC60387Nmx> T LIZ(Class<T> cls) {
        return (T) LIZJ(cls, "default_bid");
    }

    @Override // X.InterfaceC60202Njy
    public final InterfaceC60311Nlj<String, Object> LIZIZ(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        C60393Nn3 LJIIJ = LJIIJ(sessionId);
        if (LJIIJ != null) {
            if (LJIIJ.LIZJ == null) {
                synchronized (LJIIJ) {
                    if (LJIIJ.LIZJ == null) {
                        LJIIJ.LIZJ = new C60400NnA();
                    }
                }
            }
            return LJIIJ.LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC60202Njy
    public final void LJFF(String sessionId) {
        InterfaceC60397Nn7 interfaceC60397Nn7;
        o.LJIIJ(sessionId, "sessionId");
        C60394Nn4 c60394Nn4 = C60394Nn4.LIZIZ;
        c60394Nn4.getClass();
        if (sessionId.length() == 0) {
            Iterator it = ((LinkedHashMap) c60394Nn4.LIZ).values().iterator();
            while (it.hasNext()) {
                InterfaceC60397Nn7 interfaceC60397Nn72 = (InterfaceC60397Nn7) ((SoftReference) it.next()).get();
                if (interfaceC60397Nn72 != null) {
                    interfaceC60397Nn72.release();
                }
            }
            ((LinkedHashMap) c60394Nn4.LIZ).clear();
            return;
        }
        SoftReference softReference = (SoftReference) ((LinkedHashMap) c60394Nn4.LIZ).get(sessionId);
        if (softReference != null && (interfaceC60397Nn7 = (InterfaceC60397Nn7) softReference.get()) != null) {
            interfaceC60397Nn7.release();
        }
        c60394Nn4.LIZ.remove(sessionId);
    }

    @Override // X.InterfaceC60324Nlw
    public final InterfaceC60324Nlw LJI(C60378Nmo c60378Nmo) {
        LJIIIIZZ("default_bid", c60378Nmo);
        return this;
    }

    @Override // X.InterfaceC60202Njy
    public final InterfaceC60311Nlj<String, Object> LJII(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        C60393Nn3 LJIIJ = LJIIJ(sessionId);
        if (LJIIJ != null) {
            if (LJIIJ.LIZLLL == null) {
                synchronized (LJIIJ) {
                    if (LJIIJ.LIZLLL == null) {
                        LJIIJ.LIZLLL = new C60400NnA();
                    }
                }
            }
            return LJIIJ.LIZLLL;
        }
        return null;
    }

    @Override // X.InterfaceC60324Nlw
    public final InterfaceC60387Nmx LIZJ(Class cls, String bid) {
        o.LJIIJ(bid, "bid");
        C60378Nmo LIZ = C60373Nmj.LIZ(bid, this.LIZ);
        InterfaceC60387Nmx interfaceC60387Nmx = LIZ.LIZ.get(cls.getName());
        if (interfaceC60387Nmx != null) {
            return interfaceC60387Nmx;
        }
        C60378Nmo LIZ2 = C60373Nmj.LIZ("default_bid", this.LIZ);
        InterfaceC60387Nmx interfaceC60387Nmx2 = LIZ2.LIZ.get(cls.getName());
        if (interfaceC60387Nmx2 instanceof InterfaceC60387Nmx) {
            return interfaceC60387Nmx2;
        }
        return null;
    }

    @Override // X.InterfaceC60324Nlw
    public final InterfaceC60324Nlw LIZLLL(Class cls, C37003Eff c37003Eff) {
        LJIIIZ(cls, c37003Eff);
        return this;
    }

    @Override // X.InterfaceC60202Njy
    public final void LJ(Context context, String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        C60393Nn3 LJIIJ = LJIIJ(sessionId);
        if (LJIIJ == null || LJIIJ.LIZIZ != null) {
            return;
        }
        LJIIJ.LIZIZ = context;
    }

    @Override // X.InterfaceC60324Nlw
    public final InterfaceC60324Nlw LJIIIIZZ(String bid, C60378Nmo c60378Nmo) {
        o.LJIIJ(bid, "bid");
        C60378Nmo LIZ = C60373Nmj.LIZ(bid, this.LIZ);
        for (Map.Entry<String, InterfaceC60387Nmx> entry : c60378Nmo.LIZ.entrySet()) {
            LIZ.LIZ(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final InterfaceC60324Nlw LJIIIZ(Class cls, C37003Eff c37003Eff) {
        C60373Nmj.LIZ("default_bid", this.LIZ).LIZ(cls.getName(), c37003Eff);
        return this;
    }
}
