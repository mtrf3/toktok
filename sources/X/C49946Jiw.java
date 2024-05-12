package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jiw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49946Jiw {
    public static boolean LIZIZ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Character) && !(obj instanceof Byte)) {
            return false;
        }
        return true;
    }

    public static void LIZ(Object obj, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        String str = chunkPatch.LIZJ;
        if ((obj instanceof List) && (chunkPatch.value instanceof java.util.Map)) {
            String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), chunkPatch.value);
            int parseInt = CastIntegerProtector.parseInt(str);
            List list = (List) obj;
            if (list.size() > 0) {
                ListProtector.add(list, parseInt, GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), json, (Class) ListProtector.get(list, 0).getClass()));
                return;
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            ((java.util.Map) obj).put(str, chunkPatch.value);
            return;
        }
        Field LIZIZ = C49947Jix.LIZIZ(str, obj, chunkPatch.LIZLLL);
        if (LIZIZ == null) {
            return;
        }
        Object obj2 = chunkPatch.value;
        if (obj2 instanceof Double) {
            C65348Pkm.LIZJ(obj, LIZIZ, obj2);
        } else {
            C65348Pkm.LIZLLL(obj, LIZIZ, obj2);
        }
    }

    public static void LIZJ(List list, java.util.Map map) {
        if (map != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() == 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ChunkPatch chunkPatch = (ChunkPatch) it.next();
                if (!TextUtils.isEmpty(chunkPatch.path)) {
                    ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(chunkPatch.path.trim().split("/")));
                    if (arrayList2.size() != 0) {
                        chunkPatch.LIZIZ = arrayList2;
                        chunkPatch.LIZ = map;
                        Object LIZJ = C49947Jix.LIZJ(map, chunkPatch);
                        if (LIZJ != null && arrayList2.size() == 1) {
                            String str = (String) ListProtector.get(arrayList2, 0);
                            o.LJIIIZ(str, "<set-?>");
                            chunkPatch.LIZJ = str;
                            String str2 = chunkPatch.op;
                            str2.getClass();
                            switch (str2.hashCode()) {
                                case -934610812:
                                    if (str2.equals("remove")) {
                                        if (LIZJ instanceof ArrayList) {
                                            ListProtector.remove((ArrayList) LIZJ, CastIntegerProtector.parseInt(str));
                                            break;
                                        } else if (LIZJ instanceof java.util.Map) {
                                            java.util.Map map2 = (java.util.Map) LIZJ;
                                            Object obj = map2.get(str);
                                            if (LIZIZ(LIZJ)) {
                                                map2.put(str, 0);
                                                break;
                                            } else if (obj instanceof Boolean) {
                                                map2.put(str, Boolean.FALSE);
                                                break;
                                            } else {
                                                map2.put(str, null);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 96417:
                                    if (str2.equals("add")) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case 106438728:
                                    if (str2.equals("patch")) {
                                        if (LIZJ instanceof java.util.Map) {
                                            java.util.Map map3 = (java.util.Map) LIZJ;
                                            Object obj2 = map3.get(str);
                                            ArrayList arrayList3 = new ArrayList();
                                            if (chunkPatch.value instanceof ArrayList) {
                                                for (int i = 0; i < ((ArrayList) chunkPatch.value).size(); i++) {
                                                    arrayList3.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), ListProtector.get((ArrayList) chunkPatch.value, i)), ChunkPatch.class));
                                                }
                                                if (obj2 instanceof String) {
                                                    java.util.Map map4 = (java.util.Map) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), (String) obj2, java.util.Map.class);
                                                    LIZJ(arrayList3, map4);
                                                    map3.put(str, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), map4));
                                                    break;
                                                } else if (obj2 instanceof java.util.Map) {
                                                    LIZJ(arrayList3, (java.util.Map) obj2);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 1093755131:
                                    if (str2.equals("reorder")) {
                                        if (LIZJ instanceof java.util.Map) {
                                            java.util.Map map5 = (java.util.Map) LIZJ;
                                            Object obj3 = map5.get(str);
                                            if (obj3 instanceof ArrayList) {
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it2 = ((ArrayList) chunkPatch.value).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add(ListProtector.get((ArrayList) obj3, ((Double) it2.next()).intValue()));
                                                }
                                                map5.put(str, arrayList4);
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 1094496948:
                                    if (str2.equals("replace")) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            if (LIZJ instanceof ArrayList) {
                                ListProtector.set((ArrayList) LIZJ, CastIntegerProtector.parseInt(str), chunkPatch.value);
                            } else if (LIZJ instanceof java.util.Map) {
                                ((java.util.Map) LIZJ).put(str, chunkPatch.value);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(Object obj, ChunkPatch chunkPatch) {
        if (chunkPatch.LIZJ.equals("")) {
            return;
        }
        int i = 0;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            Object obj2 = map.get(chunkPatch.LIZJ);
            ArrayList arrayList = new ArrayList();
            if (chunkPatch.value instanceof ArrayList) {
                while (i < ((ArrayList) chunkPatch.value).size()) {
                    arrayList.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), ListProtector.get((ArrayList) chunkPatch.value, i)), ChunkPatch.class));
                    i++;
                }
                if (obj2 instanceof String) {
                    java.util.Map map2 = (java.util.Map) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), (String) obj2, java.util.Map.class);
                    LIZJ(arrayList, map2);
                    map.put(chunkPatch.LIZJ, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), map2));
                    return;
                }
                if (!(obj2 instanceof java.util.Map)) {
                    return;
                }
                LIZJ(arrayList, (java.util.Map) obj2);
                return;
            }
            return;
        }
        Field LIZIZ = C49947Jix.LIZIZ(chunkPatch.LIZJ, obj, chunkPatch.LIZLLL);
        if (LIZIZ == null) {
            return;
        }
        Object obj3 = LIZIZ.get(obj);
        ArrayList arrayList2 = new ArrayList();
        if (obj3 instanceof String) {
            java.util.Map map3 = (java.util.Map) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), (String) obj3, java.util.Map.class);
            if (chunkPatch.value instanceof ArrayList) {
                while (i < ((ArrayList) chunkPatch.value).size()) {
                    arrayList2.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), ListProtector.get((ArrayList) chunkPatch.value, i)), ChunkPatch.class));
                    i++;
                }
                LIZJ(arrayList2, map3);
                try {
                    LIZIZ.set(obj, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), map3));
                    return;
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
        C49945Jiv.LIZJ.LIZ(obj3, arrayList2);
    }

    public static void LJ(Object obj, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        String str = chunkPatch.LIZJ;
        if (obj instanceof List) {
            ListProtector.remove((List) obj, CastIntegerProtector.parseInt(str));
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            Object obj2 = map.get(str);
            if (LIZIZ(obj)) {
                map.put(str, 0);
                return;
            } else if (obj2 instanceof Boolean) {
                map.put(str, Boolean.FALSE);
                return;
            } else {
                map.put(str, null);
                return;
            }
        }
        Field LIZIZ = C49947Jix.LIZIZ(str, obj, chunkPatch.LIZLLL);
        if (LIZIZ == null) {
            return;
        }
        if (LIZIZ(LIZIZ.get(obj))) {
            LIZIZ.set(obj, 0);
        } else if (LIZIZ.get(obj) instanceof Boolean) {
            LIZIZ.set(obj, Boolean.FALSE);
        } else {
            LIZIZ.set(obj, null);
        }
    }

    public static void LJFF(Object obj, ChunkPatch chunkPatch) {
        if (chunkPatch.LIZJ.equals("")) {
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            Object obj2 = map.get(chunkPatch.LIZJ);
            if (obj2 instanceof ArrayList) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) chunkPatch.value).iterator();
                while (it.hasNext()) {
                    arrayList.add(ListProtector.get((ArrayList) obj2, ((Double) it.next()).intValue()));
                }
                map.put(chunkPatch.LIZJ, arrayList);
                return;
            }
        }
        Field LIZIZ = C49947Jix.LIZIZ(chunkPatch.LIZJ, obj, chunkPatch.LIZLLL);
        if (LIZIZ == null) {
            return;
        }
        Object obj3 = LIZIZ.get(obj);
        if (obj3 instanceof LinkedList) {
            LinkedList linkedList = new LinkedList();
            Iterator it2 = ((ArrayList) chunkPatch.value).iterator();
            while (it2.hasNext()) {
                linkedList.add(((LinkedList) obj3).get(((Double) it2.next()).intValue()));
            }
            LIZIZ.set(obj, linkedList);
            return;
        }
        if (!(obj3 instanceof ArrayList)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) chunkPatch.value).iterator();
        while (it3.hasNext()) {
            arrayList2.add(ListProtector.get((ArrayList) obj3, ((Double) it3.next()).intValue()));
        }
        LIZIZ.set(obj, arrayList2);
    }

    public static void LJI(Object obj, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        String str = chunkPatch.LIZJ;
        if (obj instanceof List) {
            if (chunkPatch.value instanceof java.util.Map) {
                List list = (List) obj;
                ListProtector.set(list, CastIntegerProtector.parseInt(str), GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), chunkPatch.value), (Class) ListProtector.get(list, CastIntegerProtector.parseInt(str)).getClass()));
                return;
            }
            ListProtector.set((List) obj, CastIntegerProtector.parseInt(str), chunkPatch.value);
            return;
        }
        if (obj instanceof java.util.Map) {
            ((java.util.Map) obj).put(str, chunkPatch.value);
            return;
        }
        Field LIZIZ = C49947Jix.LIZIZ(str, obj, chunkPatch.LIZLLL);
        if (LIZIZ == null) {
            return;
        }
        Object obj2 = chunkPatch.value;
        if (obj2 instanceof Double) {
            C65348Pkm.LIZJ(obj, LIZIZ, obj2);
        } else {
            C65348Pkm.LIZLLL(obj, LIZIZ, obj2);
        }
    }
}
