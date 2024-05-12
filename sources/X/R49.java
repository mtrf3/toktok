package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class R49 implements R3S {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ R4B LIZIZ;
    public final /* synthetic */ R4I LIZJ;

    @Override // X.R3S
    public final void onError() {
        Integer valueOf = Integer.valueOf(this.LIZJ.LIZLLL);
        String str = this.LIZJ.LJFF;
        R4B r4b = this.LIZIZ;
        Iterator it = ((CopyOnWriteArrayList) R41.LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(2, false, 0, null);
        }
        if (r4b != null) {
            r4b.LIZJ(valueOf, str);
        }
    }

    @Override // X.R3S
    public final void LIZ(QTX qtx) {
        R4D.LIZIZ(qtx, this.LIZ, this.LIZIZ);
    }

    public R49(Bundle bundle, R4B r4b, R4I r4i) {
        this.LIZ = bundle;
        this.LIZIZ = r4b;
        this.LIZJ = r4i;
    }
}
