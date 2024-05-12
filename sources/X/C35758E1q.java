package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E1q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35758E1q {
    public final List<Integer> LIZ = new ArrayList(1);

    public final synchronized boolean LIZ(int i) {
        if (((ArrayList) this.LIZ).size() >= 256) {
            return false;
        }
        ((ArrayList) this.LIZ).add(Integer.valueOf(i));
        return true;
    }

    public C35758E1q(int i, int i2, int i3, int i4, String str) {
    }
}
