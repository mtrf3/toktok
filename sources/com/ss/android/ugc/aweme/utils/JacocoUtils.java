package com.ss.android.ugc.aweme.utils;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C39579Fg7;
import X.C65300Pk0;
import X.EF7;
import X.EVF;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class JacocoUtils {
    public static boolean ReleaseMode = true;
    public static int TimeInterval = 60;
    public static Object coverageMonitor = null;
    public static Method dataUploadMethod = null;
    public static Method dataWriteNowMethod = null;
    public static boolean enable = false;
    public static Method getDeviceIDMethod = null;
    public static Method getInstrumentStatusMethod = null;
    public static boolean isEnabled = true;
    public static int sHasJacocoUtilsInited;
    public static boolean sUploadCoverageDataTaskInited;
    public static Method setAppVersionMethod;
    public static Method setDeviceIDMethod;

    public static Object com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-185680162635025635"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static void uploadCoverageFileTask() {
        enable = true;
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        if (sUploadCoverageDataTaskInited) {
            return;
        }
        sUploadCoverageDataTaskInited = true;
        uploadCoverageDataCore(false);
    }

    public static boolean isLocalTest() {
        String str = EF7.LJIILIIL;
        if (TextUtils.equals(str, "local_test") || TextUtils.equals(str, "daily_monkey_test") || TextUtils.equals(str, "monkey")) {
            return true;
        }
        return false;
    }

    public static void uploadCoverageFileNow() {
        if (!enable) {
            return;
        }
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        uploadCoverageDataCore(true);
    }

    public static String getLogFilePath() {
        Context LIZIZ = EF7.LIZIZ();
        File LJII = C39579Fg7.LJII(LIZIZ);
        if (!C39579Fg7.LJIILL()) {
            LJII = C16880lQ.LLIIIL(LIZIZ);
        }
        if (LJII == null) {
            return null;
        }
        File file = new File(LJII, "jacoco");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void jacocoInit() {
        if (!isLocalTest() || !isEnabled) {
            sHasJacocoUtilsInited = 2;
        }
        if (sHasJacocoUtilsInited == 0) {
            EF7.LIZIZ();
            try {
                Class<?> cls = Class.forName("com.bytedance.test.codecoverage.CodeCoverageMonitor");
                Class<?> cls2 = Boolean.TYPE;
                coverageMonitor = cls.getConstructor(String.class, cls2, Context.class, cls2).newInstance(getLogFilePath(), Boolean.valueOf(ReleaseMode), EF7.LIZIZ(), Boolean.FALSE);
                Method declaredMethod = cls.getDeclaredMethod("setAppVersion", String.class);
                setAppVersionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                setAppVersionMethod.invoke(coverageMonitor, String.valueOf(EF7.LIZJ()));
                Method declaredMethod2 = cls.getDeclaredMethod("setDeviceID", String.class);
                setDeviceIDMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
                setDeviceIDMethod.invoke(coverageMonitor, String.valueOf(AppLog.getServerDeviceId()));
                Method declaredMethod3 = cls.getDeclaredMethod("getInstrumentStatus", new Class[0]);
                getInstrumentStatusMethod = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = cls.getDeclaredMethod("getDeviceID", new Class[0]);
                getDeviceIDMethod = declaredMethod4;
                declaredMethod4.setAccessible(true);
                Method declaredMethod5 = cls.getDeclaredMethod("dataWriteNow", new Class[0]);
                dataWriteNowMethod = declaredMethod5;
                declaredMethod5.setAccessible(true);
                Method declaredMethod6 = cls.getDeclaredMethod("dataUpload", new Class[0]);
                dataUploadMethod = declaredMethod6;
                declaredMethod6.setAccessible(true);
                sHasJacocoUtilsInited = 1;
            } catch (ClassNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            } catch (InstantiationException e3) {
                C16880lQ.LLLLIIL(e3);
            } catch (NoSuchMethodException e4) {
                C16880lQ.LLLLIIL(e4);
            } catch (InvocationTargetException e5) {
                C16880lQ.LLLLIIL(e5);
            }
        }
    }

    public static void uploadCoverageDataCore(boolean z) {
        if (coverageMonitor == null || !isLocalTest()) {
            return;
        }
        try {
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (sHasJacocoUtilsInited == 1) {
            Method method = getInstrumentStatusMethod;
            if (method != null) {
                if (!((Boolean) com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(method, coverageMonitor, new Object[0])).booleanValue()) {
                    return;
                }
            }
            new EVF(z).LIZ();
        }
    }
}
