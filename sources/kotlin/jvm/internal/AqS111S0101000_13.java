package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.BZI;
import X.C28787BRn;
import X.C29306Beo;
import X.C30868C9o;
import X.C32541Pm;
import X.C32800Cu4;
import X.C76800UCe;
import X.C8E;
import X.F9J;
import X.InterfaceC10230ah;
import X.InterfaceC65784Pro;
import X.InterfaceC75266TgM;
import X.InterfaceC76622U5i;
import X.ORZ;
import X.U4R;
import X.U7T;
import X.ViewOnClickListenerC76430Tz8;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import android.content.SharedPreferences;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public class AqS111S0101000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS111S0101000_13 aqS111S0101000_13) {
        ((PriorityTaskDispatcher) aqS111S0101000_13.l0).LJLILLLLZI.remove(Integer.valueOf(aqS111S0101000_13.i1));
        ((PriorityTaskDispatcher) aqS111S0101000_13.l0).LJLJI.remove(aqS111S0101000_13.i1);
        int i = aqS111S0101000_13.i1;
        PriorityTaskDispatcher priorityTaskDispatcher = (PriorityTaskDispatcher) aqS111S0101000_13.l0;
        if (i == priorityTaskDispatcher.LJLIL) {
            priorityTaskDispatcher.gv0();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS111S0101000_13 aqS111S0101000_13) {
        int i;
        InterfaceC10230ah interfaceC10230ah = (InterfaceC10230ah) ORZ.LLFII(((C32541Pm) aqS111S0101000_13.l0).LJ().LIZIZ());
        boolean z = false;
        if (interfaceC10230ah != null) {
            i = interfaceC10230ah.getIndex();
        } else {
            i = 0;
        }
        if (i + 1 > ((C32541Pm) aqS111S0101000_13.l0).LJ().LIZ() - aqS111S0101000_13.i1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS111S0101000_13 aqS111S0101000_13) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scene=");
        LIZ.append(((U7T) aqS111S0101000_13.l0).LJFF);
        LIZ.append(" state machine state change to ");
        LIZ.append(aqS111S0101000_13.i1);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7T u7t = (U7T) aqS111S0101000_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        int i = aqS111S0101000_13.i1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LLI(i, u7t);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS111S0101000_13 aqS111S0101000_13) {
        ActivityC45651qj LJFF = ((C32800Cu4) aqS111S0101000_13.l0).LJFF();
        if (LJFF != null) {
            int i = aqS111S0101000_13.i1;
            SharedPreferences.Editor edit = F9J.LIZIZ(LJFF, 0, "gift_dialog_storage").edit();
            edit.putInt("sp_gift_page_type", i);
            edit.commit();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS111S0101000_13 aqS111S0101000_13) {
        C30868C9o.LIZJ(R.string.o_u);
        ListProtector.remove(((SubscriptionSpotlightFragment) aqS111S0101000_13.l0).xl().LJLILLLLZI, aqS111S0101000_13.i1);
        ((SubscriptionSpotlightFragment) aqS111S0101000_13.l0).xl().LJLZ();
        ((SubscriptionSpotlightFragment) aqS111S0101000_13.l0).Hl(true);
        ((SubscriptionSpotlightFragment) aqS111S0101000_13.l0).Il();
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = (SubscriptionSpotlightFragment) aqS111S0101000_13.l0;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_delete_confirm");
        subscriptionSpotlightFragment.Gl(LIZ);
        LIZ.LJIJJ(subscriptionSpotlightFragment.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS111S0101000_13 aqS111S0101000_13) {
        ((InterfaceC75266TgM) aqS111S0101000_13.l0).LJJII(aqS111S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS111S0101000_13 aqS111S0101000_13) {
        int i;
        if (aqS111S0101000_13.i1 == 0) {
            i = C8E.LIZLLL().LJIL().size();
        } else {
            i = ((ViewOnClickListenerC76430Tz8) aqS111S0101000_13.l0).LJLJLJ;
        }
        ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8 = (ViewOnClickListenerC76430Tz8) aqS111S0101000_13.l0;
        DataChannel dataChannel = viewOnClickListenerC76430Tz8.LJLILLLLZI;
        if (dataChannel == null || C29306Beo.LJIIJ(dataChannel)) {
            if (i >= 3) {
                viewOnClickListenerC76430Tz8.post(new ARunnableS49S0100000_13(viewOnClickListenerC76430Tz8, 256));
            } else {
                viewOnClickListenerC76430Tz8.LJLJJL();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(int i, ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = viewOnClickListenerC76430Tz8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(int i, U7T u7t, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = u7t;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(C32541Pm c32541Pm, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c32541Pm;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(C32800Cu4 c32800Cu4, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c32800Cu4;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(InterfaceC75266TgM interfaceC75266TgM, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC75266TgM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(PriorityTaskDispatcher priorityTaskDispatcher, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = priorityTaskDispatcher;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0101000_13(SubscriptionSpotlightFragment subscriptionSpotlightFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = subscriptionSpotlightFragment;
        this.i1 = i;
    }
}
