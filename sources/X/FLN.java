package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLN {
    public static void LIZ(String country, boolean z, boolean z2) {
        int i;
        o.LJIIIZ(country, "country");
        int i2 = 1;
        FLO.LIZJ = true;
        FLO.LIZLLL = z;
        FLO.LJFF = z2;
        FLO.LJ = country;
        C188727au c188727au = new C188727au();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "anonymize_user");
        if (!z2) {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "delay_af_start");
        c188727au.LJIIIZ("country", country);
        FMX.LJIIL("af_compliance_info", c188727au.LIZ);
        FLO.LJFF(TokenCert.Companion.with("bpea-appsflyer_androidsdk_1964"));
    }
}
