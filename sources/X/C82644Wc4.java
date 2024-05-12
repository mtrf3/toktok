package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.Wc4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82644Wc4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Application application) {
        o.LJIIIZ(application, "application");
        if (C82646Wc6.LIZ() || C82646Wc6.LIZIZ()) {
            H78.LIZ("CameraAntiShakeV1 -> initialize cameraAntiShakeMode = SHAKE_FREE_ENABLE");
            C82087WJn.LIZ(application).LIZ(1);
        } else {
            H78.LIZ("CameraAntiShakeV1 -> initialize cameraAntiShakeMode = SHAKE_FREE_NOT_SET");
            C82087WJn.LIZ(application).LIZ(0);
        }
    }
}
