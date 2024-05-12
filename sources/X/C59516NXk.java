package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: X.NXk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59516NXk implements InterfaceC59489NWj {
    public final /* synthetic */ AdPopUpWebPageAssem LIZ;

    @Override // X.InterfaceC59489NWj
    public final void LIZ() {
    }

    @Override // X.InterfaceC59489NWj
    public final String onShow() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme aweme2;
        AdPopUpWebPageVM a4 = this.LIZ.a4();
        a4.getClass();
        C2U8.LIZ(new KRH(true));
        a4.setState(C59535NYd.LJLIL);
        a4.setState(C59543NYl.LJLIL);
        a4.LJLL = System.currentTimeMillis();
        VideoItemParams gv0 = a4.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1 && a4.LJLLI == 2) {
            VideoItemParams gv02 = a4.gv0();
            if (gv02 != null && (aweme2 = gv02.getAweme()) != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C58704N2e.LIZLLL("landing_ad", "detail_show", awemeRawAd2).LJI();
        }
        return null;
    }

    public C59516NXk(AdPopUpWebPageAssem adPopUpWebPageAssem) {
        this.LIZ = adPopUpWebPageAssem;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZIZ(int i) {
        ((VideoPlayViewModel) this.LIZ.LJZL.getValue()).LJJJJL();
    }

    @Override // X.InterfaceC59489NWj
    public final String LIZJ(int i) {
        String kv0 = this.LIZ.a4().kv0();
        this.LIZ.a4().LJLJLLL = null;
        return kv0;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZLLL(int i, Boolean bool) {
        this.LIZ.a4().lv0();
    }
}
