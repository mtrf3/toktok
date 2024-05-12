package X;

import Y.ARunnableS32S0200000_13;
import Y.AfS0S0201100_13;
import Y.AfS19S0210000_13;
import Y.AfS29S0110000_13;
import Y.AfS5S0111000_13;
import Y.AfS65S0100000_13;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostCmdDismissLinkDialogEvent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDismissInvitePanelWhenFinishSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFinishOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.model.message.battle.ExemptStrategy;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamMatchCampaign;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76278Twg extends AbstractC76282Twk<InterfaceC76311TxD> {
    public InterfaceC92693kP LJII;
    public C76096Ttk LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public C76802UCg LJIILLIIL;
    public Long LJIJ;
    public List<TeamUsersInfo> LJIJI;
    public List<C75883TqJ> LJIJJ;
    public String LJIJJLI;
    public final IMultiHostService LJI = C8E.LIZLLL();
    public final Handler LJIIZILJ = new Handler(C16880lQ.LLJJJJ());
    public final C74639TRb LJIL = new C74639TRb();
    public final C56085Lzl LJJ = new C56085Lzl(false, -1, 0);

    @Override // X.AbstractC76282Twk
    public final void LJIIL(LinkMicBattleVictoryLapMessage message) {
        o.LJIIIZ(message, "message");
    }

    public static boolean LJJIIZI() {
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJI() && (c76280Twi.LJ() == EnumC76178Tv4.INVITED || c76280Twi.LJ() == EnumC76178Tv4.RECEIVED)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[EDGE_INSN: B:31:0x0056->B:22:0x0056 BREAK  A[LOOP:1: B:13:0x003b->B:29:0x003b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJJL() {
        /*
            X.Twi r0 = X.C76265TwT.LIZ
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation> r0 = r0.LJFF
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L60
            java.util.Iterator r6 = r0.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation) r0
            long r3 = r0.userId
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
        L2d:
            com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation r5 = (com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation) r5
            if (r5 == 0) goto L60
            long r0 = r5.bestTeammateId
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L37:
            java.util.Iterator r6 = X.C08880Wm.LIZLLL()
        L3b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.TqJ r0 = (X.C75883TqJ) r0
            long r3 = r0.LIZ
            if (r7 != 0) goto L4d
            goto L3b
        L4d:
            long r1 = r7.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            r8 = r5
        L56:
            X.TqJ r8 = (X.C75883TqJ) r8
            if (r8 != 0) goto L5b
        L5a:
            return
        L5b:
            r8.LJIJ = r9
            goto L5a
        L5e:
            r5 = r8
            goto L2d
        L60:
            r7 = r8
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJJJJL():void");
    }

    public final void LJJJJI() {
        InterfaceC92693kP interfaceC92693kP;
        C56085Lzl c56085Lzl = this.LJJ;
        c56085Lzl.LJLILLLLZI = false;
        c56085Lzl.LJLJI = -1;
        InterfaceC92693kP interfaceC92693kP2 = this.LJII;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJII) != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.AbstractC76282Twk
    public final void LIZLLL() {
        List<TeamUsersInfo> list;
        long j;
        InterfaceC75441TjB LJJIJL;
        User owner;
        C76244Tw8 LJII = LJII();
        if (LJII != null) {
            list = LJII.LJIILL;
        } else {
            list = null;
        }
        this.LJIJI = list;
        Room room = this.LJ;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        LJJJJJ(j, null);
        super.LIZLLL();
        C76096Ttk c76096Ttk = this.LJIIIIZZ;
        if (c76096Ttk != null && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null) {
            LJJIJL.LLIILII(c76096Ttk);
        }
        C76802UCg c76802UCg = this.LJIILLIIL;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        C76265TwT.LJII(0, "destroy");
        DataChannel LJI = LJI();
        if (LJI != null) {
            LJI.jv0(this);
        }
        LJJJJI();
        this.LJIJ = null;
    }

    public static void LJJIJIIJIL(C76278Twg c76278Twg) {
        c76278Twg.getClass();
        if (!C76265TwT.LIZ.LJIILL(EnumC76178Tv4.FINISH, false)) {
            return;
        }
        LJIJJLI(c76278Twg, 106, false, 0L, null, 0, 0L, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    public static List LJJJJIZL(BattleInfoResponse battleInfoResponse) {
        Collection<BattleTeamUserArmies> values;
        long j;
        ArrayList arrayList = new ArrayList();
        java.util.Map<Long, BattleTeamUserArmies> map = battleInfoResponse.teamArmies;
        if (map != null && (values = map.values()) != null) {
            for (BattleTeamUserArmies battleTeamUserArmies : values) {
                Long l = battleTeamUserArmies.teamId;
                ArrayList arrayList2 = new ArrayList();
                List<BattleTeamUser> list = battleTeamUserArmies.teamUsers;
                long j2 = 0;
                if (list != null) {
                    Iterator<BattleTeamUser> it = list.iterator();
                    while (it.hasNext()) {
                        Long l2 = it.next().userId;
                        if (l2 != null) {
                            j = l2.longValue();
                        } else {
                            j = 0;
                        }
                        arrayList2.add(Long.valueOf(j));
                    }
                }
                TeamUsersInfo teamUsersInfo = new TeamUsersInfo();
                if (l != null) {
                    j2 = l.longValue();
                }
                teamUsersInfo.teamId = j2;
                teamUsersInfo.userIds = arrayList2;
                arrayList.add(teamUsersInfo);
            }
        }
        return arrayList;
    }

    public static final void LJJJJL(List<BattleUserArmy> list) {
        BattleDisplayConfig battleDisplayConfig;
        ExemptStrategy exemptStrategy;
        int i;
        int i2;
        BattleUserArmy battleUserArmy;
        if (list == null || list.isEmpty() || (battleDisplayConfig = C76265TwT.LIZ.LJJIJIIJIL) == null || (exemptStrategy = battleDisplayConfig.exemptStrategy) == null || (i = exemptStrategy.exemptAudienceTop) <= 0) {
            return;
        }
        int i3 = 0;
        do {
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i3 < i2 && list != null && (battleUserArmy = (BattleUserArmy) ListProtector.get(list, i3)) != null && battleUserArmy.userId == C025908h.LIZ()) {
                C76265TwT.LIZ.getClass();
            }
            i3++;
        } while (i3 < i);
    }

    @Override // X.AbstractC76282Twk
    public final void LJ(LinkMicBattleArmiesMessage message) {
        List<BattleTeamUserArmies> list;
        List<BattleTeamUserArmies> list2;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LIZ;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (list = message.teamArmies) != null) {
                for (BattleTeamUserArmies battleTeamUserArmies : list) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LIZ;
                    if (linkMicBattleArmiesMessage2 != null && (list2 = linkMicBattleArmiesMessage2.teamArmies) != null) {
                        for (BattleTeamUserArmies battleTeamUserArmies2 : list2) {
                            if (o.LJ(battleTeamUserArmies2.teamId, battleTeamUserArmies.teamId) && battleTeamUserArmies2.teamTotalScore > battleTeamUserArmies.teamTotalScore) {
                                z = false;
                            }
                        }
                    }
                }
                if (!z) {
                    return;
                }
            }
            this.LIZIZ = message;
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 51));
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIIZ(LinkMicBattleArmiesMessage message) {
        long j;
        List<BattleUserArmy> list;
        Object obj;
        List<BattleUserArmy> list2;
        Object obj2;
        DataChannel LJI;
        DataChannel LJI2;
        List<BattleUserArmy> list3;
        BattleUserArmies battleUserArmies;
        o.LJIIIZ(message, "message");
        boolean z = true;
        if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
            C76271TwZ.LIZ.LJJLIIIJL(true, "battle_id_invalid", message);
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIIJJI = message.hasTeamMatchMvpSfx;
        if (message.triggerReason == EnumC76332TxY.OPT_OUT_UPDATE.getValue()) {
            List list4 = message.teamArmies;
            if (list4 == null) {
                list4 = C61878OQg.INSTANCE;
            }
            long j2 = c76280Twi.LJJJJJ;
            long j3 = 1;
            if (j2 == 1) {
                j3 = 2;
            }
            Iterator it = list4.iterator();
            while (true) {
                list = null;
                if (it.hasNext()) {
                    obj = it.next();
                    Long l = ((BattleTeamUserArmies) obj).teamId;
                    if (l != null && l.longValue() == j2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BattleTeamUserArmies battleTeamUserArmies = (BattleTeamUserArmies) obj;
            if (battleTeamUserArmies != null && (battleUserArmies = battleTeamUserArmies.userArmies) != null) {
                list2 = battleUserArmies.userArmies;
            } else {
                list2 = null;
            }
            LJJJJL(list2);
            if (battleTeamUserArmies != null && (LJI2 = LJI()) != null) {
                BattleUserArmies battleUserArmies2 = battleTeamUserArmies.userArmies;
                if (battleUserArmies2 != null) {
                    list3 = battleUserArmies2.userArmies;
                } else {
                    list3 = null;
                }
                LJI2.rv0(BattleMvpLeftListChannel.class, list3);
            }
            Iterator it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    Long l2 = ((BattleTeamUserArmies) obj2).teamId;
                    if (l2 != null && l2.longValue() == j3) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            BattleTeamUserArmies battleTeamUserArmies2 = (BattleTeamUserArmies) obj2;
            if (battleTeamUserArmies2 != null && (LJI = LJI()) != null) {
                BattleUserArmies battleUserArmies3 = battleTeamUserArmies2.userArmies;
                if (battleUserArmies3 != null) {
                    list = battleUserArmies3.userArmies;
                }
                LJI.rv0(BattleMvpRightListChannel.class, list);
            }
        } else if (!this.LJIILIIL) {
            java.util.Map<Long, Long> map = c76280Twi.LJJIJL;
            java.util.Map<Long, BattleUserArmies> map2 = message.armies;
            if (map2 != null) {
                Iterator<Map.Entry<Long, BattleUserArmies>> it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    Long l3 = (Long) ((HashMap) map).get(it3.next().getKey());
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    if (j > r2.getValue().hostScore) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LinkMicBattleArmiesMessage can't update score, multi anchor jump and triggerReason = ");
                    LIZ.append(message.triggerReason);
                    C0NB.LJ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
                }
            }
            List list5 = message.teamArmies;
            if (list5 == null) {
                list5 = C61878OQg.INSTANCE;
            }
            LJJJJLI(this, list5);
        } else {
            C76271TwZ.LIZ.LJJLIIIJL(true, "not_in_batting", message);
        }
        this.LIZ = message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC76282Twk
    public final void LJIIJ(LinkMicBattleMessage message) {
        C76280Twi c76280Twi;
        int i;
        EnumC76391TyV enumC76391TyV;
        C76280Twi c76280Twi2;
        int i2;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        List<C75883TqJ> value;
        String str;
        String str2;
        DataChannel LJI;
        Long l;
        C76244Tw8 LJII;
        long LIZIZ;
        C76280Twi c76280Twi3;
        boolean z;
        int i3;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        List<C75883TqJ> value2;
        String str3;
        String str4;
        long LIZIZ2;
        Long l2;
        long value3;
        boolean z2;
        C278417k<Long, Boolean> c278417k;
        boolean z3;
        Long l3;
        String str5;
        List<Long> list;
        Long l4;
        o.LJIIIZ(message, "message");
        String str6 = "inviter";
        String str7 = "";
        Boolean bool = null;
        List<TeamUsersInfo> list2 = null;
        bool = null;
        switch (message.action) {
            case 2:
                C76271TwZ c76271TwZ = C76271TwZ.LIZ;
                boolean z4 = true;
                if (message.battleSetting.inviteType == 1) {
                    c76280Twi = C76265TwT.LIZIZ;
                } else {
                    c76280Twi = C76265TwT.LIZ;
                }
                JSONObject jSONObject = new JSONObject();
                C76271TwZ.LJIJJ(message, jSONObject);
                if (message.battleSetting.inviteType != 1) {
                    z4 = false;
                }
                C76271TwZ.LJJ(jSONObject, z4);
                JSONObject jSONObject2 = new JSONObject();
                if (!c76280Twi.LJIILIIL) {
                    str6 = "invitee";
                }
                C05630Jz.LJI(jSONObject2, "role_type", str6);
                if (c76280Twi.LJ() == EnumC76178Tv4.INVITED) {
                    i = 1;
                } else {
                    i = 0;
                }
                C05630Jz.LIZ(i, "is_inviting", jSONObject2);
                c76271TwZ.LJJZZI("reject_message", jSONObject, jSONObject2, new JSONObject(), false);
                boolean z5 = true;
                C76261TwP.LIZ = true;
                if (message.battleSetting.inviteType != 1) {
                    z5 = false;
                }
                AbstractC76282Twk.LIZJ(this, message.battleId, z5, 4);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handleRejectMsg ");
                V1I.LIZJ(LIZ, message.actionByUserId, " isReMatch:", z5);
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
                InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD != null) {
                    enumC76391TyV = interfaceC76311TxD.LJLLLL(1);
                } else {
                    enumC76391TyV = null;
                }
                if (enumC76391TyV == EnumC76391TyV.MULTI_MATCH_BE_INVITED && (LJI = LJI()) != null && (l = (Long) LJI.kv0(BattleInvitingTimeLeftChannel.class)) != null && l.longValue() > 0 && (LJII = LJII()) != null) {
                    Long valueOf = Long.valueOf(LJII.LJIIIIZZ);
                    List<TeamUsersInfo> list3 = LJII.LJIIIZ;
                    if (message.battleSetting.inviteType == 1) {
                        LIZIZ = C76265TwT.LIZIZ.LIZIZ();
                    } else {
                        LIZIZ = C76265TwT.LIZ.LIZIZ();
                    }
                    C75832TpU.LIZ.LJJ(false, true, valueOf, list3, LIZIZ, false);
                }
                C76244Tw8 LJII2 = LJII();
                if (LJII2 != null && (mutableLiveData = LJII2.LIZIZ) != null && (value = mutableLiveData.getValue()) != null) {
                    for (C75883TqJ c75883TqJ : value) {
                        if (c75883TqJ.LIZ == message.actionByUserId) {
                            C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
                            if (c75768ToS != null) {
                                str = c75768ToS.LIZ;
                                str2 = c75768ToS.LIZIZ;
                            } else {
                                str = null;
                                str2 = null;
                            }
                            str7 = C05170If.LIZIZ(str, str2);
                            o.LJIIIIZZ(str7, "getDisplayName(it.userIn…d, it.userInfo?.nickName)");
                        }
                    }
                }
                if (z5) {
                    c76280Twi2 = C76265TwT.LIZIZ;
                } else {
                    c76280Twi2 = C76265TwT.LIZ;
                }
                EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
                EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
                if (LJ == enumC76178Tv4 || C76265TwT.LIZIZ.LJ() == enumC76178Tv4) {
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.my_, str7));
                    if (!z5) {
                        LJJIJIL(2);
                    }
                } else {
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.mya, str7));
                }
                long j = c76280Twi2.LJIILL;
                if (z5) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                C76265TwT.LJII(i2, "reject");
                if (!z5) {
                    c76280Twi2.LJIILL = j;
                }
                C76265TwT.LJIIL.put(Long.valueOf(message.battleId), Boolean.TRUE);
                return;
            case 3:
                boolean z6 = true;
                C76271TwZ c76271TwZ2 = C76271TwZ.LIZ;
                BattleSetting battleSetting = message.battleSetting;
                if (battleSetting == null || battleSetting.inviteType != 1) {
                    z6 = false;
                }
                JSONObject jSONObject3 = new JSONObject();
                C76271TwZ.LJIJJ(message, jSONObject3);
                C76271TwZ.LJJ(jSONObject3, z6);
                JSONObject jSONObject4 = new JSONObject();
                if (z6) {
                    c76280Twi3 = C76265TwT.LIZIZ;
                } else {
                    c76280Twi3 = C76265TwT.LIZ;
                }
                if (!c76280Twi3.LJIILIIL) {
                    str6 = "invitee";
                }
                C05630Jz.LJI(jSONObject4, "role_type", str6);
                c76271TwZ2.LJL("cancel_message", jSONObject3, jSONObject4, new JSONObject(), false);
                if (message.battleSetting.inviteType == 1) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("handleCancelMsg ");
                V1I.LIZJ(LIZ2, message.actionByUserId, ", isRematch:", z);
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ2));
                DataChannel LJI2 = LJI();
                if (LJI2 != null) {
                    LJI2.pv0(CoHostCmdDismissLinkDialogEvent.class);
                }
                InterfaceC76311TxD interfaceC76311TxD2 = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD2 != null) {
                    interfaceC76311TxD2.LJLLLL(2);
                }
                C76244Tw8 LJII3 = LJII();
                if (LJII3 != null && (mutableLiveData2 = LJII3.LIZIZ) != null && (value2 = mutableLiveData2.getValue()) != null) {
                    for (C75883TqJ c75883TqJ2 : value2) {
                        if (c75883TqJ2.LIZ == message.actionByUserId) {
                            C75768ToS c75768ToS2 = c75883TqJ2.LJIIZILJ;
                            if (c75768ToS2 != null) {
                                str3 = c75768ToS2.LIZ;
                                str4 = c75768ToS2.LIZIZ;
                            } else {
                                str3 = null;
                                str4 = null;
                            }
                            str7 = C05170If.LIZIZ(str3, str4);
                            o.LJIIIIZZ(str7, "getDisplayName(it.userIn…d, it.userInfo?.nickName)");
                        }
                    }
                }
                C76265TwT.LJIIL.put(Long.valueOf(message.battleId), Boolean.TRUE);
                C30868C9o.LJI(C15380j0.LJIILL(R.string.myb, str7));
                if (z) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                C76265TwT.LJII(i3, "cancel_message");
                return;
            case 4:
                LJJI(message, 0);
                return;
            case 5:
                C76271TwZ c76271TwZ3 = C76271TwZ.LIZ;
                JSONObject jSONObject5 = new JSONObject();
                C76271TwZ.LJIJJ(message, jSONObject5);
                C05630Jz.LJFF(jSONObject5, "client_and_server_diff_time", C31012CFc.LIZIZ);
                C76271TwZ.LJJ(jSONObject5, false);
                long j2 = C76265TwT.LIZ.LJJJJJ;
                long j3 = 1;
                if (j2 == 1) {
                    j3 = 2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<BattleTeamResult> list4 = message.teamBattleResult;
                if (list4 != null) {
                    int i4 = 0;
                    for (BattleTeamResult battleTeamResult : list4) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            BattleTeamResult battleTeamResult2 = battleTeamResult;
                            Long l5 = battleTeamResult2.teamId;
                            linkedHashMap.put(Long.valueOf(l5 != null ? l5.longValue() : i5), battleTeamResult2);
                            i4 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                C76271TwZ.LJJIFFI(jSONObject5, (BattleTeamResult) linkedHashMap.get(Long.valueOf(j2)), (BattleTeamResult) linkedHashMap.get(Long.valueOf(j3)));
                JSONObject jSONObject6 = new JSONObject();
                JSONObject jSONObject7 = new JSONObject();
                List<BattleTeamResult> list5 = message.teamBattleResult;
                if (list5 != null) {
                    C05630Jz.LJI(jSONObject5, "battle_result", GsonProtectorUtils.toJson(C09650Zl.LIZJ, list5));
                }
                C05630Jz.LJI(jSONObject5, WM7.SCENE_SERVICE, "finish_msg");
                C76271TwZ.LJJZZIII(c76271TwZ3, "update_result", jSONObject5, jSONObject6, jSONObject7, false, 16);
                if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
                    LIZIZ2 = C76273Twb.LIZ();
                } else {
                    LIZIZ2 = C30725C4b.LIZIZ();
                }
                C76280Twi c76280Twi4 = C76265TwT.LIZ;
                if (c76280Twi4.LIZLLL != null) {
                    l2 = Long.valueOf(r1.duration * 1000);
                } else {
                    l2 = null;
                }
                long j4 = LIZIZ2 - C76271TwZ.LJJIJL;
                if (l2 != null) {
                    value3 = l2.longValue();
                } else {
                    value3 = LiveInteractBattleDurationSetting.INSTANCE.getValue() * 1000;
                }
                long j5 = j4 - value3;
                if (j5 < 0) {
                    C05630Jz.LJFF(jSONObject5, "battle_remain_millis", Math.abs(j5));
                    c76271TwZ3.LJJIII(jSONObject5, true);
                }
                C76271TwZ.LJJZZIII(c76271TwZ3, "battle_finish_message", jSONObject5, jSONObject6, jSONObject7, false, 16);
                if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
                    return;
                }
                TeamMatchCampaign teamMatchCampaign = message.teamMatchCampaign;
                if (teamMatchCampaign != null) {
                    z2 = teamMatchCampaign.hasTeamMatchMvpSfx;
                } else {
                    z2 = false;
                }
                c76280Twi4.LJIIJJI = z2;
                c76280Twi4.LJJII = false;
                List<BattleTeamUserArmies> list6 = message.teamArmies;
                if (list6 != null) {
                    LJJJJLI(this, list6);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List<BattleTeamResult> list7 = message.teamBattleResult;
                if (list7 != null) {
                    int i6 = 0;
                    for (BattleTeamResult battleTeamResult3 : list7) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            BattleTeamResult battleTeamResult4 = battleTeamResult3;
                            Long l6 = battleTeamResult4.teamId;
                            linkedHashMap2.put(Long.valueOf(l6 != null ? l6.longValue() : i7), battleTeamResult4);
                            i6 = i7;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                InterfaceC76311TxD interfaceC76311TxD3 = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD3 != null) {
                    interfaceC76311TxD3.LJLLLL(0);
                }
                LJIJJ(1, message.battleSetting.status, 0L, linkedHashMap2);
                C76271TwZ.LIZ.LJLIIIL(true);
                return;
            case 6:
                C76271TwZ c76271TwZ4 = C76271TwZ.LIZ;
                JSONObject jSONObject8 = new JSONObject();
                C76271TwZ.LJIJJ(message, jSONObject8);
                C05630Jz.LJFF(jSONObject8, "battle_id", message.battleId);
                C76271TwZ.LJJ(jSONObject8, false);
                C76271TwZ.LJJZZIII(c76271TwZ4, "cut_short_message", jSONObject8, new JSONObject(), new JSONObject(), false, 16);
                if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
                    return;
                }
                C76280Twi c76280Twi5 = C76265TwT.LIZ;
                c76280Twi5.LJJII = true;
                c76280Twi5.LJJIFFI = true;
                if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                    LJJIJL(message.actionByUserId);
                }
                LJJJI(message.actionByUserId, null);
                InterfaceC76311TxD interfaceC76311TxD4 = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD4 != null) {
                    interfaceC76311TxD4.LJLLLL(0);
                }
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    C76244Tw8 LJII4 = LJII();
                    if (LJII4 != null && (c278417k = LJII4.LJIILLIIL) != null) {
                        bool = c278417k.get(Long.valueOf(message.battleId));
                    }
                    if (C29306Beo.LJIL(bool)) {
                        c76271TwZ4.LJJLJLI(true);
                    } else {
                        C76244Tw8 LJII5 = LJII();
                        if (LJII5 != null && LJII5.LJIJ) {
                            C76271TwZ.LJJLIL(101, true, 0L, 12);
                        }
                    }
                }
                LJJIJIIJI(this, "cut_short_msg", 6);
                return;
            case 7:
                LJJ(message, true);
                return;
            case 8:
                C76271TwZ c76271TwZ5 = C76271TwZ.LIZ;
                JSONObject jSONObject9 = new JSONObject();
                C76271TwZ.LJIJJ(message, jSONObject9);
                C05630Jz.LJFF(jSONObject9, "battle_id", message.battleId);
                C76271TwZ.LJJ(jSONObject9, false);
                C76271TwZ.LJJZZIII(c76271TwZ5, "quit_message", jSONObject9, new JSONObject(), new JSONObject(), false, 16);
                if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
                    return;
                }
                this.LJIILL = true;
                InterfaceC76311TxD interfaceC76311TxD5 = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD5 != null) {
                    interfaceC76311TxD5.LJLLLLLL(new AqS163S0100000_13(this, 282));
                }
                JSONObject jSONObject10 = new JSONObject();
                C76271TwZ.LJJ(jSONObject10, false);
                C76271TwZ.LJJZZIII(c76271TwZ5, "quit_pannel_show", jSONObject10, new JSONObject(), new JSONObject(), false, 16);
                EnumC76178Tv4 LJ2 = C76265TwT.LIZ.LJ();
                if ((EnumC76178Tv4.START.compareTo(LJ2) <= 0 && LJ2.compareTo(EnumC76178Tv4.FINISH) < 0) || EnumC76178Tv4.PUNISH.compareTo(LJ2) > 0 || LJ2.compareTo(EnumC76178Tv4.DRAW) >= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C75832TpU c75832TpU = C75832TpU.LIZ;
                C76244Tw8 LJII6 = LJII();
                if (LJII6 != null) {
                    list2 = LJII6.LJIILL;
                }
                if (!z3) {
                    DataChannel LJI3 = LJI();
                    if (LJI3 != null && (l4 = (Long) LJI3.kv0(BattleTimeLeftChannel.class)) != null) {
                        l4.longValue();
                    }
                    LiveInteractBattleDurationSetting.INSTANCE.getValue();
                } else {
                    DataChannel LJI4 = LJI();
                    if (LJI4 != null && (l3 = (Long) LJI4.kv0(BattlePunishTimeLeftChannel.class)) != null) {
                        l3.longValue();
                    }
                    LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                C75832TpU.LJFF(c75832TpU, linkedHashMap3, false, false, 6);
                C75832TpU.LJIILIIL(linkedHashMap3);
                C75832TpU.LJIILL(list2, linkedHashMap3);
                C75832TpU.LJIIIZ(c75832TpU, linkedHashMap3, true);
                linkedHashMap3.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
                if (!z3) {
                    str5 = "disconnect_pk";
                } else {
                    str5 = "disconnect_punish";
                }
                linkedHashMap3.put("request_type", str5);
                C75642TmQ.LJIILLIIL(linkedHashMap3, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
                Object obj = ((LinkedHashMap) C75832TpU.LJIIIIZZ).get("invitee_list");
                if (obj != 0) {
                    str7 = obj;
                }
                linkedHashMap3.put("invitee_list", str7);
                if (list2 != null) {
                    for (TeamUsersInfo teamUsersInfo : list2) {
                        if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ && (list = teamUsersInfo.userIds) != null) {
                            for (Long l7 : list) {
                                long LJIILLIIL = C75832TpU.LJIILLIIL();
                                if (l7 == null || l7.longValue() != LJIILLIIL) {
                                    linkedHashMap3.put("pk_inviter_id", String.valueOf(l7));
                                } else {
                                    linkedHashMap3.put("pk_invitee_id", String.valueOf(C75832TpU.LJIILLIIL()));
                                }
                            }
                        }
                    }
                }
                C75832TpU.LJI(linkedHashMap3, false);
                C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_disconnect_received", linkedHashMap3, "1");
                return;
            case 9:
                LJJIFFI(message, false);
                return;
            case 10:
                LJJIFFI(message, true);
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIJJI(LinkMicBattlePunishFinishMessage message) {
        boolean z;
        boolean z2;
        o.LJIIIZ(message, "message");
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        JSONObject jSONObject = new JSONObject();
        C76271TwZ.LJIJJLI(message, jSONObject);
        C05630Jz.LJFF(jSONObject, "client_and_server_diff_time", C31012CFc.LIZIZ);
        C76271TwZ.LJJ(jSONObject, false);
        C76271TwZ.LJJZZIII(c76271TwZ, "punish_finish_message", jSONObject, null, null, false, 28);
        if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        int i = message.reason;
        boolean z3 = true;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        c76280Twi.LJJIII = z;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c76280Twi.LJJIFFI = z2;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || message.opUid != ((C29374Bfu) LIZIZ).getCurrentUserId()) {
            z3 = false;
        }
        LJJIJ("punish_finish_msg", false, z3);
    }

    public final void LJJII(EnumC76319TxL enumC76319TxL) {
        if (this.LIZLLL == 0) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLIIIZ;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LINK_MIC_BATTLE_HAS_SHOW_GUIDE.value");
        if (LIZJ.booleanValue()) {
            LJJIIZ(enumC76319TxL, null, false);
            B5G.LIZIZ().LJJJJL = enumC76319TxL.getValue();
        } else {
            P p = this.LIZLLL;
            if (p != 0) {
                p.LJIIL(new AqS160S0200000_13(this, enumC76319TxL, 19), enumC76319TxL);
            }
            c48459J0d.LIZ(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Integer, O] */
    public final void LJJIII(LinkMicBattleMessage message) {
        boolean z;
        boolean z2;
        GiftModeMeta giftModeMeta;
        long j;
        long j2;
        long j3;
        Object obj;
        User owner;
        List<Long> list;
        java.util.Map<Long, Boolean> value;
        C75883TqJ c75883TqJ;
        long j4;
        List<BestTeammateRelation> list2;
        BestTeammateRelation bestTeammateRelation;
        User owner2;
        User owner3;
        DataChannel LJI;
        C76244Tw8 LJII;
        MutableLiveData<Long> mutableLiveData;
        GiftModeMeta giftModeMeta2;
        o.LJIIIZ(message, "message");
        boolean z3 = false;
        if (message.battleSetting.inviteType == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean LJJIL = LJJIL(message);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        EnumC76178Tv4 LJ = c76280Twi.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.RECEIVED;
        if (LJ == enumC76178Tv4 || C76265TwT.LIZIZ.LJ() == enumC76178Tv4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            C76280Twi c76280Twi2 = C76265TwT.LIZIZ;
            BattleSetting battleSetting = message.battleSetting;
            if (battleSetting != null) {
                giftModeMeta2 = battleSetting.giftModeMeta;
            } else {
                giftModeMeta2 = null;
            }
            c76280Twi2.LJIIL(giftModeMeta2);
        } else {
            BattleSetting battleSetting2 = message.battleSetting;
            if (battleSetting2 != null) {
                giftModeMeta = battleSetting2.giftModeMeta;
            } else {
                giftModeMeta = null;
            }
            c76280Twi.LJIIL(giftModeMeta);
        }
        long j5 = message.actionByUserId;
        c76280Twi.LJII = j5;
        if (message.action == 1) {
            C75832TpU.LIZ.LJJIJLIJ(j5, true, message.teamUsers, message, z);
            C76271TwZ.LIZ.LJJJJLL(message, !z2, false);
        }
        if (c76280Twi.LJ() == enumC76178Tv4 || C76265TwT.LIZIZ.LJ() == enumC76178Tv4) {
            return;
        }
        C76244Tw8 LJII2 = LJII();
        if (LJII2 != null && (mutableLiveData = LJII2.LIZLLL) != null) {
            mutableLiveData.setValue(Long.valueOf(message.battleSetting.battleId));
        }
        C0NB.LIZIZ("MultiMatchViewAnchorPre", "meanwhile scene Invite Message arrived");
        if (LJJIL && (LJII = LJII()) != null) {
            LJII.LJIIL = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C76244Tw8 LJII3 = LJII();
        long j6 = 0;
        if (LJII3 != null) {
            j = LJII3.LJIIJJI;
        } else {
            j = 0;
        }
        if (currentTimeMillis - j < 3000) {
            C76244Tw8 LJII4 = LJII();
            if (LJII4 != null) {
                LJII4.LJIIJJI = 0L;
            }
            C0NB.LIZIZ("MultiMatchViewAnchorPre", "meanwhile scene Invite Message intercepter");
            return;
        }
        C76244Tw8 LJII5 = LJII();
        if (LJII5 != null) {
            LJII5.LJIIIIZZ = message.actionByUserId;
        }
        C0NB.LIZIZ("MultiMatchViewAnchorPre", "inviteActionByUid updated by Invite Message");
        C76244Tw8 LJII6 = LJII();
        if (LJII6 != null) {
            LJII6.LJIIIZ = message.teamUsers;
        }
        List<BattleInviteeGiftPermission> list3 = message.inviteeGiftPermissionTypes;
        if (list3 != null) {
            for (BattleInviteeGiftPermission battleInviteeGiftPermission : list3) {
                Room room = this.LJ;
                if (room != null && (owner3 = room.getOwner()) != null && battleInviteeGiftPermission.userId == owner3.getId() && (LJI = LJI()) != null) {
                    ((C32537Cpp) LJI.gv0(C75575TlL.class)).LIZ = Integer.valueOf(battleInviteeGiftPermission.giftPermissionType);
                }
            }
        }
        List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
        if (LJIILJJIL.isEmpty() || LJIILJJIL.size() != 4 || LJII2 == null) {
            C0NB.LJ("MultiMatchViewAnchorPre", " error no linked");
            return;
        }
        Room room2 = this.LJ;
        if (room2 != null && (owner2 = room2.getOwner()) != null) {
            j2 = owner2.getId();
        } else {
            j2 = ((C75883TqJ) ListProtector.get(LJIILJJIL, 0)).LIZ;
        }
        List<TeamUsersInfo> list4 = message.teamUsers;
        if (list4 != null) {
            j6 = 0;
            for (TeamUsersInfo teamUsersInfo : list4) {
                List<Long> list5 = teamUsersInfo.userIds;
                o.LJIIIIZZ(list5, "teamUsersInfo.userIds");
                Iterator<Long> it = list5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Long next = it.next();
                        Long l = next;
                        if (l != null && l.longValue() == j2) {
                            if (next != null) {
                                j6 = teamUsersInfo.teamId;
                            }
                        }
                    }
                }
            }
        }
        C76268TwW.LIZLLL = message.teamUsers;
        if (z) {
            C76280Twi c76280Twi3 = C76265TwT.LIZIZ;
            c76280Twi3.LJIILIIL(message.battleSetting);
            c76280Twi3.LJ = true;
            c76280Twi3.LJIILL(EnumC76178Tv4.RECEIVED, false);
            c76280Twi3.LJJJJJ = j6;
            c76280Twi3.LJIILIIL = false;
            c76280Twi3.LJIIL(message.battleSetting.giftModeMeta);
        } else {
            C76280Twi c76280Twi4 = C76265TwT.LIZ;
            c76280Twi4.LJIILIIL(message.battleSetting);
            c76280Twi4.LJ = false;
            c76280Twi4.LJIILL(EnumC76178Tv4.RECEIVED, false);
            c76280Twi4.LJJJJJ = j6;
            c76280Twi4.LJIILIIL = false;
            c76280Twi4.LJIIL(message.battleSetting.giftModeMeta);
        }
        AbstractC76282Twk.LJIILL(message);
        C75852Tpo.LIZIZ();
        C76280Twi c76280Twi5 = C76265TwT.LIZ;
        TeamMatchCampaign teamMatchCampaign = message.teamMatchCampaign;
        if (teamMatchCampaign != null && (list2 = teamMatchCampaign.bestTeammateRelation) != null && (bestTeammateRelation = (BestTeammateRelation) ListProtector.get(list2, 0)) != null) {
            j3 = bestTeammateRelation.bestTeammateId;
        } else {
            j3 = 0;
        }
        c76280Twi5.LJIIIIZZ = j3;
        if (j3 == 0) {
            Iterator<C75883TqJ> it2 = C8E.LIZLLL().LJIILJJIL().iterator();
            while (true) {
                if (it2.hasNext()) {
                    c75883TqJ = it2.next();
                    if (c75883TqJ.LJIJ) {
                        break;
                    }
                } else {
                    c75883TqJ = null;
                    break;
                }
            }
            C75883TqJ c75883TqJ2 = c75883TqJ;
            if (c75883TqJ2 != null) {
                j4 = c75883TqJ2.LIZ;
            } else {
                j4 = 0;
            }
            c76280Twi5.LJIIIIZZ = j4;
        }
        LJJJJJL();
        MutableLiveData<java.util.Map<Long, Boolean>> mutableLiveData2 = LJII2.LJI;
        if (mutableLiveData2 != null && (value = mutableLiveData2.getValue()) != null) {
            value.clear();
        }
        MutableLiveData<Long> mutableLiveData3 = LJII2.LIZLLL;
        if (mutableLiveData3 != null) {
            mutableLiveData3.setValue(Long.valueOf(message.battleSetting.battleId));
        }
        if (LJIILJJIL.isEmpty() || LJIILJJIL.size() != 4) {
            C0NB.LJ("MultiMatchViewAnchorPre", " error no linked");
        } else {
            List<TeamUsersInfo> list6 = message.teamUsers;
            if (list6 != null) {
                for (TeamUsersInfo teamUsersInfo2 : list6) {
                    ArrayList arrayList = new ArrayList();
                    for (C75883TqJ c75883TqJ3 : LJIILJJIL) {
                        if (teamUsersInfo2 != null && (list = teamUsersInfo2.userIds) != null) {
                            Iterator<Long> it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Long next2 = it3.next();
                                    Long l2 = next2;
                                    long j7 = c75883TqJ3.LIZ;
                                    if (l2 != null && l2.longValue() == j7) {
                                        if (next2 != null) {
                                            arrayList.add(c75883TqJ3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (teamUsersInfo2.teamId == j6) {
                        LJII2.LJ.setValue(arrayList);
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj = it4.next();
                                C75883TqJ c75883TqJ4 = (C75883TqJ) obj;
                                Room room3 = this.LJ;
                                if (room3 == null || (owner = room3.getOwner()) == null || c75883TqJ4.LIZ != owner.getId()) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        LJII2.LJII = (C75883TqJ) obj;
                    } else {
                        LJII2.LJFF.setValue(arrayList);
                    }
                    z3 = false;
                }
            }
        }
        LJJ(message, z3);
        if (this.LJIILL) {
            LJJIZ(z, 2, 0L, C76339Txf.LJLIL);
            return;
        }
        if (message.action != 1) {
            z3 = true;
        }
        InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZLLL;
        if (interfaceC76311TxD != null) {
            interfaceC76311TxD.LJLLJ("invite", z, LJJIL);
        }
        C76271TwZ.LIZ.LJJJLIIL(message, LJJIL, z3);
    }

    public final void LJJIIJZLJL(int i) {
        List<TeamUsersInfo> list;
        C76244Tw8 LJII = LJII();
        if (LJII != null && LJII.LJIIZILJ) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.mys));
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.DISCONNECT);
            return;
        }
        if (this.LJIILJJIL) {
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.WAITINGFORQUIT);
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myr));
            return;
        }
        C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.DISCONNECT);
        InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZLLL;
        if (interfaceC76311TxD != null) {
            interfaceC76311TxD.LJLJLLL(new AqS100S0101000_13(this, i, 5));
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        C76244Tw8 LJII2 = LJII();
        if (LJII2 != null) {
            list = LJII2.LJIILL;
        } else {
            list = null;
        }
        c75832TpU.LJJIJIL(i, true, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f5, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, r1.getValue()) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(int r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJIJIL(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(long r11) {
        /*
            r10 = this;
            X.Tw8 r0 = r10.LJII()
            if (r0 == 0) goto La
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r3 = r0.LJIILL
            if (r3 != 0) goto Lc
        La:
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r3 = r10.LJIJI
        Lc:
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r1 = r0.getCurrentUserId()
            r6 = 1
            r5 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
        L20:
            r2 = 1
        L21:
            r4 = -1
            java.lang.String r1 = "post MatchCutShortEvent"
            java.lang.String r0 = "MultiMatchViewAnchorPre"
            if (r2 == 0) goto L46
            X.C0NB.LJIIIZ(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r10.LJI()
            if (r3 == 0) goto L45
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent> r2 = com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent.class
            X.Txp r1 = new X.Txp
            P extends X.Ty3 r0 = r10.LIZLLL
            X.TxD r0 = (X.InterfaceC76311TxD) r0
            if (r0 == 0) goto L3f
            int r4 = r0.LJLJJL()
        L3f:
            r1.<init>(r4, r6)
            r3.qv0(r2, r1)
        L45:
            return
        L46:
            X.C0NB.LJIIIZ(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r10.LJI()
            if (r3 == 0) goto L45
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent> r2 = com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent.class
            X.Txp r1 = new X.Txp
            P extends X.Ty3 r0 = r10.LIZLLL
            X.TxD r0 = (X.InterfaceC76311TxD) r0
            if (r0 == 0) goto L5d
            int r4 = r0.LJLJJL()
        L5d:
            r1.<init>(r4, r5)
            r3.qv0(r2, r1)
            goto L45
        L64:
            r9 = 0
            if (r3 == 0) goto Lac
            java.util.Iterator r8 = r3.iterator()
        L6b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r7 = r8.next()
            r0 = r7
            com.bytedance.android.livesdk.model.message.TeamUsersInfo r0 = (com.bytedance.android.livesdk.model.message.TeamUsersInfo) r0
            long r2 = r0.teamId
            X.Twi r0 = X.C76265TwT.LIZ
            long r0 = r0.LJJJJJ
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L6b
        L82:
            com.bytedance.android.livesdk.model.message.TeamUsersInfo r7 = (com.bytedance.android.livesdk.model.message.TeamUsersInfo) r7
            if (r7 == 0) goto Lac
            java.util.List<java.lang.Long> r0 = r7.userIds
            if (r0 == 0) goto Lac
            java.util.Iterator r4 = r0.iterator()
        L8e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r3 = r4.next()
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L9e
            goto L8e
        L9e:
            long r1 = r0.longValue()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L8e
            if (r3 == 0) goto Lac
            goto L20
        Laa:
            r7 = r9
            goto L82
        Lac:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJIJL(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        if (r2 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r9) {
        /*
            r8 = this;
            X.Tw8 r7 = r8.LJII()
            long r5 = java.lang.System.currentTimeMillis()
            if (r7 == 0) goto L15
            long r0 = r7.LJIIJ
        Lc:
            long r5 = r5 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            r4 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L18
            return r4
        L15:
            r0 = 0
            goto Lc
        L18:
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r2 = r9.battleSetting
            int r0 = r2.inviteType
            r3 = 1
            if (r0 != r3) goto La3
            X.Twi r1 = X.C76265TwT.LIZIZ
        L21:
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta r0 = r2.giftModeMeta
            if (r0 == 0) goto La8
            long r5 = r1.LJIILL
            long r0 = r0.giftId
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto La8
            r2 = 2
            r6 = 0
            if (r7 == 0) goto L9f
            androidx.lifecycle.MutableLiveData<java.util.List<X.TqJ>> r0 = r7.LJ
            if (r0 == 0) goto L9f
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L9f
            int r0 = r1.size()
            if (r0 != r2) goto L9f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            X.TqJ r0 = (X.C75883TqJ) r0
            if (r0 == 0) goto L9f
            long r0 = r0.LIZ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L51:
            androidx.lifecycle.MutableLiveData<java.util.List<X.TqJ>> r0 = r7.LJ
            if (r0 == 0) goto L71
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L71
            int r0 = r1.size()
            if (r0 != r2) goto L71
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            X.TqJ r0 = (X.C75883TqJ) r0
            if (r0 == 0) goto L71
            long r0 = r0.LIZ
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L71:
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r1 = r9.teamUsers
            if (r1 == 0) goto L98
            int r0 = r1.size()
            if (r0 != r2) goto L98
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            com.bytedance.android.livesdk.model.message.TeamUsersInfo r0 = (com.bytedance.android.livesdk.model.message.TeamUsersInfo) r0
            if (r0 == 0) goto L98
            java.util.List<java.lang.Long> r2 = r0.userIds
            if (r2 == 0) goto L98
            boolean r0 = r2.contains(r5)
            if (r0 != r3) goto L99
            r1 = 1
        L8e:
            boolean r0 = r2.contains(r6)
            if (r0 != r3) goto L9d
            r0 = 1
        L95:
            r1 = r1 ^ r0
            if (r1 != 0) goto La7
        L98:
            return r3
        L99:
            r1 = 0
            if (r2 == 0) goto L9d
            goto L8e
        L9d:
            r0 = 0
            goto L95
        L9f:
            r5 = r6
            if (r7 == 0) goto L71
            goto L51
        La3:
            X.Twi r1 = X.C76265TwT.LIZ
            goto L21
        La7:
            return r4
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    public final void LJJJIL(long j) {
        C44878HjO.LIZJ("BattleCountDown, timeSecond = ", j, "MultiMatchViewAnchorPre");
        if (j <= 0) {
            return;
        }
        LJIILLIIL(j);
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j) {
            DataChannel LJI = LJI();
            if (LJI != null) {
                LJI.rv0(BattleTimeLeftChannel.class, Long.valueOf(j - 1));
            }
        } else {
            DataChannel LJI2 = LJI();
            if (LJI2 != null) {
                LJI2.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
            }
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = new C76802UCg();
        }
        C76802UCg c76802UCg = this.LJIILLIIL;
        if (c76802UCg != null) {
            c76802UCg.LIZ = new C76303Tx5(this);
            c76802UCg.LIZIZ(j, 1000L);
        }
    }

    public static void LJJJJLI(C76278Twg c76278Twg, List list) {
        List<BattleUserArmy> list2;
        Object obj;
        List<BattleUserArmy> list3;
        Object obj2;
        List<BattleUserArmy> list4;
        BattleUserArmies battleUserArmies;
        long j;
        c76278Twg.getClass();
        ((HashMap) C76265TwT.LIZ.LJJIJL).clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BattleTeamUserArmies battleTeamUserArmies = (BattleTeamUserArmies) it.next();
            java.util.Map<Long, Long> map = C76265TwT.LIZ.LJJIJL;
            Long l = battleTeamUserArmies.teamId;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            ((HashMap) map).put(Long.valueOf(j), Long.valueOf(battleTeamUserArmies.teamTotalScore));
        }
        long j2 = C76265TwT.LIZ.LJJJJJ;
        long j3 = 1;
        if (j2 == 1) {
            j3 = 2;
        }
        Iterator it2 = list.iterator();
        while (true) {
            list2 = null;
            if (it2.hasNext()) {
                obj = it2.next();
                Long l2 = ((BattleTeamUserArmies) obj).teamId;
                if (l2 != null && l2.longValue() == j2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BattleTeamUserArmies battleTeamUserArmies2 = (BattleTeamUserArmies) obj;
        if (battleTeamUserArmies2 != null && (battleUserArmies = battleTeamUserArmies2.userArmies) != null) {
            list3 = battleUserArmies.userArmies;
        } else {
            list3 = null;
        }
        LJJJJL(list3);
        if (battleTeamUserArmies2 != null) {
            C76385TyP c76385TyP = new C76385TyP(0L, 0L, (int) battleTeamUserArmies2.teamTotalScore);
            DataChannel LJI = c76278Twg.LJI();
            if (LJI != null) {
                LJI.rv0(BattleLeftScoreChannel.class, c76385TyP);
                BattleUserArmies battleUserArmies2 = battleTeamUserArmies2.userArmies;
                if (battleUserArmies2 != null) {
                    list4 = battleUserArmies2.userArmies;
                } else {
                    list4 = null;
                }
                LJI.rv0(BattleMvpLeftListChannel.class, list4);
            }
            c76278Twg.LJJJ(battleTeamUserArmies2.teamUsers, true);
            C76321TxN.LIZ(battleTeamUserArmies2, true);
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj2 = it3.next();
                Long l3 = ((BattleTeamUserArmies) obj2).teamId;
                if (l3 != null && l3.longValue() == j3) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        BattleTeamUserArmies battleTeamUserArmies3 = (BattleTeamUserArmies) obj2;
        if (battleTeamUserArmies3 != null) {
            DataChannel LJI2 = c76278Twg.LJI();
            if (LJI2 != null) {
                LJI2.rv0(BattleRightScoreChannel.class, Integer.valueOf((int) battleTeamUserArmies3.teamTotalScore));
                BattleUserArmies battleUserArmies3 = battleTeamUserArmies3.userArmies;
                if (battleUserArmies3 != null) {
                    list2 = battleUserArmies3.userArmies;
                }
                LJI2.rv0(BattleMvpRightListChannel.class, list2);
            }
            c76278Twg.LJJJ(battleTeamUserArmies3.teamUsers, false);
            C76321TxN.LIZ(battleTeamUserArmies3, false);
        }
    }

    public final void LJIJI(BattleInfoResponse battleInfoResponse, List list) {
        List<LinkUser> list2;
        boolean z;
        U8H LJJZZI;
        U8H LJJZZI2;
        long j;
        List<LinkUser> list3;
        InterfaceC75973Trl LLIIJI;
        InterfaceC75973Trl LLIIJI2;
        InterfaceC75973Trl LLIIJI3;
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", "changePositionForMatchResume");
        Iterator it = ((ArrayList) list).iterator();
        List<Long> list4 = null;
        List<Long> list5 = null;
        while (it.hasNext()) {
            TeamUsersInfo teamUsersInfo = (TeamUsersInfo) it.next();
            if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ) {
                list4 = teamUsersInfo.userIds;
            } else {
                list5 = teamUsersInfo.userIds;
            }
        }
        IMultiHostService iMultiHostService = this.LJI;
        if (iMultiHostService != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC75441TjB LJJIJL = iMultiHostService.LJJIJL();
            if (LJJIJL != null && (LLIIJI3 = LJJIJL.LLIIJI()) != null) {
                list2 = LLIIJI3.LJJIIZI();
            } else {
                list2 = null;
            }
            if (list2 != null) {
                int i = 0;
                for (LinkUser linkUser : list2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        LinkUser linkUser2 = linkUser;
                        if (list4 != null && ORZ.LJLJJI(linkUser2.getUserId(), list4)) {
                            arrayList.add(linkUser2);
                        } else if (list5 != null && ORZ.LJLJJI(linkUser2.getUserId(), list5)) {
                            arrayList2.add(linkUser2);
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("user is not in team ");
                            LIZ.append(linkUser2.getUserId());
                            C0NB.LJ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (arrayList.size() == 2 && arrayList2.size() == 2) {
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                do {
                    arrayList3.add(ListProtector.get(arrayList, i3));
                    arrayList3.add(ListProtector.get(arrayList2, i3));
                    i3++;
                } while (i3 < 2);
                if (list2 != null) {
                    z = false;
                    int i4 = 0;
                    for (LinkUser linkUser3 : list2) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            if (!o.LJ(linkUser3.getUserId(), ((LinkUser) ListProtector.get(arrayList3, i4)).getUserId())) {
                                z = true;
                            }
                            i4 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                } else {
                    z = false;
                }
                long j2 = 0;
                if (z) {
                    C76271TwZ c76271TwZ = C76271TwZ.LIZ;
                    Long l = battleInfoResponse.battleId;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    InterfaceC75441TjB LJJIJL2 = iMultiHostService.LJJIJL();
                    if (LJJIJL2 == null || (LLIIJI2 = LJJIJL2.LLIIJI()) == null || (list3 = LLIIJI2.LJJIIZI()) == null) {
                        list3 = C61878OQg.INSTANCE;
                    }
                    c76271TwZ.LJJJJI(j, list3, arrayList3);
                    C0NB.LJ("MultiMatchViewAnchorPre", "updateLocalLinkedList, newList=" + arrayList3 + ", delayTime=1");
                    InterfaceC75441TjB LJJIJL3 = iMultiHostService.LJJIJL();
                    if (LJJIJL3 != null && (LLIIJI = LJJIJL3.LLIIJI()) != null) {
                        LLIIJI.LJJJJLL(1, arrayList3);
                    }
                }
                InterfaceC75441TjB LJJIJL4 = iMultiHostService.LJJIJL();
                if (LJJIJL4 != null && (LJJZZI2 = LJJIJL4.LJJZZI()) != null) {
                    Long l2 = battleInfoResponse.battleId;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    }
                    LJJZZI2.LJJZ(j2);
                }
                InterfaceC75441TjB LJJIJL5 = iMultiHostService.LJJIJL();
                if (LJJIJL5 != null && (LJJZZI = LJJIJL5.LJJZZI()) != null) {
                    LJJZZI.LJJJJJL("match_info", C113554cx.LJJLIIIIJ(new OSZ("match_type", "2")));
                    return;
                }
                return;
            }
            C0NB.LJ("MultiMatchViewAnchorPre", "user list  error");
        }
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Integer, O] */
    public final void LJJ(LinkMicBattleMessage message, boolean z) {
        Long l;
        boolean z2;
        boolean z3;
        List<BestTeammateRelation> list;
        List<Long> list2;
        boolean z4;
        String str;
        int i;
        boolean z5;
        long j;
        boolean z6;
        List<Long> list3;
        java.util.Map<Long, Boolean> value;
        User owner;
        MutableLiveData<Long> mutableLiveData;
        User owner2;
        DataChannel LJI;
        List<BattleABTest> list4;
        MutableLiveData<Long> mutableLiveData2;
        C76278Twg c76278Twg = this;
        C76244Tw8 LJII = c76278Twg.LJII();
        if (LJII != null && (mutableLiveData2 = LJII.LIZLLL) != null) {
            l = mutableLiveData2.getValue();
        } else {
            l = null;
        }
        if (l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C0NB.LIZIZ("MultiMatchViewAnchorPre", "meanwhile scene handle invite lost");
            o.LJIIIZ(message, "message");
            List<BattleABTestSetting> list5 = message.abtestSettings;
            if (list5 != null) {
                Iterator<BattleABTestSetting> it = list5.iterator();
                i = 0;
                while (it.hasNext()) {
                    BattleABTestList battleABTestList = it.next().abTestList;
                    if (battleABTestList != null && (list4 = battleABTestList.abTestList) != null) {
                        for (BattleABTest battleABTest : list4) {
                            if (battleABTest.abTestType == 6 && battleABTest.group == 1) {
                                i++;
                            }
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (i == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            C76230Tvu.LIZ = z5;
            if (!z5 || !o.LJ(C76265TwT.LJIIL.get(Long.valueOf(message.battleId)), Boolean.TRUE)) {
                C76244Tw8 LJII2 = c76278Twg.LJII();
                if (LJII2 != null) {
                    LJII2.LJIIIIZZ = message.actionByUserId;
                }
                C0NB.LIZIZ("MultiMatchViewAnchorPre", "inviteActionByUid updated by Accept Message");
                C76244Tw8 LJII3 = c76278Twg.LJII();
                if (LJII3 != null) {
                    LJII3.LJIIIZ = message.teamUsers;
                }
                List<BattleInviteeGiftPermission> list6 = message.inviteeGiftPermissionTypes;
                if (list6 != null) {
                    for (BattleInviteeGiftPermission battleInviteeGiftPermission : list6) {
                        Room room = c76278Twg.LJ;
                        if (room != null && (owner2 = room.getOwner()) != null && battleInviteeGiftPermission.userId == owner2.getId() && (LJI = c76278Twg.LJI()) != null) {
                            ((C32537Cpp) LJI.gv0(C75575TlL.class)).LIZ = Integer.valueOf(battleInviteeGiftPermission.giftPermissionType);
                        }
                    }
                }
                C76244Tw8 LJII4 = c76278Twg.LJII();
                if (LJII4 != null && (mutableLiveData = LJII4.LIZLLL) != null) {
                    mutableLiveData.setValue(Long.valueOf(message.battleSetting.battleId));
                }
                if (C76265TwT.LIZ.LJ() != EnumC76178Tv4.START) {
                    List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
                    if (LJIILJJIL.isEmpty() || LJIILJJIL.size() != 4 || LJII4 == null) {
                        C0NB.LJ("MultiMatchViewAnchorPre", " error no linked");
                    } else {
                        Room room2 = c76278Twg.LJ;
                        long j2 = 0;
                        if (room2 != null && (owner = room2.getOwner()) != null) {
                            j = owner.getId();
                        } else {
                            j = 0;
                        }
                        List<TeamUsersInfo> list7 = message.teamUsers;
                        if (list7 != null) {
                            for (TeamUsersInfo teamUsersInfo : list7) {
                                List<Long> list8 = teamUsersInfo.userIds;
                                o.LJIIIIZZ(list8, "teamUsersInfo.userIds");
                                Iterator<Long> it2 = list8.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Long next = it2.next();
                                        Long l2 = next;
                                        if (l2 != null && l2.longValue() == j) {
                                            if (next != null) {
                                                j2 = teamUsersInfo.teamId;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        BattleSetting battleSetting = message.battleSetting;
                        if (battleSetting.inviteType == 1) {
                            z6 = true;
                            C76280Twi c76280Twi = C76265TwT.LIZIZ;
                            c76280Twi.LJIILIIL(battleSetting);
                            c76280Twi.LJ = true;
                            c76280Twi.LJIILL(EnumC76178Tv4.RECEIVED, false);
                            c76280Twi.LJJJJJ = j2;
                        } else {
                            z6 = false;
                            C76280Twi c76280Twi2 = C76265TwT.LIZ;
                            c76280Twi2.LJIILIIL(battleSetting);
                            c76280Twi2.LJ = false;
                            c76280Twi2.LJIILL(EnumC76178Tv4.RECEIVED, false);
                            c76280Twi2.LJJJJJ = j2;
                        }
                        AbstractC76282Twk.LJIILL(message);
                        C76271TwZ.LIZ.LJJJJLL(message, true, true);
                        C75852Tpo.LIZIZ();
                        MutableLiveData<java.util.Map<Long, Boolean>> mutableLiveData3 = LJII4.LJI;
                        if (mutableLiveData3 != null && (value = mutableLiveData3.getValue()) != null) {
                            value.clear();
                        }
                        if (LJIILJJIL.isEmpty() || LJIILJJIL.size() != 4) {
                            C0NB.LJ("MultiMatchViewAnchorPre", " error no linked");
                        } else {
                            List<TeamUsersInfo> list9 = message.teamUsers;
                            if (list9 != null) {
                                for (TeamUsersInfo teamUsersInfo2 : list9) {
                                    ArrayList arrayList = new ArrayList();
                                    for (C75883TqJ c75883TqJ : LJIILJJIL) {
                                        if (teamUsersInfo2 != null && (list3 = teamUsersInfo2.userIds) != null) {
                                            Iterator<Long> it3 = list3.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    Long next2 = it3.next();
                                                    Long l3 = next2;
                                                    long j3 = c75883TqJ.LIZ;
                                                    if (l3 != null && l3.longValue() == j3) {
                                                        if (next2 != null) {
                                                            arrayList.add(c75883TqJ);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (teamUsersInfo2.teamId == j2) {
                                        LJII4.LJ.setValue(arrayList);
                                        if (arrayList.size() > 1) {
                                            LJII4.LJII = (C75883TqJ) ListProtector.get(arrayList, 1);
                                        }
                                    } else {
                                        LJII4.LJFF.setValue(arrayList);
                                    }
                                }
                            }
                        }
                        if (c76278Twg.LJIILL) {
                            c76278Twg = c76278Twg;
                            c76278Twg.LJJIZ(z6, 2, 0L, C76345Txl.LJLIL);
                        } else {
                            boolean LJJIL = c76278Twg.LJJIL(message);
                            InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) c76278Twg.LIZLLL;
                            if (interfaceC76311TxD != null) {
                                interfaceC76311TxD.LJLLJ("invite", z6, LJJIL);
                            }
                            C76271TwZ.LIZ.LJJJLIIL(message, LJJIL, false);
                        }
                    }
                }
            }
        }
        if (message.battleSetting.inviteType == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C76280Twi c76280Twi3 = C76265TwT.LIZ;
        c76280Twi3.LJIIIZ = z3;
        TeamMatchCampaign teamMatchCampaign = message.teamMatchCampaign;
        if (teamMatchCampaign != null) {
            list = teamMatchCampaign.bestTeammateRelation;
        } else {
            list = null;
        }
        c76280Twi3.LJFF = list;
        LJJJJJL();
        TeamMatchCampaign teamMatchCampaign2 = message.teamMatchCampaign;
        if (teamMatchCampaign2 != null) {
            list2 = teamMatchCampaign2.startSfxTeamId;
        } else {
            list2 = null;
        }
        c76280Twi3.LJIIJ = list2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleAcceptMsg isRematch:");
        LIZ.append(z3);
        C0NB.LIZIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
        C76244Tw8 LJII5 = c76278Twg.LJII();
        if (LJII5 != null) {
            java.util.Map<Long, Boolean> value2 = LJII5.LJI.getValue();
            if (value2 == null) {
                value2 = new HashMap<>();
            }
            value2.put(Long.valueOf(message.actionByUserId), Boolean.TRUE);
            LJII5.LJI.postValue(value2);
        }
        if (z) {
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            BattleSetting battleSetting2 = message.battleSetting;
            if (battleSetting2 != null && battleSetting2.inviteType == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            JSONObject jSONObject = new JSONObject();
            C76271TwZ.LJIJJ(message, jSONObject);
            C76271TwZ.LJJ(jSONObject, z4);
            JSONObject jSONObject2 = new JSONObject();
            if (z4) {
                c76280Twi3 = C76265TwT.LIZIZ;
            }
            if (c76280Twi3.LJIILIIL) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            C05630Jz.LJI(jSONObject2, "role_type", str);
            JSONObject jSONObject3 = new JSONObject();
            C05630Jz.LJFF(jSONObject3, "accept_message_fetch_cost", C30725C4b.LIZ() - message.baseMessage.createTime);
            c76271TwZ.LJL("accept_message", jSONObject, jSONObject2, jSONObject3, false);
        }
        if (message.battleSetting.status == 1) {
            c76278Twg.LJJI(message, 1);
        }
    }

    public final void LJJI(LinkMicBattleMessage linkMicBattleMessage, int i) {
        int i2;
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        boolean z = false;
        if (linkMicBattleMessage.action == 4) {
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            C76271TwZ.LJIIIIZZ = C30725C4b.LIZ();
            JSONObject jSONObject = new JSONObject();
            C76271TwZ.LJIJJ(linkMicBattleMessage, jSONObject);
            C76271TwZ.LJJ(jSONObject, false);
            if (C76271TwZ.LJIIIIZZ - C76271TwZ.LJIIIZ < 3000) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            C05630Jz.LIZ(i2, "is_first_open", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C05630Jz.LJFF(jSONObject3, "open_message_fetch_cost", C30725C4b.LIZ() - linkMicBattleMessage.baseMessage.createTime);
            C76271TwZ.LJJZZIII(c76271TwZ, "open_message", jSONObject, jSONObject2, jSONObject3, false, 16);
        }
        if (LJ == EnumC76178Tv4.START) {
            return;
        }
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null && battleSetting.inviteType == 1) {
            z = true;
        }
        C75622Tm6.LJIIJJI(linkMicBattleMessage.battleId, true, z);
        if (i == 0) {
            LJJIIJ(linkMicBattleMessage, i);
        }
        if (linkMicBattleMessage.action == 7 && i == 1) {
            LJJIIJ(linkMicBattleMessage, i);
        }
    }

    public final void LJJIFFI(LinkMicBattleMessage message, boolean z) {
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C76271TwZ.LJIJJ(message, jSONObject);
        C05630Jz.LIZ(z ? 1 : 0, "is_turn_off", jSONObject);
        boolean z2 = false;
        C76271TwZ.LJJ(jSONObject, false);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_declined_message", jSONObject, null, null, false, 28);
        C76244Tw8 LJII = LJII();
        if (LJII != null) {
            LJII.LJIIZILJ = z;
        }
        this.LJIILJJIL = false;
        C76244Tw8 LJII2 = LJII();
        if (LJII2 != null) {
            LJII2.LJIJ = false;
            LJII2.LJIILLIIL.LIZJ();
        }
        if (message.battleSetting.inviteType == 1) {
            z2 = true;
        }
        C10S.LIZ("handleDeclineQuitMsg isReMatch:", z2, "MultiMatchViewAnchorPre");
        if (z) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myw));
        } else {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myv));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r23, int r24) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJIIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, int):void");
    }

    public final void LJJJ(List<BattleTeamUser> list, boolean z) {
        MatchBaseWidget LIZLLL;
        long j;
        if (list != null) {
            for (BattleTeamUser battleTeamUser : list) {
                P p = this.LIZLLL;
                if (p != 0 && (LIZLLL = p.LIZLLL()) != null) {
                    Long l = battleTeamUser.userId;
                    long j2 = 0;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    ViewOnClickListenerC76430Tz8 LJLZ = LIZLLL.LJLZ(j);
                    if (LJLZ != null) {
                        Long l2 = battleTeamUser.score;
                        if (l2 != null) {
                            j2 = l2.longValue();
                        }
                        LJLZ.LJLLLL(j2, z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0167, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        if (r9 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011f, code lost:
    
        if (r9 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(long r18, java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76278Twg.LJJJI(long, java.lang.Integer):void");
    }

    public final void LJJJJJ(long j, CustomLinkMessage customLinkMessage) {
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" cur state = ");
        LIZ.append(LJ);
        C0NB.LIZIZ("pk_interrupt", X1D.LIZIZ(LIZ));
        int i = 0;
        if (LJ == EnumC76178Tv4.INVITED) {
            LJIJ(1, 8, j, this, null, false);
        } else if (LJ == EnumC76178Tv4.ACCEPTED) {
            if (C76230Tvu.LIZ) {
                C76265TwT.LJII(0, "list_change");
            } else {
                i = 0;
                LJJIZ(false, 1, j, C76352Txs.LJLIL);
            }
        } else if (LJ == EnumC76178Tv4.RECEIVED) {
            i = 0;
            LJJIZ(false, 1, j, C76353Txt.LJLIL);
        } else if (LJ.compareTo(EnumC76178Tv4.START) >= 0 && LJ.compareTo(EnumC76178Tv4.PUNISH) < 0) {
            LJIJJLI(this, 104, true, j, customLinkMessage, 0, 0L, 112);
        } else if (LJ.compareTo(EnumC76178Tv4.PUNISH) >= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
            LJJIJLIJ(103, 8, j, this, true);
        }
        int i2 = C76328TxU.LIZ[LJ2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                LJJIZ(true, 1, j, C76355Txv.LJLIL);
                return;
            } else if (C76230Tvu.LIZ) {
                C76265TwT.LJII(i, "list_change");
                return;
            } else {
                LJJIZ(true, 1, j, C76354Txu.LJLIL);
                return;
            }
        }
        LJIJ(1, 8, j, this, null, true);
    }

    public static /* synthetic */ void LJJIJIIJI(C76278Twg c76278Twg, String str, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        c76278Twg.LJJIJ(str, z, false);
    }

    public static void LJJJJ(C76278Twg c76278Twg, boolean z, int i) {
        long j;
        InterfaceC92693kP interfaceC92693kP;
        C56085Lzl c56085Lzl = c76278Twg.LJJ;
        if (c56085Lzl.LJLILLLLZI && c56085Lzl.LJLJI == i) {
            return;
        }
        c56085Lzl.LJLILLLLZI = true;
        c56085Lzl.LJLJI = i;
        InterfaceC92693kP interfaceC92693kP2 = c76278Twg.LJII;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = c76278Twg.LJII) != null) {
            interfaceC92693kP.dispose();
        }
        if (i == 0) {
            LiveMatchTimeOutSetting liveMatchTimeOutSetting = LiveMatchTimeOutSetting.INSTANCE;
            j = liveMatchTimeOutSetting.getValue().timeout_v4 + liveMatchTimeOutSetting.getValue().extra_time;
        } else {
            j = LiveMatchTimeOutSetting.INSTANCE.getValue().timeout_v4;
        }
        c76278Twg.LJII = ((InterfaceC29856Bng) TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(j).LJJIJL(new TZS(j)).LJJJ(C73969T1h.LIZIZ()).LIZJ(c76278Twg.LIZIZ())).LIZLLL(new AfS65S0100000_13(c76278Twg, 88), new AfS65S0100000_13(c76278Twg, 91), new C76310TxC(c76278Twg, i, z));
    }

    public final boolean LJIL(int i, long j, long j2) {
        if (this.LJIIJ) {
            return false;
        }
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        if (LJ.compareTo(EnumC76178Tv4.START) >= 0 && LJ.compareTo(EnumC76178Tv4.PUNISH) < 0) {
            LJIJJLI(this, i, true, j, null, 0, j2, 56);
            return true;
        }
        if (LJ.compareTo(EnumC76178Tv4.PUNISH) < 0 || LJ.compareTo(EnumC76178Tv4.END) >= 0) {
            return true;
        }
        LJJIJLIJ(i, 8, j, this, true);
        return true;
    }

    public final void LJJIIZ(EnumC76319TxL requestFrom, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        MutableLiveData<java.util.Map<Long, Boolean>> mutableLiveData2;
        java.util.Map<Long, Boolean> value2;
        o.LJIIIZ(requestFrom, "requestFrom");
        if (z) {
            C76265TwT.LIZIZ.LJJJI = requestFrom;
        } else {
            C76265TwT.LIZ.LJJJI = requestFrom;
        }
        C76244Tw8 LJII = LJII();
        if (LJII != null && (mutableLiveData2 = LJII.LJI) != null && (value2 = mutableLiveData2.getValue()) != null) {
            value2.clear();
        }
        if (this.LJIIIZ) {
            C0NB.LJ("MultiMatchViewAnchorPre", "invite isPermissionChecking = true");
            return;
        }
        C76244Tw8 LJII2 = LJII();
        if (LJII2 == null || (mutableLiveData = LJII2.LIZ) == null || (value = mutableLiveData.getValue()) == null) {
            C0NB.LJ("MultiMatchViewAnchorPre", "invite error channel id is empty");
            return;
        }
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C76271TwZ.LIZIZ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "invite_type", jSONObject);
        C76271TwZ.LJJZZIII(c76271TwZ, "prepare_request", jSONObject, FT5.LIZLLL("role_type", "inviter"), null, false, 8);
        this.LJIIIZ = true;
        ((InterfaceC29856Bng) ((MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class)).prepareMultiMatchPb(value.longValue()).LIZJ(LIZIZ())).LIZJ(new AfS19S0210000_13(this, z, requestFrom, 5), new AfS29S0110000_13(this, z, 2));
        C75597Tlh.LJ(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJ(String str, boolean z, boolean z2) {
        EnumC75744To4 enumC75744To4;
        List<TeamUsersInfo> list;
        int i;
        DataChannel LJI;
        List<C75883TqJ> LJIL;
        MatchBaseWidget LIZLLL;
        ViewOnClickListenerC76430Tz8 LJLZ;
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        if (str.equals("punish_request") || str.equals("punish_finish_msg") || str.equals("punish_cut_short_request") || str.equals("punish_cut_short_request_negative")) {
            if (str.equals("punish_request")) {
                enumC75744To4 = EnumC75744To4.TIME_OUT;
            } else if (str.equals("punish_cut_short_request")) {
                enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
            } else if (str.equals("punish_cut_short_request_negative")) {
                enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
            } else if (str.equals("punish_finish_msg")) {
                if (C76265TwT.LIZ.LJJIII) {
                    if (z2) {
                        enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
                    } else {
                        enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
                    }
                } else {
                    enumC75744To4 = EnumC75744To4.TIME_OUT;
                }
            } else {
                enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
            }
            C75832TpU c75832TpU = C75832TpU.LIZ;
            C76244Tw8 LJII = LJII();
            if (LJII != null) {
                list = LJII.LJIILL;
            } else {
                list = null;
            }
            c75832TpU.LJJIIJ(list, true, enumC75744To4);
        }
        InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZLLL;
        if (interfaceC76311TxD != null) {
            interfaceC76311TxD.LJLJJI();
        }
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        if (o.LJ(str, "punish_cut_short_request_negative")) {
            str = "punish_cut_short_request";
        }
        boolean contains = C76271TwZ.LJJIIZ.contains(str);
        JSONObject jSONObject = new JSONObject();
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        if (contains) {
            C05630Jz.LJFF(jSONObject2, "match_duration", C30725C4b.LIZ() - C76271TwZ.LJII);
        } else {
            C05630Jz.LJFF(jSONObject2, "punish_duration", C30725C4b.LIZ() - C76271TwZ.LJIIJJI);
        }
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LIZ(!contains ? 1 : 0, "stage", jSONObject3);
        C05630Jz.LJI(jSONObject3, "source", str);
        if (contains) {
            i = C76265TwT.LIZ.LJJII;
        } else {
            i = C76265TwT.LIZ.LJJIII;
        }
        C05630Jz.LIZ(i, "cut_short", jSONObject3);
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_finish", jSONObject, jSONObject3, jSONObject2, false, 16);
        InterfaceC76311TxD interfaceC76311TxD2 = (InterfaceC76311TxD) this.LIZLLL;
        if (interfaceC76311TxD2 != null) {
            interfaceC76311TxD2.LJLLI();
        }
        if (!C76265TwT.LIZ.LJIILL(EnumC76178Tv4.END, false)) {
            return;
        }
        IMultiHostService iMultiHostService = this.LJI;
        if (iMultiHostService != null && (LJIL = iMultiHostService.LJIL()) != null) {
            for (C75883TqJ c75883TqJ : LJIL) {
                P p = this.LIZLLL;
                if (p != 0 && (LIZLLL = p.LIZLLL()) != null && (LJLZ = LIZLLL.LJLZ(c75883TqJ.LIZ)) != null) {
                    LJLZ.LJJLL();
                }
            }
        }
        CL6.LIZJ();
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJJIJ = 0L;
        if (!LiveBattleDismissInvitePanelWhenFinishSetting.INSTANCE.getValue()) {
            if (z && (LJI = LJI()) != null) {
                LJI.pv0(CoHostCmdDismissLinkDialogEvent.class);
            }
        } else {
            DataChannel LJI2 = LJI();
            if (LJI2 != null) {
                LJI2.pv0(CoHostCmdDismissLinkDialogEvent.class);
            }
        }
        C76802UCg c76802UCg = this.LJIILLIIL;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        this.LJIIZILJ.removeCallbacksAndMessages(null);
        C76265TwT.LJII = c76280Twi.LJIJJ;
        c76280Twi.LJFF = null;
        c76280Twi.LJIIIZ = false;
        c76280Twi.LJIIJ = null;
        c76280Twi.LJIIJJI = false;
        c76280Twi.LJIIIIZZ = 0L;
        c76280Twi.LJI = 0L;
        c76280Twi.LJII = 0L;
        this.LJIIZILJ.post(RunnableC76341Txh.LJLIL);
    }

    public final void LJIJJ(int i, int i2, long j, java.util.Map map) {
        Long l;
        List<C75883TqJ> list;
        C75883TqJ c75883TqJ;
        Collection<BattleTeamResult> values;
        User owner;
        EnumC75744To4 enumC75744To4;
        String str;
        List<TeamUsersInfo> list2;
        User owner2;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "finish_response";
        if (!this.LJIILIIL) {
            if (i != 1) {
                if (i != 104) {
                    if (i != 106) {
                        enumC75744To4 = EnumC75744To4.TIME_OUT;
                    } else {
                        enumC75744To4 = EnumC75744To4.TIME_OUT;
                    }
                } else {
                    Room room = this.LJ;
                    if (room != null && (owner2 = room.getOwner()) != null && j == owner2.getId()) {
                        enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
                    } else {
                        enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
                    }
                }
            } else {
                c68322mC.element = "finish_msg";
                enumC75744To4 = EnumC75744To4.TIME_OUT;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C29306Beo.LJIJJLI(this.LJIJJLI)) {
                String str2 = this.LJIJJLI;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("cohost_invite_request_from", str2);
            }
            if (B5G.LIZIZ().LJJIJLIJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_live_end", str);
            C75832TpU c75832TpU = C75832TpU.LIZ;
            C76244Tw8 LJII = LJII();
            if (LJII != null) {
                list2 = LJII.LJIILL;
            } else {
                list2 = null;
            }
            c75832TpU.LJJIII(list2, true, enumC75744To4, linkedHashMap);
        }
        long j2 = C76265TwT.LIZ.LJJJJJ;
        long j3 = 1;
        if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && j2 == 0) {
            Room room2 = this.LJ;
            if (room2 == null || (owner = room2.getOwner()) == null || (l = Long.valueOf(owner.getId())) == null || l.longValue() == 0) {
                C76244Tw8 LJII2 = LJII();
                if (LJII2 != null && (list = LJII2.LIZJ) != null && (c75883TqJ = (C75883TqJ) ListProtector.get(list, 0)) != null) {
                    l = Long.valueOf(c75883TqJ.LIZ);
                } else {
                    l = null;
                }
            }
            if (map != null && (values = map.values()) != null) {
                for (BattleTeamResult battleTeamResult : values) {
                    List<BattleTeamUser> list3 = battleTeamResult.teamUsers;
                    if (list3 != null) {
                        Iterator<BattleTeamUser> it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                BattleTeamUser next = it.next();
                                if (o.LJ(next.userId, l)) {
                                    if (next != null) {
                                        Long l2 = battleTeamResult.teamId;
                                        if (l2 != null) {
                                            j2 = l2.longValue();
                                        } else {
                                            j2 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C76271TwZ.LIZ.LJJLIIIJJIZ("uid_error", true);
        }
        if (j2 == 1) {
            j3 = 2;
        }
        if (map != null) {
            BattleTeamResult battleTeamResult2 = (BattleTeamResult) map.get(Long.valueOf(j2));
            this.LJIILIIL = true;
            if (this.LJIIJJI) {
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", "dealResult, Battle state is End");
                return;
            }
            C76280Twi c76280Twi = C76265TwT.LIZ;
            if (c76280Twi.LIZ(EnumC76178Tv4.PUNISH)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dealResult, Battle state is ");
                LIZ.append(c76280Twi.LJ());
                LIZ.append(", return");
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
                return;
            }
            if (!Room.isValid(this.LJ)) {
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", "dealResult, current room is invalid");
                return;
            }
            if (this.LJIIL) {
                C0NB.LJIIIZ("MultiMatchViewAnchorPre", "dealResult, current is showing result animation");
                return;
            }
            this.LJIIL = true;
            BattleTeamResult battleTeamResult3 = (BattleTeamResult) map.get(Long.valueOf(j3));
            c76280Twi.LJIJJ = battleTeamResult2;
            C76265TwT.LJ = battleTeamResult2;
            C76265TwT.LJFF = battleTeamResult3;
            C19660pu.LIZ("livesdk_multi_match_host_team_result", C51029K0z.LJJIIZI(new OSZ("user_side", "host")), battleTeamResult2);
            C19660pu.LIZ("livesdk_multi_match_guest_team_result", C51029K0z.LJJIIZI(new OSZ("user_side", "host")), battleTeamResult3);
            if (battleTeamResult2 != null) {
                if (battleTeamResult2.result == 2) {
                    if (i2 != 2) {
                        c76280Twi.LJIILL(EnumC76178Tv4.DRAW, false);
                    }
                    if (battleTeamResult2 == null) {
                        return;
                    }
                }
                C76265TwT.LJIIJJI = c76280Twi.LJIILL;
                InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZLLL;
                if (interfaceC76311TxD != null) {
                    interfaceC76311TxD.LJLJJLL(battleTeamResult2, new C76284Twm(this, battleTeamResult2, i2, i, c68322mC));
                }
            }
        }
    }

    public final void LJJIZ(boolean z, int i, long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        long LIZIZ;
        int i2;
        Long l;
        String str;
        User owner;
        int i3;
        List<TeamUsersInfo> list;
        long LIZIZ2;
        MutableLiveData<Long> mutableLiveData;
        C76732zl c76732zl = new C76732zl();
        if (z) {
            c76732zl.element = 1;
            LIZIZ = C76265TwT.LIZIZ.LIZIZ();
        } else {
            LIZIZ = C76265TwT.LIZ.LIZIZ();
        }
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        C76244Tw8 LJII = LJII();
        if (LJII == null || (mutableLiveData = LJII.LIZ) == null || (l = mutableLiveData.getValue()) == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        int i4 = c76732zl.element;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    str = "time_out";
                }
            } else {
                str = "showing_quit";
            }
        } else {
            Room room = this.LJ;
            if (room != null && (owner = room.getOwner()) != null && j == owner.getId()) {
                if (B5G.LIZIZ().LJJIJLIJ) {
                    str = "live_end";
                } else {
                    str = "cohost_end";
                }
            } else {
                str = "rtc_offline";
            }
        }
        c76271TwZ.LJJJLZIJ(i4, LIZIZ, j, str);
        C76244Tw8 LJII2 = LJII();
        if (LJII2 != null) {
            Long valueOf = Long.valueOf(LJII2.LJIIIIZZ);
            if (i == 3) {
                list = LJII2.LJIIIZ;
            } else {
                list = LJII2.LJIILL;
            }
            if (z) {
                LIZIZ2 = C76265TwT.LIZIZ.LIZIZ();
            } else {
                LIZIZ2 = C76265TwT.LIZ.LIZIZ();
            }
            C75832TpU.LIZ.LJJ(false, true, valueOf, list, LIZIZ2, false);
        }
        if (i == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).reject(longValue, LIZIZ, c76732zl.element, i3).LIZJ(LIZIZ())).LIZJ(new AfS0S0201100_13(i2, LIZIZ, interfaceC88472Yns, c76732zl, 1), new AfS0S0201100_13(i2, LIZIZ, interfaceC88472Yns, c76732zl, 2));
    }

    public static void LJJIJLIJ(int i, int i2, long j, C76278Twg c76278Twg, boolean z) {
        Room room;
        boolean z2;
        User owner;
        User owner2;
        Room room2;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if (c76278Twg.LIZLLL == 0) {
            return;
        }
        C0RN.LIZLLL("punish, cutShort = ", z, "MultiMatchViewAnchorPre");
        int i3 = 103;
        if ((i != 103 && i != 212) || ((room = c76278Twg.LJ) != null && (owner = room.getOwner()) != null && j == owner.getId())) {
            z2 = false;
        } else {
            z2 = true;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJJIII = z;
        long LIZJ = c76280Twi.LIZJ();
        if (c76278Twg.LJ == null) {
            DataChannel LJI = c76278Twg.LJI();
            if (LJI != null) {
                room2 = (Room) LJI.kv0(RoomChannel.class);
            } else {
                room2 = null;
            }
            c76278Twg.LJ = room2;
        }
        if (i != 102) {
            if (i != 103) {
                i3 = 111;
            } else {
                Room room3 = c76278Twg.LJ;
                if (room3 != null && (owner2 = room3.getOwner()) != null && j == owner2.getId()) {
                    if (B5G.LIZIZ().LJJIJLIJ) {
                        i3 = 110;
                    }
                } else {
                    i3 = 109;
                }
            }
        } else {
            i3 = 106;
        }
        C76271TwZ.LIZ.LJJJJL(i3, z);
        Room room4 = c76278Twg.LJ;
        if (room4 != null) {
            ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).punish(room4.getId(), LIZJ, z, 0, c76280Twi.LIZIZ()).LIZJ(c76278Twg.LIZIZ())).LIZJ(new C76314TxG(z, z2, c76278Twg, null), new AfS19S0210000_13((Object) null, z, c76278Twg, 1));
        }
        if (z) {
            return;
        }
        LJJIJIIJI(c76278Twg, "punish_request", 4);
    }

    public static void LJIJ(int i, int i2, long j, C76278Twg c76278Twg, AqS163S0100000_13 aqS163S0100000_13, boolean z) {
        long j2;
        Long l;
        int i3;
        int i4;
        String str;
        User owner;
        MutableLiveData<Long> mutableLiveData;
        AqS163S0100000_13 aqS163S0100000_132 = aqS163S0100000_13;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            aqS163S0100000_132 = null;
        }
        Room room = c76278Twg.LJ;
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        C76244Tw8 LJII = c76278Twg.LJII();
        if (LJII == null || (mutableLiveData = LJII.LIZ) == null || (l = mutableLiveData.getValue()) == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        if (LJJIIZI()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        if (i == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (j == 0) {
            str = "time_out";
        } else {
            Room room2 = c76278Twg.LJ;
            if (room2 != null && (owner = room2.getOwner()) != null && j == owner.getId()) {
                if (B5G.LIZIZ().LJJIJLIJ) {
                    str = "live_end";
                } else {
                    str = "cohost_end";
                }
            } else {
                str = "rtc_offline";
            }
        }
        C76271TwZ.LIZ.LJJJI(C76265TwT.LJIIIIZZ, str, z);
        C65814PsI.LIZ().getClass();
        ((InterfaceC29856Bng) ((MultiMatchApi) C65814PsI.LIZJ(MultiMatchApi.class)).cancel(j2, longValue, C76265TwT.LJIIIIZZ, i4).LIZJ(c76278Twg.LIZIZ())).LIZJ(new AfS5S0111000_13(i3, aqS163S0100000_132, z, 0), new C76270TwY(i3, z));
    }

    public static void LJIJJLI(C76278Twg c76278Twg, int i, boolean z, long j, CustomLinkMessage customLinkMessage, int i2, long j2, int i3) {
        int i4;
        long j3;
        User owner;
        String str;
        InterfaceC29405BgP LIZIZ;
        int i5 = i2;
        CustomLinkMessage customLinkMessage2 = customLinkMessage;
        long j4 = j2;
        List<TeamUsersInfo> list = null;
        if ((i3 & 8) != 0) {
            customLinkMessage2 = null;
        }
        if ((i3 & 32) != 0) {
            i5 = 0;
        }
        if ((i3 & 64) != 0) {
            j4 = -1;
        }
        c76278Twg.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("finish, cutShort = ");
        LIZ.append(z);
        LIZ.append("  isFinishing = ");
        FT5.LJ(LIZ, c76278Twg.LJIIJ, LIZ, "MultiMatchViewAnchorPre");
        if (j == 0 && (LIZIZ = B83.LIZ().LIZIZ()) != null) {
            ((C29374Bfu) LIZIZ).getCurrentUserId();
        }
        if (c76278Twg.LIZLLL == 0) {
            C0NB.LJIIIZ("MultiMatchViewAnchorPre", "finish, viewInterface == null");
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LIZIZ() <= 0) {
            return;
        }
        if (c76278Twg.LJIIJ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C29306Beo.LJIJJLI(c76278Twg.LJIJJLI)) {
                String str2 = c76278Twg.LJIJJLI;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("cohost_invite_request_from", str2);
            }
            if (B5G.LIZIZ().LJJIJLIJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_live_end", str);
            C75832TpU c75832TpU = C75832TpU.LIZ;
            C76244Tw8 LJII = c76278Twg.LJII();
            if (LJII != null) {
                list = LJII.LJIILL;
            }
            c75832TpU.LJJIII(list, true, EnumC75744To4.POSITIVE_OVER, linkedHashMap);
            return;
        }
        c76278Twg.LJIIJ = true;
        long LIZJ = c76280Twi.LIZJ();
        long LIZIZ2 = c76280Twi.LIZIZ();
        if (i == 104) {
            Room room = c76278Twg.LJ;
            if (room != null && (owner = room.getOwner()) != null && j == owner.getId()) {
                if (B5G.LIZIZ().LJJIJLIJ) {
                    i4 = 110;
                } else {
                    i4 = 103;
                }
            } else {
                i4 = 109;
            }
        } else {
            i4 = i;
        }
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject2);
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject);
        C05630Jz.LIZ(i4, "source", jSONObject);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "match_duration", C30725C4b.LIZ() - C76271TwZ.LJII);
        C76271TwZ.LJIIJ = C30725C4b.LIZ();
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_finish_request", jSONObject, jSONObject2, jSONObject3, false, 16);
        String LJJIJ = C76271TwZ.LJJIJ(i4, j4);
        boolean isAppBackground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground();
        int i6 = C75877TqD.LJIIJ;
        long j5 = C75877TqD.LJIIL;
        MultiMatchApi multiMatchApi = (MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class);
        if (z) {
            j3 = j;
        } else {
            j3 = 0;
        }
        ((InterfaceC29856Bng) multiMatchApi.multiFinishPb(LIZJ, LIZIZ2, j3, LJJIJ, isAppBackground ? 1 : 0, i6, j5, 1).LIZJ(c76278Twg.LIZIZ())).LIZJ(new C76283Twl(c76278Twg, LIZIZ2, z, i, i4, j, customLinkMessage2, null), new C76293Twv(i5, c76278Twg, null, LIZIZ2, z, i));
    }
}
