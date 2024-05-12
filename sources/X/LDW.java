package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDW implements InterfaceC53894LDe {
    public final LDY LJLIL;

    public LDW(LDY observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL = observer;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        o.LJIIIZ(to, "to");
        this.LJLIL.LIZ(str, to);
    }
}
