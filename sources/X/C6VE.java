package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.6VE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VE<T> implements Comparator<C6V4> {
    public static final C6VE LJLIL = new C6VE();

    @Override // java.util.Comparator
    public final int compare(C6V4 c6v4, C6V4 c6v42) {
        C6V4 o1 = c6v4;
        C6V4 o2 = c6v42;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        return o2.LIZIZ - o1.LIZIZ;
    }
}
