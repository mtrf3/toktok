package X;

import com.ss.ttm.player.TraitObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.IgS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47244IgS {
    public final java.util.Map<Integer, TraitObject> LIZ = new HashMap();

    public final void LIZ() {
        if (((HashMap) this.LIZ).size() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.LIZ);
            ((HashMap) this.LIZ).clear();
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((TraitObject) ((Map.Entry) it.next()).getValue()).LIZ();
        }
    }
}
