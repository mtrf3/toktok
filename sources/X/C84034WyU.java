package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WyU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84034WyU implements InterfaceC84078WzC {
    public final AbstractC84025WyL LIZ;
    public final QC5 LIZIZ;

    public final void LIZ() {
        this.LIZ.setScanListener(null, this.LIZIZ);
        QC5 qc5 = this.LIZIZ;
        synchronized (qc5) {
            ((List) qc5.LIZ).clear();
        }
    }

    public C84034WyU(AbstractC84025WyL abstractC84025WyL) {
        new C169706lK();
        new ArrayList();
        this.LIZIZ = new QC5(2);
        new C84044Wye();
        this.LIZ = abstractC84025WyL;
    }
}
