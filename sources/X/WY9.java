package X;

import com.ss.android.vesdk.VESize;
import java.util.List;

/* loaded from: classes15.dex */
public final class WY9 implements PDD {
    public final /* synthetic */ WY8 LIZ;

    public WY9(WY8 wy8) {
        this.LIZ = wy8;
    }

    @Override // X.PDD
    public final VESize LIZ(List list) {
        Integer num;
        Integer num2;
        Integer num3;
        WY8 wy8 = this.LIZ;
        VESize vESize = wy8.LJLL;
        float f = vESize.height / vESize.width;
        wy8.LJLLI = C44739Hh9.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("targetPictureSize width = ");
        VESize vESize2 = this.LIZ.LJLLI;
        Integer num4 = null;
        if (vESize2 != null) {
            num = Integer.valueOf(vESize2.width);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(",targetPictureSize height = ");
        VESize vESize3 = this.LIZ.LJLLI;
        if (vESize3 != null) {
            num2 = Integer.valueOf(vESize3.height);
        } else {
            num2 = null;
        }
        LIZ.append(num2);
        LIZ.append(", targetRatio = ");
        LIZ.append(f);
        X1D.LIZIZ(LIZ);
        WY8 wy82 = this.LIZ;
        VESize vESize4 = wy82.LJLLI;
        if (vESize4 != null) {
            wy82.LJLLILLLL = WY8.LIZIZ(list, vESize4, f);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("selectPictureSize width = ");
            VESize vESize5 = wy82.LJLLILLLL;
            if (vESize5 != null) {
                num3 = Integer.valueOf(vESize5.height);
            } else {
                num3 = null;
            }
            LIZ2.append(num3);
            LIZ2.append(", selectPictureSize height = ");
            VESize vESize6 = wy82.LJLLILLLL;
            if (vESize6 != null) {
                num4 = Integer.valueOf(vESize6.width);
            }
            LIZ2.append(num4);
            X1D.LIZIZ(LIZ2);
        }
        return this.LIZ.LJLLILLLL;
    }
}
