package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83735Wtf implements InterfaceC82128WLc {
    public static final C83735Wtf LIZ = new C83735Wtf();

    @Override // X.InterfaceC82128WLc
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC82128WLc
    public final boolean LIZ(Context context, InterfaceC83863Wvj cameraService) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cameraService, "cameraService");
        int i = cameraService.LJIILL().getInt("device_support_antishake_mode", -1);
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CameraDeviceAbility isSupportAntiShake:");
        LIZ2.append(i);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ2));
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC82128WLc
    public final boolean LIZIZ(InterfaceC83863Wvj cameraService, boolean z) {
        o.LJIIIZ(cameraService, "cameraService");
        int i = cameraService.LJIILL().getInt("device_support_ai_night_video", -1);
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CameraDeviceAbility isSupportAiAugmentation:");
        LIZ2.append(i);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ2));
        if (i == 1) {
            return true;
        }
        return false;
    }
}
