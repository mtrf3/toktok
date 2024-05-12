package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Pnr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65539Pnr<K> {
    public static final C65519PnX LIZ = new C65519PnX();
    public static final C65529Pnh LIZIZ = new C65529Pnh();

    public abstract Iterable<? extends K> LIZJ(K k);

    public abstract Class<?> LIZLLL(K k);

    public abstract K LJ(K k);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC65590Pog LIZIZ(AbstractC65578PoU abstractC65578PoU) {
        HashMap hashMap = new HashMap();
        Iterator it = abstractC65578PoU.iterator();
        while (it.hasNext()) {
            LIZ(it.next(), hashMap);
        }
        C65547Pnz.LJLIL.getClass();
        return AbstractC65590Pog.sortedCopyOf(new C65545Pnx(C65546Pny.LJLIL, hashMap), hashMap.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZ(K k, java.util.Map<? super K, Integer> map) {
        HashMap hashMap = (HashMap) map;
        Integer num = (Integer) hashMap.get(k);
        if (num != null) {
            return num.intValue();
        }
        boolean isInterface = LIZLLL(k).isInterface();
        Iterator<? extends K> it = LIZJ(k).iterator();
        int i = isInterface;
        while (it.hasNext()) {
            i = Math.max(i, LIZ(it.next(), map));
        }
        K LJ = LJ(k);
        int i2 = i;
        if (LJ != null) {
            i2 = Math.max(i, LIZ(LJ, map));
        }
        int i3 = i2 + 1;
        hashMap.put(k, Integer.valueOf(i3));
        return i3;
    }
}
