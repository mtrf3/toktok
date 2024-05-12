package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9J extends AbstractC65781Prl implements InterfaceC88472Yns<CameraComponentModel, Integer> {
    public static final I9J LJLIL = new I9J();

    public I9J() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(CameraComponentModel cameraComponentModel) {
        CameraComponentModel cameraComponentModel2 = cameraComponentModel;
        o.LJIIIZ(cameraComponentModel2, "cameraComponentModel");
        C44739Hh9.LIZIZ = cameraComponentModel2.LIZIZ().isEmpty();
        return Integer.valueOf(C44739Hh9.LIZ() ? 1 : 0);
    }
}
