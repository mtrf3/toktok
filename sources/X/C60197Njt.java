package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Njt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60197Njt implements InterfaceC60201Njx {
    public final java.util.Map<Class<? extends InterfaceC60250Nkk<?, ?, ?, ?>>, InterfaceC40516FvE> LJLIL = new LinkedHashMap();

    @Override // X.InterfaceC37788EsK
    public final void release() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC40516FvE) ((Map.Entry) it.next()).getValue()).be(null);
        }
        linkedHashMap.clear();
    }

    @Override // X.InterfaceC60205Nk1
    public final <T extends InterfaceC60250Nkk<?, ?, ?, ?>> InterfaceC40516FvE Lk(Class<? extends T> cls) {
        return (InterfaceC40516FvE) ((LinkedHashMap) this.LJLIL).get(cls);
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL).entrySet()) {
            if (o.LJ(((InterfaceC40516FvE) entry.getValue()).LLLLLLJ().LJLIL, sessionId)) {
                return (InterfaceC40516FvE) entry.getValue();
            }
        }
        return null;
    }

    @Override // X.InterfaceC60201Njx
    public final <T extends InterfaceC60250Nkk<?, ?, ?, ?>> void R1(Class<? extends T> cls, InterfaceC40516FvE interfaceC40516FvE) {
        this.LJLIL.put(cls, interfaceC40516FvE);
    }
}
