package X;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import com.facebook.soloader.Api18TraceUtils;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Fgz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39633Fgz {
    public static InterfaceC37245EjZ LIZIZ;
    public static X78[] LJFF;
    public static C39632Fgy LJI;
    public static int LJIIJJI;
    public static final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public static volatile AbstractC39635Fh1[] LIZLLL = null;
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static final HashSet<String> LJII = new HashSet<>();
    public static final java.util.Map<String, Object> LJIIIIZZ = new HashMap();
    public static final java.util.Set<String> LJIIIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final String[] LJIIJ = {System.mapLibraryName("breakpad")};
    public static int LJIIL = 0;
    public static final boolean LIZ = true;

    public static synchronized void LJ() {
        Method method;
        String str;
        synchronized (C39633Fgz.class) {
            if (LIZIZ != null) {
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            String str2 = null;
            if (i >= 23 && i <= 27) {
                try {
                    method = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                    method.setAccessible(true);
                    str = SysUtil.Api14Utils.LIZ();
                    if (str != null) {
                        String[] split = str.split(":");
                        ArrayList arrayList = new ArrayList(split.length);
                        for (String str3 : split) {
                            if (!str3.contains("!")) {
                                arrayList.add(str3);
                            }
                        }
                        str2 = TextUtils.join(":", arrayList);
                    }
                } catch (NoSuchMethodException | SecurityException unused) {
                }
                LIZIZ = new C37244EjY(z, str, str2, runtime, method);
            }
            method = null;
            z = false;
            str = null;
            LIZIZ = new C37244EjY(z, str, str2, runtime, method);
        }
    }

    public static boolean LJI() {
        boolean z = true;
        if (LIZLLL != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (LIZLLL == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            LIZJ.readLock().unlock();
            throw th;
        }
    }

    public static void LIZLLL(Context context) {
        int i;
        String[] strArr = LJIIJ;
        if (LJI()) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            int i2 = LJIIL;
            if (i2 == 0) {
                if (context != null) {
                    int i3 = context.getApplicationInfo().flags;
                    if ((i3 & 1) != 0) {
                        if ((i3 & 128) != 0) {
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                    }
                }
                i2 = 1;
            }
            LJIIL = i2;
            if (SysUtil.LIZJ(i2, context)) {
                i = 72;
            } else {
                i = 0;
            }
            LJ();
            LJFF(context, i, strArr);
            QCU qcu = new QCU();
            synchronized (C77125UOr.class) {
                if (!C77125UOr.LJIJJLI()) {
                    C77125UOr.LJIJJ(qcu);
                }
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void LJII(String str) {
        boolean z;
        Boolean valueOf;
        if (LIZLLL == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (LIZLLL == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        if (!LJI()) {
                            throw new IllegalStateException("SoLoader.init() not yet called");
                        }
                    } else {
                        synchronized (C39633Fgz.class) {
                            boolean z2 = !LJII.contains(str);
                            if (z2) {
                                C16880lQ.LLJJJIL(str);
                            }
                            valueOf = Boolean.valueOf(z2);
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        if (valueOf != null) {
                            valueOf.booleanValue();
                            return;
                        }
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
            } catch (Throwable th) {
                LIZJ.readLock().unlock();
                throw th;
            }
        }
        String mapLibraryName = System.mapLibraryName(str);
        do {
            z = false;
            try {
                LJIIIIZZ(mapLibraryName, str, 0, null);
                return;
            } catch (UnsatisfiedLinkError e) {
                int i = LJ.get();
                LIZJ.writeLock().lock();
                try {
                    try {
                        if (LJI != null && LJI.LIZJ()) {
                            LJ.getAndIncrement();
                            z = true;
                        }
                        LIZJ.writeLock().unlock();
                        if (LJ.get() == i) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    LIZJ.writeLock().unlock();
                    throw th2;
                }
            }
        } while (z);
    }

    public static void LIZ(Context context, ArrayList arrayList) {
        if ((LJIIJJI & 8) != 0) {
            LJFF = null;
            try {
                SysUtil.LIZ(X78.LJIIIZ(context, "lib-main"));
                return;
            } catch (IOException unused) {
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C84304X6u(context, file, "lib-main"));
        if (context.getApplicationInfo().splitSourceDirs != null) {
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                File file2 = new File(strArr[i]);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lib-");
                LIZ2.append(i2);
                arrayList2.add(new C84304X6u(context, file2, X1D.LIZIZ(LIZ2)));
                i++;
                i2++;
            }
        }
        LJFF = (X78[]) arrayList2.toArray(new X78[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[LOOP:0: B:12:0x0035->B:14:0x003b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.ArrayList<X.AbstractC39635Fh1> r4, java.lang.String[] r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L50
            boolean r0 = com.facebook.soloader.SysUtil.MarshmallowSysdeps.is64Bit()
        La:
            if (r0 == 0) goto L55
            java.lang.String r3 = "/system/lib64:/vendor/lib64"
        Le:
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r1 = java.lang.System.getenv(r0)
            java.lang.String r2 = ":"
            if (r1 == 0) goto L24
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            java.lang.String r3 = defpackage.a1.LJ(r3, r2, r1)
        L24:
            java.util.HashSet r1 = new java.util.HashSet
            java.lang.String[] r0 = r3.split(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L35:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            X.Fgx r1 = new X.Fgx
            r0 = 2
            r1.<init>(r2, r0, r5)
            r4.add(r1)
            goto L35
        L50:
            boolean r0 = com.facebook.soloader.SysUtil.LollipopSysdeps.is64Bit()     // Catch: java.lang.Exception -> L55
            goto La
        L55:
            java.lang.String r3 = "/system/lib:/vendor/lib"
            goto Le
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39633Fgz.LIZIZ(java.util.ArrayList, java.lang.String[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39633Fgz.LIZJ(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    public static void LJFF(Context context, int i, String[] strArr) {
        int i2;
        if (LIZLLL != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        reentrantReadWriteLock.writeLock().lock();
        if (LIZLLL != null) {
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        try {
            LJIIJJI = i;
            ArrayList arrayList = new ArrayList();
            LIZIZ(arrayList, strArr);
            int i3 = 0;
            if (context != null) {
                if ((i & 1) == 0) {
                    if ((i & 64) != 0) {
                        if (context.getApplicationInfo().splitSourceDirs != null) {
                            for (String str : context.getApplicationInfo().splitSourceDirs) {
                                arrayList.add(0, new C39630Fgw(new File(str)));
                            }
                        }
                        arrayList.add(0, new C39630Fgw(context));
                    }
                    int i4 = LJIIL;
                    if (i4 != 1) {
                        if (i4 == 2 || i4 == 3) {
                            i2 = 1;
                        } else {
                            throw new RuntimeException("Unsupported app type, we should not reach here");
                        }
                    } else {
                        i2 = 0;
                    }
                    C39632Fgy c39632Fgy = new C39632Fgy(context, i2);
                    LJI = c39632Fgy;
                    arrayList.add(0, c39632Fgy);
                    LIZ(context, arrayList);
                } else {
                    LJFF = null;
                    arrayList.add(0, new X77(context));
                }
            }
            AbstractC39635Fh1[] abstractC39635Fh1Arr = (AbstractC39635Fh1[]) arrayList.toArray(new AbstractC39635Fh1[arrayList.size()]);
            ReentrantReadWriteLock reentrantReadWriteLock2 = LIZJ;
            reentrantReadWriteLock2.writeLock().lock();
            if ((LJIIJJI & 2) != 0) {
                i3 = 1;
            }
            reentrantReadWriteLock2.writeLock().unlock();
            int length = abstractC39635Fh1Arr.length;
            while (true) {
                int i5 = length - 1;
                if (length > 0) {
                    boolean z = LIZ;
                    if (z) {
                        Api18TraceUtils.LIZ("SoLoader", "_", C16880lQ.LJLLJ(abstractC39635Fh1Arr[i5].getClass()));
                    }
                    abstractC39635Fh1Arr[i5].LIZIZ(i3);
                    if (z) {
                        Trace.endSection();
                    }
                    length = i5;
                } else {
                    LIZLLL = abstractC39635Fh1Arr;
                    LJ.getAndIncrement();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            LIZJ.writeLock().unlock();
        }
    }

    public static boolean LJIIIIZZ(String str, String str2, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && LJIIIZ.contains(str2)) {
            return false;
        }
        synchronized (C39633Fgz.class) {
            HashSet<String> hashSet = LJII;
            if (hashSet.contains(str)) {
                return false;
            }
            java.util.Map<String, Object> map = LJIIIIZZ;
            if (((HashMap) map).containsKey(str)) {
                obj = ((HashMap) map).get(str);
            } else {
                obj = new Object();
                ((HashMap) map).put(str, obj);
            }
            ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    synchronized (C39633Fgz.class) {
                        if (hashSet.contains(str)) {
                            reentrantReadWriteLock.readLock().unlock();
                            return false;
                        }
                        try {
                            LIZJ(str, i, threadPolicy);
                            synchronized (C39633Fgz.class) {
                                hashSet.add(str);
                            }
                            if ((i & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                LJIIIZ.contains(str2);
                            }
                            reentrantReadWriteLock.readLock().unlock();
                            return true;
                        } catch (UnsatisfiedLinkError e) {
                            String message = e.getMessage();
                            if (message != null && message.contains("unexpected e_machine:")) {
                                throw new C39634Fh0(e, message.substring(message.lastIndexOf("unexpected e_machine:")));
                            }
                            throw e;
                        }
                    }
                }
            } catch (Throwable th) {
                LIZJ.readLock().unlock();
                throw th;
            }
        }
    }
}
