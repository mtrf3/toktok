package X;

import kotlin.jvm.internal.o;

/* renamed from: X.POu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64388POu extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C64388POu(String spanId, long j) {
        o.LJIIIZ(spanId, "spanId");
        this.LJLIL = spanId;
        this.LJLILLLLZI = j;
    }
}
