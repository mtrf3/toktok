package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* loaded from: classes5.dex */
public final class AL7 extends AbstractC60811Ntn {
    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        WebKitView webKitView;
        if ((interfaceC60761Nsz instanceof WebKitView) && interfaceC60761Nsz != null && (webKitView = (WebKitView) interfaceC60761Nsz) != null) {
            webKitView.setOnTouchListener(new AL8(webKitView));
            webKitView.setWebOverScrollByListener(new AL9());
        }
    }
}
