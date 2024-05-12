package org.eclipse.mat.json;

import X.C7MY;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.mat.json.JSONStringer;

/* loaded from: classes12.dex */
public class JSONArray {
    public final List<Object> values;

    public int hashCode() {
        return this.values.hashCode();
    }

    public int length() {
        return this.values.size();
    }

    public String toString() {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            writeTo(jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONArray() {
        this.values = new ArrayList();
    }

    public JSONArray(JSONTokener jSONTokener) {
        Object nextValue = jSONTokener.nextValue();
        if (nextValue instanceof JSONArray) {
            this.values = ((JSONArray) nextValue).values;
            return;
        }
        throw JSON.typeMismatch(nextValue, "JSONArray");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof JSONArray) && ((JSONArray) obj).values.equals(this.values)) {
            return true;
        }
        return false;
    }

    public Object get(int i) {
        try {
            Object obj = ListProtector.get(this.values, i);
            if (obj != null) {
                return obj;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Value at ");
            LIZ.append(i);
            LIZ.append(" is null.");
            throw new JSONException(X1D.LIZIZ(LIZ));
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder LJ = C7MY.LJ("Index ", i, " out of range [0..");
            LJ.append(this.values.size());
            LJ.append(")");
            throw new JSONException(X1D.LIZIZ(LJ));
        }
    }

    public boolean getBoolean(int i) {
        Object obj = get(i);
        Boolean bool = JSON.toBoolean(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "boolean");
    }

    public double getDouble(int i) {
        Object obj = get(i);
        Double d = JSON.toDouble(obj);
        if (d != null) {
            return d.doubleValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "double");
    }

    public int getInt(int i) {
        Object obj = get(i);
        Integer integer = JSON.toInteger(obj);
        if (integer != null) {
            return integer.intValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "int");
    }

    public JSONArray getJSONArray(int i) {
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "JSONArray");
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "JSONObject");
    }

    public long getLong(int i) {
        Object obj = get(i);
        Long l = JSON.toLong(obj);
        if (l != null) {
            return l.longValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "long");
    }

    public String getString(int i) {
        Object obj = get(i);
        String json = JSON.toString(obj);
        if (json != null) {
            return json;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "String");
    }

    public boolean isNull(int i) {
        Object opt = opt(i);
        if (opt == null || opt == JSONObject.NULL) {
            return true;
        }
        return false;
    }

    public String join(String str) {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.open(JSONStringer.Scope.NULL, "");
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                jSONStringer.out.append(str);
            }
            jSONStringer.value(ListProtector.get(this.values, i));
        }
        JSONStringer.Scope scope = JSONStringer.Scope.NULL;
        jSONStringer.close(scope, scope, "");
        return jSONStringer.out.toString();
    }

    public Object opt(int i) {
        if (i < 0 || i >= this.values.size()) {
            return null;
        }
        return ListProtector.get(this.values, i);
    }

    public boolean optBoolean(int i) {
        return optBoolean(i, false);
    }

    public double optDouble(int i) {
        return optDouble(i, Double.NaN);
    }

    public int optInt(int i) {
        return optInt(i, 0);
    }

    public JSONArray optJSONArray(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public long optLong(int i) {
        return optLong(i, 0L);
    }

    public String optString(int i) {
        return optString(i, "");
    }

    public JSONArray put(double d) {
        List<Object> list = this.values;
        JSON.checkDouble(d);
        list.add(Double.valueOf(d));
        return this;
    }

    public JSONObject toJSONObject(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        int min = Math.min(jSONArray.length(), this.values.size());
        if (min == 0) {
            return null;
        }
        for (int i = 0; i < min; i++) {
            jSONObject.put(JSON.toString(jSONArray.opt(i)), opt(i));
        }
        return jSONObject;
    }

    public String toString(int i) {
        JSONStringer jSONStringer = new JSONStringer(i);
        writeTo(jSONStringer);
        return jSONStringer.toString();
    }

    public void writeTo(JSONStringer jSONStringer) {
        jSONStringer.array();
        Iterator<Object> it = this.values.iterator();
        while (it.hasNext()) {
            jSONStringer.value(it.next());
        }
        jSONStringer.endArray();
    }

    public JSONArray(String str) {
        this(new JSONTokener(str));
    }

    public JSONArray put(int i) {
        this.values.add(Integer.valueOf(i));
        return this;
    }

    public JSONArray(Collection collection) {
        this();
        this.values.addAll(collection);
    }

    public JSONArray put(long j) {
        this.values.add(Long.valueOf(j));
        return this;
    }

    public JSONArray put(boolean z) {
        this.values.add(Boolean.valueOf(z));
        return this;
    }

    public JSONArray put(Object obj) {
        this.values.add(obj);
        return this;
    }

    public boolean optBoolean(int i, boolean z) {
        Boolean bool = JSON.toBoolean(opt(i));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public double optDouble(int i, double d) {
        Double d2 = JSON.toDouble(opt(i));
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    public int optInt(int i, int i2) {
        Integer integer = JSON.toInteger(opt(i));
        if (integer != null) {
            return integer.intValue();
        }
        return i2;
    }

    public long optLong(int i, long j) {
        Long l = JSON.toLong(opt(i));
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    public String optString(int i, String str) {
        String json = JSON.toString(opt(i));
        if (json != null) {
            return json;
        }
        return str;
    }

    public JSONArray put(int i, Object obj) {
        if (obj instanceof Number) {
            JSON.checkDouble(((Number) obj).doubleValue());
        }
        while (this.values.size() <= i) {
            this.values.add(null);
        }
        ListProtector.set(this.values, i, obj);
        return this;
    }

    public JSONArray put(int i, double d) {
        put(i, Double.valueOf(d));
        return this;
    }

    public JSONArray put(int i, int i2) {
        put(i, Integer.valueOf(i2));
        return this;
    }

    public JSONArray put(int i, long j) {
        put(i, Long.valueOf(j));
        return this;
    }

    public JSONArray put(int i, boolean z) {
        put(i, Boolean.valueOf(z));
        return this;
    }
}
