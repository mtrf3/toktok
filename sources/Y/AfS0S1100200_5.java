package Y;

import X.B83;
import X.BJM;
import X.BZI;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29619Bjr;
import X.C73943T0h;
import X.C74824TYe;
import X.C74947TbD;
import X.CJ5;
import X.InterfaceC64592gB;
import X.TV3;
import X.X1D;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS0S1100200_5 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public long j3;
    public Object l1;
    public String s0;

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

    public static final void accept$0(AfS0S1100200_5 afS0S1100200_5, Object obj) {
        String str = afS0S1100200_5.s0;
        long j = afS0S1100200_5.j2;
        long j2 = afS0S1100200_5.j3;
        Handler handler = (Handler) afS0S1100200_5.l1;
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_room_enter_interface_duration", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            BZI LIZ = C28787BRn.LIZ("livesdk_room_enter_interface_duration");
            LIZ.LIZJ(str);
            LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "status");
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "without_stream");
            LIZ.LJIJJ(String.valueOf(System.currentTimeMillis() - j2), "duration");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            } else {
                BJM bjm = BJM.LJLIL;
                LIZ.LJIJJ(BJM.LJIIJJI(), "log_pb");
                LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                LIZ.LJIJJ(bjm.LIZJ(), "live_type");
                LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
                LIZ.LJJIJ();
                LIZ.LJI();
                LIZ.LJJIIZI();
            }
        }
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }

    public static final void accept$1(AfS0S1100200_5 afS0S1100200_5, Object obj) {
        HashMap<String, String> hashMap;
        HashMap<String, String> hashMap2;
        FollowPair followPair = (FollowPair) obj;
        C73943T0h.LIZ().LIZIZ(new CJ5(followPair));
        User user = (User) afS0S1100200_5.l1;
        if (user != null) {
            long j = afS0S1100200_5.j2;
            String str = afS0S1100200_5.s0;
            long j2 = afS0S1100200_5.j3;
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            HashMap<String, String> hashMap3 = null;
            Long l = null;
            if (C74947TbD.LJIILLIIL(LJ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("live_anchor_c_");
                LIZ.append(C29619Bjr.LIZIZ(user));
                String LIZIZ = X1D.LIZIZ(LIZ);
                Long valueOf = Long.valueOf(j);
                if (followPair != null) {
                    hashMap2 = followPair.LJFF;
                } else {
                    hashMap2 = null;
                }
                C74824TYe.LJIJJ(LIZIZ, valueOf, hashMap2, str, null, null, 48);
                return;
            }
            User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
            if (TV3.LJIIIIZZ(LJ2)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("live_guest_c_");
                LIZ2.append(C29619Bjr.LIZIZ(user));
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                Long valueOf2 = Long.valueOf(j);
                if (followPair != null) {
                    hashMap = followPair.LJFF;
                } else {
                    hashMap = null;
                }
                if (o.LJ(str, "multiguest_liveshow_ranking")) {
                    l = Long.valueOf(j2);
                }
                C74824TYe.LJIJJ(LIZIZ2, valueOf2, hashMap, str, null, l, 16);
                return;
            }
            User LJ3 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ3, "getInstance().user().currentUserOpt");
            if (!TV3.LJI(LJ3)) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("live_audience_c_");
            LIZ3.append(C29619Bjr.LIZIZ(user));
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            Long valueOf3 = Long.valueOf(j);
            if (followPair != null) {
                hashMap3 = followPair.LJFF;
            }
            C74824TYe.LJIJJ(LIZIZ3, valueOf3, hashMap3, str, null, Long.valueOf(j2), 16);
        }
    }

    public AfS0S1100200_5(Object obj, long j, String str, long j2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j2 = j;
        this.s0 = str;
        this.j3 = j2;
    }
}
