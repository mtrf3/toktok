package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Oux, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63431Oux<T> implements Comparator {
    public static final C63431Oux<T> LJLIL = new C63431Oux<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long longValue;
        C63426Ous c63426Ous = (C63426Ous) obj2;
        Long l = ((C63426Ous) obj).LIZ.next_cursor;
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        Long l2 = c63426Ous.LIZ.next_cursor;
        if (l2 != null) {
            j = l2.longValue();
        }
        return o.LJIIL(longValue, j);
    }
}
