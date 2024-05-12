package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U9a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76718U9a extends AbstractC65781Prl implements InterfaceC88471Ynr<U66, IMessage, C76800UCe> {
    public static final C76718U9a LJLIL = new C76718U9a();

    public C76718U9a() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(U66 u66, IMessage iMessage) {
        U66 linker = u66;
        IMessage message = iMessage;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
        C76766UAw.LIZJ.LIZ(new AqS160S0200000_13(linker, message, 39));
        return C76800UCe.LIZ;
    }
}
