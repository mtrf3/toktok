package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Plo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65412Plo {
    public static <T> ArrayList<T> LIZ(Gson gson, C65385PlN c65385PlN, Class<T> cls) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TypeAdapter<T> LJIIJ = gson.LJIIJ(cls);
        ArrayList<T> arrayList = new ArrayList<>();
        c65385PlN.LIZ();
        while (c65385PlN.LJIIJJI()) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
            } else {
                arrayList.add(LJIIJ.read(c65385PlN));
            }
        }
        c65385PlN.LJ();
        return arrayList;
    }

    public static <T> HashMap<String, T> LIZIZ(Gson gson, C65385PlN c65385PlN, Class<T> cls) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TypeAdapter<T> LJIIJ = gson.LJIIJ(cls);
        HashMap<String, T> hashMap = new HashMap<>();
        c65385PlN.LIZIZ();
        while (c65385PlN.LJIIJJI()) {
            String LJJ = c65385PlN.LJJ();
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
            } else {
                hashMap.put(LJJ, LJIIJ.read(c65385PlN));
            }
        }
        c65385PlN.LJFF();
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> HashMap<K, V> LIZJ(Gson gson, C65385PlN c65385PlN, Class<K> cls, Class<V> cls2) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TypeAdapter LJIIJ = gson.LJIIJ(cls);
        TypeAdapter LJIIJ2 = gson.LJIIJ(cls2);
        C64012fF c64012fF = (HashMap<K, V>) new HashMap();
        c65385PlN.LIZIZ();
        while (c65385PlN.LJIIJJI()) {
            Object read = LJIIJ.read(c65385PlN);
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
            } else {
                c64012fF.put(read, LJIIJ2.read(c65385PlN));
            }
        }
        c65385PlN.LJFF();
        return c64012fF;
    }

    public static <T> void LIZLLL(Gson gson, C65403Plf c65403Plf, List<T> list, Class<T> cls) {
        if (list == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        TypeAdapter LJIIJ = gson.LJIIJ(cls);
        c65403Plf.LIZIZ();
        for (T t : list) {
            if (t != null) {
                LJIIJ.write(c65403Plf, t);
            }
        }
        c65403Plf.LJ();
    }

    public static <K, V> void LJ(Gson gson, C65403Plf c65403Plf, java.util.Map<K, V> map, Class<V> cls) {
        if (map == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        TypeAdapter LJIIJ = gson.LJIIJ(cls);
        c65403Plf.LIZJ();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c65403Plf.LJI(String.valueOf(entry.getKey()));
            LJIIJ.write(c65403Plf, entry.getValue());
        }
        c65403Plf.LJFF();
    }
}
