package X;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class MOJ<T> implements Comparator {
    public final /* synthetic */ Comparator<T> LJLIL;
    public final /* synthetic */ Comparator<? super T> LJLILLLLZI;

    public MOJ(Comparator<T> comparator, Comparator<? super T> comparator2) {
        this.LJLIL = comparator;
        this.LJLILLLLZI = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.LJLIL.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        return this.LJLILLLLZI.compare(t, t2);
    }
}
