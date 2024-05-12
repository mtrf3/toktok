package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38681fU<K, V, T> implements Iterator<T>, InterfaceC90533gv {
    public final AbstractC38701fW<K, V, T>[] LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            X.1fW<K, V, T>[] r0 = r6.LJLIL
            int r4 = r6.LJLILLLLZI
            r0 = r0[r4]
            int r1 = r0.LJLJI
            int r0 = r0.LJLILLLLZI
            r3 = 0
            if (r1 >= r0) goto Le
            return
        Le:
            r5 = -1
            if (r5 >= r4) goto L56
            int r0 = r6.LIZIZ(r4)
            if (r0 != r5) goto L2a
            X.1fW<K, V, T>[] r0 = r6.LJLIL
            r2 = r0[r4]
            int r1 = r2.LJLJI
            java.lang.Object[] r0 = r2.LJLIL
            int r0 = r0.length
            if (r1 >= r0) goto L2f
            int r0 = r1 + 1
            r2.LJLJI = r0
            int r0 = r6.LIZIZ(r4)
        L2a:
            if (r0 == r5) goto L2f
            r6.LJLILLLLZI = r0
            return
        L2f:
            if (r4 <= 0) goto L3d
            X.1fW<K, V, T>[] r1 = r6.LJLIL
            int r0 = r4 + (-1)
            r1 = r1[r0]
            int r0 = r1.LJLJI
            int r0 = r0 + 1
            r1.LJLJI = r0
        L3d:
            X.1fW<K, V, T>[] r0 = r6.LJLIL
            r2 = r0[r4]
            X.14U r0 = X.C14U.LJ
            java.lang.Object[] r1 = r0.LIZLLL
            r2.getClass()
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LJLIL = r1
            r2.LJLILLLLZI = r3
            r2.LJLJI = r3
            int r4 = r4 + (-1)
            goto Le
        L56:
            r6.LJLJI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38681fU.LIZ():void");
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.LJLJI) {
            T next = this.LJLIL[this.LJLILLLLZI].next();
            LIZ();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLJI;
    }

    public final int LIZIZ(int i) {
        AbstractC38701fW<K, V, T> abstractC38701fW = this.LJLIL[i];
        int i2 = abstractC38701fW.LJLJI;
        if (i2 < abstractC38701fW.LJLILLLLZI) {
            return i;
        }
        Object[] objArr = abstractC38701fW.LJLIL;
        if (i2 < objArr.length) {
            Object obj = objArr[i2];
            o.LJII(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            C14U c14u = (C14U) obj;
            if (i == 6) {
                AbstractC38701fW<K, V, T> abstractC38701fW2 = this.LJLIL[7];
                Object[] objArr2 = c14u.LIZLLL;
                int length = objArr2.length;
                abstractC38701fW2.getClass();
                abstractC38701fW2.LJLIL = objArr2;
                abstractC38701fW2.LJLILLLLZI = length;
                abstractC38701fW2.LJLJI = 0;
            } else {
                AbstractC38701fW<K, V, T> abstractC38701fW3 = this.LJLIL[i + 1];
                Object[] buffer = c14u.LIZLLL;
                int bitCount = Integer.bitCount(c14u.LIZ) * 2;
                abstractC38701fW3.getClass();
                o.LJIIIZ(buffer, "buffer");
                abstractC38701fW3.LJLIL = buffer;
                abstractC38701fW3.LJLILLLLZI = bitCount;
                abstractC38701fW3.LJLJI = 0;
            }
            return LIZIZ(i + 1);
        }
        return -1;
    }

    public AbstractC38681fU(C14U<K, V> node, AbstractC38701fW<K, V, T>[] abstractC38701fWArr) {
        o.LJIIIZ(node, "node");
        this.LJLIL = abstractC38701fWArr;
        this.LJLJI = true;
        AbstractC38701fW<K, V, T> abstractC38701fW = abstractC38701fWArr[0];
        Object[] buffer = node.LIZLLL;
        int bitCount = Integer.bitCount(node.LIZ) * 2;
        abstractC38701fW.getClass();
        o.LJIIIZ(buffer, "buffer");
        abstractC38701fW.LJLIL = buffer;
        abstractC38701fW.LJLILLLLZI = bitCount;
        abstractC38701fW.LJLJI = 0;
        this.LJLILLLLZI = 0;
        LIZ();
    }
}
