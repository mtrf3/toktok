package X;

import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: X.0BZ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0BZ {
    public final HashMap<Integer, TreeMap<Integer, AbstractC23740wU>> LIZ = new HashMap<>();

    public final void LIZ(AbstractC23740wU... abstractC23740wUArr) {
        for (AbstractC23740wU abstractC23740wU : abstractC23740wUArr) {
            int i = abstractC23740wU.LIZ;
            int i2 = abstractC23740wU.LIZIZ;
            TreeMap<Integer, AbstractC23740wU> treeMap = this.LIZ.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.LIZ.put(Integer.valueOf(i), treeMap);
            }
            treeMap.get(Integer.valueOf(i2));
            treeMap.put(Integer.valueOf(i2), abstractC23740wU);
        }
    }
}
