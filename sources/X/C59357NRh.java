package X;

import Y.ALAdapterS3S0100000_4;
import Y.ALAdapterS5S0300000_10;
import Y.ALAdapterS8S0100000_10;
import Y.ALAdapterS8S0200000_10;
import Y.AUListenerS100S0200000_10;
import Y.AUListenerS93S0100000_4;
import Y.AUListenerS98S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewParent;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.NRh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59357NRh {
    public final NSM LIZ;
    public final AnonymousClass954 LIZIZ;
    public final AbstractC59359NRj LIZJ;
    public final AbstractC59359NRj LIZLLL;
    public final InterfaceC59366NRq<? extends NSG> LJ;
    public final InterfaceC59366NRq<NSG> LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public Animator LJIIL;
    public Animator LJIILIIL;
    public Animator LJIILJJIL;
    public Animator LJIILL;
    public Animator LJIILLIIL;
    public Animator LJIIZILJ;
    public Animator LJIJ;
    public Animator LJIJI;
    public Animator LJIJJ;
    public Animator LJIJJLI;
    public Animator LJIL;
    public Animator LJJ;

    public final ValueAnimator LJI() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(C55953Lxd.LJIIIZ());
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 50));
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 15));
        return ofFloat;
    }

    public final ValueAnimator LJII() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LIZIZ.LIZIZ(), C47135Ieh.LIZ(95, C47135Ieh.LIZ(-19, C8ON.LIZIZ() * 2)));
        ofInt.setInterpolator(C55953Lxd.LJIIIZ());
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 51));
        return ofInt;
    }

    public final Animator LIZJ() {
        InterfaceC59366NRq<? extends NSG> interfaceC59366NRq = this.LJ;
        ValueAnimator ofInt = ValueAnimator.ofInt(-this.LJIIJ, C8ON.LIZIZ());
        ofInt.addUpdateListener(new AUListenerS98S0100000_10(interfaceC59366NRq, 11));
        ofInt.addListener(new ALAdapterS8S0100000_10(this, 7));
        ofInt.setInterpolator(C55953Lxd.LJIIIZ());
        return ofInt;
    }

    public final Animator LIZLLL() {
        Animator animator;
        if (this.LJIIL == null) {
            if (this.LJI) {
                animator = LIZJ();
            } else {
                ValueAnimator LJI = LJI();
                LJI.setDuration(200L);
                ValueAnimator LJII = LJII();
                LJII.setDuration(600L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LJI, LJII);
                animatorSet.playTogether(LIZJ(), LJII);
                animator = animatorSet;
            }
            this.LJIIL = animator;
        }
        return this.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Animator LJFF() {
        ValueAnimator valueAnimator;
        if (this.LJIILJJIL == null) {
            AbstractC59359NRj abstractC59359NRj = this.LIZLLL;
            if (abstractC59359NRj != null) {
                valueAnimator = ValueAnimator.ofInt(-this.LJII, 0);
                valueAnimator.addUpdateListener(new AUListenerS98S0100000_10(abstractC59359NRj, 8));
                valueAnimator.setDuration(600L);
                valueAnimator.setInterpolator(C55953Lxd.LJIIIZ());
                valueAnimator.addListener(new ALAdapterS8S0200000_10(abstractC59359NRj, this, 2));
                if (!this.LJI) {
                    ValueAnimator LJI = LJI();
                    LJI.setDuration(200L);
                    ValueAnimator LJII = LJII();
                    LJII.setDuration(600L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(LJI, LJII);
                    animatorSet.playTogether(valueAnimator, LJII);
                    valueAnimator = animatorSet;
                }
            } else {
                valueAnimator = null;
            }
            this.LJIILJJIL = valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.addListener(new ALAdapterS8S0100000_10(this, 6));
            }
        }
        return this.LJIILJJIL;
    }

    public final Animator LJIIIZ() {
        AnimatorSet animatorSet;
        if (this.LJIILL == null) {
            AbstractC59359NRj abstractC59359NRj = this.LIZJ;
            if (abstractC59359NRj != null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-this.LJIIIIZZ, 0);
                ofInt.addUpdateListener(new AUListenerS98S0100000_10(abstractC59359NRj, 9));
                ofInt.setDuration(600L);
                ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                ofInt.addListener(new ALAdapterS8S0200000_10(abstractC59359NRj, this, 3));
                Animator LJ = LJ(false);
                LJ.setDuration(200L);
                Animator LIZIZ = LIZIZ(true);
                LIZIZ.setDuration(600L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LJ, ofInt);
                animatorSet.playTogether(ofInt, LIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIILL = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS8S0100000_10(this, 6));
            }
        }
        return this.LJIILL;
    }

    public final Animator LJIIJ() {
        AnimatorSet animatorSet;
        if (this.LJIJJ == null) {
            AbstractC59359NRj abstractC59359NRj = this.LIZJ;
            if (abstractC59359NRj != null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.LJIIIIZZ);
                ofInt.addUpdateListener(new AUListenerS98S0100000_10(abstractC59359NRj, 10));
                ofInt.setDuration(400L);
                ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                ofInt.addListener(new ALAdapterS8S0100000_10(abstractC59359NRj, 8));
                Animator LJ = LJ(true);
                LJ.setDuration(200L);
                Animator LIZIZ = LIZIZ(false);
                LIZIZ.setDuration(400L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofInt, LJ);
                animatorSet.playTogether(ofInt, LIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIJJ = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS8S0100000_10(this, 6));
            }
        }
        return this.LJIJJ;
    }

    public final Animator LJIIJJI() {
        AnimatorSet animatorSet;
        if (this.LJIIZILJ == null) {
            AbstractC59359NRj abstractC59359NRj = this.LIZJ;
            AbstractC59359NRj abstractC59359NRj2 = this.LIZLLL;
            if (abstractC59359NRj != null && abstractC59359NRj2 != null) {
                int[] iArr = {this.LJIIIIZZ, this.LJII};
                ValueAnimator ofInt = ValueAnimator.ofInt(0, ORY.LJJLIIIJL(iArr));
                ofInt.addUpdateListener(new AUListenerS100S0200000_10(new AbstractC59359NRj[]{abstractC59359NRj, abstractC59359NRj2}, iArr, 0));
                ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                ofInt.setDuration(600L);
                ofInt.addListener(new ALAdapterS5S0300000_10(this, abstractC59359NRj, abstractC59359NRj2, 0));
                Animator LJ = LJ(false);
                LJ.setDuration(200L);
                Animator LIZIZ = LIZIZ(true);
                LIZIZ.setDuration(600L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LJ, ofInt);
                animatorSet.playTogether(ofInt, LIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIIZILJ = animatorSet;
            Animator animator = this.LJIJJLI;
            if (animator != null) {
                animator.addListener(new ALAdapterS8S0100000_10(this, 6));
            }
        }
        return this.LJIIZILJ;
    }

    public final Animator LJIIL() {
        AnimatorSet animatorSet;
        if (this.LJIJJLI == null) {
            AbstractC59359NRj abstractC59359NRj = this.LIZJ;
            AbstractC59359NRj abstractC59359NRj2 = this.LIZLLL;
            if (abstractC59359NRj != null && abstractC59359NRj2 != null) {
                int[] iArr = {this.LJII, this.LJIIIIZZ};
                ValueAnimator ofInt = ValueAnimator.ofInt(0, ORY.LJJLIIIJL(iArr));
                ofInt.addUpdateListener(new AUListenerS100S0200000_10(new AbstractC59359NRj[]{abstractC59359NRj2, abstractC59359NRj}, iArr, 1));
                ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                ofInt.setDuration(400L);
                ofInt.addListener(new ALAdapterS8S0200000_10(abstractC59359NRj, abstractC59359NRj2, 4));
                Animator LJ = LJ(true);
                LJ.setDuration(200L);
                Animator LIZIZ = LIZIZ(false);
                LIZIZ.setDuration(400L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofInt, LJ);
                animatorSet.playTogether(ofInt, LIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIJJLI = animatorSet;
        }
        Animator animator = this.LJIJJLI;
        if (animator != null) {
            animator.addListener(new ALAdapterS8S0100000_10(this, 6));
        }
        return this.LJIJJLI;
    }

    public final void LJIILIIL() {
        AbstractC59359NRj abstractC59359NRj = this.LIZLLL;
        if (abstractC59359NRj != null) {
            abstractC59359NRj.LIZLLL(new OSZ("stageName", "changeButtonColor"));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(1:3)(1:52)|4|(2:8|(19:10|11|(2:15|(16:17|18|(2:24|(12:26|27|28|29|(1:46)(1:33)|34|35|(1:44)|37|(1:39)(1:43)|40|41))|49|27|28|29|(1:31)|46|34|35|(0)|37|(0)(0)|40|41))|50|18|(4:20|22|24|(0))|49|27|28|29|(0)|46|34|35|(0)|37|(0)(0)|40|41))|51|11|(3:13|15|(0))|50|18|(0)|49|27|28|29|(0)|46|34|35|(0)|37|(0)(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:29:0x00bc, B:31:0x00c2, B:33:0x00c8, B:34:0x00cc), top: B:28:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59357NRh(X.C59356NRg r5) {
        /*
            r4 = this;
            r4.<init>()
            X.NSM r0 = r5.LIZ()
            r4.LIZ = r0
            X.954 r0 = r5.LIZIZ()
            r4.LIZIZ = r0
            X.NRa r1 = r5.LIZ
            X.NHk r0 = r1.LJLJLJ
            r4.LIZJ = r0
            X.NHj r0 = r1.LJLJLLL
            r4.LIZLLL = r0
            X.NRq<X.NSN> r0 = r5.LIZIZ
            r4.LJ = r0
            X.NRq<X.NSG> r0 = r5.LIZJ
            r4.LJFF = r0
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r1.LJLJJI
            if (r0 == 0) goto Lb9
            boolean r0 = r0.getHideMusicDisc()
        L29:
            r4.LJI = r0
            X.NRa r0 = r5.LIZ
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r0.LJLJJI
            r2 = 0
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct r0 = r0.getBottomContainer()
            if (r0 == 0) goto Lb6
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lb6
            int r0 = r1.intValue()
        L4a:
            int r3 = X.C7MY.LIZIZ(r0)
            r4.LJII = r3
            X.NRa r0 = r5.LIZ
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r0.LJLJJI
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct r0 = r0.getLeftContainer()
            if (r0 == 0) goto Lb3
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lb3
            int r0 = r1.intValue()
        L6e:
            int r0 = X.C7MY.LIZIZ(r0)
            r4.LJIIIIZZ = r0
            X.NRa r0 = r5.LIZ
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r0.LJLJJI
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct r0 = r0.getBottomContainer()
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.commercialize.model.AnimationInfoStruct r0 = r0.getAnimationInfo()
            if (r0 == 0) goto Lb0
            int r0 = r0.getTargetHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lb0
            int r0 = r1.intValue()
        L98:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            int r0 = r0 - r3
            r4.LJIIIZ = r0
            r0 = 40
            int r0 = X.C7MY.LIZIZ(r0)
            r4.LJIIJ = r0
            goto Lbc
        Lb0:
            r0 = 136(0x88, float:1.9E-43)
            goto L98
        Lb3:
            r0 = 84
            goto L6e
        Lb6:
            r0 = 56
            goto L4a
        Lb9:
            r0 = 0
            goto L29
        Lbc:
            X.NRa r0 = r5.LIZ     // Catch: java.lang.Throwable -> Lda
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r0.LJLJJI     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Ld8
            com.ss.android.ugc.aweme.commercialize.model.AdDefaultContainerInfoStruct r0 = r0.getDefaultContainer()     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Ld8
            java.lang.String r0 = r0.getBackgroundColor()     // Catch: java.lang.Throwable -> Lda
        Lcc:
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lda
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> Lda
            goto Le2
        Ld8:
            r0 = r2
            goto Lcc
        Lda:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        Le2:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto Lf7
        Le8:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lf3
            int r0 = r2.intValue()
        Lf0:
            r4.LJIIJJI = r0
            return
        Lf3:
            r0 = 2130968675(0x7f040063, float:1.754601E38)
            goto Lf0
        Lf7:
            r2 = r1
            goto Le8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59357NRh.<init>(X.NRg):void");
    }

    public static void LIZ(Animator animator) {
        if (animator.isRunning()) {
            animator.end();
        }
    }

    public final Animator LIZIZ(boolean z) {
        float f;
        if (z) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        InterfaceC59366NRq<NSG> interfaceC59366NRq = this.LJFF;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f + f, f + 180.0f);
        ofFloat.addUpdateListener(new AUListenerS98S0100000_10(interfaceC59366NRq, 7));
        ofFloat.setInterpolator(C55953Lxd.LJIIIZ());
        return ofFloat;
    }

    public final Animator LJ(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(C55953Lxd.LJIIIZ());
        ofFloat.addUpdateListener(new C59365NRp(this, z));
        ofFloat.addListener(new C59374NRy(this, z));
        return ofFloat;
    }

    public final Animator LJIIIIZZ(final boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(C55953Lxd.LJIIIZ());
        final ViewParent parent = ((NSG) this.LJFF.L9()).getContainer().getParent();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.95Q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Float f;
                o.LJIIIZ(it, "it");
                Object animatedValue = it.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C59357NRh c59357NRh = this;
                    boolean z2 = z;
                    ViewParent viewParent = parent;
                    float floatValue = f.floatValue();
                    AnonymousClass954 anonymousClass954 = c59357NRh.LIZIZ;
                    if (!z2) {
                        floatValue = 1.0f - floatValue;
                    }
                    anonymousClass954.LIZLLL(floatValue, new AqS170S0100000_4(viewParent, 1108));
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.953
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (!z) {
                    this.LIZIZ.LIZ(4, new AqS170S0100000_4(parent, 1109));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (z) {
                    this.LIZIZ.LIZ(0, new AqS170S0100000_4(parent, 1110));
                }
            }
        });
        return ofFloat;
    }
}
