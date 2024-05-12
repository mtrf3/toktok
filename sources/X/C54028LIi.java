package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LIi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54028LIi {
    public static OSJ LIZ(String str) {
        List<C54859Lfz> LJIIJ = LW8.LIZIZ.LJIIJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
        Iterator<C54859Lfz> it = LJIIJ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        List<C54859Lfz> LJIIIZ = LW8.LIZIZ.LJIIIZ();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIIIZ, 10));
        Iterator<C54859Lfz> it2 = LJIIIZ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJLIL);
        }
        List<C54859Lfz> LJ = LW8.LIZIZ.LJ();
        arrayList.toString();
        arrayList2.toString();
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator<C54859Lfz> it3 = LJ.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().LJLIL);
        }
        return new OSJ(arrayList, arrayList2, LJ);
    }
}
