package X;

/* renamed from: X.Pnv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65543Pnv<E> extends AbstractC65559PoB<E> implements java.util.Set<E> {
    @Override // X.AbstractC65559PoB
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public abstract java.util.Set<E> LJII();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return LJII().hashCode();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this || LJII().equals(obj)) {
            return true;
        }
        return false;
    }
}
