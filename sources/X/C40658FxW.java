package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.FxW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40658FxW extends ORS {
    public static final <T extends Comparable<? super T>> SortedSet<T> LJLI(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        TreeSet treeSet = new TreeSet();
        ORZ.LLILZLL(iterable, treeSet);
        return treeSet;
    }

    public static final <R> List<R> LJJZZIII(Iterable<?> iterable, Class<R> cls) {
        o.LJIIIZ(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        LJL(iterable, arrayList, cls);
        return arrayList;
    }

    public static final void LJL(Iterable iterable, Collection collection, Class klass) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                ((ArrayList) collection).add(obj);
            }
        }
    }
}
