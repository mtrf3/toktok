package X;

import Y.ARunnableS32S0200000_13;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkAnchorPocChangedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchAudienceStartDelay;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudience2v2IdentifyOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFinishOptimizeSettings;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AqS16S1201000_13;
import kotlin.jvm.internal.AqS62S0201000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Two */
/* loaded from: classes14.dex */
public final class C76286Two extends AbstractC76285Twn<InterfaceC76360Ty0> {
    public String LJIILJJIL;
    public boolean LJIILL;
    public final IMultiHostService LJIILLIIL = C8E.LIZLLL();
    public long LJIIZILJ;
    public final C84673XKz LJIJ;
    public final C64962gm LJIJI;

    @Override // X.AbstractC76285Twn
    public final void LJIILLIIL(LinkMicBattleVictoryLapMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.AbstractC76285Twn
    public final void LJ() {
        this.LJIIZILJ = 0L;
        if (C76265TwT.LIZ.LJ().compareTo(EnumC76178Tv4.START) >= 0) {
            C76271TwZ.LIZ.LJJLIIIJILLIZJL("leave_room", true);
        }
        super.LJ();
        C76271TwZ.LIZ.LJJLI();
        this.LJIJ.LIZIZ(null);
        DataChannel LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.jv0(this);
        }
    }

    public C76286Two() {
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        this.LJIJ = LJIILIIL;
        this.LJIJI = C48841JEv.LIZ(C36636EZk.LIZ.plus(LJIILIIL));
    }

