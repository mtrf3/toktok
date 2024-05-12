package X;

import java.util.Comparator;

/* renamed from: X.Ixq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48322Ixq<T> implements Comparator {
    public static final C48322Ixq<T> LJLIL = new C48322Ixq<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C48321Ixp) obj).LIZIZ;
        long j2 = ((C48321Ixp) obj2).LIZIZ;
        if (j > j2) {
            return 1;
        }
        if (j < j2) {
            return -1;
        }
        return 0;
    }
}
