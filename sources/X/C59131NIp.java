package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: X.NIp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59131NIp implements C6YD {
    public final /* synthetic */ C59316NPs LIZ;
    public final /* synthetic */ DouPlusLinkData LIZIZ;

    @Override // X.C6YD
    public final void LIZLLL() {
    }

    @Override // X.C6YD
    public final void LIZIZ() {
        C59316NPs c59316NPs = this.LIZ;
        C59133NIr c59133NIr = ((C59132NIq) c59316NPs.LJLJJLL).LIZJ;
        Context context = c59316NPs.LJLLI;
        Aweme aweme = c59316NPs.LJLJLJ;
        C59123NIh c59123NIh = c59316NPs.LLLLLLLLLL;
        c59133NIr.getClass();
        NOE.LJJIIJ(context, aweme, 18, c59123NIh);
        C59316NPs c59316NPs2 = this.LIZ;
        Context context2 = c59316NPs2.LJLLI;
        DouPlusLinkData douPlusLinkData = this.LIZIZ;
        Aweme aweme2 = c59316NPs2.LJLJLJ;
        if (context2 != null && douPlusLinkData != null && aweme2 != null && aweme2.getAwemeRawAd() != null) {
            JSONObject LJIIJ = NN1.LJIIJ(context2, aweme2, "link");
            NN1.LIZJ(NN1.LJIILJJIL(aweme2), context2, "draw_ad", "click", NN1.LJII(aweme2.getAwemeRawAd()), LJIIJ);
            if (C63081OpJ.LJJLIIIJJI(aweme2)) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                O8Z.LIZ("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
            }
        }
        C59316NPs c59316NPs3 = this.LIZ;
        C40497Fuv c40497Fuv = ((C59132NIq) c59316NPs3.LJLJJLL).LIZ;
        Aweme aweme3 = c59316NPs3.LJLJLJ;
        c40497Fuv.getClass();
        C40496Fuu.LJLJI = aweme3;
    }

    public C59131NIp(C59316NPs c59316NPs, DouPlusLinkData douPlusLinkData) {
        this.LIZ = c59316NPs;
        this.LIZIZ = douPlusLinkData;
    }
}
