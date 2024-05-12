package com.bytedance.bmf;

import com.bytedance.hmp.Ptr;

/* loaded from: classes34.dex */
public class JsonParam extends Ptr {
    public String dump() {
        return API.bmf_json_dump(this.ptr);
    }

    public void free() {
        if (this.own) {
            API.bmf_json_free(this.ptr);
        }
    }

    public JsonParam() {
        this.ptr = API.bmf_json_make();
        this.own = true;
    }

    public boolean erase(String str) {
        return API.bmf_json_erase(this.ptr, str);
    }

    public double getDouble(String str) {
        return API.bmf_json_get_double(this.ptr, str);
    }

    public double[] getDoubleList(String str) {
        return API.bmf_json_get_double_list(this.ptr, str);
    }

    public float getFloat(String str) {
        return API.bmf_json_get_float(this.ptr, str);
    }

    public float[] getFloatList(String str) {
        return API.bmf_json_get_float_list(this.ptr, str);
    }

    public int getInt(String str) {
        return API.bmf_json_get_int(this.ptr, str);
    }

    public int[] getIntList(String str) {
        return API.bmf_json_get_int_list(this.ptr, str);
    }

    public long getLong(String str) {
        return API.bmf_json_get_long(this.ptr, str);
    }

    public String getString(String str) {
        return API.bmf_json_get_string(this.ptr, str);
    }

    public String[] getStringList(String str) {
        return API.bmf_json_get_string_list(this.ptr, str);
    }

    public boolean hasKey(String str) {
        return API.bmf_json_has_key(this.ptr, str);
    }

    public JsonParam(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static JsonParam wrap(long j, boolean z) {
        return new JsonParam(j, z);
    }

    public void set(String str, Object obj) {
        if (obj instanceof Integer) {
            API.bmf_json_set_int(this.ptr, str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            API.bmf_json_set_long(this.ptr, str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            API.bmf_json_set_float(this.ptr, str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            API.bmf_json_set_double(this.ptr, str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            API.bmf_json_set_string(this.ptr, str, (String) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof int[]) {
                API.bmf_json_set_int_list(this.ptr, str, (int[]) obj);
                return;
            }
            if (obj instanceof float[]) {
                API.bmf_json_set_float_list(this.ptr, str, (float[]) obj);
                return;
            } else if (obj instanceof double[]) {
                API.bmf_json_set_double_list(this.ptr, str, (double[]) obj);
                return;
            } else {
                if (obj instanceof String[]) {
                    API.bmf_json_set_string_list(this.ptr, str, (String[]) obj);
                    return;
                }
                throw new IllegalArgumentException("Unknown array type for Jsonparam set()");
            }
        }
        throw new IllegalArgumentException("Unknown type for Jsonparam set()");
    }
}
