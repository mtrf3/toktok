package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.60Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60Z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.util.ArrayList] */
    public static List LIZ(List list) {
        if (C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) != 0) {
            list = C61328O5c.LJ(list);
            Iterator it = list.iterator();
            int i = 0;
            Integer num = null;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if (((C1536461g) next).LIZ == 25) {
                        num = Integer.valueOf(i);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                ListProtector.add(list, 0, ListProtector.remove(list, intValue));
                ListProtector.add(list, 1, ListProtector.remove(list, intValue + 1));
            }
        }
        return list;
    }
}
