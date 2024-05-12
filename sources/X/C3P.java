package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C3P extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C3P(int i, int i2, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = errorMsg;
    }
}
