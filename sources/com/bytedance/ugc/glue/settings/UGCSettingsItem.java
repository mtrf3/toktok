package com.bytedance.ugc.glue.settings;

import X.C16880lQ;
import com.bytedance.ugc.glue.UGCTools;
import com.bytedance.ugc.glue.json.UGCJson;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class UGCSettingsItem<T> {
    public final T defaultValue;
    public final String key;
    public String lastString;
    public final Type type;
    public T value;

    public T getValue() {
        if (!UGCTools.equal("", this.lastString)) {
            this.value = parse("", this.type);
            this.lastString = "";
        }
        T t = this.value;
        if (t == null) {
            return this.defaultValue;
        }
        return t;
    }

    public String getKey() {
        return this.key;
    }

    public UGCSettingsItem(String str, T t) {
        this(str, t, t.getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T parse(String str, Type type) {
        T t = null;
        if (UGCTools.isEmpty(str)) {
            return null;
        }
        if (type == String.class) {
            return str;
        }
        if (type == JSONObject.class) {
            return (T) UGCJson.jsonObject(str);
        }
        try {
            t = (T) UGCJson.fromJson(str, type);
            return t;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return t;
        }
    }

    public UGCSettingsItem(String str, T t, Type type) {
        this.key = str;
        this.defaultValue = t;
        this.type = type;
    }
}
