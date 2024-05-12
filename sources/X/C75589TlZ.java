package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TlZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75589TlZ extends F9E {
    public final EnumC75775ToZ LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C75589TlZ(EnumC75775ToZ status, String linkmicId) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(linkmicId, "linkmicId");
        this.LJLIL = status;
        this.LJLILLLLZI = linkmicId;
    }
}
