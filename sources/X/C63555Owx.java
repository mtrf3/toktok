package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Owx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63555Owx extends Exception {
    public final Exception LJLIL;
    public final int LJLILLLLZI;

    public final Exception getException() {
        return this.LJLIL;
    }

    public final int getNetworkAttemptCount() {
        return this.LJLILLLLZI;
    }

    public C63555Owx(Exception exception, int i) {
        o.LJIIIZ(exception, "exception");
        this.LJLIL = exception;
        this.LJLILLLLZI = i;
    }
}
