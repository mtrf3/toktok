package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public final class QTG implements QTI {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;

    @Override // X.QTI
    public final void onError() {
        this.LIZIZ.countDown();
    }

    @Override // X.QTI
    public final void LIZ(List<QTH> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            this.LIZ.add(((QTH) it.next()).LIZIZ);
        }
        this.LIZIZ.countDown();
    }

    public QTG(List list, CountDownLatch countDownLatch) {
        this.LIZ = list;
        this.LIZIZ = countDownLatch;
    }
}
