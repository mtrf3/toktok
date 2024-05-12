package X;

import Y.ALAdapterS11S0100000_14;
import Y.IDAListenerS238S0100000_14;
import android.animation.Animator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes15.dex */
public final class WN3 {
    public final Animation LIZ;
    public final Animator LIZIZ;
    public WNG LIZJ;

    public final void LIZIZ() {
        Animation animation = this.LIZ;
        if (animation != null) {
            animation.cancel();
            this.LIZ.reset();
            WNG wng = this.LIZJ;
            if (wng == null || wng.LIZIZ) {
                return;
            }
            wng.LIZIZ = true;
            wng.LIZ.run();
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null) {
            return;
        }
        animator.end();
    }

    public WN3(Animator animator) {
        this.LIZIZ = animator;
    }

    public static void LIZLLL(Animation animation) {
        Interpolator interpolator = animation.getInterpolator();
        if (interpolator != null) {
            if (interpolator instanceof WNF) {
                animation.setInterpolator(((WNF) interpolator).LIZ);
            } else {
                animation.setInterpolator(new WNF(interpolator));
            }
        } else {
            animation.setInterpolator(new WNF());
        }
        if (animation instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) animation).getAnimations();
            for (int i = 0; i < animations.size(); i++) {
                LIZLLL((Animation) ListProtector.get(animations, i));
            }
        }
    }

    public final void LIZ(Runnable runnable) {
        this.LIZJ = new WNG(runnable);
        Animation animation = this.LIZ;
        if (animation != null) {
            animation.setAnimationListener(new IDAListenerS238S0100000_14(this, 13));
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null) {
            return;
        }
        animator.addListener(new ALAdapterS11S0100000_14(this, 38));
    }

    public final void LJ(View view) {
        Animation animation = this.LIZ;
        if (animation != null) {
            view.startAnimation(animation);
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null) {
            return;
        }
        animator.setTarget(view);
        this.LIZIZ.start();
    }

    public WN3(Animation animation) {
        this.LIZ = animation;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(5:19|20|(2:22|23)|10|11)|3|4|(2:6|7)|10|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r2 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r1 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return new X.WN3(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.WN3 LIZJ(android.app.Activity r3, int r4) {
        /*
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r4)
            java.lang.String r0 = "anim"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L1e
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)     // Catch: android.content.res.Resources.NotFoundException -> L1c java.lang.RuntimeException -> L1e
            if (r1 == 0) goto L39
            X.WN3 r0 = new X.WN3     // Catch: android.content.res.Resources.NotFoundException -> L1c java.lang.RuntimeException -> L1e
            r0.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1c java.lang.RuntimeException -> L1e
            return r0
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r3, r4)     // Catch: java.lang.RuntimeException -> L2a
            if (r1 == 0) goto L39
            X.WN3 r0 = new X.WN3     // Catch: java.lang.RuntimeException -> L2a
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L2a
            return r0
        L2a:
            r0 = move-exception
            if (r2 != 0) goto L41
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
            if (r1 == 0) goto L39
            X.WN3 r0 = new X.WN3
            r0.<init>(r1)
            return r0
        L39:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "resource is error"
            r1.<init>(r0)
            throw r1
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WN3.LIZJ(android.app.Activity, int):X.WN3");
    }
}
