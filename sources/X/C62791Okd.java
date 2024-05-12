package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Okd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62791Okd<T> implements Comparator {
    public static final C62791Okd<T> LJLIL = new C62791Okd<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((C62792Oke) obj).LJLIL;
        String str2 = ((C62792Oke) obj2).LJLIL;
        if (o.LJ(str, str2)) {
            return 0;
        }
        if (o.LJ(str, "#")) {
            return 1;
        }
        if (o.LJ(str2, "#")) {
            return -1;
        }
        return str.compareTo(str2);
    }
}
