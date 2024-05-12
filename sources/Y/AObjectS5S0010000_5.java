package Y;

import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetLandV2;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2;

/* loaded from: classes6.dex */
public class AObjectS5S0010000_5 implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AObjectS5S0010000_5 aObjectS5S0010000_5) {
        return new SwitchDefinitionTipsWidgetV2(aObjectS5S0010000_5.z0);
    }

    public static final Object invoke$1(AObjectS5S0010000_5 aObjectS5S0010000_5) {
        return new SwitchDefinitionTipsWidgetLandV2(aObjectS5S0010000_5.z0);
    }

    public AObjectS5S0010000_5(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
