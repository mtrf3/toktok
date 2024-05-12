package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VzJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81537VzJ extends RuntimeException {
    public final Throwable LJLIL;

    public final Throwable getRealThrowable() {
        return this.LJLIL;
    }

    public C81537VzJ(Throwable realThrowable) {
        o.LJIIIZ(realThrowable, "realThrowable");
        this.LJLIL = realThrowable;
    }
}
