package com.bytedance.pitaya.cep_engine.helper;

import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ListProxyHelper extends ProxyHelper {
    public final JSONArray data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isList() {
        return true;
    }

    public ListProxyHelper() {
        this(new JSONArray());
    }

    public final ListProxyHelper copy() {
        JSONArray jSONArray = new JSONArray();
        int length = this.data.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                jSONArray.put(this.data.get(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new ListProxyHelper(jSONArray);
    }

    public final long size() {
        return this.data.length();
    }

    public final JSONArray getData() {
        return this.data;
    }

    public ListProxyHelper(JSONArray data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final ProxyHelper opt(int i) {
        Object opt = this.data.opt(i);
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

    public final void put(ProxyHelper proxyHelper) {
        o.LJIIIZ(proxyHelper, "proxyHelper");
        if (proxyHelper instanceof IntProxyHelper) {
            this.data.put(((IntProxyHelper) proxyHelper).getData());
            return;
        }
        if (proxyHelper instanceof FloatProxyHelper) {
            this.data.put(((FloatProxyHelper) proxyHelper).getData());
            return;
        }
        if (proxyHelper instanceof BooleanProxyHelper) {
            this.data.put(((BooleanProxyHelper) proxyHelper).getData());
            return;
        }
        if (proxyHelper instanceof StrProxyHelper) {
            this.data.put(((StrProxyHelper) proxyHelper).getData());
        } else if (proxyHelper instanceof DictProxyHelper) {
            this.data.put(((DictProxyHelper) proxyHelper).getData());
        } else {
            if (!(proxyHelper instanceof ListProxyHelper)) {
                return;
            }
            this.data.put(((ListProxyHelper) proxyHelper).data);
        }
    }
}
