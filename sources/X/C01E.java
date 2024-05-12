package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.01E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01E {
    public final java.util.Map LIZ = new ConcurrentHashMap();

    public final C01D LIZ(Class cls) {
        Object obj = ((ConcurrentHashMap) this.LIZ).get(cls);
        if (obj instanceof C01D) {
            return (C01D) obj;
        }
        return null;
    }

    public final void LIZIZ(Class cls, C01D instance, boolean z) {
        o.LJIIIZ(instance, "instance");
        if (((ConcurrentHashMap) this.LIZ).containsKey(cls) && !z) {
            return;
        }
        ((ConcurrentHashMap) this.LIZ).put(cls, instance);
    }
}
