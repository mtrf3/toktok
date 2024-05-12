package X;

import com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLQ extends NM4 {
    public final /* synthetic */ FeedAdLynxMaskContainer LJLIL;

    public NLQ(FeedAdLynxMaskContainer feedAdLynxMaskContainer) {
        this.LJLIL = feedAdLynxMaskContainer;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLIL;
        if (!feedAdLynxMaskContainer.LJLLLLLL) {
            feedAdLynxMaskContainer.LJLLILLLL = view.LIZJ();
            this.LJLIL.LJLLLL = true;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLIL;
        feedAdLynxMaskContainer.LJLZ = url;
        feedAdLynxMaskContainer.LJLLLLLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJLLLLLL = true;
    }
}
