package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126124xE extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C126124xE(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = i;
        this.LJLILLLLZI = errorMsg;
    }
}
