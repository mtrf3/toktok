package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.POy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64392POy extends AbstractC65781Prl implements InterfaceC88472Yns<Client.ForwardRoomInfo, CharSequence> {
    public static final C64392POy LJLIL = new C64392POy();

    public C64392POy() {
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
