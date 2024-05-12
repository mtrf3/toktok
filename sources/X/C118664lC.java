package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.4lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118664lC extends C112554bL implements InterfaceC86486Xww {
    public View LIZ;

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{1007};
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
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

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        View view = this.LIZ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(c86507XxH, 229), view);
        }
        View view2 = this.LIZ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        return new C119904nC(3, this.LIZ);
    }
}
