package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.FfP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39535FfP extends WeakReference<Throwable> {
    public final int LIZ;

    public C39535FfP(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.LIZ = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C39535FfP.class) {
            if (this == obj) {
                return true;
            }
            C39535FfP c39535FfP = (C39535FfP) obj;
            if (this.LIZ == c39535FfP.LIZ && get() == c39535FfP.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.LIZ;
    }
}
