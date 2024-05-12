package Y;

import X.C03090Af;
import X.C10K;
import X.C247279n9;
import X.C95J;
import X.InterfaceC247459nR;
import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public class ACallableS77S0101000_4 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS77S0101000_4 aCallableS77S0101000_4) {
        switch (aCallableS77S0101000_4.i1) {
            case 0:
                return Boolean.valueOf(AVExternalServiceImpl.LIZ().publishService().checkIfCache((String) ((Serializable) aCallableS77S0101000_4.l0)));
            default:
                Throwable th = (Throwable) ((Serializable) aCallableS77S0101000_4.l0);
                if (th instanceof Exception) {
                    throw th;
                }
                StringBuilder LIZ = X1D.LIZ();
                throw new IllegalStateException(C03090Af.LIZJ(LIZ, "AwemeModel.fetchListRx: ", th, LIZ));
        }
    }

    public static final Object call$1(ACallableS77S0101000_4 aCallableS77S0101000_4) {
        INetworkApi LJFF;
        String str;
        C10K requestOnNotificationAction;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            C247279n9 c247279n9 = (C247279n9) aCallableS77S0101000_4.l0;
            ReferralFeedBanner referralFeedBanner = c247279n9.LJIJ;
            if (referralFeedBanner == null || (str = referralFeedBanner.notificationId) == null) {
                str = "";
            }
            requestOnNotificationAction = LJFF.requestOnNotificationAction(str, aCallableS77S0101000_4.i1, "feed_banner", c247279n9.LJIIIIZZ(), ((C247279n9) aCallableS77S0101000_4.l0).LJI(), 0);
            return requestOnNotificationAction;
        }
        return null;
    }

    public static final Object call$2(ACallableS77S0101000_4 aCallableS77S0101000_4) {
        INetworkApi LJFF;
        int i;
        C10K requestOnNotificationAction;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            String str = (String) ((Map) aCallableS77S0101000_4.l0).get("notification_id");
            if (str == null) {
                str = "";
            }
            int i2 = aCallableS77S0101000_4.i1;
            String str2 = (String) ((Map) aCallableS77S0101000_4.l0).get("classification");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) ((Map) aCallableS77S0101000_4.l0).get("material_id");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) ((Map) aCallableS77S0101000_4.l0).get("count");
            if (str4 != null) {
                i = CastIntegerProtector.parseInt(str4);
            } else {
                i = 0;
            }
            requestOnNotificationAction = LJFF.requestOnNotificationAction(str, i2, str2, str3, i, 0);
            return requestOnNotificationAction;
        }
        return null;
    }

    public ACallableS77S0101000_4(Object obj, int i, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
