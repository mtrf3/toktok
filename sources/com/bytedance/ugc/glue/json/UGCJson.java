package com.bytedance.ugc.glue.json;

import X.C36862EdO;
import X.C36863EdP;
import X.X1D;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class UGCJson {
    public static UGCJson instance = new UGCJson();

    public <T> T fromJsonImpl(Object obj, Type type) {
        return null;
    }

    public String toJsonImpl(Object obj) {
        return "";
    }

    public static UGCJson getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    public static Type buildGenericArrayType(Type type) {
        return new C36862EdO(type);
    }

    public static JSONObject jsonObject(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", th.getClass().getName());
            jSONObject.put("message", th.getMessage());
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i = 0; i < 10; i++) {
                if (i >= stackTrace.length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("trace");
                LIZ.append(i);
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(stackTraceElement.getClassName());
                LIZ2.append("#");
                LIZ2.append(stackTraceElement.getMethodName());
                LIZ2.append("@");
                LIZ2.append(stackTraceElement.getLineNumber());
                jSONObject.put(LIZIZ, X1D.LIZIZ(LIZ2));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static JSONObject mergeJSONObject(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    try {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.putOpt(next, jSONObject2.get(next));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String toJson(Object obj) {
        return getInstance().toJsonImpl(obj);
    }

    public static JSONObject jsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static Type buildParameterizedType(Type type, Type... typeArr) {
        return new C36863EdP(type, typeArr);
    }

    public static <T> T convert(Object obj, Type type) {
        return (T) getInstance().convertImpl(obj, type);
    }

    public static <T> T fromJson(InputStream inputStream, Type type) {
        return (T) getInstance().fromJsonImpl(new InputStreamReader(inputStream), type);
    }

    public <T> T convertImpl(Object obj, Type type) {
        return (T) fromJsonImpl(toJsonImpl(obj), type);
    }

    public static <T> T fromJson(Reader reader, Type type) {
        return (T) getInstance().fromJsonImpl(reader, type);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) getInstance().fromJsonImpl(str, type);
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
