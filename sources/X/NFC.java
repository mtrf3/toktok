package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NFC implements InterfaceC207738Dh {
    public final /* synthetic */ C207728Dg LIZ;
    public final /* synthetic */ NFB LIZIZ;

    public NFC(C207728Dg c207728Dg, NFB nfb) {
        this.LIZ = c207728Dg;
        this.LIZIZ = nfb;
    }

    @Override // X.InterfaceC207738Dh
    public final void LIZ(C207728Dg ratingInput, int i) {
        CommerceAceSurveyInfo LJIJI;
        o.LJIIIZ(ratingInput, "ratingInput");
        this.LIZ.setEnabled(false);
        AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LIZIZ.LJLZ;
        if (adFollowUpAceSurveyVM != null) {
            Aweme aweme = adFollowUpAceSurveyVM.LJLIL;
            if (aweme != null && (LJIJI = C79057V0z.LJIJI(aweme)) != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(adFollowUpAceSurveyVM), null, null, new NFI(new NFG(LJIJI.getUserConvert(), LJIJI.getSendNoticeTime(), i), adFollowUpAceSurveyVM, null), 3);
            }
            XKX.LIZLLL(ViewModelKt.getViewModelScope(adFollowUpAceSurveyVM), null, null, new C59024NEm(adFollowUpAceSurveyVM, i, null), 3);
            return;
        }
        o.LJIJI("surveyVm");
        throw null;
    }
}
