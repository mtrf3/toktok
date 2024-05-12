package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLE extends NM4 {
    public final /* synthetic */ FeedLiveAdLynxCard LJLIL;

    public NLE(FeedLiveAdLynxCard feedLiveAdLynxCard) {
        this.LJLIL = feedLiveAdLynxCard;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedLiveAdLynxCard feedLiveAdLynxCard = this.LJLIL;
        if (!feedLiveAdLynxCard.LJLLLLLL) {
            feedLiveAdLynxCard.LJLL = true;
            feedLiveAdLynxCard.LJLLJ = view.LIZJ();
            View LIZJ = view.LIZJ();
            if (LIZJ == null) {
                return;
            }
            C278517l.LIZIZ(-1, -2, LIZJ);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LJLLLLLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJLLLLLL = true;
    }
}
