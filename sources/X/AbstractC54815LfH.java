package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LfH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54815LfH<K, PO> implements InterfaceC54816LfI<K, PO> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C54818LfK.LJLIL);

    public abstract PO LIZLLL(K k);

    public abstract C199567sO<PO> LJ(K k);

    public abstract C199557sN LJFF(Object obj, Object obj2);

    @Override // X.InterfaceC54816LfI
    public List<PO> LIZIZ(List<? extends K> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "k");
        Iterator<? extends K> it = list.iterator();
        while (it.hasNext()) {
            PO po = get(it.next());
            if (po != null) {
                LJ.add(po);
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC54816LfI
    public PO get(K k) {
        return LIZLLL(k);
    }

    @Override // X.InterfaceC54816LfI
    public final C199567sO<PO> remove(K k) {
        C199567sO<PO> LJ = LJ(k);
        if (LJ != null) {
            ((C36040ECm) this.LIZ.getValue()).remove(k);
        }
        return LJ;
    }

    @Override // X.InterfaceC54816LfI
    public C199567sO<PO> replace(K k, PO po) {
        C199557sN LJFF = LJFF(k, po);
        if (LJFF != null) {
            ((C36040ECm) this.LIZ.getValue()).put(k, po);
        }
        return LJFF;
    }
}
