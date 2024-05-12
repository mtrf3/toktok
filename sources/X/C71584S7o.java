package X;

import kotlin.jvm.internal.o;

/* renamed from: X.S7o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71584S7o extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C71584S7o(int i, String errorMsg, boolean z) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = errorMsg;
    }
}
