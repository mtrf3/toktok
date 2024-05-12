package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWF extends C112554bL implements InterfaceC86486Xww {
    public InterfaceC112564bM LIZ;
    public boolean LIZIZ;
    public GWE LIZJ;

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{1002};
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

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
        GWE gwe = this.LIZJ;
        if (gwe == null) {
            return;
        }
        gwe.LJLJL = true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJI(InnerPushMessage innerPushMessage) {
        this.LIZIZ = true;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        this.LIZ = c86507XxH;
        this.LIZIZ = false;
        return new C119904nC(0, this.LIZJ);
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        InterfaceC88471Ynr<Boolean, String, C76800UCe> onDismiss;
        GWE gwe = this.LIZJ;
        if (gwe != null && (onDismiss = gwe.getOnDismiss()) != null) {
            onDismiss.invoke(Boolean.valueOf(this.LIZIZ), str);
        }
        GWE gwe2 = this.LIZJ;
        if (gwe2 == null) {
            return;
        }
        gwe2.LJLJL = false;
    }
}
