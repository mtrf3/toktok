package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0C extends Exception {
    public final int LJLIL;
    public final String LJLILLLLZI;

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0C(int i, String errorMsg) {
        super(errorMsg);
        o.LJIIJ(errorMsg, "errorMsg");
        this.LJLIL = i;
        this.LJLILLLLZI = errorMsg;
    }
}
