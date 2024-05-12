package com.bytedance.pia.core.utils;

import X.C141335gf;
import X.C221108m2;
import X.C3C5;
import X.C62822Ol8;
import X.C65385PlN;
import X.C65403Plf;
import X.C65411Pln;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class GsonUtils {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C65411Pln.LJLIL);
    public static final o LIZIZ = new o();

    public static final Gson LIZIZ() {
        return (Gson) LIZ.getValue();
    }

    /* loaded from: classes12.dex */
    public static final class JSONArrayAdapter extends TypeAdapter<JSONArray> {
        public static final JSONArrayAdapter LIZ = new JSONArrayAdapter();

        @Override // com.google.gson.TypeAdapter
        public final JSONArray read(C65385PlN reader) {
            kotlin.jvm.internal.o.LJIIJ(reader, "reader");
            GsonUtils.LIZIZ.getClass();
            j it = o.LIZIZ(reader);
            kotlin.jvm.internal.o.LJFF(it, "it");
            if (!(it instanceof g) || it == null) {
                return null;
            }
            return GsonUtils.LIZLLL(it.LJIILLIIL());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf out, JSONArray jSONArray) {
            JSONArray value = jSONArray;
            kotlin.jvm.internal.o.LJIIJ(out, "out");
            kotlin.jvm.internal.o.LJIIJ(value, "value");
            GsonUtils.LJFF(out, value);
        }
    }

    /* loaded from: classes12.dex */
    public static final class JSONObjectAdapter extends TypeAdapter<JSONObject> {
        public static final JSONObjectAdapter LIZ = new JSONObjectAdapter();

        @Override // com.google.gson.TypeAdapter
        public final JSONObject read(C65385PlN reader) {
            kotlin.jvm.internal.o.LJIIJ(reader, "reader");
            GsonUtils.LIZIZ.getClass();
            j it = o.LIZIZ(reader);
            kotlin.jvm.internal.o.LJFF(it, "it");
            if (!(it instanceof m) || it == null) {
                return null;
            }
            return GsonUtils.LJ(it.LJIIZILJ());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf out, JSONObject jSONObject) {
            JSONObject value = jSONObject;
            kotlin.jvm.internal.o.LJIIJ(out, "out");
            kotlin.jvm.internal.o.LJIIJ(value, "value");
            GsonUtils.LJI(out, value);
        }
    }

    public static final JSONArray LIZLLL(g toJSONArray) {
        kotlin.jvm.internal.o.LJIIJ(toJSONArray, "$this$toJSONArray");
        JSONArray jSONArray = new JSONArray();
        Iterator<j> it = toJSONArray.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next instanceof m) {
                jSONArray.put(LJ((m) next));
            } else if (next instanceof g) {
                jSONArray.put(LIZLLL((g) next));
            } else if (next instanceof l) {
                jSONArray.put(JSONObject.NULL);
            } else if (next instanceof p) {
                p pVar = (p) next;
                Object obj = pVar.LJLIL;
                if (obj instanceof Boolean) {
                    jSONArray.put(pVar.LJFF());
                } else if (obj instanceof String) {
                    jSONArray.put(pVar.LJJIFFI());
                } else if (obj instanceof Number) {
                    if (s.LJJJZ(pVar.LJIL().toString(), '.')) {
                        jSONArray.put(pVar.LJIL().doubleValue());
                    } else {
                        jSONArray.put(pVar.LJIL().longValue());
                    }
                }
            }
        }
        return jSONArray;
    }

    public static final JSONObject LJ(m toJSONObject) {
        kotlin.jvm.internal.o.LJIIJ(toJSONObject, "$this$toJSONObject");
        JSONObject jSONObject = new JSONObject();
        Set<Map.Entry<String, j>> entrySet = toJSONObject.entrySet();
        kotlin.jvm.internal.o.LJFF(entrySet, "entrySet()");
        for (Map.Entry<String, j> entry : entrySet) {
            String key = entry.getKey();
            j value = entry.getValue();
            if (value instanceof m) {
                jSONObject.put(key, LJ((m) value));
            } else if (value instanceof g) {
                jSONObject.put(key, LIZLLL((g) value));
            } else if (value instanceof l) {
                jSONObject.put(key, JSONObject.NULL);
            } else if (value instanceof p) {
                p pVar = (p) value;
                Object obj = pVar.LJLIL;
                if (obj instanceof Boolean) {
                    jSONObject.put(key, pVar.LJFF());
                } else if (obj instanceof String) {
                    jSONObject.put(key, pVar.LJJIFFI());
                } else if (obj instanceof Number) {
                    if (s.LJJJZ(pVar.LJIL().toString(), '.')) {
                        jSONObject.put(key, pVar.LJIL().doubleValue());
                    } else {
                        jSONObject.put(key, pVar.LJIL().longValue());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static final <T> T LIZ(String str, Class<T> cls) {
        boolean z;
        Object LIZ2;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            LIZ2 = LIZIZ().LJI(str, cls);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            return null;
        }
        return (T) LIZ2;
    }

    public static void LIZJ(C65403Plf c65403Plf, Object obj) {
        if (obj instanceof Boolean) {
            c65403Plf.LJJIII(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c65403Plf.LJIJJ((Number) obj);
            return;
        }
        if (obj instanceof String) {
            c65403Plf.LJJ((String) obj);
            return;
        }
        if (obj instanceof JSONObject) {
            LJI(c65403Plf, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            LJFF(c65403Plf, (JSONArray) obj);
        } else {
            c65403Plf.LJIIJJI();
        }
    }

    public static void LJFF(C65403Plf c65403Plf, JSONArray jSONArray) {
        c65403Plf.LIZIZ();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            LIZJ(c65403Plf, jSONArray.opt(i));
        }
        c65403Plf.LJ();
    }

    public static void LJI(C65403Plf c65403Plf, JSONObject jSONObject) {
        c65403Plf.LIZJ();
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.LJFF(keys, "value.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            c65403Plf.LJI(next);
            LIZJ(c65403Plf, jSONObject.opt(next));
        }
        c65403Plf.LJFF();
    }
}
