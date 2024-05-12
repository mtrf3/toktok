package X;

import com.ss.android.vesdk.VESize;
import java.util.List;

/* loaded from: classes15.dex */
public final class WYA implements P88 {
    public final /* synthetic */ WY8 LIZ;

    public WYA(WY8 wy8) {
        this.LIZ = wy8;
    }

    @Override // X.P88
    public final VESize LIZ(List<VESize> list) {
        WY8 wy8 = this.LIZ;
        if (!wy8.LJLLJ) {
            return null;
        }
        if (wy8.LJLJLLL != null) {
            WY8 wy82 = this.LIZ;
            wy82.getClass();
            wy82.LJLL = WY8.LIZIZ(list, new VESize(this.LIZ.LJLJLLL.getWidth(), (int) (this.LIZ.LJLJLLL.getWidth() / 0.75f)), r3.width / r3.height);
            return this.LIZ.LJLL;
        }
        return wy8.LJLL;
    }
}
