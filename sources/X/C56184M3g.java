package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.M3g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56184M3g {
    public static void LIZ(Cert bpeaCert, Cert decryptCert, BDLocation bDLocation, String str, String str2) {
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(decryptCert, "decryptCert");
        if (bDLocation != null) {
            C188727au c188727au = new C188727au();
            boolean z = false;
            if (bDLocation.getLatitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && bDLocation.getLongitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                z = true;
            }
            c188727au.LJFF(Boolean.valueOf(z), "isZero");
            c188727au.LJIIIZ("bpeaCertToken", bpeaCert.certToken());
            c188727au.LJIIIZ("decryptCertToken", decryptCert.certToken());
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("business", str);
            if (str2 == null) {
                str2 = "";
            }
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, str2);
            FMX.LJIIL("location_mob_check_decrypted_result", c188727au.LIZ);
        }
    }
}
