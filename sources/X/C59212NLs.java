package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import kotlin.jvm.internal.o;

/* renamed from: X.NLs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59212NLs extends NM4 {
    public final /* synthetic */ FeedAdLynxCard LJLIL;

    public C59212NLs(FeedAdLynxCard feedAdLynxCard) {
        this.LJLIL = feedAdLynxCard;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FeedAdLynxCard feedAdLynxCard = this.LJLIL;
        if (!feedAdLynxCard.LJLLILLLL) {
            feedAdLynxCard.LL = true;
            feedAdLynxCard.LJZL = view.LIZJ();
            View LIZJ = view.LIZJ();
            if (LIZJ == null) {
                return;
            }
            LIZJ.setLayoutParams(new FrameLayout.LayoutParams(C17N.LJIILL(270.0d), -2));
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LJLLILLLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJLLILLLL = true;
    }
}
