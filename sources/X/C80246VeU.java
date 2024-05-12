package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VeU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80246VeU {
    public final C0MA<String, C80247VeV> LIZ = new C0MA<>();
    public final C0MA<String, PropertyValuesHolder[]> LIZIZ = new C0MA<>();

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return "\n" + C80246VeU.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.LIZ + "}\n";
    }

    public static C80246VeU LIZIZ(List<Animator> list) {
        C80246VeU c80246VeU = new C80246VeU();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) ListProtector.get(list, i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c80246VeU.LIZIZ.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C80237VeL.LIZIZ;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C80237VeL.LIZJ;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C80237VeL.LIZLLL;
                }
                C80247VeV c80247VeV = new C80247VeV(startDelay, duration, interpolator);
                c80247VeV.LIZLLL = objectAnimator.getRepeatCount();
                c80247VeV.LJ = objectAnimator.getRepeatMode();
                c80246VeU.LIZ.put(propertyName, c80247VeV);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Animator must be an ObjectAnimator: ");
                LIZ.append(animator);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        return c80246VeU;
    }

    public final C80247VeV LIZJ(String str) {
        if (this.LIZ.getOrDefault(str, null) != null) {
            return this.LIZ.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80246VeU)) {
            return false;
        }
        return this.LIZ.equals(((C80246VeU) obj).LIZ);
    }

    public static C80246VeU LIZ(int i, Context context) {
        Animator loadAnimator;
        try {
            loadAnimator = AnimatorInflater.loadAnimator(context, i);
        } catch (Exception unused) {
        }
        if (loadAnimator instanceof AnimatorSet) {
            return LIZIZ(((AnimatorSet) loadAnimator).getChildAnimations());
        }
        if (loadAnimator != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return LIZIZ(arrayList);
        }
        return null;
    }
}
