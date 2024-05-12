package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JtF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50585JtF extends F9E implements KK7 {
    public final int LJLIL;
    public final String LJLILLLLZI;

    public C50585JtF() {
        this(0, "");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().If().LIZIZ(C65352Pkq.LIZ(C50585JtF.class), C50584JtE.LJLIL);
    }

    public C50585JtF(int i, String searchPosition) {
        o.LJIIIZ(searchPosition, "searchPosition");
        this.LJLIL = i;
        this.LJLILLLLZI = searchPosition;
    }
}
