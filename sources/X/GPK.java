package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPK extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final GP9 LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public GPK(boolean z, boolean z2, GP9 draftQueryType) {
        o.LJIIIZ(draftQueryType, "draftQueryType");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = draftQueryType;
    }

    public /* synthetic */ GPK(boolean z, boolean z2, GP9 gp9, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? GP9.ALL : gp9);
    }
}
