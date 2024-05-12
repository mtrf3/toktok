package X;

import java.util.Comparator;

/* loaded from: classes15.dex */
public class VE4 implements Comparator<VE2> {
    @Override // java.util.Comparator
    public final int compare(VE2 ve2, VE2 ve22) {
        long j;
        long j2;
        VE2 ve23 = ve2;
        VE2 ve24 = ve22;
        int i = ve23.LJLJL;
        int i2 = ve24.LJLJL;
        if (i == i2) {
            j = ve23.LJLJJL;
            j2 = ve24.LJLJJL;
        } else {
            if (i == 1) {
                return -1;
            }
            if (i2 == 1) {
                return 1;
            }
            j = ve23.LJLJJL;
            j2 = ve24.LJLJJL;
        }
        return (int) (j - j2);
    }
}
