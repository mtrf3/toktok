package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Il8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47534Il8 {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<InterfaceC47535Il9> LIZIZ = new CopyOnWriteArrayList<>();

    public C47534Il8() {
        C47578Ilq.LIZ();
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZ.containsKey(str) && this.LIZ.get(str) != null && !this.LIZ.get(str).equals(obj)) {
            Iterator<InterfaceC47535Il9> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(obj, str);
            }
        } else if (!this.LIZ.containsKey(str)) {
            Iterator<InterfaceC47535Il9> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(obj, str);
            }
        } else {
            TTVideoEngineLog.d("PortraitEngine", "same label");
        }
        this.LIZ.put(str, obj);
    }
}
