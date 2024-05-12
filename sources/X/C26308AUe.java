package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.AUe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26308AUe {
    public final String LIZ = "tiktok_social_friends_interaction_res";
    public final String LIZIZ = "story/O2_story_ring3.json";
    public float LIZJ = 0.0f;
    public Animator.AnimatorListener LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26308AUe)) {
            return false;
        }
        C26308AUe c26308AUe = (C26308AUe) obj;
        return o.LJ(this.LIZ, c26308AUe.LIZ) && o.LJ(this.LIZIZ, c26308AUe.LIZIZ) && Float.compare(this.LIZJ, c26308AUe.LIZJ) == 0 && o.LJ(this.LIZLLL, c26308AUe.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarLottieSource(channel=");
        LIZ.append(this.LIZ);
        LIZ.append(", fileName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", process=");
        LIZ.append(this.LIZJ);
        LIZ.append(", animationListener=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Animator.AnimatorListener animatorListener = this.LIZLLL;
        if (animatorListener == null) {
            hashCode = 0;
        } else {
            hashCode = animatorListener.hashCode();
        }
        return LIZIZ + hashCode;
    }
}
