package X;

import java.lang.Thread;
import kotlin.jvm.internal.o;

/* renamed from: X.PSl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64483PSl implements Thread.UncaughtExceptionHandler {
    public static final C64483PSl LIZ = new C64483PSl();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(e, "e");
        C66059PwF.LIZIZ(new C65852Psu(t, e, "DefaultUncaughtExceptionHandler", (java.util.Map) null, 24));
    }
}
