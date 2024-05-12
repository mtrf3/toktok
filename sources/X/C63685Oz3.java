package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.squareup.wire.ProtoAdapter;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oz3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63685Oz3 {
    public static ORT LJIIIIZZ() {
        return new ORT(Collections.emptyList());
    }

    public static void LIZ(List<?> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(list, i) == null) {
                    throw new NullPointerException(C0NY.LIZIZ("Element at index ", i, " is null"));
                }
            }
            return;
        }
        throw new NullPointerException("list == null");
    }

    public static void LIZIZ(java.util.Map<?, ?> map) {
        if (map != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    if (entry.getValue() == null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Value for key ");
                        LIZ.append(entry.getKey());
                        LIZ.append(" is null");
                        throw new NullPointerException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    throw new NullPointerException("map.containsKey(null)");
                }
            }
            return;
        }
        throw new NullPointerException("map == null");
    }

    public static void LJII(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Required field");
        LIZ.append(str);
        LIZ.append(" not set:");
        LIZ.append((Object) sb);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public static <T> List<T> LIZJ(String str, List<T> list) {
        if (list != null) {
            if (list == Collections.emptyList() || (list instanceof ORU)) {
                return new ORT(list);
            }
            return new ArrayList(list);
        }
        throw new NullPointerException(i0.LJFF(str, " == null"));
    }

    public static <K, V> java.util.Map<K, V> LIZLLL(String str, java.util.Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        throw new NullPointerException(i0.LJFF(str, " == null"));
    }

    public static boolean LJ(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static <T> List<T> LJFF(String str, List<T> list) {
        if (list != null) {
            if (list instanceof ORT) {
                list = ((ORT) list).LJLILLLLZI;
            }
            if (list == Collections.emptyList() || (list instanceof ORU)) {
                return list;
            }
            ORU oru = new ORU(list);
            if (!oru.contains(null)) {
                return oru;
            }
            throw new IllegalArgumentException(i0.LJFF(str, ".contains(null)"));
        }
        throw new NullPointerException(i0.LJFF(str, " == null"));
    }

    public static <K, V> java.util.Map<K, V> LJI(String str, java.util.Map<K, V> map) {
        if (map != null) {
            if (map.isEmpty()) {
                return Collections.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (!linkedHashMap.containsKey(null)) {
                if (!linkedHashMap.containsValue(null)) {
                    return Collections.unmodifiableMap(linkedHashMap);
                }
                throw new IllegalArgumentException(i0.LJFF(str, ".containsValue(null)"));
            }
            throw new IllegalArgumentException(i0.LJFF(str, ".containsKey(null)"));
        }
        throw new NullPointerException(i0.LJFF(str, " == null"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LJIIIZ(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ListProtector.set(list, i, protoAdapter.redact(ListProtector.get(list, i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LJIIJ(java.util.Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }
}
