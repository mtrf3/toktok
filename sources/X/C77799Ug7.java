package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Ug7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77799Ug7 implements QJ8 {
    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
    }

    @Override // X.QJ8
    public final void LIZ(boolean z) {
        String did = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (!C38354F3m.LJ(did)) {
            o.LJIIIIZZ(did, "did");
            C78257UnV.LIZIZ(did);
        }
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
        LIZ(z);
    }
}
