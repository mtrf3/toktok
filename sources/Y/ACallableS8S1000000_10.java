package Y;

import X.C61604OFs;
import X.C61606OFu;
import X.C64797Pbt;
import X.C77119UOl;
import X.X1D;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import com.ss.android.ugc.aweme.brdatagift.api.ICarrierRequestApi;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.setting.api.RestrictApi;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public class ACallableS8S1000000_10 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S1000000_10 aCallableS8S1000000_10) {
        if (C77119UOl.LJIILLIIL(aCallableS8S1000000_10.s0)) {
            try {
                return DeepLinkServiceImpl.LIZ().LJIJJLI(aCallableS8S1000000_10.s0);
            } catch (Exception unused) {
                return "";
            }
        }
        return aCallableS8S1000000_10.s0;
    }

    public static final Object call$1(ACallableS8S1000000_10 aCallableS8S1000000_10) {
        return RestrictApi.LIZIZ(aCallableS8S1000000_10.s0);
    }

    public static final Object call$2(ACallableS8S1000000_10 aCallableS8S1000000_10) {
        return RestrictApi.LIZJ(aCallableS8S1000000_10.s0);
    }

    public static final Object call$3(ACallableS8S1000000_10 aCallableS8S1000000_10) {
        return RestrictApi.LIZ(aCallableS8S1000000_10.s0);
    }

    public static final Object call$4(ACallableS8S1000000_10 aCallableS8S1000000_10) {
        C61604OFs c61604OFs;
        try {
            C61606OFu c61606OFu = ICarrierRequestApi.LIZ;
            String str = aCallableS8S1000000_10.s0;
            c61606OFu.getClass();
            C64797Pbt<Void> execute = C61606OFu.LIZ(str).chargeBemobiDataGift(aCallableS8S1000000_10.s0, "tik-tok", "custom").execute();
            if (execute.LIZIZ()) {
                int i = execute.LIZ.LIZIZ;
                if (i == 200) {
                    c61604OFs = new C61604OFs(i, new BaseBemobiResponse(null, null, null, null, null, 31, null), null, "unknown");
                } else {
                    BaseBemobiResponse baseBemobiResponse = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("response success ,but not 200, is ");
                    LIZ.append(i);
                    c61604OFs = new C61604OFs(i, baseBemobiResponse, new Exception(X1D.LIZIZ(LIZ)), "unknown");
                }
            } else {
                c61604OFs = new C61604OFs(-998, new BaseBemobiResponse(null, null, null, null, null, 31, null), new Exception("response is not successful"), "unknown");
            }
            return c61604OFs;
        } catch (Exception e) {
            return new C61604OFs(-999, new BaseBemobiResponse(null, null, null, null, null, 31, null), e, "unknown");
        }
    }

    public ACallableS8S1000000_10(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
