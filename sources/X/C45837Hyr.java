package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hyr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45837Hyr extends F9E {
    public final boolean LJLIL;
    public final C45828Hyi LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public C45837Hyr(boolean z, C45828Hyi errorStatus, int i) {
        o.LJIIIZ(errorStatus, "errorStatus");
        this.LJLIL = z;
        this.LJLILLLLZI = errorStatus;
        this.LJLJI = i;
    }
}
