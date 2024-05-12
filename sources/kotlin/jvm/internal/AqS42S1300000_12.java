package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.SVA;
import X.SVF;
import X.SVG;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;

/* loaded from: classes13.dex */
public class AqS42S1300000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AqS42S1300000_12 aqS42S1300000_12) {
        C34K c34k = (C34K) aqS42S1300000_12.l1;
        ECRouterInterceptor eCRouterInterceptor = (ECRouterInterceptor) aqS42S1300000_12.l2;
        RouteIntent routeIntent = (RouteIntent) aqS42S1300000_12.l3;
        String str = aqS42S1300000_12.s0;
        eCRouterInterceptor.getClass();
        c34k.element = ECRouterInterceptor.LIZJ(routeIntent, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS42S1300000_12 aqS42S1300000_12) {
        return SVF.LIZIZ(new AqS34S1300000_12((TTMStoreLink) aqS42S1300000_12.l1, aqS42S1300000_12.s0, (SVG) aqS42S1300000_12.l2, (SVA) aqS42S1300000_12.l3, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S1300000_12(C34K c34k, ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c34k;
        this.l2 = eCRouterInterceptor;
        this.l3 = routeIntent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S1300000_12(TTMStoreLink tTMStoreLink, String str, SVG svg, SVA sva, int i) {
        super(0);
        this.$t = i;
        this.l1 = tTMStoreLink;
        this.s0 = str;
        this.l2 = svg;
        this.l3 = sva;
    }
}
