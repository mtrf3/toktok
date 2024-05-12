package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.32I, reason: invalid class name */
/* loaded from: classes2.dex */
public class C32I extends C47261Igj {
    public static final <T> List<T> LJJLI(Iterable<? extends Iterable<? extends T>> iterable) {
        o.LJIIIZ(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next(), arrayList);
        }
        return arrayList;
    }

    public static final <T> int LJJL(Iterable<? extends T> iterable, int i) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
