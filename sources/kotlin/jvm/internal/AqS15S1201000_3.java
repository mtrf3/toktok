package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34G;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment;

/* loaded from: classes4.dex */
public class AqS15S1201000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AqS15S1201000_3 aqS15S1201000_3) {
        C34G.LIZJ(aqS15S1201000_3.s0, ((Bundle) aqS15S1201000_3.l1).getString(((LocationServicesFragment) aqS15S1201000_3.l2).LJLJJL), Integer.valueOf(aqS15S1201000_3.i3), new AqS169S0100000_3((LocationServicesFragment) aqS15S1201000_3.l2, 102));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S1201000_3 aqS15S1201000_3) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS15S1201000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS15S1201000_3.l2, "//setting/findcontact");
        buildRoute.withParam("enter_from", aqS15S1201000_3.s0);
        buildRoute.withParam("is_rec", aqS15S1201000_3.i3);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS15S1201000_3(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
        this.s0 = context;
        this.i3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S1201000_3(String str, Bundle bundle, LocationServicesFragment locationServicesFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = bundle;
        this.l2 = locationServicesFragment;
        this.i3 = i;
    }
}
