package X;

import X.InterfaceC76358Txy;
import Y.ARunnableS41S0100000_5;
import Y.AfS65S0100000_13;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostCmdDismissLinkDialogEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchSeiBattleIdUpdateChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDismissInvitePanelWhenFinishSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.model.message.battle.ExemptStrategy;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Twn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76285Twn<P extends InterfaceC76358Txy> {
    public volatile LinkMicBattleArmiesMessage LIZ;
    public LinkMicBattleArmiesMessage LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public P LJII;
    public Room LJIIIIZZ;
    public C76802UCg LJIIIZ;
    public C76801UCf LJIIJ;
    public int LJIIJJI;
    public final Handler LJIIL = new Handler(C16880lQ.LLJJJJ());
    public final C76306Tx8 LJIILIIL = new C76306Tx8(this);

    public abstract void LIZLLL(BattleInfoResponse battleInfoResponse);

    public abstract void LJI(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIIL(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIILIIL(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIILJJIL(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage);

    public abstract void LJIILL(SeiAppData seiAppData);

    public abstract void LJIILLIIL(LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage);

    public static long LJII() {
        long LIZIZ;
        long max;
        BattleSetting battleSetting = C76265TwT.LIZ.LIZLLL;
        if (battleSetting == null) {
            max = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
                LIZIZ = C76273Twb.LIZ();
            } else {
                LIZIZ = C30725C4b.LIZIZ();
            }
            if (LIZIZ <= 0) {
                LIZIZ = System.currentTimeMillis();
            }
            max = battleSetting.duration - (Math.max(0L, LIZIZ - battleSetting.startTimeMs) / 1000);
        }
        C0NB.LJIIIZ("IMatchViewPresenter", "getBattleRemainSecond, remainSecond  = " + max);
        return max;
    }

    public final void LIZIZ() {
        long j;
        MultiMatchAudienceWidget multiMatchAudienceWidget;
        if (this.LJII == null) {
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        long j2 = 0;
        if (c76280Twi.LIZIZ() <= 0 || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LJIIJJI--;
        long LIZJ = c76280Twi.LIZJ();
        long LIZIZ = c76280Twi.LIZIZ();
        if (!(this instanceof C76286Two)) {
            C76272Twa.LJJIIZ("audience_result");
        } else {
            C76271TwZ.LIZ.LJJIJLIJ("audience_result");
        }
        LinkBattleApi linkBattleApi = (LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class);
        Room room = this.LJIIIIZZ;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Room room2 = this.LJIIIIZZ;
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        }
        AbstractC73672Svk<C28467BFf<BattleInfoResponse>> info = linkBattleApi.getInfo(j, LIZJ, LIZIZ, j2);
        C62705OjF c62705OjF = new C62705OjF();
        P p = this.LJII;
        if (p != null) {
            multiMatchAudienceWidget = p.LIZLLL();
        } else {
            multiMatchAudienceWidget = null;
        }
        ((InterfaceC29856Bng) info.LIZJ(C73933Szx.LIZ(C73931Szv.LIZIZ(multiMatchAudienceWidget, Lifecycle.Event.ON_DESTROY), c62705OjF))).LIZJ(new AfS65S0100000_13(this, 102), new AfS65S0100000_13(this, 103));
    }

    public void LJ() {
        IMessageManager iMessageManager;
        C76801UCf c76801UCf = this.LJIIJ;
        if (c76801UCf != null) {
            ((C76802UCg) c76801UCf.LJLIL).LIZ();
        }
        C76802UCg c76802UCg = this.LJIIIZ;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        DataChannel LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && (iMessageManager = (IMessageManager) LJIIIIZZ.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJIILIIL);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJIILIIL);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this.LJIILIIL);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE.getIntType(), this.LJIILIIL);
        }
        DataChannel LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            LJIIIIZZ2.jv0(this);
        }
    }

    public final DataChannel LJIIIIZZ() {
        MultiMatchAudienceWidget LIZLLL;
        P p = this.LJII;
        if (p != null && (LIZLLL = p.LIZLLL()) != null) {
            return LIZLLL.provideDataChannel();
        }
        return null;
    }

    public final C76244Tw8 LJIIIZ() {
        MultiMatchAudienceWidget LIZLLL;
        P p = this.LJII;
        if (p != null && (LIZLLL = p.LIZLLL()) != null) {
            return (C76244Tw8) LIZLLL.LJZI(C76244Tw8.class);
        }
        return null;
    }

    public static void LJIJ(List list) {
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
            if (i3 < i2 && list != null && (battleUserArmy = (BattleUserArmy) ListProtector.get(list, i3)) != null && battleUserArmy.userId == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                C76265TwT.LIZ.getClass();
            }
            i3++;
        } while (i3 < i);
    }

    public final void LIZ(P p) {
        Room room;
        IMessageManager iMessageManager;
        this.LJII = p;
        DataChannel LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            room = (Room) LJIIIIZZ.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJIIIIZZ = room;
        DataChannel LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null && (iMessageManager = (IMessageManager) LJIIIIZZ2.kv0(C29927Bop.class)) != null) {
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJIILIIL);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJIILIIL);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this.LJIILIIL);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE.getIntType(), this.LJIILIIL);
        }
        DataChannel LJIIIIZZ3 = LJIIIIZZ();
        if (LJIIIIZZ3 != null) {
            LJIIIIZZ3.mv0(MatchSeiBattleIdUpdateChannel.class, this, new AqS179S0100000_13(this, (AbstractC76285Twn<InterfaceC76358Txy>) 372));
        }
    }

    public final void LJIIJJI(String scene) {
        List<BattleTeamUser> list;
        long j;
        long j2;
        List<BattleTeamUser> list2;
        long j3;
        long j4;
        String str;
        o.LJIIIZ(scene, "scene");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIILL(EnumC76178Tv4.PUNISH, false)) {
            return;
        }
        c76280Twi.LJJIJ = System.currentTimeMillis();
        long j5 = c76280Twi.LJJIJIIJI;
        if (j5 <= 0) {
            j5 = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
        }
        c76280Twi.LJJI = j5;
        if (this instanceof C76286Two) {
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            JSONObject jSONObject = new JSONObject();
            BattleTeamResult battleTeamResult = C76265TwT.LJ;
            if (battleTeamResult != null) {
                int i = battleTeamResult.result;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
                        } else {
                            str = "draw";
                        }
                    } else {
                        str = "lost";
                    }
                } else {
                    str = "win";
                }
                C05630Jz.LJI(jSONObject, "result", str);
                C05630Jz.LJFF(jSONObject, "left_team_score", battleTeamResult.totalScore);
            }
            BattleTeamResult battleTeamResult2 = C76265TwT.LJFF;
            if (battleTeamResult2 != null) {
                C05630Jz.LJFF(jSONObject, "right_team_score", battleTeamResult2.totalScore);
            }
            C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BattleTeamResult battleTeamResult3 = C76265TwT.LJ;
            if (battleTeamResult3 != null && (list2 = battleTeamResult3.teamUsers) != null) {
                for (BattleTeamUser battleTeamUser : list2) {
                    Long l = battleTeamUser.userId;
                    if (l != null) {
                        j3 = l.longValue();
                    } else {
                        j3 = 0;
                    }
                    Long valueOf = Long.valueOf(j3);
                    Long l2 = battleTeamUser.score;
                    if (l2 != null) {
                        j4 = l2.longValue();
                    } else {
                        j4 = 0;
                    }
                    linkedHashMap.put(valueOf, Long.valueOf(j4));
                }
            }
            BattleTeamResult battleTeamResult4 = C76265TwT.LJFF;
            if (battleTeamResult4 != null && (list = battleTeamResult4.teamUsers) != null) {
                for (BattleTeamUser battleTeamUser2 : list) {
                    Long l3 = battleTeamUser2.userId;
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    Long valueOf2 = Long.valueOf(j);
                    Long l4 = battleTeamUser2.score;
                    if (l4 != null) {
                        j2 = l4.longValue();
                    } else {
                        j2 = 0;
                    }
                    linkedHashMap.put(valueOf2, Long.valueOf(j2));
                }
            }
            try {
                C05630Jz.LJI(jSONObject, "anchor_scores", new Gson().LJIILL(linkedHashMap));
            } catch (Exception e) {
                C0NB.LJFF("Match Monitor error", "logPunishStart", e);
            }
            long j6 = C76265TwT.LIZ.LJJIJIIJI;
            if (j6 <= 0) {
                j6 = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
            }
            C05630Jz.LJFF(jSONObject, "remainTime", j6);
            C76271TwZ.LJJ(jSONObject, false);
            C76271TwZ.LJLJJLL(c76271TwZ, "punish_start", jSONObject, null, null, false, 28);
        } else {
            C76272Twa.LJJJJIZL(j5, scene, false);
        }
        C44878HjO.LIZJ("startPunishCountDown, timeSecond = ", j5, "IMatchViewPresenter");
        if (j5 <= 0) {
            return;
        }
        LiveInteractBattlePunishDurationSetting liveInteractBattlePunishDurationSetting = LiveInteractBattlePunishDurationSetting.INSTANCE;
        if (j5 >= liveInteractBattlePunishDurationSetting.getValue()) {
            j5 = liveInteractBattlePunishDurationSetting.getValue() - 1;
        }
        DataChannel LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j5));
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C76802UCg();
        }
        C76802UCg c76802UCg = this.LJIIIZ;
        if (c76802UCg == null) {
            return;
        }
        c76802UCg.LIZ = new C76315TxH(this);
        c76802UCg.LIZIZ(j5, 1000L);
    }

    public final void LJIIZILJ(long j) {
        C44878HjO.LIZJ("BattleCountDown, timeSecond = ", j, "IMatchViewPresenter");
        if (j <= 0) {
            return;
        }
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new C76801UCf(0);
            }
            this.LIZ = null;
            C76801UCf c76801UCf = this.LJIIJ;
            if (c76801UCf != null) {
                c76801UCf.LIZJ(j, new C76333TxZ(this));
            }
        }
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j) {
            DataChannel LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.rv0(BattleTimeLeftChannel.class, Long.valueOf(j - 1));
            }
        } else {
            DataChannel LJIIIIZZ2 = LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
            }
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C76802UCg();
        }
        C76802UCg c76802UCg = this.LJIIIZ;
        if (c76802UCg != null) {
            c76802UCg.LIZ = new C76295Twx(this);
            c76802UCg.LIZIZ(j, 1000L);
        }
    }

    public static boolean LIZJ(AbstractC76285Twn abstractC76285Twn, long j) {
        abstractC76285Twn.getClass();
        if (j == C76265TwT.LIZ.LIZIZ()) {
            return true;
        }
        return false;
    }

    public final void LJFF(int i, List<BattleTeamUserArmies> armies) {
        long j;
        o.LJIIIZ(armies, "armies");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        EnumC76178Tv4 LJ = c76280Twi.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.START;
        if (LJ.compareTo(enumC76178Tv4) >= 0 || this.LIZLLL || this.LJI || this.LJ) {
            return;
        }
        this.LJ = true;
        C76265TwT.LJIIIIZZ(EnumC76330TxW.MATCH_TYPE_2V2);
        c76280Twi.LJJIIZ = System.currentTimeMillis();
        long LJII = LJII();
        c76280Twi.LJJ = LJII;
        c76280Twi.LJIILL(enumC76178Tv4, true);
        P p = this.LJII;
        if (p != null) {
            p.LJIILLIIL();
        }
        if (this instanceof C76286Two) {
            C76271TwZ.LIZ.LJJLIIIJJI(LJII, c76280Twi.LIZIZ(), LJIIIZ(), i, armies, true);
        }
        BattleSetting battleSetting = c76280Twi.LIZLLL;
        if (battleSetting != null) {
            j = battleSetting.startTimeMs;
        } else {
            j = 0;
        }
        C76271TwZ.LJJIJIL = C30725C4b.LIZ();
        C76271TwZ.LJJIJL = j;
        LJIIZILJ(LJII);
        this.LJIIL.removeCallbacksAndMessages(null);
        if (LJII <= 1) {
            return;
        }
        this.LJIIL.postDelayed(new ARunnableS41S0100000_5((C76286Two) this, 198), 1000L);
    }

    public void LJIIJ(String str, boolean z) {
        DataChannel LJIIIIZZ;
        List<TeamUsersInfo> list;
        List<TeamUsersInfo> list2;
        Long l;
        List<TeamUsersInfo> list3;
        Long l2;
        if (this.LIZLLL) {
            return;
        }
        String str2 = "cut_short";
        if (!s.LJJJLZIJ(str, "cut_short", false) && !s.LJJJLZIJ(str, "list_change", false)) {
            str2 = "normal";
        }
        boolean z2 = this instanceof C76286Two;
        C76271TwZ.LJJLL(str2, z2);
        this.LIZLLL = true;
        if (!o.LJ(str, "battle_info")) {
            C75832TpU c75832TpU = C75832TpU.LIZ;
            C76244Tw8 LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                list = LJIIIZ.LJIILL;
            } else {
                list = null;
            }
            c75832TpU.LJIL(list, z2, false);
            if (z2) {
                C76244Tw8 LJIIIZ2 = LJIIIZ();
                if (LJIIIZ2 != null) {
                    list3 = LJIIIZ2.LJIILL;
                } else {
                    list3 = null;
                }
                C76244Tw8 LJIIIZ3 = LJIIIZ();
                if (LJIIIZ3 != null) {
                    l2 = LJIIIZ3.LJIILJJIL;
                } else {
                    l2 = null;
                }
                c75832TpU.LJIJI(true, list3, l2, this.LJIIIIZZ);
            } else {
                C76244Tw8 LJIIIZ4 = LJIIIZ();
                if (LJIIIZ4 != null) {
                    list2 = LJIIIZ4.LJIILL;
                } else {
                    list2 = null;
                }
                C76244Tw8 LJIIIZ5 = LJIIIZ();
                if (LJIIIZ5 != null) {
                    l = LJIIIZ5.LJIILJJIL;
                } else {
                    l = null;
                }
                c75832TpU.LJIJI(false, list2, l, this.LJIIIIZZ);
            }
            C75622Tm6.LJIIIIZZ = C76265TwT.LIZ.LIZIZ();
            if (o.LJ("list_change", str)) {
                C75622Tm6.LJIIIZ = 1;
            } else if (str.length() != 0) {
                C75622Tm6.LJIIIZ = -1;
            }
        }
        P p = this.LJII;
        if (p != null) {
            p.LJLJJI();
        }
        P p2 = this.LJII;
        if (p2 != null) {
            p2.LJLJL();
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIILL(EnumC76178Tv4.END, false)) {
            return;
        }
        CL6.LIZJ();
        c76280Twi.LJJIJ = 0L;
        if (!LiveBattleDismissInvitePanelWhenFinishSetting.INSTANCE.getValue()) {
            if (z && (LJIIIIZZ = LJIIIIZZ()) != null) {
                LJIIIIZZ.pv0(CoHostCmdDismissLinkDialogEvent.class);
            }
        } else {
            DataChannel LJIIIIZZ2 = LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.pv0(CoHostCmdDismissLinkDialogEvent.class);
            }
        }
        C76801UCf c76801UCf = this.LJIIJ;
        if (c76801UCf != null) {
            ((C76802UCg) c76801UCf.LJLIL).LIZ();
        }
        C76802UCg c76802UCg = this.LJIIIZ;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        this.LJIIL.removeCallbacksAndMessages(null);
        this.LJIIL.post(RunnableC76342Txi.LJLIL);
        c76280Twi.LJFF = null;
        c76280Twi.LJIIIZ = false;
        c76280Twi.LJIIJ = null;
        c76280Twi.LJIIJJI = false;
        c76280Twi.LJIIIIZZ = 0L;
    }
}
