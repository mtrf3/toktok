package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JO3 extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public JO3(String sourceId, int i, int i2) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = sourceId;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
