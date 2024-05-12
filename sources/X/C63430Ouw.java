package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ouw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63430Ouw<T> implements Comparator {
    public static final C63430Ouw<T> LJLIL = new C63430Ouw<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long longValue;
        C63424Ouq c63424Ouq = (C63424Ouq) obj2;
        Long l = ((C63424Ouq) obj).LIZ.next_cursor;
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        Long l2 = c63424Ouq.LIZ.next_cursor;
        if (l2 != null) {
            j = l2.longValue();
        }
        return o.LJIIL(longValue, j);
    }
}