    @Override // X.AbstractC76285Twn
    public final void LIZLLL(BattleInfoResponse battleInfoResponse) {
        int i;
        java.util.Map<Long, BattleTeamResult> map = battleInfoResponse.teamBattleResult;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 2;
        }
        LJIJI(i, "battle_info", map);
    }

    @Override // X.AbstractC76285Twn
    public final void LJI(LinkMicBattleArmiesMessage message) {
        List<BattleTeamUserArmies> list;
        List<BattleTeamUserArmies> list2;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LIZIZ;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (list = message.teamArmies) != null) {
                for (BattleTeamUserArmies battleTeamUserArmies : list) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LIZIZ;
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
            this.LIZ = message;
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 61));
    }

    @Override // X.AbstractC76285Twn
    public final void LJIIL(LinkMicBattleArmiesMessage message) {
        int i;
        long j;
        List<BattleUserArmy> list;
        Object obj;
        List<BattleUserArmy> list2;
        Object obj2;
        DataChannel LJIIIIZZ;
        DataChannel LJIIIIZZ2;
        List<BattleUserArmy> list3;
        BattleUserArmies battleUserArmies;
        o.LJIIIZ(message, "message");
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        boolean z = true;
        if (currentUserId == message.fromUserId) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C76265TwT.LIZ.LIZIZ());
            LIZ.append(',');
            LIZ.append(currentUserId);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (message.giftId != 0) {
                List<String> list4 = C76271TwZ.LJJIIJ;
                String str = message.logId;
                o.LJIIIIZZ(str, "message.logId");
                ((ArrayList) list4).add(str);
            } else {
                ((ArrayList) C76271TwZ.LJJIIJ).add(LIZIZ);
            }
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJFF(jSONObject, "battle_id", message.battleId);
            C05630Jz.LJFF(jSONObject, "user_id", currentUserId);
            C05630Jz.LJI(jSONObject, "distinct_key", LIZIZ);
            if (message.giftId != 0) {
                i = 1;
            } else {
                i = 2;
            }
            C05630Jz.LIZ(i, "source", jSONObject);
            C05630Jz.LJI(jSONObject, "log_id", message.logId);
            C05630Jz.LIZ(message.triggerReason, "trigger_reason", jSONObject);
            C76271TwZ.LJLJJLL(c76271TwZ, "battle_score_update_msg_receive_self", jSONObject, jSONObject, null, false, 24);
        }
        if (!AbstractC76285Twn.LIZJ(this, message.battleId)) {
            c76271TwZ.LJJLIIIJL(false, "battle_id_invalid", message);
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIIJJI = message.hasTeamMatchMvpSfx;
        if (message.triggerReason == EnumC76332TxY.SCORE_UPDATE.getValue()) {
            long j2 = message.giftId;
            String str2 = message.logId;
            o.LJIIIIZZ(str2, "message.logId");
            C76271TwZ.LJJIIJ(j2, true, false, str2);
        }
        if (message.triggerReason == EnumC76332TxY.OPT_OUT_UPDATE.getValue()) {
            List list5 = message.teamArmies;
            if (list5 == null) {
                list5 = C61878OQg.INSTANCE;
            }
            long j3 = c76280Twi.LJJJJJ;
            long j4 = 1;
            if (j3 == 1) {
                j4 = 2;
            }
            Iterator it = list5.iterator();
            while (true) {
                list = null;
                if (it.hasNext()) {
                    obj = it.next();
                    Long l = ((BattleTeamUserArmies) obj).teamId;
                    if (l != null && l.longValue() == j3) {
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
            AbstractC76285Twn.LJIJ(list2);
            if (battleTeamUserArmies != null && (LJIIIIZZ2 = LJIIIIZZ()) != null) {
                BattleUserArmies battleUserArmies2 = battleTeamUserArmies.userArmies;
                if (battleUserArmies2 != null) {
                    list3 = battleUserArmies2.userArmies;
                } else {
                    list3 = null;
                }
                LJIIIIZZ2.rv0(BattleMvpLeftListChannel.class, list3);
            }
            Iterator it2 = list5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    Long l2 = ((BattleTeamUserArmies) obj2).teamId;
                    if (l2 != null && l2.longValue() == j4) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            BattleTeamUserArmies battleTeamUserArmies2 = (BattleTeamUserArmies) obj2;
            if (battleTeamUserArmies2 != null && (LJIIIIZZ = LJIIIIZZ()) != null) {
                BattleUserArmies battleUserArmies3 = battleTeamUserArmies2.userArmies;
                if (battleUserArmies3 != null) {
                    list = battleUserArmies3.userArmies;
                }
                LJIIIIZZ.rv0(BattleMvpRightListChannel.class, list);
            }
        } else if (!this.LJI) {
            java.util.Map<Long, Long> map = c76280Twi.LJJIJL;
            List<BattleTeamUserArmies> list6 = message.teamArmies;
            if (list6 != null) {
                for (BattleTeamUserArmies battleTeamUserArmies3 : list6) {
                    Long l3 = (Long) ((HashMap) map).get(battleTeamUserArmies3.teamId);
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    if (j > battleTeamUserArmies3.teamTotalScore) {
                        z = false;
                    }
                }
                if (!z) {
                    C0NB.LJ("MultiMatchAudienceViewP", "LinkMicBattleArmiesMessage can't update score, jump");
                }
            }
            List<BattleTeamUserArmies> list7 = message.teamArmies;
            if (list7 == null) {
                list7 = C61878OQg.INSTANCE;
            }
            LJIL(list7, message.fromUserId, message.giftId);
        } else {
            c76271TwZ.LJJLIIIJL(false, "not_in_batting", message);
        }
        this.LIZIZ = message;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r6 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        r0 = r9.teamId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r0 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        r10 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        continue;
     */
    @Override // X.AbstractC76285Twn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76286Two.LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76285Twn
    public final void LJIILJJIL(LinkMicBattlePunishFinishMessage message) {
        o.LJIIIZ(message, "message");
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        JSONObject jSONObject = new JSONObject();
        C76271TwZ.LJIJJLI(message, jSONObject);
        C05630Jz.LJFF(jSONObject, "client_and_server_diff_time", C31012CFc.LIZIZ);
        C76271TwZ.LJJ(jSONObject, false);
        C76271TwZ.LJLJJLL(c76271TwZ, "punish_finish_message", jSONObject, null, null, false, 28);
        C76457TzZ.LIZJ();
        if (!AbstractC76285Twn.LIZJ(this, message.battleId)) {
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        boolean z = true;
        if (message.reason != 1) {
            z = false;
        }
        c76280Twi.LJJIII = z;
        this.LJIILJJIL = null;
        LJIIJ("punish_finish_msg", false);
    }

    @Override // X.AbstractC76285Twn
    public final void LJIILL(SeiAppData seiAppData) {
        DataChannel LJIIIIZZ;
        o.LJIIIZ(seiAppData, "seiAppData");
        String valueOf = String.valueOf(seiAppData.battleId);
        if (!TextUtils.equals(valueOf, this.LJIILJJIL) && !o.LJ(this.LJIILJJIL, CardStruct.IStatusCode.DEFAULT)) {
            C76271TwZ.LIZ.LJJLI();
        }
        if (valueOf == null) {
            return;
        }
        String str = this.LJIILJJIL;
        if ((str == null || str.length() == 0 || o.LJ(CardStruct.IStatusCode.DEFAULT, this.LJIILJJIL)) && (LJIIIIZZ = LJIIIIZZ()) != null) {
            LJIIIIZZ.rv0(MatchAudienceStartDelay.class, valueOf);
        }
        if (!o.LJ(this.LJIILJJIL, valueOf) && !o.LJ(valueOf, CardStruct.IStatusCode.DEFAULT)) {
            C75622Tm6.LJIILJJIL(seiAppData);
            C76271TwZ.LIZ.LJJLIIIIJ(CastLongProtector.parseLong(valueOf), C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
        }
        this.LJIILJJIL = valueOf;
    }

    public static /* synthetic */ void LJJ(C76286Two c76286Two, List list) {
        c76286Two.LJIL(list, 0L, 0L);
    }

    @Override // X.AbstractC76285Twn
    public final void LJIIJ(String str, boolean z) {
        InterfaceC75441TjB LJJIJL;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        MultiMatchAudienceWidget LIZLLL;
        ViewOnClickListenerC76430Tz8 LIZIZ;
        super.LJIIJ(str, z);
        IMultiHostService iMultiHostService = this.LJIILLIIL;
        if (iMultiHostService != null && (LJJIJL = iMultiHostService.LJJIJL()) != null && (LLIIJI = LJJIJL.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            for (LinkUser linkUser : LJJIIZI) {
                P p = this.LJII;
                if (p != 0 && (LIZLLL = p.LIZLLL()) != null) {
                    String linkMicId = linkUser.getLinkMicId();
                    if (linkMicId == null) {
                        linkMicId = "";
                    }
                    MultiCoHostWindowManager multiCoHostWindowManager = LIZLLL.LJLIL;
                    if (multiCoHostWindowManager != null && (LIZIZ = multiCoHostWindowManager.LIZIZ(linkMicId)) != null) {
                        LIZIZ.LJJLL();
                    }
                }
            }
        }
        C76271TwZ.LIZ.LJJLIIIJILLIZJL(str, false);
    }

    public final void LJIJJLI(List<BattleTeamUser> list, boolean z) {
        MultiMatchAudienceWidget LIZLLL;
        long j;
        if (list != null) {
            for (BattleTeamUser battleTeamUser : list) {
                P p = this.LJII;
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

    public final void LJIJI(int i, String str, java.util.Map map) {
        C76244Tw8 LJIIIZ;
        List<C75883TqJ> list;
        C75883TqJ c75883TqJ;
        Long valueOf;
        C75883TqJ c75883TqJ2;
        Collection<BattleTeamResult> values;
        User owner;
        long j = C76265TwT.LIZ.LJJJJJ;
        long j2 = 1;
        if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && j == 0) {
            Room room = this.LJIIIIZZ;
            if (((room == null || (owner = room.getOwner()) == null || (valueOf = Long.valueOf(owner.getId())) == null || valueOf.longValue() == 0) && ((LJIIIZ = LJIIIZ()) == null || (list = LJIIIZ.LIZJ) == null || !(!list.isEmpty()) || (c75883TqJ = (C75883TqJ) ListProtector.get(list, 0)) == null || (valueOf = Long.valueOf(c75883TqJ.LIZ)) == null)) || valueOf.longValue() == 0) {
                List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
                if ((!LJIILJJIL.isEmpty()) && (c75883TqJ2 = (C75883TqJ) ListProtector.get(LJIILJJIL, 0)) != null) {
                    valueOf = Long.valueOf(c75883TqJ2.LIZ);
                } else {
                    valueOf = null;
                }
            }
            if (map != null && (values = map.values()) != null) {
                for (BattleTeamResult battleTeamResult : values) {
                    List<BattleTeamUser> list2 = battleTeamResult.teamUsers;
                    if (list2 != null) {
                        Iterator<BattleTeamUser> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                BattleTeamUser next = it.next();
                                if (o.LJ(next.userId, valueOf)) {
                                    if (next != null) {
                                        Long l = battleTeamResult.teamId;
                                        if (l != null) {
                                            j = l.longValue();
                                        } else {
                                            j = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C76271TwZ.LIZ.LJJLIIIJJIZ("uid_error", false);
        }
        if (j == 1) {
            j2 = 2;
        }
        if (map != null) {
            BattleTeamResult battleTeamResult2 = (BattleTeamResult) map.get(Long.valueOf(j));
            this.LJI = true;
            if (this.LIZLLL) {
                C0NB.LJIIIZ("MultiMatchAudienceViewP", "dealResult, Battle state is End");
                return;
            }
            C76280Twi c76280Twi = C76265TwT.LIZ;
            if (c76280Twi.LIZ(EnumC76178Tv4.PUNISH)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dealResult, Battle state is ");
                LIZ.append(c76280Twi.LJ());
                LIZ.append(", return");
                C0NB.LJIIIZ("MultiMatchAudienceViewP", X1D.LIZIZ(LIZ));
                return;
            }
            if (!Room.isValid(this.LJIIIIZZ)) {
                C0NB.LJIIIZ("MultiMatchAudienceViewP", "dealResult, room is not valid, return");
                return;
            }
            if (this.LJFF) {
                C0NB.LJIIIZ("MultiMatchAudienceViewP", "dealResult, current is showing result animation");
                return;
            }
            this.LJFF = true;
            BattleTeamResult battleTeamResult3 = (BattleTeamResult) map.get(Long.valueOf(j2));
            c76280Twi.LJIJJ = battleTeamResult2;
            C76265TwT.LJ = battleTeamResult2;
            C76265TwT.LJFF = battleTeamResult3;
            if (battleTeamResult2 != null && battleTeamResult2.result == 2) {
                c76280Twi.LJIILL(EnumC76178Tv4.DRAW, false);
            }
            InterfaceC76360Ty0 interfaceC76360Ty0 = (InterfaceC76360Ty0) this.LJII;
            if (interfaceC76360Ty0 != null) {
                interfaceC76360Ty0.LJLJJLL(battleTeamResult2, new AqS16S1201000_13(this, battleTeamResult2, i, str, 1));
            }
        }
    }

    public final void LJIJJ(int i, List list, boolean z) {
        CL6.LIZIZ("match_prepare");
        this.LIZLLL = false;
        this.LJI = false;
        this.LJ = false;
        if (!z) {
            C76271TwZ.LJJLIIIJ(C76271TwZ.LIZ, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
            LJFF(i, list);
            LJIL(list, 0L, 0L);
            return;
        }
        C0NB.LIZIZ("MultiMatchAudienceViewP", "needChange poc  = true --->scope launch");
        if (!LiveMatchAudience2v2IdentifyOptSetting.INSTANCE.isEnabled()) {
            DataChannel LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ == null) {
                return;
            }
            LJIIIIZZ.mv0(LinkAnchorPocChangedEvent.class, this, new AqS62S0201000_13(list, (List<BattleTeamUserArmies>) this, (C76286Two) i, 1));
            return;
        }
        XKX.LIZLLL(this.LJIJI, null, null, new C76365Ty5(i, this, list, null), 3);
    }

    public final void LJIL(List<BattleTeamUserArmies> list, long j, long j2) {
        List<TeamUsersInfo> list2;
        BattleTeamUserArmies battleTeamUserArmies;
        List<BattleUserArmy> list3;
        C76800UCe c76800UCe;
        BattleTeamUserArmies battleTeamUserArmies2;
        TeamUsersInfo teamUsersInfo;
        List<Long> list4;
        Object obj;
        ArrayList arrayList;
        TeamUsersInfo teamUsersInfo2;
        List<Long> list5;
        Object obj2;
        BattleUserArmies battleUserArmies;
        long j3;
        ((HashMap) C76265TwT.LIZ.LJJIJL).clear();
        Iterator<BattleTeamUserArmies> it = list.iterator();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = null;
            if (it.hasNext()) {
                BattleTeamUserArmies next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    BattleTeamUserArmies battleTeamUserArmies3 = next;
                    java.util.Map<Long, Long> map = C76265TwT.LIZ.LJJIJL;
                    Long l = battleTeamUserArmies3.teamId;
                    if (l != null) {
                        j3 = l.longValue();
                    } else {
                        j3 = i;
                    }
                    ((HashMap) map).put(Long.valueOf(j3), Long.valueOf(battleTeamUserArmies3.teamTotalScore));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                long j4 = C76265TwT.LIZ.LJJJJJ;
                long j5 = 1;
                if (j4 == 1) {
                    j5 = 2;
                }
                C76244Tw8 LJIIIZ = LJIIIZ();
                if (LJIIIZ != null) {
                    list2 = LJIIIZ.LJIILL;
                } else {
                    list2 = null;
                }
                Iterator<BattleTeamUserArmies> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        battleTeamUserArmies = it2.next();
                        Long l2 = battleTeamUserArmies.teamId;
                        if (l2 != null && l2.longValue() == j4) {
                            break;
                        }
                    } else {
                        battleTeamUserArmies = null;
                        break;
                    }
                }
                BattleTeamUserArmies battleTeamUserArmies4 = battleTeamUserArmies;
                if (battleTeamUserArmies4 != null && (battleUserArmies = battleTeamUserArmies4.userArmies) != null) {
                    list3 = battleUserArmies.userArmies;
                } else {
                    list3 = null;
                }
                AbstractC76285Twn.LJIJ(list3);
                if (battleTeamUserArmies4 != null) {
                    Object c76385TyP = new C76385TyP(j, j2, (int) battleTeamUserArmies4.teamTotalScore);
                    DataChannel LJIIIIZZ = LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.rv0(BattleLeftScoreChannel.class, c76385TyP);
                        BattleUserArmies battleUserArmies2 = battleTeamUserArmies4.userArmies;
                        if (battleUserArmies2 != null) {
                            obj2 = battleUserArmies2.userArmies;
                        } else {
                            obj2 = null;
                        }
                        LJIIIIZZ.rv0(BattleMvpLeftListChannel.class, obj2);
                    }
                    LJIJJLI(battleTeamUserArmies4.teamUsers, true);
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                if (c76800UCe == null) {
                    if (list2 != null) {
                        Iterator<TeamUsersInfo> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                teamUsersInfo2 = it3.next();
                                if (teamUsersInfo2.teamId == j4) {
                                    break;
                                }
                            } else {
                                teamUsersInfo2 = null;
                                break;
                            }
                        }
                        TeamUsersInfo teamUsersInfo3 = teamUsersInfo2;
                        if (teamUsersInfo3 != null && (list5 = teamUsersInfo3.userIds) != null) {
                            arrayList = new ArrayList(C32I.LJJL(list5, 10));
                            Iterator<Long> it4 = list5.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(new BattleTeamUser(it4.next(), 0L));
                            }
                            LJIJJLI(arrayList, true);
                        }
                    }
                    arrayList = null;
                    LJIJJLI(arrayList, true);
                }
                ListIterator<BattleTeamUserArmies> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        battleTeamUserArmies2 = listIterator.previous();
                        Long l3 = battleTeamUserArmies2.teamId;
                        if (l3 != null && l3.longValue() == j5) {
                            break;
                        }
                    } else {
                        battleTeamUserArmies2 = null;
                        break;
                    }
                }
                BattleTeamUserArmies battleTeamUserArmies5 = battleTeamUserArmies2;
                if (battleTeamUserArmies5 != null) {
                    DataChannel LJIIIIZZ2 = LJIIIIZZ();
                    if (LJIIIIZZ2 != null) {
                        LJIIIIZZ2.rv0(BattleRightScoreChannel.class, Integer.valueOf((int) battleTeamUserArmies5.teamTotalScore));
                        BattleUserArmies battleUserArmies3 = battleTeamUserArmies5.userArmies;
                        if (battleUserArmies3 != null) {
                            obj = battleUserArmies3.userArmies;
                        } else {
                            obj = null;
                        }
                        LJIIIIZZ2.rv0(BattleMvpRightListChannel.class, obj);
                    }
                    LJIJJLI(battleTeamUserArmies5.teamUsers, false);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                if (list2 != null) {
                    Iterator<TeamUsersInfo> it5 = list2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            teamUsersInfo = it5.next();
                            if (teamUsersInfo.teamId == j5) {
                                break;
                            }
                        } else {
                            teamUsersInfo = null;
                            break;
                        }
                    }
                    TeamUsersInfo teamUsersInfo4 = teamUsersInfo;
                    if (teamUsersInfo4 != null && (list4 = teamUsersInfo4.userIds) != null) {
                        arrayList2 = new ArrayList(C32I.LJJL(list4, 10));
                        Iterator<Long> it6 = list4.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(new BattleTeamUser(it6.next(), 0L));
                        }
                    }
                }
                LJIJJLI(arrayList2, false);
                return;
            }
        }
    }
}
