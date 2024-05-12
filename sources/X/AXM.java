package X;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXM implements InterfaceC66286Pzu {
    public final ConcurrentHashMap<String, SoftReference<C2308994j>> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC66286Pzu
    public final boolean LIZ(String key) {
        SoftReference<C2308994j> softReference;
        o.LJIIIZ(key, "key");
        if (!this.LIZ.containsKey(key) || (softReference = this.LIZ.get(key)) == null || softReference.get() == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66286Pzu
    public final void clear(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.remove(key);
    }

    @Override // X.InterfaceC66286Pzu
    public final Object get(String key) {
        C2308994j c2308994j;
        o.LJIIIZ(key, "key");
        SoftReference<C2308994j> softReference = this.LIZ.get(key);
        if (softReference == null || (c2308994j = softReference.get()) == null) {
            return null;
        }
        return c2308994j.LIZ;
    }

    @Override // X.InterfaceC66286Pzu
    public final void LIZIZ(String key, Object obj) {
        o.LJIIIZ(key, "key");
        this.LIZ.put(key, new SoftReference<>(new C2308994j(obj)));
    }
}
