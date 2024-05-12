package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CSf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31353CSf extends F9E {
    public final CR6 LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C31353CSf(CR6 message) {
        o.LJIIIZ(message, "message");
        this.LJLIL = message;
        this.LJLILLLLZI = 1;
        this.LJLJI = 1;
    }
}
