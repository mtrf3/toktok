package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQF extends F9E {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public final int LJLJI;
    public UR7 LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public UQF(boolean z, boolean z2, int i, int i2) {
        UR7 updateType;
        z2 = (i2 & 2) != 0 ? false : z2;
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            updateType = UR7.DEFAULT;
        } else {
            updateType = null;
        }
        o.LJIIIZ(updateType, "updateType");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = i;
        this.LJLJJI = updateType;
    }
}
