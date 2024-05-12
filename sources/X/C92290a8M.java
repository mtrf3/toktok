package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8M, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92290a8M extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C92290a8M(String str, String str2, String errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = errorCode;
    }
}
