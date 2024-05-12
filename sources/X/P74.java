package X;

import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* loaded from: classes12.dex */
public class P74 implements P75 {
    public final /* synthetic */ EnumC84152X0y LIZ;

    public P74(EnumC84152X0y enumC84152X0y) {
        this.LIZ = enumC84152X0y;
    }

    public final TEFrameSizei LIZ(List<TEFrameSizei> list) {
        P3Q p3q = this.LIZ.mPreviewSizeCallback;
        TEFrameSizei tEFrameSizei = null;
        if (p3q == null) {
            return null;
        }
        try {
            tEFrameSizei = p3q.getPreviewSize(list);
            return tEFrameSizei;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select preview size from client err: ");
            LIZ.append(e.getMessage());
            C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ));
            return tEFrameSizei;
        }
    }
}
