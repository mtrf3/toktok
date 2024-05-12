package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BZI;
import X.C11280cO;
import X.C113554cx;
import X.C1DJ;
import X.C28787BRn;
import X.C73981T1t;
import X.C76800UCe;
import X.C76876UFc;
import X.C76878UFe;
import X.C76883UFj;
import X.C93833mF;
import X.CN1;
import X.EnumC76880UFg;
import X.InterfaceC11360cW;
import X.InterfaceC11470ch;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.UFX;
import X.UG0;
import X.V6O;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS12S0401000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AqS12S0401000_13 aqS12S0401000_13, Object obj) {
        InterfaceC11360cW LazyVerticalGrid = (InterfaceC11360cW) obj;
        o.LJIIIZ(LazyVerticalGrid, "$this$LazyVerticalGrid");
        ((InterfaceC88471Ynr) aqS12S0401000_13.l0).invoke(LazyVerticalGrid, (V6O) aqS12S0401000_13.l1);
        LazyVerticalGrid.LIZ(null, (InterfaceC88472Yns) aqS12S0401000_13.l2, null, C1DJ.LJFF(new C73981T1t((InterfaceC88473Ynt) aqS12S0401000_13.l3, (V6O) aqS12S0401000_13.l1, aqS12S0401000_13.i4), 1268088546, true));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S0401000_13 aqS12S0401000_13, Object it) {
        o.LJIIIZ(it, "it");
        Bitmap LIZ = ((C76876UFc) aqS12S0401000_13.l0).LIZ();
        if (LIZ != null) {
            FragmentManager fragmentManager = (FragmentManager) aqS12S0401000_13.l1;
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = (SubscriptionSpotlightFragment) aqS12S0401000_13.l2;
            String enterFrom = subscriptionSpotlightFragment.LJLIL;
            UFX ufx = new UFX((List) aqS12S0401000_13.l3, aqS12S0401000_13.i4, subscriptionSpotlightFragment);
            o.LJIIIZ(fragmentManager, "fragmentManager");
            o.LJIIIZ(enterFrom, "enterFrom");
            IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            EnumC76880UFg enumC76880UFg = EnumC76880UFg.NO_CHANGE;
            UG0 ug0 = UG0.BITMAP;
            C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
            C76878UFe.Companion.getClass();
            iHostSubscription.RX(new C76883UFj(fragmentManager, enumC76880UFg, ug0, 2, LJJJLIIL, C76878UFe.DEFAULT, false, LIZ, null, null, ufx, 1856), enterFrom, "highlight_manage");
            SubscriptionSpotlightFragment subscriptionSpotlightFragment2 = (SubscriptionSpotlightFragment) aqS12S0401000_13.l2;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_edit_click");
            subscriptionSpotlightFragment2.Gl(LIZ2);
            LIZ2.LJIJJ(subscriptionSpotlightFragment2.LJLIL, "show_entrance");
            LIZ2.LJJIIJZLJL();
            SubscriptionSpotlightFragment subscriptionSpotlightFragment3 = (SubscriptionSpotlightFragment) aqS12S0401000_13.l2;
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_edit_page_show");
            subscriptionSpotlightFragment3.Gl(LIZ3);
            LIZ3.LJIJJ(subscriptionSpotlightFragment3.LJLIL, "show_entrance");
            LIZ3.LJIJJ("highlight_manage", "click_position");
            LIZ3.LJIJJ(Integer.valueOf(((SubscriptionSpotlightFragment) aqS12S0401000_13.l2).xl().LJLILLLLZI.size()), "picture_quantity");
            LIZ3.LJJIIJZLJL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS12S0401000_13(C76876UFc c76876UFc, C76876UFc c76876UFc2, FragmentManager fragmentManager, SubscriptionSpotlightFragment subscriptionSpotlightFragment, List<C76876UFc> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76876UFc;
        this.l1 = c76876UFc2;
        this.l2 = fragmentManager;
        this.l3 = subscriptionSpotlightFragment;
        this.i4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS12S0401000_13(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC11360cW, ? super V6O<T>, C76800UCe> interfaceC88471Ynr2, V6O<T> v6o, InterfaceC88472Yns<? super InterfaceC11470ch, C11280cO> interfaceC88472Yns, InterfaceC88473Ynt<? super V6O<T>, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = v6o;
        this.l3 = interfaceC88472Yns;
        this.i4 = interfaceC88473Ynt;
    }
}
