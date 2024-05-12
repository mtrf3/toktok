package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UlQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78128UlQ extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C78128UlQ(String questionId, long j) {
        o.LJIIIZ(questionId, "questionId");
        this.LJLIL = questionId;
        this.LJLILLLLZI = j;
    }
}
