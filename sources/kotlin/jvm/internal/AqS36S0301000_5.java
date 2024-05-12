package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29135Bc3;
import X.C29136Bc4;
import X.C76800UCe;
import X.EnumC30836C8i;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;

/* loaded from: classes6.dex */
public class AqS36S0301000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AqS36S0301000_5 aqS36S0301000_5) {
        Activity activity = (Activity) aqS36S0301000_5.l0;
        EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C29135Bc3(activity, aqS36S0301000_5.i3, (InterfaceC88472Yns) aqS36S0301000_5.l1, (InterfaceC65784Pro) aqS36S0301000_5.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS36S0301000_5 aqS36S0301000_5) {
        Activity activity = (Activity) aqS36S0301000_5.l0;
        EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C29136Bc4(activity, aqS36S0301000_5.i3, (InterfaceC88472Yns) aqS36S0301000_5.l1, (InterfaceC65784Pro) aqS36S0301000_5.l2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS36S0301000_5(Activity activity, Activity activity2, int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = activity;
        this.i3 = activity2;
        this.l1 = i;
        this.l2 = interfaceC88472Yns;
    }
}
