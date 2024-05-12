package X;

import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123064sI extends AbstractC65781Prl implements InterfaceC65784Pro<List<Integer>> {
    public static final C123064sI LJLIL = new C123064sI();

    public C123064sI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<Integer> invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        List<Integer> list = C123054sH.LIZ;
        LJIIIZ.getClass();
        List<Integer> list2 = (List) FFL.LJIJ(true, "inbox_bubble_type_priority", 31744, List.class, list);
        if (list2 != null) {
            list = list2;
        }
        ArrayList LIZIZ = s1.LIZIZ(list, "ABManager.getInstance().…p::class.java) ?: DEFAULT");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            LIZIZ.add(Integer.valueOf(it.next().intValue()));
        }
        return LIZIZ;
    }
}
