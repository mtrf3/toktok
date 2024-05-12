package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107124Ii extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C107124Ii(String userName, int i, int i2) {
        o.LJIIIZ(userName, "userName");
        this.LJLIL = userName;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
