package com.bytedance.pitaya.cep_engine.helper;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DictProxyHelper extends ProxyHelper {
    public final JSONObject data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isDict() {
        return true;
    }

    public DictProxyHelper() {
        this(new JSONObject());
    }

    public final String json() {
        String jSONObject = this.data.toString();
        o.LJIIIIZZ(jSONObject, "data.toString()");
        return jSONObject;
    }

    public final ListProxyHelper keys() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> keys = this.data.keys();
        while (keys.hasNext()) {
            jSONArray.put(keys.next());
        }
        return new ListProxyHelper(jSONArray);
    }

    public final JSONObject getData() {
        return this.data;
    }

    public DictProxyHelper(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final ProxyHelper opt(String key) {
        o.LJIIIZ(key, "key");
        Object opt = this.data.opt(key);
        if (opt != null) {
            if (opt instanceof Byte) {
                return new IntProxyHelper(((Number) opt).byteValue());
            }
            if (opt instanceof Short) {
                return new IntProxyHelper(((Number) opt).shortValue());
            }
            if (opt instanceof Integer) {
                return new IntProxyHelper(((Number) opt).intValue());
            }
            if (opt instanceof Long) {
                return new IntProxyHelper(((Number) opt).longValue());
            }
            if (opt instanceof Float) {
                return new FloatProxyHelper(((Number) opt).floatValue());
            }
            if (opt instanceof Double) {
                return new FloatProxyHelper(((Number) opt).doubleValue());
            }
            if (opt instanceof Boolean) {
                return new BooleanProxyHelper(((Boolean) opt).booleanValue());
            }
            if (opt instanceof String) {
                return new StrProxyHelper((String) opt);
            }
            if (opt instanceof JSONObject) {
                return new DictProxyHelper((JSONObject) opt);
            }
            if (opt instanceof JSONArray) {
                return new ListProxyHelper((JSONArray) opt);
            }
        }
        return new ProxyHelper();
    }

    public final void put(String key, ProxyHelper value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        if (value instanceof IntProxyHelper) {
            this.data.put(key, ((IntProxyHelper) value).getData());
            return;
        }
        if (value instanceof FloatProxyHelper) {
            this.data.put(key, ((FloatProxyHelper) value).getData());
            return;
        }
        if (value instanceof BooleanProxyHelper) {
            this.data.put(key, ((BooleanProxyHelper) value).getData());
            return;
        }
        if (value instanceof StrProxyHelper) {
            this.data.put(key, ((StrProxyHelper) value).getData());
        } else if (value instanceof DictProxyHelper) {
            this.data.put(key, ((DictProxyHelper) value).data);
        } else {
            if (!(value instanceof ListProxyHelper)) {
                return;
            }
            this.data.put(key, ((ListProxyHelper) value).getData());
        }
    }
}
