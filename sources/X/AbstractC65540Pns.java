package X;

import java.util.Iterator;

/* renamed from: X.Pns, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65540Pns<E> implements Iterable<E> {
    public final AbstractC65743Pr9<Iterable<E>> LJLIL;

    public final String toString() {
        Iterator<E> it = this.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) this).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public AbstractC65540Pns() {
        this.LJLIL = AbstractC65743Pr9.absent();
    }

    public AbstractC65540Pns(Iterable<E> iterable) {
        iterable.getClass();
        this.LJLIL = AbstractC65743Pr9.fromNullable(this == iterable ? null : iterable);
    }

    public static <E> AbstractC65540Pns<E> LJFF(Iterable<E> iterable) {
        if (iterable instanceof AbstractC65540Pns) {
            return (AbstractC65540Pns) iterable;
        }
        return new C65544Pnw(iterable, iterable);
    }

    public final AbstractC65540Pns<E> LIZJ(InterfaceC65503PnH<? super E> interfaceC65503PnH) {
        Iterable<E> or = this.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) this);
        or.getClass();
        return LJFF(new C65502PnG(or, interfaceC65503PnH));
    }
}
