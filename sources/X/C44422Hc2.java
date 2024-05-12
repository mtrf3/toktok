package X;

import android.util.SparseArray;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hc2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44422Hc2 {
    public static final SparseArray<HashMap<String, Object>> LIZ = new SparseArray<>();

    public static void LIZIZ() {
        HashMap<String, Object> hashMap = LIZ.get(1);
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static void LIZJ() {
        HashMap<String, Object> hashMap = LIZ.get(1);
        if (hashMap != null) {
            hashMap.remove("extracting_frame");
        }
    }

    public static void LIZ(String str, Object obj) {
        SparseArray<HashMap<String, Object>> sparseArray = LIZ;
        if (sparseArray.get(1) == null) {
            sparseArray.put(1, new HashMap<>());
        }
        HashMap<String, Object> hashMap = sparseArray.get(1);
        o.LJIIIIZZ(hashMap, "INFO_MAP[type]");
        hashMap.put(str, obj);
    }
}
