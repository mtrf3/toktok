package X;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class PWY {
    public static volatile PWY LJIIIZ;
    public final AtomicInteger LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ;
    public final AtomicBoolean LIZJ;
    public final AtomicBoolean LIZLLL;
    public final AtomicInteger LJ;
    public final AtomicInteger LJFF;
    public final AtomicBoolean LJI;
    public final CopyOnWriteArrayList<Integer> LJII;
    public final CopyOnWriteArrayList<String> LJIIIIZZ;

    public static PWY LIZ() {
        if (LJIIIZ == null) {
            synchronized (PWY.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new PWY();
                }
            }
        }
        return LJIIIZ;
    }

    public PWY() {
        new AtomicInteger(10000);
        this.LIZ = new AtomicInteger(60000);
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZJ = new AtomicBoolean(true);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new AtomicInteger(320);
        this.LJFF = new AtomicInteger(0);
        this.LJI = new AtomicBoolean(false);
        this.LJII = new CopyOnWriteArrayList<>();
        this.LJIIIIZZ = new CopyOnWriteArrayList<>();
    }
}
