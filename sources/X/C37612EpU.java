package X;

import com.bytedance.pia.core.bridge.channel.WebViewPort;

/* renamed from: X.EpU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37612EpU implements BQ6 {
    public final /* synthetic */ WebViewPort LIZ;
    public final /* synthetic */ Boolean LIZIZ;

    public /* synthetic */ C37612EpU(WebViewPort webViewPort, Boolean bool) {
        this.LIZ = webViewPort;
        this.LIZIZ = bool;
    }

    @Override // X.BQ6
    public final void accept(Object obj) {
        WebViewPort webViewPort = this.LIZ;
        Boolean bool = this.LIZIZ;
        webViewPort.getClass();
        C37613EpV.LIZJ(new RunnableC40339FsN(0, webViewPort, bool, obj));
    }
}
