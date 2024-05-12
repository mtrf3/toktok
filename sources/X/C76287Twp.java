package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS41S0100000_5;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.TruthOrDareForAudienceAbTestSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twp */
/* loaded from: classes14.dex */
public final class C76287Twp extends AbstractC76285Twn<InterfaceC76343Txj> {
    public long LJIILJJIL;

    @Override // X.AbstractC76285Twn
    public final void LIZLLL(BattleInfoResponse battleInfoResponse) {
        int i;
        java.util.Map<Long, BattleResult> map = battleInfoResponse.resultMap;
        java.util.Map<Long, BattleComboInfo> map2 = battleInfoResponse.battleCombos;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 2;
        }
        LJIJI("battle_info", map, map2, i);
    }

    @Override // X.AbstractC76285Twn
    public final void LJI(LinkMicBattleArmiesMessage message) {
        java.util.Map<Long, BattleUserArmies> map;
        int i;
        java.util.Map<Long, BattleUserArmies> map2;
        BattleUserArmies battleUserArmies;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LIZIZ;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (map = message.armies) != null) {
                for (Map.Entry<Long, BattleUserArmies> entry : map.entrySet()) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LIZIZ;
                    if (linkMicBattleArmiesMessage2 != null && (map2 = linkMicBattleArmiesMessage2.armies) != null && (battleUserArmies = map2.get(entry.getKey())) != null) {
                        i = battleUserArmies.hostScore;
                    } else {
                        i = 0;
                    }
                    if (i > entry.getValue().hostScore) {
                        z = false;
                    }
                }
                if (!z) {
                    return;
                }
            }
            this.LIZ = message;
            C0NB.LIZ("arimies message looper  arimies buffer update");
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 62));
    }

    @Override // X.AbstractC76285Twn
    public final void LJIIL(LinkMicBattleArmiesMessage message) {
        int i;
        long j;
        Long l;
        List<BattleUserArmy> list;
        DataChannel LJIIIIZZ;
        User owner;
        DataChannel LJIIIIZZ2;
        User owner2;
        o.LJIIIZ(message, "message");
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        long j2 = 0;
        boolean z = true;
        if (currentUserId == message.fromUserId) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C76265TwT.LIZ.LIZIZ());
            LIZ.append(',');
            LIZ.append(currentUserId);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (message.giftId != 0) {
                List<String> list2 = C76272Twa.LIZJ;
                String str = message.logId;
                o.LJIIIIZZ(str, "message.logId");
                ((ArrayList) list2).add(str);
            } else {
                ((ArrayList) C76272Twa.LIZJ).add(LIZIZ);
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
            C76272Twa.LJJJZ("battle_score_update_msg_receive_self", jSONObject, jSONObject);
        }
        if (!AbstractC76285Twn.LIZJ(this, message.battleId)) {
            C76272Twa.LJJJJZI(false, "battle_id_invalid", message);
            return;
        }
        if (message.triggerReason == EnumC76332TxY.SCORE_UPDATE.getValue()) {
            long j3 = message.giftId;
            String str2 = message.logId;
            o.LJIIIIZZ(str2, "message.logId");
            C76271TwZ.LJJIIJ(j3, false, false, str2);
        }
        if (message.triggerReason == EnumC76332TxY.OPT_OUT_UPDATE.getValue()) {
            java.util.Map<Long, BattleUserArmies> map = message.armies;
            o.LJIIIIZZ(map, "message.armies");
            Room room = this.LJIIIIZZ;
            Object obj = null;
            if (room != null && (owner2 = room.getOwner()) != null) {
                l = Long.valueOf(owner2.getId());
            } else {
                l = null;
            }
            BattleUserArmies battleUserArmies = map.get(l);
            if (battleUserArmies != null) {
                list = battleUserArmies.userArmies;
            } else {
                list = null;
            }
            AbstractC76285Twn.LJIJ(list);
            if (battleUserArmies != null && (LJIIIIZZ2 = LJIIIIZZ()) != null) {
                LJIIIIZZ2.rv0(BattleMvpLeftListChannel.class, battleUserArmies.userArmies);
            }
            Iterator LIZLLL = C08880Wm.LIZLLL();
            while (LIZLLL.hasNext()) {
                Object next = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) next;
                Room room2 = this.LJIIIIZZ;
                if (room2 == null || (owner = room2.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                    obj = next;
                    break;
                }
            }
            C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
            if (c75883TqJ2 != null) {
                j2 = c75883TqJ2.LIZ;
            }
            BattleUserArmies battleUserArmies2 = map.get(Long.valueOf(j2));
            if (battleUserArmies2 != null && (LJIIIIZZ = LJIIIIZZ()) != null) {
                LJIIIIZZ.rv0(BattleMvpRightListChannel.class, battleUserArmies2.userArmies);
            }
        } else if (!this.LJI) {
            java.util.Map<Long, Long> map2 = C76265TwT.LIZ.LJJIJL;
            java.util.Map<Long, BattleUserArmies> map3 = message.armies;
            if (map3 != null) {
                Iterator<Map.Entry<Long, BattleUserArmies>> it = map3.entrySet().iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) ((HashMap) map2).get(it.next().getKey());
                    if (l2 != null) {
                        j = l2.longValue();
                    } else {
                        j = 0;
                    }
                    if (j > r2.getValue().hostScore) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("LinkMicBattleArmiesMessage can't update score, jump and triggerReason = ");
                    LIZ2.append(message.triggerReason);
                    C0NB.LJ("TwoMatchAudienceViewPre", X1D.LIZIZ(LIZ2));
                }
            }
            java.util.Map<Long, BattleUserArmies> map4 = message.armies;
            o.LJIIIIZZ(map4, "message.armies");
            LJIL(message.fromUserId, message.giftId, map4);
        } else {
            C76272Twa.LJJJJZI(false, "not_in_batting", message);
        }
        this.LIZIZ = message;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // X.AbstractC76285Twn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r8) {
        /*
            r7 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.C76457TzZ.LIZJ()
            int r1 = r8.action
            r0 = 5
            r6 = 0
            if (r1 == r0) goto L9c
            r0 = 6
            if (r1 == r0) goto L12
        L11:
            return
        L12:
            X.C76272Twa.LJJIJL(r8, r6)
            long r0 = r8.battleId
            boolean r0 = X.AbstractC76285Twn.LIZJ(r7, r0)
            if (r0 != 0) goto L1e
            return
        L1e:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting.INSTANCE
            boolean r0 = r0.isEnabled()
            r5 = 1
            if (r0 == 0) goto L6e
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r2 = r8.battleResult
            if (r2 == 0) goto L9a
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LJIIIIZZ
            if (r0 == 0) goto L98
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L98
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L3d:
            java.lang.Object r0 = r2.get(r0)
            com.bytedance.android.livesdk.model.message.battle.BattleResult r0 = (com.bytedance.android.livesdk.model.message.battle.BattleResult) r0
            if (r0 == 0) goto L9a
            int r0 = r0.result
            if (r0 != 0) goto L9a
            r2 = 1
        L4a:
            r4 = -1
            java.lang.String r1 = "post TwoMatchCutShortEvent"
            java.lang.String r0 = "TwoMatchAudienceViewPre"
            if (r2 == 0) goto L7a
            X.C0NB.LJIIIZ(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r7.LJIIIIZZ()
            if (r3 == 0) goto L6e
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent> r2 = com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent.class
            X.Txp r1 = new X.Txp
            P extends X.Txy r0 = r7.LJII
            X.Txj r0 = (X.InterfaceC76343Txj) r0
            if (r0 == 0) goto L68
            int r4 = r0.LJLJJL()
        L68:
            r1.<init>(r4, r6)
            r3.qv0(r2, r1)
        L6e:
            X.Twi r0 = X.C76265TwT.LIZ
            r0.LJJII = r5
            X.C75633TmH.LJIIJ = r5
            java.lang.String r0 = "cut_short_msg"
            r7.LJIIJ(r0, r5)
            goto L11
        L7a:
            X.C0NB.LJIIIZ(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r7.LJIIIIZZ()
            if (r3 == 0) goto L6e
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent> r2 = com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent.class
            X.Txp r1 = new X.Txp
            P extends X.Txy r0 = r7.LJII
            X.Txj r0 = (X.InterfaceC76343Txj) r0
            if (r0 == 0) goto L91
            int r4 = r0.LJLJJL()
        L91:
            r1.<init>(r4, r5)
            r3.qv0(r2, r1)
            goto L6e
        L98:
            r0 = 0
            goto L3d
        L9a:
            r2 = 0
            goto L4a
        L9c:
            X.C76272Twa.LJJIII(r8, r6)
            long r0 = r8.battleId
            boolean r0 = X.AbstractC76285Twn.LIZJ(r7, r0)
            if (r0 != 0) goto La8
            return
        La8:
            X.Twi r0 = X.C76265TwT.LIZ
            r0.LJJII = r6
            r7.LJIJJ(r8)
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r3 = r8.battleResult
            java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo> r2 = r8.battleCombos
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r8.battleSetting
            int r1 = r0.status
            java.lang.String r0 = "finish_msg"
            r7.LJIJI(r0, r3, r2, r1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76287Twp.LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76285Twn
    public final void LJIILJJIL(LinkMicBattlePunishFinishMessage message) {
        o.LJIIIZ(message, "message");
        C76272Twa.LJJJJI(false, message);
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
        LJIIJ("punish_finish_msg", false);
    }

    @Override // X.AbstractC76285Twn
    public final void LJIILL(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        long j = seiAppData.battleId;
        StringBuilder LIZJ = V10.LIZJ("onSeiBattle id update = ", j, " and seiBattleId = ");
        C0RN.LJ(LIZJ, this.LJIILJJIL, LIZJ, "TestIdentify");
        if (this.LJIILJJIL != j && j != 0) {
            C75622Tm6.LJIILJJIL(seiAppData);
            C76272Twa.LIZ.LJJ(j, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
        }
        this.LJIILJJIL = j;
    }

    @Override // X.AbstractC76285Twn
    public final void LJIILLIIL(LinkMicBattleVictoryLapMessage message) {
        o.LJIIIZ(message, "message");
        int i = message.playType;
        if (i != 3) {
            if (i != 4) {
                return;
            }
            C76280Twi c76280Twi = C76265TwT.LIZ;
            c76280Twi.LJJJJLL = false;
            c76280Twi.LJJJJL = false;
            c76280Twi.LJJJJJL = false;
            c76280Twi.LJJJLL = null;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isShow = ");
            TruthOrDareForAudienceAbTestSetting truthOrDareForAudienceAbTestSetting = TruthOrDareForAudienceAbTestSetting.INSTANCE;
            LIZ.append(truthOrDareForAudienceAbTestSetting.getValue());
            C0NB.LJIIIZ("TwoMatchAudienceViewPre", X1D.LIZIZ(LIZ));
            if (c76280Twi.LIZIZ() != message.battleId || truthOrDareForAudienceAbTestSetting.getValue() == 0) {
                return;
            }
            c76280Twi.LJJJJZI = message.anchorRegion;
            c76280Twi.LJJJJLI = true;
            c76280Twi.LJJJLIIL = message.triggerGuideV2;
            InterfaceC76343Txj interfaceC76343Txj = (InterfaceC76343Txj) this.LJII;
            if (interfaceC76343Txj != null) {
                interfaceC76343Txj.LIZJ(false);
            }
            C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "truth_or_dare_enter_match_victory_lap"));
            return;
        }
        C76280Twi c76280Twi2 = C76265TwT.LIZ;
        c76280Twi2.LJJJJL = false;
        c76280Twi2.LJJJJJL = false;
        c76280Twi2.LJJJLL = null;
        c76280Twi2.LJJJJLI = false;
        c76280Twi2.LJJJJLL = false;
        c76280Twi2.LJJJLZIJ = message.truthOrDareCloseNotice;
        InterfaceC76343Txj interfaceC76343Txj2 = (InterfaceC76343Txj) this.LJII;
        if (interfaceC76343Txj2 != null) {
            interfaceC76343Txj2.LJ();
        }
        C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "truth_or_dare_disable_feature"));
    }

    public final void LJIJJ(LinkMicBattleMessage linkMicBattleMessage) {
        List<UserArmiesWrapper> list = linkMicBattleMessage.armies;
        if (list != null) {
            HashMap hashMap = new HashMap();
            for (UserArmiesWrapper userArmiesWrapper : list) {
                Long l = userArmiesWrapper.userId;
                if (l != null && userArmiesWrapper.userArmies != null) {
                    Long valueOf = Long.valueOf(l.longValue());
                    BattleUserArmies battleUserArmies = userArmiesWrapper.userArmies;
                    if (battleUserArmies == null) {
                        battleUserArmies = new BattleUserArmies();
                    }
                    hashMap.put(valueOf, battleUserArmies);
                }
            }
            LJIL(0L, 0L, hashMap);
        }
    }

    public final void LJIJJLI(long j, String str, java.util.Map map) {
        CL6.LIZIZ("match_prepare");
        this.LIZLLL = false;
        this.LJI = false;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIJJLI = map;
        c76280Twi.LJJIIZ = System.currentTimeMillis();
        c76280Twi.LJJ = j;
        C76265TwT.LJIIIIZZ(EnumC76330TxW.MATCH_TYPE_1V1);
        c76280Twi.LJIILL(EnumC76178Tv4.START, true);
        LJIIZILJ(j);
        C76272Twa.LIZ.LJJI(c76280Twi.LIZIZ(), B5G.LIZIZ().LJFF);
        C76272Twa.LJJIJIIJI(j, str, false);
        this.LJIIL.removeCallbacksAndMessages(null);
        if (j > 1) {
            this.LJIIL.postDelayed(new ARunnableS41S0100000_5(this, 199), 1000L);
        }
    }

    public final void LJIL(long j, long j2, java.util.Map map) {
        Long l;
        List<BattleUserArmy> list;
        long j3;
        DataChannel LJIIIIZZ;
        User owner;
        User owner2;
        ((HashMap) C76265TwT.LIZ.LJJIJL).clear();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((HashMap) C76265TwT.LIZ.LJJIJL).put(((Map.Entry) it.next()).getKey(), Long.valueOf(((BattleUserArmies) r1.getValue()).hostScore));
        }
        Room room = this.LJIIIIZZ;
        Object obj = null;
        if (room != null && (owner2 = room.getOwner()) != null) {
            l = Long.valueOf(owner2.getId());
        } else {
            l = null;
        }
        BattleUserArmies battleUserArmies = (BattleUserArmies) map.get(l);
        if (battleUserArmies != null) {
            list = battleUserArmies.userArmies;
        } else {
            list = null;
        }
        AbstractC76285Twn.LJIJ(list);
        if (battleUserArmies != null) {
            C76385TyP c76385TyP = new C76385TyP(j, j2, battleUserArmies.hostScore);
            DataChannel LJIIIIZZ2 = LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.rv0(BattleLeftScoreChannel.class, c76385TyP);
                LJIIIIZZ2.rv0(BattleMvpLeftListChannel.class, battleUserArmies.userArmies);
            }
        }
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            Object next = LIZLLL.next();
            C75883TqJ c75883TqJ = (C75883TqJ) next;
            Room room2 = this.LJIIIIZZ;
            if (room2 == null || (owner = room2.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                obj = next;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            j3 = c75883TqJ2.LIZ;
        } else {
            j3 = 0;
        }
        BattleUserArmies battleUserArmies2 = (BattleUserArmies) map.get(Long.valueOf(j3));
        if (battleUserArmies2 != null && (LJIIIIZZ = LJIIIIZZ()) != null) {
            LJIIIIZZ.rv0(BattleRightScoreChannel.class, Integer.valueOf(battleUserArmies2.hostScore));
            LJIIIIZZ.rv0(BattleMvpRightListChannel.class, battleUserArmies2.userArmies);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(java.lang.String r18, java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r19, java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo> r20, int r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76287Twp.LJIJI(java.lang.String, java.util.Map, java.util.Map, int):void");
    }
}
