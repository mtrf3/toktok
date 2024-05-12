package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Twy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76296Twy extends AbstractC76298Tx0 {
    public List<TeamUsersInfo> LJLLJ;

    @Override // X.AbstractC76298Tx0
    public final void LJIIL(LinkMicBattleItemCard message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIIJJI() {
        InterfaceC76347Txn LIZ;
        C76309TxB LIZ2;
        InterfaceC76347Txn LIZ3;
        U2A LIZJ;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ3 = interfaceC76348Txo.LIZ()) != null && (LIZJ = LIZ3.LIZJ()) != null) {
            C29306Beo.LJI(LIZJ);
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ = interfaceC76348Txo2.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
            LIZ2.LIZ();
        }
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIILJJIL() {
        LJIIIIZZ("onCoHostListChanged");
    }

    @Override // X.AbstractC76298Tx0
    public final void LIZJ(BattleInfoResponse battleInfoResponse) {
        int i;
        java.util.Map<Long, BattleTeamResult> map = battleInfoResponse.teamBattleResult;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 2;
        }
        LJIJ(i, "battle_info", map);
    }

    @Override // X.AbstractC76298Tx0
    public final void LIZLLL(LinkMicBattleArmiesMessage message) {
        List<BattleTeamUserArmies> list;
        List<BattleTeamUserArmies> list2;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LJLLI;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (list = message.teamArmies) != null) {
                for (BattleTeamUserArmies battleTeamUserArmies : list) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LJLLI;
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
            this.LJLL = message;
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 66));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC76298Tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r20) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76296Twy.LJII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIIJ(LinkMicBattleArmiesMessage message) {
        long j;
        o.LJIIIZ(message, "message");
        if (!AbstractC76298Tx0.LIZIZ(this, message.battleId)) {
            return;
        }
        C76290Tws c76290Tws = C76316TxI.LIZ;
        c76290Tws.getClass();
        if (message.triggerReason != EnumC76332TxY.OPT_OUT_UPDATE.getValue()) {
            if (!this.LJLJL) {
                java.util.Map<Long, Long> map = c76290Tws.LJIIIZ;
                List<BattleTeamUserArmies> list = message.teamArmies;
                boolean z = true;
                if (list != null) {
                    for (BattleTeamUserArmies battleTeamUserArmies : list) {
                        Long l = (Long) ((HashMap) map).get(battleTeamUserArmies.teamId);
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        if (j > battleTeamUserArmies.teamTotalScore) {
                            z = false;
                        }
                    }
                    if (!z) {
                        C0NB.LJ("MatchFeedViewDelegate2V2Impl", "LinkMicBattleArmiesMessage can't update score, jump");
                    }
                }
                List<BattleTeamUserArmies> list2 = message.teamArmies;
                if (list2 == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                LJIJJ(list2, message.fromUserId, message.giftId);
            } else {
                C0NB.LJ("MatchFeedViewDelegate2V2Impl", "not_in_batting");
            }
        }
        this.LJLLI = message;
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIILIIL(LinkMicBattleMessage message) {
        long j;
        o.LJIIIZ(message, "message");
        int i = message.action;
        if (i != 5) {
            if (i != 6 || !AbstractC76298Tx0.LIZIZ(this, message.battleId)) {
                return;
            }
            C76316TxI.LIZ.getClass();
            LJIIIIZZ("cut_short_msg");
            return;
        }
        if (!AbstractC76298Tx0.LIZIZ(this, message.battleId)) {
            return;
        }
        C76316TxI.LIZ.getClass();
        List<BattleTeamUserArmies> list = message.teamArmies;
        if (list != null) {
            LJIJJ(list, 0L, 0L);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<BattleTeamResult> list2 = message.teamBattleResult;
        if (list2 != null) {
            for (BattleTeamResult battleTeamResult : list2) {
                Long l = battleTeamResult.teamId;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                linkedHashMap.put(Long.valueOf(j), battleTeamResult);
            }
        }
        LJIJ(message.battleSetting.status, "finish_msg", linkedHashMap);
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIILLIIL(LinkMicBattlePunishFinishMessage message) {
        o.LJIIIZ(message, "message");
        if (!AbstractC76298Tx0.LIZIZ(this, message.battleId)) {
            return;
        }
        C76316TxI.LIZ.getClass();
        LJIIIIZZ("punish_finish_msg");
    }

    public final void LJIJI(List armies) {
        InterfaceC76347Txn LIZ;
        U2A LIZJ;
        InterfaceC76347Txn LIZ2;
        U2A LIZJ2;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ2 = interfaceC76348Txo.LIZ()) != null && (LIZJ2 = LIZ2.LIZJ()) != null) {
            C29306Beo.LJJLJLI(LIZJ2);
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ = interfaceC76348Txo2.LIZ()) != null && (LIZJ = LIZ.LIZJ()) != null) {
            LIZJ.LJII(true);
        }
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLLL = false;
        o.LJIIIZ(armies, "armies");
        C76290Tws c76290Tws = C76316TxI.LIZ;
        EnumC76178Tv4 LIZIZ = c76290Tws.LIZIZ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.START;
        if (LIZIZ.compareTo(enumC76178Tv4) < 0 && !this.LJLJJLL && !this.LJLJL && !this.LJLJLLL) {
            this.LJLJLLL = true;
            o.LJIIIZ(EnumC76330TxW.MATCH_TYPE_2V2, "<set-?>");
            System.currentTimeMillis();
            long LJ = AbstractC76298Tx0.LJ();
            c76290Tws.LJI(enumC76178Tv4, true);
            LJIIZILJ(LJ);
        }
        LJIJJ(armies, 0L, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC76298Tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r20, int r21) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76296Twy.LJI(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
    
        if (r5 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(int r18, java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76296Twy.LJIJ(int, java.lang.String, java.util.Map):void");
    }

    public final void LJIJJ(List<BattleTeamUserArmies> list, long j, long j2) {
        BattleTeamUserArmies battleTeamUserArmies;
        InterfaceC76348Txo interfaceC76348Txo;
        InterfaceC76347Txn LIZ;
        U2A LIZJ;
        InterfaceC76347Txn LIZ2;
        U2A LIZJ2;
        long j3;
        ((HashMap) C76316TxI.LIZ.LJIIIZ).clear();
        Iterator<BattleTeamUserArmies> it = list.iterator();
        int i = 0;
        while (true) {
            BattleTeamUserArmies battleTeamUserArmies2 = null;
            if (it.hasNext()) {
                BattleTeamUserArmies next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    BattleTeamUserArmies battleTeamUserArmies3 = next;
                    java.util.Map<Long, Long> map = C76316TxI.LIZ.LJIIIZ;
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
                long j4 = C76316TxI.LIZ.LJIIJ;
                long j5 = 1;
                if (j4 == 1) {
                    j5 = 2;
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
                if (battleTeamUserArmies4 != null) {
                    C76385TyP c76385TyP = new C76385TyP(j, j2, (int) battleTeamUserArmies4.teamTotalScore);
                    InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
                    if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZJ2 = LIZ2.LIZJ()) != null) {
                        LIZJ2.setLeftData(c76385TyP);
                    }
                }
                ListIterator<BattleTeamUserArmies> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    BattleTeamUserArmies previous = listIterator.previous();
                    Long l3 = previous.teamId;
                    if (l3 != null && l3.longValue() == j5) {
                        battleTeamUserArmies2 = previous;
                        break;
                    }
                }
                BattleTeamUserArmies battleTeamUserArmies5 = battleTeamUserArmies2;
                if (battleTeamUserArmies5 != null && (interfaceC76348Txo = this.LJLIL) != null && (LIZ = interfaceC76348Txo.LIZ()) != null && (LIZJ = LIZ.LIZJ()) != null) {
                    LIZJ.setRightValue((int) battleTeamUserArmies5.teamTotalScore);
                    return;
                }
                return;
            }
        }
    }
}
