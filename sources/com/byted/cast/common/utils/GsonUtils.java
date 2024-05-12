package com.byted.cast.common.utils;

import com.byted.cast.common.Logger;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* loaded from: classes29.dex */
public class GsonUtils {
    public static final Gson gson = new Gson();

    public static String toJsonIgnoreException(Object obj) {
        try {
            return gson.LJIILL(obj);
        } catch (Throwable th) {
            Logger.e(th.getLocalizedMessage());
            return null;
        }
    }

    public static <T> T fromJsonIgnoreException(String str, Class<T> cls) {
        try {
            return (T) gson.LJI(str, cls);
        } catch (Throwable th) {
            Logger.e(th.getLocalizedMessage());
            return null;
        }
    }

    public static <T> T fromJsonIgnoreException(String str, Type type) {
        try {
            return (T) gson.LJII(str, type);
        } catch (Throwable unused) {
            return null;
        }
    }
}
