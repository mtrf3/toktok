package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWO extends C112554bL implements InterfaceC86486Xww {
    public final C41672GXc LIZ;
    public final InterfaceC88471Ynr<Boolean, InterfaceC65784Pro<C76800UCe>, C76800UCe> LIZIZ;
    public InterfaceC112564bM LIZJ;
    public boolean LIZLLL = true;

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{1000};
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJI(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    public GWO(C41672GXc c41672GXc, AqS170S0200000_7 aqS170S0200000_7) {
        this.LIZ = c41672GXc;
        this.LIZIZ = aqS170S0200000_7;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        this.LIZJ = c86507XxH;
        this.LIZ.setDismissAction(new AqS167S0100000_1(c86507XxH, 467));
        this.LIZLLL = false;
        return new C119904nC(0, this.LIZ);
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            this.LIZIZ.invoke(Boolean.valueOf(this.LIZ.LJLJLJ), GWR.LJLIL);
        }
        if (this.LIZ.LJLJLJ) {
            str2 = "tap";
        } else if (z) {
            str2 = "swipe";
        } else {
            str2 = "auto_dismiss";
        }
        AVExternalServiceImpl.LIZ().abnormalExitLogService().logRestoreDialogDismiss(str2);
    }
}
