package com.byted.cast.sdk.utils;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class JsonFormatter {
    public String toString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    public static JSONObject toJson(Object obj) {
        try {
            return new JSONObject(GsonProtectorUtils.toJson(new Gson(), obj));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        try {
            return (T) new Gson().LJI(String.valueOf(str), cls);
        } catch (Exception unused) {
            return null;
        }
    }
}
