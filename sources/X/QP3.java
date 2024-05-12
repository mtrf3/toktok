package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QP3 implements InterfaceC67148QWy {
    public final /* synthetic */ QOQ LJLIL;

    public QP3(QR9 qr9) {
        this.LJLIL = qr9;
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive frontier push msg, msg = ");
        LIZ.append(msg);
        X1D.LIZIZ(LIZ);
        QOQ qoq = this.LJLIL;
        if (qoq != null) {
            qoq.LIZ(msg);
        }
    }
}
