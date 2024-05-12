package X;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PU4 extends PUA {
    public final Logger LJIIJ;
    public final Socket LJIIJJI;

    @Override // X.PUA
    public final void LJIILIIL() {
        try {
            this.LJIIJJI.close();
        } catch (AssertionError e) {
            if (PU7.LIZIZ(e)) {
                Logger logger = this.LJIIJ;
                Level level = Level.WARNING;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to close timed out socket ");
                LIZ.append(this.LJIIJJI);
                logger.log(level, X1D.LIZIZ(LIZ), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = this.LJIIJ;
            Level level2 = Level.WARNING;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Failed to close timed out socket ");
            LIZ2.append(this.LJIIJJI);
            logger2.log(level2, X1D.LIZIZ(LIZ2), (Throwable) e2);
        }
    }

    public PU4(Socket socket) {
        o.LJIIJ(socket, "socket");
        this.LJIIJJI = socket;
        this.LJIIJ = Logger.getLogger("okio.Okio");
    }

    @Override // X.PUA
    public final IOException LJIIL(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
