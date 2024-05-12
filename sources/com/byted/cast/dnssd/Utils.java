package com.byted.cast.dnssd;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.os.Build;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

/* loaded from: classes29.dex */
public class Utils {
    public static final boolean isAndroid6;
    public static Method newStringFromBytesProxyByteCast;

    public static Object com_byted_cast_dnssd_Utils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7502955052920523187"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT == 23) {
            z = true;
        } else {
            z = false;
        }
        isAndroid6 = z;
        if (z) {
            try {
                Class<?> cls = Class.forName("java.lang.StringFactory");
                Class<?> cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("newStringFromBytes", byte[].class, cls2, cls2, Charset.class);
                newStringFromBytesProxyByteCast = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
    }

    public static String newString(byte[] bArr, int i, int i2) {
        if (isAndroid6) {
            return newString(bArr, i, i2, Charset.defaultCharset());
        }
        return new String(bArr, i, i2);
    }

    public static String newString(byte[] bArr, int i, int i2, Charset charset) {
        Method method;
        if (isAndroid6 && (method = newStringFromBytesProxyByteCast) != null) {
            try {
                return (String) com_byted_cast_dnssd_Utils_java_lang_reflect_Method_invoke(method, null, new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), charset});
            } catch (Throwable unused) {
            }
        }
        return new String(bArr, i, i2, charset);
    }
}
