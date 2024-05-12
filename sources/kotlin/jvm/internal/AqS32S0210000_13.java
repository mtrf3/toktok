package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C4LX;
import X.C69607RTn;
import X.C75251Tg7;
import X.C76401Tyf;
import X.C76800UCe;
import X.InterfaceC76404Tyi;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.TRS;
import X.X1D;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes14.dex */
public class AqS32S0210000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS32S0210000_13 aqS32S0210000_13, Object obj) {
        C76401Tyf it = (C76401Tyf) obj;
        o.LJIIIZ(it, "it");
        if (!o.LJ(it.LJLILLLLZI, (InterfaceC76404Tyi) aqS32S0210000_13.l0) || aqS32S0210000_13.z2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchContentState , target = ");
            LIZ.append((InterfaceC76404Tyi) aqS32S0210000_13.l0);
            LIZ.append(' ');
            C0NB.LIZIZ("TitleViewModel", X1D.LIZIZ(LIZ));
            ((InteractionTitleViewModel) aqS32S0210000_13.l1).setState(new AqS179S0100000_13((InterfaceC76404Tyi) aqS32S0210000_13.l0, 52));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS32S0210000_13 aqS32S0210000_13, Object obj) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C69607RTn value = ((HotWordGiftViewModel) aqS32S0210000_13.l0).LJLLILLLL.getValue();
        if (value != null) {
            z = value.LIZLLL;
        } else {
            z = false;
        }
        ((InterfaceC88473Ynt) aqS32S0210000_13.l1).invoke(Boolean.valueOf(z), Boolean.valueOf(booleanValue), Boolean.valueOf(aqS32S0210000_13.z2));
        HotWordGiftViewModel hotWordGiftViewModel = (HotWordGiftViewModel) aqS32S0210000_13.l0;
        DataChannel dataChannel = hotWordGiftViewModel.LJLJJL;
        if (dataChannel != null) {
            dataChannel.jv0(hotWordGiftViewModel);
            return C76800UCe.LIZ;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public static final Object invoke$2(AqS32S0210000_13 aqS32S0210000_13, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        boolean z = aqS32S0210000_13.z2;
        DataChannel dataChannel = ((LiveWidget) aqS32S0210000_13.l0).dataChannel;
        o.LJIIIIZZ(dataChannel, "widget.dataChannel");
        hierarchyData.LIZ = new C75251Tg7(z, dataChannel, (TRS) aqS32S0210000_13.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0210000_13(InterfaceC76404Tyi interfaceC76404Tyi, boolean z, InteractionTitleViewModel interactionTitleViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC76404Tyi;
        this.z2 = z;
        this.l1 = interactionTitleViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0210000_13(HotWordGiftViewModel hotWordGiftViewModel, IDqS437S0100000_13 iDqS437S0100000_13, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = hotWordGiftViewModel;
        this.l1 = iDqS437S0100000_13;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0210000_13(boolean z, LiveWidget liveWidget, TRS trs, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = liveWidget;
        this.l1 = trs;
    }
}
