package Y;

import X.C188727au;
import X.C39579Fg7;
import X.C44687HgJ;
import X.C59962Wy;
import X.C76800UCe;
import X.C79061V1d;
import X.FMX;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.duet.api.API;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACallableS0S1000000_1 implements Callable {
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
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        return Boolean.valueOf(C44687HgJ.LJIILJJIL(aCallableS0S1000000_1.s0));
    }

    public static final Object call$1(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        return Boolean.valueOf(C44687HgJ.LJIILJJIL(aCallableS0S1000000_1.s0));
    }

    public static final Object call$2(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        return Boolean.valueOf(C39579Fg7.LJIL(aCallableS0S1000000_1.s0));
    }

    public static final Object call$3(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        Object obj;
        String str = aCallableS0S1000000_1.s0;
        if (str == null || (obj = C59962Wy.LIZIZ().get(str)) == null) {
            return -1;
        }
        return obj;
    }

    public static final Object call$4(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        Object obj;
        String awemeId = aCallableS0S1000000_1.s0;
        o.LJIIIZ(awemeId, "awemeId");
        String str = Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(API.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        DuetDetailModel duetDetailModel = ((API) obj).getDuetDetailModel(awemeId).get();
        o.LJIIIIZZ(duetDetailModel, "api.getDuetDetailModel(awemeId).get()");
        return duetDetailModel;
    }

    public static final Object call$5(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("url", aCallableS0S1000000_1.s0);
        FMX.LJIIL("bemobi_free_data_recharge_request", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS0S1000000_1 aCallableS0S1000000_1) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("url", aCallableS0S1000000_1.s0);
        FMX.LJIIL("bemobi_show_buy_data_h5", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS0S1000000_1(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
