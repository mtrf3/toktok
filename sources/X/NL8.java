package X;

import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NL8 extends NM4 {
    public final /* synthetic */ FeedAdLynxSticker LJLIL;

    public NL8(FeedAdLynxSticker feedAdLynxSticker) {
        this.LJLIL = feedAdLynxSticker;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedAdLynxSticker feedAdLynxSticker = this.LJLIL;
        if (!feedAdLynxSticker.LJLLL) {
            feedAdLynxSticker.LJLJLLL = true;
            feedAdLynxSticker.LJLLI = view.LIZJ();
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
