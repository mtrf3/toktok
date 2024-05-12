package com.ttnet.org.chromium.base;

import X.C0MA;
import X.C119984nK;
import X.C1HQ;
import X.C38643FEp;
import X.C38645FEr;
import X.O6T;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public class BundleUtils {
    public static final Object LIZ = new Object();
    public static final C0MA<String, ClassLoader> LIZIZ = new C0MA<>();
    public static final Map<String, ClassLoader> LIZJ = Collections.synchronizedMap(new C1HQ());

    public static boolean isBundleForNative() {
        return false;
    }

    public static Context LIZ(Context context, String str) {
        boolean z;
        Context createContextForSplit;
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            return context;
        }
        Context context2 = context;
        while (true) {
            try {
                if (context2 instanceof ContextWrapper) {
                    if (!(context2 instanceof Application)) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if (z) {
            C38645FEr c38645FEr = new C38645FEr(StrictMode.allowThreadDiskReads(), null);
            try {
                createContextForSplit = context.createContextForSplit(str);
                c38645FEr.close();
            } finally {
            }
        } else {
            synchronized (LIZ) {
                C38645FEr c38645FEr2 = new C38645FEr(StrictMode.allowThreadDiskReads(), null);
                try {
                    createContextForSplit = context.createContextForSplit(str);
                    c38645FEr2.close();
                } finally {
                }
            }
        }
        createContextForSplit.getClassLoader().getParent();
        C0MA<String, ClassLoader> c0ma = LIZIZ;
        synchronized (c0ma) {
            ClassLoader orDefault = c0ma.getOrDefault(str, null);
            if (orDefault != null) {
                if (!orDefault.equals(createContextForSplit.getClassLoader())) {
                    Context context3 = createContextForSplit;
                    while (context3 instanceof ContextWrapper) {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                    try {
                        Field declaredField = context3.getClass().getDeclaredField("mClassLoader");
                        declaredField.setAccessible(true);
                        declaredField.set(context3, orDefault);
                        i = 1;
                    } catch (ReflectiveOperationException e2) {
                        throw new RuntimeException("Error setting ClassLoader.", e2);
                    }
                }
            } else {
                c0ma.put(str, createContextForSplit.getClassLoader());
            }
            i = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Android.IsolatedSplits.ClassLoaderReplaced.");
        LIZ2.append(str);
        C38643FEp.LIZ.LIZIZ(1, i, X1D.LIZIZ(LIZ2), 0, 0, 0);
        return createContextForSplit;
    }

    public static String LIZIZ(String str, String str2) {
        ApplicationInfo applicationInfo;
        String[] strArr;
        int binarySearch;
        if (Build.VERSION.SDK_INT < 26 || (strArr = (applicationInfo = O6T.LIZ.getApplicationInfo()).splitNames) == null || (binarySearch = Arrays.binarySearch(strArr, str2)) < 0) {
            return null;
        }
        try {
            String str3 = (String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(applicationInfo.splitSourceDirs[binarySearch]);
            LIZ2.append("!/lib/");
            LIZ2.append(str3);
            LIZ2.append("/");
            LIZ2.append(System.mapLibraryName(str));
            return X1D.LIZIZ(LIZ2);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNativeLibraryPath(String str, String str2) {
        String str3 = null;
        C38645FEr c38645FEr = new C38645FEr(StrictMode.allowThreadDiskReads(), null);
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                c38645FEr.close();
                return findLibrary;
            }
            ClassLoader classLoader = O6T.LIZ.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                str3 = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof C119984nK) {
                ((C119984nK) classLoader).getClass();
            } else {
                str3 = findLibrary;
            }
            if (str3 != null) {
                c38645FEr.close();
                return str3;
            }
            String LIZIZ2 = LIZIZ(str, str2);
            c38645FEr.close();
            return LIZIZ2;
        } catch (Throwable th) {
            try {
                c38645FEr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
