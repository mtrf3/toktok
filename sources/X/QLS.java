package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class QLS implements InterfaceC66845QLh {
    public static volatile QLS LIZIZ;
    public final CopyOnWriteArraySet<InterfaceC66845QLh> LIZ = new CopyOnWriteArraySet<>();

    public static QLS LIZIZ() {
        if (LIZIZ == null) {
            synchronized (QLS.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QLS();
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC66845QLh
    public final void LIZ(long j, String str, boolean z) {
        Iterator<InterfaceC66845QLh> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ(j, str, z);
            } catch (Throwable unused) {
            }
        }
    }
}
