package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LqT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55509LqT {
    public static final C55509LqT LIZ = new C55509LqT();
    public static final List<InterfaceC55510LqU> LIZIZ = new ArrayList();
    public static final List<N08> LIZJ = new ArrayList();

    public final synchronized void LIZIZ(InterfaceC55510LqU interfaceC55510LqU) {
        if (interfaceC55510LqU != null) {
            List<InterfaceC55510LqU> list = LIZIZ;
            if (((ArrayList) list).contains(interfaceC55510LqU)) {
                ((ArrayList) list).remove(interfaceC55510LqU);
            }
        }
    }

    public final synchronized void LIZ(String tag, String label, String creativeId, JSONObject extJson) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        o.LJIIIZ(extJson, "extJson");
        List<InterfaceC55510LqU> list = LIZIZ;
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC55510LqU) it.next()).LIZ(tag, label, creativeId, extJson);
            } catch (Throwable unused) {
            }
        }
    }
}
