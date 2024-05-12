package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fxn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40675Fxn extends C40676Fxo {
    public static final <T extends Comparable<? super T>> void LJJLIIIIJ(List<T> list) {
        o.LJIIIZ(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void LJJLIIIJ(List<T> list, Comparator<? super T> comparator) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
