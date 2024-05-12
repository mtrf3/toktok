package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.PrX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65767PrX<E> extends ArrayList<E> {
    public C65767PrX(int i) {
        super(i);
    }

    public static <E> C65767PrX<E> copyOf(List<E> list) {
        return new C65767PrX<>(list);
    }

    public static <E> C65767PrX<E> of(E... eArr) {
        C65767PrX<E> c65767PrX = new C65767PrX<>(eArr.length);
        Collections.addAll(c65767PrX, eArr);
        return c65767PrX;
    }

    public C65767PrX(List<E> list) {
        super(list);
    }
}
