package X;

import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.Oey, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62440Oey extends ASB {
    public final C62435Oet LJLJJI;
    public final ActivityC45651qj LJLJJL;

    @Override // X.ASB
    public final String LIZLLL() {
        return "adExplain";
    }

    @Override // X.ASG
    public final void LIZ(View v) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        Aweme aweme2;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        AboutAdInfo aboutThisAd2;
        Integer contentType2;
        AwemeRawAd awemeRawAd6;
        AboutAdInfo aboutThisAd3;
        Integer contentType3;
        o.LJIIIZ(v, "v");
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null && !aweme3.isAd()) {
            return;
        }
        Aweme aweme4 = this.LJLILLLLZI;
        AwemeRawAd awemeRawAd7 = null;
        if (aweme4 == null || aweme4.getAwemeRawAd() == null || C84763XOl.LJIIIIZZ() == null || (aweme = this.LJLILLLLZI) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAboutThisAd() == null) {
            return;
        }
        Aweme aweme5 = this.LJLILLLLZI;
        if (aweme5 != null && (awemeRawAd6 = aweme5.getAwemeRawAd()) != null && (aboutThisAd3 = awemeRawAd6.getAboutThisAd()) != null && (contentType3 = aboutThisAd3.getContentType()) != null && contentType3.intValue() == 0) {
            return;
        }
        Aweme aweme6 = this.LJLILLLLZI;
        if (aweme6 != null) {
            awemeRawAd2 = aweme6.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", awemeRawAd2);
        LIZLLL.LIZJ("about_tiktok_ads", "refer");
        LIZLLL.LIZIZ("long_press", "enter_from");
        LIZLLL.LJI();
        Aweme aweme7 = this.LJLILLLLZI;
        if (aweme7 == null || (awemeRawAd5 = aweme7.getAwemeRawAd()) == null || (aboutThisAd2 = awemeRawAd5.getAboutThisAd()) == null || (contentType2 = aboutThisAd2.getContentType()) == null || contentType2.intValue() != 1) {
            Aweme aweme8 = this.LJLILLLLZI;
            if (aweme8 == null || (awemeRawAd3 = aweme8.getAwemeRawAd()) == null || (aboutThisAd = awemeRawAd3.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 2 || (aweme2 = this.LJLILLLLZI) == null || (awemeRawAd4 = aweme2.getAwemeRawAd()) == null) {
                return;
            }
            ComplianceServiceImpl.LIZ().LJIJJLI(this.LJLJJL, awemeRawAd4, "long_press");
            return;
        }
        IComplianceService LIZ = ComplianceServiceImpl.LIZ();
        ActivityC45651qj activityC45651qj = this.LJLJJL;
        Aweme aweme9 = this.LJLILLLLZI;
        if (aweme9 != null) {
            awemeRawAd7 = aweme9.getAwemeRawAd();
        }
        LIZ.LJIIJ(activityC45651qj, awemeRawAd7, "long_press");
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        this.LJLJJI.LJLJLJ.extras.putString("action_type", "adExplain");
        super.LIZIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62440Oey(C62435Oet actionsManager, AS3 as3, ActivityC45651qj act) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        o.LJIIIZ(act, "act");
        this.LJLJJI = actionsManager;
        this.LJLJJL = act;
    }
}
