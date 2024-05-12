package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.TwZ */
/* loaded from: classes14.dex */
public final class C76271TwZ extends C75192TfA {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static C76244Tw8 LJJIFFI;
    public static InterfaceC92693kP LJJII;
    public static long LJJIJIIJI;
    public static long LJJIJIIJIL;
    public static long LJJIJIL;
    public static long LJJIJL;
    public static long LJJIJLIJ;
    public static long LJJIL;
    public static long LJJIZ;
    public static long LJJJ;
    public static final C76271TwZ LIZ = new C76271TwZ();
    public static final java.util.Map<String, List<C76338Txe>> LJJIII = new LinkedHashMap();
    public static final List<String> LJJIIJ = new ArrayList();
    public static final C278417k<Long, Integer> LJJIIJZLJL = new C278417k<>(2);
    public static final java.util.Set<String> LJJIIZ = C77275UUl.LJIIIIZZ("cut_short_msg", "punish_finish_msg", "cut_short_request", "finish_draw");
    public static final java.util.Set<String> LJJIIZI = C77275UUl.LJIIIIZZ("punish_request", "punish_finish_msg", "punish_cut_short_request");
    public static final java.util.Set<String> LJJIJ = C77275UUl.LJIIIIZZ("cut_short_msg", "cut_short_request", "punish_cut_short_request");

    public static void LJJIIJZLJL() {
        Keva.getRepo("live_match").clear();
        C0NB.LIZIZ("pk_interrupt", "clearBattleInfo");
    }

