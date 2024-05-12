package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82373Ld<T> implements Comparator {
    public static final C82373Ld<T> LJLIL = new C82373Ld<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3L4 c3l4 = (C3L4) obj;
        C3L4 c3l42 = (C3L4) obj2;
        C82833Mx.LIZ.getClass();
        if (C82833Mx.LIZIZ) {
            return o.LJIIL(c3l42.LJLIL, c3l4.LJLIL);
        }
        int i = c3l4.LJLZ;
        int i2 = c3l42.LJLZ;
        if (i == i2) {
            if (AnonymousClass304.LIZIZ()) {
                return o.LJIIL(Math.max(c3l42.LJLJL, c3l42.LJLLI), Math.max(c3l4.LJLJL, c3l4.LJLLI));
            }
            return o.LJIIL(c3l42.LJLJL, c3l4.LJLJL);
        }
        return o.LJIIJJI(i2, i);
    }
}
