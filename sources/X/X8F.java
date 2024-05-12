package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8F extends F9E {
    public X8P<?> LJLIL;
    public final Class<? extends X8D> LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLILLLLZI, this.LJLJI};
    }

    public X8F(Class<? extends X8D> cls, String str) {
        this.LJLILLLLZI = cls;
        this.LJLJI = str;
    }

    public final boolean L(Class<? extends X8D> cls, String str) {
        if (cls == null) {
            if (str != null && str.length() > 0 && o.LJ(str, this.LJLJI)) {
                return true;
            }
            return false;
        }
        if (o.LJ(this.LJLILLLLZI, cls) && o.LJ(this.LJLJI, str)) {
            return true;
        }
        return false;
    }
}
