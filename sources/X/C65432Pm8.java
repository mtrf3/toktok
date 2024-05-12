package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.Pm8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65432Pm8<E> extends HashSet<E> {
    public C65432Pm8(java.util.Set<E> set) {
        super(set);
    }

    public static <E> C65432Pm8<E> copyOf(java.util.Set<E> set) {
        return new C65432Pm8<>(set);
    }

    public static <E> C65432Pm8<E> of(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new C65432Pm8<>(hashSet);
    }
}
