package X;

import Y.ARunnableS46S0100000_10;
import android.animation.Animator;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59361NRl implements InterfaceC59370NRu<NSU> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final NSU LJLIL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, NS4.LJLIL);
    public final OF1 LJLJI = C1DF.LJJIFFI(this, NS2.LJLIL);
    public final OF1 LJLJJI = C1DF.LJJIFFI(this, NS6.LJLIL);
    public final int LJLJJL;
    public final Integer LJLJJLL;

    static {
        TBT tbt = new TBT(C59361NRl.class, "componentStatus", "getComponentStatus()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/RevampComponentStatus;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C59361NRl.class, "animatorProvider", "getAnimatorProvider()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/DescriptiveAnimatorProvider;", 0, c65351Pkp), C61845OOz.LIZJ(C59361NRl.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/CommerceFeedDescriptiveLogger;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final C59357NRh LIZ() {
        return (C59357NRh) this.LJLJI.LIZ(this, LJLJL[1]);
    }

    public final NGR LIZIZ() {
        return (NGR) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    public final NGA LIZJ() {
        return (NGA) this.LJLJJI.LIZ(this, LJLJL[2]);
    }

    @Override // X.InterfaceC59370NRu
    public final void LLLLZLL() {
        this.LJLIL.LIZIZ().LJLJI("COMMERCE_TOP_CARD_FIRST_STAGE_TASK");
        this.LJLIL.LIZIZ().LJLJI("COMMERCE_TOP_CARD_SECOND_STAGE_TASK");
    }

    @Override // X.InterfaceC59370NRu
    public final void qk() {
        if (this.LJLIL.LJ() || !LIZIZ().LIZLLL) {
            Animator LJIIJ = LIZ().LJIIJ();
            if (LJIIJ != null) {
                LJIIJ.start();
            }
        } else {
            Animator LJIIL = LIZ().LJIIL();
            if (LJIIL != null) {
                LJIIL.start();
            }
            LIZIZ().LIZLLL = false;
        }
        LIZIZ().LJ = false;
    }

    @Override // X.InterfaceC59370NRu
    public final void H90() {
        if (LIZIZ().LIZLLL) {
            Animator LJIIIZ = LIZ().LJIIIZ();
            if (LJIIIZ != null) {
                LJIIIZ.start();
            }
            LIZIZ().LJ = true;
            NGA LIZJ = LIZJ();
            NG8.LIZ.getClass();
            LIZJ.LJIILIIL(NG8.LIZJ);
            return;
        }
        LIZ().LJIILIIL();
        Animator LJIIJJI = LIZ().LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.start();
        }
        LIZIZ().LIZLLL = true;
        LIZIZ().LJ = true;
        NGA LIZJ2 = LIZJ();
        NG8.LIZ.getClass();
        LIZJ2.LJIILIIL(NG8.LIZIZ);
        LIZJ().LJIILIIL(NG8.LIZJ);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59369NRt L9() {
        return this.LJLIL;
    }

    public C59361NRl(C59351NRb c59351NRb) {
        this.LJLIL = c59351NRb;
        this.LJLJJL = c59351NRb.LIZ;
        this.LJLJJLL = c59351NRb.LIZIZ;
    }

    @Override // X.InterfaceC59370NRu
    public final void Fe0(long j) {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 155);
        IVideoPlayTaskManager LIZIZ = this.LJLIL.LIZIZ();
        N68 LIZIZ2 = C1DD.LIZIZ("COMMERCE_TOP_CARD_FIRST_STAGE_TASK", j);
        LIZIZ2.LIZJ = this.LJLJJL * 1000;
        LIZIZ2.LIZLLL = aRunnableS46S0100000_10;
        LIZIZ2.LJ = false;
        LIZIZ.LJLJLJ(LIZIZ2.LIZ());
        Integer num = this.LJLJJLL;
        if (num != null) {
            int intValue = num.intValue();
            IVideoPlayTaskManager LIZIZ3 = this.LJLIL.LIZIZ();
            N68 LIZIZ4 = C1DD.LIZIZ("COMMERCE_TOP_CARD_SECOND_STAGE_TASK", j);
            LIZIZ4.LIZJ = intValue * 1000;
            LIZIZ4.LIZLLL = new ARunnableS46S0100000_10(this, 154);
            LIZIZ4.LJ = false;
            LIZIZ3.LJLJLJ(LIZIZ4.LIZ());
        }
    }
}
