package X;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EeQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36926EeQ {
    public static final String LIZ = new String(C71745SDt.LJLIL);
    public static final String LIZIZ = new String(C71745SDt.LJLILLLLZI);
    public static final String LIZJ = new String(C71745SDt.LJLJI);
    public static final String LIZLLL = new String(C71745SDt.LJLJJI);
    public static final String LJ = new String(C71745SDt.LJLJJL);
    public static final String LJFF = new String(C71745SDt.LJLJJLL);
    public static final HashSet<String> LJI = new HashSet<>();
    public static final HashSet<String> LJII = new HashSet<>();
    public static final HashSet<String> LJIIIIZZ = new HashSet<>();
    public static String LJIIIZ = null;
    public static int LJIIJ = 0;
    public static String LJIIJJI = null;
    public static String LJIIL = null;
    public static String LJIILIIL = null;
    public static boolean LJIILJJIL = false;
    public static final C36507EUl<Integer> LJIILL = new C36507EUl<>(new Class[0]);

    public static String LJFF() {
        String str = LJIIJJI;
        if (str != null) {
            return str;
        }
        String str2 = LIZ;
        HashSet<String> hashSet = LJII;
        if (hashSet.isEmpty() || hashSet.contains(str2)) {
            LJIIJJI = str2;
            return str2;
        }
        Iterator<String> it = hashSet.iterator();
        String str3 = null;
        while (it.hasNext()) {
            str3 = it.next();
            if (str3.startsWith(str2)) {
                LJIIJJI = str3;
                return str3;
            }
        }
        LJIIJJI = str3;
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:6:0x0007, B:9:0x000f, B:19:0x001c, B:13:0x0027, B:15:0x002f, B:17:0x0037, B:22:0x0058), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r5) {
        /*
            boolean r0 = X.C36926EeQ.LJIILJJIL
            if (r0 != 0) goto L5d
            java.util.HashSet<java.lang.String> r4 = X.C36926EeQ.LJI
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L58
            if (r5 == 0) goto L58
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r0.dataDir     // Catch: java.lang.Throwable -> L5a
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L5a
            r0.<init>(r1)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L5a
            java.lang.String r3 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L5a
            goto L27
        L26:
            r3 = r1
        L27:
            r4.add(r1)     // Catch: java.lang.Throwable -> L5a
            r4.add(r3)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L58
            java.lang.String r2 = X.C36926EeQ.LIZLLL     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r3.startsWith(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L58
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L5a
            r1.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r5.getPackageName()     // Catch: java.lang.Throwable -> L5a
            r1.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = LIZLLL(r3)     // Catch: java.lang.Throwable -> L5a
            r4.add(r1)     // Catch: java.lang.Throwable -> L5a
            r4.add(r0)     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L5a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            throw r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36926EeQ.LIZ(android.content.Context):void");
    }

    public static void LIZIZ(Context context) {
        if (!LJIILJJIL) {
            synchronized (LJIIIIZZ) {
                Iterator<String> it = LJII.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    HashSet<String> hashSet = LJIIIIZZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(next);
                    LIZ2.append(LIZIZ);
                    LIZ2.append("/");
                    LIZ2.append(context.getPackageName());
                    hashSet.add(X1D.LIZIZ(LIZ2));
                }
            }
        }
    }

    public static HashSet<String> LIZJ(Context context) {
        if (!LJIILJJIL) {
            HashSet<String> hashSet = LJII;
            synchronized (hashSet) {
                if (hashSet.isEmpty() && context != null) {
                    try {
                        String str = LIZ;
                        if (new File(str).exists()) {
                            hashSet.add(str);
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String str2 = LIZJ + "/" + LJIIJ;
                        if (new File(str2).exists()) {
                            LJII.add(str2);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        LJII.addAll(LJ(context));
                    } catch (Exception unused3) {
                    }
                    if (Build.VERSION.SDK_INT > 28) {
                        HashSet<String> hashSet2 = LJII;
                        hashSet2.add(LIZ);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZJ);
                        LIZ2.append("/");
                        LIZ2.append(LJIIJ);
                        hashSet2.add(X1D.LIZIZ(LIZ2));
                    }
                    HashSet hashSet3 = new HashSet();
                    Iterator<String> it = LJII.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!TextUtils.isEmpty(next)) {
                            try {
                                next = new File(next).getCanonicalPath();
                            } catch (IOException unused4) {
                            }
                        }
                        if (next != null) {
                            hashSet3.add(next);
                        }
                    }
                    LJII.addAll(hashSet3);
                }
            }
        }
        return LJII;
    }

    public static String LIZLLL(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        String str2 = LIZLLL;
        LIZ2.append(str2);
        LIZ2.append("/");
        if (str.startsWith(X1D.LIZIZ(LIZ2))) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJ);
            LIZ3.append("/");
            LIZ3.append(LJIIJ);
            LIZ3.append(str.substring(str2.length()));
            return X1D.LIZIZ(LIZ3);
        }
        return str;
    }

    public static List<String> LJ(Context context) {
        HashSet hashSet = new HashSet();
        try {
            StorageManager storageManager = (StorageManager) C16880lQ.LLILL(context, "storage");
            Method declaredMethod = StorageManager.class.getDeclaredMethod(LJFF, new Class[0]);
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(storageManager, new Object[0]);
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    hashSet.add(str);
                }
            }
        } catch (Exception unused) {
        }
        return new ArrayList(hashSet);
    }

    public static void LJI(Context context) {
        LJIIL = context.getApplicationInfo().dataDir;
        try {
            File LLIIIZ = C16880lQ.LLIIIZ(context);
            if (LLIIIZ != null) {
                String parent = LLIIIZ.getParent();
                LJIILIIL = parent;
                if (parent != null) {
                    Iterator<String> it = LIZJ(context).iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (LJIILIIL.startsWith(next)) {
                            LJIIJJI = next;
                            return;
                        }
                    }
                    LJIILIIL = null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
