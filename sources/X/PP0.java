package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PP0 extends AbstractC65781Prl implements InterfaceC88472Yns<Client.ForwardRoomInfo, CharSequence> {
    public static final PP0 LJLIL = new PP0();

    public PP0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Client.ForwardRoomInfo forwardRoomInfo) {
        Client.ForwardRoomInfo it = forwardRoomInfo;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[ForwardRoomInfo: roomId=");
        LIZ.append(it.roomId);
        LIZ.append(",rtcExtInfo=");
        return q.LIZIZ(LIZ, it.rtcExtInfo, ']', LIZ);
    }
}
