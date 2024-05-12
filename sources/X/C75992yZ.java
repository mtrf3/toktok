package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75992yZ extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C63120Opw>, C76800UCe> {
    public final /* synthetic */ C31Q LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75992yZ(C31Q c31q, long j, long j2, long j3) {
        super(1);
        this.LJLIL = c31q;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends C63120Opw> list) {
        List<? extends C63120Opw> list2 = list;
        if (list2 != null) {
            long j = this.LJLJI;
            ArrayList arrayList = new ArrayList();
            for (C63120Opw c63120Opw : list2) {
                C63120Opw c63120Opw2 = c63120Opw;
                C109544Rq lastShowMessage = c63120Opw2.getLastShowMessage();
                if (lastShowMessage != null && lastShowMessage.getIndex() > j) {
                    C771931f.LJI.getClass();
                    if (C773631w.LIZ(c63120Opw2)) {
                        arrayList.add(c63120Opw);
                    }
                }
            }
            C31Q c31q = this.LJLIL;
            long j2 = this.LJLILLLLZI;
            long j3 = this.LJLJJI;
            if (!c31q.LIZLLL(9, arrayList)) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C63120Opw) it.next()).getLastShowMessage());
                }
                C31Q.LJIILJJIL(c31q, null, arrayList2, 1);
            } else {
                C31Q.LJIIL(c31q, Math.max((c31q.LJFF() - j3) - (SystemClock.elapsedRealtime() - j2), 0L), 2);
            }
        }
        this.LJLIL.LJIIIZ(9, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
