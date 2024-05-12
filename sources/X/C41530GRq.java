package X;

import java.util.Comparator;

/* renamed from: X.GRq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41530GRq implements Comparator<C41529GRp> {
    @Override // java.util.Comparator
    public final int compare(C41529GRp c41529GRp, C41529GRp c41529GRp2) {
        int i = c41529GRp.LIZ;
        int i2 = c41529GRp2.LIZ;
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }
}
