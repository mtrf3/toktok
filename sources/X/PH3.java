package X;

import Y.ARunnableS15S0400000_11;
import Y.IDRunnableS29S0200000;
import android.os.SystemClock;
import android.view.FrameMetrics;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PH3 {
    public static boolean LJIIJJI;
    public static C44061oA LJIIL;
    public final String LIZ;
    public volatile boolean LIZIZ;
    public PH7 LIZLLL;
    public volatile PH6 LJ;
    public PH8 LJFF;
    public final boolean LJIIIZ;
    public C25410zB LIZJ = new C25410zB();
    public final HashMap<String, String> LJIIIIZZ = new HashMap<>();
    public final JSONObject LJIIJ = null;
    public LinkedList<Integer> LJI = new LinkedList<>();
    public LinkedList<FrameMetrics> LJII = new LinkedList<>();

    public final synchronized void LIZLLL() {
        LIZIZ();
        C06140Ly.LIZJ(this.LIZ);
    }

    public final void LIZIZ() {
        C44061oA c44061oA = LJIIL;
        if (c44061oA != null) {
            C36381bm.LJIL.LJIILIIL.LIZ(new IDRunnableS29S0200000(this, c44061oA, 43));
            if (!this.LIZIZ) {
                return;
            }
            SystemClock.uptimeMillis();
            synchronized (this) {
                if (this.LJI.isEmpty()) {
                    PH8 ph8 = this.LJFF;
                    if (ph8 != null) {
                        ((InterfaceC31050CGo) ((XWV) ph8).LJLIL).onEmpty();
                    }
                } else {
                    LinkedList<Integer> linkedList = this.LJI;
                    LinkedList<FrameMetrics> linkedList2 = this.LJII;
                    this.LJI = new LinkedList<>();
                    this.LJII = new LinkedList<>();
                    C25410zB c25410zB = this.LIZJ;
                    this.LIZJ = new C25410zB();
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(this.LJIIIIZZ);
                    F9U.LIZ.LIZJ(new ARunnableS15S0400000_11(this, linkedList, hashMap, c25410zB, linkedList2, 3));
                }
            }
            this.LIZIZ = false;
        }
    }

    public final boolean LIZJ() {
        if (C09970aH.LJIJI && (C64099PDr.LIZIZ("fps_drop", this.LIZ) || C64099PDr.LIZIZ("fps", this.LIZ) || LJIIJJI)) {
            return true;
        }
        return false;
    }

    public final void LIZ(long j) {
        if (j < 0) {
            return;
        }
        synchronized (this) {
            if (this.LJI.size() > 20000) {
                this.LJI.poll();
            }
            this.LJI.add(Integer.valueOf(((int) j) * 100));
        }
    }

    public PH3(String str, boolean z) {
        this.LIZ = str;
        this.LJIIIZ = z;
        if (LIZJ() || z) {
            C36381bm.LJIL.getClass();
        }
    }
}
