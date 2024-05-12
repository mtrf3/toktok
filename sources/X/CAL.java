package X;

import android.webkit.WebView;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;

/* loaded from: classes6.dex */
public final class CAL implements COV {
    public final /* synthetic */ TopRightBannerWidget LIZ;

    public CAL(TopRightBannerWidget topRightBannerWidget) {
        this.LIZ = topRightBannerWidget;
    }

    @Override // X.COV
    public final void LIZ(WebView webView, String str) {
        TopRightBannerWidget topRightBannerWidget = this.LIZ;
        topRightBannerWidget.LL(webView, topRightBannerWidget.LJLJLLL);
        CA3.LJ(2, 0, 12);
    }

    @Override // X.COV
    public final void LIZIZ(WebView webView, String str, String str2) {
        CA3.LIZLLL(2, str, 0, 24);
    }
}
