package com.ss.android.ugc.aweme.sp;

import X.C16880lQ;
import X.C38483F8l;
import X.C56662Kg;
import X.FAM;
import X.InstrumentationC38480F8i;
import X.PSH;
import android.app.Instrumentation;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.a1;
import defpackage.i0;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class SharedPreferencesManager {
    public Constructor constructor;
    public boolean hasObtained;
    public HashMap lockMap;
    public Map<String, File> mOrignalSharedPrefsPaths;
    public File mPreferencesDir;
    public Map<String, File> mSharedPrefsPaths;
    public Map<File, SharedPreferences> sSharedPrefsCache;
    public Class<?> sharedPreferencesImplClass;

    public static void hookInstrumentation() {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke == null || (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) == null) {
                return;
            }
            declaredField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
            if (instrumentation != null && !(instrumentation instanceof InstrumentationC38480F8i)) {
                declaredField.set(invoke, new InstrumentationC38480F8i(instrumentation));
            }
        } catch (Exception unused) {
        }
    }

    public SharedPreferencesManager() {
        this.sSharedPrefsCache = Collections.synchronizedMap(new HashMap());
        this.mSharedPrefsPaths = Collections.synchronizedMap(new HashMap());
        this.lockMap = new HashMap();
    }

    public static SharedPreferencesManager getInstance() {
        return C38483F8l.LIZ;
    }

    public static File ensurePrivateDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        }
        return C16880lQ.LLIIJLIL(context).getParentFile();
    }

    private File getDataDirAbove24(Context context) {
        return context.getDataDir();
    }

    private File getPreferencesDir(Context context) {
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new File(getDataDir(context), "shared_prefs");
        }
        File file = this.mPreferencesDir;
        ensurePrivateDirExists(file);
        return file;
    }

    private File getSharedPreferencesPath(Context context, String str) {
        return makeFilename(getPreferencesDir(context), i0.LJFF(str, ".xml"));
    }

    private File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException(a1.LJ("File ", str, " contains a path separator"));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #1 {, blocks: (B:24:0x003b, B:26:0x0045, B:28:0x004d, B:30:0x0051, B:35:0x0064, B:37:0x006e, B:42:0x0081, B:43:0x0089, B:50:0x008b, B:57:0x008e, B:59:0x0092, B:61:0x0098, B:63:0x009a, B:64:0x009f), top: B:23:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[Catch: all -> 0x00a1, TryCatch #1 {, blocks: (B:24:0x003b, B:26:0x0045, B:28:0x004d, B:30:0x0051, B:35:0x0064, B:37:0x006e, B:42:0x0081, B:43:0x0089, B:50:0x008b, B:57:0x008e, B:59:0x0092, B:61:0x0098, B:63:0x009a, B:64:0x009f), top: B:23:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #1 {, blocks: (B:24:0x003b, B:26:0x0045, B:28:0x004d, B:30:0x0051, B:35:0x0064, B:37:0x006e, B:42:0x0081, B:43:0x0089, B:50:0x008b, B:57:0x008e, B:59:0x0092, B:61:0x0098, B:63:0x009a, B:64:0x009f), top: B:23:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.SharedPreferences getSharedPreferences(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L9
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto La
        L9:
            return r7
        La:
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths
            java.lang.Object r6 = r0.get(r10)
            java.io.File r6 = (java.io.File) r6
            if (r6 != 0) goto La4
            long r1 = android.os.SystemClock.uptimeMillis()
            java.util.HashMap r0 = r8.lockMap
            java.lang.Object r5 = r0.get(r10)
            if (r5 != 0) goto L3a
            java.util.HashMap r3 = r8.lockMap
            monitor-enter(r3)
            java.util.HashMap r0 = r8.lockMap     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r0.get(r10)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L35
            java.lang.Object r5 = new java.lang.Object     // Catch: java.lang.Throwable -> L37
            r5.<init>()     // Catch: java.lang.Throwable -> L37
            java.util.HashMap r0 = r8.lockMap     // Catch: java.lang.Throwable -> L37
            r0.put(r10, r5)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths     // Catch: java.lang.Throwable -> La1
            java.lang.Object r6 = r0.get(r10)     // Catch: java.lang.Throwable -> La1
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> La1
            if (r6 != 0) goto L9f
            java.io.File r6 = r8.getSharedPreferencesPath(r9, r10)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r8.hasObtained     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L8e
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mOrignalSharedPrefsPaths     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L8e
            java.lang.reflect.Field r3 = X.C38482F8k.LIZ     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L56
            goto L61
        L56:
            boolean r0 = r9 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L61
            java.lang.Object r4 = r3.get(r9)     // Catch: java.lang.Throwable -> L61
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
            r4 = r7
        L62:
            if (r4 != 0) goto L6c
            java.lang.String r0 = "mBase"
            java.lang.Object r4 = X.C36538EVq.LIZJ(r9, r0)     // Catch: java.lang.Throwable -> La1
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> La1
        L6c:
            if (r4 == 0) goto L8b
            java.lang.reflect.Field r3 = X.C38482F8k.LIZIZ     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L73
            goto L7e
        L73:
            boolean r0 = r4 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r3.get(r4)     // Catch: java.lang.Throwable -> L7e
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r0 = r7
        L7f:
            if (r0 != 0) goto L89
            java.lang.String r0 = "mSharedPrefsPaths"
            java.lang.Object r0 = X.C36538EVq.LIZJ(r4, r0)     // Catch: java.lang.Throwable -> La1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La1
        L89:
            r8.mOrignalSharedPrefsPaths = r0     // Catch: java.lang.Throwable -> La1
        L8b:
            r0 = 1
            r8.hasObtained = r0     // Catch: java.lang.Throwable -> La1
        L8e:
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mOrignalSharedPrefsPaths     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L9a
            boolean r0 = r0.containsValue(r6)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L9a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La1
            return r7
        L9a:
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths     // Catch: java.lang.Throwable -> La1
            r0.put(r10, r6)     // Catch: java.lang.Throwable -> La1
        L9f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La1
            goto La6
        La1:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La1
            throw r0
        La4:
            r1 = 0
        La6:
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r10, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.SharedPreferencesManager.getSharedPreferences(android.content.Context, java.lang.String):android.content.SharedPreferences");
    }

    public SharedPreferences getSharedPreferences(String name, File file, long j) {
        SharedPreferences sharedPreferences = this.sSharedPrefsCache.get(file);
        if (sharedPreferences == null) {
            if (j == 0) {
                j = SystemClock.uptimeMillis();
            }
            synchronized (file) {
                sharedPreferences = this.sSharedPrefsCache.get(file);
                if (sharedPreferences == null) {
                    sharedPreferences = new PSH(name, file);
                    this.sSharedPrefsCache.put(file, sharedPreferences);
                }
            }
        }
        FAM LIZ = C56662Kg.LIZ();
        LIZ.getClass();
        o.LJIIIZ(name, "name");
        if (j > 0 && o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZ.LJIILJJIL.put(name, Long.valueOf(SystemClock.uptimeMillis() - j));
        }
        return sharedPreferences;
    }
}
