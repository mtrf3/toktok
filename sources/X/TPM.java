package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPM extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;

    public TPM() {
        this(null, false, false, 255);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL, Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), Boolean.valueOf(this.LJLJLJ)};
    }

    public TPM(String category, boolean z, boolean z2, int i) {
        category = (i & 1) != 0 ? "" : category;
        String version = (i & 16) == 0 ? null : "";
        z = (i & 32) != 0 ? true : z;
        z2 = (i & 128) != 0 ? false : z2;
        o.LJIIIZ(category, "category");
        o.LJIIIZ(version, "version");
        this.LJLIL = category;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = version;
        this.LJLJJLL = z;
        this.LJLJL = false;
        this.LJLJLJ = z2;
    }
}
