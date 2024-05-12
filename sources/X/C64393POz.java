package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.POz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64393POz extends AbstractC65781Prl implements InterfaceC88472Yns<Client.ForwardRoomInfo, CharSequence> {
    public static final C64393POz LJLIL = new C64393POz();

    public C64393POz() {
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
