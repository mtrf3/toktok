package X;

import java.util.Comparator;

/* renamed from: X.QaG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67244QaG<T> implements Comparator {
    public static final C67244QaG<T> LJLIL = new C67244QaG<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C67240QaC) obj).LIZIZ;
        long j2 = ((C67240QaC) obj2).LIZIZ;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
