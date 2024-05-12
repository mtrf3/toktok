package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jjj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49995Jjj {
    public static int LIZIZ;
    public static final C49995Jjj LIZ = new C49995Jjj();
    public static final SparseArray<JSE> LIZJ = new SparseArray<>();
    public static final SparseArray<List<Integer>> LIZLLL = new SparseArray<>();
    public static int LJ = -1;

    public final synchronized JSE LIZ(int i) {
        return LIZJ.get(i);
    }

    public final synchronized int LIZIZ(JSE jse) {
        if (LJ == -1) {
            return -1;
        }
        int i = LIZIZ;
        LIZIZ = i + 1;
        LIZJ.put(i, jse);
        SparseArray<List<Integer>> sparseArray = LIZLLL;
        List<Integer> list = sparseArray.get(LJ);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(Integer.valueOf(i));
        sparseArray.put(LJ, list);
        return i;
    }

    public final synchronized void LIZJ(int i) {
        if (LJ == -1) {
            return;
        }
        SparseArray<JSE> sparseArray = LIZJ;
        if (sparseArray.get(i) == null) {
            return;
        }
        sparseArray.remove(i);
        SparseArray<List<Integer>> sparseArray2 = LIZLLL;
        List<Integer> list = sparseArray2.get(LJ);
        if (list != null) {
            list.remove(Integer.valueOf(i));
            sparseArray2.put(LJ, list);
        }
    }
}
