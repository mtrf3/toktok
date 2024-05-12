package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRG {
    public final String LIZ;
    public final Keva LIZIZ;

    public /* synthetic */ WRG() {
        this("");
    }

    public WRG(String panelName) {
        o.LJIIIZ(panelName, "panelName");
        this.LIZ = panelName;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraFilterStrategyResId_Repo");
        LIZ.append(panelName);
        this.LIZIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    public final String LIZ(int i) {
        String filterResId;
        if (i != 0) {
            if (i == 1) {
                filterResId = this.LIZIZ.getString("CameraFilter_Selected_Front_Filter", "");
            } else {
                throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
            }
        } else {
            filterResId = this.LIZIZ.getString("CameraFilter_Selected_Back_Filter", "");
        }
        o.LJIIIIZZ(filterResId, "filterResId");
        return filterResId;
    }
}
