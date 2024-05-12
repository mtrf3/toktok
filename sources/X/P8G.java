package X;

import android.content.Context;
import android.os.storage.StorageManager;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class P8G {
    public static P8G LJI;
    public static volatile boolean LJII;
    public static Context LJIIIIZZ;
    public final P8F LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public volatile Boolean LJ;
    public File LJFF;

    public final String LIZIZ() {
        P8E p8e;
        Method method;
        Object obj;
        P8F p8f = this.LIZ;
        String str = "unknown";
        if (p8f == null || (method = (p8e = (P8E) p8f).LIZ) == null || (obj = p8e.LIZIZ) == null) {
            return "unknown";
        }
        try {
            str = (String) P8E.LIZ(obj, method, new Object[0]);
            return str;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return str;
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0091 -> B:31:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8G.LIZJ():boolean");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state=");
        LIZ.append(LIZIZ());
        LIZ.append(", totalSize=");
        LIZ.append(this.LIZJ);
        LIZ.append(", availableSize=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", path=");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public static P8G LIZ(Context context) {
        LJIIIIZZ = C16880lQ.LLLLL(context);
        if (!LJII) {
            synchronized (P8G.class) {
                if (!LJII) {
                    try {
                        try {
                            StorageManager storageManager = (StorageManager) C16880lQ.LLILL(context, "storage");
                            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                            Method method2 = cls.getMethod("getPathFile", new Class[0]);
                            Method method3 = cls.getMethod("isRemovable", new Class[0]);
                            Method method4 = cls.getMethod("getState", new Class[0]);
                            Object invoke = method.invoke(storageManager, new Object[0]);
                            int length = Array.getLength(invoke);
                            for (int i = 0; i < length; i++) {
                                Object obj = Array.get(invoke, i);
                                if (((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                                    File file = (File) method2.invoke(obj, new Object[0]);
                                    P8G p8g = new P8G(new P8E(obj, method4), file.getFreeSpace(), file.getTotalSpace(), file.getPath());
                                    LJI = p8g;
                                    return p8g;
                                }
                            }
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    } finally {
                        LJII = true;
                    }
                }
            }
        }
        return LJI;
    }

    public P8G(P8E p8e, long j, long j2, String str) {
        this.LIZ = p8e;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
    }
}
