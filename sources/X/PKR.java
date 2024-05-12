package X;

import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PKR implements Thread.UncaughtExceptionHandler {
    public static PKR LJI;
    public static volatile boolean LJII;
    public static final ThreadLocal<Boolean> LJIIIIZZ = new ThreadLocal<>();
    public static final ArrayList<AbstractC36160EHc> LJIIIZ = new ArrayList<>();
    public Thread.UncaughtExceptionHandler LIZ;
    public PK3 LIZIZ;
    public PK3 LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;
    public final ConcurrentHashMap<String, Object> LJFF = new ConcurrentHashMap<>();

    public final void LIZJ() {
        synchronized (this) {
            this.LJ--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.LJ != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    public static void LIZLLL() {
        String[] list;
        File LJIJJLI = C78596Usy.LJIJJLI(PK0.LIZ);
        File file = C78596Usy.LJLJJLL;
        if (file == null) {
            file = C78596Usy.LJIL(PK0.LIZ);
        }
        String[] list2 = LJIJJLI.list();
        if ((list2 == null || list2.length == 0) && ((list = file.list()) == null || list.length == 0)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!PKL.LJIIJJI().LJ && C64264PKa.LJII(PK0.LIZ) && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    public static PKR LJ() {
        if (LJI == null) {
            LJI = new PKR();
        }
        return LJI;
    }

    public PKR() {
        new ConcurrentHashMap();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.LIZ = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static Throwable LIZ(Thread thread, Throwable th) {
        int i = 0;
        while (true) {
            ArrayList<AbstractC36160EHc> arrayList = LJIIIZ;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    ((AbstractC36160EHc) ListProtector.get(arrayList, i)).LIZIZ();
                    i++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            try {
                Looper.loop();
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021f A[Catch: all -> 0x0255, TryCatch #10 {all -> 0x0255, blocks: (B:57:0x0219, B:59:0x021f), top: B:56:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[LOOP:0: B:2:0x0002->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224 A[SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r25, java.lang.Throwable r26) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKR.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    public static String LJFF(File file, Throwable th, Thread thread, boolean z) {
        C64298PLi c64298PLi;
        MessageDigest messageDigest;
        long j;
        String absolutePath = file.getAbsolutePath();
        int i = -1;
        boolean z2 = true;
        while (true) {
            if (!z2) {
                try {
                    C78685UuP.LJJJLL();
                } catch (IOException e) {
                    FPX.LIZ(e);
                } catch (Throwable unused) {
                }
            }
            file.getParentFile().mkdirs();
            file.createNewFile();
            i = NativeTools.LJIILJJIL().LJJIIZI(absolutePath);
            z2 = false;
            if (!z2) {
                break;
            }
            z2 = false;
        }
        if (!FPX.LIZJ()) {
            try {
                j = new StatFs(C16880lQ.LLIIJLIL(PK0.LIZ).getPath()).getFreeBytes();
            } catch (Throwable unused2) {
                j = 0;
            }
            if (j < 25165824) {
                FPX.LIZJ = true;
            }
        }
        String str = null;
        if (z) {
            NativeTools LJIILJJIL = NativeTools.LJIILJJIL();
            int LJJIJ = LJIILJJIL.LJJIJ(absolutePath);
            if (LJJIJ < 0) {
                NativeTools.LJIILJJIL().LJJIIJ();
                LJJIJ = LJIILJJIL.LJJIJ(absolutePath);
            }
            if (LJJIJ > 0) {
                try {
                    LJIILJJIL.LJJIL(LJJIJ, C64264PKa.LIZJ(PK0.LIZ));
                    LJIILJJIL.LJJIL(LJJIJ, "\n");
                    LJIILJJIL.LJJIL(LJJIJ, th.getMessage());
                    LJIILJJIL.LJJIL(LJJIJ, "\n");
                    LJIILJJIL.LJJIL(LJJIJ, th.getClass().getName());
                    if (th.getMessage() != null) {
                        LJIILJJIL.LJJIL(LJJIJ, ": ");
                        LJIILJJIL.LJJIL(LJJIJ, th.getMessage());
                    }
                    LJIILJJIL.LJJIL(LJJIJ, "\n");
                    LJIILJJIL.LJJIL(LJJIJ, thread.getName());
                    LJIILJJIL.LJJIL(LJJIJ, "\n");
                } catch (Throwable unused3) {
                }
                try {
                    LJIILJJIL.LJJIL(LJJIJ, "stack:");
                    LJIILJJIL.LJJIL(LJJIJ, "\n");
                } catch (Throwable unused4) {
                }
                try {
                    PKW.LJIIJ(LJJIJ, th);
                } catch (Throwable unused5) {
                }
                LJIILJJIL.LIZJ(LJJIJ);
            }
        } else {
            FileOutputStream fileOutputStream = null;
            boolean z3 = true;
            while (true) {
                if (!z3) {
                    C78685UuP.LJJJLL();
                }
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                    z3 = false;
                } catch (IOException e2) {
                    FPX.LIZ(e2);
                } catch (Throwable unused6) {
                    return null;
                }
                if (z3) {
                    z3 = false;
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        FPX.LIZ(e3);
                    } catch (Throwable unused7) {
                    }
                }
            }
            fileOutputStream.write((C64264PKa.LIZJ(PK0.LIZ) + "\n").getBytes());
            fileOutputStream.write((th.getMessage() + "\n").getBytes());
            fileOutputStream.write((th + "\n").getBytes());
            fileOutputStream.write((thread.getName() + "\n").getBytes());
            try {
                fileOutputStream.write("stack:\n".getBytes());
            } catch (Throwable unused8) {
            }
            try {
                PrintStream printStream = new PrintStream(fileOutputStream);
                if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                    c64298PLi = new C64295PLf();
                } else {
                    c64298PLi = new C64298PLi();
                }
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                } catch (Throwable unused9) {
                    messageDigest = null;
                }
                PL3 pl3 = new PL3(printStream, messageDigest, c64298PLi);
                try {
                    PKW.LJIIJJI(th, pl3);
                } catch (Throwable unused10) {
                }
                pl3.close();
                if (messageDigest != null) {
                    str = PKW.LIZ(messageDigest.digest());
                }
                FPX.LIZIZ(fileOutputStream);
            } catch (Throwable th2) {
                try {
                    th.printStackTrace(new PrintStream(fileOutputStream));
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.write("err:\n".getBytes());
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(th2);
                        LIZ.append("\n");
                        fileOutputStream.write(X1D.LIZIZ(LIZ).getBytes());
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(th3);
                        LIZ2.append("\n");
                        fileOutputStream.write(X1D.LIZIZ(LIZ2).getBytes());
                    } catch (Throwable unused11) {
                    }
                }
            }
            FPX.LIZIZ(fileOutputStream);
        }
        if (i > 0) {
            NativeTools.LJIILJJIL().LJJIJL(i);
        }
        return str;
    }

    public static void LIZIZ(Thread thread, Throwable th, boolean z, long j, List<IOOMCallback> list) {
        CrashType crashType;
        if (z) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        Iterator it = ((CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            try {
                ((IOOMCallback) it.next()).onCrash(crashType, th, thread, j);
            } catch (Throwable unused) {
                C78685UuP.LJLIL();
            }
        }
    }
}
