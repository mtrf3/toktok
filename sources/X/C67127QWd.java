package X;

import Y.ACallableS114S0100000_11;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;

/* renamed from: X.QWd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67127QWd implements QJN {
    public final /* synthetic */ Runnable LIZ;

    @Override // X.QJN
    public final void LIZ() {
        C10K.LIZIZ(new ACallableS114S0100000_11(this.LIZ, 8), C10K.LJIIIIZZ, null);
    }

    public C67127QWd(Runnable runnable) {
        this.LIZ = runnable;
    }

    @Override // X.QJN
    public final void LIZIZ(String str, String str2) {
        String str3;
        String str4;
        C09970aH.LIZ("device_id", str);
        C09970aH.LIZ("install_id", str2);
        PK0.LIZLLL().LIZIZ(str);
        HashMap hashMap = new HashMap();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        hashMap.put("deviceid", str3);
        EF7.LIZIZ();
        TTVideoEngine.LJJLJ(hashMap);
        C61520OCm LJIILIIL = O3U.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LJFF(str);
        }
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        LIZ.updateVESDKDeviceId(str4);
        FMS fms = FMR.LIZ;
        FML fml = fms.LJI;
        if (fml == null) {
            fml = new FML();
        }
        fms.LIZ(fml);
        FVR.LIZIZ();
        ISecApi LIZ2 = SecApiImpl.LIZ();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.updateDeviceIdAndInstallId(str, str2);
        C10K.LIZIZ(new ACallableS114S0100000_11(this.LIZ, 7), C10K.LJIIIIZZ, null);
    }
}
