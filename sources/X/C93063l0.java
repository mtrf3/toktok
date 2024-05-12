package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93063l0 extends F9E {
    public final C109544Rq LJLIL;
    public final EnumC93173lB LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C93063l0(C109544Rq message, EnumC93173lB origin) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(origin, "origin");
        this.LJLIL = message;
        this.LJLILLLLZI = origin;
    }
}
