package Y;

import X.C76800UCe;
import X.GGS;
import X.GGT;
import X.InterfaceC65784Pro;
import X.RunnableC35819E3z;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes7.dex */
public class AObjectS51S0101000_6 implements InterfaceC65784Pro {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS51S0101000_6 aObjectS51S0101000_6) {
        switch (aObjectS51S0101000_6.i1) {
            case 0:
                ((GGT) aObjectS51S0101000_6.l0).getClass();
                return GGS.LIZJ;
            default:
                ((GGT) aObjectS51S0101000_6.l0).getClass();
                return GGS.LJI;
        }
    }

    public static final Object invoke$1(AObjectS51S0101000_6 aObjectS51S0101000_6) {
        switch (aObjectS51S0101000_6.i1) {
            case 0:
                DataChannel dataChannel = ((MultiGuestPreviewFragment) aObjectS51S0101000_6.l0).LLILZ;
                if (dataChannel != null) {
                    dataChannel.pv0(GuestReplyAnchorEvent.class);
                }
                return C76800UCe.LIZ;
            default:
                ((RunnableC35819E3z) aObjectS51S0101000_6.l0).LJLIL.run();
                return null;
        }
    }

    public AObjectS51S0101000_6(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
