package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I9k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46152I9k extends AbstractC65781Prl implements InterfaceC88472Yns<CameraComponentModel, Boolean> {
    public static final C46152I9k LJLIL = new C46152I9k();

    public C46152I9k() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(CameraComponentModel cameraComponentModel) {
        CameraComponentModel cameraComponentModel2 = cameraComponentModel;
        o.LJIIIZ(cameraComponentModel2, "cameraComponentModel");
        return Boolean.valueOf(!cameraComponentModel2.isRetakeMode);
    }
}
