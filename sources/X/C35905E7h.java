package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E7h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35905E7h extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C35905E7h(String errorMsg, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        errorMsg = (i & 2) != 0 ? "" : errorMsg;
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = i2;
        this.LJLILLLLZI = errorMsg;
        this.LJLJI = false;
    }
}
