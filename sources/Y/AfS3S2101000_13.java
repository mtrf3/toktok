package Y;

import X.C0NB;
import X.C32014ChO;
import X.C74738TUw;
import X.InterfaceC64592gB;
import X.InterfaceC88473Ynt;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class AfS3S2101000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS3S2101000_13 afS3S2101000_13, Object obj) {
        C32014ChO.LIZJ(C74738TUw.LIZJ(118), "guestRankSetting has exception:", ((Throwable) obj).getMessage());
        ((InterfaceC88473Ynt) afS3S2101000_13.l2).invoke(afS3S2101000_13.s0, afS3S2101000_13.s1, Integer.valueOf(afS3S2101000_13.i3));
    }

    public static final void accept$1(AfS3S2101000_13 afS3S2101000_13, Object obj) {
        boolean z;
        GetGuestSettingResponse.ResponseData responseData = ((GetGuestSettingResponse) obj).data;
        if (responseData != null && responseData.rankListShowAction == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has chosen, so run regular logic");
            C74738TUw.LJI((DataChannel) afS3S2101000_13.l2, false, afS3S2101000_13.s0, afS3S2101000_13.i3);
        } else {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has not chosen, so show leave rank dialog");
            C74738TUw.LJIIIIZZ(afS3S2101000_13.s1, afS3S2101000_13.i3, (DataChannel) afS3S2101000_13.l2, false, 24);
        }
    }

    public AfS3S2101000_13(InterfaceC88473Ynt interfaceC88473Ynt, String str, int i, int i2) {
        this.$t = i2;
        this.l2 = interfaceC88473Ynt;
        this.s0 = str;
        this.s1 = "leave_normally";
        this.i3 = i;
    }

    public AfS3S2101000_13(int i, DataChannel dataChannel, String str, String str2, int i2) {
        this.$t = i2;
        this.l2 = dataChannel;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
    }
}
