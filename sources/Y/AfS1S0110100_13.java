package Y;

import X.C0NB;
import X.C65618Pp8;
import X.C75516TkO;
import X.C75622Tm6;
import X.C76258TwM;
import X.C76265TwT;
import X.C76272Twa;
import X.C76324TxQ;
import X.C8E;
import X.InterfaceC64592gB;
import X.U4R;
import X.U70;
import X.U7T;
import X.U7W;
import X.U7Z;
import X.X1D;
import com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View;
import com.bytedance.android.live.liveinteract.multimatch.event.TwoMatchStartByOpenRequest;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS1S0110100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

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

    public static final void accept$0(AfS1S0110100_13 afS1S0110100_13, Object obj) {
        if (((C76258TwM) afS1S0110100_13.l0).LJLILLLLZI == 0) {
            return;
        }
        boolean z = afS1S0110100_13.z1;
        JSONObject jSONObject = new JSONObject();
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            C75622Tm6.LJIILLIIL("component_identify_will_start", jSONObject, false, z);
        }
        C76272Twa.LJJJJ(afS1S0110100_13.j2, "normal", afS1S0110100_13.z1);
        C76324TxQ.LIZJ();
        if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
            ((C76258TwM) afS1S0110100_13.l0).LJLJJI.qv0(TwoMatchStartByOpenRequest.class, Boolean.valueOf(afS1S0110100_13.z1));
        }
        C0NB.LJIIIZ("InteractBattleTAG", "open, success");
    }

    public static final void accept$1(AfS1S0110100_13 afS1S0110100_13, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        if (((C76258TwM) afS1S0110100_13.l0).LJLILLLLZI == 0) {
            return;
        }
        C76272Twa.LJJJ(afS1S0110100_13.j2, -1L, "normal", th, afS1S0110100_13.z1);
        C0NB.LJIIIZ("InteractBattleTAG", "open, success");
        if (afS1S0110100_13.z1) {
            i = 2;
        } else {
            i = 1;
        }
        C76265TwT.LJII(i, "open_failed");
        C76324TxQ.LIZJ();
        C76258TwM c76258TwM = (C76258TwM) afS1S0110100_13.l0;
        o.LJI(th);
        C0NB.LJIIJ(6, c76258TwM.LJLIL, th.getStackTrace());
        ((InteractPkBeInvitedContract$View) ((C76258TwM) afS1S0110100_13.l0).LJLILLLLZI).wl(th);
    }

    public static final void accept$2(AfS1S0110100_13 afS1S0110100_13, Object obj) {
        LinkUser linkUser;
        long j;
        U7Z u7z;
        U7T u7t = ((U70) afS1S0110100_13.l0).LIZIZ;
        if (u7t != null && (u7z = u7t.LJIIJJI) != null) {
            linkUser = u7z.LJIJI(afS1S0110100_13.j2);
        } else {
            linkUser = null;
        }
        if (linkUser == null) {
            U4R.LIZIZ("KickOutUserManager", "startCountdown can not find link user to kick out");
            return;
        }
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        Long roomId = linkUser.getRoomId();
        long j2 = -1;
        if (roomId != null) {
            j = roomId.longValue();
        } else {
            j = -1;
        }
        builder.setRoomId(j);
        Long userId = linkUser.getUserId();
        if (userId != null) {
            j2 = userId.longValue();
        }
        builder.setUserId(j2);
        String linkMicId = linkUser.getLinkMicId();
        String str = "";
        if (linkMicId == null) {
            linkMicId = "";
        }
        builder.setLinkMicId(linkMicId);
        LiveRoomUser build = builder.build();
        if (build.getUserId() < 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startCountdown There is an exception in live room user uid room_id=");
            LIZ.append(linkUser.getRoomId());
            LIZ.append('.');
            U4R.LIZIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
            return;
        }
        if (afS1S0110100_13.z1) {
            KickOutData.Builder builder2 = new KickOutData.Builder(build);
            builder2.setKickOutReason(1);
            KickOutData build2 = builder2.build();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startCountdown kick out user: ");
            LIZ2.append(build);
            LIZ2.append(", data: ");
            LIZ2.append(build2);
            LIZ2.append(", room_id=");
            LIZ2.append(linkUser.getRoomId());
            U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ2));
            U7T u7t2 = ((U70) afS1S0110100_13.l0).LIZIZ;
            if (u7t2 != null) {
                u7t2.LLLLZIL(build2, null);
            }
        }
        ((U70) afS1S0110100_13.l0).LIZ.remove(Long.valueOf(afS1S0110100_13.j2));
        C75516TkO.LIZ.LIZ(300, "kick out liveRoomUser", C65618Pp8.of("liveRoomUser", build.toString()));
        U7T u7t3 = ((U70) afS1S0110100_13.l0).LIZIZ;
        if (u7t3 == null) {
            return;
        }
        U7W u7w = u7t3.LJJIII;
        String linkMicId2 = linkUser.getLinkMicId();
        if (linkMicId2 != null) {
            str = linkMicId2;
        }
        u7w.LJIIJ(str, u7t3, true, -1L, -1L, "");
    }

    public AfS1S0110100_13(Object obj, boolean z, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.j2 = j;
    }
}