    public static long LJJIIZ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            return owner.getId();
        }
        return 0L;
    }

    public final void LJJLI() {
        if (LJJIZ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", LJJIZ);
        C05630Jz.LJFF(jSONObject, "server_battle_id", C76265TwT.LIZ.LIZIZ());
        C05630Jz.LJFF(jSONObject, "channel_id", B5G.LIZIZ().LJFF);
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "duration", C30725C4b.LIZ() - LJJIJLIJ);
        LJLJJLL(this, "sei_identify_failed", jSONObject, null, jSONObject2, false, 20);
    }

    public final void LJLIIL() {
        LJIJJLI = System.currentTimeMillis();
        if (LJIJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", LJIJJLI - LJIJJ);
        C05630Jz.LJFF(jSONObject, "total_cost", LJIJJLI - LJIJ);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, "resume_after_crash");
        LJIJJLI = 0L;
        LJJZ(this, "resume_cohost_start", jSONObject, null, 12);
    }

    public final void LJLIL() {
        if (!C8E.LIZLLL().LJJIIJ()) {
            return;
        }
        LJIL = System.currentTimeMillis();
        if (LJIJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", LJIL - LJIJJLI);
        C05630Jz.LJFF(jSONObject, "total_cost", LJIL - LJIJ);
        LJIL = 0L;
        LJJZ(this, "resume_cohost_success", jSONObject, null, 12);
    }

    public final void LJLILLLLZI() {
        LJIJJ = System.currentTimeMillis();
        if (LJIJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", LJIJJ - LJIJI);
        C05630Jz.LJFF(jSONObject, "total_cost", LJIJJ - LJIJ);
        LJIJJ = 0L;
        LJJZ(this, "resume_live_success", jSONObject, null, 12);
    }

    public final void LJLJI() {
        LJJ = System.currentTimeMillis();
        if (LJIJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJIJJLI);
        C05630Jz.LJFF(jSONObject, "total_cost", System.currentTimeMillis() - LJIJ);
        LJJ = 0L;
        LJJZ(this, "resume_match_success", jSONObject, null, 12);
    }

    public static final void LJIILLIIL(JSONObject jSONObject) {
        long j;
        C05630Jz.LJFF(jSONObject, "time_before_calibrated", System.currentTimeMillis());
        C05630Jz.LJFF(jSONObject, "time_after_calibrated", C76273Twb.LIZ());
        C05630Jz.LJFF(jSONObject, "calibrated_diff", C76273Twb.LIZ() - System.currentTimeMillis());
        C05630Jz.LJFF(jSONObject, "t3_current_diff_time", C76273Twb.LJ - C76273Twb.LJFF);
        C05630Jz.LJI(jSONObject, "calibrated_log_id", C76273Twb.LIZJ);
        C05630Jz.LJI(jSONObject, "calibrated_path", C76273Twb.LIZLLL);
        C05630Jz.LJFF(jSONObject, "calibrated_t3_time", C76273Twb.LJ);
        BattleSetting battleSetting = C76265TwT.LIZ.LIZLLL;
        if (battleSetting != null) {
            j = battleSetting.startTimeMs;
        } else {
            j = 0;
        }
        C05630Jz.LJFF(jSONObject, "server_start_time", j);
    }

    public static void LJIIZILJ(JSONObject jSONObject) {
        long j;
        String str;
        String str2;
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        long j2 = 0;
        if (LIZIZ2 != null) {
            j = ((C29374Bfu) LIZIZ2).getCurrentUserId();
        } else {
            j = 0;
        }
        String LLD = ORZ.LLD(C8E.LIZLLL().LJIILJJIL(), ",", null, null, C76277Twf.LJLIL, 30);
        boolean isAppBackground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground();
        C05630Jz.LJI(jSONObject, "uid_list", LLD);
        C05630Jz.LJFF(jSONObject, "channel_id", B5G.LIZIZ().LJFF);
        C05630Jz.LJFF(jSONObject, "current_user_id", j);
        C05630Jz.LJFF(jSONObject, "current_anchor_id", LJJIIZ());
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j2 = room.getId();
        }
        C05630Jz.LJFF(jSONObject, "room_id", j2);
        C05630Jz.LIZ(C8E.LIZLLL().LJIILJJIL().size(), "linked_count", jSONObject);
        C05630Jz.LJII(jSONObject, "is_background", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground());
        if (isAppBackground) {
            C05630Jz.LJFF(jSONObject, "background_duration", SystemClock.elapsedRealtime() - LJIIZILJ);
        }
        C05630Jz.LIZ(C8E.LIZLLL().LLIFFJFJJ() ? 1 : 0, "is_sdk", jSONObject);
        C05630Jz.LIZ(C75877TqD.LJIIJ, "network_quality", jSONObject);
        C05630Jz.LJFF(jSONObject, "cur_bitrate", C75877TqD.LJIIL);
        String str3 = "";
        C05630Jz.LJI(jSONObject, "bitrates", o.LJJJJZ(ORZ.LLD(C48359IyR.LIZ, null, null, null, null, 63), " ", "", false));
        C75883TqJ LJI2 = C8E.LIZLLL().LJI(j);
        if (LJI2 != null && (str2 = LJI2.LJII) != null) {
            str3 = str2;
        }
        C05630Jz.LJI(jSONObject, "link_mic_id", str3);
        C05630Jz.LIZ(C8E.LIZLLL().eU("MatchMonitorHelper") ? 1 : 0, "is_cross_arc_active", jSONObject);
        MultiHostService.LJLL.getClass();
        C75873Tq9 c75873Tq9 = MultiHostCrossAdapterImpl.LLFFF;
        c75873Tq9.getClass();
        C05630Jz.LIZ(MultiHostCrossAdapterImpl.LLFII ? 1 : 0, "is_cross_arc_enable", jSONObject);
        c75873Tq9.getClass();
        C05630Jz.LIZ(MultiHostCrossAdapterImpl.LLFZ ? 1 : 0, "is_cross_arc_sdk_enable", jSONObject);
        C05630Jz.LIZ(MultiHostService.LJLLI ? 1 : 0, "is_biz_new_arch_enable", jSONObject);
        c75873Tq9.getClass();
        if (MultiHostCrossAdapterImpl.LLFII) {
            c75873Tq9.getClass();
            if (MultiHostCrossAdapterImpl.LLFZ) {
                InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
                if (LJJIJL2 != null) {
                    str = LJJIJL2.LLLLLLIL();
                } else {
                    str = null;
                }
                C05630Jz.LJI(jSONObject, "inner_channel_id", str);
                if (C8E.LIZLLL().eU("MatchMonitorHelper")) {
                    C05630Jz.LJFF(jSONObject, "group_channel_id", C8E.LIZLLL().LJJLI());
                }
            }
        }
    }

    public static void LJIJ(JSONObject jSONObject) {
        C76244Tw8 c76244Tw8 = LJJIFFI;
        if (c76244Tw8 != null) {
            if (c76244Tw8.LIZLLL.getValue() != null) {
                Long value = c76244Tw8.LIZLLL.getValue();
                if (value == null) {
                    value = 0L;
                }
                kotlin.jvm.internal.o.LJIIIIZZ(value, "battleIdInviting.value ?: 0L");
                C05630Jz.LJFF(jSONObject, "battle_id", value.longValue());
            }
            C75883TqJ c75883TqJ = c76244Tw8.LJII;
            if (c75883TqJ != null) {
                C05630Jz.LJFF(jSONObject, "teammate_id", c75883TqJ.LIZ);
            }
            C05630Jz.LJFF(jSONObject, "team_id", C76265TwT.LIZ.LJJJJJ);
        }
        LJIIZILJ(jSONObject);
    }

    public static void LJIJI(JSONObject jSONObject) {
        List<Long> list;
        C76244Tw8 c76244Tw8 = LJJIFFI;
        if (c76244Tw8 != null) {
            C05630Jz.LJFF(jSONObject, "battle_id", C76244Tw8.LIZ());
            List<TeamUsersInfo> list2 = c76244Tw8.LJIILL;
            if (list2 != null) {
                for (TeamUsersInfo teamUsersInfo : list2) {
                    if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ && (list = teamUsersInfo.userIds) != null) {
                        for (Long it : list) {
                            long LJJIIZ2 = LJJIIZ();
                            if (it == null || it.longValue() != LJJIIZ2) {
                                kotlin.jvm.internal.o.LJIIIIZZ(it, "it");
                                C05630Jz.LJFF(jSONObject, "teammate_id", it.longValue());
                            }
                        }
                    }
                }
            }
            C05630Jz.LJFF(jSONObject, "team_id", C76265TwT.LIZ.LJJJJJ);
        }
        LJIIZILJ(jSONObject);
    }

    public static void LJJI(JSONObject jSONObject) {
        List<C75883TqJ> list;
        C76244Tw8 c76244Tw8 = LJJIFFI;
        if (c76244Tw8 != null && (list = c76244Tw8.LIZJ) != null) {
            if (list.size() >= 2) {
                C05630Jz.LJFF(jSONObject, "other_uid1", ((C75883TqJ) ListProtector.get(list, 1)).LIZ);
            }
            if (list.size() == 4) {
                C05630Jz.LJFF(jSONObject, "other_uid2", ((C75883TqJ) ListProtector.get(list, 2)).LIZ);
                C05630Jz.LJFF(jSONObject, "other_uid3", ((C75883TqJ) ListProtector.get(list, 3)).LIZ);
            }
        }
    }

    public static EnumC76248TwC LJLJL(EnumC76319TxL requestFrom) {
        kotlin.jvm.internal.o.LJIIIZ(requestFrom, "requestFrom");
        int i = C76318TxK.LIZIZ[requestFrom.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return EnumC76248TwC.CLICKREMATCH;
                }
                throw new C162476Zf();
            }
            return EnumC76248TwC.CLICKGUIDE;
        }
        return EnumC76248TwC.CLICKICON;
    }

    public final void LJJIJIIJI(int i) {
        String str;
        long LIZ2;
        long j;
        JSONObject jSONObject = new JSONObject();
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 10) {
                            str = "other";
                        } else {
                            str = "open_message";
                        }
                    } else {
                        str = "cohost_start_battleinfo";
                    }
                } else {
                    str = "room_enter_expired";
                }
            } else {
                str = "room_enter_battleinfo";
            }
        } else {
            str = "room_enter";
        }
        C05630Jz.LJI(jSONObject2, WM7.SCENE_SERVICE, str);
        JSONObject jSONObject3 = new JSONObject();
        if (i == 0) {
            LIZ2 = C30725C4b.LIZ();
            j = LJJIJIIJI;
        } else {
            LIZ2 = C30725C4b.LIZ();
            j = LJJIL;
        }
        C05630Jz.LJFF(jSONObject3, "identify_duration", LIZ2 - j);
        LJLJJLL(this, "battle_expired", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public final void LJJIJIIJIL(EnumC76186TvC type) {
        kotlin.jvm.internal.o.LJIIIZ(type, "type");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "click_reason", type.getType());
        C05630Jz.LJI(jSONObject2, "role_type", "inviter");
        LJJZZIII(this, "battle_icon_click", jSONObject, jSONObject2, null, false, 8);
    }

    public final void LJJIJIL(Throwable throwable) {
        kotlin.jvm.internal.o.LJIIIZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LJJII(jSONObject, jSONObject2, throwable);
        LJLJJLL(this, "battle_info_failed", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public final void LJJIJLIJ(String str) {
        LJJJ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        LJJ(jSONObject, false);
        LJLJJLL(this, "battle_info_request", jSONObject, FT5.LIZLLL(WM7.SCENE_SERVICE, str), null, false, 24);
    }

    public final void LJJJJIZL(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            C05630Jz.LJI(jSONObject, "role_type", "anchor");
            C05630Jz.LJI(jSONObject2, "role_type", "anchor");
            LJJZZIII(this, "battle_load_widget", jSONObject, jSONObject2, null, false, 8);
            return;
        }
        LJLJJLL(this, "battle_load_widget", jSONObject, null, null, false, 12);
    }

    public final void LJJJJJL(C28467BFf<Void> response) {
        kotlin.jvm.internal.o.LJIIIZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "cost", C30725C4b.LIZ() - LJIILL);
        LJJZZIII(this, "punish_finish_succeed", jSONObject, null, jSONObject2, false, 20);
    }

    public final void LJJJJLI(int i) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "quit_panel_click", jSONObject);
        LJJ(jSONObject, false);
        LJJZZIII(this, "quit_pannel_click", jSONObject, new JSONObject(), new JSONObject(), false, 16);
    }

    public final void LJJJLL(boolean z) {
        C76280Twi c76280Twi;
        LJ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        C05630Jz.LJFF(jSONObject, "battle_id", c76280Twi.LIZIZ());
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        C05630Jz.LJI(jSONObject2, WM7.SCENE_SERVICE, "normal");
        C05630Jz.LJI(jSONObject2, "reason", "click");
        LJL("receive_panel_show", jSONObject, jSONObject2, new JSONObject(), false);
    }

    public final void LJJLJ(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        if (C76265TwT.LIZ.LJIILIIL) {
            LJJZ(this, "battle_inviter_start", jSONObject, null, 12);
        }
    }

    public final void LJJLJLI(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        C05630Jz.LJI(jSONObject, "finish_reason", "cut_short_message");
        C05630Jz.LIZ(1, "is_normal_finish", jSONObject);
        LJJZ(this, "battle_finished_timing", jSONObject, null, 12);
    }

    public final void LJLIIIL(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        C05630Jz.LJI(jSONObject, "finish_reason", "normal_finish_message");
        C05630Jz.LIZ(1, "is_normal_finish", jSONObject);
        LJJZ(this, "battle_finished_timing", jSONObject, null, 12);
    }

    public final void LJLJJI(String str) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "path", str);
        C05630Jz.LJI(jSONObject, "log_id", "");
        LJJZ(this, "resume_server_api_error", jSONObject, null, 12);
    }

    public final void LJLJJL(String str) {
        if (System.currentTimeMillis() - LJJI <= 0) {
            return;
        }
        JSONObject LIZLLL2 = FT5.LIZLLL("stream_failure_anchor_id", str);
        C05630Jz.LJFF(LIZLLL2, "cost", System.currentTimeMillis() - LJJI);
        LJJZ(this, "stream_repull_success", LIZLLL2, null, 12);
    }

    public static void LJIJJ(LinkMicBattleMessage linkMicBattleMessage, JSONObject jSONObject) {
        C05630Jz.LJFF(jSONObject, "battle_id", linkMicBattleMessage.battleId);
        C05630Jz.LJFF(jSONObject, "message_id", linkMicBattleMessage.baseMessage.messageId);
        C05630Jz.LIZ(linkMicBattleMessage.action, "message", jSONObject);
        C05630Jz.LJFF(jSONObject, "action_by_userId", linkMicBattleMessage.actionByUserId);
        C05630Jz.LJFF(jSONObject, "message_fetch_time", linkMicBattleMessage.timestamp);
        C05630Jz.LJFF(jSONObject, "message_create_time", linkMicBattleMessage.baseMessage.createTime);
    }

    public static void LJIJJLI(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage, JSONObject jSONObject) {
        C05630Jz.LJFF(jSONObject, "battle_id", linkMicBattlePunishFinishMessage.battleId);
        C05630Jz.LJFF(jSONObject, "message_id", linkMicBattlePunishFinishMessage.baseMessage.messageId);
        C05630Jz.LJFF(jSONObject, "message_fetch_time", linkMicBattlePunishFinishMessage.timestamp);
        C05630Jz.LJFF(jSONObject, "message_create_time", linkMicBattlePunishFinishMessage.baseMessage.createTime);
        C05630Jz.LJFF(jSONObject, "action_by_userId", linkMicBattlePunishFinishMessage.opUid);
    }

    public static final void LJIL(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.LJIIIIZZ(keys, "metric.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    C05630Jz.LIZ(((Number) obj).intValue(), next, jSONObject2);
                } else if (obj instanceof Long) {
                    C05630Jz.LJFF(jSONObject2, next, ((Number) obj).longValue());
                } else if (obj instanceof String) {
                    C05630Jz.LJI(jSONObject2, next, (String) obj);
                } else if (obj instanceof Boolean) {
                    C05630Jz.LJII(jSONObject2, next, ((Boolean) obj).booleanValue());
                } else {
                    jSONObject2.putOpt(next, obj);
                }
            } catch (Exception unused) {
                C0NB.LIZLLL("msg error: metric shouldn't set this type value, else adapt in this");
            }
        }
    }

    public static final void LJJ(JSONObject jSONObject, boolean z) {
        C76280Twi c76280Twi;
        String str;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (c76280Twi.LJIILL != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "is_gift_only", str);
        C05630Jz.LJFF(jSONObject, "only_gift_id", c76280Twi.LJIILL);
    }

    public static String LJJIJ(int i, long j) {
        if (i != 101) {
            if (i != 103) {
                if (i != 211) {
                    if (i != 212) {
                        switch (i) {
                            case 106:
                                return "normal_finish";
                            case 107:
                                return "finish_by_openmessage_timeout";
                            case 108:
                                return "finish_by_cancel";
                            case 109:
                                return "user_list_change";
                            case 110:
                                return "end_live";
                            default:
                                return String.valueOf(i);
                        }
                    }
                    return "user_offline";
                }
            } else {
                if (j == 1) {
                    return "disconnect_cohost";
                }
                if (j == 2) {
                    return "kickout_by_other";
                }
                if (j == 6) {
                    return "first_frame_timeout";
                }
                if (j == 7) {
                    return "linked_list_without_me";
                }
                if (j == 4) {
                    return "rtc_error";
                }
                return "other_finish_reason";
            }
        }
        return "disconnect_pk";
    }

    public static void LJJLL(String str, boolean z) {
        long j;
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        C76280Twi c76280Twi = C76265TwT.LIZ;
        LIZ2.append(c76280Twi.LIZIZ());
        LIZ2.append(',');
        LIZ2.append(currentUserId);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        BattleSetting battleSetting = c76280Twi.LIZLLL;
        if (battleSetting != null) {
            j = battleSetting.startTimeMs;
        } else {
            j = 0;
        }
        for (String str2 : ((LinkedHashMap) LJJIII).keySet()) {
            List<C76338Txe> list = (List) ((LinkedHashMap) LJJIII).get(str2);
            if (list != null) {
                for (C76338Txe c76338Txe : list) {
                    if (c76338Txe.LJLJI > 0) {
                        C05630Jz.LJFF(jSONObject2, "user_id", currentUserId);
                        C05630Jz.LJI(jSONObject2, "distinct_key", LIZIZ2);
                        if (c76338Txe.LJLILLLLZI != 0) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        C05630Jz.LIZ(i, "source", jSONObject2);
                        long j2 = 1000;
                        C05630Jz.LJFF(jSONObject2, "send_success_pk_time_sec", (c76338Txe.LJLJJI - j) / j2);
                        C05630Jz.LJFF(jSONObject, "send_success_pk_time_sec", (c76338Txe.LJLJJI - j) / j2);
                        C05630Jz.LIZ(0, "show", jSONObject2);
                        C05630Jz.LJFF(jSONObject2, "send_to_now_dur", C76273Twb.LIZ() - c76338Txe.LJLJJI);
                        C05630Jz.LIZ(LiveMatchArmiesLooperSettings.INSTANCE.getValue() ? 1 : 0, "client_downsampling", jSONObject2);
                        if (c76338Txe.LJLILLLLZI != 0) {
                            C05630Jz.LJI(jSONObject2, "log_id", str2);
                        }
                        C05630Jz.LJI(jSONObject2, "unshow_reason", str);
                        if (z) {
                            LJLJJLL(LIZ, "battle_score_update", jSONObject2, jSONObject2, jSONObject, false, 16);
                        } else {
                            C76272Twa.LIZ.LJJJLZIJ("battle_score_update", jSONObject2, jSONObject2, jSONObject);
                        }
                    }
                }
            }
        }
        ((LinkedHashMap) LJJIII).clear();
        ((ArrayList) LJJIIJ).clear();
        ((ArrayList) C76272Twa.LIZJ).clear();
    }

    public final void LJJIII(JSONObject jSONObject, boolean z) {
        String str;
        boolean audienceStartTimeOptEnabled = MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled();
        int i = 1;
        if (z) {
            audienceStartTimeOptEnabled = true;
        }
        if (!C76273Twb.LIZIZ || !audienceStartTimeOptEnabled) {
            i = 0;
        }
        C05630Jz.LIZ(i, "time_calibrated", jSONObject);
        C05630Jz.LJFF(jSONObject, "min_half_rtt", C76273Twb.LIZ);
        if (i == 0) {
            if (audienceStartTimeOptEnabled) {
                str = "rtt_too_large";
            } else {
                str = "control_group";
            }
            C05630Jz.LJI(jSONObject, "uncalibrated_reason", str);
        }
    }

    public final void LJJIJL(String str, C28467BFf<BattleInfoResponse> response) {
        int i;
        Long l;
        BattleTeamResult battleTeamResult;
        int i2;
        kotlin.jvm.internal.o.LJIIIZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        LJJ(jSONObject, false);
        BattleSetting battleSetting = response.data.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "battle_status", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - LJJJ);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BattleTeamResult battleTeamResult2 = null;
        long j = 0;
        if (Room.isValid(room)) {
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
        } else {
            l = 0L;
        }
        java.util.Map<Long, BattleTeamUserArmies> map = response.data.teamArmies;
        if (map != null) {
            for (Map.Entry<Long, BattleTeamUserArmies> entry : map.entrySet()) {
                List<BattleTeamUser> list = entry.getValue().teamUsers;
                if (list != null) {
                    Iterator<BattleTeamUser> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            BattleTeamUser next = it.next();
                            if (kotlin.jvm.internal.o.LJ(l, next.userId)) {
                                if (next != null) {
                                    j = entry.getKey().longValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        long j2 = 1;
        if (j == 1) {
            j2 = 2;
        }
        java.util.Map<Long, BattleTeamResult> map2 = response.data.teamBattleResult;
        if (map2 != null) {
            battleTeamResult = map2.get(Long.valueOf(j));
        } else {
            battleTeamResult = null;
        }
        java.util.Map<Long, BattleTeamResult> map3 = response.data.teamBattleResult;
        if (map3 != null) {
            battleTeamResult2 = map3.get(Long.valueOf(j2));
        }
        LJJIFFI(jSONObject, battleTeamResult, battleTeamResult2);
        LJJIFFI(jSONObject2, battleTeamResult, battleTeamResult2);
        BattleSetting battleSetting2 = response.data.setting;
        if (battleSetting2 != null) {
            i2 = battleSetting2.status;
        } else {
            i2 = 0;
        }
        C05630Jz.LIZ(i2, "battle_status", jSONObject2);
        if (kotlin.jvm.internal.o.LJ(str, "audience_result")) {
            LJJIII(jSONObject, false);
        }
        LJLJJLL(this, "battle_info_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
        java.util.Map<Long, BattleTeamResult> map4 = response.data.teamBattleResult;
        if (map4 != null) {
            C05630Jz.LJI(jSONObject, "battle_result", GsonProtectorUtils.toJson(C09650Zl.LIZJ, map4));
        }
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, "battle_info");
        LJJIFFI(jSONObject2, battleTeamResult, battleTeamResult2);
        LJLJJLL(this, "update_result", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public final void LJJIZ(String str, C28467BFf c28467BFf) {
        JSONObject LIZLLL2 = FT5.LIZLLL("role_type", "anchor");
        if (c28467BFf != null) {
            C05630Jz.LJI(LIZLLL2, "logid", c28467BFf.LIZIZ);
        }
        C05630Jz.LIZ(1, "enable_battle", LIZLLL2);
        C05630Jz.LJI(LIZLLL2, WM7.SCENE_SERVICE, str);
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", C30725C4b.LIZ() - LJIILJJIL);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "anchor");
        LJJZZI("battle_permission_success", LIZLLL2, jSONObject2, jSONObject, false);
    }

    public final void LJJJ(int i, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(i, "cache_count", jSONObject2);
        C05630Jz.LIZ(0, "user_lottie", jSONObject2);
        C05630Jz.LIZ(LiveMatchQualityOptimizeSetting.INSTANCE.getValue(), "optimize_switch", jSONObject2);
        String str = (String) DataChannelGlobal.LJLJJI.mv0(C4W.class);
        if (str == null) {
            str = "unknown";
        }
        C05630Jz.LJI(jSONObject2, WM7.SCENE_SERVICE, str);
        if (z) {
            LJJZZIII(this, "start_animation_avatar_cache_hit", jSONObject, jSONObject2, null, true, 8);
        } else {
            LJLJJLL(this, "start_animation_avatar_cache_hit", jSONObject, jSONObject2, null, true, 8);
        }
    }

    public final void LJJJJ(C28467BFf<C76800UCe> response, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "inviter");
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - LIZLLL);
        LJL("cancel_succeed", jSONObject, jSONObject2, jSONObject3, false);
    }

    public final void LJJJJJ(Throwable throwable, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        LJJII(jSONObject, jSONObject2, throwable);
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject2);
        LJJZZIII(this, "punish_finish_failed", jSONObject, jSONObject2, null, false, 24);
    }

    public final void LJJJJL(int i, boolean z) {
        LJIILL = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "punish_duration", C30725C4b.LIZ() - LJIIJJI);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject3);
        C05630Jz.LIZ(i, "source", jSONObject3);
        LJJZZIII(this, "punish_finish_request", jSONObject, jSONObject3, jSONObject2, false, 16);
    }

    public final void LJJJJZI(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "reason", str);
        C05630Jz.LJI(jSONObject, "role_type", "invitee");
        JSONObject jSONObject2 = new JSONObject();
        LJJ(jSONObject2, z);
        LJJZZIII(this, "receive_panel_dismiss", jSONObject2, jSONObject, null, false, 8);
    }

    public final void LJJLIIIJILLIZJL(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "is_leave_room", jSONObject);
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(!LJJIIZ.contains(str) ? 1 : 0, "stage", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "match_duration", C30725C4b.LIZ() - LJJIJIL);
        LJLJJLL(this, "battle_finish", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public final void LJJLIIIJJIZ(String str, boolean z) {
        JSONObject LIZLLL2 = FT5.LIZLLL("case_type", str);
        if (z) {
            LJJZZIII(this, "update_result_issue", LIZLLL2, null, null, false, 28);
        } else {
            LJLJJLL(this, "update_result_issue", LIZLLL2, null, null, false, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(org.json.JSONObject r10, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r11, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r12) {
        /*
            if (r11 == 0) goto L7f
            int r0 = r11.result
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L8:
            java.lang.String r4 = "win"
            java.lang.String r9 = "none"
            java.lang.String r8 = "lost"
            java.lang.String r7 = "draw"
            r3 = 1
            r2 = 2
            if (r1 != 0) goto L67
        L14:
            r6 = r9
        L15:
            java.lang.String r0 = "result"
            X.C05630Jz.LJI(r10, r0, r6)
            if (r11 == 0) goto L23
            java.lang.String r5 = "left_team_score"
            long r0 = r11.totalScore
            X.C05630Jz.LJFF(r10, r5, r0)
        L23:
            if (r12 == 0) goto L2c
            java.lang.String r5 = "right_team_score"
            long r0 = r12.totalScore
            X.C05630Jz.LJFF(r10, r5, r0)
        L2c:
            java.lang.String r0 = "final_result"
            X.C05630Jz.LJI(r10, r0, r6)
            X.Twi r1 = X.C76265TwT.LIZ
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r0 = r1.LJIJJ
            if (r0 == 0) goto L45
            int r0 = r0.result
            if (r0 == 0) goto L40
            if (r0 == r3) goto L65
            if (r0 == r2) goto L63
            r4 = r9
        L40:
            java.lang.String r0 = "current_result"
            X.C05630Jz.LJI(r10, r0, r4)
        L45:
            X.Tv4 r0 = r1.LJ()
            int[] r1 = X.C76318TxK.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L60
            if (r0 == r2) goto L5d
            java.lang.String r1 = "other"
        L57:
            java.lang.String r0 = "current_status"
            X.C05630Jz.LJI(r10, r0, r1)
            return
        L5d:
            java.lang.String r1 = "punishing"
            goto L57
        L60:
            java.lang.String r1 = "linked"
            goto L57
        L63:
            r4 = r7
            goto L40
        L65:
            r4 = r8
            goto L40
        L67:
            int r0 = r1.intValue()
            if (r0 != r2) goto L6f
            r6 = r7
            goto L15
        L6f:
            int r0 = r1.intValue()
            if (r0 != r3) goto L77
            r6 = r8
            goto L15
        L77:
            int r0 = r1.intValue()
            if (r0 != 0) goto L14
            r6 = r4
            goto L15
        L7f:
            r1 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76271TwZ.LJJIFFI(org.json.JSONObject, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult):void");
    }

    public static void LJJII(JSONObject jSONObject, JSONObject jSONObject2, Throwable th) {
        if (th instanceof C276516r) {
            C276516r c276516r = (C276516r) th;
            C05630Jz.LIZ(c276516r.getErrorCode(), "error_msg", jSONObject2);
            C05630Jz.LIZ(c276516r.getErrorCode(), "error_code", jSONObject);
        } else {
            C05630Jz.LIZ(-1, "error_msg", jSONObject2);
            C05630Jz.LIZ(-1, "error_code", jSONObject);
        }
        C05630Jz.LJI(jSONObject, "error_detail", th.getMessage());
    }

    public static void LJJLIIIJ(C76271TwZ c76271TwZ, long j, long j2) {
        c76271TwZ.getClass();
        if (j == LJJIZ) {
            LJJIZ = 0L;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "channel_id", j2);
        C05630Jz.LJFF(jSONObject, "server_battle_id", j);
        C05630Jz.LJII(jSONObject, "hit_2v2_opt", false);
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "duration", C30725C4b.LIZ() - LJJIJLIJ);
        LJLJJLL(c76271TwZ, "sei_identify_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public final void LJJIL(boolean z, Throwable throwable, boolean z2) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "role_type", "anchor");
        C05630Jz.LIZ(z ? 1 : 0, "enable_battle", jSONObject);
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "is_last_retry", str);
        JSONObject jSONObject2 = new JSONObject();
        LJJII(jSONObject, jSONObject2, throwable);
        C05630Jz.LJI(jSONObject2, "role_type", "anchor");
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - LJIILJJIL);
        LJJZZI("battle_permission_failed", jSONObject, jSONObject2, jSONObject3, false);
    }

    public final void LJJJI(long j, String str, boolean z) {
        LIZLLL = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "role_type", "inviter");
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "reason", str);
        C05630Jz.LJI(jSONObject2, "role_type", "inviter");
        LJL("cancel_request", jSONObject, jSONObject2, new JSONObject(), false);
    }

    public final void LJJJIL(long j, Throwable throwable, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        LJJ(jSONObject, z);
        JSONObject LIZLLL2 = FT5.LIZLLL("role_type", "inviter");
        JSONObject jSONObject2 = new JSONObject();
        LJJII(jSONObject, LIZLLL2, throwable);
        LJL("cancel_failed", jSONObject, LIZLLL2, jSONObject2, false);
    }

    public final void LJJJJI(long j, List<LinkUser> fromIndex, List<LinkUser> list) {
        kotlin.jvm.internal.o.LJIIIZ(fromIndex, "fromIndex");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "from_index", ORZ.LLD(fromIndex, ",", null, null, C76275Twd.LJLIL, 30));
        C05630Jz.LJI(jSONObject, "to_index", ORZ.LLD(list, ",", null, null, C76276Twe.LJLIL, 30));
        LJJ(jSONObject, false);
        LJJZZIII(this, "change_position", jSONObject, new JSONObject(), new JSONObject(), false, 16);
    }

    public final void LJJJJLL(LinkMicBattleMessage msg, boolean z, boolean z2) {
        kotlin.jvm.internal.o.LJIIIZ(msg, "msg");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "message_fetch_time", msg.timestamp);
        C05630Jz.LJFF(jSONObject, "message_create_time", msg.baseMessage.createTime);
        C05630Jz.LJFF(jSONObject, "battle_id", msg.battleId);
        C05630Jz.LJI(jSONObject, "role_type", "invitee");
        boolean z3 = false;
        C05630Jz.LJII(jSONObject, "is_started", false);
        BattleSetting battleSetting = msg.battleSetting;
        if (battleSetting != null && battleSetting.inviteType == 1) {
            z3 = true;
        }
        LJJ(jSONObject, z3);
        C05630Jz.LIZ(z ? 1 : 0, "is_first_invite", jSONObject);
        List<BattleInviteeGiftPermission> list = msg.inviteeGiftPermissionTypes;
        int i = 3;
        if (list != null) {
            for (BattleInviteeGiftPermission battleInviteeGiftPermission : list) {
                if (battleInviteeGiftPermission.userId == LJJIIZ()) {
                    i = battleInviteeGiftPermission.giftPermissionType;
                }
            }
        }
        C05630Jz.LIZ(i, "gift_permission", jSONObject);
        C05630Jz.LJFF(jSONObject, "message_id", msg.baseMessage.messageId);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        C05630Jz.LIZ(z2 ? 1 : 0, "is_accept", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "invite_message_fetch_cost", C30725C4b.LIZ() - msg.baseMessage.createTime);
        LJL("invite_message", jSONObject, jSONObject2, jSONObject3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1 == 1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            long r0 = X.C30725C4b.LIZ()
            X.C76271TwZ.LJ = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "battle_id"
            long r0 = r5.battleId
            X.C05630Jz.LJFF(r2, r3, r0)
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r5.battleSetting
            if (r0 == 0) goto L5b
            int r1 = r0.inviteType
            r0 = 1
            if (r1 != r0) goto L5b
        L20:
            LJJ(r2, r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r1 = "role_type"
            java.lang.String r0 = "invitee"
            X.C05630Jz.LJI(r3, r1, r0)
            if (r6 == 0) goto L58
            java.lang.String r1 = "invite_each_other"
        L33:
            java.lang.String r0 = "scene"
            X.C05630Jz.LJI(r3, r0, r1)
            java.lang.String r0 = "reason"
            java.lang.String r1 = "invite"
            X.C05630Jz.LJI(r3, r0, r1)
            if (r6 == 0) goto L53
            java.lang.String r1 = "accept"
        L43:
            java.lang.String r0 = "message_type"
            X.C05630Jz.LJI(r3, r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "receive_panel_show"
            LJLI(r4, r0, r2, r3, r1)
            return
        L53:
            if (r7 == 0) goto L43
            java.lang.String r1 = "invite_rtc"
            goto L43
        L58:
            java.lang.String r1 = "normal"
            goto L33
        L5b:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76271TwZ.LJJJLIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean, boolean):void");
    }

    public final void LJJJZ(int i, long j, Throwable throwable) {
        kotlin.jvm.internal.o.LJIIIZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        JSONObject jSONObject3 = new JSONObject();
        LJJII(jSONObject, jSONObject2, throwable);
        LJL("reject_failed", jSONObject, jSONObject2, jSONObject3, false);
    }

    public final void LJJL(int i, long j, C28467BFf<Void> response) {
        kotlin.jvm.internal.o.LJIIIZ(response, "response");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "invite_type", jSONObject);
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "logid", response.LIZIZ);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - LJFF);
        LJL("reject_succeed", jSONObject, jSONObject2, jSONObject3, false);
    }

    public final void LJJLIIIIJ(long j, long j2, long j3) {
        LJJIJLIJ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "server_battle_id", j2);
        C05630Jz.LJFF(jSONObject, "channel_id", j3);
        if (LJJIZ != j) {
            C05630Jz.LIZ(1, "is_first_sei", jSONObject);
        } else {
            C05630Jz.LIZ(0, "is_first_sei", jSONObject);
        }
        LJJ(jSONObject, false);
        LJJIZ = j;
        LJLJJLL(this, "sei_identify_start", jSONObject, null, null, false, 28);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJ().compareTo(EnumC76178Tv4.START) >= 0 && j == j2) {
            LJJLIIIJ(this, c76280Twi.LIZIZ(), B5G.LIZIZ().LJFF);
        }
    }

    public final void LJJLIIIJL(boolean z, String str, LinkMicBattleArmiesMessage message) {
        kotlin.jvm.internal.o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", message.battleId);
        C05630Jz.LJFF(jSONObject, "current_battle_id", C76265TwT.LIZ.LIZIZ());
        C05630Jz.LJI(jSONObject, "sub_type", str);
        if (z) {
            LJJZZIII(this, "score_not_add_issue", jSONObject, null, null, false, 28);
        } else {
            LJLJJLL(this, "score_not_add_issue", jSONObject, null, null, false, 28);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(long j, long j2, boolean z) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        C05630Jz.LJI(jSONObject, "source", "user_offline");
        if (j == 0) {
            str2 = "quit";
        } else if (j == 1) {
            str2 = "drop";
        } else if (j == 2) {
            str2 = "become_audience";
        } else {
            str2 = "unknown";
        }
        C05630Jz.LJI(jSONObject, "user_offline_reason", str2);
        C05630Jz.LJFF(jSONObject, "leave_uid", j2);
        LJJI(jSONObject);
        LJJZ(this, "abnormal_finish_battle", jSONObject, null, 12);
    }

    public static void LJJIIJ(long j, boolean z, boolean z2, String logId) {
        kotlin.jvm.internal.o.LJIIIZ(logId, "logId");
        if (j == 0) {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C76265TwT.LIZ.LIZIZ());
            LIZ2.append(',');
            LIZ2.append(currentUserId);
            LJJIIZI(j, z, z2, X1D.LIZIZ(LIZ2));
            return;
        }
        LJJIIZI(j, z, z2, logId);
    }

    public static void LJJIIZI(long j, boolean z, boolean z2, String str) {
        long j2;
        int i;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJJIII;
        if (linkedHashMap.get(str) != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Object obj = linkedHashMap.get(str);
            kotlin.jvm.internal.o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.live.liveinteract.multimatch.tracer.GiftEventInfo>");
            List<C76338Txe> list = (List) obj;
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            StringBuilder LIZ2 = X1D.LIZ();
            C76280Twi c76280Twi = C76265TwT.LIZ;
            LIZ2.append(c76280Twi.LIZIZ());
            LIZ2.append(',');
            LIZ2.append(currentUserId);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            BattleSetting battleSetting = c76280Twi.LIZLLL;
            long j3 = 0;
            if (battleSetting != null) {
                j2 = battleSetting.startTimeMs;
            } else {
                j2 = 0;
            }
            for (C76338Txe c76338Txe : list) {
                if (c76338Txe.LJLILLLLZI == j && c76338Txe.LJLJI > 0) {
                    C05630Jz.LJFF(jSONObject2, "user_id", currentUserId);
                    C05630Jz.LJI(jSONObject2, "distinct_key", LIZIZ2);
                    if (j != j3) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    C05630Jz.LIZ(i, "source", jSONObject2);
                    C05630Jz.LJFF(jSONObject2, "send_success_delay", C31012CFc.LIZJ() - c76338Txe.LJLJJI);
                    C05630Jz.LJFF(jSONObject, "send_success_delay", C31012CFc.LIZJ() - c76338Txe.LJLJJI);
                    long j4 = 1000;
                    C05630Jz.LJFF(jSONObject2, "send_success_pk_time_sec", (c76338Txe.LJLJJI - j2) / j4);
                    C05630Jz.LJFF(jSONObject, "send_success_pk_time_sec", (c76338Txe.LJLJJI - j2) / j4);
                    long LIZJ2 = 301 - ((C31012CFc.LIZJ() - j2) / j4);
                    if (LIZJ2 < j3) {
                        LIZJ2 = 0;
                    }
                    C05630Jz.LJFF(jSONObject2, "update_score_pk_time_sec", LIZJ2);
                    int i2 = 1;
                    C05630Jz.LIZ(1, "show", jSONObject2);
                    if (!z2) {
                        i2 = 0;
                    }
                    C05630Jz.LIZ(i2, "is_compensation", jSONObject2);
                    C05630Jz.LIZ(LiveMatchArmiesLooperSettings.INSTANCE.getValue() ? 1 : 0, "client_downsampling", jSONObject2);
                    if (c76338Txe.LJLILLLLZI != j3) {
                        C05630Jz.LJI(jSONObject2, "log_id", str);
                    }
                    if (z) {
                        LJLJJLL(LIZ, "battle_score_update", jSONObject2, jSONObject2, jSONObject, false, 16);
                    } else {
                        C76272Twa.LIZ.LJJJLZIJ("battle_score_update", jSONObject2, jSONObject2, jSONObject);
                    }
                    c76338Txe.LJLJI--;
                }
                j3 = 0;
            }
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3 += ((C76338Txe) it.next()).LJLJI;
            }
            if (i3 == 0) {
                LJJIII.remove(str);
            }
        }
    }

    public static /* synthetic */ void LJJLIL(int i, boolean z, long j, int i2) {
        Long l;
        C76271TwZ c76271TwZ = LIZ;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            l = 0L;
        } else {
            l = null;
        }
        c76271TwZ.LJJLIIJ(i, z, j, l);
    }

    public final void LJJJLZIJ(int i, long j, long j2, String str) {
        LJFF = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "invite_type", jSONObject);
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "offline_uid", j2);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "reason", str);
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        LJL("reject_request", jSONObject, jSONObject2, new JSONObject(), false);
    }

    public final void LJJLIIIJLJLI(int i, boolean z, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C05630Jz.LJI(jSONObject, "source", "disconnect_cohost");
            LJJZ(this, "positive_finish_battle", jSONObject, null, 12);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i != 2) {
            if (i != 4) {
                if (i != 6) {
                    if (i != 7) {
                        C05630Jz.LIZ(i, "other_finish_reason_code", jSONObject);
                        str2 = "other_finish_reason";
                    } else {
                        if (abnormalDisconnectReason != null) {
                            C05630Jz.LJFF(jSONObject, "first_frame_handler_uid", abnormalDisconnectReason.getDisconnectFromUid());
                        }
                        str2 = "linked_list_without_me";
                    }
                } else {
                    str2 = "first_frame_timeout";
                }
            } else {
                C05630Jz.LIZ(i2, "rtc_error_code", jSONObject);
                C05630Jz.LIZ(i2, "rtc_error_code", jSONObject2);
                str2 = "rtc_error";
            }
        } else {
            if (abnormalDisconnectReason != null) {
                C05630Jz.LJFF(jSONObject, "kickout_by_uid", abnormalDisconnectReason.getDisconnectFromUid());
                C05630Jz.LIZ(abnormalDisconnectReason.getDissconnectReason(), "kickout_reason", jSONObject);
            }
            str2 = "kickout_by_other";
        }
        C05630Jz.LJI(jSONObject, "source", str2);
        LJJI(jSONObject);
        LJJZ(this, "abnormal_finish_battle", jSONObject, jSONObject2, 8);
    }

    public final void LJJLIIJ(int i, boolean z, long j, Long l) {
        String str;
        long j2;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            str = "1v1";
        } else {
            str = "2v2";
        }
        C05630Jz.LJI(jSONObject, "match_type", str);
        if (i != 101) {
            if (i != 106) {
                if (i != 211) {
                    if (i != 109) {
                        if (i != 110) {
                            return;
                        }
                        C05630Jz.LJI(jSONObject, "source", "end_live");
                        LJJZ(this, "positive_finish_battle", jSONObject, null, 12);
                        return;
                    }
                    C05630Jz.LJI(jSONObject, "source", "user_list_change");
                    C05630Jz.LJI(jSONObject, "user_list_change_source", "im_list_change");
                    if (C75877TqD.LJIILIIL.length() > 0) {
                        C05630Jz.LJI(jSONObject, "user_list_change_source", "first_frame_time_out");
                    }
                    C05630Jz.LJFF(jSONObject, "leave_uid", j);
                    if (l != null) {
                        j2 = l.longValue();
                    } else {
                        j2 = 0;
                    }
                    C05630Jz.LJFF(jSONObject, "message_id", j2);
                    LJJI(jSONObject);
                    LJJZ(this, "abnormal_finish_battle", jSONObject, null, 12);
                    return;
                }
                C05630Jz.LJI(jSONObject, "source", "disconnect_pk");
                LJJZ(this, "positive_finish_battle", jSONObject, null, 12);
                return;
            }
            LJJZ(this, "normal_finish_battle", jSONObject, null, 12);
            return;
        }
        C05630Jz.LJI(jSONObject, "source", "disconnect_pk");
        LJJZ(this, "positive_finish_battle", jSONObject, null, 12);
    }

    public static void LJJJJZ(int i, long j, int i2, boolean z, int i3) {
        String str;
        C76271TwZ c76271TwZ = LIZ;
        boolean z2 = false;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJII(jSONObject, "click_state", z2);
        LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(i, "selection", jSONObject2);
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        if (i2 == 0) {
            str = "normal";
        } else {
            str = "invite_each_other";
        }
        C05630Jz.LJI(jSONObject2, WM7.SCENE_SERVICE, str);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "show_to_decide_dur", C30725C4b.LIZ() - LJ);
        c76271TwZ.LJL("receive_panel_click", jSONObject, jSONObject2, jSONObject3, false);
    }

    public static void LJJZ(C76271TwZ c76271TwZ, String str, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        JSONObject jSONObject3 = jSONObject2;
        if ((i & 4) != 0) {
            jSONObject3 = null;
        }
        if ((i & 8) != 0) {
            c76271TwZ.getClass();
            LJIJI(jSONObject);
            C05630Jz.LJFF(jSONObject, "battle_id", C76265TwT.LIZ.LIZIZ());
        } else {
            c76271TwZ.getClass();
        }
        C05630Jz.LJI(jSONObject, "event_id", str);
        Iterator it = ((ArrayList) C48359IyR.LIZ).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Number) it.next()).longValue();
        }
        int size = ((ArrayList) C48359IyR.LIZ).size();
        if (size < 1) {
            size = 1;
        }
        C05630Jz.LJFF(jSONObject, "average_bitrate", j / size);
        C05630Jz.LIZ(C8E.LIZLLL().LLIFFJFJJ() ? 1 : 0, "is_sdk", jSONObject);
        C0K2.LIZLLL("ttlive_client_match_interrupt_monitor", jSONObject, null, jSONObject);
        CL5.LIZIZ(str, jSONObject, jSONObject3, null, true, 1, true);
        String str2 = "";
        switch (str.hashCode()) {
            case -1741616610:
                if (str.equals("positive_finish_battle")) {
                    C05630Jz.LIZ(1, "is_positive_finish", jSONObject);
                    str2 = "positive_finish_battle";
                    break;
                }
                break;
            case -1551240937:
                if (str.equals("app_abnormal_exit")) {
                    C05630Jz.LIZ(1, "is_app_exit", jSONObject);
                    str2 = jSONObject.optString("app_exit_reason", "");
                    kotlin.jvm.internal.o.LJIIIIZZ(str2, "extra.optString(\"app_exit_reason\", \"\")");
                    break;
                }
                break;
            case 200812077:
                if (str.equals("abnormal_finish_battle")) {
                    C05630Jz.LIZ(1, "is_abnormal_finish", jSONObject);
                    str2 = jSONObject.optString("source", "");
                    kotlin.jvm.internal.o.LJIIIIZZ(str2, "extra.optString(\"source\", \"\")");
                    break;
                }
                break;
            case 1086223500:
                if (str.equals("normal_finish_battle")) {
                    C05630Jz.LIZ(1, "is_normal_finish", jSONObject);
                    str2 = "normal_finish";
                    break;
                }
                break;
        }
        if (str2.length() == 0) {
            return;
        }
        C05630Jz.LJI(jSONObject, "finish_reason", str2);
        C05630Jz.LJI(jSONObject, "event_id", "battle_finished_timing");
        C0K2.LIZLLL("ttlive_client_match_interrupt_monitor", new JSONObject(), null, jSONObject);
        CL5.LIZIZ(str, jSONObject, null, null, true, 1, false);
    }

    public static /* synthetic */ void LJLI(C76271TwZ c76271TwZ, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        c76271TwZ.LJL(str, jSONObject, jSONObject2, jSONObject3, false);
    }

    public final void LJJZZI(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z) {
        if (z) {
            LJIJI(jSONObject);
            if (C76265TwT.LIZ.LJIILIIL) {
                C05630Jz.LJI(jSONObject2, "role_type", "inviter");
            } else {
                C05630Jz.LJI(jSONObject2, "role_type", "invitee");
            }
        } else {
            LJIJ(jSONObject);
        }
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJI(jSONObject2, "event_id", str);
        LJIL(jSONObject3, jSONObject);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("eventId:");
        LIZ2.append(str);
        LIZ2.append(" extra:");
        LIZ2.append(jSONObject);
        LIZ2.append(" category:");
        LIZ2.append(jSONObject2);
        TYQ.LIZLLL("livesdk_multi_match", X1D.LIZIZ(LIZ2));
        C0K2.LIZLLL("ttlive_client_anchor_multi_match_monitor", jSONObject2, jSONObject3, jSONObject);
        CL5.LIZIZ(str, jSONObject, jSONObject2, jSONObject3, true, 1, true);
    }

    public final void LJL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z) {
        if (z) {
            LJIJI(jSONObject);
        } else {
            LJIJ(jSONObject);
        }
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJI(jSONObject2, "event_id", str);
        LJIL(jSONObject3, jSONObject);
        C0K2.LIZLLL("ttlive_client_anchor_multi_match_monitor", jSONObject2, jSONObject3, jSONObject);
        CL5.LIZIZ(str, jSONObject, jSONObject2, jSONObject3, true, 1, true);
    }

    public final void LJJLIIIJJI(long j, long j2, C76244Tw8 c76244Tw8, int i, List<BattleTeamUserArmies> armies, boolean z) {
        long j3;
        List<TeamUsersInfo> list;
        kotlin.jvm.internal.o.LJIIIZ(armies, "armies");
        LJJIJIL = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "duration", LJJIJIL - LJIILLIIL);
        C05630Jz.LJFF(jSONObject, "remain_time", j);
        C05630Jz.LJFF(jSONObject, "battle_id", j2);
        if (c76244Tw8 != null && (list = c76244Tw8.LJIILL) != null) {
            for (TeamUsersInfo teamUsersInfo : list) {
                if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ) {
                    List<Long> list2 = teamUsersInfo.userIds;
                    kotlin.jvm.internal.o.LJIIIIZZ(list2, "it.userIds");
                    for (Long it : list2) {
                        long LJJIIZ2 = LJJIIZ();
                        if (it == null || it.longValue() != LJJIIZ2) {
                            kotlin.jvm.internal.o.LJIIIIZZ(it, "it");
                            C05630Jz.LJFF(jSONObject, "teammate_id", it.longValue());
                        }
                    }
                }
            }
        }
        C05630Jz.LIZ(!z ? 1 : 0, "stage", jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BattleTeamUserArmies battleTeamUserArmies : armies) {
            Long l = battleTeamUserArmies.teamId;
            long j4 = C76265TwT.LIZ.LJJJJJ;
            if (l == null || l.longValue() != j4) {
                C05630Jz.LJFF(jSONObject, "right_team_score", battleTeamUserArmies.teamTotalScore);
            } else {
                C05630Jz.LJFF(jSONObject, "left_team_score", battleTeamUserArmies.teamTotalScore);
            }
            List<BattleTeamUser> list3 = battleTeamUserArmies.teamUsers;
            if (list3 != null) {
                for (BattleTeamUser battleTeamUser : list3) {
                    Long l2 = battleTeamUser.userId;
                    long j5 = 0;
                    if (l2 != null) {
                        j3 = l2.longValue();
                    } else {
                        j3 = 0;
                    }
                    Long valueOf = Long.valueOf(j3);
                    Long l3 = battleTeamUser.score;
                    if (l3 != null) {
                        j5 = l3.longValue();
                    }
                    linkedHashMap.put(valueOf, Long.valueOf(j5));
                }
            }
        }
        try {
            C05630Jz.LJI(jSONObject, "anchor_scores", new Gson().LJIILL(linkedHashMap));
        } catch (Exception e) {
            C0NB.LJFF("Match Monitor", "logWatchMatchStart", e);
        }
        LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, WM7.SCENE_SERVICE, C77119UOl.LJIIJ(i));
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "duration", LJJIJIL - LJIILLIIL);
        LJJIII(jSONObject, false);
        LJIILLIIL(jSONObject);
        LJLJJLL(this, "battle_start", jSONObject, jSONObject2, jSONObject3, false, 16);
    }

    public static /* synthetic */ void LJJZZIII(C76271TwZ c76271TwZ, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z, int i) {
        if ((i & 4) != 0) {
            jSONObject2 = new JSONObject();
        }
        if ((i & 8) != 0) {
            jSONObject3 = new JSONObject();
        }
        if ((i & 16) != 0) {
            z = true;
        }
        c76271TwZ.LJJZZI(str, jSONObject, jSONObject2, jSONObject3, z);
    }

    public static void LJLJJLL(C76271TwZ c76271TwZ, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z, int i) {
        JSONObject jSONObject4 = jSONObject2;
        JSONObject jSONObject5 = jSONObject3;
        if ((i & 4) != 0) {
            jSONObject4 = new JSONObject();
        }
        if ((i & 8) != 0) {
            jSONObject5 = new JSONObject();
        }
        if ((i & 16) != 0 || z) {
            c76271TwZ.getClass();
            LJIJI(jSONObject);
        } else {
            c76271TwZ.getClass();
            LJIJ(jSONObject);
        }
        C05630Jz.LJI(jSONObject4, "role_type", "audience");
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJI(jSONObject4, "event_id", str);
        LJIL(jSONObject5, jSONObject);
        if (C32777Cth.LIZ(0.1f, "ttlive_client_audience_multi_match_monitor") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_audience_multi_match_monitor", 0.2d)) {
            C0K2.LIZLLL("ttlive_client_audience_multi_match_monitor", jSONObject4, jSONObject5, jSONObject);
        }
        CL5.LIZIZ(str, jSONObject, jSONObject4, jSONObject5, true, 1, false);
    }
}
