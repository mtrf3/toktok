package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QP4 implements InterfaceC67147QWx {
    public final /* synthetic */ QOQ LJLIL;

    public QP4(QR9 qr9) {
        this.LJLIL = qr9;
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg data) {
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive frontier push msg, msg = ");
        LIZ.append(data);
        X1D.LIZIZ(LIZ);
        QOQ qoq = this.LJLIL;
        if (qoq != null) {
            qoq.LIZ(data);
        }
    }
}
