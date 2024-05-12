package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;

/* renamed from: X.U6n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76653U6n<T> implements InterfaceC73518StG {
    public final /* synthetic */ C76651U6l LIZ;

    public C76653U6n(C76651U6l c76651U6l) {
        this.LIZ = c76651U6l;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        U66 LJIIJJI;
        U7U LLLLZLL;
        InterfaceC75973Trl LLZZ;
        List<LinkUser> LJJJ;
        U66 LJIIJJI2;
        InterfaceC75973Trl LLZZ2;
        List<LinkUser> K9;
        U7U LLLLZLL2;
        U66 LJIIJJI3 = this.LIZ.LJIIJJI();
        if ((LJIIJJI3 != null && (LLLLZLL2 = LJIIJJI3.LLLLZLL()) != null && LLLLZLL2.LIZJ) || ((LJIIJJI = this.LIZ.LJIIJJI()) != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null && LLLLZLL.LIZ)) {
            U4R.LIZLLL("LiveLinkLayoutProvider", "turn off rtc engine opt first stage");
            U66 LJIIJJI4 = this.LIZ.LJIIJJI();
            if (LJIIJJI4 != null && (LLZZ = LJIIJJI4.LLZZ()) != null && (LJJJ = LLZZ.LJJJ()) != null && LJJJ.isEmpty() && (LJIIJJI2 = this.LIZ.LJIIJJI()) != null && (LLZZ2 = LJIIJJI2.LLZZ()) != null && (K9 = LLZZ2.K9()) != null && K9.isEmpty()) {
                this.LIZ.LJJJJJL();
                c73516StE.onComplete();
                return;
            } else {
                c73516StE.onSuccess(C76800UCe.LIZ);
                return;
            }
        }
        c73516StE.onComplete();
    }
}
