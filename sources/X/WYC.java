package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYC {
    public static VEVideoEncodeSettings LIZ;
    public static VEVideoEncodeSettings LIZIZ;

    public static final VEVideoEncodeSettings LIZ(ActivityC45651qj context, boolean z, CameraComponentModel cameraComponentModel) {
        VEVideoEncodeSettings vEVideoEncodeSettings;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        if (z) {
            vEVideoEncodeSettings = LIZ;
            LIZ = null;
        } else {
            vEVideoEncodeSettings = LIZIZ;
            LIZIZ = null;
        }
        if (vEVideoEncodeSettings == null) {
            return C79146V4k.LJJLIIIJ(new C83593WrN(context, cameraComponentModel, new AqS157S0100000_7(cameraComponentModel, 710)));
        }
        return vEVideoEncodeSettings;
    }
}
