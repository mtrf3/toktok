package Y;

import X.B98;
import X.B99;
import X.C15380j0;
import X.C29306Beo;
import X.C30868C9o;
import X.C30966CDi;
import X.CDG;
import android.os.Handler;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS0S2110000_5 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (this.z3) {
            SwitchDefinitionTipsWidget switchDefinitionTipsWidget = (SwitchDefinitionTipsWidget) this.l2;
            switchDefinitionTipsWidget.LJLJJI = new B98(this.s0, this.s1, switchDefinitionTipsWidget.LJLJI, switchDefinitionTipsWidget.dataChannel, switchDefinitionTipsWidget.LJLJJL);
            SwitchDefinitionTipsWidget switchDefinitionTipsWidget2 = (SwitchDefinitionTipsWidget) this.l2;
            Handler handler = switchDefinitionTipsWidget2.LJLILLLLZI;
            B98 b98 = switchDefinitionTipsWidget2.LJLJJI;
            o.LJI(b98);
            handler.post(b98);
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ovo));
    }

    public final void LIZ$1() {
        if (this.z3) {
            SwitchDefinitionTipsWidgetV2 switchDefinitionTipsWidgetV2 = (SwitchDefinitionTipsWidgetV2) this.l2;
            switchDefinitionTipsWidgetV2.LJLJJI = new B99(this.s0, this.s1, switchDefinitionTipsWidgetV2.LJLJI, switchDefinitionTipsWidgetV2.dataChannel, switchDefinitionTipsWidgetV2.LJLJJL);
            SwitchDefinitionTipsWidgetV2 switchDefinitionTipsWidgetV22 = (SwitchDefinitionTipsWidgetV2) this.l2;
            Handler handler = switchDefinitionTipsWidgetV22.LJLILLLLZI;
            B99 b99 = switchDefinitionTipsWidgetV22.LJLJJI;
            if (b99 != null) {
                handler.post(b99);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ovo));
    }

    public final void LIZ$2() {
        CDG cdg = ((SubscriptionPrivilegeDetailFragment) this.l2).LJLLI;
        String str = this.s0;
        String str2 = this.s1;
        boolean z = this.z3;
        cdg.getClass();
        if (C29306Beo.LJIJJLI(str)) {
            if (str == null) {
                str = "";
            }
            cdg.LJLJJI = str;
        }
        if (C29306Beo.LJIJJLI(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            cdg.LJLJJL = str2;
        }
        cdg.LJLJJLL = z;
        int intValue = ((Number) C29306Beo.LJ(C30966CDi.LJLIL, ((SubscriptionPrivilegeDetailFragment) this.l2).LJLLJ).getSecond()).intValue();
        if (intValue >= 0) {
            ((SubscriptionPrivilegeDetailFragment) this.l2).LJLLI.notifyItemChanged(intValue);
        }
    }

    public static final void run$0(ARunnableS0S2110000_5 aRunnableS0S2110000_5) {
        boolean LIZ;
        try {
            aRunnableS0S2110000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2110000_5 aRunnableS0S2110000_5) {
        boolean LIZ;
        try {
            aRunnableS0S2110000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S2110000_5 aRunnableS0S2110000_5) {
        boolean LIZ;
        try {
            aRunnableS0S2110000_5.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2110000_5(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, String str, String str2, int i) {
        this.$t = i;
        this.l2 = subscriptionPrivilegeDetailFragment;
        this.s0 = str;
        this.s1 = str2;
        this.z3 = false;
    }

    public ARunnableS0S2110000_5(boolean z, Object obj, String str, String str2, int i) {
        this.$t = i;
        this.z3 = z;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
