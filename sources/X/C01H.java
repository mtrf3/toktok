package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.01H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01H {
    public static final SparseArray<C0NT> LIZ = new SparseArray<>();
    public static C01I LIZIZ = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    public static void LIZ(Context context) {
        C09000Wy.LIZ.getClass();
        if (C09010Wz.LJIIJ.LIZ().booleanValue()) {
            C1O6 c1o6 = C09010Wz.LJIIIZ;
            if (!c1o6.LIZ().booleanValue()) {
                C0YN.LIZ(4);
                C0U7.LIZLLL.LIZIZ = context;
                C0U7.LIZJ();
                c1o6.LIZIZ = Boolean.TRUE;
            }
        }
    }

    public static void LIZLLL(HashSet<Integer> hashSet) {
        C09010Wz c09010Wz = C09000Wy.LIZ;
        c09010Wz.getClass();
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            synchronized (c09010Wz.LJI) {
                c09010Wz.LJI.LIZ().append(next.intValue(), true);
            }
        }
    }

    public static void LIZIZ(C0NU c0nu, int i) {
        C0NT c0nt = new C0NT(C0NR.PRESET_SCENE, c0nu);
        c0nt.LIZJ = i;
        C09000Wy.LIZ.LIZ(c0nt);
    }

    public static void LIZJ(C0NU c0nu, C0NW c0nw) {
        if (c0nw == C0NW.END) {
            SparseArray<C0NT> sparseArray = LIZ;
            C0NT c0nt = sparseArray.get(c0nu.getId());
            if (c0nt == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("restore a not start scene: ");
                LIZ2.append(c0nu.getDesc());
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(5);
                return;
            }
            c0nt.LJ = true;
            C09000Wy.LIZ.LIZ(c0nt);
            sparseArray.remove(c0nu.getId());
            return;
        }
        C0NT c0nt2 = new C0NT(C0NR.PRESET_SCENE, c0nu);
        c0nt2.LJ = false;
        if (C09000Wy.LIZ.LIZ(c0nt2) != null) {
            LIZ.put(c0nu.getId(), c0nt2);
        }
    }
}
