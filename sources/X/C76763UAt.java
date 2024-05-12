package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import kotlin.jvm.internal.o;

/* renamed from: X.UAt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76763UAt extends AbstractC65781Prl implements InterfaceC88472Yns<Client.ForwardRoomInfo, CharSequence> {
    public static final C76763UAt LJLIL = new C76763UAt();

    public C76763UAt() {
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
