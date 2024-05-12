package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.C5x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30773C5x<T> implements Comparator {
    public static final C30773C5x<T> LJLIL = new C30773C5x<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C30775C5z o1 = (C30775C5z) obj;
        C30775C5z o2 = (C30775C5z) obj2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        return o1.LIZIZ - o2.LIZIZ;
    }
}
