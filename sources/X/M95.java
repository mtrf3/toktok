package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class M95 {
    public final L71[] LIZ;
    public final java.util.Map<Class<? extends Object>, Object> LIZIZ;

    public M95(L71... paramProviders) {
        o.LJIIIZ(paramProviders, "paramProviders");
        this.LIZ = paramProviders;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (L71 l71 : paramProviders) {
            linkedHashMap.putAll(l71.LJFF());
        }
        this.LIZIZ = linkedHashMap;
    }

    public <T> T LIZ(Class<T> cls) {
        T t = (T) ((LinkedHashMap) this.LIZIZ).get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }
}
