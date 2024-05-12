package com.ss.mediakit.vcnlib;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class CustomVerify {
    public static Method getVerifyStatusMethod;
    public static boolean hasInited;
    public static Method verifyMethod;
    public static Class<?> verifyResultClass;

    public static final native void _init();

    public static Object com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "865504986230934457"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            try {
                verifyMethod = Class.forName("com.ttnet.org.chromium.net.f0").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
                Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
                verifyResultClass = cls;
                getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            verifyMethod = Class.forName("com.ss.mediakit.vcnlib.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls2 = Class.forName("com.ss.mediakit.vcnlib.AndroidCertVerifyResult");
            verifyResultClass = cls2;
            getVerifyStatusMethod = cls2.getMethod("getStatus", new Class[0]);
        }
        hasInited = true;
    }

    public static void init() {
        _init();
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = verifyMethod;
        if (method == null || verifyResultClass == null || getVerifyStatusMethod == null) {
            return -99995;
        }
        try {
            return ((Integer) com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(getVerifyStatusMethod, com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(method, null, new Object[]{bArr, str, str2}), new Object[0])).intValue();
        } catch (Throwable unused) {
            return -99996;
        }
    }
}
