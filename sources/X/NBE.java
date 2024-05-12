package X;

import android.util.LruCache;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBE {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(LruCache lruCache, Object obj, InterfaceC65784Pro defaultValue) {
        o.LJIIIZ(lruCache, "<this>");
        o.LJIIIZ(defaultValue, "defaultValue");
        Object obj2 = lruCache.get(obj);
        if (obj2 == null) {
            Object invoke = defaultValue.invoke();
            lruCache.put(obj, invoke);
            return invoke;
        }
        return obj2;
    }
}
