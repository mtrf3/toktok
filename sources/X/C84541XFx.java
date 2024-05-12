package X;

import Y.IDComparatorS43S0000000_15;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.XFx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84541XFx {
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJI;
    public static String LJII;
    public static volatile boolean LJIIIIZZ;
    public final int LIZ = 5;
    public final int LIZIZ = 1;

    public C84541XFx(Context context) {
        C16880lQ.LLLLL(context);
        if (!LJI) {
            synchronized (C84541XFx.class) {
                if (!LJI) {
                    if (!C38354F3m.LJ(context.getPackageName())) {
                        LJI = true;
                        File LLIIIZ = C16880lQ.LLIIIZ(context);
                        if (LLIIIZ != null || (LLIIIZ = C16880lQ.LLIIIZ(context)) != null || (LLIIIZ = C16880lQ.LLIIIL(context)) != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(LLIIIZ.getPath());
                            LIZ.append("/");
                            LIZJ = X1D.LIZIZ(LIZ);
                        }
                        try {
                            LJII = C36980EfI.LIZJ(context);
                        } catch (Exception unused) {
                            LJII = null;
                        }
                        if (!C38354F3m.LJ(LJII)) {
                            LJFF = LJII + "/hashedimages/";
                        } else {
                            LJFF = null;
                        }
                        LIZLLL = LIZJ + "hashedimages/";
                        LJ = LIZJ + "tmpimages/";
                        try {
                            if ("mounted".equals(C16880lQ.LLLLLLLZIL())) {
                                File file = new File(LIZJ);
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                File file2 = new File(LIZLLL);
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                File file3 = new File(LJ);
                                if (!file3.exists()) {
                                    file3.mkdirs();
                                }
                            }
                        } catch (Exception e) {
                            if (Logger.debug()) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        if (!C38354F3m.LJ(LJFF)) {
                            File file4 = new File(LJFF);
                            if (!file4.exists()) {
                                file4.mkdirs();
                            }
                        }
                    }
                }
            }
        }
    }

    public static long LIZ(long j, String str) {
        XG0 xg0 = new XG0();
        V1B.LL(new File(str), xg0);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(xg0.LIZ));
        Collections.sort(arrayList, new IDComparatorS43S0000000_15(1));
        Iterator it = arrayList.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            XG1 xg1 = (XG1) it.next();
            j2 += xg1.LIZIZ;
            if (j2 > j) {
                File file = new File(xg1.LIZJ);
                file.getName();
                try {
                    C16880lQ.LLLZZIL(file);
                } catch (Exception unused) {
                }
            }
        }
        return j2;
    }

    public static void LIZIZ(int i, File file) {
        File[] listFiles;
        File[] listFiles2;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && file2.exists() && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null && listFiles2.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = i * 24 * 3600 * 1000;
                for (File file3 : listFiles2) {
                    if (file3.isFile()) {
                        file3.getName();
                        try {
                            if (currentTimeMillis - file3.lastModified() > j) {
                                C16880lQ.LLLZZIL(file3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }
}
