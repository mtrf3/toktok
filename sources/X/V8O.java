package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public final class V8O {
    public static final V8N LJ = new V8N();
    public static final AtomicInteger LJFF = new AtomicInteger(0);
    public final V8O LIZ;
    public final String LIZIZ;
    public final java.util.Map<String, V8O> LIZJ = new HashMap();
    public final java.util.Map<Object, Object> LIZLLL = new HashMap();

    public final <T> T LIZ(Object obj) {
        T t = (T) ((HashMap) this.LIZLLL).get(obj);
        if (t != null) {
            return t;
        }
        V8O v8o = this.LIZ;
        if (v8o != null) {
            return (T) v8o.LIZ(obj);
        }
        return null;
    }

    public V8O(V8O v8o, String str) {
        this.LIZ = v8o;
        this.LIZIZ = str;
    }
}
