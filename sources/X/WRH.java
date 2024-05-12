package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRH extends WRF {
    public final HashMap<String, String> LIZIZ;

    @Override // X.WRF, X.InterfaceC82284WRc
    public final boolean LIZ() {
        return false;
    }

    @Override // X.WRF, X.InterfaceC82284WRc
    public final void LIZLLL(boolean z) {
    }

    public WRH(WRG wrg) {
        super(wrg);
        this.LIZIZ = new HashMap<>();
    }

    @Override // X.WRF
    public final String LJFF(int i) {
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "CameraFilter_Selected_Front_Filter";
            } else {
                throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
            }
        } else {
            str = "CameraFilter_Selected_Back_Filter";
        }
        return this.LIZIZ.get(str);
    }

    @Override // X.WRF
    public final void LJI(int i, String filterId) {
        String str;
        o.LJIIIZ(filterId, "filterId");
        if (i != 0) {
            if (i == 1) {
                str = "CameraFilter_Selected_Front_Filter";
            } else {
                throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
            }
        } else {
            str = "CameraFilter_Selected_Back_Filter";
        }
        this.LIZIZ.put(str, filterId);
    }
}
