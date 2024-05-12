package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIY {
    public final java.util.Map<Integer, CopyOnWriteArraySet<QJB>> LIZ = new ConcurrentHashMap();

    public final boolean LIZ(int i) {
        return !((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(i));
    }

    public final void LIZJ(int i, String str, JSONObject jSONObject) {
        if (LIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((QJB) it.next()).onEventV3(str, jSONObject);
        }
    }

    public final void LIZLLL(int i, String str, JSONObject jSONObject) {
        if (LIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((QJB) it.next()).LIZIZ();
        }
    }

    public final void LIZIZ(int i, String str, long j, String str2, String str3, long j2, String str4) {
        if (LIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((QJB) it.next()).LIZ(str, str2, str3, str4, j, j2);
        }
    }
}
