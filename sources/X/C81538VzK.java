package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VzK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81538VzK extends RuntimeException {
    public final Throwable LJLIL;

    public final Throwable getRealThrowable() {
        return this.LJLIL;
    }

    public C81538VzK(Throwable realThrowable) {
        o.LJIIIZ(realThrowable, "realThrowable");
        this.LJLIL = realThrowable;
    }
}
