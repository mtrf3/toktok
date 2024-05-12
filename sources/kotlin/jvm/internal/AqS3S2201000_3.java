package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* loaded from: classes4.dex */
public class AqS3S2201000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS3S2201000_3 aqS3S2201000_3) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS3S2201000_3.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS3S2201000_3.l3, "//privacy/suggest_account");
        buildRoute.withParam("enter_from", aqS3S2201000_3.s0);
        String str = aqS3S2201000_3.s1;
        if (str == null) {
            str = "";
        }
        buildRoute.withParam("previous_page", str);
        buildRoute.withParam("is_rec", aqS3S2201000_3.i4);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S2201000_3 aqS3S2201000_3) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS3S2201000_3.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS3S2201000_3.l3, "//privacy/suggest_account");
        buildRoute.withParam("enter_from", aqS3S2201000_3.s0);
        String str = aqS3S2201000_3.s1;
        if (str == null) {
            str = "";
        }
        buildRoute.withParam("previous_page", str);
        buildRoute.withParam("is_rec", aqS3S2201000_3.i4);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S2201000_3(int i, Context context, String str, String str2, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = interfaceC65784Pro;
        this.l3 = context;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
    }
}
