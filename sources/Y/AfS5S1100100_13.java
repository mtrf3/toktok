package Y;

import X.BPP;
import X.BZI;
import X.C06530Nl;
import X.C28787BRn;
import X.C31012CFc;
import X.C74824TYe;
import X.C74842TYw;
import X.C75297Tgr;
import X.InterfaceC31336CRo;
import X.InterfaceC64592gB;
import X.OSZ;
import X.TUU;
import X.U7T;
import X.U9N;
import X.UA9;
import X.UC0;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyInviteContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.RechargeResp;

/* loaded from: classes14.dex */
public class AfS5S1100100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
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
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        Context context;
        Throwable th = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS5S1100100_13.j2, "update_setting", afS5S1100100_13.s0, th);
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) ((C74842TYw) afS5S1100100_13.l1).mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        BPP.LIZLLL(context, th, R.string.sp2);
    }

    public static final void accept$1(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7T u7t = (U7T) afS5S1100100_13.l1;
        long j = afS5S1100100_13.j2;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ osz = new OSZ(0L, "");
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        UA9.LJJIJIIJIL(u7t, j, LIZIZ, osz, str, afS5S1100100_13.s0);
    }

    public static final void accept$2(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJJIJIIJIL((U7T) afS5S1100100_13.l1, afS5S1100100_13.j2, C31012CFc.LIZIZ(), UC0.LJIILL(th), UC0.LJIJ(th), afS5S1100100_13.s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        RechargeResp rechargeResp;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (rechargeResp = (RechargeResp) baseResponse.data) != null) {
            U7T u7t = (U7T) afS5S1100100_13.l1;
            long j = afS5S1100100_13.j2;
            String str = afS5S1100100_13.s0;
            if (!u7t.LJJIJ.containsKey(rechargeResp.targetLinkmicId)) {
                u7t.LJJIJ.put(rechargeResp.targetLinkmicId, U9N.COMPENSATION);
                BZI LIZ = C28787BRn.LIZ("livesdk_compensate_lost_im");
                C06530Nl.LIZLLL(LIZ, "reply", "message_type", j, "user_id");
                LIZ.LJIJJ(Long.valueOf(u7t.LJIL), "room_id");
                LIZ.LJIJJ(Long.valueOf(u7t.LJI), "channel_id");
                LIZ.LJIJJ(str, "link_mic_id");
                LIZ.LJJIIJZLJL();
                LinkLayerMessage linkLayerMessage = new LinkLayerMessage(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
                ReplyInviteContent replyInviteContent = new ReplyInviteContent(null, 0, null, null, null, 31, null);
                Player player = new Player(0L, 0L, 3, null);
                player.roomId = u7t.LJIL;
                player.uid = j;
                replyInviteContent.invitee = player;
                replyInviteContent.replyStatus = 1;
                replyInviteContent.positionData = rechargeResp.targetPos;
                replyInviteContent.inviteeLinkMicId = rechargeResp.targetLinkmicId;
                linkLayerMessage.replyInviteContent = replyInviteContent;
                u7t.LJJIIJZLJL(linkLayerMessage);
            }
        }
    }

    public static final void accept$4(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS5S1100100_13.j2, "update_setting", afS5S1100100_13.s0, th);
        MultiLiveAnchorSettingDialogContract$AbsView multiLiveAnchorSettingDialogContract$AbsView = (MultiLiveAnchorSettingDialogContract$AbsView) ((C75297Tgr) afS5S1100100_13.l1).LJLILLLLZI;
        if (multiLiveAnchorSettingDialogContract$AbsView != null) {
            multiLiveAnchorSettingDialogContract$AbsView.U2(th);
        }
    }

    public static final void accept$5(AfS5S1100100_13 afS5S1100100_13, Object obj) {
        Throwable e = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS5S1100100_13.j2, "list_by_type", null, e);
        TUU tuu = (TUU) afS5S1100100_13.l1;
        o.LJIIIIZZ(e, "e");
        tuu.LJIIL(e);
        TUU tuu2 = (TUU) afS5S1100100_13.l1;
        tuu2.LJLJJL = null;
        tuu2.LJLJJLL.remove(afS5S1100100_13.s0);
    }

    public AfS5S1100100_13(long j, String str, Object obj, int i) {
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = obj;
    }
}
