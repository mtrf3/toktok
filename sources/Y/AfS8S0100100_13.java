package Y;

import X.AbstractC75784Toi;
import X.AbstractC75865Tq1;
import X.B5G;
import X.BPP;
import X.C05630Jz;
import X.C0EM;
import X.C0NB;
import X.C15380j0;
import X.C1EW;
import X.C276516r;
import X.C278417k;
import X.C29044Baa;
import X.C2A7;
import X.C30725C4b;
import X.C30868C9o;
import X.C31012CFc;
import X.C32014ChO;
import X.C32I;
import X.C74736TUu;
import X.C74746TVe;
import X.C74777TWj;
import X.C74824TYe;
import X.C74843TYx;
import X.C74987Tbr;
import X.C75492Tk0;
import X.C75600Tlk;
import X.C75782Tog;
import X.C75783Toh;
import X.C75791Top;
import X.C75792Toq;
import X.C75794Tos;
import X.C75877TqD;
import X.C76129TuH;
import X.C76244Tw8;
import X.C76252TwG;
import X.C76271TwZ;
import X.C76278Twg;
import X.C76548U2m;
import X.CH1;
import X.EnumC75524TkW;
import X.InterfaceC31336CRo;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC75495Tk3;
import X.InterfaceC76675U7j;
import X.J7I;
import X.ORZ;
import X.OSZ;
import X.TQV;
import X.TVU;
import X.U71;
import X.U7A;
import X.U7B;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U7W;
import X.U7Z;
import X.UA9;
import X.UC0;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiLivePermitChannel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.model.MultiGuestAnchorPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCrossDeviceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOnlyPushRtcWhenResumeSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public class AfS8S0100100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        BaseResponse response = (BaseResponse) obj;
        ((C76252TwG) afS8S0100100_13.l0).LJLJJL.LJIILLIIL.put(Long.valueOf(afS8S0100100_13.j1), Boolean.TRUE);
        ((C76252TwG) afS8S0100100_13.l0).LJLJJL.LJIJ = false;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C76271TwZ.LJJLIL(211, true, 0L, 12);
        long j = afS8S0100100_13.j1;
        o.LJIIIIZZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - C76271TwZ.LJIILIIL);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_approve_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
        ((C76252TwG) afS8S0100100_13.l0).LJII();
        MultiMatchMateQuitRequestContract$AbsView multiMatchMateQuitRequestContract$AbsView = (MultiMatchMateQuitRequestContract$AbsView) ((C76252TwG) afS8S0100100_13.l0).LJLILLLLZI;
        if (multiMatchMateQuitRequestContract$AbsView != null) {
            multiMatchMateQuitRequestContract$AbsView.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        BaseResponse baseResponse = (BaseResponse) obj;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "list_by_type", str, null);
        ((LinkedHashMap) ((C75791Top) afS8S0100100_13.l0).LJLJJL).clear();
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            C75791Top c75791Top = (C75791Top) afS8S0100100_13.l0;
            Iterator<LinkPlayerInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                LinkPlayerInfo next = it.next();
                Map<String, LinkPlayerInfo> map = c75791Top.LJLJJL;
                String str2 = next.mInteractIdStr;
                o.LJIIIIZZ(str2, "user.interactIdStr");
                map.put(str2, next);
            }
        }
        C75791Top c75791Top2 = (C75791Top) afS8S0100100_13.l0;
        CopyOnWriteArrayList<AbstractC75784Toi> LIZ = c75791Top2.LIZ();
        ArrayList arrayList2 = new ArrayList();
        Iterator<AbstractC75784Toi> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            AbstractC75784Toi next2 = it2.next();
            if (next2 instanceof C75792Toq) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            c75791Top2.LIZLLL((C75792Toq) it3.next());
        }
    }

    public static final void accept$10(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS8S0100100_13.l0;
            long j = afS8S0100100_13.j1;
            String str = "";
            UA9.LJIILLIIL(u7t, true, new OSZ(0L, ""), baseResponse.LIZIZ, j, C31012CFc.LIZIZ());
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str2 = baseResponse.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            J7I.LJIIIZ(u7w, u7t, "create_channel", LIZIZ, str, 0, null, false, null, 224);
        }
    }

    public static final void accept$11(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJIILLIIL((U7T) afS8S0100100_13.l0, false, UC0.LJIILL(th), UC0.LJIJ(th), afS8S0100100_13.j1, C31012CFc.LIZIZ());
        U7T u7t = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t, "create_channel", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        ResumeResp resumeResp;
        OnLineMicInfo LIZJ;
        Long l;
        AllListUser allListUser;
        List<LinkLayerListUser> list;
        long j;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (resumeResp = (ResumeResp) baseResponse.data) != null) {
            U7T u7t = (U7T) afS8S0100100_13.l0;
            long j2 = afS8S0100100_13.j1;
            String str = "";
            if (resumeResp.channelId != u7t.LJI || !o.LJ(resumeResp.selfLinkMicId, u7t.LJJI)) {
                C32014ChO.LIZJ(U7T.LJJJJI(473), "resume channelId(selfLinkMicId) unequals createChannel channelId(selfLinkMicId)", null);
                Throwable th = new Throwable("resume channelId(selfLinkMicId) unequals createChannel channelId(selfLinkMicId)");
                U7W u7w = u7t.LJJIII;
                long LIZIZ = C31012CFc.LIZIZ() - j2;
                String LJIJ = UC0.LJIJ(th);
                if (LJIJ != null) {
                    str = LJIJ;
                }
                J7I.LJIIIZ(u7w, u7t, "linkmic_sdk_resume_api", LIZIZ, str, UC0.LJIILJJIL(th), null, false, null, 224);
                return;
            }
            U7W u7w2 = u7t.LJJIII;
            long LIZIZ2 = C31012CFc.LIZIZ() - j2;
            String str2 = baseResponse.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            J7I.LJIIIZ(u7w2, u7t, "linkmic_sdk_resume_api", LIZIZ2, str2, 0, null, false, null, 224);
            if (MultiGuestOnlyPushRtcWhenResumeSetting.INSTANCE.isEnable() && (allListUser = resumeResp.list) != null && (list = allListUser.linkedList) != null) {
                for (LinkLayerListUser linkLayerListUser : list) {
                    Player player = linkLayerListUser.linkUser;
                    if (player != null) {
                        j = player.uid;
                    } else {
                        j = 0;
                    }
                    String guestUserId = String.valueOf(j);
                    String str3 = resumeResp.selfLinkMicId;
                    String str4 = linkLayerListUser.linkMicId;
                    OSZ osz = new OSZ(0L, "");
                    String str5 = baseResponse.LIZIZ;
                    if (str5 == null) {
                        str5 = "";
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    o.LJIIIZ(guestUserId, "guestUserId");
                    UC0.LJJLIIIIJ(new ARunnableS0S4210200_13(j2, currentTimeMillis, u7t, guestUserId, str3, str4, str5, osz, 1));
                }
            }
            AllListUser allListUser2 = resumeResp.list;
            if (allListUser2 == null) {
                return;
            }
            U7Z u7z = u7t.LJIIJJI;
            List<LinkLayerListUser> list2 = allListUser2.appliedList;
            List<LinkLayerListUser> list3 = allListUser2.invitedList;
            List<LinkLayerListUser> list4 = allListUser2.linkedList;
            long j3 = resumeResp.channelId;
            u7z.LIZIZ = true;
            u7z.LJIJ(U7Z.LIZJ(j3, list2));
            u7z.LJIJJ(U7Z.LIZJ(j3, list3));
            u7z.LJIJJLI(U7Z.LIZJ(j3, list4));
            List<LinkLayerListUser> list5 = u7t.LJJIJIIJI;
            list5.clear();
            List<LinkLayerListUser> list6 = allListUser2.linkedList;
            if (list6 != null) {
                list5.addAll(list6);
            }
            if (!MultiGuestCrossDeviceSetting.INSTANCE.isEnable()) {
                return;
            }
            U7B u7b = new U7B();
            u7b.LIZ = u7t.LLZL();
            u7b.LIZIZ = u7t.LJIIJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<LinkLayerListUser> list7 = allListUser2.linkedList;
            if (list7 != null) {
                ORZ.LLILII(new IDComparatorS41S0000000_13(11), list7);
            }
            List<LinkLayerListUser> list8 = allListUser2.linkedList;
            if (list8 != null) {
                for (LinkLayerListUser linkLayerListUser2 : list8) {
                    LIZJ = U7V.LIZJ(linkLayerListUser2.positionData, 0L);
                    Player player2 = linkLayerListUser2.linkUser;
                    if (player2 != null) {
                        l = Long.valueOf(player2.uid);
                    } else {
                        l = null;
                    }
                    if (LIZJ != null && l != null) {
                        linkedHashMap.put(l, LIZJ);
                    }
                }
            }
            u7b.LIZJ = linkedHashMap;
            U7A u7a = new U7A(u7b);
            Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LJJIJ(u7t, u7a);
            }
        }
    }

    public static final void accept$13(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(515);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resume failed, throwable:");
        LIZ.append(th);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        U7T u7t = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t, "linkmic_sdk_resume_api", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        ApplyRequestResponse applyRequestResponse;
        ApplyRequestResponse applyRequestResponse2;
        String str;
        User owner;
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = null;
        if (baseResponse != null && (applyRequestResponse2 = (ApplyRequestResponse) baseResponse.data) != null) {
            U7T u7t = (U7T) afS8S0100100_13.l0;
            long j = afS8S0100100_13.j1;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (owner = room.getOwner()) == null || (str = owner.getIdStr()) == null) {
                str = "-1";
            }
            String str3 = "";
            UA9.LJI(j, C31012CFc.LIZIZ(), u7t, str, applyRequestResponse2.applicantLinkMicId, null, baseResponse.LIZIZ, new OSZ(0L, ""), true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str4 = baseResponse.LIZIZ;
            if (str4 != null) {
                str3 = str4;
            }
            J7I.LJIIIZ(u7w, u7t, "apply", LIZIZ, str3, 0, null, false, null, 224);
        }
        U7T u7t2 = (U7T) afS8S0100100_13.l0;
        if (baseResponse != null && (applyRequestResponse = (ApplyRequestResponse) baseResponse.data) != null) {
            str2 = applyRequestResponse.applicantLinkMicId;
        }
        C76129TuH.LJFF(1, u7t2, str2, false, 8);
    }

    public static final void accept$15(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        User owner;
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS8S0100100_13.l0;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (owner = room.getOwner()) == null || (str = owner.getIdStr()) == null) {
            str = "-1";
        }
        UA9.LJI(afS8S0100100_13.j1, C31012CFc.LIZIZ(), u7t, str, null, null, UC0.LJIJ(th), UC0.LJIILL(th), false);
        U7T u7t2 = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t2, "apply", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$16(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        User owner;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            U7T u7t = (U7T) afS8S0100100_13.l0;
            long j = afS8S0100100_13.j1;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (owner = room.getOwner()) == null || (str = owner.getIdStr()) == null) {
                str = "-1";
            }
            String str2 = "";
            UA9.LJIIJJI(j, C31012CFc.LIZIZ(), u7t, str, baseResponse.LIZIZ, new OSZ(0L, ""), true);
            U7W u7w = u7t.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - j;
            String str3 = baseResponse.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            J7I.LJIIIZ(u7w, u7t, "cancel_apply", LIZIZ, str2, 0, null, false, null, 224);
        }
        C76129TuH.LIZJ();
    }

    public static final void accept$17(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        User owner;
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS8S0100100_13.l0;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (owner = room.getOwner()) == null || (str = owner.getIdStr()) == null) {
            str = "-1";
        }
        UA9.LJIIJJI(afS8S0100100_13.j1, C31012CFc.LIZIZ(), u7t, str, UC0.LJIJ(th), UC0.LJIILL(th), false);
        U7T u7t2 = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t2, "cancel_apply", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
        C76129TuH.LIZJ();
    }

    public static final void accept$18(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = "";
        if (baseResponse != null && baseResponse.data != 0) {
            UA9.LJIILLIIL((U7T) afS8S0100100_13.l0, true, new OSZ(0L, ""), baseResponse.LIZIZ, afS8S0100100_13.j1, C31012CFc.LIZIZ());
        }
        U7T u7t = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        if (baseResponse != null && (str = baseResponse.LIZIZ) != null) {
            str2 = str;
        }
        J7I.LJIIIZ(u7w, u7t, "create_channel", LIZIZ, str2, 0, null, false, null, 224);
    }

    public static final void accept$19(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJIILLIIL((U7T) afS8S0100100_13.l0, false, UC0.LJIILL(th), UC0.LJIJ(th), afS8S0100100_13.j1, C31012CFc.LIZIZ());
        U7T u7t = (U7T) afS8S0100100_13.l0;
        U7W u7w = u7t.LJJIII;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7t, "create_channel", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$2(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Context context;
        Throwable th = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS8S0100100_13.j1, "list_by_type", null, th);
        C75794Tos c75794Tos = ((C75791Top) afS8S0100100_13.l0).LJLLJ;
        if (c75794Tos != null) {
            context = c75794Tos.LIZJ;
        } else {
            context = null;
        }
        BPP.LIZJ(context, th);
    }

    public static final void accept$20(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            UA9.LJIILL((U7T) afS8S0100100_13.l0, new OSZ(0L, ""), baseResponse.LIZIZ, afS8S0100100_13.j1, C31012CFc.LIZIZ());
        }
    }

    public static final void accept$21(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        UA9.LJIILL((U7T) afS8S0100100_13.l0, UC0.LJIILL(th), UC0.LJIJ(th), afS8S0100100_13.j1, C31012CFc.LIZIZ());
    }

    public static final void accept$22(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS8S0100100_13.l0;
        List<LinkUser> list = u7f.LJJIIJZLJL().LIZJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<LinkUser> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserId());
        }
        List<LinkUser> list2 = ((U7F) afS8S0100100_13.l0).LJJIIJZLJL().LIZIZ;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it2 = ((CopyOnWriteArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LinkUser) it2.next()).getUserId());
        }
        OSZ osz = new OSZ(0L, "");
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        UA9.LJJIIJ(u7f, arrayList, arrayList2, true, osz, str, afS8S0100100_13.j1, C31012CFc.LIZIZ());
    }

    public static final void accept$23(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS8S0100100_13.l0;
        List<LinkUser> list = u7f.LJJIIJZLJL().LIZJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<LinkUser> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserId());
        }
        List<LinkUser> list2 = ((U7F) afS8S0100100_13.l0).LJJIIJZLJL().LIZIZ;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it2 = ((CopyOnWriteArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LinkUser) it2.next()).getUserId());
        }
        OSZ LJIILL = UC0.LJIILL(th);
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = null;
        }
        UA9.LJJIIJ(u7f, arrayList, arrayList2, false, LJIILL, str, afS8S0100100_13.j1, C31012CFc.LIZIZ());
    }

    public static final void accept$24(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        Long it = (Long) obj;
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog = (GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0;
        o.LJIIIIZZ(it, "it");
        gameLinkGuestBeInvitedDialog.LJLLJ = it.longValue();
        if (it.longValue() > afS8S0100100_13.j1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("maxCountDownValue:");
            LIZ.append(afS8S0100100_13.j1);
            LIZ.append(", current countdownValue:");
            LIZ.append(it);
            C1EW.LIZLLL(LIZ, ", it > max, just return", LIZ, "GameLinkGuestBeInvitedDialog");
            ((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).Dl();
            C74746TVe.LJFF("timeout", Long.valueOf(((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).LJLLJ), Boolean.valueOf(((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).xl()), CardStruct.IStatusCode.DEFAULT);
            ((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).dismiss();
            return;
        }
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog2 = (GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0;
        C2A7 c2a7 = gameLinkGuestBeInvitedDialog2.LJLJJI;
        if (c2a7 != null) {
            Context context = gameLinkGuestBeInvitedDialog2.getContext();
            if (context != null) {
                str = context.getString(R.string.n_7, C0EM.LIZIZ(it, afS8S0100100_13.j1));
            } else {
                str = null;
            }
            c2a7.setText(str);
        }
        if (it.longValue() != afS8S0100100_13.j1) {
            return;
        }
        C0NB.LJIIIZ("GameLinkGuestBeInvitedDialog", "dismissCountDown finish, dismiss dialog");
        ((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).Dl();
        C74746TVe.LJFF("timeout", Long.valueOf(((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).LJLLJ), Boolean.valueOf(((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).xl()), CardStruct.IStatusCode.DEFAULT);
        ((GameLinkGuestBeInvitedDialog) afS8S0100100_13.l0).dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$25(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        List<ShowListUser> list;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) afS8S0100100_13.l0;
        ShowContent showContent = ((ShowAgainGuestResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowAnchorViewModel.kv0(list, list2, false);
        C0NB.LIZIZ("LiveShowAnchorViewModel", "show again guest successful");
        if (C76548U2m.LJI.contains(Long.valueOf(afS8S0100100_13.j1))) {
            C76548U2m.LJI.remove(Long.valueOf(afS8S0100100_13.j1));
        }
    }

    public static final void accept$26(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Context context;
        Throwable th = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS8S0100100_13.j1, "update_setting", "change_layout", th);
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) ((C74843TYx) afS8S0100100_13.l0).mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        BPP.LIZLLL(context, th, R.string.sp2);
    }

    public static final void accept$27(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        ((U71) afS8S0100100_13.l0).LJJLI(afS8S0100100_13.j1, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$28(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        boolean z;
        BaseResponse baseResponse = (BaseResponse) obj;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "list_by_type", str, null);
        ((LinkedHashMap) ((C75782Tog) afS8S0100100_13.l0).LJLJLJ).clear();
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            C75782Tog c75782Tog = (C75782Tog) afS8S0100100_13.l0;
            Iterator<LinkPlayerInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                LinkPlayerInfo next = it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("online users ");
                LIZ.append(next.mInteractIdStr);
                C75782Tog.LIZLLL(X1D.LIZIZ(LIZ));
                Map<String, LinkPlayerInfo> map = c75782Tog.LJLJLJ;
                String str2 = next.mInteractIdStr;
                o.LJIIIIZZ(str2, "user.interactIdStr");
                map.put(str2, next);
                CopyOnWriteArrayList<AbstractC75784Toi> copyOnWriteArrayList = c75782Tog.LJLIL;
                ArrayList arrayList2 = new ArrayList();
                Iterator<AbstractC75784Toi> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC75784Toi next2 = it2.next();
                    if (next2 instanceof C75783Toh) {
                        arrayList2.add(next2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (o.LJ(((C75783Toh) next3).LJI, next.mInteractIdStr)) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C75783Toh c75783Toh = (C75783Toh) it4.next();
                    int i = c75782Tog.LJLJL;
                    int i2 = 1;
                    if (c75783Toh.LJII == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c75783Toh.LJII = next;
                    if (z) {
                        c75783Toh.LJIIIIZZ(i, c75783Toh.LJIIIZ, c75783Toh.LJIJ);
                        if (c75783Toh.LJIJI) {
                            i2 = 2;
                        }
                        c75783Toh.LJII(i2);
                    }
                }
            }
        }
    }

    public static final void accept$29(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Context context;
        Throwable th = (Throwable) obj;
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS8S0100100_13.j1, "list_by_type", null, th);
        C75794Tos c75794Tos = ((C75782Tog) afS8S0100100_13.l0).LJLLI;
        if (c75794Tos != null) {
            context = c75794Tos.LIZJ;
        } else {
            context = null;
        }
        BPP.LIZJ(context, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        BaseResponse baseResponse = (BaseResponse) obj;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "list_by_type", str, null);
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) afS8S0100100_13.l0;
            ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
            if (arrayList != null) {
                multiGuestV3GuestPresenter.getMultiGuestDataHolder().LJJIFFI = arrayList;
            }
            multiGuestV3GuestPresenter.setSelfGift2AnchorScore(multiLiveGuestInfoList.requestUserGiftScore);
            DataChannel dataChannel = multiGuestV3GuestPresenter.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(MultiGuestGuestSelfSendGiftData.class, Long.valueOf(multiLiveGuestInfoList.requestUserGiftScore));
            }
        }
    }

    public static final void accept$4(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        Throwable th = (Throwable) obj;
        C74987Tbr.LIZJ("anchor_shared_bg", "onSelectSharedBg, update settings fail");
        C30868C9o.LIZJ(R.string.sp2);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS8S0100100_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS8S0100100_13.j1, "change_sahred_bg", "change_sahred_bg", th);
    }

    public static final void accept$5(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        C278417k<Long, Boolean> c278417k;
        BaseResponse it = (BaseResponse) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long j = afS8S0100100_13.j1;
        o.LJIIIIZZ(it, "it");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "logid", it.LIZIZ);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - C76271TwZ.LJIIL);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myu));
        C76278Twg c76278Twg = (C76278Twg) afS8S0100100_13.l0;
        c76278Twg.LJIILJJIL = true;
        C76244Tw8 LJII = c76278Twg.LJII();
        if (LJII != null && (c278417k = LJII.LJIILLIIL) != null) {
            c278417k.put(Long.valueOf(afS8S0100100_13.j1), Boolean.TRUE);
        }
        C76244Tw8 LJII2 = ((C76278Twg) afS8S0100100_13.l0).LJII();
        if (LJII2 == null) {
            return;
        }
        LJII2.LJIJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        BaseResponse baseResponse = (BaseResponse) obj;
        long LIZIZ = C31012CFc.LIZIZ() - afS8S0100100_13.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "list_by_type", str, null);
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            ((TQV) afS8S0100100_13.l0).getMultiGuestDataHolder().LJJIFFI = arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        C75492Tk0 c75492Tk0 = (C75492Tk0) afS8S0100100_13.l0;
        long j = afS8S0100100_13.j1;
        BaseResponse baseResponse = (BaseResponse) obj;
        c75492Tk0.getClass();
        C74824TYe.LIZLLL(new ARunnableS3S0100200_13(C31012CFc.LIZIZ(), j, baseResponse, 1));
        T t = baseResponse.data;
        if (t != 0 && (multiGuestPermissionInfo = ((MultiGuestAnchorPermissionResponse) t).permissionInfo) != null && multiGuestPermissionInfo.flag) {
            ((InterfaceC75495Tk3) c75492Tk0.mView).kr0(true);
            C74736TUu.LJIILLIIL(null, true);
            MultiGuestPermissionInfo multiGuestPermissionInfo2 = ((MultiGuestAnchorPermissionResponse) baseResponse.data).permissionInfo;
            long j2 = multiGuestPermissionInfo2.errCode;
            if (j2 == 4003036) {
                c75492Tk0.dataChannel.rv0(MultiLivePermitChannel.class, new C74777TWj(true, multiGuestPermissionInfo2.noPermissionPrompt, (int) j2));
                return;
            }
            return;
        }
        ((InterfaceC75495Tk3) c75492Tk0.mView).kr0(false);
        C74736TUu.LJIILLIIL(null, false);
    }

    public static final void accept$8(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        C75492Tk0 c75492Tk0 = (C75492Tk0) afS8S0100100_13.l0;
        long j = afS8S0100100_13.j1;
        Throwable th = (Throwable) obj;
        c75492Tk0.getClass();
        C74824TYe.LIZLLL(new ARunnableS3S0100200_13(C31012CFc.LIZIZ(), j, th, 0));
        ((InterfaceC75495Tk3) c75492Tk0.mView).kr0(false);
        TVU.LJIIZILJ("multi-guest", th);
        C74736TUu.LJIILLIIL(th, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS8S0100100_13 afS8S0100100_13, Object obj) {
        T t;
        List<CohostListUser> list;
        C75492Tk0 c75492Tk0 = (C75492Tk0) afS8S0100100_13.l0;
        long j = afS8S0100100_13.j1;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (c75492Tk0.mView == 0 || baseResponse == null || (t = baseResponse.data) == 0 || (list = ((LinkmicListResponse) t).users) == null || list.size() <= 1) {
            return;
        }
        int i = 0;
        long j2 = 0;
        boolean z = false;
        for (CohostListUser cohostListUser : list) {
            if (cohostListUser.linkmicUserStatus == 1) {
                i++;
                if (cohostListUser.userId.longValue() == c75492Tk0.LJLJJI.getOwner().getId()) {
                    z = true;
                } else {
                    j2 = cohostListUser.userId.longValue();
                }
            }
        }
        if (i > 1) {
            if (z) {
                C0NB.LIZIZ("Identify", "onCoHostTurnedOn ");
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                LIZIZ.LJI = j2;
                if (j > 0) {
                    LIZIZ.LJFF = j;
                    LinkCrossRoomDataHolder.LJLJJI = j;
                    LIZIZ.LIZJ = true;
                }
                LIZIZ.LJIIL(j, EnumC75524TkW.ROOM_ENTER);
                ((InterfaceC75495Tk3) c75492Tk0.mView).EQ(true);
                C75600Tlk c75600Tlk = new C75600Tlk();
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
                if (C75877TqD.LJ != 0) {
                    AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "duration", Long.valueOf(SystemClock.uptimeMillis() - C75877TqD.LJ), true);
                }
                c75600Tlk.LJIILLIIL("sei_identify_succeed");
                return;
            }
            new C75600Tlk().LJIJ(j, new C276516r(102, new Throwable("linked_list_without_anchor")));
            return;
        }
        new C75600Tlk().LJIJ(j, new C276516r(101, new Throwable("not_in_cohost")));
    }

    public AfS8S0100100_13(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
