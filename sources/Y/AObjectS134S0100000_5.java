package Y;

import X.BCI;
import X.C31510CYg;
import X.C76800UCe;
import X.CQK;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;

/* loaded from: classes6.dex */
public class AObjectS134S0100000_5 implements InterfaceC65784Pro {
    public final int $t;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        super/*com.bytedance.android.live.BaseDialogFragmentV2*/.dismissAllowingStateLoss();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        return ((ITreasureBoxService) aObjectS134S0100000_5.l0).LI();
    }

    public static final Object invoke$2(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        return ((PortraitAudienceInteractionFragment) aObjectS134S0100000_5.l0).mDataChannel.kv0(BCI.class);
    }

    public static final Object invoke$3(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        ((PublicScreenWidget) aObjectS134S0100000_5.l0).LLIIII.LIZJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        ((CQK) aObjectS134S0100000_5.l0).LLIIIL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS134S0100000_5 aObjectS134S0100000_5) {
        return new RankEntranceWidget((C31510CYg) aObjectS134S0100000_5.l0, null);
    }

    public AObjectS134S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
