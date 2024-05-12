package X;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class E42 implements Serializable {
    public static final long serialVersionUID = -8759979445933046293L;
    public final Throwable LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotificationLite.Error[");
        LIZ.append(this.LJLIL);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public E42(Throwable th) {
        this.LJLIL = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E42)) {
            return false;
        }
        Throwable th = this.LJLIL;
        Throwable th2 = ((E42) obj).LJLIL;
        if (th != th2 && (th == null || !th.equals(th2))) {
            return false;
        }
        return true;
    }
}
