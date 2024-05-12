package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OY1<T> implements C4L0 {
    public final /* synthetic */ InterfaceC36488ETs LJLIL;

    public OY1(InterfaceC36488ETs interfaceC36488ETs) {
        this.LJLIL = interfaceC36488ETs;
    }

    @Override // X.C4L0
    public final void run(Object obj) {
        Boolean success = (Boolean) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success ");
        LIZ.append(success);
        C36922EeM.LIZLLL(4, "ShareWebToChatMethod", X1D.LIZIZ(LIZ));
        InterfaceC36488ETs interfaceC36488ETs = this.LJLIL;
        if (interfaceC36488ETs != null) {
            o.LJIIIIZZ(success, "success");
            interfaceC36488ETs.LIZJ(success.booleanValue() ? 1 : 0, "callback", null);
        }
    }
}
