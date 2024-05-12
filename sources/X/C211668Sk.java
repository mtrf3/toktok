package X;

import android.animation.Animator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.8Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211668Sk {
    public final long LIZ;
    public final Interpolator LIZIZ;
    public final Animator.AnimatorListener LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C211668Sk)) {
            return false;
        }
        C211668Sk c211668Sk = (C211668Sk) obj;
        return this.LIZ == c211668Sk.LIZ && o.LJ(this.LIZIZ, c211668Sk.LIZIZ) && o.LJ(this.LIZJ, c211668Sk.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31)) * 31;
        Animator.AnimatorListener animatorListener = this.LIZJ;
        return hashCode + (animatorListener == null ? 0 : animatorListener.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CleanModeAnimConfig(duration=");
        LIZ.append(this.LIZ);
        LIZ.append(", interpolator=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", listener=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C211668Sk(long j, Interpolator interpolator) {
        o.LJIIIZ(interpolator, "interpolator");
        this.LIZ = j;
        this.LIZIZ = interpolator;
        this.LIZJ = null;
    }
}
