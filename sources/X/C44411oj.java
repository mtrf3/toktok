package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44411oj<E> extends AbstractC37961eK {
    public int LJLJJI;
    public Object[] LJLJJL;
    public boolean LJLJJLL;

    public final E LIZ() {
        int i = this.LJLILLLLZI & 31;
        Object obj = this.LJLJJL[this.LJLJJI - 1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        int i;
        if (hasNext()) {
            E LIZ = LIZ();
            int i2 = this.LJLILLLLZI + 1;
            this.LJLILLLLZI = i2;
            if (i2 == this.LJLJI) {
                this.LJLJJLL = true;
                return LIZ;
            }
            int i3 = 0;
            while (true) {
                i = this.LJLILLLLZI;
                if (((i >> i3) & 31) != 0) {
                    break;
                }
                i3 += 5;
            }
            if (i3 > 0) {
                LIZIZ(i, ((this.LJLJJI - 1) - (i3 / 5)) + 1);
            }
            return LIZ;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        int i;
        if (hasPrevious()) {
            this.LJLILLLLZI--;
            int i2 = 0;
            if (this.LJLJJLL) {
                this.LJLJJLL = false;
                return LIZ();
            }
            while (true) {
                i = this.LJLILLLLZI;
                if (((i >> i2) & 31) != 31) {
                    break;
                }
                i2 += 5;
            }
            if (i2 > 0) {
                LIZIZ(i, ((this.LJLJJI - 1) - (i2 / 5)) + 1);
            }
            return LIZ();
        }
        throw new NoSuchElementException();
    }

    public final void LIZIZ(int i, int i2) {
        int i3 = (this.LJLJJI - i2) * 5;
        while (i2 < this.LJLJJI) {
            Object[] objArr = this.LJLJJL;
            Object obj = objArr[i2 - 1];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public C44411oj(int i, int i2, int i3, Object[] root) {
        super(i, i2, 0);
        ?? r0;
        o.LJIIIZ(root, "root");
        this.LJLJJI = i3;
        Object[] objArr = new Object[i3];
        this.LJLJJL = objArr;
        if (i == i2) {
            r0 = 1;
        } else {
            r0 = 0;
        }
        this.LJLJJLL = r0;
        objArr[0] = root;
        LIZIZ(i - r0, 1);
    }
}
