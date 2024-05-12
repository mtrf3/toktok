package X;

import Y.IDComparatorS39S0000000_11;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/* renamed from: X.Q1z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66343Q1z {
    public final java.util.Map<String, Object> LIZ;
    public final boolean LIZIZ;
    public boolean LIZLLL;
    public final Q1N LJFF;
    public int LIZJ = Integer.MAX_VALUE;
    public final TreeSet<C66323Q1f> LJ = new TreeSet<>(new IDComparatorS39S0000000_11(1));
    public final HashMap<Q20, Q28> LJI = new HashMap<>();

    public final Q28 LIZ(Q20 q20) {
        Q28 q28 = this.LJI.get(q20);
        if (q28 == null) {
            q28 = new Q28();
            if (q20 instanceof Q22) {
                HashSet<Q20> hashSet = new HashSet<>();
                q28.LIZJ = hashSet;
                hashSet.addAll(((Q22) q20).LIZJ);
            }
            this.LJI.put(q20, q28);
        }
        return q28;
    }

    public C66343Q1z(String str, java.util.Map<String, Object> map, boolean z) {
        this.LJFF = new Q1N(str);
        this.LIZ = map;
        this.LIZIZ = z;
    }
}
