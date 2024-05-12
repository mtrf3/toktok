package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import kotlin.jvm.internal.o;

/* renamed from: X.UAu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76764UAu extends AbstractC65781Prl implements InterfaceC88472Yns<Client.ForwardRoomInfo, CharSequence> {
    public static final C76764UAu LJLIL = new C76764UAu();

    public C76764UAu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Client.ForwardRoomInfo forwardRoomInfo) {
        Client.ForwardRoomInfo it = forwardRoomInfo;
        o.LJIIIZ(it, "it");
        String str = it.roomId;
        o.LJIIIIZZ(str, "it.roomId");
        return str;
    }
}
