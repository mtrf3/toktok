package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.bytedance.pia.core.plugins.StreamingPlugin;

/* renamed from: X.EpS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37610EpS extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ WebMessagePort[] LIZ;
    public final /* synthetic */ StreamingPlugin LIZIZ;

    public C37610EpS(StreamingPlugin streamingPlugin, WebMessagePort[] webMessagePortArr) {
        this.LIZIZ = streamingPlugin;
        this.LIZ = webMessagePortArr;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        if (webMessage != null && "streaming_ack".equals(webMessage.getData())) {
            this.LIZIZ.LJI.set(this.LIZ[0]);
        }
    }
}
