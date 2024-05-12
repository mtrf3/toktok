package X;

import java.util.List;

/* loaded from: classes15.dex */
public final class W9R implements W8B {
    public final InterfaceC81824W9k LIZ = new C81818W9e();

    @Override // X.W8B
    public final int LIZ(int i) {
        List<Integer> LIZ = this.LIZ.LIZ();
        if (LIZ == null || LIZ.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < LIZ.size(); i2++) {
            if (LIZ.get(i2).intValue() > i) {
                return LIZ.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.W8B
    public final W8A LIZIZ(int i) {
        boolean z;
        this.LIZ.LIZIZ();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return new W8A(i, z, false);
    }
}
