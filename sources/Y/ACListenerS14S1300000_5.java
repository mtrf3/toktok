package Y;

import X.BIR;
import X.BZI;
import X.C15380j0;
import X.C1EW;
import X.C28432BDw;
import X.C28433BDx;
import X.C28787BRn;
import X.C31847Ceh;
import X.C41071jL;
import X.Q7L;
import X.RunnableC28434BDy;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0200000_5;

/* loaded from: classes6.dex */
public class ACListenerS14S1300000_5 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS14S1300000_5 aCListenerS14S1300000_5, View view) {
        Context context = (Context) aCListenerS14S1300000_5.l1;
        String anchorSubOnlyLiveFaqPopup = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchorSubOnlyLiveFaqPopup();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("height", String.valueOf((int) (C15380j0.LJIJ(C15380j0.LJIIJJI()) * 0.6d)));
        linkedHashMap.put("transition_animation", "bottom");
        C31847Ceh.LJIIIIZZ(context, anchorSubOnlyLiveFaqPopup, linkedHashMap);
        BIR bir = (BIR) aCListenerS14S1300000_5.l2;
        DataChannel dataChannel = (DataChannel) aCListenerS14S1300000_5.l3;
        String str = aCListenerS14S1300000_5.s0;
        bir.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_subscriber_only_live_faq_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$1(ACListenerS14S1300000_5 aCListenerS14S1300000_5, View view) {
        long j;
        C28433BDx c28433BDx = (C28433BDx) aCListenerS14S1300000_5.l1;
        boolean z = false;
        c28433BDx.LIZLLL((C41071jL) aCListenerS14S1300000_5.l2, false, 2, new AqS152S0200000_5(c28433BDx, (Room) aCListenerS14S1300000_5.l3, 39));
        long onLiveSwitchFrequencyMin = LiveSubOnlyChatConfig.INSTANCE.onLiveSwitchFrequencyMin() * 60 * 1000;
        C28433BDx.LIZJ = SystemClock.elapsedRealtime() + onLiveSwitchFrequencyMin;
        C28433BDx c28433BDx2 = (C28433BDx) aCListenerS14S1300000_5.l1;
        C41071jL c41071jL = (C41071jL) aCListenerS14S1300000_5.l2;
        c28433BDx2.getClass();
        if (c41071jL != null) {
            c41071jL.postDelayed(new RunnableC28434BDy(c28433BDx2, c41071jL, null), onLiveSwitchFrequencyMin);
        }
        C28433BDx c28433BDx3 = (C28433BDx) aCListenerS14S1300000_5.l1;
        C41071jL c41071jL2 = (C41071jL) aCListenerS14S1300000_5.l2;
        Room room = (Room) aCListenerS14S1300000_5.l3;
        String str = aCListenerS14S1300000_5.s0;
        c28433BDx3.getClass();
        if (c41071jL2 != null) {
            z = c41071jL2.isChecked();
        }
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) Q7L.LIZIZ(RoomSwitchApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(roomSwitchApi.updateSwitch(j, 7, z)).LJJJLIIL(new C28432BDw(room, z, c28433BDx3, str, c41071jL2), new AfS17S0210000_5(c41071jL2, c28433BDx3, z, 5));
    }

    public ACListenerS14S1300000_5(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
