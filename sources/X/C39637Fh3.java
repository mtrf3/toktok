package X;

import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Fh3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39637Fh3 {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] LIZ(InterfaceC40057Fnp interfaceC40057Fnp) {
        if (interfaceC40057Fnp instanceof C39638Fh4) {
            C39638Fh4 c39638Fh4 = (C39638Fh4) interfaceC40057Fnp;
            int i = 0;
            while (true) {
                try {
                    return C40055Fnn.LIZ(c39638Fh4);
                } catch (ClosedByInterruptException e) {
                    i++;
                    if (i <= 4) {
                        Thread.interrupted();
                        c39638Fh4.getClass();
                        FileInputStream fileInputStream = new FileInputStream(c39638Fh4.LJLIL);
                        c39638Fh4.LJLILLLLZI = fileInputStream;
                        c39638Fh4.LJLJI = fileInputStream.getChannel();
                    } else {
                        throw e;
                    }
                }
            }
        } else {
            return C40055Fnn.LIZ(interfaceC40057Fnp);
        }
    }
}
