package X;

import java.util.Comparator;

/* renamed from: X.QaE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67242QaE<T> implements Comparator {
    public static final C67242QaE<T> LJLIL = new C67242QaE<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C67239QaB) obj).LIZLLL;
        long j2 = ((C67239QaB) obj2).LIZLLL;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
