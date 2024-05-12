package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;

/* renamed from: X.M6j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56265M6j {
    public final WsChannelMsg LIZ;

    public final byte[] LIZ() {
        byte[] LIZ = this.LIZ.LIZ();
        o.LJIIIIZZ(LIZ, "wsChannelMsg.payload");
        return LIZ;
    }

    public final String LIZIZ() {
        String str = this.LIZ.payloadEncoding;
        o.LJIIIIZZ(str, "wsChannelMsg.payloadEncoding");
        return str;
    }

    public final String LIZJ() {
        String str = this.LIZ.payloadType;
        o.LJIIIIZZ(str, "wsChannelMsg.payloadType");
        return str;
    }

    public C56265M6j(WsChannelMsg wsChannelMsg) {
        o.LJIIIZ(wsChannelMsg, "wsChannelMsg");
        this.LIZ = wsChannelMsg;
    }
}
