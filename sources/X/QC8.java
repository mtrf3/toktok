package X;

import X.C0M9;
import android.os.Build;
import android.os.StrictMode;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class QC8 implements InterfaceC68071Qnb {
    public static final C1HQ LIZ = new C1HQ();

    @Override // X.InterfaceC68071Qnb
    public final Object LIZ(String str) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QC8 LIZIZ() {
        boolean z;
        QC8 qc8;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (QC8.class) {
                qc8 = (QC8) LIZ.getOrDefault(null, null);
                if (qc8 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return qc8;
        }
        throw null;
    }

    public static synchronized void LIZJ() {
        synchronized (QC8.class) {
            C1HQ c1hq = LIZ;
            Iterator it = ((C0M9.e) c1hq.values()).iterator();
            if (!it.hasNext()) {
                c1hq.clear();
            } else {
                ((QC8) it.next()).getClass();
                throw null;
            }
        }
    }
}
