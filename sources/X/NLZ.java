package X;

import com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLZ extends NM4 {
    public final /* synthetic */ FeedAdLynxSurvey LJLIL;

    public NLZ(FeedAdLynxSurvey feedAdLynxSurvey) {
        this.LJLIL = feedAdLynxSurvey;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedAdLynxSurvey feedAdLynxSurvey = this.LJLIL;
        if (!feedAdLynxSurvey.LJLLL) {
            feedAdLynxSurvey.LJLLI = view.LIZJ();
            this.LJLIL.LJLLJ = true;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LJLLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJLLL = true;
    }
}
