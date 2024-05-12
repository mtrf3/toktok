package X;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public class IVL implements IVM {
    public final /* synthetic */ AbstractC46746IWg LIZ;

    public IVL(IXL ixl) {
        this.LIZ = ixl;
    }

    public final void LIZ(int i, long j, String str) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C46650ISo LJIJ = this.LIZ.LJIJ(str);
            LJIJ.LIZIZ = j;
            this.LIZ.LJJIFFI(str, LJIJ);
            return;
        }
        C46650ISo LJIJ2 = this.LIZ.LJIJ(str);
        LJIJ2.LIZ = j;
        this.LIZ.LJJIFFI(str, LJIJ2);
    }
}
