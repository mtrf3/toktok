package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pxj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66151Pxj extends PQ5 {
    public C66151Pxj() {
        super("parameter");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        Iterator<InterfaceC35988EAm> it = C66112Px6.LIZ.iterator();
        while (it.hasNext()) {
            if (it.next().LIZLLL(list)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
