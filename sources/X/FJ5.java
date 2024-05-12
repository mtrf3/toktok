package X;

import Y.IDHandlerS7S0000000_6;
import android.os.HandlerThread;
import android.os.SystemClock;
import defpackage.i0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class FJ5 {
    public static final java.util.Set<String> LIZ = Q4K.LIZLLL();
    public static final java.util.Set<String> LIZIZ = Q4K.LIZLLL();
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();
    public static final List<String> LIZLLL;
    public static final HandlerThread LJ;
    public static final IDHandlerS7S0000000_6 LJFF;
    public static final AtomicBoolean LJI;
    public static final AtomicBoolean LJII;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        LIZLLL = copyOnWriteArrayList;
        LJI = new AtomicBoolean(false);
        LJII = new AtomicBoolean(false);
        Collections.addAll(copyOnWriteArrayList, "c++_shared", "vcbasekit", "ttcrypto", "ttboringssl", "sscronet", "vcn", "vcnverify", "ByteVC1_dec");
        HandlerThread handlerThread = new HandlerThread("idlePreloadSoThread");
        LJ = handlerThread;
        handlerThread.start();
        LJFF = new IDHandlerS7S0000000_6(handlerThread.getLooper(), 1);
    }

    public static void LIZ(long j, String str) {
        if (C56662Kg.LIZ().LIZLLL) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            String LJFF2 = i0.LJFF("load_so_", str);
            long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
            LIZIZ.add(str);
            java.util.Set<String> set = LIZ;
            if (set.contains(LJFF2)) {
                return;
            }
            set.add(LJFF2);
            FAM LIZ2 = C56662Kg.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJFF2);
            LIZ3.append("_from_boot");
            LIZ2.LIZLLL(currentTimeMillis, X1D.LIZIZ(LIZ3));
            C56662Kg.LIZ().LIZLLL(uptimeMillis, LJFF2);
            C56672Kh.LIZ().LJ(uptimeMillis, LJFF2);
            FAK LIZ4 = C56672Kh.LIZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(LJFF2);
            LIZ5.append("_from_boot");
            LIZ4.LJ(currentTimeMillis, X1D.LIZIZ(LIZ5));
            C56662Kg.LIZ().LIZ(uptimeMillis, "load_so_total");
        }
    }
}
