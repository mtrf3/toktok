package com.bytedance.geckox.utils;

import X.C16880lQ;
import X.C25620zW;
import X.V3N;
import X.X1D;
import android.content.Context;
import android.os.Process;
import com.bytedance.librarian.Librarian;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class FileLock {
    public static final Map<String, Integer> LIZJ = new HashMap();
    public final int LIZ;
    public final String LIZIZ;

    public static native int nGetFD(String str);

    public static native void nLockFile(int i);

    public static native void nLockFileSegment(int i, int i2);

    public static native void nRelease(int i);

    public static native boolean nTryLock(int i);

    public static native void nUnlockFile(int i);

    static {
        Context context = V3N.LJLIL;
        if (context == null) {
            C16880lQ.LLJJJIL("file_lock");
        } else {
            Librarian.LJFF(context, "file_lock");
        }
    }

    public final void LIZLLL() {
        Integer num;
        Map<String, Integer> map = LIZJ;
        synchronized (map) {
            num = (Integer) ((HashMap) map).remove(this.LIZIZ);
        }
        try {
            nRelease(num.intValue());
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release lock failed, file:");
            LIZ.append(this.LIZIZ);
            LIZ.append(" caused by:");
            LIZ.append(e.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LJI() {
        try {
            nUnlockFile(this.LIZ);
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release lock failed，path:");
            LIZ.append(this.LIZIZ);
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        }
    }

    public static int LIZ(String str) {
        Integer num;
        Map<String, Integer> map = LIZJ;
        synchronized (map) {
            num = (Integer) ((HashMap) map).get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                ((HashMap) map).put(str, num);
            }
        }
        return num.intValue();
    }

    public static FileLock LIZIZ(String str) {
        try {
            int LIZ = LIZ(str);
            nLockFile(LIZ);
            return new FileLock(str, LIZ);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("lock failed, file:", str, ", pid:");
            LIZIZ.append(Process.myPid());
            LIZIZ.append(" caused by:");
            LIZIZ.append(e.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZIZ));
        }
    }

    public static FileLock LJ(String str) {
        try {
            int LIZ = LIZ(str);
            if (!nTryLock(LIZ)) {
                return null;
            }
            return new FileLock(str, LIZ);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("try lock failed, file:", str, " caused by:");
            LIZIZ.append(e.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZIZ));
        }
    }

    public static FileLock LJFF(String str) {
        try {
            int LIZ = LIZ(str);
            if (!nTryLock(LIZ)) {
                new FileLock(str, LIZ).LIZLLL();
                return null;
            }
            return new FileLock(str, LIZ);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("try lock failed, file:", str, " caused by:");
            LIZIZ.append(e.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZIZ));
        }
    }

    public FileLock(String str, int i) {
        this.LIZIZ = str;
        this.LIZ = i;
    }

    public static FileLock LIZJ(int i, String str) {
        try {
            int LIZ = LIZ(str);
            nLockFileSegment(LIZ, i);
            return new FileLock(str, LIZ);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("lock segment failed, file:", str, " caused by:");
            LIZIZ.append(e.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZIZ));
        }
    }
}
