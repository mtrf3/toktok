package X;

import Y.AfS55S0100000_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194747kc extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ List<String> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194747kc(List<String> list) {
        super(0);
        this.LJLIL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        java.util.Set LLJILLL = ORZ.LLJILLL(this.LJLIL);
        LLJILLL.remove(curUserId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LLJILLL) {
            C194757kd c194757kd = (C194757kd) ((C35979EAd) C194767ke.LIZ.getValue()).LIZIZ(obj);
            if (c194757kd == null || System.currentTimeMillis() - c194757kd.LIZ >= 1800000) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((java.util.Set) C194767ke.LIZIZ.getValue()).contains(next)) {
                arrayList2.add(next);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = arrayList2;
        if (!isEmpty) {
            int size = arrayList2.size();
            arrayList3 = arrayList2;
            if (8 < size) {
                arrayList3 = arrayList2.subList(0, 8);
            }
        }
        if (!arrayList3.isEmpty()) {
            ((java.util.Set) C194767ke.LIZIZ.getValue()).addAll(arrayList3);
            C78999UzT.LJFF(C7X6.LIZJ().getMultiUserNowPostObservable(arrayList3.toString()).LJJL(T16.LIZ()).LJJJ(new C73950T0o(C195817mL.LIZ())).LJJJLIIL(new AfS55S0100000_3(arrayList3, 55), new AfS55S0100000_3(arrayList3, 56)), (C73318Sq2) C194767ke.LIZJ.getValue());
        }
        return C76800UCe.LIZ;
    }
}
