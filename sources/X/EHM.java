package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EHM implements java.util.Map<String, Object>, EHO {
    public JSONObject LJLIL;

    @Override // java.util.Map
    public final void clear() {
        this.LJLIL = new JSONObject();
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<String, Object>> entrySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> keys = this.LJLIL.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            o.LJFF(key, "key");
            Object opt = this.LJLIL.opt(key);
            if (opt != null) {
                linkedHashSet.add(new EHN(key, opt));
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.LJLIL.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<String> keySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> keys = this.LJLIL.keys();
        o.LJFF(keys, "jsonObject.keys()");
        ORS.LJJLIIIJJI(linkedHashSet, OJ6.LJJIJLIJ(keys));
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLIL.length();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> keys = this.LJLIL.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            Object opt = this.LJLIL.opt(keys.next());
            if (opt != null) {
                linkedHashSet.add(opt);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return linkedHashSet;
    }

    public EHM(JSONObject jSONObject) {
        this.LJLIL = jSONObject;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            String key = (String) obj;
            o.LJIIJ(key, "key");
            return this.LJLIL.has(key);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null) {
            Iterator<String> keys = this.LJLIL.keys();
            o.LJFF(keys, "keys");
            while (keys.hasNext()) {
                Object opt = this.LJLIL.opt(keys.next());
                if (opt != null && opt.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            String key = (String) obj;
            o.LJIIJ(key, "key");
            return this.LJLIL.opt(key);
        }
        return null;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends String, ? extends Object> from) {
        o.LJIIJ(from, "from");
        for (Map.Entry<? extends String, ? extends Object> entry : from.entrySet()) {
            this.LJLIL.put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            String key = (String) obj;
            o.LJIIJ(key, "key");
            return this.LJLIL.remove(key);
        }
        return null;
    }

    @Override // java.util.Map
    public final Object put(String str, Object value) {
        String key = str;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        return this.LJLIL.put(key, value);
    }
}
