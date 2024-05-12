package X;

import java.util.List;

/* renamed from: X.3J8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J8 {
    public static C3J9 LIZ(java.util.Map map, boolean z, boolean z2) {
        List list;
        List list2;
        Iterable iterable = (Iterable) map.get(C3JB.SESSION_LIST);
        if (iterable == null || (list = ORZ.LLJI(iterable)) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterable iterable2 = (Iterable) map.get(C3JB.MESSAGE_REQUEST_CELL);
        if (iterable2 == null || (list2 = ORZ.LLJI(iterable2)) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        return new C3J9(list, z, list2, z2);
    }
}
