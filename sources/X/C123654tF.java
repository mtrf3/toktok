package X;

import java.util.Comparator;

/* renamed from: X.4tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123654tF<T> implements Comparator {
    public static final C123654tF<T> LJLIL = new C123654tF<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        OSZ osz = (OSZ) obj;
        OSZ osz2 = (OSZ) obj2;
        if (((Number) osz.getFirst()).intValue() > ((Number) osz2.getFirst()).intValue()) {
            return 1;
        }
        if (((Number) osz.getFirst()).intValue() == ((Number) osz2.getFirst()).intValue()) {
            return 0;
        }
        return -1;
    }
}
