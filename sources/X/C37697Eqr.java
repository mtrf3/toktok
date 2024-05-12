package X;

import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Eqr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37697Eqr {
    public static final JavaOnlyArray LIZ(g toJavaOnlyArray) {
        o.LJIIJ(toJavaOnlyArray, "$this$toJavaOnlyArray");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        Iterator<j> it = toJavaOnlyArray.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next instanceof l) {
                javaOnlyArray.add(null);
            } else if (next instanceof m) {
                javaOnlyArray.add(LIZIZ((m) next));
            } else if (next instanceof g) {
                javaOnlyArray.add(LIZ((g) next));
            } else if (next instanceof p) {
                p pVar = (p) next;
                Object obj = pVar.LJLIL;
                if (obj instanceof Boolean) {
                    javaOnlyArray.add(Boolean.valueOf(pVar.LJFF()));
                } else if (obj instanceof String) {
                    javaOnlyArray.add(pVar.LJJIFFI());
                } else if (obj instanceof Number) {
                    if (s.LJJJZ(pVar.LJIL().toString(), '.')) {
                        javaOnlyArray.add(Double.valueOf(pVar.LJIL().doubleValue()));
                    } else {
                        javaOnlyArray.add(Long.valueOf(pVar.LJIL().longValue()));
                    }
                }
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZIZ(m toJavaOnlyMap) {
        o.LJIIJ(toJavaOnlyMap, "$this$toJavaOnlyMap");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        java.util.Set<String> LJJIZ = toJavaOnlyMap.LJJIZ();
        o.LJFF(LJJIZ, "keySet()");
        for (String str : LJJIZ) {
            j LJJIJ = toJavaOnlyMap.LJJIJ(str);
            if (LJJIJ instanceof l) {
                javaOnlyMap.put(str, null);
            } else if (LJJIJ instanceof m) {
                javaOnlyMap.put(str, LIZIZ((m) LJJIJ));
            } else if (LJJIJ instanceof g) {
                javaOnlyMap.put(str, LIZ((g) LJJIJ));
            } else if (LJJIJ instanceof p) {
                p pVar = (p) LJJIJ;
                Object obj = pVar.LJLIL;
                if (obj instanceof Boolean) {
                    javaOnlyMap.put(str, Boolean.valueOf(pVar.LJFF()));
                } else if (obj instanceof String) {
                    javaOnlyMap.put(str, pVar.LJJIFFI());
                } else if (obj instanceof Number) {
                    if (s.LJJJZ(pVar.LJIL().toString(), '.')) {
                        javaOnlyMap.put(str, Double.valueOf(pVar.LJIL().doubleValue()));
                    } else {
                        javaOnlyMap.put(str, Long.valueOf(pVar.LJIL().longValue()));
                    }
                }
            }
        }
        return javaOnlyMap;
    }

    public static final g LIZJ(ReadableArray readableArray) {
        j pVar;
        g gVar = new g();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type != null) {
                switch (C37704Eqy.LIZIZ[type.ordinal()]) {
                    case 1:
                        gVar.LJJII(l.LJLIL);
                        break;
                    case 2:
                        Boolean valueOf = Boolean.valueOf(readableArray.getBoolean(i));
                        List<j> list = gVar.LJLIL;
                        if (valueOf == null) {
                            pVar = l.LJLIL;
                        } else {
                            pVar = new p(valueOf);
                        }
                        ((ArrayList) list).add(pVar);
                        break;
                    case 3:
                        gVar.LJJIII(Integer.valueOf(readableArray.getInt(i)));
                        break;
                    case 4:
                        gVar.LJJIII(Long.valueOf(readableArray.getLong(i)));
                        break;
                    case 5:
                        gVar.LJJIII(Double.valueOf(readableArray.getDouble(i)));
                        break;
                    case 6:
                        gVar.LJJIIJ(readableArray.getString(i));
                        break;
                    case 7:
                        ReadableMap map = readableArray.getMap(i);
                        o.LJFF(map, "getMap(index)");
                        gVar.LJJII(LIZLLL(map));
                        break;
                    case 8:
                        ReadableArray array = readableArray.getArray(i);
                        o.LJFF(array, "getArray(index)");
                        gVar.LJJII(LIZJ(array));
                        break;
                }
            }
        }
        return gVar;
    }

    public static final m LIZLLL(ReadableMap toJson) {
        o.LJIIJ(toJson, "$this$toJson");
        m mVar = new m();
        C37698Eqs c37698Eqs = new C37698Eqs(mVar, toJson);
        ReadableMapKeySetIterator keySetIterator = toJson.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey != null && !ujb.o.LJJJJJL(nextKey)) {
                c37698Eqs.invoke(nextKey);
            }
        }
        return mVar;
    }
}
