package X;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.feed.slide.guide.MainPageSlideImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LpU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55448LpU {
    public final C29S LIZ;
    public HomePageDataViewModel LIZIZ;
    public IMainAdScene LIZJ;

    public final boolean LIZ() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        HomePageDataViewModel homePageDataViewModel = this.LIZIZ;
        if (homePageDataViewModel == null) {
            return false;
        }
        Aweme aweme = homePageDataViewModel.LJLJLLL;
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            LJJIJLIJ.setEnterFrom(this.LIZIZ.getEventType());
        }
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (C63081OpJ.LLIIL(aweme) && C63081OpJ.LJLJJL(aweme) && !C63081OpJ.LJJ(aweme) && !TextUtils.isEmpty(C63081OpJ.LJJIIZI(aweme))) {
            NO5.LJJ(this.LIZ, aweme);
            return true;
        }
        if (C63081OpJ.LJJLJ(aweme) && NOX.LIZ.LIZIZ(aweme)) {
            return false;
        }
        if (C63081OpJ.LJLJJL(aweme) && C63081OpJ.LLJJI(aweme)) {
            NOE.LJJII(this.LIZ, aweme);
            return true;
        }
        if (!aweme.isAd() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || !C63081OpJ.LJLJJL(aweme) || C63081OpJ.LJJ(aweme) || (((!C59251NNf.LIZIZ(3, aweme) || TextUtils.isEmpty(awemeRawAd2.getWebUrl())) && !C63081OpJ.LJL(aweme) && !NPC.LJI(awemeRawAd2.getOpenUrl())) || C63081OpJ.LJJLIIJ(aweme))) {
            if (!C63081OpJ.LJJLIIIJLLLLLLLZ(aweme) && TextUtils.isEmpty(awemeRawAd.getWebUrl()) && C63081OpJ.LJLJJL(aweme)) {
                C16880lQ.LLZILL(Toast.makeText(this.LIZ, R.string.b94, 0));
                return true;
            }
            if (!C63081OpJ.LJJLIIIJLLLLLLLZ(aweme) || !C63081OpJ.LJLJJL(aweme) || C63081OpJ.LJJ(aweme) || C63081OpJ.LJJLIIJ(aweme)) {
                return false;
            }
            if (C63081OpJ.LJJLIIIJLLLLLLLZ(aweme)) {
                if (!NOE.LJJIIJZLJL(this.LIZ, aweme)) {
                    C16880lQ.LLZILL(Toast.makeText(this.LIZ, R.string.b94, 0));
                }
            } else {
                C16880lQ.LLZILL(Toast.makeText(this.LIZ, R.string.b94, 0));
            }
            return true;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 == null || !awemeRawAd3.isPopUps() || !NPC.LJIIJ(awemeRawAd3.getOpenUrl())) {
            if (NO5.LJIIIZ(this.LIZ, aweme) || C55447LpT.LIZ(this.LIZ, aweme)) {
                return true;
            }
            if (C52285KfZ.LIZ()) {
                return false;
            }
            NO5.LJIIJ(40, this.LIZ, aweme, null);
            return true;
        }
        NO5.LJIJJLI(this.LIZ, aweme);
        return true;
    }

    public final void LIZIZ() {
        if (C53314KwA.LIZ() || C46376IIa.LIZ) {
            ((InterfaceC55452LpY) this.LIZ).setVpEnableDispatchTouchEventCheck(false);
        }
        Aweme aweme = this.LIZIZ.LJLJLLL;
        if (aweme == null) {
            return;
        }
        C54211LPj LIZ = MainPageSlideImpl.LIZIZ().LIZ(aweme);
        boolean z = LIZ.LIZ;
        boolean z2 = LIZ.LIZIZ;
        ((InterfaceC55452LpY) this.LIZ).allowSwipeLeft(z);
        NNB.LJIIJ = z;
        if (z2) {
            if (!TextUtils.equals(this.LIZIZ.getEventType(), "homepage_popular") || !TextUtils.equals(this.LIZIZ.getEventType(), "homepage_follow")) {
                if (C53314KwA.LIZ() || C46376IIa.LIZ) {
                    ((InterfaceC55452LpY) this.LIZ).setVpEnableDispatchTouchEventCheck(true);
                }
            }
        }
    }

    public C55448LpU(C29S c29s) {
        this.LIZ = c29s;
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII != null) {
            this.LIZJ = LJII.LIZIZ();
            C55449LpV c55449LpV = new C55449LpV();
            c55449LpV.LIZIZ = c29s;
            c55449LpV.LIZ = new C55451LpX(this, c29s);
            this.LIZJ.init(c55449LpV);
        }
        IAdSceneService LJII2 = AdSceneServiceImpl.LJII();
        if (LJII2 != null) {
            C55450LpW c55450LpW = new C55450LpW();
            c55450LpW.LIZ = new NN5();
            LJII2.LIZJ().init(c55450LpW);
        }
        FeedAdServiceImpl.LJJIJLIJ().LJIIJJI();
        C59198NLe.LIZ.LIZIZ(c29s);
        FeedAdServiceImpl.LJJIJLIJ().LJIIZILJ();
        NKP.LIZ.LJIILJJIL(c29s);
        FeedAdServiceImpl.LJJIJLIJ().LJJIII();
        C59182NKo.LIZ(C59181NKn.LIZ, c29s);
        FeedAdServiceImpl.LJJIJLIJ().LJIIIZ();
        C59182NKo.LIZ(C59171NKd.LIZ, c29s);
        FeedAdServiceImpl.LJJIJLIJ().LJIJ();
        C59182NKo.LIZ(NKZ.LIZ, c29s);
        FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
        NKM.LIZ.LJIILJJIL(c29s);
        FeedAdServiceImpl.LJJIJLIJ().LIZJ();
        C59177NKj.LIZ.LJIILJJIL(c29s);
    }
}
