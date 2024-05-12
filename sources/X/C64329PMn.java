package X;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PMn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64329PMn {
    public static MappedByteBuffer LIZ;
    public static FileChannel LIZIZ;
    public static Application LJI;
    public static final Object LIZJ = new Object();
    public static boolean LIZLLL = true;
    public static long LJ = SystemClock.elapsedRealtime();
    public static final long LJFF = System.currentTimeMillis() - LJ;
    public static boolean LJII = true;

    public static boolean LIZ() {
        Application application = LJI;
        if (application != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(application.getFilesDir(), "foreground.status"), "rw");
                LIZIZ = randomAccessFile.getChannel();
                LIZ = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 13L);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static C64331PMp LIZIZ() {
        if (LJI == null || LIZ == null || LIZLLL) {
            return new C64331PMp(Process.myPid(), LJ, LIZLLL);
        }
        try {
            C64331PMp LIZJ2 = LIZJ();
            if (LJII) {
                Application application = LJI;
                o.LJI(application);
                Object LLIZ = C16880lQ.LLIZ("activity", application);
                if (LLIZ != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) LLIZ).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == LIZJ2.LIZ) {
                                if (next != null) {
                                    return LIZJ2;
                                }
                            }
                        }
                    }
                    return new C64331PMp(LIZJ2.LIZ, LIZJ2.LIZJ, false);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            C64330PMo c64330PMo = C64330PMo.LIZLLL;
            int i = LIZJ2.LIZ;
            c64330PMo.getClass();
            if (i == Process.myPid()) {
                return LIZJ2;
            }
            File file = new File(C64330PMo.LIZIZ, String.valueOf(i));
            if (file.isFile()) {
                try {
                    FileLock tryLock = new FileOutputStream(file).getChannel().tryLock();
                    if (tryLock == null) {
                        return LIZJ2;
                    }
                    try {
                        tryLock.release();
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    C16880lQ.LLLZZIL(file);
                } catch (Throwable th2) {
                    if (AnonymousClass028.LJFF(th2) != null) {
                        return LIZJ2;
                    }
                }
            }
            return new C64331PMp(LIZJ2.LIZ, LIZJ2.LIZJ, false);
        } catch (Throwable unused) {
            return new C64331PMp(Process.myPid(), LJ, LIZLLL);
        }
    }

    public static C64331PMp LIZJ() {
        if (LIZIZ == null || LIZ == null) {
            return new C64331PMp(Process.myPid(), LJ, LIZLLL);
        }
        synchronized (LIZJ) {
            MappedByteBuffer mappedByteBuffer = LIZ;
            o.LJI(mappedByteBuffer);
            FileChannel fileChannel = LIZIZ;
            o.LJI(fileChannel);
            if (!fileChannel.isOpen() && !LIZ()) {
                return new C64331PMp(Process.myPid(), LJ, LIZLLL);
            }
            FileChannel fileChannel2 = LIZIZ;
            o.LJI(fileChannel2);
            FileLock lock = fileChannel2.lock();
            boolean z = false;
            mappedByteBuffer.position(0);
            int i = mappedByteBuffer.getInt();
            byte b = mappedByteBuffer.get();
            long j = mappedByteBuffer.getLong();
            lock.release();
            if (b == 1) {
                z = true;
            }
            return new C64331PMp(i, j, z);
        }
    }

    public static void LIZLLL(boolean z) {
        LIZLLL = z;
        LJ = SystemClock.elapsedRealtime();
        MappedByteBuffer mappedByteBuffer = LIZ;
        if (mappedByteBuffer == null || LIZIZ == null) {
            return;
        }
        try {
            synchronized (LIZJ) {
                FileChannel fileChannel = LIZIZ;
                o.LJI(fileChannel);
                if (fileChannel.isOpen() || LIZ()) {
                    FileChannel fileChannel2 = LIZIZ;
                    o.LJI(fileChannel2);
                    FileLock lock = fileChannel2.lock();
                    if (z) {
                        mappedByteBuffer.position(0);
                        mappedByteBuffer.putInt(Process.myPid());
                        mappedByteBuffer.put((byte) 1);
                        mappedByteBuffer.putLong(LJ);
                    } else {
                        mappedByteBuffer.position(0);
                        if (Process.myPid() == mappedByteBuffer.getInt()) {
                            mappedByteBuffer.position(0);
                            mappedByteBuffer.putInt(Process.myPid());
                            mappedByteBuffer.put((byte) 0);
                            mappedByteBuffer.putLong(LJ);
                        }
                    }
                    lock.release();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
