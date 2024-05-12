package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQO implements Collection<OQQ>, InterfaceC90533gv {
    public final short[] LJLIL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(OQQ oqq) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends OQQ> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.LJLIL);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLIL.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<OQQ> iterator() {
        return new OQP(this.LJLIL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LJLIL.length;
    }

    public final String toString() {
        short[] sArr = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UShortArray(storage=");
        LIZ.append(Arrays.toString(sArr));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ OQO(short[] sArr) {
        this.LJLIL = sArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof OQQ)) {
            return false;
        }
        short s = ((OQQ) obj).LJLIL;
        short[] sArr = this.LJLIL;
        o.LJIIIZ(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r1 < 0) goto L18;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            short[] r6 = r7.LJLIL
            boolean r0 = r8.isEmpty()
            r5 = 1
            if (r0 == 0) goto Lf
        Le:
            return r5
        Lf:
            java.util.Iterator r4 = r8.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.OQQ
            if (r0 == 0) goto L38
            X.OQQ r1 = (X.OQQ) r1
            short r3 = r1.LJLIL
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r2 = r6.length
            r1 = 0
        L2c:
            if (r1 >= r2) goto L38
            short r0 = r6[r1]
            if (r3 != r0) goto L35
            if (r1 < 0) goto L38
            goto L13
        L35:
            int r1 = r1 + 1
            goto L2c
        L38:
            r5 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OQO.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        short[] sArr = this.LJLIL;
        if (!(obj instanceof OQO) || !o.LJ(sArr, ((OQO) obj).LJLIL)) {
            return false;
        }
        return true;
    }
}
