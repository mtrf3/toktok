package X;

import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLR extends NM6 {
    public final /* synthetic */ FeedAdLynxMaskContainer LJLIL;

    public NLR(FeedAdLynxMaskContainer feedAdLynxMaskContainer) {
        this.LJLIL = feedAdLynxMaskContainer;
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        this.LJLIL.LJLZ = uri.toString();
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLLII(view, uri, instance);
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLIL;
        feedAdLynxMaskContainer.LJLJLJ = instance;
        feedAdLynxMaskContainer.LJLLILLLL = view;
        feedAdLynxMaskContainer.LJLLLL = true;
    }
}
