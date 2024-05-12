package X;

import android.text.TextUtils;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.bytedance.pia.core.bridge.channel.WebViewPort;

/* renamed from: X.EpQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37608EpQ extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ WebMessagePort[] LIZ;
    public final /* synthetic */ WebViewPort LIZIZ;

    public C37608EpQ(WebViewPort webViewPort, WebMessagePort[] webMessagePortArr) {
        this.LIZIZ = webViewPort;
        this.LIZ = webMessagePortArr;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        if ("__port_init__".equals(data)) {
            WebViewPort webViewPort = this.LIZIZ;
            webViewPort.LIZ.LIZJ(new C37612EpU(webViewPort, Boolean.FALSE));
        } else if ("__port_init_next__".equals(data)) {
            WebViewPort webViewPort2 = this.LIZIZ;
            webViewPort2.LIZ.LIZJ(new C37612EpU(webViewPort2, Boolean.TRUE));
        } else if ("__channel_ack__".equals(data)) {
            this.LIZIZ.LIZJ = this.LIZ[0];
        } else {
            this.LIZIZ.LIZIZ.LIZ(data);
        }
    }
}
