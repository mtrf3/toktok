package X;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Pqm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65720Pqm implements InterfaceC65721Pqn {
    public static final C65720Pqm LIZ = new C65720Pqm();

    @Override // X.InterfaceC65721Pqn
    public final void LIZ(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = C65722Pqo.LIZ;
        Level level = Level.WARNING;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Suppressing exception thrown when closing ");
        LIZ2.append(closeable);
        logger.log(level, X1D.LIZIZ(LIZ2), th2);
    }
}
