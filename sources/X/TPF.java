package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPF extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public TPF(int i, int i2, String version, String category, boolean z) {
        o.LJIIIZ(version, "version");
        o.LJIIIZ(category, "category");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = version;
        this.LJLJJI = z;
        this.LJLJJL = category;
    }
}
