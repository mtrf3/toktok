package X;

import java.io.Serializable;

/* loaded from: classes16.dex */
public final class XQL extends XQK<Object> implements Serializable {
    public static final XQL LJLIL = new XQL();
    public static final long serialVersionUID = 1;

    private Object readResolve() {
        return LJLIL;
    }

    @Override // X.XQK
    public final int LIZIZ(Object obj) {
        return obj.hashCode();
    }

    @Override // X.XQK
    public final boolean LIZ(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
