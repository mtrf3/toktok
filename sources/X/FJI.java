package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FJI {
    public static final HashMap<String, FTR<?>> LIZ = new HashMap<>();
    public static final HashMap<String, HashMap<String, FTR<?>>> LIZIZ = new HashMap<>();

    public static final void LIZIZ(FJJ fjj) {
        HashMap<String, FTR<?>> hashMap = LIZ;
        synchronized (hashMap) {
            hashMap.put(fjj.LIZ, fjj);
        }
    }

    public static final FTR<?> LIZ(String str, String name) {
        o.LJIIJ(name, "name");
        if (str == null) {
            LIZ.get(name);
        }
        HashMap<String, FTR<?>> hashMap = LIZIZ.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap.containsKey(name)) {
            return hashMap.get(name);
        }
        return LIZ.get(name);
    }

    public static final void LIZJ(String str, FJJ fjj) {
        if (str == null) {
            LIZIZ(fjj);
            return;
        }
        HashMap<String, HashMap<String, FTR<?>>> hashMap = LIZIZ;
        synchronized (hashMap) {
            HashMap<String, FTR<?>> hashMap2 = hashMap.get(str);
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            synchronized (hashMap2) {
                hashMap2.put(fjj.LIZ, fjj);
            }
            hashMap.put(str, hashMap2);
        }
    }
}
