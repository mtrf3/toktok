package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.VeV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80247VeV {
    public final long LIZ;
    public final long LIZIZ;
    public final TimeInterpolator LIZJ;
    public int LIZLLL;
    public int LJ = 1;

    public final TimeInterpolator LIZIZ() {
        TimeInterpolator timeInterpolator = this.LIZJ;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C80237VeL.LIZIZ;
    }

    public final int hashCode() {
        long j = this.LIZ;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.LIZIZ;
        return ((((LIZIZ().getClass().hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        return "\n" + C80247VeV.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.LIZ + " duration: " + this.LIZIZ + " interpolator: " + LIZIZ().getClass() + " repeatCount: " + this.LIZLLL + " repeatMode: " + this.LJ + "}\n";
    }

    public C80247VeV(long j) {
        this.LIZIZ = 300L;
        this.LIZ = j;
        this.LIZIZ = 150L;
    }

    public final void LIZ(Animator animator) {
        animator.setStartDelay(this.LIZ);
        animator.setDuration(this.LIZIZ);
        animator.setInterpolator(LIZIZ());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.LIZLLL);
            valueAnimator.setRepeatMode(this.LJ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80247VeV)) {
            return false;
        }
        C80247VeV c80247VeV = (C80247VeV) obj;
        if (this.LIZ != c80247VeV.LIZ || this.LIZIZ != c80247VeV.LIZIZ || this.LIZLLL != c80247VeV.LIZLLL || this.LJ != c80247VeV.LJ) {
            return false;
        }
        return LIZIZ().getClass().equals(c80247VeV.LIZIZ().getClass());
    }

    public C80247VeV(long j, long j2, TimeInterpolator timeInterpolator) {
        this.LIZIZ = 300L;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = timeInterpolator;
    }
}
