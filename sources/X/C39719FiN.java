package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.FiN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39719FiN {
    public static LinkedBlockingQueue<C39720FiO> LIZ = new LinkedBlockingQueue<>(10);

    public static String LIZ(C39720FiO c39720FiO) {
        LinkedBlockingQueue<C39720FiO> linkedBlockingQueue = LIZ;
        if (linkedBlockingQueue == null || linkedBlockingQueue.isEmpty()) {
            return c39720FiO.LJLIL;
        }
        StringBuilder sb = new StringBuilder(c39720FiO.LJLIL);
        ArrayList arrayList = new ArrayList();
        Iterator<C39720FiO> it = LIZ.iterator();
        while (it.hasNext()) {
            C39720FiO next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList);
        int min = Math.min(3, arrayList.size());
        for (int i = 0; i < min - 1; i++) {
            if (ListProtector.get(arrayList, i) != null) {
                sb.append("\n");
                sb.append(((C39720FiO) ListProtector.get(arrayList, i)).LJLIL);
            }
        }
        return sb.toString();
    }
}
