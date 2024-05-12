package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Er9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37715Er9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(m mVar) {
        String LJJIFFI;
        j LJJIJ;
        j LJJIJ2;
        j LJJIJ3;
        j LJJIJ4;
        j LJJIJ5;
        j LJJIJ6;
        j LJJIJ7;
        j LJJIJ8;
        j LJJIJ9 = mVar.LJJIJ("TYPE");
        HashMap hashMap = null;
        ArrayList arrayList = null;
        if (LJJIJ9 == null || (LJJIFFI = LJJIJ9.LJJIFFI()) == null) {
            return null;
        }
        switch (LJJIFFI.hashCode()) {
            case -1808118735:
                if (!LJJIFFI.equals("String") || (LJJIJ = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return LJJIJ.LJJIFFI();
            case 73679:
                if (!LJJIFFI.equals("Int") || (LJJIJ2 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Integer.valueOf(LJJIJ2.LJIILJJIL());
            case 77116:
                if (!LJJIFFI.equals("Map")) {
                    return null;
                }
                j LJJIJ10 = mVar.LJJIJ("VALUE");
                if (LJJIJ10 != null) {
                    m LJIIZILJ = LJJIJ10.LJIIZILJ();
                    hashMap = new HashMap();
                    java.util.Set<Map.Entry<String, j>> entrySet = LJIIZILJ.entrySet();
                    o.LJFF(entrySet, "jsonObject.entrySet()");
                    for (Map.Entry<String, j> entry : entrySet) {
                        j value = entry.getValue();
                        if (value != null) {
                            Object LIZ2 = LIZ((m) value);
                            if (LIZ2 != null) {
                                String key = entry.getKey();
                                o.LJFF(key, "it.key");
                                hashMap.put(key, LIZ2);
                            }
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.google.gson.JsonObject");
                        }
                    }
                }
                return hashMap;
            case 2086184:
                if (!LJJIFFI.equals("Byte") || (LJJIJ3 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Byte.valueOf(LJJIJ3.LJII());
            case 2099062:
                if (!LJJIFFI.equals("Char") || (LJJIJ4 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Character.valueOf(LJJIJ4.LJIIIIZZ());
            case 2374300:
                if (!LJJIFFI.equals("Long") || (LJJIJ5 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Long.valueOf(LJJIJ5.LJIJJLI());
            case 63537721:
                if (!LJJIFFI.equals("Array")) {
                    return null;
                }
                j LJJIJ11 = mVar.LJJIJ("VALUE");
                if (LJJIJ11 != null) {
                    g LJIILLIIL = LJJIJ11.LJIILLIIL();
                    arrayList = new ArrayList();
                    Iterator<j> it = LJIILLIIL.iterator();
                    while (it.hasNext()) {
                        j next = it.next();
                        if (next != null) {
                            arrayList.add(LIZ((m) next));
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.google.gson.JsonObject");
                        }
                    }
                }
                return arrayList;
            case 67973692:
                if (!LJJIFFI.equals("Float") || (LJJIJ6 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Float.valueOf(LJJIJ6.LJIIJ());
            case 79860828:
                if (!LJJIFFI.equals("Short") || (LJJIJ7 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Short.valueOf(LJJIJ7.LJJI());
            case 2052876273:
                if (!LJJIFFI.equals("Double") || (LJJIJ8 = mVar.LJJIJ("VALUE")) == null) {
                    return null;
                }
                return Double.valueOf(LJJIJ8.LJIIIZ());
            default:
                return null;
        }
    }

    public static java.util.Map LIZIZ(String str) {
        HashMap hashMap = new HashMap();
        try {
            java.util.Set<Map.Entry<String, j>> entrySet = ((m) Q1T.LJFF.LJI(str, m.class)).entrySet();
            o.LJFF(entrySet, "paramsData.entrySet()");
            for (Map.Entry<String, j> entry : entrySet) {
                j value = entry.getValue();
                if (value != null) {
                    Object LIZ2 = LIZ((m) value);
                    if (LIZ2 != null) {
                        String key = entry.getKey();
                        o.LJFF(key, "it.key");
                        hashMap.put(key, LIZ2);
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.google.gson.JsonObject");
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return hashMap;
    }

    public static m LIZJ(Object obj) {
        m mVar = new m();
        if (obj == null) {
            mVar.LJJII("TYPE", new p("Null"));
            mVar.LJJII("VALUE", null);
            return mVar;
        }
        if (obj instanceof String) {
            mVar.LJJII("TYPE", new p("String"));
            mVar.LJJII("VALUE", new p((String) obj));
            return mVar;
        }
        if (obj instanceof Long) {
            mVar.LJJII("TYPE", new p("Long"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        if (obj instanceof Integer) {
            mVar.LJJII("TYPE", new p("Int"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        if (obj instanceof Float) {
            mVar.LJJII("TYPE", new p("Float"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        if (obj instanceof Double) {
            mVar.LJJII("TYPE", new p("Double"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        if (obj instanceof Byte) {
            mVar.LJJII("TYPE", new p("Byte"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        if (obj instanceof Character) {
            mVar.LJJII("TYPE", new p("Char"));
            mVar.LJJII("VALUE", new p((Character) obj));
            return mVar;
        }
        if (obj instanceof Short) {
            mVar.LJJII("TYPE", new p("Short"));
            mVar.LJJII("VALUE", new p((Number) obj));
            return mVar;
        }
        return null;
    }
}
