package X;

import Y.ACListenerS30S0100000_10;
import Y.ALAdapterS3S0100000_4;
import Y.ALAdapterS8S0100000_10;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS46S0100000_10;
import Y.AUListenerS93S0100000_4;
import Y.AUListenerS98S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AdButtonReshowStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.AdSlideBackInfoModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQ4 implements NRU {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final NRR LJLIL;
    public boolean LJLILLLLZI;
    public final C59360NRk LJLJJLL;
    public final ARunnableS46S0100000_10 LJLJLLL;
    public final ARunnableS40S0100000_4 LJLL;
    public final Animator LJLLI;
    public final Animator LJLLILLLL;
    public final Animator LJLLJ;
    public final OF1 LJLJI = C1DF.LJJIFFI(this, NRQ.LJLIL);
    public final OF1 LJLJJI = C1DF.LJJIFFI(this, NRP.LJLIL);
    public final OF1 LJLJJL = C1DF.LJJIFFI(this, NRS.LJLIL);
    public final C58722N2w LJLJL = new C58722N2w(LIZ());
    public final NQ3 LJLJLJ = new NQ3();

    static {
        TBT tbt = new TBT(NQ4.class, "container", "getContainer()Landroid/view/ViewGroup;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NQ4.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0, c65351Pkp), C61845OOz.LIZJ(NQ4.class, "musicCoverDepend", "getMusicCoverDepend()Lcom/ss/android/ugc/aweme/ad/feed/depend/IMusicCoverDepend;", 0, c65351Pkp)};
    }

    public final Aweme LIZ() {
        return (Aweme) this.LJLJJI.LIZ(this, LJLLL[1]);
    }

    public final ViewGroup LIZJ() {
        return (ViewGroup) this.LJLJI.LIZ(this, LJLLL[0]);
    }

    public final C95T LIZLLL() {
        return (C95T) this.LJLJJL.LIZ(this, LJLLL[2]);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        C59360NRk c59360NRk = this.LJLJJLL;
        if (c59360NRk != null) {
            c59360NRk.initialize();
        }
    }

    @Override // X.InterfaceC59329NQf
    public final void H6() {
        if (LJIIJ()) {
            this.LJLJL.LJJIJ();
        }
    }

    public final int LIZIZ() {
        boolean z;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdSlideBackInfoModel slideBackInfoModel;
        AdButtonReshowStrategyModel buttonStrategy;
        int LJ = LJ();
        Aweme LIZ = LIZ();
        int i = 0;
        if (LIZ != null && C63081OpJ.LLJILLL(LIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Aweme LIZ2 = LIZ();
            if (LIZ2 != null && (awemeRawAd3 = LIZ2.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd3.getSlideBackInfoModel()) != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null) {
                i = buttonStrategy.getShowColorSeconds();
            }
            return 1000 * i;
        }
        Aweme LIZ3 = LIZ();
        if (LIZ3 != null && (awemeRawAd = LIZ3.getAwemeRawAd()) != null && awemeRawAd.getAnimationType() == 3) {
            Aweme LIZ4 = LIZ();
            if (LIZ4 != null && (awemeRawAd2 = LIZ4.getAwemeRawAd()) != null) {
                i = awemeRawAd2.getShowButtonColorSeconds();
            }
            int i2 = 1000 * i;
            if (LJ < i2) {
                return i2;
            }
            return LJ;
        }
        return LJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 == true) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZ()
            r2 = 0
            if (r0 == 0) goto L4e
            boolean r1 = X.C63081OpJ.LJLIIIL(r0)
            r0 = 1
            if (r1 != r0) goto L4e
        Le:
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZ()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.commercialize.model.AdSlideBackInfoModel r0 = r0.getSlideBackInfoModel()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.commercialize.model.AdButtonReshowStrategyModel r0 = r0.getButtonStrategy()
            if (r0 == 0) goto L36
            int r0 = r0.getShowSeconds()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L30:
            if (r0 == 0) goto L36
            int r2 = r0.intValue()
        L36:
            int r0 = r2 * 1000
            return r0
        L39:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZ()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L36
            int r0 = r0.getShowButtonSeconds()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L30
        L4e:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQ4.LJ():int");
    }

    public final void LJFF() {
        ViewGroup LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.removeCallbacks(this.LJLJLLL);
        }
        ViewGroup LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            LIZJ2.removeCallbacks(this.LJLL);
        }
        if (LJIIIIZZ()) {
            Animator animator = this.LJLLI;
            if (animator != null) {
                animator.cancel();
            }
        } else {
            Animator animator2 = this.LJLLJ;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        Animator animator3 = this.LJLLILLLL;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    public final boolean LJII() {
        boolean z;
        Aweme LIZ;
        AwemeRawAd awemeRawAd;
        int intValue;
        Aweme LIZ2 = LIZ();
        if (LIZ2 != null && (awemeRawAd = LIZ2.getAwemeRawAd()) != null && ((intValue = Integer.valueOf(awemeRawAd.getAnimationType()).intValue()) == 1 || intValue == 3)) {
            z = true;
        } else {
            z = false;
        }
        Aweme LIZ3 = LIZ();
        if ((LIZ3 == null || !C63081OpJ.LLJILLL(LIZ3)) && (((LIZ = LIZ()) != null && C63081OpJ.LJLIIIL(LIZ)) || !z)) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIIZZ() {
        AwemeRawAd awemeRawAd;
        Aweme LIZ = LIZ();
        if (LIZ == null || (awemeRawAd = LIZ.getAwemeRawAd()) == null || !awemeRawAd.isHideMusicDisk()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIJ() {
        Aweme LIZ = LIZ();
        if (LIZ == null || !C63081OpJ.LLJLL(LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC59329NQf
    public final void LLIILZL() {
        C59360NRk c59360NRk;
        LJFF();
        this.LJLILLLLZI = false;
        if (!LJIIJ()) {
            C59360NRk c59360NRk2 = this.LJLJJLL;
            if (c59360NRk2 != null) {
                C59363NRn.LIZJ(c59360NRk2, 8);
            }
            LJI(true);
        }
        if (LJII() && (c59360NRk = this.LJLJJLL) != null) {
            c59360NRk.LJJLIIIIJ(654311423);
        }
    }

    @Override // X.InterfaceC59329NQf
    public final void LLZ() {
        LJFF();
        C59360NRk c59360NRk = this.LJLJJLL;
        if (c59360NRk != null) {
            C59363NRn.LIZJ(c59360NRk, 8);
        }
        LJI(true);
    }

    @Override // X.InterfaceC59329NQf
    public final void onBind() {
        Context context;
        int LIZIZ;
        if (LJIIJ()) {
            C59360NRk c59360NRk = this.LJLJJLL;
            if (c59360NRk != null) {
                C59363NRn.LIZJ(c59360NRk, 0);
                C59363NRn.LIZ(c59360NRk, O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
            }
        } else {
            C59360NRk c59360NRk2 = this.LJLJJLL;
            if (c59360NRk2 != null) {
                C59363NRn.LIZJ(c59360NRk2, 8);
                C59363NRn.LIZ(c59360NRk2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(-40)));
            }
        }
        if (LJII()) {
            LIZIZ = 654311423;
        } else {
            Aweme LIZ = LIZ();
            ViewGroup LIZJ = LIZJ();
            if (LIZJ != null) {
                context = LIZJ.getContext();
            } else {
                context = null;
            }
            LIZIZ = NPC.LIZIZ(context, LIZ);
        }
        C59360NRk c59360NRk3 = this.LJLJJLL;
        if (c59360NRk3 != null) {
            c59360NRk3.LJJLIIIIJ(LIZIZ);
        }
        ViewGroup LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            C16880lQ.LJIIL(LIZJ2, new ACListenerS30S0100000_10(this, 105));
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public NQ4(C214038ad c214038ad) {
        String str;
        Context context;
        String LIZ;
        C59360NRk c59360NRk;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Context context2;
        AwemeRawAd awemeRawAd;
        this.LJLIL = c214038ad;
        Aweme LIZ2 = LIZ();
        AnimatorSet animatorSet = null;
        if (LIZ2 != null && (awemeRawAd = LIZ2.getAwemeRawAd()) != null) {
            str = awemeRawAd.getButtonIcon();
        } else {
            str = null;
        }
        Aweme LIZ3 = LIZ();
        if (LIZ3 != null && C63081OpJ.LLIIIL(LIZ3)) {
            Aweme LIZ4 = LIZ();
            if (LIZ4 != null) {
                LIZ = C63081OpJ.LJJIZ(LIZ4);
            } else {
                LIZ = null;
            }
        } else {
            C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
            ViewGroup LIZJ = LIZJ();
            if (LIZJ != null) {
                context = LIZJ.getContext();
            } else {
                context = null;
            }
            Aweme LIZ5 = LIZ();
            LJIJJLI.getClass();
            LIZ = M2C.LIZ(context, LIZ5, false);
        }
        ViewGroup LIZJ2 = LIZJ();
        if (LIZJ2 != null && LIZ != null) {
            c59360NRk = new C59360NRk(new NSO(LIZJ2, str, LIZ));
            c59360NRk.initialize();
        } else {
            c59360NRk = null;
        }
        this.LJLJJLL = c59360NRk;
        this.LJLJLLL = new ARunnableS46S0100000_10(this, 95);
        this.LJLL = new ARunnableS40S0100000_4(this, 92);
        if (c59360NRk != null) {
            valueAnimator = ValueAnimator.ofInt(C7MY.LIZIZ(-40), C7MY.LIZIZ(14));
            valueAnimator.addUpdateListener(new AUListenerS98S0100000_10(c59360NRk, 4));
            valueAnimator.addListener(new ALAdapterS8S0100000_10(this, 4));
            valueAnimator.setDuration(600L);
            valueAnimator.setInterpolator(C55953Lxd.LJIIIZ());
        } else {
            valueAnimator = null;
        }
        this.LJLLI = valueAnimator;
        if (c59360NRk != null) {
            Aweme LIZ6 = LIZ();
            ViewGroup LIZJ3 = LIZJ();
            if (LIZJ3 != null) {
                context2 = LIZJ3.getContext();
            } else {
                context2 = null;
            }
            valueAnimator2 = ValueAnimator.ofArgb(654311423, NPC.LIZIZ(context2, LIZ6));
            valueAnimator2.addUpdateListener(new AUListenerS98S0100000_10(c59360NRk, 3));
            valueAnimator2.setDuration(300L);
            valueAnimator2.setInterpolator(C55953Lxd.LJIIIZ());
        } else {
            valueAnimator2 = null;
        }
        this.LJLLILLLL = valueAnimator2;
        if (valueAnimator != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(LIZLLL().LIZIZ(), C47135Ieh.LIZ(95, C47135Ieh.LIZ(-19, C8ON.LIZIZ() * 2)));
            ofInt.setDuration(600L);
            ofInt.setInterpolator(C55953Lxd.LJIIIZ());
            ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 24));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(C55953Lxd.LJIIIZ());
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 25));
            ofFloat.addListener(new ALAdapterS3S0100000_4(this, 13));
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofInt);
            animatorSet.playTogether(valueAnimator, ofInt);
        }
        this.LJLLJ = animatorSet;
    }

    public final void LJI(boolean z) {
        if (LJIIIIZZ()) {
            return;
        }
        if (z) {
            C95T LIZLLL = LIZLLL();
            LIZLLL.LJ(LIZLLL.LIZIZ());
            LIZLLL.LIZJ(1.0f);
            LIZLLL.LJFF(0);
            return;
        }
        C95T LIZLLL2 = LIZLLL();
        LIZLLL2.LJ(LIZLLL2.LIZIZ() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(54)));
        LIZLLL2.LIZJ(0.0f);
        LIZLLL2.LJFF(4);
    }

    @Override // X.InterfaceC59336NQm
    public final void sy(long j) {
        Context context;
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        if (e1.LIZ(31744, "commercialize_throughout_button_experiment", true, false)) {
            if (!LJIIJ()) {
                IVideoPlayTaskManager LIZIZ = this.LJLIL.LIZIZ();
                N68 LIZIZ2 = C1DD.LIZIZ("THROUGHOUT_SHOW_BUTTON_TASK_NAME", j);
                LIZIZ2.LIZJ = LJ();
                ARunnableS46S0100000_10 callback = this.LJLJLLL;
                o.LJIIIZ(callback, "callback");
                LIZIZ2.LIZLLL = callback;
                LIZIZ2.LJ = false;
                LIZIZ.LJLJLJ(LIZIZ2.LIZ());
            }
            if (LJII()) {
                IVideoPlayTaskManager LIZIZ3 = this.LJLIL.LIZIZ();
                N68 LIZIZ4 = C1DD.LIZIZ("THROUGHOUT_COLOR_CHANGE_TASK_NAME", j);
                LIZIZ4.LIZJ = LIZIZ();
                ARunnableS40S0100000_4 callback2 = this.LJLL;
                o.LJIIIZ(callback2, "callback");
                LIZIZ4.LIZLLL = callback2;
                LIZIZ4.LJ = false;
                LIZIZ3.LJLJLJ(LIZIZ4.LIZ());
                return;
            }
            return;
        }
        if (!LJIIJ()) {
            int LJ = LJ();
            ViewGroup LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.removeCallbacks(this.LJLJLLL);
            }
            long j2 = LJ;
            if (0 >= j2) {
                C59360NRk c59360NRk = this.LJLJJLL;
                if (c59360NRk != null) {
                    C59363NRn.LIZJ(c59360NRk, 0);
                    C59363NRn.LIZ(c59360NRk, O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
                }
                LJI(false);
                this.LJLJL.LJJIJ();
            } else {
                ViewGroup LIZJ2 = LIZJ();
                if (LIZJ2 != null) {
                    LIZJ2.postDelayed(this.LJLJLLL, j2 - 0);
                }
            }
        }
        if (!LJII()) {
            return;
        }
        int LIZIZ5 = LIZIZ();
        ViewGroup LIZJ3 = LIZJ();
        if (LIZJ3 != null) {
            LIZJ3.removeCallbacks(this.LJLL);
        }
        long j3 = LIZIZ5;
        if (0 >= j3) {
            C59360NRk c59360NRk2 = this.LJLJJLL;
            if (c59360NRk2 == null) {
                return;
            }
            Aweme LIZ = LIZ();
            ViewGroup LIZJ4 = LIZJ();
            if (LIZJ4 != null) {
                context = LIZJ4.getContext();
            } else {
                context = null;
            }
            c59360NRk2.LJJLIIIIJ(NPC.LIZIZ(context, LIZ));
            return;
        }
        ViewGroup LIZJ5 = LIZJ();
        if (LIZJ5 == null) {
            return;
        }
        LIZJ5.postDelayed(this.LJLL, j3 - 0);
    }
}
