package X;

import com.bytedance.im.core.internal.link.handler.CommandMessage;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Oqo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63174Oqo implements InterfaceC86963bA<C109544Rq> {
    public final /* synthetic */ boolean LIZ;

    public C63174Oqo(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandMessage handleMsgVisible GetMessageById fail = ");
        LIZ.append(c63623Oy3.toString());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C109544Rq c109544Rq) {
        C109544Rq c109544Rq2 = c109544Rq;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandMessage handleMsgVisible GetMessageById success = ");
        LIZ.append(c109544Rq2.toString());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!this.LIZ) {
            return;
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        LIZLLL.LJIIL(new HashMap(), 7, Collections.singletonList(c109544Rq2));
        CommandMessage.LJIILJJIL(c109544Rq2);
    }
}
