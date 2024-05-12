package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JBM {
    public final Animator LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JBM)) {
            return false;
        }
        JBM jbm = (JBM) obj;
        return o.LJ(this.LIZ, jbm.LIZ) && o.LJ(this.LIZIZ, jbm.LIZIZ) && this.LIZJ == jbm.LIZJ;
    }

    public final int hashCode() {
        int hashCode;
        Animator animator = this.LIZ;
        if (animator == null) {
            hashCode = 0;
        } else {
            hashCode = animator.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LIZJ) + C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractAnimation(animator=");
        LIZ.append(this.LIZ);
        LIZ.append(", id=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", delay=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public JBM(Animator animator, String str, long j) {
        this.LIZ = animator;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
