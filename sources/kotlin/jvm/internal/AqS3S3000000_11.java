package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C66532Q9g;
import X.C66607QCd;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q96;
import X.Q9D;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes12.dex */
public class AqS3S3000000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S3000000_11 aqS3S3000000_11) {
        AppsFlyerLib.getInstance().setPreinstallAttribution(aqS3S3000000_11.s0, aqS3S3000000_11.s1, aqS3S3000000_11.s2);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS3S3000000_11 aqS3S3000000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "setPreinstallAttribution";
        q96.LIZJ = C113554cx.LJJL(new OSZ("channel", aqS3S3000000_11.s0), new OSZ("campaign", aqS3S3000000_11.s1), new OSZ("siteId", aqS3S3000000_11.s2));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524100");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS3S3000000_11(aqS3S3000000_11.s0, aqS3S3000000_11.s1, aqS3S3000000_11.s2, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S3000000_11(String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}