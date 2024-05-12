package X;

import android.os.Bundle;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NWX implements InterfaceC59221NMb {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public NWX(NWF nwf, Bundle bundle) {
        this.LIZ = nwf;
        this.LIZIZ = bundle;
    }

    @Override // X.InterfaceC59221NMb
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        WebKitView webView = ((NWI) this.LIZ.LIZ(R.id.uv)).getWebView();
        if (webView != null) {
            NWF nwf = this.LIZ;
            Bundle bundle = this.LIZIZ;
            if (webView.getScrollY() <= 0) {
                z = true;
            } else {
                z = false;
            }
            C59501NWv.LLII = z;
            NUM iAdWebBottomBar = ((NWI) nwf.LIZ(R.id.uv)).getIAdWebBottomBar();
            if (iAdWebBottomBar != null) {
                iAdWebBottomBar.LIZ(i2, i4);
            }
            nwf.LJI(webView.getScrollY(), bundle);
        }
    }
}
