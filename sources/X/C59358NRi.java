package X;

import Y.ALAdapterS5S0300000_10;
import Y.ALAdapterS8S0100000_10;
import Y.ALAdapterS8S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.AUListenerS100S0200000_10;
import Y.AUListenerS6S0202000_10;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59358NRi implements InterfaceC59370NRu<NST> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final NST LJLIL;
    public boolean LJLJI;
    public final int LJLJJLL;
    public final int LJLJL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, NS3.LJLIL);
    public final OF1 LJLJJI = C1DF.LJJIFFI(this, NS1.LJLIL);
    public final OF1 LJLJJL = C1DF.LJJIFFI(this, NS5.LJLIL);

    static {
        TBT tbt = new TBT(C59358NRi.class, "componentStatus", "getComponentStatus()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/RevampComponentStatus;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C59358NRi.class, "animatorProvider", "getAnimatorProvider()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/DescriptiveAnimatorProvider;", 0, c65351Pkp), C61845OOz.LIZJ(C59358NRi.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/CommerceFeedDescriptiveLogger;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final C59357NRh LIZ() {
        return (C59357NRh) this.LJLJJI.LIZ(this, LJLJLJ[1]);
    }

    public final NGR LIZIZ() {
        return (NGR) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    public final NGA LIZJ() {
        return (NGA) this.LJLJJL.LIZ(this, LJLJLJ[2]);
    }

    @Override // X.InterfaceC59370NRu
    public final void LLLLZLL() {
        this.LJLIL.LIZIZ().LJLJI("COMMERCE_DESCRIPTIVE_CARD_FIRST_STAGE_TASK");
        this.LJLIL.LIZIZ().LJLJI("COMMERCE_DESCRIPTIVE_CARD_SECOND_STAGE_TASK");
        this.LJLJI = false;
    }

    @Override // X.InterfaceC59370NRu
    public final void qk() {
        if (LIZIZ().LJ && LIZIZ().LJFF) {
            AnimatorSet animatorSet = null;
            if (this.LJLIL.LJ()) {
                C59357NRh LIZ = LIZ();
                if (LIZ.LJIL == null) {
                    AbstractC59359NRj abstractC59359NRj = LIZ.LIZJ;
                    AbstractC59359NRj abstractC59359NRj2 = LIZ.LIZLLL;
                    if (abstractC59359NRj != null && abstractC59359NRj2 != null) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, LIZ.LJIIIIZZ + LIZ.LJIIIZ);
                        ofInt.addUpdateListener(new AUListenerS6S0202000_10(LIZ.LJIIIZ, LIZ.LJII, abstractC59359NRj2, abstractC59359NRj, 1));
                        ofInt.setDuration(400L);
                        ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                        ofInt.addListener(new ALAdapterS8S0200000_10(abstractC59359NRj, LIZ, 6));
                        Animator LJ = LIZ.LJ(true);
                        LJ.setDuration(200L);
                        Animator LIZIZ = LIZ.LIZIZ(false);
                        LIZIZ.setDuration(400L);
                        Animator LJIIIIZZ = LIZ.LJIIIIZZ(true);
                        LJIIIIZZ.setDuration(650L);
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(ofInt, LJ);
                        animatorSet.playTogether(ofInt, LIZIZ, LJIIIIZZ);
                    }
                    LIZ.LJIL = animatorSet;
                }
                Animator animator = LIZ.LJIL;
                if (animator != null) {
                    animator.addListener(new ALAdapterS8S0100000_10(LIZ, 6));
                }
                Animator animator2 = LIZ.LJIL;
                if (animator2 != null) {
                    animator2.start();
                }
            } else {
                C59357NRh LIZ2 = LIZ();
                if (LIZ2.LJJ == null) {
                    AbstractC59359NRj abstractC59359NRj3 = LIZ2.LIZJ;
                    AbstractC59359NRj abstractC59359NRj4 = LIZ2.LIZLLL;
                    if (abstractC59359NRj3 != null && abstractC59359NRj4 != null) {
                        int[] iArr = {LIZ2.LJII + LIZ2.LJIIIZ, LIZ2.LJIIIIZZ};
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, ORY.LJJLIIIJL(iArr));
                        ofInt2.addUpdateListener(new AUListenerS100S0200000_10(new AbstractC59359NRj[]{abstractC59359NRj4, abstractC59359NRj3}, iArr, 3));
                        ofInt2.setInterpolator(C55953Lxd.LJIIIZ());
                        ofInt2.setDuration(400L);
                        ofInt2.addListener(new ALAdapterS8S0200000_10(abstractC59359NRj3, abstractC59359NRj4, 7));
                        Animator LJ2 = LIZ2.LJ(true);
                        LJ2.setDuration(200L);
                        Animator LIZIZ2 = LIZ2.LIZIZ(false);
                        LIZIZ2.setDuration(400L);
                        Animator LJIIIIZZ2 = LIZ2.LJIIIIZZ(true);
                        LJIIIIZZ2.setDuration(400L);
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(ofInt2, LJ2);
                        animatorSet.playTogether(ofInt2, LIZIZ2, LJIIIIZZ2);
                    }
                    LIZ2.LJJ = animatorSet;
                }
                Animator animator3 = LIZ2.LJJ;
                if (animator3 != null) {
                    animator3.addListener(new ALAdapterS8S0100000_10(LIZ2, 6));
                }
                Animator animator4 = LIZ2.LJJ;
                if (animator4 != null) {
                    animator4.start();
                }
                LIZIZ().LIZLLL = false;
            }
            LIZIZ().LJ = false;
            LIZIZ().LJFF = false;
            return;
        }
        if (!this.LJLIL.LIZLLL().LJ) {
            return;
        }
        if (this.LJLIL.LJ()) {
            Animator LJIIJ = this.LJLIL.LIZJ().LJIIJ();
            if (LJIIJ != null) {
                LJIIJ.start();
            }
        } else {
            Animator LJIIL = this.LJLIL.LIZJ().LJIIL();
            if (LJIIL != null) {
                LJIIL.start();
            }
            LIZIZ().LIZLLL = false;
        }
        LIZIZ().LJ = false;
    }

    @Override // X.InterfaceC59370NRu
    public final void H90() {
        AnimatorSet animatorSet = null;
        if (LIZIZ().LIZLLL) {
            C59357NRh LIZ = LIZ();
            if (LIZ.LJIJ == null) {
                AbstractC59359NRj abstractC59359NRj = LIZ.LIZJ;
                AbstractC59359NRj abstractC59359NRj2 = LIZ.LIZLLL;
                if (abstractC59359NRj != null && abstractC59359NRj2 != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, LIZ.LJIIIIZZ + LIZ.LJIIIZ);
                    ofInt.addUpdateListener(new AUListenerS6S0202000_10(LIZ.LJIIIIZZ, LIZ.LJII, abstractC59359NRj, abstractC59359NRj2, 0));
                    ofInt.setDuration(650L);
                    ofInt.setInterpolator(C55953Lxd.LJIIIZ());
                    ofInt.addListener(new ALAdapterS5S0300000_10(LIZ, abstractC59359NRj, abstractC59359NRj2, 1));
                    Animator LJ = LIZ.LJ(false);
                    LJ.setDuration(200L);
                    Animator LIZIZ = LIZ.LIZIZ(true);
                    LIZIZ.setDuration(650L);
                    Animator LJIIIIZZ = LIZ.LJIIIIZZ(false);
                    LJIIIIZZ.setDuration(650L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(LJ, ofInt);
                    animatorSet.playTogether(ofInt, LIZIZ, LJIIIIZZ);
                }
                LIZ.LJIJ = animatorSet;
                if (animatorSet != null) {
                    animatorSet.addListener(new ALAdapterS8S0100000_10(LIZ, 6));
                }
            }
            Animator animator = LIZ.LJIJ;
            if (animator != null) {
                animator.start();
            }
        } else {
            LIZ().LJIILIIL();
            C59357NRh LIZ2 = LIZ();
            if (LIZ2.LJIJI == null) {
                AbstractC59359NRj abstractC59359NRj3 = LIZ2.LIZJ;
                AbstractC59359NRj abstractC59359NRj4 = LIZ2.LIZLLL;
                if (abstractC59359NRj3 != null && abstractC59359NRj4 != null) {
                    int[] iArr = {LIZ2.LJIIIIZZ, LIZ2.LJII + LIZ2.LJIIIZ};
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(0, ORY.LJJLIIIJL(iArr));
                    ofInt2.addUpdateListener(new AUListenerS100S0200000_10(new AbstractC59359NRj[]{abstractC59359NRj3, abstractC59359NRj4}, iArr, 2));
                    ofInt2.setInterpolator(C55953Lxd.LJIIIZ());
                    ofInt2.setDuration(600L);
                    ofInt2.addListener(new ALAdapterS5S0300000_10(LIZ2, abstractC59359NRj3, abstractC59359NRj4, 2));
                    Animator LJ2 = LIZ2.LJ(false);
                    LJ2.setDuration(200L);
                    Animator LIZIZ2 = LIZ2.LIZIZ(true);
                    LIZIZ2.setDuration(650L);
                    Animator LJIIIIZZ2 = LIZ2.LJIIIIZZ(false);
                    LJIIIIZZ2.setDuration(650L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(LJ2, ofInt2);
                    animatorSet.playTogether(ofInt2, LIZIZ2, LJIIIIZZ2);
                }
                LIZ2.LJIJI = animatorSet;
                if (animatorSet != null) {
                    animatorSet.addListener(new ALAdapterS8S0100000_10(LIZ2, 6));
                }
            }
            Animator animator2 = LIZ2.LJIJI;
            if (animator2 != null) {
                animator2.start();
            }
            LIZIZ().LIZLLL = true;
            NGA LIZJ = LIZJ();
            NG8.LIZ.getClass();
            LIZJ.LJIILIIL(NG8.LIZIZ);
        }
        LIZIZ().LJ = true;
        LIZIZ().LJFF = true;
        NGA LIZJ2 = LIZJ();
        NG8.LIZ.getClass();
        LIZJ2.LJIILIIL(NG8.LIZLLL);
        LIZJ().LJIILIIL(NG8.LJI);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59369NRt L9() {
        return this.LJLIL;
    }

    public C59358NRi(C59352NRc c59352NRc) {
        this.LJLIL = c59352NRc;
        this.LJLJJLL = c59352NRc.LIZ;
        this.LJLJL = c59352NRc.LIZIZ;
    }

    @Override // X.InterfaceC59370NRu
    public final void Fe0(long j) {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 152);
        IVideoPlayTaskManager LIZIZ = this.LJLIL.LIZIZ();
        N68 LIZIZ2 = C1DD.LIZIZ("COMMERCE_DESCRIPTIVE_CARD_FIRST_STAGE_TASK", j);
        LIZIZ2.LIZJ = this.LJLJJLL * 1000;
        LIZIZ2.LIZLLL = aRunnableS46S0100000_10;
        LIZIZ2.LJ = false;
        LIZIZ.LJLJLJ(LIZIZ2.LIZ());
        IVideoPlayTaskManager LIZIZ3 = this.LJLIL.LIZIZ();
        N68 LIZIZ4 = C1DD.LIZIZ("COMMERCE_DESCRIPTIVE_CARD_SECOND_STAGE_TASK", j);
        LIZIZ4.LIZJ = this.LJLJL * 1000;
        LIZIZ4.LIZLLL = new ARunnableS46S0100000_10(this, 151);
        LIZIZ4.LJ = false;
        LIZIZ3.LJLJLJ(LIZIZ4.LIZ());
    }
}
