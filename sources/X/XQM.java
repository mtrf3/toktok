package X;

import java.io.Serializable;

/* loaded from: classes16.dex */
public final class XQM extends XQK<Object> implements Serializable {
    public static final XQM LJLIL = new XQM();
    public static final long serialVersionUID = 1;

    @Override // X.XQK
    public final boolean LIZ(Object obj, Object obj2) {
        return false;
    }

    private Object readResolve() {
        return LJLIL;
    }

    @Override // X.XQK
    public final int LIZIZ(Object obj) {
        return System.identityHashCode(obj);
    }
}
