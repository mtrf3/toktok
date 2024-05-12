package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GyT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43265GyT extends GJS {
    public final C29930Bos LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_question_mark_circle_ltr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43265GyT(C29930Bos params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LJLILLLLZI = params;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        AwemeRawAd awemeRawAd;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        AwemeRawAd awemeRawAd2;
        AboutAdInfo aboutThisAd2;
        Integer contentType2;
        AboutAdInfo aboutThisAd3;
        Integer contentType3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Aweme i6 = AwemeService.LIZ().i6(this.LJLILLLLZI.LJJIJIIJIL);
        if (i6 != null && i6.isAd() && i6.getAwemeRawAd() != null && (awemeRawAd = i6.getAwemeRawAd()) != null && awemeRawAd.getAboutThisAd() != null) {
            AwemeRawAd awemeRawAd3 = i6.getAwemeRawAd();
            if (awemeRawAd3 == null || (aboutThisAd3 = awemeRawAd3.getAboutThisAd()) == null || (contentType3 = aboutThisAd3.getContentType()) == null || contentType3.intValue() != 0) {
                Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
                if (LJJLIIIJ instanceof ActivityC45651qj) {
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", i6.getAwemeRawAd());
                    LIZLLL.LIZJ("about_tiktok_ads", "refer");
                    LIZLLL.LIZIZ("long_press", "enter_from");
                    LIZLLL.LJI();
                    AwemeRawAd awemeRawAd4 = i6.getAwemeRawAd();
                    if (awemeRawAd4 == null || (aboutThisAd2 = awemeRawAd4.getAboutThisAd()) == null || (contentType2 = aboutThisAd2.getContentType()) == null || contentType2.intValue() != 1) {
                        AwemeRawAd awemeRawAd5 = i6.getAwemeRawAd();
                        if (awemeRawAd5 == null || (aboutThisAd = awemeRawAd5.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 2 || (awemeRawAd2 = i6.getAwemeRawAd()) == null) {
                            return;
                        }
                        ComplianceServiceImpl.LIZ().LJIJJLI((ActivityC45651qj) LJJLIIIJ, awemeRawAd2, "long_press");
                        return;
                    }
                    ComplianceServiceImpl.LIZ().LJIIJ((ActivityC45651qj) LJJLIIIJ, i6.getAwemeRawAd(), "long_press");
                }
            }
        }
    }
}
