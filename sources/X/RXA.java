package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXA extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public RXA(String message, long j) {
        o.LJIIIZ(message, "message");
        this.LJLIL = message;
        this.LJLILLLLZI = j;
    }
}
