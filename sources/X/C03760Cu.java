package X;

import Y.IDComparatorS28S0000000;
import java.util.TreeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.0Cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03760Cu {
    public final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C45971rF.LJLIL);
    public final C0D2<C29321Dc> LIZIZ;

    public final String toString() {
        String abstractCollection = toString();
        o.LJIIIIZZ(abstractCollection, "set.toString()");
        return abstractCollection;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0D2, X.0D2<X.1Dc>] */
    public C03760Cu() {
        final IDComparatorS28S0000000 iDComparatorS28S0000000 = new IDComparatorS28S0000000(6);
        this.LIZIZ = new TreeSet<E>(iDComparatorS28S0000000) { // from class: X.0D2
            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iDComparatorS28S0000000);
                o.LJIIIZ(iDComparatorS28S0000000, "comparator");
            }
        };
    }

    public final void LIZ(C29321Dc node) {
        o.LJIIIZ(node, "node");
        if (node.LJJIIZ()) {
            add(node);
        } else {
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean LIZIZ(C29321Dc node) {
        o.LJIIIZ(node, "node");
        if (node.LJJIIZ()) {
            return remove(node);
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
