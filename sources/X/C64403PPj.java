package X;

import android.app.Activity;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.PPj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64403PPj {
    public static int LIZIZ;
    public static boolean LJ;
    public static boolean LJFF;
    public static final HashMap<Integer, String> LIZ = new HashMap<>();
    public static final LinkedHashSet<InterfaceC64405PPl> LIZJ = new LinkedHashSet<>();
    public static final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public static final C64404PPk LJI = new C64404PPk();

    public static String LIZJ() {
        try {
            ReentrantReadWriteLock.ReadLock readLock = LIZLLL.readLock();
            readLock.lock();
            try {
                return LIZ.get(Integer.valueOf(LIZIZ));
            } finally {
                readLock.unlock();
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    public static void LIZ(Activity activity) {
        int i;
        o.LJIIIZ(activity, "activity");
        ReentrantReadWriteLock reentrantReadWriteLock = LIZLLL;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < i; i2++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.remove(Integer.valueOf(activity.hashCode()));
            int i3 = 0;
            if (!(!r1.isEmpty()) && LJ) {
                C64329PMn.LIZLLL(false);
                Iterator<InterfaceC64405PPl> it = LIZJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ();
                }
                LJ = false;
            }
            if (!C64329PMn.LIZIZ().LIZIZ && LJFF) {
                Iterator<InterfaceC64405PPl> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onAppBackground();
                }
                LJFF = false;
            }
        } finally {
            for (int i4 = 0; i4 < i; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static void LIZIZ(Activity activity) {
        int i;
        o.LJIIIZ(activity, "activity");
        int hashCode = activity.hashCode();
        if (LIZIZ == hashCode && LJ) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZLLL;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.put(Integer.valueOf(hashCode), activity.getClass().getName());
            LIZIZ = hashCode;
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            if (!LJ) {
                C64329PMn.LIZLLL(true);
                Iterator<InterfaceC64405PPl> it = LIZJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
                LJ = true;
            }
            if (!LJFF) {
                Iterator<InterfaceC64405PPl> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onAppForeground();
                }
                LJFF = true;
            }
        } catch (Throwable th) {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static boolean LIZLLL(long j) {
        C64331PMp LIZIZ2 = C64329PMn.LIZIZ();
        if (LIZIZ2.LIZIZ || SystemClock.elapsedRealtime() - LIZIZ2.LIZJ < j) {
            return false;
        }
        return true;
    }

    public static void LJ(InterfaceC64405PPl callbacks) {
        o.LJIIIZ(callbacks, "callbacks");
        LinkedHashSet<InterfaceC64405PPl> linkedHashSet = LIZJ;
        synchronized (linkedHashSet) {
            linkedHashSet.add(callbacks);
        }
    }
}
