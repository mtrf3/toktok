package X;

import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25060yc {
    public static final java.util.Map<String, Lock> LJ = new HashMap();
    public final File LIZ;
    public final Lock LIZIZ;
    public final boolean LIZJ;
    public FileChannel LIZLLL;

    public final void LIZ() {
        FileChannel fileChannel = this.LIZLLL;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.LIZIZ.unlock();
    }

    public C25060yc(File file, String str, boolean z) {
        Lock lock;
        File file2 = new File(file, i0.LJFF(str, ".lck"));
        this.LIZ = file2;
        String absolutePath = file2.getAbsolutePath();
        java.util.Map<String, Lock> map = LJ;
        synchronized (map) {
            lock = (Lock) ((HashMap) map).get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                ((HashMap) map).put(absolutePath, lock);
            }
        }
        this.LIZIZ = lock;
        this.LIZJ = z;
    }
}
