package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.CiB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32063CiB implements Comparator<Comparable<? super Object>> {
    public static final C32063CiB LJLIL = new C32063CiB();

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C32064CiC.LJLIL;
    }

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> b) {
        Comparable<? super Object> a = comparable;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        return a.compareTo(b);
    }
}
