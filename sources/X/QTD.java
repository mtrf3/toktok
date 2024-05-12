package X;

import com.ss.android.ug.bus.UgCallbackCenter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public final class QTD implements InterfaceC66999QRf {
    @Override // X.InterfaceC66999QRf
    public final List<String> LIZIZ() {
        QTJ qtj = (QTJ) QPG.LIZ(QTJ.class);
        if (qtj == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        qtj.LJJ(new QTF(arrayList, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        return arrayList;
    }

    @Override // X.InterfaceC66999QRf
    public final String getSecUid() {
        QTJ qtj = (QTJ) QPG.LIZ(QTJ.class);
        if (qtj == null) {
            return null;
        }
        return qtj.getSecUid();
    }

    @Override // X.InterfaceC66999QRf
    public final void LIZ(QS2 qs2) {
        UgCallbackCenter.LIZIZ(null, qs2);
    }

    @Override // X.InterfaceC66999QRf
    public final void LIZJ(QS4 qs4) {
        UgCallbackCenter.LIZIZ(null, qs4);
    }

    @Override // X.InterfaceC66999QRf
    public final void LIZLLL(QS3 qs3) {
        UgCallbackCenter.LIZIZ(null, qs3);
    }
}
