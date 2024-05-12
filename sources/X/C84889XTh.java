package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XTh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84889XTh {
    public static String LIZ;
    public static final HashMap<String, C84891XTj> LIZIZ = new HashMap<>();

    public static Object LIZ(long j, String key) {
        o.LJIIIZ(key, "key");
        if (LIZ == null) {
            return null;
        }
        HashMap<String, C84891XTj> hashMap = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(key);
        LIZ2.append(LIZ);
        C84891XTj c84891XTj = hashMap.get(X1D.LIZIZ(LIZ2));
        if (c84891XTj == null) {
            return null;
        }
        if (System.currentTimeMillis() - c84891XTj.LJLIL > j) {
            hashMap.clear();
            LIZ = null;
            return null;
        }
        return c84891XTj.LJLILLLLZI;
    }

    public static void LIZIZ(Object obj, String key) {
        HashMap<String, C84891XTj> hashMap;
        o.LJIIIZ(key, "key");
        if (LIZ != null && (hashMap = LIZIZ) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(key);
            LIZ2.append(LIZ);
            hashMap.put(X1D.LIZIZ(LIZ2), new C84891XTj(System.currentTimeMillis(), obj));
        }
    }
}
