package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.CiC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32064CiC implements Comparator<Comparable<? super Object>> {
    public static final C32064CiC LJLIL = new C32064CiC();

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C32063CiB.LJLIL;
    }

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> a, Comparable<? super Object> comparable) {
        Comparable<? super Object> b = comparable;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        return b.compareTo(a);
    }
}
