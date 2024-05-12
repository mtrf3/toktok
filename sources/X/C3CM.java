package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3CM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CM extends CancellationException {
    public final InterfaceC64672gJ<?> LJLIL;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final InterfaceC64672gJ<?> getOwner() {
        return this.LJLIL;
    }

    public C3CM(InterfaceC64672gJ<?> interfaceC64672gJ) {
        super("Flow was aborted, no more elements needed");
        this.LJLIL = interfaceC64672gJ;
    }
}
