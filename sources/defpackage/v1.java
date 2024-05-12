package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class v1<T> implements Comparator {
    public static final v1<T> LJLIL = new v1<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer p1 = (Integer) obj2;
        int intValue = ((Integer) obj).intValue();
        o.LJIIIIZZ(p1, "p1");
        return o.LJIIJJI(intValue, p1.intValue());
    }
}
