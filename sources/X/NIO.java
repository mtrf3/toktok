package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIO implements JK3 {
    public JK6 LIZ;
    public NIS LIZIZ;
    public Aweme LIZJ;
    public AwemeRawAd LIZLLL;
    public Context LJFF;
    public boolean LJI;
    public View LJIIIIZZ;
    public boolean LJIIIZ;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C58821N6r.LJLIL);
    public int LJII = 1;
    public final NIW LJIIJ = SearchAdMainService.LJIIJJI().LJII();
    public final NIP LJIIJJI = SearchAdMainService.LJIIJJI().LJIIIIZZ();

    @Override // X.JK3
    public final void LJIIIIZZ() {
        IPreciseAdService LJJIIZI;
        this.LJI = false;
        if (this.LJII == 0 && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.LJIIJ();
        }
        LJJIIZI().LJIIIIZZ();
    }

    @Override // X.JK3
    public final void LJIIIZ() {
        this.LJIIIZ = false;
        this.LJIIJJI.LJI(true);
        this.LJIIJJI.LJIIJ(true);
    }

    @Override // X.JK3
    public final void LJI() {
        if (this.LJII == 0) {
            LJJIIZI().LJIILIIL();
        }
    }

    @Override // X.JK3
    public final void LJJII() {
        IVK LIZJ;
        if (this.LJI) {
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "pause", this.LIZLLL);
        AwemeRawAd awemeRawAd = this.LIZLLL;
        if (awemeRawAd != null && O5Y.LJJJJIZL(awemeRawAd)) {
            LIZLLL.LIZIZ(1, "is_ci");
        }
        LIZLLL.LIZIZ(1, "precise_ads");
        LIZLLL.LIZIZ(Integer.valueOf(JHI.LIZ().LJ + 1), "play_order");
        LIZLLL.LJI();
        if (this.LJIIIIZZ != null && C46279IEh.LIZ()) {
            Aweme aweme = this.LIZJ;
            Context context = this.LJFF;
            View view = this.LJIIIIZZ;
            if (aweme != null && context != null && view != null && (LIZJ = MeasurementServiceImpl.LJ().LIZJ()) != null) {
                LIZJ.LJIIJ(JHI.LIZ().LJ, context, view, aweme);
            }
        }
    }

    public final IPreciseAdService LJJIIZI() {
        return (IPreciseAdService) this.LJ.getValue();
    }

    @Override // X.JK3
    public final void G5() {
        String str;
        if (JHI.LIZ().LJII != 53 && JHI.LIZ().LJII != 54) {
            NIW niw = this.LJIIJ;
            AwemeRawAd awemeRawAd = this.LIZLLL;
            NIS nis = this.LIZIZ;
            if (nis != null) {
                str = nis.getEnterFrom();
            } else {
                str = null;
            }
            niw.LJIJJ(awemeRawAd, str, C59406NTe.LJI(this.LIZJ), this.LJIIJJI.LIZIZ());
            this.LJIIJJI.LJI(false);
        }
    }

    @Override // X.JK3
    public final void LJIIZILJ() {
        LJJIIZI().LJIIJ();
        if (!this.LJIIIZ) {
            this.LJIIJ.LIZJ(this.LIZLLL);
        }
        this.LJIIIZ = true;
    }

    @Override // X.JK3
    public final void LJJIIJZLJL() {
        IPreciseAdService LJJIIZI;
        LJJIIZI().LJIIJJI(this.LIZJ, this.LJFF, new ACListenerS30S0100000_10(this, 169), new ACListenerS30S0100000_10(this, 170));
        this.LJI = true;
        NIS nis = this.LIZIZ;
        if (nis != null) {
            nis.LJIJ();
        }
        if (this.LJII == 0 && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.LJIILIIL();
        }
    }

    @Override // X.JK3
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        View view;
        int i;
        ViewGroup viewGroup;
        AwemeSearchAdModel searchAdInfo;
        Integer preciseAdCTAPosition;
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        JK6 jk6 = (JK6) adSceneDepend;
        this.LIZ = jk6;
        InterfaceC48875JGd interfaceC48875JGd = jk6.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.precisead.IPreciseAdItemSceneCallBack");
        NIS nis = (NIS) interfaceC48875JGd;
        this.LIZIZ = nis;
        JK6 jk62 = this.LIZ;
        ViewGroup viewGroup2 = null;
        if (jk62 != null) {
            aweme = jk62.LIZIZ;
        } else {
            aweme = null;
        }
        this.LIZJ = aweme;
        if (jk62 != null) {
            awemeRawAd = jk62.LIZJ;
        } else {
            awemeRawAd = null;
        }
        this.LIZLLL = awemeRawAd;
        this.LJFF = nis.getContext();
        JK6 jk63 = this.LIZ;
        if (jk63 != null) {
            view = jk63.LIZLLL;
        } else {
            view = null;
        }
        this.LJIIIIZZ = view;
        AwemeRawAd awemeRawAd2 = this.LIZLLL;
        if (awemeRawAd2 != null && (searchAdInfo = awemeRawAd2.getSearchAdInfo()) != null && (preciseAdCTAPosition = searchAdInfo.getPreciseAdCTAPosition()) != null) {
            i = preciseAdCTAPosition.intValue();
        } else {
            i = 1;
        }
        this.LJII = i;
        IPreciseAdService LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            NIS nis2 = this.LIZIZ;
            if (nis2 != null) {
                viewGroup = nis2.LJIJI();
            } else {
                viewGroup = null;
            }
            LJJIIZI.LJIIL(viewGroup, this.LJFF, this.LIZJ, new ACListenerS30S0100000_10(this, 168));
        }
        IPreciseAdService LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            NIS nis3 = this.LIZIZ;
            if (nis3 != null) {
                viewGroup2 = nis3.LJIIL();
            }
            LJJIIZI2.LJIIIZ(viewGroup2, this.LJFF);
        }
        if (this.LJII == 1) {
            LJIIZILJ();
        }
    }
}
