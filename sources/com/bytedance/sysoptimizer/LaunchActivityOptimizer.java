package com.bytedance.sysoptimizer;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class LaunchActivityOptimizer {
    public static boolean initialized;
    public static Activity mActivity;
    public static CopyOnWriteArrayList<ExceptionCatcher> sExceptionCatchers = new CopyOnWriteArrayList<>();

    /* loaded from: classes7.dex */
    public static class DeadException implements ExceptionCatcher {
        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean registerCondition() {
            return true;
        }

        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean analysis(Throwable th) {
            if (!(th instanceof InvocationTargetException)) {
                return false;
            }
            InvocationTargetException invocationTargetException = (InvocationTargetException) th;
            if (!(invocationTargetException.getTargetException() instanceof DeadObjectException) && !(invocationTargetException.getTargetException() instanceof DeadSystemException)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static class LaunchActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = activity;
            LaunchActivityOptimizer.setStartedActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = activity;
            LaunchActivityOptimizer.hookAMS(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0011, B:7:0x0019, B:9:0x0044, B:11:0x0047, B:15:0x007a, B:16:0x004c, B:18:0x0056, B:20:0x005e, B:22:0x006a, B:28:0x0077, B:31:0x007d, B:35:0x0084, B:37:0x008c, B:39:0x0097, B:42:0x001f, B:44:0x0025, B:46:0x0029, B:48:0x0032, B:49:0x003b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0011, B:7:0x0019, B:9:0x0044, B:11:0x0047, B:15:0x007a, B:16:0x004c, B:18:0x0056, B:20:0x005e, B:22:0x006a, B:28:0x0077, B:31:0x007d, B:35:0x0084, B:37:0x008c, B:39:0x0097, B:42:0x001f, B:44:0x0025, B:46:0x0029, B:48:0x0032, B:49:0x003b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Throwable getSafeThrowable(java.lang.Throwable r7) {
        /*
            java.lang.StackTraceElement[] r6 = r7.getStackTrace()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r7 instanceof java.lang.reflect.InvocationTargetException     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L25
            r1 = r7
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1     // Catch: java.lang.Throwable -> L9a
            java.lang.Throwable r0 = r1.getTargetException()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L1f
            java.lang.Throwable r7 = r1.getTargetException()     // Catch: java.lang.Throwable -> L9a
            java.lang.StackTraceElement[] r6 = r7.getStackTrace()     // Catch: java.lang.Throwable -> L9a
        L19:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            goto L42
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9a
            r0.<init>()     // Catch: java.lang.Throwable -> L9a
            goto L40
        L25:
            boolean r0 = r7 instanceof java.lang.reflect.UndeclaredThrowableException     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L19
            r1 = r7
            java.lang.reflect.UndeclaredThrowableException r1 = (java.lang.reflect.UndeclaredThrowableException) r1     // Catch: java.lang.Throwable -> L9a
            java.lang.Throwable r0 = r1.getUndeclaredThrowable()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L3b
            java.lang.Throwable r7 = r1.getUndeclaredThrowable()     // Catch: java.lang.Throwable -> L9a
            java.lang.StackTraceElement[] r6 = r7.getStackTrace()     // Catch: java.lang.Throwable -> L9a
            goto L19
        L3b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9a
            r0.<init>()     // Catch: java.lang.Throwable -> L9a
        L40:
            r7 = r0
            goto L19
        L42:
            r3 = 0
            r5 = 0
        L44:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L9a
            if (r5 >= r0) goto L7d
            r2 = r6[r5]     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L4c
            goto L7a
        L4c:
            java.lang.String r1 = r2.getClassName()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L77
            java.lang.String r0 = "com.ss.android.ugc.aweme.utils.PreventServerSideCrashes"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L7a
            java.lang.Class<java.lang.reflect.Proxy> r0 = java.lang.reflect.Proxy.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L7a
            java.lang.Class<java.lang.reflect.Method> r0 = java.lang.reflect.Method.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L77
            goto L7a
        L77:
            r4.add(r2)     // Catch: java.lang.Throwable -> L9a
        L7a:
            int r5 = r5 + 1
            goto L44
        L7d:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L84
            return r7
        L84:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L9a
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r2]     // Catch: java.lang.Throwable -> L9a
        L8a:
            if (r3 >= r2) goto L97
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0     // Catch: java.lang.Throwable -> L9a
            r1[r3] = r0     // Catch: java.lang.Throwable -> L9a
            int r3 = r3 + 1
            goto L8a
        L97:
            r7.setStackTrace(r1)     // Catch: java.lang.Throwable -> L9a
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.LaunchActivityOptimizer.getSafeThrowable(java.lang.Throwable):java.lang.Throwable");
    }

    public static void hookAMS(boolean z) {
        Field declaredField;
        if (initialized) {
            return;
        }
        initialized = true;
        HackHelper.init();
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            return;
        }
        try {
            if (i >= 26) {
                declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            } else {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            final Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                return;
            }
            if (z) {
                declaredField2.set(obj, Proxy.newProxyInstance(C16880lQ.LLLLIIIILLL().getContextClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, new InvocationHandler() { // from class: com.bytedance.sysoptimizer.LaunchActivityOptimizer.1
                    public static Object com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(Method method, Object obj3, Object[] objArr) {
                        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj3, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "9025970997825519998"));
                        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj3, objArr);
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj3, Method method, Object[] objArr) {
                        if (method.getName().contains("reportSizeConfigurations") && Build.VERSION.SDK_INT >= 24) {
                            try {
                                return com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(method, obj2, objArr);
                            } catch (InvocationTargetException e) {
                                if (e.getTargetException() instanceof IllegalArgumentException) {
                                    return null;
                                }
                            }
                        }
                        if (method.getName().contains("isTopOfTask") && Build.VERSION.SDK_INT >= 24) {
                            try {
                                return com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(method, obj2, objArr);
                            } catch (InvocationTargetException e2) {
                                if (e2.getTargetException() instanceof IllegalArgumentException) {
                                    return Boolean.FALSE;
                                }
                            }
                        }
                        if (method.getName().contains("willActivityBeVisible")) {
                            try {
                                LaunchActivityOptimizer.mActivity.isImmersive();
                            } catch (IllegalArgumentException unused) {
                                Activity activity = LaunchActivityOptimizer.mActivity;
                                if (activity != null) {
                                    activity.finish();
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        try {
                            return com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(method, obj2, objArr);
                        } catch (Throwable th) {
                            Iterator<ExceptionCatcher> it = LaunchActivityOptimizer.sExceptionCatchers.iterator();
                            while (it.hasNext()) {
                                if (it.next().analysis(th)) {
                                    return null;
                                }
                            }
                            throw LaunchActivityOptimizer.getSafeThrowable(th);
                        }
                    }
                }));
            } else {
                declaredField2.set(obj, obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    public static void registerExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher == null || !exceptionCatcher.registerCondition() || sExceptionCatchers.contains(exceptionCatcher)) {
            return;
        }
        sExceptionCatchers.add(exceptionCatcher);
    }

    public static void setStartedActivity(Activity activity) {
        Field declaredField = getDeclaredField(activity, "mStartedActivity");
        if (declaredField != null) {
            try {
                declaredField.setAccessible(true);
                declaredField.set(activity, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    public static void unRegisterExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher == null) {
            return;
        }
        sExceptionCatchers.remove(exceptionCatcher);
    }

    public static Field getDeclaredField(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                Field field = HackHelper.getField(cls, str);
                if (field != null) {
                    return field;
                }
            }
        }
        return null;
    }
}
