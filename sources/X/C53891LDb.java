package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LDb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53891LDb implements InterfaceC53894LDe {
    public final LDY LJLIL;

    public C53891LDb(LDY observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL = observer;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        o.LJIIIZ(to, "to");
        this.LJLIL.LIZ(str, to);
    }
}
