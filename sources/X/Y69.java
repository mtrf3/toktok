package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y69 extends F9E {
    public static final /* synthetic */ int LJLJI = 0;
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    public Y69() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public /* synthetic */ Y69(int i) {
        this(true, "");
    }

    public Y69(boolean z, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = z;
        this.LJLILLLLZI = errorMsg;
    }
}
