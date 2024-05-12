package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AS9 extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public /* synthetic */ AS9(int i, int i2) {
        this(i, i2, "");
    }

    public AS9(int i, int i2, String key) {
        o.LJIIIZ(key, "key");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = key;
    }
}
