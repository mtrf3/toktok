package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFinishOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76284Twm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C76278Twg LJLIL;
    public final /* synthetic */ BattleTeamResult LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76284Twm(C76278Twg c76278Twg, BattleTeamResult battleTeamResult, int i, int i2, C68322mC<String> c68322mC) {
        super(0);
        this.LJLIL = c76278Twg;
        this.LJLILLLLZI = battleTeamResult;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = c68322mC;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        List<BattleTeamUser> list;
        long j;
        long j2;
        List<BattleTeamUser> list2;
        long j3;
        long j4;
        String str;
        InterfaceC76311TxD interfaceC76311TxD;
        boolean z2;
        C76278Twg c76278Twg = this.LJLIL;
        c76278Twg.LJIIL = false;
        BattleTeamResult battleTeamResult = this.LJLILLLLZI;
        if (battleTeamResult != null && battleTeamResult.result == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C76278Twg.LJJIJIIJI(c76278Twg, "finish_draw", 4);
        } else if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && this.LJLJI == 2) {
            C76278Twg.LJJIJIIJI(this.LJLIL, "finish_cut_short", 4);
            C76271TwZ.LIZ.LJJLIIIJJIZ("opposite_leave", true);
        } else {
            DataChannel LJI = this.LJLIL.LJI();
            if (LJI != null) {
                BattleTeamResult battleTeamResult2 = this.LJLILLLLZI;
                if (battleTeamResult2 != null && battleTeamResult2.result == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LJI.rv0(BattleIsCurrentWinChannel.class, Boolean.valueOf(z2));
            }
            if (this.LJLJJI == 14 && LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && (interfaceC76311TxD = (InterfaceC76311TxD) this.LJLIL.LIZLLL) != null) {
                interfaceC76311TxD.LJLL();
            }
            C76278Twg c76278Twg2 = this.LJLIL;
            String scene = this.LJLJJL.element;
            c76278Twg2.getClass();
            C76280Twi c76280Twi = C76265TwT.LIZ;
            if (c76280Twi.LJIILL(EnumC76178Tv4.PUNISH, false)) {
                C76271TwZ c76271TwZ = C76271TwZ.LIZ;
                o.LJIIIZ(scene, "scene");
                C76271TwZ.LJIIJJI = C30725C4b.LIZ();
                JSONObject jSONObject = new JSONObject();
                long j5 = c76280Twi.LJJIJIIJI;
                if (j5 <= 0) {
                    j5 = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                }
                C05630Jz.LJFF(jSONObject, "duration", j5);
                C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
                JSONObject jSONObject2 = new JSONObject();
                BattleTeamResult battleTeamResult3 = C76265TwT.LJ;
                if (battleTeamResult3 != null) {
                    int i = battleTeamResult3.result;
                    String str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
                    if (i == 0) {
                        str = "win";
                    } else if (i == 1) {
                        str = "lost";
                    } else if (i == 2) {
                        str = "draw";
                    } else {
                        str = LiveGiftNewGifterBadgeSetting.DEFAULT;
                    }
                    C05630Jz.LJI(jSONObject, "result", str);
                    C05630Jz.LJFF(jSONObject, "left_team_score", battleTeamResult3.totalScore);
                    int i2 = battleTeamResult3.result;
                    if (i2 == 0) {
                        str2 = "win";
                    } else if (i2 == 1) {
                        str2 = "lost";
                    } else if (i2 == 2) {
                        str2 = "draw";
                    }
                    C05630Jz.LJI(jSONObject2, "result", str2);
                    C05630Jz.LJFF(jSONObject2, "left_team_score", battleTeamResult3.totalScore);
                }
                BattleTeamResult battleTeamResult4 = C76265TwT.LJFF;
                if (battleTeamResult4 != null) {
                    C05630Jz.LJFF(jSONObject, "right_team_score", battleTeamResult4.totalScore);
                    C05630Jz.LJFF(jSONObject2, "right_team_score", battleTeamResult4.totalScore);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                BattleTeamResult battleTeamResult5 = C76265TwT.LJ;
                if (battleTeamResult5 != null && (list2 = battleTeamResult5.teamUsers) != null) {
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
                BattleTeamResult battleTeamResult6 = C76265TwT.LJFF;
                if (battleTeamResult6 != null && (list = battleTeamResult6.teamUsers) != null) {
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
                C76271TwZ.LJJ(jSONObject, false);
                C76271TwZ.LJJZZIII(c76271TwZ, "punish_start", jSONObject, jSONObject2, new JSONObject(), false, 16);
                C76280Twi c76280Twi2 = C76265TwT.LIZ;
                c76280Twi2.LJJIJ = System.currentTimeMillis();
                long j6 = c76280Twi2.LJJIJIIJI;
                if (j6 <= 0) {
                    j6 = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                }
                c76280Twi2.LJJI = j6;
                C44878HjO.LIZJ("startPunishCountDown, timeSecond = ", j6, "MultiMatchViewAnchorPre");
                if (j6 > 0) {
                    LiveInteractBattlePunishDurationSetting liveInteractBattlePunishDurationSetting = LiveInteractBattlePunishDurationSetting.INSTANCE;
                    if (j6 >= liveInteractBattlePunishDurationSetting.getValue()) {
                        j6 = liveInteractBattlePunishDurationSetting.getValue() - 1;
                    }
                    DataChannel LJI2 = c76278Twg2.LJI();
                    if (LJI2 != null) {
                        LJI2.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j6));
                    }
                    if (c76278Twg2.LJIILLIIL == null) {
                        c76278Twg2.LJIILLIIL = new C76802UCg();
                    }
                    C76802UCg c76802UCg = c76278Twg2.LJIILLIIL;
                    if (c76802UCg != null) {
                        c76802UCg.LIZ = new C76322TxO(c76278Twg2);
                        c76802UCg.LIZIZ(j6, 1000L);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
