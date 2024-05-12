package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.QIc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66762QIc implements QJP {
    public final QI3 LIZ;
    public final CopyOnWriteArraySet<QJP> LIZIZ = new CopyOnWriteArraySet<>();

    public C66762QIc(QI3 qi3) {
        this.LIZ = qi3;
    }

    @Override // X.QJP
    public final void LIZ(long j, String str, boolean z) {
        Iterator<QJP> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ(j, str, z);
            } catch (Throwable th) {
                this.LIZ.LJJIZ.LJIILL(Collections.singletonList("LaunchObserverHolder"), "invoke onLaunch callback failed", th, new Object[0]);
            }
        }
    }
}
