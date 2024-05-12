package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class PU7 {
    public static final C64532PUi LIZ(PUC receiver) {
        o.LJIIJ(receiver, "$receiver");
        return new C64532PUi(receiver);
    }

    public static final boolean LIZIZ(AssertionError assertionError) {
        String message;
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !s.LJJJLZIJ(message, "getsockname failed", false)) {
            return false;
        }
        return true;
    }

    public static final PUF LIZJ(Socket receiver) {
        o.LJIIJ(receiver, "$receiver");
        PU4 pu4 = new PU4(receiver);
        OutputStream outputStream = receiver.getOutputStream();
        o.LJFF(outputStream, "getOutputStream()");
        return new PUF(pu4, new PUG(outputStream, pu4));
    }

    public static final PUG LIZLLL(OutputStream receiver) {
        o.LJIIJ(receiver, "$receiver");
        return new PUG(receiver, new C64545PUv());
    }

    public static PUG LJ(File file) {
        return LIZLLL(new FileOutputStream(file, false));
    }

    public static final PUB LJFF(Socket receiver) {
        o.LJIIJ(receiver, "$receiver");
        PU4 pu4 = new PU4(receiver);
        InputStream inputStream = receiver.getInputStream();
        o.LJFF(inputStream, "getInputStream()");
        return new PUB(pu4, new PUE(inputStream, pu4));
    }

    public static final PUE LJI(File receiver) {
        o.LJIIJ(receiver, "$receiver");
        return LJII(new FileInputStream(receiver));
    }

    public static final PUE LJII(InputStream receiver) {
        o.LJIIJ(receiver, "$receiver");
        return new PUE(receiver, new C64545PUv());
    }
}
