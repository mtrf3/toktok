package X;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLZ<E> {
    public final int LIZ;
    public final LinkedList<E> LIZIZ;

    public final void LIZ(E e) {
        if (this.LIZIZ.size() >= this.LIZ) {
            this.LIZIZ.poll();
        }
        this.LIZIZ.offer(e);
    }

    public XLZ(List<? extends E> list, int i) {
        o.LJIIIZ(list, "list");
        this.LIZ = i;
        LinkedList<E> linkedList = new LinkedList<>();
        this.LIZIZ = linkedList;
        linkedList.addAll(list.size() > i ? list.subList(list.size() - i, list.size() - 1) : list);
    }
}
