package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class PVD extends RuntimeException {
    public final IOException LJLIL;
    public IOException LJLILLLLZI;

    public IOException getFirstConnectException() {
        return this.LJLIL;
    }

    public IOException getLastConnectException() {
        return this.LJLILLLLZI;
    }

    public PVD(IOException iOException) {
        super(iOException);
        this.LJLIL = iOException;
        this.LJLILLLLZI = iOException;
    }

    public void addConnectException(IOException iOException) {
        IOException iOException2 = this.LJLIL;
        Method method = PVA.LJIILL;
        if (method != null) {
            try {
                PVA.LJIJ(iOException2, method, new Object[]{iOException});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.LJLILLLLZI = iOException;
    }
}
