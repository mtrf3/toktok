package Y;

import X.C0NB;
import X.C75650TmY;
import X.C75878TqE;
import X.EnumC75636TmK;
import X.EnumC75660Tmi;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class AfS4S0010000_13 implements InterfaceC64592gB {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS4S0010000_13(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final void accept$0(AfS4S0010000_13 afS4S0010000_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        C75878TqE c75878TqE = new C75878TqE();
        int value = EnumC75660Tmi.ACTION_CANCEL.getValue();
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        c75878TqE.LJJLIIIJILLIZJL(value, str);
        if (afS4S0010000_13.z0) {
            C75650TmY.LIZ.LIZLLL();
            DataChannel dataChannel = C75650TmY.LIZIZ;
            if (dataChannel != null) {
                dataChannel.rv0(LinkerStateChannel.class, EnumC75636TmK.DISABLED);
            }
        } else {
            C75650TmY.LJ();
        }
        C0NB.LIZIZ("TopicPairManager", "cancel pair success");
    }

    public static final void accept$1(AfS4S0010000_13 afS4S0010000_13, Object obj) {
        InterfaceC30442Bx8.LLIIIJ.LIZ(Boolean.valueOf(afS4S0010000_13.z0));
    }

    public static final void accept$2(AfS4S0010000_13 afS4S0010000_13, Object obj) {
        InterfaceC30442Bx8.LLIIIILZ.LIZ(Boolean.valueOf(afS4S0010000_13.z0));
    }
}
