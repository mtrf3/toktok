package X;

import java.io.Serializable;

/* loaded from: classes16.dex */
public final class XRF extends XRE<Object> implements Serializable {
    public static final XRF LJLIL = new XRF();
    public static final long serialVersionUID = 1;

    private Object readResolve() {
        return LJLIL;
    }

    @Override // X.XRE
    public final int LIZIZ(Object obj) {
        return obj.hashCode();
    }

    @Override // X.XRE
    public final boolean LIZ(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
