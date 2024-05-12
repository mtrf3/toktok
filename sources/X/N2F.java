package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2F<T> implements Comparator {
    public static final N2F<T> LJLIL = new N2F<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return -o.LJIIJJI(((N2A) obj).LJ, ((N2A) obj2).LJ);
    }
}
