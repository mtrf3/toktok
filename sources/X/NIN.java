package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIN implements InterfaceC49066JNm {
    public C49065JNl LIZ;
    public NIR LIZIZ;
    public AwemeRawAd LIZJ;
    public Aweme LIZLLL;
    public AwemeSearchAdModel LJ;
    public Context LJI;
    public View LJII;
    public ViewGroup LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public InterfaceC55057LjB LJIILJJIL;
    public NIT LJIILL;
    public N69 LJIILLIIL;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C58823N6t.LJLIL);
    public final List<Integer> LJIIJJI = C47261Igj.LJJIJIIJI(53, 54, 55, 57, 56);
    public final NIW LJIIL = SearchAdMainService.LJIIJJI().LJII();
    public final NIP LJIILIIL = SearchAdMainService.LJIIJJI().LJIIIIZZ();

    @Override // X.InterfaceC49066JNm
    public final View LJ() {
        Object LIZ;
        ViewParent viewParent;
        Object obj;
        ViewParent parent;
        ViewParent parent2;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("search omsdk view : ");
            View view = this.LJII;
            if (view != null && (parent2 = view.getParent()) != null) {
                viewParent = parent2.getParent();
            } else {
                viewParent = null;
            }
            LIZ2.append(viewParent);
            X1D.LIZIZ(LIZ2);
            View view2 = this.LJII;
            if (view2 != null && (parent = view2.getParent()) != null) {
                obj = parent.getParent();
            } else {
                obj = null;
            }
            if (obj instanceof View) {
                LIZ = (View) obj;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return (View) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
    }

    @Override // X.InterfaceC49066JNm
    public final void LJFF() {
        this.LJIIJ = false;
        LJJIIZI().LJLZ();
        LJJIIZI().LJZ();
    }

    @Override // X.InterfaceC49066JNm
    public final void LIZIZ() {
        if (!this.LJIIIZ) {
            this.LJIIL.LIZJ(this.LIZJ);
        }
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd)) {
            Aweme aweme = this.LIZLLL;
            if (aweme != null && C63081OpJ.LJLJLJ(aweme)) {
                return;
            }
            ISearchAdService LJJIIZI = LJJIIZI();
            Aweme aweme2 = this.LIZLLL;
            if (aweme2 != null) {
                aweme2.getAuthor();
            }
            LJJIIZI.LJZL();
        } else {
            LJJIIZI().LLFF();
        }
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC49066JNm
    public final void LIZJ() {
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd)) {
            Aweme aweme = this.LIZLLL;
            if (aweme != null && C63081OpJ.LJLJLJ(aweme)) {
                return;
            }
            LJJIIZI().LJLLLLLL();
            return;
        }
        LJJIIZI().LJLLL();
    }

    @Override // X.InterfaceC49066JNm
    public final void LIZLLL() {
        User user;
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd)) {
            Aweme aweme = this.LIZLLL;
            if (aweme != null && C63081OpJ.LJLJLJ(aweme)) {
                return;
            }
            ISearchAdService LJJIIZI = LJJIIZI();
            AwemeRawAd awemeRawAd2 = this.LIZJ;
            Aweme aweme2 = this.LIZLLL;
            if (aweme2 != null) {
                user = aweme2.getAuthor();
            } else {
                user = null;
            }
            LJJIIZI.LLF(awemeRawAd2, user, new AqS160S0100000_10(this, 542), new ACListenerS30S0100000_10(this, 174));
        } else {
            LJJIIZI().LJZI(this.LIZLLL, this.LJIIIIZZ, new ACListenerS30S0100000_10(this, 173), new ACListenerS30S0100000_10(this, 174));
        }
        this.LJIIJ = true;
        NIR nir = this.LIZIZ;
        if (nir != null) {
            nir.LJJJLL();
        }
        LJJIIZI().LLD();
    }

    @Override // X.InterfaceC49066JNm
    public final void LJI() {
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd)) {
            LJJIIZI().LL(false);
        } else {
            LJJIIZI().LJLLJ();
        }
    }

    @Override // X.InterfaceC49066JNm
    public final void LJIJJ() {
        NIT nit;
        if (this.LJIIJ) {
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "pause", this.LIZJ);
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && O5Y.LJJJJIZL(awemeRawAd)) {
            LIZLLL.LIZIZ(1, "is_ci");
        }
        LIZLLL.LIZIZ(Integer.valueOf(JHI.LIZ().LJ + 1), "play_order");
        LIZLLL.LJI();
        if (LJ() != null && C46279IEh.LIZ()) {
            Aweme aweme = this.LIZLLL;
            Context context = this.LJI;
            View LJ = LJ();
            if (aweme != null && context != null && LJ != null && (nit = this.LJIILL) != null) {
                nit.LJIIJ(JHI.LIZ().LJ, context, LJ, aweme);
            }
        }
    }

    public final ISearchAdService LJJIIZI() {
        return (ISearchAdService) this.LJFF.getValue();
    }

    @Override // X.InterfaceC49066JNm
    public final boolean T() {
        boolean z;
        AwemeSearchAdModel awemeSearchAdModel = this.LJ;
        if (awemeSearchAdModel != null) {
            z = o.LJ(awemeSearchAdModel.isAutoPlayEnable(), Boolean.TRUE);
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC49066JNm
    public final ViewGroup LJJIII() {
        return LJJIIZI().LLFZ();
    }

    @Override // X.InterfaceC49066JNm
    public final ViewGroup LJLLILLLL() {
        return LJJIIZI().LJLLILLLL();
    }

    @Override // X.InterfaceC49066JNm
    public final void onViewAttachedToWindow() {
        String str;
        if (!JHI.LIZ().LJIIJ || !this.LJIILIIL.LJIJJ(this.LIZLLL)) {
            NIW niw = this.LJIIL;
            AwemeRawAd awemeRawAd = this.LIZJ;
            NIR nir = this.LIZIZ;
            if (nir != null) {
                str = nir.getEnterFrom();
            } else {
                str = null;
            }
            niw.LJIJJLI(awemeRawAd, str, C59406NTe.LJI(this.LIZLLL));
        } else {
            this.LJIIL.LJJIIJZLJL(this.LIZJ, false, false);
            JHI.LIZ().LJIIJ = false;
        }
        if (C46279IEh.LIZ() && LJ() != null) {
            Aweme aweme = this.LIZLLL;
            Context context = this.LJI;
            View LJ = LJ();
            if (aweme != null && context != null && LJ != null) {
                NIT nit = this.LJIILL;
                if (nit != null) {
                    nit.LJIJ(context, aweme);
                }
                NIT nit2 = this.LJIILL;
                if (nit2 != null) {
                    nit2.LJFF(context, LJ, aweme);
                }
            }
        }
        if (!CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd) {
            if (this.LJIILJJIL == null) {
                try {
                    this.LJIILJJIL = C40443Fu3.LIZ("search_ad_video");
                } catch (Exception unused) {
                }
            }
            InterfaceC55057LjB interfaceC55057LjB = this.LJIILJJIL;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.start();
            }
        }
        N69 n69 = this.LJIILLIIL;
        if (n69 != null) {
            n69.onViewAttachedToWindow();
        }
    }

    @Override // X.InterfaceC49066JNm
    public final void onViewDetachedFromWindow() {
        AwemeRawAd awemeRawAd;
        long j;
        Video video;
        NIT nit;
        if (LJ() != null && C46279IEh.LIZ()) {
            Aweme aweme = this.LIZLLL;
            Context context = this.LJI;
            View LJ = LJ();
            if (aweme != null && context != null && LJ != null && (nit = this.LJIILL) != null) {
                nit.LIZLLL(context, aweme);
            }
        }
        NIW niw = this.LJIIL;
        Aweme aweme2 = this.LIZLLL;
        if (aweme2 != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        int i = JHI.LIZ().LJ;
        Long l = JHI.LIZ().LJIIL;
        o.LJIIIIZZ(l, "inst().breakDuration");
        long longValue = l.longValue();
        Aweme aweme3 = this.LIZLLL;
        if (aweme3 != null && (video = aweme3.getVideo()) != null) {
            j = video.getDuration();
        } else {
            j = 0;
        }
        niw.LJJIIZ(awemeRawAd, i, longValue, j, C59406NTe.LJI(this.LIZLLL));
        this.LJIIIZ = false;
        InterfaceC55057LjB interfaceC55057LjB = this.LJIILJJIL;
        if (interfaceC55057LjB != null) {
            interfaceC55057LjB.stop();
        }
        NIP nip = this.LJIILIIL;
        nip.LJI(true);
        nip.LJIIJ(true);
        nip.LJIIIZ(this.LIZLLL);
        N69 n69 = this.LJIILLIIL;
        if (n69 != null) {
            n69.onViewDetachedFromWindow();
        }
    }

    @Override // X.InterfaceC49066JNm
    public final boolean LIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC49066JNm
    public final N69 LJIJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC49066JNm
    public final void LJIL(String str) {
        String str2;
        if (this.LJIIJJI.contains(Integer.valueOf(JHI.LIZ().LJII)) || o.LJ(str, "search_product_anchor")) {
            return;
        }
        NIW niw = this.LJIIL;
        AwemeRawAd awemeRawAd = this.LIZJ;
        NIR nir = this.LIZIZ;
        if (nir != null) {
            str2 = nir.getEnterFrom();
        } else {
            str2 = null;
        }
        niw.LJIJJ(awemeRawAd, str2, C59406NTe.LJI(this.LIZLLL), this.LJIILIIL.LIZIZ());
        this.LJIILIIL.LJI(false);
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        AwemeSearchAdModel awemeSearchAdModel;
        Context context;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        User user;
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        C49065JNl c49065JNl = (C49065JNl) adSceneDepend;
        this.LIZ = c49065JNl;
        InterfaceC48875JGd interfaceC48875JGd = c49065JNl.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchAdVideoSceneCallBack");
        this.LIZIZ = (NIR) interfaceC48875JGd;
        C49065JNl c49065JNl2 = this.LIZ;
        NIT nit = null;
        if (c49065JNl2 != null) {
            awemeRawAd = c49065JNl2.LIZIZ;
        } else {
            awemeRawAd = null;
        }
        this.LIZJ = awemeRawAd;
        if (c49065JNl2 != null) {
            aweme = c49065JNl2.LIZJ;
        } else {
            aweme = null;
        }
        this.LIZLLL = aweme;
        if (awemeRawAd != null) {
            awemeSearchAdModel = awemeRawAd.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.LJ = awemeSearchAdModel;
        NIR nir = this.LIZIZ;
        if (nir != null) {
            context = nir.getContext();
        } else {
            context = null;
        }
        this.LJI = context;
        ISearchAdService LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            NIR nir2 = this.LIZIZ;
            if (nir2 != null) {
                viewGroup4 = nir2.LJJJ();
            } else {
                viewGroup4 = null;
            }
            Context context2 = this.LJI;
            Aweme aweme2 = this.LIZLLL;
            if (aweme2 != null) {
                user = aweme2.getAuthor();
            } else {
                user = null;
            }
            view = LJJIIZI.LJLLLL(viewGroup4, context2, aweme2, user, new ACListenerS30S0100000_10(this, 172), this.LIZ);
        } else {
            view = null;
        }
        this.LJII = view;
        ISearchAdService LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            NIR nir3 = this.LIZIZ;
            if (nir3 != null) {
                viewGroup3 = nir3.LJJJJLI();
            } else {
                viewGroup3 = null;
            }
            viewGroup = LJJIIZI2.LLFFF(viewGroup3, this.LJI, this.LIZJ);
        } else {
            viewGroup = null;
        }
        this.LJIIIIZZ = viewGroup;
        NIR nir4 = this.LIZIZ;
        if (nir4 != null) {
            ISearchAdService LJJIIZI3 = LJJIIZI();
            if (LJJIIZI3 != null) {
                viewGroup2 = LJJIIZI3.LLFZ();
            } else {
                viewGroup2 = null;
            }
            nir4.LJIIIZ(viewGroup2);
        }
        if (C46279IEh.LIZ()) {
            Aweme aweme3 = this.LIZLLL;
            Context context3 = this.LJI;
            if (aweme3 != null && context3 != null) {
                nit = MeasurementServiceImpl.LJ().LIZ();
                nit.LJIILJJIL();
                nit.LJIJI(IWC.LJLIL);
                nit.setTracker(C59078NGo.LJLIL);
                View LJ = LJ();
                if (LJ != null) {
                    nit.LJIIIZ(LJ, aweme3);
                }
            }
            this.LJIILL = nit;
        }
        N69 LJIIJ = C58827N6x.LIZIZ.LIZ.LJIIJ(new NIQ(this));
        LJIIJ.KF(LJJIIZI().LLFII());
        LJIIJ.LLLLZI();
        this.LJIILLIIL = LJIIJ;
    }
}
