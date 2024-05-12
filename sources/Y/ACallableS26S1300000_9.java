package Y;

import X.AbstractC247499nV;
import X.C10K;
import X.C1E4;
import X.C62822Ol8;
import X.C76800UCe;
import X.C76L;
import X.C95J;
import X.InterfaceC247459nR;
import X.MC8;
import X.MC9;
import X.MCA;
import X.MCC;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.ReferralWidgetResponse;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACallableS26S1300000_9 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS26S1300000_9 aCallableS26S1300000_9) {
        TabChangeManager tabChangeManager = (TabChangeManager) aCallableS26S1300000_9.l1;
        Class cls = (Class) aCallableS26S1300000_9.l2;
        tabChangeManager.gv0((Bundle) aCallableS26S1300000_9.l3, aCallableS26S1300000_9.s0, cls);
        return null;
    }

    public static final Object call$1(ACallableS26S1300000_9 aCallableS26S1300000_9) {
        boolean z;
        AbstractC247499nV abstractC247499nV;
        INetworkApi LJFF;
        C76L<ReferralWidgetResponse> referralAppWidgetInfo;
        String str = "";
        MCC mcc = (MCC) C95J.LIZ(1000);
        if (mcc != null) {
            z = mcc.LJ();
        } else {
            z = false;
        }
        ReferralWidgetResponse referralWidgetResponse = null;
        if (!z || ((abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0)) != null && abstractC247499nV.LJIILJJIL())) {
            C10K.LIZIZ(new MC8((Context) aCallableS26S1300000_9.l1, ((Integer) aCallableS26S1300000_9.l2).intValue(), aCallableS26S1300000_9.s0, (int[]) aCallableS26S1300000_9.l3), C10K.LJIIIIZZ, null);
        } else {
            try {
                String widgetTypeName = aCallableS26S1300000_9.s0;
                o.LJIIIZ(widgetTypeName, "widgetTypeName");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("request_type", "referral");
                linkedHashMap.put("widget_type", widgetTypeName);
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    interfaceC247459nR.LIZIZ("widget_request", linkedHashMap);
                }
                C62822Ol8 c62822Ol8 = MCA.LIZ;
                if (System.currentTimeMillis() - ((Keva) c62822Ol8.getValue()).getLong("referral_widget_request_time", 0L) >= 300000) {
                    InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
                    if (interfaceC247459nR2 != null && (LJFF = interfaceC247459nR2.LJFF()) != null && (referralAppWidgetInfo = LJFF.getReferralAppWidgetInfo()) != null) {
                        referralWidgetResponse = referralAppWidgetInfo.get();
                    }
                    ((Keva) c62822Ol8.getValue()).storeLong("referral_widget_request_time", System.currentTimeMillis());
                    MCA.LIZ((Context) aCallableS26S1300000_9.l1, ((Integer) aCallableS26S1300000_9.l2).intValue(), aCallableS26S1300000_9.s0, (int[]) aCallableS26S1300000_9.l3, referralWidgetResponse);
                    MC9.LIZIZ(1, 0, aCallableS26S1300000_9.s0, "");
                }
            } catch (Exception e) {
                String str2 = aCallableS26S1300000_9.s0;
                int LJII = C1E4.LJII(e);
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                MC9.LIZIZ(0, LJII, str2, str);
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS26S1300000_9(Context context, Integer num, int[] iArr, int i) {
        this.$t = i;
        this.l1 = context;
        this.l2 = num;
        this.s0 = "IncentiveWidget";
        this.l3 = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS26S1300000_9(TabChangeManager tabChangeManager, TabChangeManager tabChangeManager2, Class<?> cls, String str, Bundle bundle) {
        this.$t = bundle;
        this.l1 = tabChangeManager;
        this.l2 = tabChangeManager2;
        this.s0 = cls;
        this.l3 = str;
    }
}
