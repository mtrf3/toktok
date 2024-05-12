package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VECameraSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Wte, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83734Wte extends C83733Wtd {
    @Override // X.C83733Wtd
    public final void LIZIZ() {
    }

    @Override // X.C83733Wtd
    public final int LIZ() {
        if (this.LIZLLL) {
            return 2;
        }
        return 0;
    }

    @Override // X.C83733Wtd
    public final boolean LJ() {
        InterfaceC83863Wvj mCameraService = this.LIZ;
        o.LJIIIIZZ(mCameraService, "mCameraService");
        int i = mCameraService.LJIILL().getInt("device_support_wide_angle_mode", -1);
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraDeviceAbility isSupportWideAngle:");
        LIZ.append(i);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C83733Wtd
    public final void LIZJ(boolean z) {
        boolean z2 = true;
        this.LIZIZ = true;
        int i = C83738Wti.LIZ;
        if (i == -1 || i != VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal()) {
            z2 = false;
        }
        this.LIZJ = z2;
        this.LIZLLL = z;
    }

    @Override // X.C83733Wtd
    public final boolean LIZLLL(boolean z) {
        if (!z && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.C83733Wtd
    public final void LJFF(Context context, Cert cert) {
        int i;
        o.LJIIIZ(context, "context");
        InterfaceC83863Wvj interfaceC83863Wvj = this.LIZ;
        if (this.LIZLLL) {
            i = 0;
        } else {
            i = 2;
        }
        interfaceC83863Wvj.LJJIJL(i, new C83736Wtg(), cert);
        this.LIZLLL = !this.LIZLLL;
        this.LIZ.LJIIIZ().LIZ(this.LIZLLL);
    }
}
