package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pr4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65738Pr4 extends AbstractC58016Mpo<XMZ, C72503Sct> {
    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends XMZ> elements) {
        o.LJIIIZ(elements, "elements");
        List<V> list = this.LJLJI;
        ORS.LJJLIL(C65739Pr5.LJLIL, list);
        boolean addAll = list.addAll(elements);
        LIZJ(this);
        return addAll;
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof XMZ)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.C65735Pr1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof XMZ)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // X.C65735Pr1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof XMZ)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof XMZ)) {
            return false;
        }
        return super.remove(obj);
    }
}
