package X;

import java.lang.Thread;
import kotlin.jvm.internal.o;

/* renamed from: X.Nay, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59644Nay implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C59639Nat LIZ;

    public C59644Nay(C59639Nat c59639Nat) {
        this.LIZ = c59639Nat;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        o.LJIIIZ(thread, "thread");
        o.LJIIIZ(throwable, "throwable");
        this.LIZ.getClass();
        C59639Nat c59639Nat = this.LIZ;
        throwable.getCause();
        c59639Nat.getClass();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ.LIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, throwable);
        }
    }
}
