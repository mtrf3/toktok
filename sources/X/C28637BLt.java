package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.BLt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28637BLt<T> {
    public final java.util.Map<Class<T>, C28636BLs> LIZ = new ConcurrentHashMap();

    public final C28636BLs LIZ(Class<T> cls) {
        C28636BLs c28636BLs = (C28636BLs) ((ConcurrentHashMap) this.LIZ).get(cls);
        if (c28636BLs == null) {
            C28636BLs c28636BLs2 = new C28636BLs();
            ((ConcurrentHashMap) this.LIZ).put(cls, c28636BLs2);
            return c28636BLs2;
        }
        return c28636BLs;
    }

    public final void LIZIZ(O5Z o5z) {
        Class<?> cls = o5z.getClass();
        ArrayList arrayList = (ArrayList) LIZ(cls).LIZ;
        if (arrayList.size() < LIZ(cls).LIZIZ && !arrayList.contains(o5z)) {
            arrayList.add(o5z);
        }
    }
}
