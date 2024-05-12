package com.ss.ttffmpeg;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class CustomVerify {
    public static final Method LIZ;
    public static final Class<?> LIZIZ;
    public static final Method LIZJ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-3667692379763807533"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    public static final native void _init();

    static {
        try {
            LIZ = Class.forName("com.ttnet.org.chromium.net.f0").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            LIZIZ = cls;
            LIZJ = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ() {
        _init();
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method;
        Method method2 = LIZ;
        if (method2 == null || LIZIZ == null || (method = LIZJ) == null) {
            return -99995;
        }
        try {
            return ((Integer) LIZ(LIZ(null, method2, new Object[]{bArr, str, str2}), method, new Object[0])).intValue();
        } catch (Throwable unused) {
            return -99996;
        }
    }
}
