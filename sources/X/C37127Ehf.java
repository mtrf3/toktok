package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ehf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37127Ehf extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C37127Ehf(int i, int i2, String layoutName, String str, boolean z) {
        o.LJIIJ(layoutName, "layoutName");
        this.LJLIL = i;
        this.LJLILLLLZI = layoutName;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = str;
    }
}
