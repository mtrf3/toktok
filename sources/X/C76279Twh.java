package X;

import Y.ARunnableS32S0200000_13;
import Y.AfS11S0310000_13;
import Y.AfS19S0210000_13;
import Y.AfS1S0510000_13;
import Y.AfS29S0110000_13;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostCmdDismissLinkDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDismissInvitePanelWhenFinishSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.livesetting.linkmic.match.TwoMatchProgressOptionalSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.model.message.battle.ExemptStrategy;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS42S0210000_13;
import kotlin.jvm.internal.AqS68S0110000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twh */
/* loaded from: classes14.dex */
public final class C76279Twh extends AbstractC76282Twk<InterfaceC76313TxF> {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final Handler LJIIJ = new Handler(C16880lQ.LLJJJJ());
    public C76802UCg LJIIJJI;
    public InterfaceC92693kP LJIIL;
    public int LJIILIIL;
    public String LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;

    public final void LJJI() {
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2 = this.LJIIL;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJIIL) != null) {
            interfaceC92693kP.dispose();
        }
        this.LJIILIIL = 0;
    }

    public final void LJJIJ() {
        if (!C76265TwT.LIZ.LJIILL(EnumC76178Tv4.FINISH, false)) {
            return;
        }
        LJJII(this, 106, false, false, null, 24);
    }

    public final void LJJIJIL() {
        Room room;
        if (this.LJ == null) {
            DataChannel LJI = LJI();
            if (LJI != null) {
                room = (Room) LJI.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            this.LJ = room;
        }
        Room room2 = this.LJ;
        if (room2 != null) {
            C76280Twi c76280Twi = C76265TwT.LIZ;
            ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).punish(room2.getId(), c76280Twi.LIZJ(), false, 1, c76280Twi.LIZIZ()).LIZJ(LIZIZ())).LIZJ(C76334Txa.LJLIL, C76335Txb.LJLIL);
        }
    }

    @Override // X.AbstractC76282Twk
    public final void LIZLLL() {
        super.LIZLLL();
        C76802UCg c76802UCg = this.LJIIJJI;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r5.equals("cancel_battle_info") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r5.equals("inviter_battle_info") == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJJ(java.lang.String r5) {
        /*
            java.lang.String r1 = "checkStateByScene scene = "
            java.lang.String r0 = " cur state = "
            java.lang.StringBuilder r1 = X.C25620zW.LIZIZ(r1, r5, r0)
            X.Twi r4 = X.C76265TwT.LIZ
            X.Tv4 r0 = r4.LJ()
            r1.append(r0)
            java.lang.String r0 = " rematch state = "
            r1.append(r0)
            X.Twi r3 = X.C76265TwT.LIZIZ
            X.Tv4 r0 = r3.LJ()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "TwoMatchViewAnchorPrese"
            X.C0NB.LJIIIZ(r0, r1)
            int r0 = r5.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1420548720: goto L56;
                case -520945838: goto L4d;
                case -87435342: goto L44;
                case 1026886431: goto L3b;
                case 1838837555: goto L32;
                default: goto L31;
            }
        L31:
            return r1
        L32:
            java.lang.String r0 = "resume_match"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5f
            goto L31
        L3b:
            java.lang.String r0 = "inviter_battle_info"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L82
            goto L31
        L44:
            java.lang.String r0 = "open_result"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L60
            goto L31
        L4d:
            java.lang.String r0 = "each_other"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L71
            goto L31
        L56:
            java.lang.String r0 = "cancel_battle_info"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L82
            goto L31
        L5f:
            return r2
        L60:
            X.Tv4 r0 = r4.LJ()
            X.Tv4 r1 = X.EnumC76178Tv4.RECEIVED
            if (r0 == r1) goto L6e
            X.Tv4 r0 = r3.LJ()
            if (r0 != r1) goto L6f
        L6e:
            return r2
        L6f:
            r2 = 0
            goto L6e
        L71:
            X.Tv4 r0 = r4.LJ()
            X.Tv4 r1 = X.EnumC76178Tv4.INVITED
            if (r0 == r1) goto L7f
            X.Tv4 r0 = r3.LJ()
            if (r0 != r1) goto L80
        L7f:
            return r2
        L80:
            r2 = 0
            goto L7f
        L82:
            X.Tv4 r0 = r4.LJ()
            X.Tv4 r1 = X.EnumC76178Tv4.INVITED
            if (r0 == r1) goto L90
            X.Tv4 r0 = r3.LJ()
            if (r0 != r1) goto L91
        L90:
            return r2
        L91:
            r2 = 0
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76279Twh.LJIJJ(java.lang.String):boolean");
    }

    public static boolean LJJIJIIJI(long j) {
        if (j == 0) {
            return false;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJ() == EnumC76178Tv4.START && j == c76280Twi.LIZIZ()) {
            return false;
        }
        return true;
    }

    public static final void LJJIZ(List<BattleUserArmy> list) {
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
        java.util.Map<Long, BattleUserArmies> map;
        int i;
        java.util.Map<Long, BattleUserArmies> map2;
        BattleUserArmies battleUserArmies;
        o.LJIIIZ(message, "message");
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LIZ;
            boolean z = true;
            if (linkMicBattleArmiesMessage != null && message.battleId == linkMicBattleArmiesMessage.battleId && (map = message.armies) != null) {
                for (Map.Entry<Long, BattleUserArmies> entry : map.entrySet()) {
                    LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = this.LIZ;
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
            this.LIZIZ = message;
            return;
        }
        C30946CCo.LIZ(new ARunnableS32S0200000_13(this, message, 52));
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIIZ(LinkMicBattleArmiesMessage message) {
        long j;
        Long l;
        List<BattleUserArmy> list;
        DataChannel LJI;
        User owner;
        DataChannel LJI2;
        User owner2;
        o.LJIIIZ(message, "message");
        boolean z = true;
        if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
            C76272Twa.LJJJJZI(true, "battle_id_invalid", message);
            return;
        }
        long j2 = 0;
        if (message.triggerReason == EnumC76332TxY.OPT_OUT_UPDATE.getValue()) {
            java.util.Map<Long, BattleUserArmies> map = message.armies;
            o.LJIIIIZZ(map, "message.armies");
            Room room = this.LJ;
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
            LJJIZ(list);
            if (battleUserArmies != null && (LJI2 = LJI()) != null) {
                LJI2.rv0(BattleMvpLeftListChannel.class, battleUserArmies.userArmies);
            }
            Iterator LIZLLL = C08880Wm.LIZLLL();
            while (LIZLLL.hasNext()) {
                Object next = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) next;
                Room room2 = this.LJ;
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
            if (battleUserArmies2 != null && (LJI = LJI()) != null) {
                LJI.rv0(BattleMvpRightListChannel.class, battleUserArmies2.userArmies);
            }
        } else if (!this.LJIIIIZZ) {
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
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LinkMicBattleArmiesMessage can't update score, two anchor jump and triggerReason = ");
                    LIZ.append(message.triggerReason);
                    C0NB.LJ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
                }
            }
            java.util.Map<Long, BattleUserArmies> map4 = message.armies;
            o.LJIIIIZZ(map4, "message.armies");
            LJJJ(map4, message.fromUserId, message.giftId, message.triggerCriticalStrike);
        } else {
            C76272Twa.LJJJJZI(true, "not_in_batting", message);
        }
        this.LIZ = message;
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIJ(LinkMicBattleMessage message) {
        boolean z;
        boolean z2;
        Long l;
        User owner;
        U8H LJJZZI;
        U8H LJJZZI2;
        List<TeamUsersInfo> list;
        EnumC75744To4 enumC75744To4;
        Long l2;
        EnumC75744To4 enumC75744To42;
        boolean z3;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dealLinkMicBattleMessage, message = ");
        LIZ.append(message.action);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        AbstractC76282Twk.LJIILL(message);
        int i = message.action;
        int i2 = 2;
        boolean z4 = false;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                        C76272Twa.LJJIJL(message, true);
                        if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
                            return;
                        }
                        C76280Twi c76280Twi = C76265TwT.LIZ;
                        c76280Twi.LJJII = true;
                        C75633TmH.LJIIJ = true;
                        java.util.Map<Long, BattleResult> map = message.battleResult;
                        Room room = this.LJ;
                        if (room != null) {
                            l2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l2 = null;
                        }
                        BattleResult battleResult = map.get(l2);
                        if (battleResult != null && battleResult.result == 1) {
                            enumC75744To42 = EnumC75744To4.POSITIVE_OVER;
                        } else {
                            enumC75744To42 = EnumC75744To4.NEGATIVE_OVER;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("handleCutShortMessage ");
                        if (enumC75744To42 == EnumC75744To4.POSITIVE_OVER) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        FT5.LJ(LIZ2, z3, LIZ2, "TwoMatchViewAnchorPrese");
                        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                            int i3 = -1;
                            if (!c76280Twi.LJJIFFI && enumC75744To42 == EnumC75744To4.NEGATIVE_OVER) {
                                C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "post TwoMatchCutShortEvent");
                                DataChannel LJI = LJI();
                                if (LJI != null) {
                                    InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
                                    if (interfaceC76313TxF != null) {
                                        i3 = interfaceC76313TxF.LJLJJL();
                                    }
                                    LJI.qv0(TwoMatchCutShortEvent.class, new C76349Txp(i3, false));
                                }
                            } else {
                                C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "post TwoMatchCutShortEvent");
                                DataChannel LJI2 = LJI();
                                if (LJI2 != null) {
                                    InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) this.LIZLLL;
                                    if (interfaceC76313TxF2 != null) {
                                        i3 = interfaceC76313TxF2.LJLJJL();
                                    }
                                    LJI2.qv0(TwoMatchCutShortEvent.class, new C76349Txp(i3, true));
                                }
                            }
                        }
                        LJJIJLIJ(enumC75744To42, null);
                        if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                            C76271TwZ.LIZ.LJJLJLI(false);
                        }
                        LJJIIZI("cut_short_msg", true);
                        return;
                    }
                    C76272Twa.LJJIII(message, true);
                    if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
                        return;
                    }
                    C76265TwT.LIZ.LJJII = false;
                    List<UserArmiesWrapper> list2 = message.armies;
                    if (list2 != null) {
                        HashMap hashMap = new HashMap();
                        for (UserArmiesWrapper userArmiesWrapper : list2) {
                            Long l3 = userArmiesWrapper.userId;
                            if (l3 != null && userArmiesWrapper.userArmies != null) {
                                long longValue = l3.longValue();
                                BattleUserArmies battleUserArmies = userArmiesWrapper.userArmies;
                                if (battleUserArmies != null) {
                                    hashMap.put(Long.valueOf(longValue), battleUserArmies);
                                }
                            }
                        }
                        LJJJ(hashMap, 0L, 0L, false);
                    }
                    LJJ(1, "finish_msg", message.battleResult, message.battleCombos, message.battleSetting.status);
                    C76271TwZ.LIZ.LJLIIIL(false);
                    return;
                }
                if (message.battleSetting.inviteType == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue() && !LJJIJIIJI(message.battleId)) {
                    C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "handleOpenMsgWhenBattleStarted into");
                    C76272Twa.LJJJI(message, true);
                    return;
                }
                LJJI();
                C76280Twi c76280Twi2 = C76265TwT.LIZ;
                ((HashMap) c76280Twi2.LJJIJL).clear();
                if (c76280Twi2.LJ() == EnumC76178Tv4.PUNISH) {
                    LJJIJIL();
                    C75832TpU c75832TpU = C75832TpU.LIZ;
                    C76244Tw8 LJII = LJII();
                    if (LJII != null) {
                        list = LJII.LJIILL;
                    } else {
                        list = null;
                    }
                    if (C76265TwT.LIZIZ.LJIILIIL) {
                        enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
                    } else {
                        enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
                    }
                    c75832TpU.LJJIIJ(list, false, enumC75744To4);
                    C76265TwT.LJI = c76280Twi2.LJIJI;
                }
                C76802UCg c76802UCg = this.LJIIJJI;
                if (c76802UCg != null) {
                    c76802UCg.LIZ();
                }
                C75622Tm6.LJIIJJI(message.battleId, false, z2);
                InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
                if (LJJIJL != null && (LJJZZI2 = LJJIJL.LJJZZI()) != null) {
                    LJJZZI2.LJJZ(message.battleId);
                }
                InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
                if (LJJIJL2 != null && (LJJZZI = LJJIJL2.LJJZZI()) != null) {
                    LJJZZI.LJJJJJL("match_info", C113554cx.LJJLIIIIJ(new OSZ("match_type", "1")));
                }
                C76265TwT.LJIIIZ();
                c76280Twi2.LJIILIIL(message.battleSetting);
                C76272Twa.LJJJI(message, true);
                C75622Tm6.LJIIJ(message, false, z2);
                List<BattleUserInfoWrapper> list3 = message.anchorInfo;
                if (list3 != null) {
                    for (BattleUserInfoWrapper battleUserInfoWrapper : list3) {
                        Long l4 = battleUserInfoWrapper.userId;
                        Room room2 = this.LJ;
                        if (room2 != null && (owner = room2.getOwner()) != null) {
                            l = Long.valueOf(owner.getId());
                        } else {
                            l = null;
                        }
                        if (o.LJ(l4, l)) {
                            C76265TwT.LIZ.LJJIJLIJ = battleUserInfoWrapper.userInfo;
                        } else {
                            C76265TwT.LIZ.LJJIL = battleUserInfoWrapper.userInfo;
                        }
                    }
                }
                C76280Twi c76280Twi3 = C76265TwT.LIZ;
                c76280Twi3.LJJIIZI = message.battleSetting.startTimeMs;
                LJJIIZ(AbstractC76282Twk.LJFF(), "open_message", message.battleCombos);
                C76324TxQ.LIZJ();
                c76280Twi3.LJJIJIIJIL = message.mBattleDisplayConfig;
                C75832TpU c75832TpU2 = C75832TpU.LIZ;
                c75832TpU2.LJIJJLI(null, false, "livesdk_connection_success");
                c75832TpU2.LJIJJLI(null, false, "livesdk_connection_success_rec");
                return;
            }
            if (message.battleId == C76265TwT.LIZIZ.LIZIZ()) {
                z4 = true;
            }
            JSONObject jSONObject = new JSONObject();
            C76272Twa c76272Twa = C76272Twa.LIZ;
            C75192TfA.LJIIIZ(message, jSONObject);
            C76272Twa.LJIJJ(jSONObject, z4);
            C76272Twa.LJJJLIIL(c76272Twa, "cancel_message", jSONObject, z4, null, 56);
            C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "handleCancelMessage");
            if (!AbstractC76282Twk.LIZJ(this, message.battleId, z4, 4)) {
                return;
            }
            InterfaceC76313TxF interfaceC76313TxF3 = (InterfaceC76313TxF) this.LIZLLL;
            if (interfaceC76313TxF3 != null) {
                interfaceC76313TxF3.LJIJ();
            }
            if (!z4) {
                i2 = 1;
            }
            C76265TwT.LJII(i2, "cancel_message");
            C76324TxQ.LIZJ();
            return;
        }
        long j = message.battleId;
        C76280Twi c76280Twi4 = C76265TwT.LIZIZ;
        if (j == c76280Twi4.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "handleRejectMessage");
        JSONObject jSONObject2 = new JSONObject();
        C76272Twa c76272Twa2 = C76272Twa.LIZ;
        C75192TfA.LJIIIZ(message, jSONObject2);
        C76272Twa.LJIJJ(jSONObject2, z);
        C76272Twa.LJJJLIIL(c76272Twa2, "reject_message", jSONObject2, z, null, 56);
        if (!AbstractC76282Twk.LIZJ(this, message.battleId, z, 4)) {
            return;
        }
        C76261TwP.LIZ = true;
        InterfaceC76313TxF interfaceC76313TxF4 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF4 != null) {
            interfaceC76313TxF4.LJIIJ(message);
        }
        if (z) {
            c76280Twi4.LJIIIZ("reject_message", true);
        } else {
            C76265TwT.LJII(0, "reject_message");
        }
        C76324TxQ.LIZJ();
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIJJI(LinkMicBattlePunishFinishMessage message) {
        o.LJIIIZ(message, "message");
        boolean z = true;
        C76272Twa.LJJJJI(true, message);
        if (!AbstractC76282Twk.LIZJ(this, message.battleId, false, 6)) {
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (message.reason != 1) {
            z = false;
        }
        c76280Twi.LJJIII = z;
        LJJIIZI("punish_finish_msg", false);
    }

    @Override // X.AbstractC76282Twk
    public final void LJIIL(LinkMicBattleVictoryLapMessage message) {
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
            if (c76280Twi.LIZIZ() != message.battleId) {
                return;
            }
            c76280Twi.LJJJJZI = message.anchorRegion;
            c76280Twi.LJJJJLI = true;
            c76280Twi.LJJJLIIL = message.triggerGuideV2;
            InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
            if (interfaceC76313TxF != null) {
                interfaceC76313TxF.LIZJ(false);
            }
            C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "truth_or_dare_enter_match_victory_lap"));
            return;
        }
        C76280Twi c76280Twi2 = C76265TwT.LIZ;
        c76280Twi2.LJJJJLL = false;
        c76280Twi2.LJJJJL = false;
        c76280Twi2.LJJJJJL = false;
        c76280Twi2.LJJJLL = null;
        c76280Twi2.LJJJJLI = false;
        c76280Twi2.LJJJLZIJ = message.truthOrDareCloseNotice;
        InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF2 != null) {
            interfaceC76313TxF2.LJ();
        }
        C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "truth_or_dare_disable_feature"));
    }

    public final void LJIJI(String str) {
        if (o.LJ(str, "cancel_battle_info")) {
            LJJII(this, 108, true, false, null, 24);
        }
    }

    public final void LJIJJLI(boolean z) {
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF != null) {
            interfaceC76313TxF.LJIILJJIL(new AqS68S0110000_13(this, z, 1), z);
        }
    }

    public final void LJIL(EnumC76319TxL enumC76319TxL) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dealInvite, source = ");
        LIZ.append(enumC76319TxL.getValue());
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        if (this.LIZLLL == 0) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLIIIZ;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LINK_MIC_BATTLE_HAS_SHOW_GUIDE.value");
        if (LIZJ.booleanValue()) {
            LJJIIJ(enumC76319TxL, null, false);
            B5G.LIZIZ().LJJJJL = enumC76319TxL.getValue();
        } else {
            P p = this.LIZLLL;
            if (p != 0 && p.LJIIL(new AqS42S0210000_13(this, enumC76319TxL, 0), enumC76319TxL)) {
                c48459J0d.LIZ(Boolean.TRUE);
            } else {
                C0NB.LJ("TwoMatchViewAnchorPrese", " dealInvite -> show Dialog error");
            }
        }
    }

    public final void LJIJ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        long j;
        C76280Twi c76280Twi;
        C76280Twi c76280Twi2;
        User owner;
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "cancel");
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
        Object obj = null;
        if (interfaceC76313TxF == null || Long.valueOf(interfaceC76313TxF.LJIL()) == null) {
            return;
        }
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            Object next = LIZLLL.next();
            C75883TqJ c75883TqJ = (C75883TqJ) next;
            Room room = this.LJ;
            if (room == null || (owner = room.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                obj = next;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            j = c75883TqJ2.LIZIZ;
        } else {
            j = -1;
        }
        long j2 = B5G.LIZIZ().LJFF;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        long LIZIZ = c76280Twi.LIZIZ();
        if (j2 == 0) {
            if (z) {
                c76280Twi2 = C76265TwT.LIZIZ;
            } else {
                c76280Twi2 = C76265TwT.LIZ;
            }
            j2 = c76280Twi2.LJJIJIL;
        }
        if (LIZIZ == 0) {
            C76272Twa.LJJIJIL(new Exception("battle_id is 0"), z);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJJJLIIL(c76272Twa, "cancel_request", jSONObject, false, null, 60);
        C76272Twa.LJFF = System.currentTimeMillis();
        ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).cancel(j, j2, LIZIZ).LIZJ(LIZIZ())).LIZJ(new AfS19S0210000_13(this, interfaceC65784Pro, z, 3), new AfS19S0210000_13(this, interfaceC65784Pro, z, 4));
    }

    public final boolean LJJIII(int i, long j) {
        boolean z;
        if (this.LJI) {
            return false;
        }
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        if (i != 103 || (j != 1 && j != 3)) {
            z = true;
        } else {
            z = false;
        }
        if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.FINISH) < 0) {
            LJJIFFI(i, true, z, C76366Ty6.LJLIL, j);
        } else if (EnumC76178Tv4.PUNISH.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.DRAW) < 0) {
            LJJIJIIJIL(i, true, C76367Ty7.LJLIL);
        }
        return true;
    }

    public final void LJJIIZI(String str, boolean z) {
        EnumC75744To4 enumC75744To4;
        List<TeamUsersInfo> list;
        DataChannel LJI;
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF != null) {
            interfaceC76313TxF.LJLJJI();
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIILL(EnumC76178Tv4.END, false)) {
            return;
        }
        if (str.equals("punish_request") || str.equals("punish_finish_msg") || str.equals("punish_cut_short_request") || str.equals("punish_cut_short_request_negative")) {
            if (str.equals("punish_request")) {
                enumC75744To4 = EnumC75744To4.TIME_OUT;
            } else if (str.equals("punish_cut_short_request")) {
                enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
            } else if (str.equals("punish_cut_short_request_negative")) {
                enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
            } else if (str.equals("punish_finish_msg")) {
                if (c76280Twi.LJJIII) {
                    enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
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
            c75832TpU.LJJIIJ(list, false, enumC75744To4);
        }
        CL6.LIZJ();
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
        C76802UCg c76802UCg = this.LJIIJJI;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        this.LJIIJ.removeCallbacksAndMessages(null);
        C76265TwT.LJI = c76280Twi.LJIJI;
        C76265TwT.LJII(1, "battle_end");
    }

    public final void LJJIJL(int i, boolean z) {
        String str;
        EnumC75744To4 enumC75744To4;
        if (i == 104) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C29306Beo.LJIJJLI(this.LJIILJJIL)) {
                String str2 = this.LJIILJJIL;
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
            if (z) {
                enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
            } else {
                enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
            }
            c75832TpU.LJJIII(null, false, enumC75744To4, linkedHashMap);
        }
    }

    public final void LJJIJLIJ(EnumC75744To4 enumC75744To4, Integer num) {
        Object obj;
        String str;
        String LJIILL;
        User owner;
        String str2;
        String str3 = null;
        if (!this.LJIIIIZZ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C29306Beo.LJIJJLI(this.LJIILJJIL)) {
                String str4 = this.LJIILJJIL;
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("cohost_invite_request_from", str4);
            }
            if (num != null) {
                num.intValue();
                if (B5G.LIZIZ().LJJIJLIJ) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_live_end", str2);
            }
            C75832TpU.LIZ.LJJIII(null, false, enumC75744To4, linkedHashMap);
        }
        this.LJIIIIZZ = true;
        if (this.LJII || LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            return;
        }
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (true) {
            if (LIZLLL.hasNext()) {
                obj = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                Room room = this.LJ;
                if (room == null || (owner = room.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            C75768ToS c75768ToS = c75883TqJ2.LJIIZILJ;
            if (c75768ToS != null) {
                str = c75768ToS.LIZ;
                str3 = c75768ToS.LIZIZ;
            } else {
                str = null;
            }
            String LIZIZ = C05170If.LIZIZ(str, str3);
            if (C76265TwT.LIZ.LJJIFFI) {
                LJIILL = C15380j0.LJIILL(R.string.mj_, LIZIZ);
            } else {
                LJIILL = C15380j0.LJIILL(R.string.mja, LIZIZ);
            }
            C30868C9o.LJI(LJIILL);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r6.equals("each_other") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting.INSTANCE;
        r2 = r1.getValue().invitee_open_delay;
        r0 = r1.getValue().invitee_battle_info_retry_duration;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r6.equals("open_result") != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r1 = "TwoMatchViewAnchorPrese"
            java.lang.String r0 = "tryToRequestBattleInfoForBattleStart scene"
            X.C0NB.LJIIIZ(r1, r0)
            r5.LJJI()
            int r0 = r6.hashCode()
            r2 = 0
            switch(r0) {
                case -1420548720: goto L17;
                case -520945838: goto L20;
                case -87435342: goto L29;
                case 1026886431: goto L41;
                case 1838837555: goto L4a;
                default: goto L13;
            }
        L13:
            r5.LJJI()
            return
        L17:
            java.lang.String r0 = "cancel_battle_info"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L53
            goto L13
        L20:
            java.lang.String r0 = "each_other"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L31
            goto L13
        L29:
            java.lang.String r0 = "open_result"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L13
        L31:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData r0 = r1.getValue()
            int r0 = r0.invitee_open_delay
            long r2 = (long) r0
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData r0 = r1.getValue()
            int r0 = r0.invitee_battle_info_retry_duration
            goto L6b
        L41:
            java.lang.String r0 = "inviter_battle_info"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5c
            goto L13
        L4a:
            java.lang.String r0 = "resume_match"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6d
            goto L13
        L53:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData r0 = r0.getValue()
            int r0 = r0.cancel_invite_info_retry_duration
            goto L6b
        L5c:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData r0 = r1.getValue()
            int r0 = r0.inviter_open_delay
            long r2 = (long) r0
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData r0 = r1.getValue()
            int r0 = r0.inviter_battle_info_retry_duration
        L6b:
            long r0 = (long) r0
            goto L6f
        L6d:
            r0 = 3000(0xbb8, double:1.482E-320)
        L6f:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.SsD r1 = X.TMC.LJIL(r2, r0, r4)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.Sy4 r0 = r5.LIZIZ()
            java.lang.Object r2 = r1.LIZJ(r0)
            X.Bng r2 = (X.InterfaceC29856Bng) r2
            Y.AfS8S1110000_13 r1 = new Y.AfS8S1110000_13
            r0 = 2
            r1.<init>(r5, r6, r7, r0)
            X.SrX r0 = r2.LIZIZ(r1)
            r5.LJIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76279Twh.LJJIL(java.lang.String, boolean):void");
    }

    public final void LJJIIJ(EnumC76319TxL enumC76319TxL, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        C76280Twi c76280Twi;
        C76280Twi c76280Twi2;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76280Twi.LJ = z;
        c76280Twi.LJJJI = enumC76319TxL;
        if (TwoMatchProgressOptionalSetting.INSTANCE.getValue()) {
            if (this.LJIILL) {
                return;
            }
            C76272Twa c76272Twa = C76272Twa.LIZ;
            JSONObject jSONObject = new JSONObject();
            C76272Twa.LJIJJ(jSONObject, z);
            C76272Twa.LJIJ(jSONObject);
            if (z) {
                c76280Twi2 = C76265TwT.LIZIZ;
            } else {
                c76280Twi2 = C76265TwT.LIZ;
            }
            c76272Twa.LJIILLIIL(jSONObject, c76280Twi2);
            C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
            C76272Twa.LJJJLIIL(c76272Twa, "prepare_request", jSONObject, z, null, 56);
            C76272Twa.LJIILL = C30725C4b.LIZ();
            this.LJIILL = true;
            ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).prepareBattle(B5G.LIZIZ().LJFF).LIZJ(LIZIZ())).LIZJ(new AfS11S0310000_13(this, enumC76319TxL, interfaceC88472Yns, z, 1), new AfS29S0110000_13(this, z, 3));
            return;
        }
        LJJIIJZLJL(enumC76319TxL, interfaceC88472Yns, z);
    }

    public final void LJJIIJZLJL(EnumC76319TxL enumC76319TxL, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        Long l;
        Long l2;
        C76280Twi c76280Twi;
        C76280Twi c76280Twi2;
        long j;
        long j2;
        long j3;
        long j4;
        if (z) {
            if (C76265TwT.LIZIZ.LJ() != EnumC76178Tv4.NORMAL) {
                return;
            }
        } else if (C76265TwT.LIZ.LJ() != EnumC76178Tv4.NORMAL) {
            return;
        }
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
        Long l3 = null;
        if (interfaceC76313TxF == null || Long.valueOf(interfaceC76313TxF.LJIL()) == null) {
            return;
        }
        InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF2 != null) {
            l = Long.valueOf(interfaceC76313TxF2.LJIL());
        } else {
            l = null;
        }
        InterfaceC76313TxF interfaceC76313TxF3 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF3 == null || Long.valueOf(interfaceC76313TxF3.LIZ()) == null) {
            return;
        }
        InterfaceC76313TxF interfaceC76313TxF4 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF4 != null) {
            l2 = Long.valueOf(interfaceC76313TxF4.LIZ());
        } else {
            l2 = null;
        }
        InterfaceC76313TxF interfaceC76313TxF5 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF5 == null || Long.valueOf(interfaceC76313TxF5.LJFF()) == null) {
            return;
        }
        InterfaceC76313TxF interfaceC76313TxF6 = (InterfaceC76313TxF) this.LIZLLL;
        if (interfaceC76313TxF6 != null) {
            l3 = Long.valueOf(interfaceC76313TxF6.LJFF());
        }
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76280Twi.LJJIIJZLJL = System.currentTimeMillis();
        if (z) {
            c76280Twi2 = C76265TwT.LIZIZ;
        } else {
            c76280Twi2 = C76265TwT.LIZ;
        }
        c76280Twi2.LJIILL(EnumC76178Tv4.INVITED, false);
        c76280Twi2.LJIILIIL = true;
        c76280Twi2.LJ = z;
        c76280Twi2.LJJJI = enumC76319TxL;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        if (l3 != null) {
            j = l3.longValue();
        } else {
            j = 0;
        }
        c75832TpU.LJJJ(j, enumC76319TxL, null, null, false, z);
        C76324TxQ.LIZ = 0;
        C76324TxQ.LIZIZ = z ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJJJLIIL(c76272Twa, "invite_request", jSONObject, z, null, 56);
        C76272Twa.LJ = System.currentTimeMillis();
        C65814PsI.LIZ().getClass();
        LinkBattleApi linkBattleApi = (LinkBattleApi) C65814PsI.LIZIZ(LinkBattleApi.class);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (l2 != null) {
            j3 = l2.longValue();
        } else {
            j3 = 0;
        }
        if (l3 != null) {
            j4 = l3.longValue();
        } else {
            j4 = 0;
        }
        ((InterfaceC29856Bng) linkBattleApi.invite(j2, j3, j4, z ? 1 : 0, c76280Twi2.LJIILL).LIZJ(LIZIZ())).LIZJ(new AfS1S0510000_13(this, interfaceC88472Yns, c76280Twi2, l3, enumC76319TxL, z, 0), new AfS11S0310000_13(this, c76280Twi2, interfaceC88472Yns, z, 2));
        C75597Tlh.LJ(true);
    }

    public final void LJJIIZ(long j, String str, java.util.Map map) {
        String str2;
        CL6.LIZIZ("match_prepare");
        this.LJII = false;
        this.LJIIIIZZ = false;
        B5G.LIZIZ().LJJIZ = 0L;
        C76271TwZ.LIZ.LJJLJ(false);
        C76272Twa.LJJIJIIJI(j, str, true);
        if (o.LJ(str, "open_result") || o.LJ(str, "cancel_battle_info")) {
            JSONObject jSONObject = new JSONObject();
            if (o.LJ(str, "cancel_battle_info")) {
                str2 = "cancel_valid_match";
            } else {
                str2 = "finish_match_by_timeout";
            }
            C05630Jz.LJI(jSONObject, "fixed_type", str2);
            C76272Twa.LJJJLIIL(C76272Twa.LIZ, "fix_match_interruption", jSONObject, false, null, 60);
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIJJLI = map;
        C76265TwT.LJIIIIZZ(EnumC76330TxW.MATCH_TYPE_1V1);
        c76280Twi.LJIILL(EnumC76178Tv4.START, true);
        c76280Twi.LJJIIZ = System.currentTimeMillis();
        c76280Twi.LJJ = j;
        C44878HjO.LIZJ("BattleCountDown, timeSecond = ", j, "TwoMatchViewAnchorPrese");
        if (j > 0) {
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
            boolean z = c76280Twi.LJ;
            JSONObject jSONObject2 = new JSONObject();
            C05630Jz.LJI(jSONObject2, "count", String.valueOf((int) j));
            C76272Twa c76272Twa = C76272Twa.LIZ;
            C76272Twa.LJIJJ(jSONObject2, false);
            C76272Twa.LJJJLIIL(c76272Twa, "open_message_timer_start", jSONObject2, z, null, 56);
            if (this.LJIIJJI == null) {
                this.LJIIJJI = new C76802UCg();
            }
            long LIZ = C76273Twb.LIZ();
            C76802UCg c76802UCg = this.LJIIJJI;
            if (c76802UCg != null) {
                c76802UCg.LIZ = new C76294Tww(this, LIZ);
                c76802UCg.LIZIZ(j, 1000L);
            }
        }
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LIZLLL;
            if (interfaceC76313TxF != null) {
                interfaceC76313TxF.LJIIZILJ();
            }
        } else {
            InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) this.LIZLLL;
            if (interfaceC76313TxF2 != null) {
                interfaceC76313TxF2.LJIILIIL();
            }
        }
        String str3 = null;
        this.LJIIJ.removeCallbacksAndMessages(null);
        if (j > 1) {
            this.LJIIJ.postDelayed(RunnableC29579BjD.LJLIL, 1000L);
        }
        C75755ToF c75755ToF = B5G.LIZIZ().LJJJI;
        if (c75755ToF != null) {
            str3 = c75755ToF.LIZ;
        }
        this.LJIILJJIL = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (X.B5G.LIZIZ().LJJIZ == r4.getId()) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r20, boolean r21, X.InterfaceC65784Pro<X.C76800UCe> r22) {
        /*
            r19 = this;
            r0 = r19
            P extends X.Ty3 r1 = r0.LIZLLL
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "punish, cutShort = "
            r2.append(r1)
            r15 = r21
            r2.append(r15)
            java.lang.String r2 = X.X1D.LIZIZ(r2)
            java.lang.String r1 = "TwoMatchViewAnchorPrese"
            X.C0NB.LJIIIZ(r1, r2)
            X.34K r1 = new X.34K
            r1.<init>()
            r2 = 104(0x68, float:1.46E-43)
            r9 = 0
            r5 = r20
            if (r5 != r2) goto L4e
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r2 = X.B5G.LIZIZ()
            boolean r2 = r2.LJJIJLIJ
            if (r2 != 0) goto L4b
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0.LJ
            r8 = 1
            if (r2 == 0) goto L4c
            com.bytedance.android.live.base.model.user.User r4 = r2.getOwner()
            if (r4 == 0) goto L4c
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r2 = X.B5G.LIZIZ()
            long r2 = r2.LJJIZ
            long r6 = r4.getId()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L4c
        L4b:
            r8 = 0
        L4c:
            r1.element = r8
        L4e:
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0.LJ
            if (r2 != 0) goto L62
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.LJI()
            if (r3 == 0) goto Ld6
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r2 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r3.kv0(r2)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
        L60:
            r0.LJ = r2
        L62:
            X.Twi r3 = X.C76265TwT.LIZ
            r3.LJJIII = r15
            long r13 = r3.LIZJ()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r4 = "source"
            java.lang.String r2 = java.lang.String.valueOf(r5)
            X.C05630Jz.LJI(r8, r4, r2)
            java.lang.String r4 = java.lang.String.valueOf(r15)
            java.lang.String r2 = "cut_short"
            X.C05630Jz.LJI(r8, r2, r4)
            X.Twa r6 = X.C76272Twa.LIZ
            X.C76272Twa.LJIJJ(r8, r9)
            java.lang.String r7 = "punish_finish_request"
            r10 = 0
            r11 = 60
            X.C76272Twa.LJJJLIIL(r6, r7, r8, r9, r10, r11)
            long r4 = java.lang.System.currentTimeMillis()
            X.C76272Twa.LJIIJ = r4
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0.LJ
            if (r4 == 0) goto Lce
            java.lang.Class<com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi> r2 = com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi.class
            java.lang.Object r10 = X.Q7L.LIZIZ(r2)
            com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi r10 = (com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi) r10
            long r11 = r4.getId()
            long r17 = r3.LIZIZ()
            r16 = r9
            X.Svk r3 = r10.punish(r11, r13, r15, r16, r17)
            X.Sy4 r2 = r0.LIZIZ()
            java.lang.Object r3 = r3.LIZJ(r2)
            X.Bng r3 = (X.InterfaceC29856Bng) r3
            Y.AfS11S0310000_13 r11 = new Y.AfS11S0310000_13
            r16 = 0
            r4 = r22
            r12 = r1
            r13 = r0
            r14 = r4
            r15 = r15
            r11.<init>(r12, r13, r14, r15, r16)
            Y.AfS19S0210000_13 r2 = new Y.AfS19S0210000_13
            r1 = 2
            r2.<init>(r0, r4, r15, r1)
            r3.LIZJ(r11, r2)
        Lce:
            if (r15 != 0) goto Ld5
            java.lang.String r1 = "punish_request"
            r0.LJJIIZI(r1, r9)
        Ld5:
            return
        Ld6:
            r2 = 0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76279Twh.LJJIJIIJIL(int, boolean, X.Pro):void");
    }

    public final void LJJJ(java.util.Map<Long, BattleUserArmies> map, long j, long j2, boolean z) {
        Long l;
        List<BattleUserArmy> list;
        long j3;
        User owner;
        User owner2;
        if (this.LJ == null) {
            return;
        }
        ((HashMap) C76265TwT.LIZ.LJJIJL).clear();
        Iterator<Map.Entry<Long, BattleUserArmies>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((HashMap) C76265TwT.LIZ.LJJIJL).put(it.next().getKey(), Long.valueOf(r1.getValue().hostScore));
        }
        Room room = this.LJ;
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
        LJJIZ(list);
        if (battleUserArmies != null) {
            C76385TyP c76385TyP = new C76385TyP(j, j2, battleUserArmies.hostScore, z);
            DataChannel LJI = LJI();
            if (LJI != null) {
                LJI.rv0(BattleLeftScoreChannel.class, c76385TyP);
                LJI.rv0(BattleMvpLeftListChannel.class, battleUserArmies.userArmies);
            }
            C76321TxN.LIZIZ(battleUserArmies, true);
        }
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            Object next = LIZLLL.next();
            C75883TqJ c75883TqJ = (C75883TqJ) next;
            Room room2 = this.LJ;
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
        BattleUserArmies battleUserArmies2 = map.get(Long.valueOf(j3));
        if (battleUserArmies2 != null) {
            DataChannel LJI2 = LJI();
            if (LJI2 != null) {
                LJI2.rv0(BattleRightScoreChannel.class, Integer.valueOf(battleUserArmies2.hostScore));
                LJI2.rv0(BattleMvpRightListChannel.class, battleUserArmies2.userArmies);
            }
            C76321TxN.LIZIZ(battleUserArmies2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(int r17, java.lang.String r18, java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r19, java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo> r20, int r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76279Twh.LJJ(int, java.lang.String, java.util.Map, java.util.Map, int):void");
    }

    public final void LJJIFFI(int i, boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j) {
        Object obj;
        long j2;
        int i2;
        User owner;
        if (i == 108) {
            this.LJII = false;
        }
        StringBuilder LJI = JBR.LJI("finish, cutShort = ", z, "  isFinishing = ");
        LJI.append(this.LJI);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LJI));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("finish, source = ");
        LIZ.append(i);
        LIZ.append("  otherLeft = ");
        FT5.LJ(LIZ, z2, LIZ, "TwoMatchViewAnchorPrese");
        if (this.LIZLLL == 0) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "finish, viewInterface == null");
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LIZIZ() <= 0) {
            return;
        }
        if (this.LJI) {
            LJJIJL(i, false);
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        this.LJI = true;
        long LIZJ = c76280Twi.LIZJ();
        long LIZIZ = c76280Twi.LIZIZ();
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (true) {
            if (LIZLLL.hasNext()) {
                obj = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                Room room = this.LJ;
                if (room == null || (owner = room.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            j2 = c75883TqJ2.LIZ;
        } else {
            j2 = 0;
        }
        if (i == 104) {
            if (!z2) {
                if (B5G.LIZIZ().LJJIJLIJ) {
                    i2 = 110;
                } else {
                    i2 = 103;
                }
            } else {
                i2 = 109;
            }
        } else {
            i2 = i;
        }
        String LJJIJ = C76271TwZ.LJJIJ(i2, j);
        boolean isAppBackground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground();
        int i3 = C75877TqD.LJIIJ;
        long j3 = C75877TqD.LJIIL;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject, "source", String.valueOf(i2));
        C05630Jz.LJI(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
        C05630Jz.LJI(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, false);
        if (C76272Twa.LJIIIIZZ > 0) {
            C05630Jz.LJ(jSONObject2, "match_duration", ((float) (System.currentTimeMillis() - C76272Twa.LJIIIIZZ)) / 100.0f);
            C76272Twa.LJIIIIZZ = 0L;
        }
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJI(jSONObject3, "cut_short", String.valueOf(z ? 1 : 0));
        C76272Twa.LJJJLIIL(c76272Twa, "battle_finish_request", jSONObject, false, jSONObject3, 44);
        C76272Twa.LJIIIZ = System.currentTimeMillis();
        ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).finish(LIZJ, LIZIZ, z, z2, j2, LJJIJ, isAppBackground ? 1 : 0, i3, j3, 1).LIZJ(LIZIZ())).LIZJ(new C76281Twj(this, z, z2, i2, interfaceC65784Pro, i), new C76291Twt(interfaceC65784Pro, this, i, z2, z));
    }

    public static /* synthetic */ void LJJII(C76279Twh c76279Twh, int i, boolean z, boolean z2, AqS163S0100000_13 aqS163S0100000_13, int i2) {
        long j;
        AqS163S0100000_13 aqS163S0100000_132 = aqS163S0100000_13;
        if ((i2 & 8) != 0) {
            aqS163S0100000_132 = null;
        }
        if ((i2 & 16) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        c76279Twh.LJJIFFI(i, z, z2, aqS163S0100000_132, j);
    }
}
