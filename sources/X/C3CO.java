package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.3CO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CO extends CompletedExceptionally {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LIZ = AtomicIntegerFieldUpdater.newUpdater(C3CO.class, "_resumed");
    public volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3CO(X.InterfaceC67352kd<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Continuation "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " was cancelled normally"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.<init>(r0)
        L1c:
            r2.<init>(r4, r5)
            r0 = 0
            r2._resumed = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CO.<init>(X.2kd, java.lang.Throwable, boolean):void");
    }
}
