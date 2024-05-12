package X;

import Y.ARunnableS10S0210000_11;
import android.app.Application;
import android.content.ComponentName;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.PPh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64401PPh {
    public static C64407PPn LIZJ;
    public static int LJ;
    public static ComponentName LJFF;
    public static volatile boolean LJII;
    public static final C64401PPh LJIIIIZZ = new C64401PPh();
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static boolean LIZLLL = true;
    public static final java.util.Set<InterfaceC64332PMq> LJI = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        C64409PPp.LJI(C64403PPj.LJI);
        C64409PPp.LJI(C64402PPi.LIZ);
    }

    public static final String LIZ() {
        String str;
        String LIZJ2 = C64403PPj.LIZJ();
        if (LIZJ2 != null && (!o.LJ("null", LIZJ2))) {
            return LIZJ2;
        }
        C68222m2 c68222m2 = C64409PPp.LIZIZ;
        if (c68222m2 == null || (str = c68222m2.LIZJ) == null) {
            return "null";
        }
        return str;
    }

    public static final void LIZIZ(Application application, ExecutorC64417PPx executor, boolean z) {
        o.LJIIIZ(application, "application");
        o.LJIIIZ(executor, "executor");
        AtomicBoolean atomicBoolean = LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (LJIIIIZZ) {
            LIZJ = new C64407PPn();
            LJII = true;
            application.registerActivityLifecycleCallbacks(LIZJ);
            C64329PMn.LIZLLL = true;
            executor.execute(new ARunnableS10S0210000_11(application, executor, z, 3));
            atomicBoolean.set(true);
        }
    }
}
