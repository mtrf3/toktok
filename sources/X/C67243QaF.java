package X;

import java.util.Comparator;

/* renamed from: X.QaF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67243QaF<T> implements Comparator {
    public static final C67243QaF<T> LJLIL = new C67243QaF<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C67239QaB) obj).LJ;
        long j2 = ((C67239QaB) obj2).LJ;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
