package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes16.dex */
public final class XAC<T> implements InterfaceC15090iX<T> {
    public final XAH<T> LIZ;
    public final XAI<T> LIZIZ;
    public final InterfaceC15090iX<T> LIZJ;

    @Override // X.InterfaceC15090iX
    public final T LIZIZ() {
        T LIZIZ = this.LIZJ.LIZIZ();
        if (LIZIZ == null) {
            this.LIZ.getClass();
            try {
                LIZIZ = (T) new XAE(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        if (LIZIZ instanceof XAF) {
            LIZIZ.LIZ().getClass();
        }
        return (T) LIZIZ;
    }

    @Override // X.InterfaceC15090iX
    public final boolean LIZ(T t) {
        if (t instanceof XAF) {
            ((XAF) t).LIZ().getClass();
        }
        this.LIZIZ.getClass();
        return this.LIZJ.LIZ(t);
    }

    public XAC(C43051mX c43051mX, XAB xab) {
        XAG xag = XAD.LIZ;
        this.LIZJ = c43051mX;
        this.LIZ = xab;
        this.LIZIZ = xag;
    }
}
