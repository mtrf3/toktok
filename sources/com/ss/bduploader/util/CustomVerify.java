package com.ss.bduploader.util;

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

    static {
        try {
            verifyMethod = Class.forName("com.ss.bduploader.util.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ss.bduploader.util.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception unused) {
        }
        hasInited = true;
    }

    public static Object com_ss_bduploader_util_CustomVerify_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "938915387412842873"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = verifyMethod;
        if (method == null || verifyResultClass == null || getVerifyStatusMethod == null) {
            return -99995;
        }
        try {
            return ((Integer) com_ss_bduploader_util_CustomVerify_java_lang_reflect_Method_invoke(getVerifyStatusMethod, com_ss_bduploader_util_CustomVerify_java_lang_reflect_Method_invoke(method, null, new Object[]{bArr, str, str2}), new Object[0])).intValue();
        } catch (Throwable unused) {
            return -99996;
        }
    }
}
