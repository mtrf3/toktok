package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORG<T> extends AbstractC37961eK {
    public final ORE<T> LJLJJI;
    public int LJLJJL;
    public ORH<? extends T> LJLJJLL;
    public int LJLJL;

    public final void LIZ() {
        if (this.LJLJJL == this.LJLJJI.LJII()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int, boolean] */
    public final void LIZIZ() {
        Object[] objArr = this.LJLJJI.LJLJJLL;
        if (objArr == null) {
            this.LJLJJLL = null;
            return;
        }
        int size = (r0.size() - 1) & (-32);
        int i = this.LJLILLLLZI;
        if (i > size) {
            i = size;
        }
        int i2 = (this.LJLJJI.LJLJJI / 5) + 1;
        ORH<? extends T> orh = this.LJLJJLL;
        if (orh == null) {
            this.LJLJJLL = new ORH<>(i, size, i2, objArr);
            return;
        }
        o.LJI(orh);
        orh.LJLILLLLZI = i;
        orh.LJLJI = size;
        orh.LJLJJI = i2;
        if (orh.LJLJJL.length < i2) {
            orh.LJLJJL = new Object[i2];
        }
        ?? r0 = 0;
        orh.LJLJJL[0] = objArr;
        if (i == size) {
            r0 = 1;
        }
        orh.LJLJJLL = r0;
        orh.LIZIZ(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        LIZ();
        if (hasNext()) {
            int i = this.LJLILLLLZI;
            this.LJLJL = i;
            ORH<? extends T> orh = this.LJLJJLL;
            if (orh == null) {
                Object[] objArr = this.LJLJJI.LJLJL;
                this.LJLILLLLZI = i + 1;
                return (T) objArr[i];
            }
            if (orh.hasNext()) {
                this.LJLILLLLZI++;
                return orh.next();
            }
            Object[] objArr2 = this.LJLJJI.LJLJL;
            int i2 = this.LJLILLLLZI;
            this.LJLILLLLZI = i2 + 1;
            return (T) objArr2[i2 - orh.LJLJI];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        LIZ();
        if (hasPrevious()) {
            int i = this.LJLILLLLZI;
            int i2 = i - 1;
            this.LJLJL = i2;
            ORH<? extends T> orh = this.LJLJJLL;
            if (orh == null) {
                Object[] objArr = this.LJLJJI.LJLJL;
                this.LJLILLLLZI = i2;
                return (T) objArr[i2];
            }
            int i3 = orh.LJLJI;
            if (i > i3) {
                Object[] objArr2 = this.LJLJJI.LJLJL;
                this.LJLILLLLZI = i2;
                return (T) objArr2[i2 - i3];
            }
            this.LJLILLLLZI = i2;
            return orh.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // X.AbstractC37961eK, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        LIZ();
        int i = this.LJLJL;
        if (i != -1) {
            this.LJLJJI.remove(i);
            int i2 = this.LJLJL;
            if (i2 < this.LJLILLLLZI) {
                this.LJLILLLLZI = i2;
            }
            this.LJLJI = this.LJLJJI.size();
            this.LJLJJL = this.LJLJJI.LJII();
            this.LJLJL = -1;
            LIZIZ();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // X.AbstractC37961eK, java.util.ListIterator
    public final void add(T t) {
        LIZ();
        this.LJLJJI.add(this.LJLILLLLZI, t);
        this.LJLILLLLZI++;
        this.LJLJI = this.LJLJJI.size();
        this.LJLJJL = this.LJLJJI.LJII();
        this.LJLJL = -1;
        LIZIZ();
    }

    @Override // X.AbstractC37961eK, java.util.ListIterator
    public final void set(T t) {
        LIZ();
        int i = this.LJLJL;
        if (i != -1) {
            this.LJLJJI.set(i, t);
            this.LJLJJL = this.LJLJJI.LJII();
            LIZIZ();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ORG(ORE<T> builder, int i) {
        super(i, builder.size(), 1);
        o.LJIIIZ(builder, "builder");
        this.LJLJJI = builder;
        this.LJLJJL = builder.LJII();
        this.LJLJL = -1;
        LIZIZ();
    }
}
