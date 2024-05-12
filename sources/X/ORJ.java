package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORJ<T> extends AbstractC37961eK {
    public final T[] LJLJJI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T[] tArr = this.LJLJJI;
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            T[] tArr = this.LJLJJI;
            int i = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ORJ(int i, int i2, Object[] buffer) {
        super(i, i2, 1);
        o.LJIIIZ(buffer, "buffer");
        this.LJLJJI = buffer;
    }
}
