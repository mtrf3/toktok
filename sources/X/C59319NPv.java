package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NPv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59319NPv implements InterfaceC46587IQd {
    public boolean LIZ;
    public final /* synthetic */ C59316NPs LIZIZ;

    @Override // X.InterfaceC46587IQd
    public final void LIZ() {
        if (!this.LIZ) {
            return;
        }
        this.LIZ = false;
        C59316NPs c59316NPs = this.LIZIZ;
        Aweme aweme = c59316NPs.LJLJLJ;
        if (aweme == null || c59316NPs.LLLIILIL || c59316NPs.LLLIL || !(C72083SQt.LJJZZI(aweme) & true) || this.LIZIZ.LLZZLLIL() == null) {
            return;
        }
        if (C46279IEh.LIZ() && O5Y.LJJJIL(aweme)) {
            IVK LIZJ = MeasurementServiceImpl.LJ().LIZJ();
            View LLZZLLIL = this.LIZIZ.LLZZLLIL();
            if (LLZZLLIL != null) {
                C59316NPs c59316NPs2 = this.LIZIZ;
                if (LIZJ != null) {
                    LIZJ.LJIIJ(c59316NPs2.LJLJLLL, c59316NPs2.LJLLI, LLZZLLIL, aweme);
                }
            }
        } else {
            NQL LJIILL = NQL.LJIILL();
            C59316NPs c59316NPs3 = this.LIZIZ;
            Context context = c59316NPs3.LJLLI;
            View LLZZLLIL2 = c59316NPs3.LLZZLLIL();
            int i = this.LIZIZ.LJLJLLL;
            LJIILL.getClass();
            C36922EeM.LJ("AdOM onPlayPause ");
            if (i == 0) {
                NQO.LIZ("pause");
                C59753Ncj LJIIJ = LJIILL.LJIIJ(context, LLZZLLIL2, aweme);
                if (LJIIJ != null) {
                    C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                    LJIIJ.LIZ.LJ.LIZIZ("pause");
                }
                C59348NQy LJII = LJIILL.LJII(context, LLZZLLIL2, aweme);
                if (LJII != null) {
                    NR1.LIZIZ(LJII.LIZ);
                    LJII.LIZ.LJI();
                    C59881Nen.LJ.LIZIZ();
                }
            }
            C59252NNg.LJIILIIL("pause", aweme, "play_pause");
        }
        C59316NPs c59316NPs4 = this.LIZIZ;
        Context context2 = c59316NPs4.LJLLI;
        NN1.LJJJJI(context2, "pause", aweme, NN1.LJIIL(context2, aweme, false, NN1.LJ(c59316NPs4.LJLJLLL + 1)));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "pause", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(Integer.valueOf(NQL.LJIILL().LJIIL(LIZLLL, aweme)), "play_order");
        LIZLLL.LJII();
    }

    @Override // X.InterfaceC46587IQd
    public final void tryPlay() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C59316NPs c59316NPs = this.LIZIZ;
        Aweme aweme = c59316NPs.LJLJLJ;
        if (aweme == null || c59316NPs.LLLIILIL || c59316NPs.LLLIL || !C72083SQt.LJJZZI(aweme) || this.LIZIZ.LLZZLLIL() == null) {
            return;
        }
        if (this.LIZIZ.LLLLLIL.LIZIZ(aweme)) {
            NQL.LJIILL().LJIILLIIL = this.LIZIZ.LLLLLIL.LIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PlayerLog.toPlay, mPausePosition: ");
            LIZ.append(NQL.LJIILL().LJIILLIIL);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
        } else {
            NQL.LJIILL().LJIILLIIL = -1L;
        }
        if (C46279IEh.LIZ() && O5Y.LJJJIL(aweme)) {
            IVK LIZJ = MeasurementServiceImpl.LJ().LIZJ();
            View LLZZLLIL = this.LIZIZ.LLZZLLIL();
            if (LLZZLLIL != null) {
                C59316NPs c59316NPs2 = this.LIZIZ;
                if (LIZJ != null) {
                    LIZJ.LJII(c59316NPs2.LJLJLLL, c59316NPs2.LJLLI, LLZZLLIL, aweme);
                }
            }
        } else {
            NQL LJIILL = NQL.LJIILL();
            C59316NPs c59316NPs3 = this.LIZIZ;
            Context context = c59316NPs3.LJLLI;
            View LLZZLLIL2 = c59316NPs3.LLZZLLIL();
            int i = this.LIZIZ.LJLJLLL;
            LJIILL.getClass();
            C36922EeM.LJ("AdOM onPlayResume ");
            if (context instanceof DetailActivity) {
                LJIILL.LJJIIZI(aweme);
            }
            if (i == 0) {
                NQO.LIZ("resume");
                C59753Ncj LJIIJ = LJIILL.LJIIJ(context, LLZZLLIL2, aweme);
                if (LJIIJ != null) {
                    C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                    LJIIJ.LIZ.LJ.LIZIZ("resume");
                }
                C59348NQy LJII = LJIILL.LJII(context, LLZZLLIL2, aweme);
                if (LJII != null) {
                    NR1.LIZIZ(LJII.LIZ);
                    C59349NQz c59349NQz = LJII.LIZ;
                    c59349NQz.getClass();
                    c59349NQz.LJII = System.nanoTime();
                    C59881Nen.LJ.LIZ();
                }
            }
            C59252NNg.LJIILIIL("resume", aweme, null);
        }
        C59316NPs c59316NPs4 = this.LIZIZ;
        Context context2 = c59316NPs4.LJLLI;
        Aweme aweme2 = c59316NPs4.LJLJLJ;
        NN1.LJJJJI(context2, "resume", aweme2, NN1.LJIIL(context2, aweme2, false, NN1.LJ(c59316NPs4.LJLJLLL + 1)));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "resume", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(Integer.valueOf(NQL.LJIILL().LJIIL(LIZLLL, this.LIZIZ.LJLJLJ)), "play_order");
        LIZLLL.LJII();
    }

    public C59319NPv(C59316NPs c59316NPs) {
        this.LIZIZ = c59316NPs;
    }
}
