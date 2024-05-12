package com.bytedance.ugc.glue;

import X.C16880lQ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* loaded from: classes7.dex */
public class UGCTools {
    public static final Handler mainHandler = new Handler(C16880lQ.LLJJJJ());

    public static int round(double d) {
        return (int) (d + 0.5d);
    }

    public static boolean isTest() {
        return false;
    }

    public static String firstNotEmptyString(String... strArr) {
        for (String str : strArr) {
            if (notEmpty(str)) {
                return str;
            }
        }
        return null;
    }

    public static byte[] getBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getColor(int i) {
        return getColor(null, i);
    }

    public static <T> T getDefaultValue(Class<T> cls) {
        if (cls == null || cls.isAssignableFrom(String.class)) {
            return "";
        }
        if (cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Short.class) || cls.isAssignableFrom(Short.TYPE)) {
            return (T) 0;
        }
        if (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Long.TYPE)) {
            return (T) 0L;
        }
        if (cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Float.TYPE)) {
            return (T) Float.valueOf(0.0f);
        }
        if (cls.isAssignableFrom(Double.class) || cls.isAssignableFrom(Double.TYPE)) {
            return (T) Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        if (!cls.isAssignableFrom(Boolean.class)) {
            return "";
        }
        return (T) Boolean.FALSE;
    }

    public static int getDpByPx(float f) {
        return round(getDpFByPx(f));
    }

    public static float getDpFByPx(float f) {
        return f / 2.0f;
    }

    public static Drawable getDrawable(int i) {
        return getDrawable(null, i);
    }

    public static int getPxByDp(float f) {
        return round(getPxFByDp(f));
    }

    public static int getPxBySp(float f) {
        return round(getPxFBySp(f));
    }

    public static float getPxFByDp(float f) {
        return f * 2.0f;
    }

    public static float getPxFBySp(float f) {
        return f * 2.0f;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static int mergeFlag(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return i;
    }

    public static boolean notEmpty(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean parseBoolean(String str) {
        if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static double parseDouble(String str) {
        try {
            return CastDoubleProtector.parseDouble(str);
        } catch (Throwable unused) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str) {
        return parseLong(str, 0L);
    }

    public static boolean equal(CharSequence charSequence, CharSequence charSequence2) {
        if ((isEmpty(charSequence) && isEmpty(charSequence2)) || (charSequence != null && charSequence.equals(charSequence2))) {
            return true;
        }
        return false;
    }

    public static int getColor(Context context, int i) {
        if (context != null) {
            return context.getResources().getColor(i);
        }
        return 0;
    }

    public static Drawable getDrawable(Context context, int i) {
        if (context != null) {
            return context.getResources().getDrawable(i);
        }
        return null;
    }

    public static String getString(int i, Object... objArr) {
        return getString(null, i, objArr);
    }

    public static double parseDouble(String str, double d) {
        try {
            return CastDoubleProtector.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static int parseInt(String str, int i) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (Throwable unused) {
            double d = i;
            try {
                d = CastDoubleProtector.parseDouble(str);
            } catch (Throwable unused2) {
            }
            return round(d);
        }
    }

    public static long parseLong(String str, long j) {
        try {
            return CastLongProtector.parseLong(str);
        } catch (Throwable unused) {
            double d = j;
            try {
                d = CastDoubleProtector.parseDouble(str);
            } catch (Throwable unused2) {
            }
            return round(d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public static <T> T get(Bundle bundle, String str, T t) {
        if (bundle == null) {
            return t;
        }
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII == null) {
            return t;
        }
        ?? r2 = (T) String.valueOf(LLJJIII);
        if (t instanceof String) {
            return r2;
        }
        if (t instanceof Integer) {
            return (T) Integer.valueOf(parseInt(r2, ((Integer) t).intValue()));
        }
        if (t instanceof Short) {
            return (T) Integer.valueOf(parseInt(r2, ((Short) t).shortValue()));
        }
        if (t instanceof Long) {
            return (T) Long.valueOf(parseLong(r2, ((Long) t).longValue()));
        }
        if (t instanceof Double) {
            double doubleValue = ((Double) t).doubleValue();
            try {
                doubleValue = CastDoubleProtector.parseDouble(r2);
            } catch (Throwable unused) {
            }
            return (T) Double.valueOf(doubleValue);
        }
        if (!(t instanceof Float)) {
            return r2;
        }
        double floatValue = ((Float) t).floatValue();
        try {
            floatValue = CastDoubleProtector.parseDouble(r2);
        } catch (Throwable unused2) {
        }
        return (T) Double.valueOf(floatValue);
    }

    public static String getString(Context context, int i, Object... objArr) {
        if (context != null) {
            return context.getString(i, objArr);
        }
        return "";
    }

    public static <T> T get(Activity activity, String str, T t) {
        if (activity == null) {
            return t;
        }
        return (T) get(activity.getIntent(), str, t);
    }

    public static <T> T get(Intent intent, String str, T t) {
        if (intent == null) {
            return t;
        }
        return (T) get(C16880lQ.LLJJIJI(intent), str, t);
    }

    public static <T> T get(Activity activity, String str, Class<T> cls) {
        return (T) get(activity, str, getDefaultValue(cls));
    }

    public static <T> T get(Intent intent, String str, Class<T> cls) {
        return (T) get(intent, str, getDefaultValue(cls));
    }

    public static <T> T get(Bundle bundle, String str, Class<T> cls) {
        return (T) get(bundle, str, getDefaultValue(cls));
    }
}
