package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3KS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KS implements InterfaceC82123Ke {
    public final InterfaceC65784Pro<Boolean> LJLIL;

    @Override // X.InterfaceC82123Ke
    public final C39N LIZIZ() {
        return C39N.LOGIN;
    }

    public C3KS(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC82123Ke
    public final void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
        o.LJIIIZ(sessionList, "sessionList");
    }

    @Override // X.InterfaceC82123Ke
    public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
        o.LJIIIZ(sessionList, "sessionList");
        if (!this.LJLIL.invoke().booleanValue()) {
            return;
        }
        C3S8.LIZIZ();
    }
}
