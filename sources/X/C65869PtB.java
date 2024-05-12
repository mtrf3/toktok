package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PtB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65869PtB<K, V> {
    public final C65864Pt6<K, V> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public final void LIZ() {
        while (true) {
            int i = this.LJLILLLLZI;
            C65864Pt6<K, V> c65864Pt6 = this.LJLIL;
            if (i < c65864Pt6.length && c65864Pt6.presenceArray[i] < 0) {
                this.LJLILLLLZI = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL.length) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.LJLJI != -1) {
            this.LJLIL.checkIsMutable$kotlin_stdlib();
            this.LJLIL.removeKeyAt(this.LJLJI);
            this.LJLJI = -1;
            return;
        }
        "Call next() before removing element from the iterator.".toString();
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }

    public C65869PtB(C65864Pt6<K, V> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
        this.LJLJI = -1;
        LIZ();
    }
}
