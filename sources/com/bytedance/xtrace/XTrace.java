package com.bytedance.xtrace;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.xtrace.utils.TraceHelper;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class XTrace {
    public static Context context;
    public static Interceptor interceptor;
    public static volatile boolean isStartTrace;
    public static Method m1;
    public static Method m2;
    public static HashMap<Long, Member> traceMapping = new HashMap<>();
    public static TraceMode traceMode = TraceMode.MODE_TRACE;
    public static boolean initSuccess = false;
    public static boolean openOnPreviewSdk = false;

    public static native long addTrace(Member member);

    public static Object com_bytedance_xtrace_XTrace_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6844619715910084189"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static native boolean doHook();

    public static void m1() {
    }

    public static void m2() {
    }

    public static native void nEnableLog(boolean z);

    public static native void nInit(int i, int i2, boolean z);

    public static boolean openTrace() {
        try {
            Class cls = Integer.TYPE;
            Method methodByPassHiddenApi = TraceHelper.getMethodByPassHiddenApi(Debug.class, "startMethodTracingDdms", cls, cls, Boolean.TYPE, cls);
            if (methodByPassHiddenApi != null) {
                com_bytedance_xtrace_XTrace_java_lang_reflect_Method_invoke(methodByPassHiddenApi, null, new Object[]{0, 0, Boolean.FALSE, 0});
                return true;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return false;
    }

    public static native void removeTrace(Member member);

    static {
        C16880lQ.LLJJJIL("xtrace");
        try {
            m1 = TraceHelper.getMethod(XTrace.class, "m1", new Object[0]);
            m2 = TraceHelper.getMethod(XTrace.class, "m2", new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static boolean checkMethod(Member member) {
        if (member == null) {
            if (!TraceHelper.isDebugApk(context)) {
                return false;
            }
            throw new IllegalArgumentException("Member is empty, Please check whether the method name and signature are correct!!!");
        }
        return true;
    }

    public static void enableLog(boolean z) {
        nEnableLog(z);
    }

    public static synchronized boolean init(Context context2) {
        boolean z;
        synchronized (XTrace.class) {
            context = C16880lQ.LLLLL(context2);
            if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.PREVIEW_SDK_INT > 0) {
                z = true;
            } else {
                z = false;
            }
            if (traceMode == TraceMode.MODE_TRACE && z && !openOnPreviewSdk) {
                return false;
            }
            return internalInit(z);
        }
    }

    public static boolean internalInit(boolean z) {
        C79527VJb c79527VJb = new C79527VJb();
        c79527VJb.LIZ = VJZ.SHARED.value;
        c79527VJb.LIZIZ = true;
        ShadowHook.init(c79527VJb.LIZ());
        int i = Build.VERSION.SDK_INT;
        nInit(i, traceMode.ordinal(), z);
        initSuccess = doHook();
        if (traceMode != TraceMode.MODE_TRACE || !initSuccess || i >= 33 || openTrace()) {
            return true;
        }
        return false;
    }

    public static void setInterceptor(Interceptor interceptor2) {
        interceptor = interceptor2;
    }

    public static void setOpenOnPreviewSdk(boolean z) {
        openOnPreviewSdk = z;
    }

    public static void setTraceMode(TraceMode traceMode2) {
        traceMode = traceMode2;
    }

    public static synchronized void trace(Member member) {
        synchronized (XTrace.class) {
            if (!initSuccess) {
                return;
            }
            if (!checkMethod(member)) {
                return;
            }
            if (!traceMapping.values().contains(member)) {
                long addTrace = addTrace(member);
                if (addTrace != 0) {
                    traceMapping.put(Long.valueOf(addTrace), member);
                }
            }
        }
    }

    public static synchronized void unTrace(Member member) {
        synchronized (XTrace.class) {
            if (!checkMethod(member)) {
                return;
            }
            if (traceMapping.values().contains(member)) {
                traceMapping.values().remove(member);
                removeTrace(member);
            }
        }
    }

    public static boolean dispatch(long j, Object obj) {
        Member member = traceMapping.get(Long.valueOf(j));
        Interceptor interceptor2 = interceptor;
        if (interceptor2 != null && member != null) {
            return interceptor2.intercept(member, obj, null);
        }
        return false;
    }

    public static boolean dispatch(long j, Object obj, Object[] objArr) {
        Member member = traceMapping.get(Long.valueOf(j));
        Interceptor interceptor2 = interceptor;
        if (interceptor2 != null && member != null) {
            return interceptor2.intercept(member, obj, objArr);
        }
        return false;
    }
}
