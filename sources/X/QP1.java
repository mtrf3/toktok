package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QP1 implements InterfaceC67145QWv {
    public final /* synthetic */ QOQ LJLIL;

    public QP1(QR9 qr9) {
        this.LJLIL = qr9;
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
        QOQ qoq = this.LJLIL;
        if (qoq != null) {
            qoq.onReceiveConnectEvent(connectEvent, jSONObject);
        }
    }
}
