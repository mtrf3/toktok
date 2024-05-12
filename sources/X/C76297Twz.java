package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Twz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76297Twz extends AbstractC76298Tx0 {
    @Override // X.AbstractC76298Tx0
    public final void LJIIJJI() {
        InterfaceC76347Txn LIZ;
        C76456TzY LIZLLL;
        InterfaceC76347Txn LIZ2;
        C76309TxB LIZ3;
        InterfaceC76347Txn LIZ4;
        U2A LIZJ;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ4 = interfaceC76348Txo.LIZ()) != null && (LIZJ = LIZ4.LIZJ()) != null) {
            C29306Beo.LJI(LIZJ);
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            LIZ3.LIZ();
        }
        InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
        if (interfaceC76348Txo3 != null && (LIZ = interfaceC76348Txo3.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null) {
            LIZLLL.LJI();
        }
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIILJJIL() {
        LJIIIIZZ("onCoHostListChanged");
    }

    @Override // X.AbstractC76298Tx0
    public final void LIZJ(BattleInfoResponse battleInfoResponse) {
        int i;
        java.util.Map<Long, BattleResult> map = battleInfoResponse.resultMap;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 2;
        }
        LJIJ("battle_info", map, i);
    }

    @Override // X.AbstractC76298Tx0
    public final void LIZLLL(LinkMicBattleArmiesMessage message) {
        java.util.Map<Long, BattleUserArmies> map;
        int i;
        java.util.Map<Long, BattleUserArmies> map2;
        BattleUserArmies battleUserArmies;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LJLLI;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (map = message.armies) != null) {
                for (Map.Entry<Long, BattleUserArmies> entry : map.entrySet()) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LJLLI;
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
            this.LJLL = message;
            C0NB.LIZ("arimies message looper  arimies buffer update");
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 65));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC76298Tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76297Twz.LJII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76298Tx0
    public final void LJIIJ(LinkMicBattleArmiesMessage message) {
        long j;
        o.LJIIIZ(message, "message");
        if (!AbstractC76298Tx0.LIZIZ(this, message.battleId)) {
            return;
        }
        if (message.triggerReason != EnumC76332TxY.OPT_OUT_UPDATE.getValue() && !this.LJLJL) {
            java.util.Map<Long, Long> map = C76316TxI.LIZ.LJIIIZ;
            java.util.Map<Long, BattleUserArmies> map2 = message.armies;
            boolean z = true;
            if (map2 != null) {
                Iterator<Map.Entry<Long, BattleUserArmies>> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Long l = (Long) ((HashMap) map).get(it.next().getKey());
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    if (j > r2.getValue().hostScore) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LinkMicBattleArmiesMessage can't update score, jump and triggerReason = ");
                    LIZ.append(message.triggerReason);
                    C0NB.LJ("MatchFeedViewDelegate1V1Impl", X1D.LIZIZ(LIZ));
                }
            }
            java.util.Map<Long, BattleUserArmies> map3 = message.armies;
            o.LJIIIIZZ(map3, "message.armies");
            LJIJJLI(message.fromUserId, message.giftId, map3);
        }
        this.LJLLI = message;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    @Override // X.AbstractC76298Tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76297Twz.LJIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    @Override // X.AbstractC76298Tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.Txo r0 = r6.LJLIL
            r5 = 0
            if (r0 == 0) goto L87
            X.Txn r0 = r0.LIZ()
            if (r0 == 0) goto L87
            X.Tq7 r0 = r0.LIZIZ()
            if (r0 == 0) goto L87
            X.Ts1 r4 = r0.LJFF()
        L1a:
            int r1 = r7.action
            r0 = 5
            if (r1 == r0) goto L6a
            r0 = 6
            if (r1 == r0) goto L23
        L22:
            return
        L23:
            long r0 = r7.battleId
            boolean r0 = X.AbstractC76298Tx0.LIZIZ(r6, r0)
            if (r0 != 0) goto L2c
            return
        L2c:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting.INSTANCE
            boolean r0 = r0.isEnabled()
            r3 = 1
            if (r0 == 0) goto L57
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r2 = r7.battleResult
            if (r2 == 0) goto L68
            if (r4 == 0) goto L41
            long r0 = r4.LIZIZ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L41:
            java.lang.Object r0 = r2.get(r5)
            com.bytedance.android.livesdk.model.message.battle.BattleResult r0 = (com.bytedance.android.livesdk.model.message.battle.BattleResult) r0
            if (r0 == 0) goto L68
            int r0 = r0.result
            if (r0 != 0) goto L68
            r2 = 1
        L4e:
            java.lang.String r1 = "post TwoMatchCutShortEvent"
            java.lang.String r0 = "MatchFeedViewDelegate1V1Impl"
            if (r2 == 0) goto L64
            X.C0NB.LJIIIZ(r0, r1)
        L57:
            X.Tws r0 = X.C76316TxI.LIZ
            r0.getClass()
            X.C75633TmH.LJIIJ = r3
            java.lang.String r0 = "cut_short_msg"
            r6.LJIIIIZZ(r0)
            goto L22
        L64:
            X.C0NB.LJIIIZ(r0, r1)
            goto L57
        L68:
            r2 = 0
            goto L4e
        L6a:
            long r0 = r7.battleId
            boolean r0 = X.AbstractC76298Tx0.LIZIZ(r6, r0)
            if (r0 != 0) goto L73
            return
        L73:
            X.Tws r0 = X.C76316TxI.LIZ
            r0.getClass()
            r6.LJIJI(r7)
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r2 = r7.battleResult
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r7.battleSetting
            int r1 = r0.status
            java.lang.String r0 = "finish_msg"
            r6.LJIJ(r0, r2, r1)
            goto L22
        L87:
            r4 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76297Twz.LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
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

    public final void LJIJI(LinkMicBattleMessage linkMicBattleMessage) {
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
            LJIJJLI(0L, 0L, hashMap);
        }
    }

    public final void LJIJJ(long j) {
        InterfaceC76347Txn LIZ;
        C76456TzY LIZLLL;
        MatchFeedItemViewModel matchFeedItemViewModel;
        InterfaceC76347Txn LIZ2;
        U2A LIZJ;
        InterfaceC76347Txn LIZ3;
        U2A LIZJ2;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ3 = interfaceC76348Txo.LIZ()) != null && (LIZJ2 = LIZ3.LIZJ()) != null) {
            C29306Beo.LJJLJLI(LIZJ2);
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
            LIZJ.LJII(true);
        }
        InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
        if (interfaceC76348Txo3 != null && (LIZ = interfaceC76348Txo3.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null && (matchFeedItemViewModel = LIZLLL.LIZ) != null) {
            matchFeedItemViewModel.LJLJJL = EnumC76178Tv4.START;
        }
        this.LJLJJLL = false;
        this.LJLJL = false;
        C76290Tws c76290Tws = C76316TxI.LIZ;
        System.currentTimeMillis();
        c76290Tws.getClass();
        o.LJIIIZ(EnumC76330TxW.MATCH_TYPE_1V1, "<set-?>");
        c76290Tws.LJI(EnumC76178Tv4.START, true);
        LJIIZILJ(j);
        this.LJLJI.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC76298Tx0
    public final boolean LJI(BattleInfoResponse battleInfoResponse, int i) {
        Integer num;
        C75989Ts1 c75989Ts1;
        InterfaceC76347Txn LIZ;
        C76456TzY LIZLLL;
        MatchFeedItemViewModel matchFeedItemViewModel;
        long j;
        InterfaceC76347Txn LIZ2;
        InterfaceC75871Tq7 LIZIZ;
        InterfaceC76347Txn LIZ3;
        InterfaceC75871Tq7 LIZIZ2;
        InterfaceC76347Txn LIZ4;
        U2A LIZJ;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("checkBattleInfo, info = ");
        LIZ5.append(battleInfoResponse);
        C0NB.LJIIIZ("MatchFeedViewDelegate1V1Impl", X1D.LIZIZ(LIZ5));
        C76290Tws c76290Tws = C76316TxI.LIZ;
        c76290Tws.LJFF(battleInfoResponse.setting);
        java.util.Map<Long, BattleResult> map = battleInfoResponse.resultMap;
        long LJ = AbstractC76298Tx0.LJ();
        BattleSetting battleSetting = battleInfoResponse.setting;
        C75989Ts1 c75989Ts12 = null;
        if (battleSetting != null) {
            num = Integer.valueOf(battleSetting.status);
        } else {
            num = null;
        }
        long j2 = 0;
        if (num == null || num.intValue() != 1) {
            int i2 = 2;
            if (num != null) {
                if (num.intValue() == 3) {
                    long value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue() + LJ;
                    if (value > 0) {
                        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
                        if (interfaceC76348Txo != null && (LIZ4 = interfaceC76348Txo.LIZ()) != null && (LIZJ = LIZ4.LIZJ()) != null) {
                            C29306Beo.LJJLJLI(LIZJ);
                        }
                        c76290Tws.LJIIIIZZ = value;
                        java.util.Map<Long, BattleUserArmies> map2 = battleInfoResponse.armies;
                        if (map2 != null) {
                            LJIJJLI(0L, 0L, map2);
                        }
                        BattleSetting battleSetting2 = battleInfoResponse.setting;
                        if (battleSetting2 != null) {
                            i2 = battleSetting2.status;
                        }
                        LJIJ("battle_info", map, i2);
                    }
                } else if (num.intValue() == 2) {
                    LJIIIIZZ("battle_info");
                }
            }
            C76316TxI.LIZ("check_info");
        } else if (LJ > 0) {
            java.util.Map<Long, BattleUserInfo> map3 = battleInfoResponse.userInfoMap;
            InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
            if (interfaceC76348Txo2 != null && (LIZ3 = interfaceC76348Txo2.LIZ()) != null && (LIZIZ2 = LIZ3.LIZIZ()) != null) {
                c75989Ts1 = LIZIZ2.LJFF();
            } else {
                c75989Ts1 = null;
            }
            InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
            if (interfaceC76348Txo3 != null && (LIZ2 = interfaceC76348Txo3.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
                c75989Ts12 = LIZIZ.LJ();
            }
            if (map3 != null) {
                if (c75989Ts1 != null) {
                    j = c75989Ts1.LIZIZ;
                } else {
                    j = 0;
                }
                map3.get(Long.valueOf(j));
                if (c75989Ts12 != null) {
                    j2 = c75989Ts12.LIZIZ;
                }
                map3.get(Long.valueOf(j2));
            }
            LJIJJ(LJ);
            java.util.Map<Long, BattleUserArmies> map4 = battleInfoResponse.armies;
            if (map4 != null) {
                LJIJJLI(0L, 0L, map4);
            }
            InterfaceC76348Txo interfaceC76348Txo4 = this.LJLIL;
            if (interfaceC76348Txo4 != null && (LIZ = interfaceC76348Txo4.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null && (matchFeedItemViewModel = LIZLLL.LIZ) != null) {
                matchFeedItemViewModel.Ym0(battleInfoResponse);
            }
        } else {
            return false;
        }
        if (c76290Tws.LIZJ()) {
            EnumC76320TxM newStatus = EnumC76320TxM.MATCH_BATTLE_INFO;
            o.LJIIIZ(newStatus, "newStatus");
            System.currentTimeMillis();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r4 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(java.lang.String r8, java.util.Map r9, int r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76297Twz.LJIJ(java.lang.String, java.util.Map, int):void");
    }

    public final void LJIJJLI(long j, long j2, java.util.Map map) {
        Long l;
        InterfaceC76348Txo interfaceC76348Txo;
        InterfaceC76347Txn LIZ;
        U2A LIZJ;
        InterfaceC76347Txn LIZ2;
        InterfaceC75871Tq7 LIZIZ;
        C75989Ts1 LJ;
        InterfaceC76347Txn LIZ3;
        U2A LIZJ2;
        InterfaceC76347Txn LIZ4;
        InterfaceC75871Tq7 LIZIZ2;
        C75989Ts1 LJFF;
        ((HashMap) C76316TxI.LIZ.LJIIIZ).clear();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((HashMap) C76316TxI.LIZ.LJIIIZ).put(((Map.Entry) it.next()).getKey(), Long.valueOf(((BattleUserArmies) r1.getValue()).hostScore));
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        Long l2 = null;
        if (interfaceC76348Txo2 != null && (LIZ4 = interfaceC76348Txo2.LIZ()) != null && (LIZIZ2 = LIZ4.LIZIZ()) != null && (LJFF = LIZIZ2.LJFF()) != null) {
            l = Long.valueOf(LJFF.LIZIZ);
        } else {
            l = null;
        }
        BattleUserArmies battleUserArmies = (BattleUserArmies) map.get(l);
        if (battleUserArmies != null) {
            C76385TyP c76385TyP = new C76385TyP(j, j2, battleUserArmies.hostScore);
            InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
            if (interfaceC76348Txo3 != null && (LIZ3 = interfaceC76348Txo3.LIZ()) != null && (LIZJ2 = LIZ3.LIZJ()) != null) {
                LIZJ2.setLeftData(c76385TyP);
            }
        }
        InterfaceC76348Txo interfaceC76348Txo4 = this.LJLIL;
        if (interfaceC76348Txo4 != null && (LIZ2 = interfaceC76348Txo4.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null && (LJ = LIZIZ.LJ()) != null) {
            l2 = Long.valueOf(LJ.LIZIZ);
        }
        BattleUserArmies battleUserArmies2 = (BattleUserArmies) map.get(l2);
        if (battleUserArmies2 != null && (interfaceC76348Txo = this.LJLIL) != null && (LIZ = interfaceC76348Txo.LIZ()) != null && (LIZJ = LIZ.LIZJ()) != null) {
            LIZJ.setRightValue(battleUserArmies2.hostScore);
        }
    }
}
