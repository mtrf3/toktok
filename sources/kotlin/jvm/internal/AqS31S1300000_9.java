package kotlin.jvm.internal;

import X.AbstractC54939LhH;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C54938LhG;
import X.C56179M3b;
import X.C76800UCe;
import X.C85258Xd8;
import X.InterfaceC55791Lv1;
import X.InterfaceC88472Yns;
import X.M78;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* loaded from: classes10.dex */
public class AqS31S1300000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS31S1300000_9 aqS31S1300000_9, Object obj) {
        ((Boolean) obj).booleanValue();
        ECommerceVideoService eCommerceVideoService = (ECommerceVideoService) aqS31S1300000_9.l1;
        InterfaceC55791Lv1 interfaceC55791Lv1 = (InterfaceC55791Lv1) aqS31S1300000_9.l2;
        Context context = ((View) aqS31S1300000_9.l3).getContext();
        o.LJIIIIZZ(context, "view.context");
        String str = aqS31S1300000_9.s0;
        eCommerceVideoService.getClass();
        ECommerceVideoService.LJIIJJI(interfaceC55791Lv1, context, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS31S1300000_9 aqS31S1300000_9, Object obj) {
        TokenCert with;
        M78 wrapper = (M78) obj;
        o.LJIIIZ(wrapper, "wrapper");
        AbstractC54939LhH abstractC54939LhH = (AbstractC54939LhH) aqS31S1300000_9.l1;
        String str = aqS31S1300000_9.s0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS31S1300000_9.l2;
        C85258Xd8 c85258Xd8 = (C85258Xd8) aqS31S1300000_9.l3;
        abstractC54939LhH.getClass();
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(wrapper, 800);
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
            with = TokenCert.Companion.with("bpea-fyp_GPS_permission_dialog_for_precise");
        } else {
            with = TokenCert.Companion.with("bpea-fyp_GPS_permission_dialog");
        }
        C56179M3b.LIZ.LJIJI("poi", "fyp_interaction", with, activityC45651qj, c85258Xd8, new C54938LhG(str, aqS159S0100000_9), null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S1300000_9(AbstractC54939LhH abstractC54939LhH, String str, ActivityC45651qj activityC45651qj, C85258Xd8 c85258Xd8, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC54939LhH;
        this.s0 = str;
        this.l2 = activityC45651qj;
        this.l3 = c85258Xd8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S1300000_9(ECommerceVideoService eCommerceVideoService, InterfaceC55791Lv1 interfaceC55791Lv1, View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = eCommerceVideoService;
        this.l2 = interfaceC55791Lv1;
        this.l3 = view;
        this.s0 = str;
    }
}
