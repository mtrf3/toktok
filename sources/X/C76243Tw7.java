package X;

import com.bytedance.android.live.liveinteract.cohost.model.RtcMessage;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchMeanwhileSceneInviteEvent;
import com.bytedance.android.live.liveinteract.multimatch.rtc.MatchRtcInviteMessage;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tw7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76243Tw7<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ C76234Tvy LJLJJI;
    public final /* synthetic */ C76280Twi LJLJJL;
    public final /* synthetic */ java.util.Map<Long, Boolean> LJLJJLL;

    public C76243Tw7(int i, long j, AqS163S0100000_13 aqS163S0100000_13, C76234Tvy c76234Tvy, C76280Twi c76280Twi, java.util.Map map) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = aqS163S0100000_13;
        this.LJLJJI = c76234Tvy;
        this.LJLJJL = c76280Twi;
        this.LJLJJLL = map;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        InterfaceC74695TTf LLIIJLIL;
        java.util.Set<Long> keySet;
        BattleABTestList battleABTestList;
        java.util.Set<Long> keySet2;
        int state;
        Integer num;
        Long l;
        BaseResponse response = (BaseResponse) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        int i = this.LJLIL;
        long j7 = this.LJLILLLLZI;
        o.LJIIIIZZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "invite_type", jSONObject);
        C05630Jz.LJFF(jSONObject, "teammate_id", j7);
        C05630Jz.LIZ(1, "team_id", jSONObject);
        MultiInviteResponse multiInviteResponse = (MultiInviteResponse) response.data;
        if (multiInviteResponse != null && (l = multiInviteResponse.battleId) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "role_type", "inviter");
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        C76271TwZ.LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "cost", C30725C4b.LIZ() - C76271TwZ.LIZJ);
        C05630Jz.LJFF(jSONObject2, "invite_message_create_cost", response.extra.now - C76271TwZ.LIZJ);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJI(jSONObject3, "role_type", "inviter");
        c76271TwZ.LJL("invite_succeed", jSONObject, jSONObject3, jSONObject2, false);
        C0NB.LIZIZ("MultiMatchInvitePresent", "meanwhile scene invite response arrived");
        this.LJLJI.invoke();
        MultiInviteResponse multiInviteResponse2 = (MultiInviteResponse) response.data;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        Long l2 = multiInviteResponse2.battleId;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        List<C75883TqJ> value = this.LJLJJI.LJLJJL.LJ.getValue();
        List<C75883TqJ> value2 = this.LJLJJI.LJLJJL.LJFF.getValue();
        C76236Tw0 c76236Tw0 = this.LJLJJI.LJLJJI;
        EnumC76319TxL enumC76319TxL = c76236Tw0.LIZJ;
        boolean z2 = c76236Tw0.LIZLLL;
        long LJIILLIIL = C75832TpU.LJIILLIIL();
        if (value != null) {
            Iterator<C75883TqJ> it = value.iterator();
            while (it.hasNext()) {
                long j8 = it.next().LIZ;
                if (j8 != LJIILLIIL) {
                    c75832TpU.LJJI(j2, true, value, value2, j8, LJIILLIIL, enumC76319TxL, z2);
                }
            }
        }
        if (value2 != null) {
            Iterator<C75883TqJ> it2 = value2.iterator();
            while (it2.hasNext()) {
                long j9 = it2.next().LIZ;
                if (j9 != LJIILLIIL) {
                    c75832TpU.LJJI(j2, true, value, value2, j9, LJIILLIIL, enumC76319TxL, z2);
                }
            }
        }
        C76234Tvy c76234Tvy = this.LJLJJI;
        if (c76234Tvy.LJLJJL.LJIIL) {
            C0NB.LIZIZ("MultiMatchInvitePresent", "meanwhile scene invite response intercepted");
            return;
        }
        long j10 = 1;
        if (multiInviteResponse2.meanwhileInviteScene == 0 && this.LJLJJL.LJIILL == 0) {
            boolean z3 = c76234Tvy.LJLJJI.LIZLLL;
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            Long l3 = multiInviteResponse2.battleId;
            if (l3 != null) {
                j6 = l3.longValue();
            } else {
                j6 = 0;
            }
            int value3 = (int) LiveInteractBattleDurationSetting.INSTANCE.getValue();
            long LIZ = C30725C4b.LIZ();
            ArrayList arrayList = new ArrayList();
            java.util.Map<Long, Integer> map = C76268TwW.LIZIZ;
            if (map != null && (keySet2 = map.keySet()) != null) {
                Iterator<Long> it3 = keySet2.iterator();
                while (it3.hasNext()) {
                    long longValue = it3.next().longValue();
                    BattleInviteeGiftPermission battleInviteeGiftPermission = new BattleInviteeGiftPermission();
                    battleInviteeGiftPermission.userId = longValue;
                    java.util.Map<Long, Integer> map2 = C76268TwW.LIZIZ;
                    if (map2 != null && (num = map2.get(Long.valueOf(longValue))) != null) {
                        state = num.intValue();
                    } else {
                        state = EnumC62432ch.UnknownType.getState();
                    }
                    battleInviteeGiftPermission.giftPermissionType = state;
                    arrayList.add(battleInviteeGiftPermission);
                }
            }
            List<C75883TqJ> value4 = c76234Tvy.LJLJJL.LJ.getValue();
            List<C75883TqJ> value5 = c76234Tvy.LJLJJL.LJFF.getValue();
            ArrayList arrayList2 = new ArrayList();
            TeamUsersInfo teamUsersInfo = new TeamUsersInfo();
            teamUsersInfo.userIds = new ArrayList();
            if (value4 != null) {
                for (C75883TqJ c75883TqJ : value4) {
                    teamUsersInfo.teamId = j10;
                    teamUsersInfo.userIds.add(Long.valueOf(c75883TqJ.LIZ));
                    j10 = 1;
                }
            }
            TeamUsersInfo teamUsersInfo2 = new TeamUsersInfo();
            teamUsersInfo2.userIds = new ArrayList();
            if (value5 != null) {
                for (C75883TqJ c75883TqJ2 : value5) {
                    teamUsersInfo2.teamId = 2L;
                    teamUsersInfo2.userIds.add(Long.valueOf(c75883TqJ2.LIZ));
                }
            }
            arrayList2.add(teamUsersInfo);
            arrayList2.add(teamUsersInfo2);
            ArrayList arrayList3 = new ArrayList();
            java.util.Map<Long, BattleABTestList> map3 = C76268TwW.LIZJ;
            if (map3 != null && (keySet = map3.keySet()) != null) {
                Iterator<Long> it4 = keySet.iterator();
                while (it4.hasNext()) {
                    long longValue2 = it4.next().longValue();
                    BattleABTestSetting battleABTestSetting = new BattleABTestSetting();
                    battleABTestSetting.uid = Long.valueOf(longValue2);
                    java.util.Map<Long, BattleABTestList> map4 = C76268TwW.LIZJ;
                    if (map4 != null) {
                        battleABTestList = map4.get(Long.valueOf(longValue2));
                    } else {
                        battleABTestList = null;
                    }
                    battleABTestSetting.abTestList = battleABTestList;
                    arrayList3.add(battleABTestSetting);
                }
            }
            MatchRtcInviteMessage matchRtcInviteMessage = new MatchRtcInviteMessage(z3 ? 1 : 0, currentUserId, j6, value3, LIZ, arrayList, arrayList2, arrayList3);
            Long value6 = c76234Tvy.LJLJJL.LIZ.getValue();
            if (value6 == null) {
                value6 = 0L;
            }
            long longValue3 = value6.longValue();
            Gson gson = C09650Zl.LIZJ;
            RtcMessage rtcMessage = new RtcMessage("team_match_invite_msg", longValue3, GsonProtectorUtils.toJson(gson, matchRtcInviteMessage));
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
                String json = GsonProtectorUtils.toJson(gson, rtcMessage);
                o.LJIIIIZZ(json, "getDefault().toJson(rtcMessage)");
                LLIIJLIL.sendRoomMessage(json);
            }
            C76271TwZ c76271TwZ2 = C76271TwZ.LIZ;
            JSONObject jSONObject4 = new JSONObject();
            c76271TwZ2.LJL("send_invite_rtc_msg", jSONObject4, jSONObject4, jSONObject4, false);
        }
        Long l4 = multiInviteResponse2.battleId;
        if (l4 != null) {
            j3 = l4.longValue();
        } else {
            j3 = 0;
        }
        C76265TwT.LJIIIIZZ = j3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("invite, result = ");
        LIZ2.append(multiInviteResponse2);
        C0NB.LJIIIZ("MultiMatchInvitePresent", X1D.LIZIZ(LIZ2));
        C76280Twi c76280Twi = this.LJLJJL;
        c76280Twi.LJIILIIL = true;
        Long l5 = multiInviteResponse2.battleId;
        if (l5 != null) {
            j4 = l5.longValue();
        } else {
            j4 = 0;
        }
        c76280Twi.LJIIJJI(j4);
        this.LJLJJI.LJLJJL.LIZLLL.setValue(multiInviteResponse2.battleId);
        MultiMatchInviteContract$AbsView multiMatchInviteContract$AbsView = (MultiMatchInviteContract$AbsView) this.LJLJJI.LJLILLLLZI;
        if (multiMatchInviteContract$AbsView != null) {
            multiMatchInviteContract$AbsView.Al();
        }
        if (this.LJLJJI.LJLJJI.LIZLLL) {
            C30868C9o.LIZJ(R.string.nwe);
        }
        if (multiInviteResponse2.meanwhileInviteScene != 1) {
            return;
        }
        this.LJLJJI.LJLJJL.LJIIJJI = System.currentTimeMillis();
        this.LJLJJL.LJIILIIL = false;
        List<TeamUser> list = multiInviteResponse2.battleTeamUser;
        if (list != null) {
            java.util.Map<Long, Boolean> map5 = this.LJLJJLL;
            C76234Tvy c76234Tvy2 = this.LJLJJI;
            for (TeamUser teamUser : list) {
                if (teamUser.teamId == 1) {
                    List<Long> list2 = teamUser.userIds;
                    if (list2 != null && (!list2.isEmpty()) && list2 != null) {
                        j5 = ((Number) ListProtector.get(list2, 0)).longValue();
                    } else {
                        j5 = 0;
                    }
                    map5.put(Long.valueOf(j5), Boolean.TRUE);
                    c76234Tvy2.LJLJJL.LJIIIIZZ = j5;
                }
            }
        }
        this.LJLJJL.LJIILL(EnumC76178Tv4.RECEIVED, false);
        C76236Tw0 c76236Tw02 = this.LJLJJI.LJLJJI;
        c76236Tw02.LIZ.qv0(MultiMatchMeanwhileSceneInviteEvent.class, Boolean.valueOf(c76236Tw02.LIZLLL));
    }
}
