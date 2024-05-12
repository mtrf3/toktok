package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M78 {
    public volatile M7A LIZ;
    public final List<InterfaceC88471Ynr<M7A, M7A, C76800UCe>> LIZIZ;

    public final void LIZ() {
        LIZJ(M7A.DISMISSED);
    }

    public final void LIZIZ() {
        LIZJ(M7A.FAILED);
    }

    public M78(M7A state) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
        this.LIZIZ = new ArrayList();
    }

    public final synchronized void LIZJ(M7A m7a) {
        M7A m7a2 = this.LIZ;
        if (m7a2 != m7a) {
            this.LIZ = m7a;
            if (m7a != M7A.PENDING) {
                Iterator<InterfaceC88471Ynr<M7A, M7A, C76800UCe>> it = this.LIZIZ.iterator();
                while (it.hasNext()) {
                    it.next().invoke(m7a2, m7a);
                }
            }
            if (m7a == M7A.DISMISSED || m7a == M7A.FAILED || m7a == M7A.IGNORED) {
                ((ArrayList) this.LIZIZ).clear();
            }
        }
    }
}
