package X;

import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NWZ implements InterfaceC59505NWz {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public NWZ(NWF nwf, Bundle bundle) {
        this.LIZ = nwf;
        this.LIZIZ = bundle;
    }

    @Override // X.InterfaceC59505NWz
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        C59614NaU webView = ((NWH) this.LIZ.LIZ(R.id.hxi)).getWebView();
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
