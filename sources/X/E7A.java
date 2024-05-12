package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E7A {
    public final C61878OQg LIZ;
    public final C61878OQg LIZIZ;

    public E7A() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LIZ = c61878OQg;
        this.LIZIZ = c61878OQg;
    }

    public final List<String> LIZ(String taskKey) {
        Object second;
        o.LJIIIZ(taskKey, "taskKey");
        C61878OQg c61878OQg = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = c61878OQg.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            if (o.LJ(osz.getFirst(), taskKey) && (second = osz.getSecond()) != null) {
                arrayList.add(second);
            }
        }
        return arrayList;
    }
}
