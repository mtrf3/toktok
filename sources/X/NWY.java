package X;

import android.os.Bundle;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NWY implements InterfaceC59236NMq {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public NWY(NWF nwf, Bundle bundle) {
        this.LIZ = nwf;
        this.LIZIZ = bundle;
    }

    @Override // X.InterfaceC59236NMq
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        WebKitView webView = ((C59232NMm) this.LIZ.LIZ(R.id.hxj)).getWebView();
        if (webView != null) {
            NWF nwf = this.LIZ;
            Bundle bundle = this.LIZIZ;
            if (webView.getScrollY() <= 0) {
                z = true;
            } else {
                z = false;
            }
            C59501NWv.LLII = z;
            ((C59571NZn) nwf.LIZ(R.id.hxb)).LIZ(i2, i4);
            nwf.LJI(webView.getScrollY(), bundle);
        }
    }
}
