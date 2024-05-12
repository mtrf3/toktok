package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9O extends AbstractC65781Prl implements InterfaceC88472Yns<CameraComponentModel, Boolean> {
    public static final I9O LJLIL = new I9O();

    public I9O() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(CameraComponentModel cameraComponentModel) {
        CameraComponentModel cameraComponentModel2 = cameraComponentModel;
        o.LJIIIZ(cameraComponentModel2, "cameraComponentModel");
        return Boolean.valueOf(!cameraComponentModel2.isRetakeMode);
    }
}
