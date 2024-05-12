package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P5j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63883P5j extends QXX {
    public final List<byte[]> LJLIL = new ArrayList();

    public final synchronized void LLLLZIL() {
        if (((ArrayList) this.LJLIL).isEmpty()) {
            return;
        }
        ((ArrayList) this.LJLIL).clear();
        Runtime.getRuntime().gc();
    }

    public final synchronized void LLLLZ(long j) {
        if (!((ArrayList) this.LJLIL).isEmpty()) {
            return;
        }
        int i = (int) (j / 1048576);
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        do {
            ((ArrayList) this.LJLIL).add(new byte[1048576]);
            i2++;
        } while (i2 < i);
    }
}
