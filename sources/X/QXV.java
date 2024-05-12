package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QXV {
    public final InterfaceC75532xp LIZ;

    public QXV() {
        C85323Wm sender = C772831o.LIZ();
        o.LJIIIZ(sender, "sender");
        this.LIZ = sender;
    }

    public final void LIZ(QXU qxu) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("report : ");
        LIZ.append(qxu);
        C34B.LIZIZ("OutAppPushWsReconnectAnalyser", X1D.LIZIZ(LIZ));
        this.LIZ.LIZIZ("out_app_push_ws_reconnect", C113554cx.LJJL(new OSZ("interval_in_millis", String.valueOf(qxu.LIZ)), new OSZ("out_push_ws_state", qxu.LIZIZ.name()), new OSZ("imsdk_ws_state", qxu.LIZJ.name()), new OSZ("out_push_is_background", String.valueOf(qxu.LIZLLL)), new OSZ("imsdk_is_background", String.valueOf(qxu.LJ))));
    }
}
