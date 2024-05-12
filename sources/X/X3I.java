package X;

import java.util.List;

/* loaded from: classes16.dex */
public abstract class X3I implements X15 {
    public boolean LIZ;

    @Override // X.X15
    public final boolean LJJLIIIJL() {
        return this.LIZ;
    }

    public X3I(int i) {
        if (i != 1) {
            return;
        }
        this.LIZ = true;
    }

    @Override // X.X15
    public void LJJJJZI(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LIZ = true;
    }
}
