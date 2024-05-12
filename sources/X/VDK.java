package X;

import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VDK {
    public static VDK LJIIIZ;
    public O6R LIZ;
    public String LIZIZ;
    public final C35737E0v LIZJ = new C35737E0v();
    public final int[] LIZLLL = {8, 7, 6, 5, 4, 3, 2};
    public final ConcurrentHashMap<Integer, Pair> LJ = new ConcurrentHashMap<>();
    public int LJFF = 600;
    public int LJI = 1000;
    public double LJII = 0.1d;
    public int LJIIIIZZ = 1000;

    public static VDK LIZ() {
        if (LJIIIZ == null) {
            synchronized (VDK.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new VDK();
                }
            }
        }
        return LJIIIZ;
    }
}
