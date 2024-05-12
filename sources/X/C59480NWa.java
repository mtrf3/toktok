package X;

import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.NWa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59480NWa implements InterfaceC59637Nar {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public C59480NWa(NWF nwf, Bundle bundle) {
        this.LIZ = nwf;
        this.LIZIZ = bundle;
    }

    @Override // X.InterfaceC59637Nar
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        NZR webView = this.LIZ.getWebView();
        if (webView != null) {
            NWF nwf = this.LIZ;
            Bundle bundle = this.LIZIZ;
            if (webView.getView().getScrollY() <= 0) {
                z = true;
            } else {
                z = false;
            }
            C59501NWv.LLII = z;
            ((C59571NZn) nwf.LIZ(R.id.hxb)).LIZ(i2, i4);
            nwf.LJI(webView.getView().getScrollY(), bundle);
        }
    }
}
