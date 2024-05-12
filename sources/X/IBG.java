package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBG extends ESP implements InterfaceC81397Vx3 {
    public final WRQ LJLILLLLZI;

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return true;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
    }

    public IBG(WRQ cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJLILLLLZI = cameraApiComponent;
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i != 17 || i3 != 3) {
            return;
        }
        this.LJLILLLLZI.cY(null, null);
    }
}
