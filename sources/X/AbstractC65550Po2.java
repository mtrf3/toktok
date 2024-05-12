package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Po2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65550Po2<T> implements Comparator<T> {
    public static <T> AbstractC65550Po2<T> LIZ(Comparator<T> comparator) {
        if (comparator instanceof AbstractC65550Po2) {
            return (AbstractC65550Po2) comparator;
        }
        return new C65549Po1(comparator);
    }

    public final <E extends T> List<E> LIZIZ(Iterable<E> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<E> it = iterable.iterator();
            arrayList = new ArrayList();
            C65631PpL.LIZ(arrayList, it);
        }
        Object[] array = arrayList.toArray();
        Arrays.sort(array, this);
        return C65661Ppp.LIZ(Arrays.asList(array));
    }
}
