package X;

import com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NL4 extends NM4 {
    public final /* synthetic */ FeedAdLynxSuperLike LJLIL;

    public NL4(FeedAdLynxSuperLike feedAdLynxSuperLike) {
        this.LJLIL = feedAdLynxSuperLike;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedAdLynxSuperLike feedAdLynxSuperLike = this.LJLIL;
        if (!feedAdLynxSuperLike.LJLLI) {
            feedAdLynxSuperLike.LJLL = view.LIZJ();
            this.LJLIL.LJLLILLLL = true;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LJLLI = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJLLI = true;
    }
}
