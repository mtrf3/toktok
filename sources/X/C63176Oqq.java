package X;

import com.bytedance.im.core.internal.link.handler.CommandMessage;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Oqq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63176Oqq implements InterfaceC63353Oth<Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Boolean bool) {
        if (bool.booleanValue()) {
            if (!this.LJLIL) {
                return;
            }
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            C109544Rq c109544Rq = this.LJLILLLLZI;
            LIZLLL.getClass();
            LIZLLL.LJIIL(new HashMap(), 7, Collections.singletonList(c109544Rq));
            CommandMessage.LJIILJJIL(this.LJLILLLLZI);
            return;
        }
        C63322OtC.LJFF("CommandMessage handleMsgVisible update local msg fail");
    }

    public C63176Oqq(C109544Rq c109544Rq, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = c109544Rq;
    }
}
