package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORI<T> extends AbstractC37961eK {
    public final T[] LJLJJI;
    public final ORH<T> LJLJJL;

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            if (this.LJLJJL.hasNext()) {
                this.LJLILLLLZI++;
                return this.LJLJJL.next();
            }
            T[] tArr = this.LJLJJI;
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return tArr[i - this.LJLJJL.LJLJI];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            int i = this.LJLILLLLZI;
            ORH<T> orh = this.LJLJJL;
            int i2 = orh.LJLJI;
            if (i > i2) {
                T[] tArr = this.LJLJJI;
                int i3 = i - 1;
                this.LJLILLLLZI = i3;
                return tArr[i3 - i2];
            }
            this.LJLILLLLZI = i - 1;
            return orh.previous();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ORI(int i, int i2, int i3, Object[] root, Object[] tail) {
        super(i, i2, 1);
        o.LJIIIZ(root, "root");
        o.LJIIIZ(tail, "tail");
        this.LJLJJI = tail;
        int i4 = (i2 - 1) & (-32);
        this.LJLJJL = new ORH<>(i > i4 ? i4 : i, i4, i3, root);
    }
}
