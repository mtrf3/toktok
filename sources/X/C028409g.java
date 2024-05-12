package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: X.09g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C028409g {
    public static final Object LIZ = new Object();
    public static C028309f LIZIZ = null;

    public static void LIZ(Context context, boolean z) {
        boolean z2;
        boolean z3;
        C028209e LIZ2;
        int i;
        if (!z && LIZIZ != null) {
            return;
        }
        synchronized (LIZ) {
            if (!z) {
                if (LIZIZ != null) {
                    return;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                if (file.exists() && length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                if (file2.exists() && length2 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    long j = C16880lQ.LLLLLLZ(C16880lQ.LLLLL(context).getPackageManager(), context.getPackageName(), 0).lastUpdateTime;
                    File file3 = new File(C16880lQ.LLIIJLIL(context), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            LIZ2 = C028209e.LIZ(file3);
                        } catch (IOException unused) {
                            LIZIZ = new C028309f(131072, z2, z3);
                            return;
                        }
                    } else {
                        LIZ2 = null;
                    }
                    if (LIZ2 == null || LIZ2.LIZJ != j || (i = LIZ2.LIZIZ) == 2) {
                        if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                    } else {
                        i3 = i;
                    }
                    if (z && z3 && i3 != 1) {
                        i3 = 2;
                    }
                    if (LIZ2 != null && LIZ2.LIZIZ == 2 && i3 == 1 && length < LIZ2.LIZLLL) {
                        i3 = 3;
                    }
                    C028209e c028209e = new C028209e(j, 1, i3, length2);
                    if (LIZ2 == null || !LIZ2.equals(c028209e)) {
                        try {
                            c028209e.LIZIZ(file3);
                        } catch (IOException unused2) {
                            i3 = 196608;
                        }
                    }
                    LIZIZ = new C028309f(i3, z2, z3);
                    return;
                } catch (PackageManager.NameNotFoundException unused3) {
                    LIZIZ = new C028309f(65536, z2, z3);
                    return;
                }
            }
            LIZIZ = new C028309f(262144, false, false);
        }
    }
}
