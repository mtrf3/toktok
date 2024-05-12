package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239799b5 extends F9E {
    public final boolean LJLIL;
    public final EnumC240099bZ LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public C239799b5(boolean z, EnumC240099bZ status, int i) {
        o.LJIIIZ(status, "status");
        this.LJLIL = z;
        this.LJLILLLLZI = status;
        this.LJLJI = i;
    }
}
