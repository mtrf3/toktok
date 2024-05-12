package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.L9n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53799L9n {
    public static final HashMap<String, HashMap<String, Integer>> LIZ = new HashMap<>();
    public static final HashMap<String, HashMap<String, List<InterfaceC53800L9o>>> LIZIZ = new HashMap<>();

    public static int LIZ(String roomId, String str) {
        Integer num;
        o.LJIIIZ(roomId, "roomId");
        HashMap<String, Integer> hashMap = LIZ.get(roomId);
        if (hashMap == null || (num = hashMap.get(str)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public static void LIZJ(String str, String str2) {
        HashMap<String, Integer> hashMap = LIZ.get(str);
        if (hashMap != null) {
            hashMap.remove(str2);
        }
    }

    public static void LIZIZ(String str, String str2, InterfaceC53800L9o widgetStateChangeListener) {
        o.LJIIIZ(widgetStateChangeListener, "widgetStateChangeListener");
        HashMap<String, HashMap<String, List<InterfaceC53800L9o>>> hashMap = LIZIZ;
        HashMap<String, List<InterfaceC53800L9o>> hashMap2 = hashMap.get(str);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(str, hashMap2);
        }
        HashMap<String, List<InterfaceC53800L9o>> hashMap3 = hashMap2;
        List<InterfaceC53800L9o> list = hashMap3.get(str2);
        if (list == null) {
            list = new ArrayList<>();
            hashMap3.put(str2, list);
        }
        list.add(widgetStateChangeListener);
    }

    public static void LIZLLL(int i, String roomId, String str) {
        List<InterfaceC53800L9o> list;
        o.LJIIIZ(roomId, "roomId");
        HashMap<String, HashMap<String, Integer>> hashMap = LIZ;
        HashMap<String, Integer> hashMap2 = hashMap.get(roomId);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(roomId, hashMap2);
        }
        hashMap2.put(str, Integer.valueOf(i));
        HashMap<String, List<InterfaceC53800L9o>> hashMap3 = LIZIZ.get(roomId);
        if (hashMap3 != null && (list = hashMap3.get(str)) != null) {
            Iterator<InterfaceC53800L9o> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJ(i, str, roomId);
            }
        }
    }

    public static void LJ(String roomId, String str, InterfaceC53800L9o widgetStateChangeListener) {
        List<InterfaceC53800L9o> list;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(widgetStateChangeListener, "widgetStateChangeListener");
        HashMap<String, List<InterfaceC53800L9o>> hashMap = LIZIZ.get(roomId);
        if (hashMap != null && (list = hashMap.get(str)) != null) {
            list.remove(widgetStateChangeListener);
        }
    }
}
