package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hlc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45016Hlc extends RuntimeException {
    public final AbstractC45025Hll LJLIL;

    public final AbstractC45025Hll getFailed() {
        return this.LJLIL;
    }

    public C45016Hlc(AbstractC45025Hll failed) {
        o.LJIIIZ(failed, "failed");
        this.LJLIL = failed;
    }
}
