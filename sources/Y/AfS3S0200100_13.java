package Y;

import X.BZI;
import X.C05630Jz;
import X.C0NB;
import X.C16880lQ;
import X.C276516r;
import X.C29401Dk;
import X.C30868C9o;
import X.C31012CFc;
import X.C34K;
import X.C72242sW;
import X.C74824TYe;
import X.C74843TYx;
import X.C75884TqK;
import X.C75918Tqs;
import X.C75919Tqt;
import X.C76231Tvv;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76279Twh;
import X.C76280Twi;
import X.C76324TxQ;
import X.C76679U7n;
import X.C76689U7x;
import X.C76690U7y;
import X.C77904Uho;
import X.C8E;
import X.CH1;
import X.EnumC74827TYh;
import X.EnumC75915Tqp;
import X.FT5;
import X.InterfaceC64592gB;
import X.InterfaceC75441TjB;
import X.InterfaceC76622U5i;
import X.InterfaceC76688U7w;
import X.InterfaceC76767UAx;
import X.InterfaceC88472Yns;
import X.J7I;
import X.LAV;
import X.OSZ;
import X.U4R;
import X.U71;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U7W;
import X.U8H;
import X.UA9;
import X.UC0;
import X.X1D;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.JoinGroupResp;

/* loaded from: classes14.dex */
public class AfS3S0200100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable it = (Throwable) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        boolean z = ((C34K) afS3S0200100_13.l0).element;
        long j = afS3S0200100_13.j2;
        o.LJIIIIZZ(it, "it");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C76271TwZ.LJJ(jSONObject, z);
        JSONObject LIZLLL = FT5.LIZLLL("role_type", "invitee");
        JSONObject jSONObject2 = new JSONObject();
        C76271TwZ.LJJII(jSONObject, LIZLLL, it);
        c76271TwZ.LJL("reply_failed", jSONObject, LIZLLL, jSONObject2, false);
        ((InterfaceC88472Yns) afS3S0200100_13.l1).invoke(Boolean.FALSE);
    }

    public static final void accept$1(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        int i;
        Throwable it = (Throwable) obj;
        ((InterfaceC88472Yns) afS3S0200100_13.l0).invoke(Boolean.FALSE);
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS3S0200100_13.l1).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView != null) {
            i = multiMatchBeInvitedContract$AbsView.wl();
        } else {
            i = 0;
        }
        long j = afS3S0200100_13.j2;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJJZ(i, j, it);
    }

    public static final void accept$10(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((PermitApplyData) afS3S0200100_13.l1).getPermitStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        u7w.LJIIIZ(u7t, "permit_apply", LIZIZ, LJIJ, LJIILJJIL, new OSZ("permit_status", str), true, ((PermitApplyData) afS3S0200100_13.l1).getApplicant().getLinkMicId());
    }

    public static final void accept$11(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Long l;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            long j = afS3S0200100_13.j2;
            KickOutAllData kickOutAllData = (KickOutAllData) afS3S0200100_13.l1;
            List<LinkUser> LJJIIZI = u7t.LJIIJJI.LJJIIZI();
            ArrayList arrayList = new ArrayList();
            for (LinkUser linkUser : LJJIIZI) {
                LinkUser linkUser2 = linkUser;
                if (linkUser2.getUserId() != null) {
                    Long userId = linkUser2.getUserId();
                    Room room = u7t.LJ;
                    if (room != null) {
                        l = Long.valueOf(room.getOwnerUserId());
                    } else {
                        l = null;
                    }
                    if (!o.LJ(userId, l)) {
                        arrayList.add(linkUser);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                String linkMicId = ((LinkUser) it.next()).getLinkMicId();
                if (linkMicId != null) {
                    OSZ osz = new OSZ(0L, "");
                    UA9.LJJI(j, C31012CFc.LIZIZ(), u7t, linkMicId, baseResponse.LIZIZ, KickOutReason.Companion.stateToString(kickOutAllData.getKickOutReason()), osz, true);
                }
            }
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            J7I.LJIIIZ(u7w, u7t, "kick_out_all_guests", LIZIZ, str, 0, new OSZ("kickout_all_reason", String.valueOf(kickOutAllData.getKickOutReason())), false, null, 192);
        }
    }

    public static final void accept$12(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Long l;
        Throwable th = (Throwable) obj;
        List<LinkUser> LJJIIZI = ((U7T) afS3S0200100_13.l0).LJIIJJI.LJJIIZI();
        U7T u7t = (U7T) afS3S0200100_13.l0;
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : LJJIIZI) {
            LinkUser linkUser2 = linkUser;
            if (linkUser2.getUserId() != null) {
                Long userId = linkUser2.getUserId();
                Room room = u7t.LJ;
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                if (!o.LJ(userId, l)) {
                    arrayList.add(linkUser);
                }
            }
        }
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        KickOutAllData kickOutAllData = (KickOutAllData) afS3S0200100_13.l1;
        long j = afS3S0200100_13.j2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String linkMicId = ((LinkUser) it.next()).getLinkMicId();
            if (linkMicId != null) {
                OSZ LJIILL = UC0.LJIILL(th);
                UA9.LJJI(j, C31012CFc.LIZIZ(), u7t2, linkMicId, UC0.LJIJ(th), KickOutReason.Companion.stateToString(kickOutAllData.getKickOutReason()), LJIILL, false);
            }
        }
        U7T u7t3 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t3.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t3, "kick_out", LIZIZ, LJIJ, UC0.LJIILJJIL(th), new OSZ("kickout_all_reason", String.valueOf(((KickOutAllData) afS3S0200100_13.l1).getKickOutReason())), false, null, 192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$13(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C76690U7y) afS3S0200100_13.l1).LIZIZ;
        String LJJIJL = U7T.LJJIJL(((JoinGroupResp) baseResponse.data).groupUser, j);
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ osz = new OSZ(0L, "");
        String str2 = baseResponse.LIZIZ;
        UA9.LJIJI(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, LJJIJL, str2, osz);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String str3 = baseResponse.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ2, str3, 0, null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C76690U7y c76690U7y = (C76690U7y) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        String str4 = baseResponse.LIZIZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        interfaceC76688U7w.LJIL(c76690U7y, str4);
                    }
                }
            }
        }
    }

    public static final void accept$14(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C76690U7y) afS3S0200100_13.l1).LIZIZ;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        UA9.LJIJI(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, null, LJIJ, LJIILL);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "invite", LIZIZ2, LJIJ2, UC0.LJIILJJIL(th), null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C76690U7y c76690U7y = (C76690U7y) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIJJ(c76690U7y, th);
                    }
                }
            }
        }
    }

    public static final void accept$15(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C75919Tqt) afS3S0200100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        String str2 = "";
        OSZ osz = new OSZ(0L, "");
        String str3 = baseResponse.LIZIZ;
        String str4 = ((C75919Tqt) afS3S0200100_13.l1).LJLJJI;
        UA9.LJIILJJIL(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, str3, str4, osz);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String str5 = baseResponse.LIZIZ;
        if (str5 != null) {
            str2 = str5;
        }
        J7I.LJIIIZ(u7w, u7t, "cancel_invite", LIZIZ2, str2, 0, null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C75919Tqt c75919Tqt = (C75919Tqt) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        String str6 = baseResponse.LIZIZ;
                        o.LJIIIIZZ(str6, "resp.logId");
                        interfaceC76688U7w.LJI(c75919Tqt, str6);
                    }
                }
            }
        }
    }

    public static final void accept$16(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C75919Tqt) afS3S0200100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str2 = ((C75919Tqt) afS3S0200100_13.l1).LJLJJI;
        UA9.LJIILJJIL(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, LJIJ, str2, LJIILL);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "cancel_invite", LIZIZ2, LJIJ2, UC0.LJIILJJIL(th), null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C75919Tqt c75919Tqt = (C75919Tqt) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIJ(c75919Tqt, th);
                    }
                }
            }
        }
    }

    public static final void accept$17(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        String str2;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        String str3 = "";
        OSZ osz = new OSZ(0L, "");
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        UA9.LJIL(u7t, true, osz, str, ((C72242sW) afS3S0200100_13.l1).element, afS3S0200100_13.j2, C31012CFc.LIZIZ());
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        if (baseResponse != null && (str2 = baseResponse.LIZIZ) != null) {
            str3 = str2;
        }
        J7I.LJIIIZ(u7w, u7t2, "join_channel", LIZIZ, str3, 0, null, false, null, 224);
    }

    public static final void accept$18(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJIL((U7T) afS3S0200100_13.l0, false, UC0.LJIILL(th), UC0.LJIJ(th), ((C72242sW) afS3S0200100_13.l1).element, afS3S0200100_13.j2, C31012CFc.LIZIZ());
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t, "join_channel", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$19(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            long j = afS3S0200100_13.j2;
            LeaveChannelData leaveChannelData = (LeaveChannelData) afS3S0200100_13.l1;
            String str = "";
            UA9.LJJII(u7t, new OSZ(0L, ""), baseResponse.LIZIZ, j, C31012CFc.LIZIZ(), leaveChannelData.getLeaveSource(), leaveChannelData.getLeaveReason());
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            J7I.LJIIIZ(u7w, u7t, "leave", LIZIZ, str, 0, new OSZ("leave_reason", String.valueOf(leaveChannelData.getLeaveReason())), false, null, 192);
            u7t.LJJIII.LIZJ();
        }
    }

    public static final void accept$2(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        if (((C76279Twh) afS3S0200100_13.l0).LIZLLL == 0) {
            return;
        }
        C76272Twa.LJJJJ(afS3S0200100_13.j2, "invite_each_other", ((C34K) afS3S0200100_13.l1).element);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIILIIL = false;
        C76280Twi c76280Twi2 = C76265TwT.LIZIZ;
        c76280Twi2.LJIILIIL = false;
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "open, success");
        if (((C34K) afS3S0200100_13.l1).element) {
            c76280Twi = c76280Twi2;
        }
        c76280Twi.LJIIJJI(afS3S0200100_13.j2);
        if (!LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
            return;
        }
        ((C76279Twh) afS3S0200100_13.l0).LJJIL("each_other", ((C34K) afS3S0200100_13.l1).element);
    }

    public static final void accept$20(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJJII((U7T) afS3S0200100_13.l0, UC0.LJIILL(th), UC0.LJIJ(th), afS3S0200100_13.j2, C31012CFc.LIZIZ(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveSource(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason());
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t, "leave", LIZIZ, LJIJ, UC0.LJIILJJIL(th), new OSZ("leave_reason", String.valueOf(((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason())), false, null, 192);
    }

    public static final void accept$21(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            CancelInviteData cancelInviteData = (CancelInviteData) afS3S0200100_13.l1;
            long j = afS3S0200100_13.j2;
            String valueOf = String.valueOf(cancelInviteData.getInvitee().getUserId());
            String str = "";
            OSZ osz = new OSZ(0L, "");
            UA9.LJIILIIL(j, C31012CFc.LIZIZ(), u7t, valueOf, baseResponse.LIZIZ, osz, true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            J7I.LJIIIZ(u7w, u7t, "cancel_invite", LIZIZ, str, 0, null, false, null, 224);
        }
    }

    public static final void accept$22(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        String valueOf = String.valueOf(((CancelInviteData) afS3S0200100_13.l1).getInvitee().getUserId());
        OSZ LJIILL = UC0.LJIILL(th);
        UA9.LJIILIIL(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7t, valueOf, UC0.LJIJ(th), LJIILL, false);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t2, "cancel_invite", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$23(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        String linkMicId = ((PermitApplyData) afS3S0200100_13.l0).getApplicant().getLinkMicId();
        int permitStatus = ((PermitApplyData) afS3S0200100_13.l0).getPermitStatus();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        UA9.LJJIIZ(permitStatus, afS3S0200100_13.j2, C31012CFc.LIZIZ(), (U7T) afS3S0200100_13.l1, linkMicId, null, LJIJ, LJIILL, false);
        U7T u7t = (U7T) afS3S0200100_13.l1;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((PermitApplyData) afS3S0200100_13.l0).getPermitStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7t, "permit_apply", LIZIZ, LJIJ2, LJIILJJIL, new OSZ("permit_status", str), false, ((PermitApplyData) afS3S0200100_13.l0).getApplicant().getLinkMicId(), 64);
    }

    public static final void accept$24(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            long j = afS3S0200100_13.j2;
            DestroyChannelData destroyChannelData = (DestroyChannelData) afS3S0200100_13.l1;
            String str = "";
            OSZ osz = new OSZ(0L, "");
            String str2 = baseResponse.LIZIZ;
            long LIZIZ = C31012CFc.LIZIZ();
            long finishReason = destroyChannelData.getFinishReason();
            u7t.getClass();
            UA9.LJIIZILJ(j, LIZIZ, u7t, str2, U7T.LJJIIZI(finishReason), osz, true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ2 = C31012CFc.LIZIZ() - j;
            String str3 = baseResponse.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            J7I.LJIIIZ(u7w, u7t, "destroy_channel", LIZIZ2, str, 0, null, false, null, 224);
        }
    }

    public static final void accept$25(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        long j = afS3S0200100_13.j2;
        long LIZIZ = C31012CFc.LIZIZ();
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        long finishReason = ((DestroyChannelData) afS3S0200100_13.l1).getFinishReason();
        u7t2.getClass();
        UA9.LJIIZILJ(j, LIZIZ, u7t, LJIJ, U7T.LJJIIZI(finishReason), LJIILL, false);
        U7T u7t3 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t3.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        J7I.LJIIIZ(u7w, u7t3, "destroy_channel", LIZIZ2, LJIJ2, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$26(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        String valueOf = String.valueOf(((ReplyInviteData) afS3S0200100_13.l1).getInviter().getUserId());
        int replyStatus = ((ReplyInviteData) afS3S0200100_13.l1).getReplyStatus();
        OSZ LJIILL = UC0.LJIILL(th);
        UA9.LJJIJIL(replyStatus, afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7t, valueOf, UC0.LJIJ(th), LJIILL, false);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((ReplyInviteData) afS3S0200100_13.l1).getReplyStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7t2, "reply_invite", LIZIZ, LJIJ, LJIILJJIL, new OSZ("reply_status", str), false, null, 192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$27(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C76689U7x) afS3S0200100_13.l1).LIZIZ;
        String LJJIJL = U7T.LJJIJL(((JoinGroupResp) baseResponse.data).groupUser, j);
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ osz = new OSZ(0L, "");
        String str2 = baseResponse.LIZIZ;
        String str3 = ((C76689U7x) afS3S0200100_13.l1).LJII;
        UA9.LJII(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, LJJIJL, str2, str3, osz);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String str4 = baseResponse.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "apply", LIZIZ2, str4, 0, null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C76689U7x c76689U7x = (C76689U7x) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        String str5 = baseResponse.LIZIZ;
                        if (str5 == null) {
                            str5 = "";
                        }
                        interfaceC76688U7w.LJIILL(c76689U7x, str5);
                    }
                }
            }
        }
    }

    public static final void accept$28(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C76689U7x) afS3S0200100_13.l1).LIZIZ;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str2 = ((C76689U7x) afS3S0200100_13.l1).LJII;
        UA9.LJII(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, null, LJIJ, str2, LJIILL);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "apply", LIZIZ2, LJIJ2, UC0.LJIILJJIL(th), null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C76689U7x c76689U7x = (C76689U7x) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIJJLI(c76689U7x, th);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$29(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        JoinDirectResp joinDirectResp;
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (joinDirectResp = (JoinDirectResp) baseResponse.data) != null) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            DirectJoinData directJoinData = (DirectJoinData) afS3S0200100_13.l1;
            long j = afS3S0200100_13.j2;
            String valueOf = String.valueOf(directJoinData.getSelf().getUserId());
            String str2 = joinDirectResp.selfLinkMicId;
            if (str2 == null) {
                str2 = "-1";
            }
            String str3 = "";
            UA9.LJJ(j, C31012CFc.LIZIZ(), u7t, valueOf, str2, baseResponse.LIZIZ, new OSZ(0L, ""), true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str4 = baseResponse.LIZIZ;
            if (str4 != null) {
                str3 = str4;
            }
            BizJoinDirectParams bizJoinDirectParams = directJoinData.getBizJoinDirectParams();
            if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1) {
                str = "agree";
            } else {
                str = "reject";
            }
            J7I.LJIIIZ(u7w, u7t, "join_direct", LIZIZ, str3, 0, new OSZ("reply_status", str), false, null, 192);
        }
    }

    public static final void accept$3(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        if (((C76279Twh) afS3S0200100_13.l0).LIZLLL == 0) {
            return;
        }
        C0NB.LJ("TwoMatchViewAnchorPrese", "open, fail");
        ((C76279Twh) afS3S0200100_13.l0).LJIIIIZZ(throwable);
        int i = 1;
        if (C76324TxQ.LIZIZ() && (throwable instanceof C29401Dk) && ((C276516r) throwable).getErrorCode() == 4004048) {
            C76265TwT.LIZ.LJIILIIL = true;
            C76265TwT.LIZIZ.LJIILIIL = true;
            C76272Twa.LJJJ(afS3S0200100_13.j2, C76265TwT.LJIIIIZZ, "invite_each_other", throwable, ((C34K) afS3S0200100_13.l1).element);
            return;
        }
        C76272Twa.LJJJ(afS3S0200100_13.j2, -1L, "invite_each_other", throwable, ((C34K) afS3S0200100_13.l1).element);
        C30868C9o.LIZJ(R.string.sqr);
        if (((C34K) afS3S0200100_13.l1).element) {
            i = 2;
        }
        C76265TwT.LJII(i, "open_failed");
        C76324TxQ.LIZJ();
    }

    public static final void accept$30(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        String valueOf = String.valueOf(((DirectJoinData) afS3S0200100_13.l1).getSelf().getUserId());
        OSZ LJIILL = UC0.LJIILL(th);
        UA9.LJJ(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7t, valueOf, null, UC0.LJIJ(th), LJIILL, false);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        BizJoinDirectParams bizJoinDirectParams = ((DirectJoinData) afS3S0200100_13.l1).getBizJoinDirectParams();
        if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7t2, "join_direct", LIZIZ, LJIJ, LJIILJJIL, new OSZ("reply_status", str), false, null, 192);
    }

    public static final void accept$31(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            long j = afS3S0200100_13.j2;
            KickOutData kickOutData = (KickOutData) afS3S0200100_13.l1;
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str = baseResponse.LIZIZ;
            if (str == null) {
                str = "";
            }
            u7w.LJIIIZ(u7t, "kick_out", LIZIZ, str, 0, new OSZ("kickout_reason", String.valueOf(kickOutData.getKickOutReason())), true, kickOutData.getGuest().getLinkMicId());
        }
    }

    public static final void accept$32(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        u7w.LJIIIZ(u7t, "kick_out", LIZIZ, LJIJ, UC0.LJIILJJIL(th), new OSZ("kickout_reason", String.valueOf(((KickOutData) afS3S0200100_13.l1).getKickOutReason())), true, ((KickOutData) afS3S0200100_13.l1).getGuest().getLinkMicId());
    }

    public static final void accept$33(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, true, false, false, 6));
            LIZIZ.LJIJJ(Integer.valueOf(baseResponse.LIZLLL), "request_type");
            LIZIZ.LJIJJ(Boolean.TRUE, "success");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$34(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, true, false, false, 6));
            LIZIZ.LJIJJ(Boolean.FALSE, "success");
            LIZIZ.LJIJJ(C16880lQ.LJLLJ(th.getClass()), "error_name");
            LIZIZ.LJIJJ(th.getMessage(), "error_message");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$35(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, false, false, true, 3));
            LIZIZ.LJIJJ(Integer.valueOf(baseResponse.LIZLLL), "request_type");
            LIZIZ.LJIJJ(Boolean.TRUE, "success");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$36(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, false, false, true, 3));
            LIZIZ.LJIJJ(Boolean.FALSE, "success");
            LIZIZ.LJIJJ(C16880lQ.LJLLJ(th.getClass()), "error_name");
            LIZIZ.LJIJJ(th.getMessage(), "error_message");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$37(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, false, true, false, 5));
            LIZIZ.LJIJJ(Integer.valueOf(baseResponse.LIZLLL), "request_type");
            LIZIZ.LJIJJ(Boolean.TRUE, "success");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$38(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_im_detect_api")) {
            BZI LIZIZ = C77904Uho.LIZIZ((MsgDetectMessage) afS3S0200100_13.l1, afS3S0200100_13.j2, C77904Uho.LIZ((C77904Uho) afS3S0200100_13.l0, false, true, false, 5));
            LIZIZ.LJIJJ(Boolean.FALSE, "success");
            LIZIZ.LJIJJ(C16880lQ.LJLLJ(th.getClass()), "error_name");
            LIZIZ.LJIJJ(th.getMessage(), "error_message");
            LIZIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$39(Y.AfS3S0200100_13 r18, java.lang.Object r19) {
        /*
            r0 = r19
            com.bytedance.android.live.network.response.BaseResponse r0 = (com.bytedance.android.live.network.response.BaseResponse) r0
            r1 = r18
            java.lang.Object r13 = r1.l0
            X.U7F r13 = (X.U7F) r13
            java.lang.Object r2 = r1.l1
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String r14 = r2.toString()
            r2 = 0
            if (r0 == 0) goto L69
            T r3 = r0.data
            webcast.api.linkmic.ApplyResponse$ResponseData r3 = (webcast.api.linkmic.ApplyResponse.ResponseData) r3
            if (r3 == 0) goto L69
            java.lang.String r15 = r3.linkMicIdStr
        L1e:
            T r3 = r0.data
            webcast.api.linkmic.ApplyResponse$ResponseData r3 = (webcast.api.linkmic.ApplyResponse.ResponseData) r3
            if (r3 == 0) goto L6d
            java.lang.String r5 = r3.rivalsLinkMicIdStr
        L26:
            r19 = 1
            X.OSZ r4 = new X.OSZ
            r6 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = ""
            r4.<init>(r3, r8)
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.LIZIZ
        L39:
            long r9 = r1.j2
            long r11 = X.C31012CFc.LIZIZ()
            r17 = r2
            r18 = r4
            r16 = r5
            X.UA9.LJI(r9, r11, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r1.l0
            X.U7F r4 = (X.U7F) r4
            X.U7W r3 = r4.LJIJ
            java.lang.String r5 = "apply"
            long r6 = X.C31012CFc.LIZIZ()
            long r1 = r1.j2
            long r6 = r6 - r1
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L67
        L5d:
            r9 = 0
            r10 = 0
            r13 = 224(0xe0, float:3.14E-43)
            r11 = r9
            r12 = r10
            X.J7I.LJIIIZ(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return
        L67:
            r8 = r0
            goto L5d
        L69:
            r15 = r2
            if (r0 == 0) goto L6d
            goto L1e
        L6d:
            r5 = r2
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0200100_13.accept$39(Y.AfS3S0200100_13, java.lang.Object):void");
    }

    public static final void accept$4(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        long longValue = ((Number) obj).longValue() - 1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountDown, uid = ");
        LIZ.append(afS3S0200100_13.j2);
        LIZ.append(", value = ");
        LIZ.append(longValue);
        C0NB.LJIIIZ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ));
        ((C75884TqK) afS3S0200100_13.l0).LIZJ(afS3S0200100_13.j2, longValue, (EnumC75915Tqp) afS3S0200100_13.l1);
    }

    public static final void accept$40(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS3S0200100_13.l0;
        String l = ((Long) afS3S0200100_13.l1).toString();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str = "";
        if (LJIJ == null) {
            LJIJ = "";
        }
        UA9.LJI(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7f, l, null, null, LJIJ, LJIILL, false);
        U7F u7f2 = (U7F) afS3S0200100_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 != null) {
            str = LJIJ2;
        }
        J7I.LJIIIZ(u7w, u7f2, "apply", LIZIZ, str, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$41(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS3S0200100_13.l0;
        String str2 = "";
        OSZ osz = new OSZ(0L, "");
        String str3 = null;
        if (baseResponse != null) {
            str3 = baseResponse.LIZIZ;
        }
        UA9.LJJII(u7f, osz, str3, afS3S0200100_13.j2, C31012CFc.LIZIZ(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveSource(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason());
        U7F u7f2 = (U7F) afS3S0200100_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        if (baseResponse != null && (str = baseResponse.LIZIZ) != null) {
            str2 = str;
        }
        J7I.LJIIIZ(u7w, u7f2, "leave", LIZIZ, str2, 0, new OSZ("leave_reason", String.valueOf(((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason())), false, null, 192);
    }

    public static final void accept$42(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS3S0200100_13.l0;
        OSZ LJIILL = UC0.LJIILL(th);
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = null;
        }
        UA9.LJJII(u7f, LJIILL, str, afS3S0200100_13.j2, C31012CFc.LIZIZ(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveSource(), ((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason());
        U7F u7f2 = (U7F) afS3S0200100_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7f2, "leave", LIZIZ, LJIJ, UC0.LJIILJJIL(th), new OSZ("leave_reason", String.valueOf(((LeaveChannelData) afS3S0200100_13.l1).getLeaveReason())), false, null, 192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$43(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        String str2;
        String str3;
        LinkInviteResult linkInviteResult;
        LinkInviteResult linkInviteResult2;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS3S0200100_13.l0;
        String valueOf = String.valueOf(((InviteData) afS3S0200100_13.l1).getInvitee().getUserId());
        String str4 = null;
        if (baseResponse != null && (linkInviteResult2 = (LinkInviteResult) baseResponse.data) != null) {
            str = linkInviteResult2.linkMicIdStr;
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        if (baseResponse == null || (linkInviteResult = (LinkInviteResult) baseResponse.data) == null || (str2 = linkInviteResult.rivalsLinkMicIdStr) == null) {
            str2 = "";
        }
        OSZ osz = new OSZ(0L, "");
        if (baseResponse != null) {
            str4 = baseResponse.LIZIZ;
        }
        UA9.LJIJ(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, str, str2, str4, osz, true);
        U7F u7f2 = (U7F) afS3S0200100_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        if (baseResponse != null && (str3 = baseResponse.LIZIZ) != null) {
            str5 = str3;
        }
        J7I.LJIIIZ(u7w, u7f2, "invite", LIZIZ, str5, 0, null, false, null, 224);
    }

    public static final void accept$44(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS3S0200100_13.l0;
        String valueOf = String.valueOf(((LinkUser) afS3S0200100_13.l1).getUserId());
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str = "";
        if (LJIJ == null) {
            LJIJ = "";
        }
        UA9.LJIJ(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, null, null, LJIJ, LJIILL, false);
        U7F u7f2 = (U7F) afS3S0200100_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 != null) {
            str = LJIJ2;
        }
        J7I.LJIIIZ(u7w, u7f2, "invite", LIZIZ, str, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$45(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        boolean z;
        U8H LJJZZI;
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "requestUpdateSetting success");
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String str = ((BaseResponse) obj).LIZIZ;
        o.LJIIIIZZ(str, "it.logId");
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "update_setting", str, "change_layout");
        ((C74843TYx) afS3S0200100_13.l0).getClass();
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "switchLayout");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.A1(LAV.LIZIZ(), true);
        }
        EnumC74827TYh enumC74827TYh = EnumC74827TYh.DEFAULT_MODE;
        if (((MultiLiveAnchorPanelSettings) afS3S0200100_13.l1).allowViewerReq == 3) {
            z = true;
        } else {
            z = false;
        }
        C74824TYe.LJLIIL(enumC74827TYh, z, true);
        C74824TYe.LJJIJIIJIL(enumC74827TYh);
    }

    public static final void accept$46(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doInvite Invite Guest error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        U4R.LIZIZ("InviteManager", X1D.LIZIZ(LIZ));
        if (((CopyOnWriteArraySet) ((U71) afS3S0200100_13.l0).LJI).contains(Long.valueOf(afS3S0200100_13.j2)) && LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            U4R.LIZIZ("InviteManager", "moderator has process invite");
            return;
        }
        ((U71) afS3S0200100_13.l0).LJJLI(afS3S0200100_13.j2, false);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIL(it, (InterfaceC76767UAx) afS3S0200100_13.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$47(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        InviteResponse inviteResponse;
        BaseResponse baseResponse = (BaseResponse) obj;
        U4R.LIZ("ModeratorInviteUserManager", "doInvite success");
        ((CopyOnWriteArraySet) ((C76679U7n) afS3S0200100_13.l0).LIZLLL).remove(Long.valueOf(afS3S0200100_13.j2));
        if (baseResponse != null && (inviteResponse = (InviteResponse) baseResponse.data) != null) {
            InterfaceC76767UAx interfaceC76767UAx = (InterfaceC76767UAx) afS3S0200100_13.l1;
            if (interfaceC76767UAx != null) {
                interfaceC76767UAx.LIZIZ(inviteResponse, baseResponse.LIZIZ);
                return;
            }
            return;
        }
        InterfaceC76767UAx interfaceC76767UAx2 = (InterfaceC76767UAx) afS3S0200100_13.l1;
        if (interfaceC76767UAx2 == null) {
            return;
        }
        interfaceC76767UAx2.LIZ(LinkCoreError.Companion.getCOMMON_RESPONSE_INVALID(), null, null);
    }

    public static final void accept$48(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        ((CopyOnWriteArraySet) ((C76679U7n) afS3S0200100_13.l0).LIZLLL).remove(Long.valueOf(afS3S0200100_13.j2));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doInvite Invite Guest error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        U4R.LIZIZ("ModeratorInviteUserManager", X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(it, "it");
        U7V.LJIIL(it, (InterfaceC76767UAx) afS3S0200100_13.l1);
    }

    public static final void accept$5(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C75918Tqs) afS3S0200100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        String str2 = "";
        OSZ osz = new OSZ(0L, "");
        String str3 = baseResponse.LIZIZ;
        String str4 = ((C75918Tqs) afS3S0200100_13.l1).LJLJJI;
        UA9.LJIIL(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, str3, str4, osz);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String str5 = baseResponse.LIZIZ;
        if (str5 != null) {
            str2 = str5;
        }
        J7I.LJIIIZ(u7w, u7t, "cancel_apply", LIZIZ2, str2, 0, null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C75918Tqs c75918Tqs = (C75918Tqs) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        String str6 = baseResponse.LIZIZ;
                        o.LJIIIIZZ(str6, "resp.logId");
                        interfaceC76688U7w.LJII(c75918Tqs, str6);
                    }
                }
            }
        }
    }

    public static final void accept$6(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            KickOutData kickOutData = (KickOutData) afS3S0200100_13.l1;
            long j = afS3S0200100_13.j2;
            String linkMicId = kickOutData.getGuest().getLinkMicId();
            String str = "";
            OSZ osz = new OSZ(0L, "");
            UA9.LJJIFFI(j, C31012CFc.LIZIZ(), u7t, linkMicId, baseResponse.LIZIZ, KickOutReason.Companion.stateToString(kickOutData.getKickOutReason()), osz, true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            J7I.LJIIIZ(u7w, u7t, "kick_out", LIZIZ, str, 0, new OSZ("kickout_reason", String.valueOf(kickOutData.getKickOutReason())), false, null, 192);
        }
    }

    public static final void accept$7(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        String str = ((U7T) afS3S0200100_13.l0).LJJI;
        long j = ((C75918Tqs) afS3S0200100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str2 = ((C75918Tqs) afS3S0200100_13.l1).LJLJJI;
        UA9.LJIIL(j, afS3S0200100_13.j2, LIZIZ, (U7T) afS3S0200100_13.l0, str, LJIJ, str2, LJIILL);
        U7T u7t = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        J7I.LJIIIZ(u7w, u7t, "cancel_apply", LIZIZ2, LJIJ2, UC0.LJIILJJIL(th), null, false, null, 224);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
        C75918Tqs c75918Tqs = (C75918Tqs) afS3S0200100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIIZILJ(c75918Tqs, th);
                    }
                }
            }
        }
    }

    public static final void accept$8(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS3S0200100_13.l0;
        String linkMicId = ((KickOutData) afS3S0200100_13.l1).getGuest().getLinkMicId();
        OSZ LJIILL = UC0.LJIILL(th);
        UA9.LJJIFFI(afS3S0200100_13.j2, C31012CFc.LIZIZ(), u7t, linkMicId, UC0.LJIJ(th), KickOutReason.Companion.stateToString(((KickOutData) afS3S0200100_13.l1).getKickOutReason()), LJIILL, false);
        U7T u7t2 = (U7T) afS3S0200100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS3S0200100_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t2, "kick_out", LIZIZ, LJIJ, UC0.LJIILJJIL(th), new OSZ("kickout_reason", String.valueOf(((KickOutData) afS3S0200100_13.l1).getKickOutReason())), false, null, 192);
    }

    public static final void accept$9(AfS3S0200100_13 afS3S0200100_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS3S0200100_13.l0;
            long j = afS3S0200100_13.j2;
            PermitApplyData permitApplyData = (PermitApplyData) afS3S0200100_13.l1;
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (permitApplyData.getPermitStatus() == 1) {
                str = "agree";
            } else {
                str = "reject";
            }
            u7w.LJIIIZ(u7t, "permit_apply", LIZIZ, str2, 0, new OSZ("permit_status", str), true, permitApplyData.getApplicant().getLinkMicId());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0200100_13(long r2, com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData r4, X.U7T r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 6: goto L10;
                case 7: goto L5;
                case 8: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0200100_13.<init>(long, com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData, X.U7T, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0200100_13(long r2, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData r4, X.U7T r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 9: goto L10;
                case 10: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0200100_13.<init>(long, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData, X.U7T, int):void");
    }

    public AfS3S0200100_13(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
