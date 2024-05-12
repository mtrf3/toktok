package X;

import Y.IDComparatorS334S0100000_1;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3HO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HO extends PMI {
    public static final /* synthetic */ int LIZIZ = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HO(C3R9 parameters) {
        super(parameters);
        o.LJIIIZ(parameters, "parameters");
    }

    public final Object LJIILL(List<? extends C63120Opw> list, InterfaceC67352kd<? super List<? extends C63120Opw>> interfaceC67352kd) {
        long j;
        int i;
        long j2;
        C34B.LJI("RecentConversationCollator", "sort start");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!((C3R9) this.LIZ).LJIIL) {
            for (C63120Opw c63120Opw : list) {
                C109544Rq lastShowMessage = c63120Opw.getLastShowMessage();
                if (lastShowMessage != null) {
                    j2 = lastShowMessage.getCreatedAt();
                } else {
                    j2 = 0;
                }
                linkedHashMap.put(c63120Opw, new Long(j2));
            }
            List LLILII = ORZ.LLILII(new IDComparatorS334S0100000_1(linkedHashMap, 9), list);
            C34B.LJI("RecentConversationCollator", "sort finish");
            return LLILII;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C63120Opw c63120Opw2 : list) {
            C109544Rq lastShowMessage2 = c63120Opw2.getLastShowMessage();
            if (lastShowMessage2 != null) {
                j = lastShowMessage2.getCreatedAt();
            } else {
                j = 0;
            }
            if (c63120Opw2.isStickTop()) {
                j = Math.max(j, c63120Opw2.getUpdatedTime());
            }
            linkedHashMap.put(c63120Opw2, new Long(j));
            if (c63120Opw2.isStickTop()) {
                i = 50;
            } else {
                i = 0;
            }
            linkedHashMap2.put(c63120Opw2, new Integer(i));
        }
        List LLILII2 = ORZ.LLILII(new Comparator() { // from class: X.3HN
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer num = linkedHashMap2.get(obj);
                Integer num2 = linkedHashMap2.get(obj2);
                if (o.LJ(num, num2)) {
                    return C66851QLn.LJFF(linkedHashMap.get(obj2), linkedHashMap.get(obj));
                }
                return C66851QLn.LJFF(num2, num);
            }
        }, list);
        C34B.LJI("RecentConversationCollator", "sort finish");
        return LLILII2;
    }
}
