package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wqp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83559Wqp implements InterfaceC83565Wqv {
    public final /* synthetic */ C83550Wqg LIZ;

    @Override // X.InterfaceC83565Wqv
    public final void LIZ(String text) {
        o.LJIIIZ(text, "text");
    }

    public C83559Wqp(C83550Wqg c83550Wqg) {
        this.LIZ = c83550Wqg;
    }

    @Override // X.InterfaceC83565Wqv
    public final void LIZIZ(String text) {
        o.LJIIIZ(text, "text");
        C83550Wqg c83550Wqg = this.LIZ;
        if (c83550Wqg.LJI) {
            InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = c83550Wqg.LJIIJ;
            c83550Wqg.LIZLLL.getClass();
            interfaceC88471Ynr.invoke(null, text);
        }
    }
}
