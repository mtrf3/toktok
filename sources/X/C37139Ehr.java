package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37139Ehr extends AbstractC37141Eht {
    public final InterfaceC88472Yns<EO7, Boolean> LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C37139Ehr) && o.LJ(this.LIZ, ((C37139Ehr) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC88472Yns<EO7, Boolean> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoveWithPredicate(predicate=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37139Ehr(InterfaceC88472Yns<? super EO7, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        this.LIZ = predicate;
    }

    @Override // X.AbstractC37141Eht
    public final void LIZ(List<EO7> target) {
        o.LJIIIZ(target, "target");
        Iterator<EO7> it = target.iterator();
        while (it.hasNext()) {
            if (this.LIZ.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }
}
