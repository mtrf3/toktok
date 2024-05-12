package X;

import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class QC7 extends ContentObserver {
    public final /* synthetic */ QC6 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QC7(QC6 qc6) {
        super(null);
        this.LIZ = qc6;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        QC6 qc6 = this.LIZ;
        synchronized (qc6.LIZLLL) {
            qc6.LJ = null;
            AbstractC68056QnM.LJII.incrementAndGet();
        }
        synchronized (qc6) {
            Iterator it = ((ArrayList) qc6.LJFF).iterator();
            while (it.hasNext()) {
                ((QC9) it.next()).zza();
            }
        }
    }
}
