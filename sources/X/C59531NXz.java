package X;

/* renamed from: X.NXz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59531NXz implements InterfaceC59637Nar {
    public final /* synthetic */ C59518NXm LIZ;

    public C59531NXz(C59518NXm c59518NXm) {
        this.LIZ = c59518NXm;
    }

    @Override // X.InterfaceC59637Nar
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        NZR webView = this.LIZ.getWebView();
        if (webView != null) {
            if (webView.getView().getScrollY() <= 0) {
                z = true;
            } else {
                z = false;
            }
            C59520NXo.LLIFFJFJJ = z;
        }
    }
}
