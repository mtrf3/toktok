package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.TwoMatchProgressOptionalSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twa */
/* loaded from: classes14.dex */
public final class C76272Twa extends C75192TfA {
    public static final C76272Twa LIZ = new C76272Twa();
    public static boolean LIZIZ;
    public static final List<String> LIZJ;
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

    public static final String LJIL(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "magic_smokes" : "boosting_gloves" : "unknown";
    }

    static {
        System.currentTimeMillis();
        LIZJ = new ArrayList();
        LIZLLL = System.currentTimeMillis();
        LJ = System.currentTimeMillis();
        LJFF = System.currentTimeMillis();
        LJI = System.currentTimeMillis();
        LJII = System.currentTimeMillis();
        LJIIIZ = System.currentTimeMillis();
        LJIIJ = System.currentTimeMillis();
        LJIIJJI = System.currentTimeMillis();
        LJIIL = -1L;
    }

    public static final void LJJJJLI() {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, true);
        LJJJLIIL(c76272Twa, "rematch_click", jSONObject, false, null, 48);
    }

    public static void LJIJ(JSONObject jSONObject) {
        String str;
        if (TwoMatchProgressOptionalSetting.INSTANCE.getValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "match_progress_opt", str);
    }

    public static final void LJJIFFI(int i) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "match_item_type", LJIL(i));
        C05630Jz.LJI(jSONObject, "show_type", "popup");
        LIZ.LJJJLL(0, "award_match_item_guide_show", jSONObject);
    }

    public static final void LJJIIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, false);
        c76272Twa.LJJJLL(0, "battle_info_request", jSONObject);
        LJIIJJI = System.currentTimeMillis();
    }

    public static final void LJIJI(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "metric.keys()");
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

    public static final void LJIJJ(JSONObject jSONObject, boolean z) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r8 == null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76272Twa.LJJIII(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean):void");
    }

    public static final void LJJIIJ(String scene, Throwable th) {
        o.LJIIIZ(scene, "scene");
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJIIJJI);
        LJIJJ(jSONObject, false);
        c76272Twa.LJJJLL(1, "battle_info_failed", jSONObject);
    }

    public static final void LJJIIZI(String str, boolean z) {
        JSONObject LIZLLL2 = FT5.LIZLLL(WM7.SCENE_SERVICE, str);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(LIZLLL2, z);
        LJJJLIIL(c76272Twa, "battle_info_request", LIZLLL2, z, null, 56);
        LJIIJJI = System.currentTimeMillis();
    }

    public static final void LJJIJIIJIL(boolean z, LinkMicBattleTaskMessage message) {
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "message_create_time", message.baseMessage.createTime);
        C05630Jz.LJFF(jSONObject, "message_fetch_time", message.timestamp);
        C05630Jz.LJI(jSONObject, "message", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, message));
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, false);
        if (z) {
            LJJJLIIL(c76272Twa, "battle_task_message", jSONObject, false, null, 60);
        } else {
            c76272Twa.LJJJLL(0, "battle_task_message", jSONObject);
        }
    }

    public static final void LJJIJIL(Throwable th, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJFF);
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "cancel_failed", jSONObject, false, null, 48);
    }

    public static final void LJJIJL(LinkMicBattleMessage message, boolean z) {
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        C75192TfA.LJIIIZ(message, jSONObject);
        LJIJJ(jSONObject, false);
        if (z) {
            LJJJLIIL(c76272Twa, "cut_short_message", jSONObject, false, null, 60);
        } else {
            c76272Twa.LJJJLL(0, "cut_short_message", jSONObject);
        }
    }

    public static final void LJJJI(LinkMicBattleMessage message, boolean z) {
        o.LJIIIZ(message, "message");
        LJIIIIZZ = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        C75192TfA.LJIIIZ(message, jSONObject);
        LJIJJ(jSONObject, false);
        if (z) {
            C76280Twi c76280Twi = C76265TwT.LIZ;
            long j = 0;
            if (c76280Twi.LJJIIJZLJL > 0) {
                j = System.currentTimeMillis() - c76280Twi.LJJIIJZLJL;
            }
            C05630Jz.LJFF(jSONObject, "cost", j);
            LJJJLIIL(c76272Twa, "open_message", jSONObject, false, null, 60);
            return;
        }
        c76272Twa.LJJJLL(0, "open_message", jSONObject);
    }

    public static final void LJJJJI(boolean z, LinkMicBattlePunishFinishMessage message) {
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", message.battleId);
        C05630Jz.LJI(jSONObject, "message", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, message));
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, false);
        if (z) {
            LJJJLIIL(c76272Twa, "punish_finish_message", jSONObject, false, null, 56);
        } else {
            c76272Twa.LJJJLL(0, "punish_finish_message", jSONObject);
        }
    }

    public static final void LJJJJLL(int i, String str) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        JSONObject LIZLLL2 = FT5.LIZLLL("selection", str);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(LIZLLL2, z);
        LJJJLIIL(c76272Twa, "reply_click", LIZLLL2, z, null, 56);
    }

    public final void LJIILLIIL(JSONObject jSONObject, C76280Twi battleDataModel) {
        InterfaceC05190Ih interfaceC05190Ih;
        String str;
        long j;
        long j2;
        String str2;
        LiveMode streamType;
        o.LJIIIZ(battleDataModel, "battleDataModel");
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        InterfaceC29405BgP LIZIZ3 = B83.LIZ().LIZIZ();
        String str3 = null;
        if (LIZIZ3 != null) {
            interfaceC05190Ih = ((C29374Bfu) LIZIZ3).LIZIZ;
        } else {
            interfaceC05190Ih = null;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str3 = C28509BGv.LIZ(streamType);
        }
        C05630Jz.LJI(jSONObject, "live_type", str3);
        if (!jSONObject.has("channel_id")) {
            long j3 = LIZIZ2.LJFF;
            if (j3 == 0) {
                j3 = battleDataModel.LJJIJIL;
            }
            C05630Jz.LJFF(jSONObject, "channel_id", j3);
        }
        if (!jSONObject.has("battle_id")) {
            C05630Jz.LJFF(jSONObject, "battle_id", battleDataModel.LIZIZ());
        }
        if (interfaceC05190Ih != null) {
            j = interfaceC05190Ih.getId();
        } else {
            j = 0;
        }
        if (Room.isValid(room) && room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        C05630Jz.LJFF(jSONObject, "current_user_id", j);
        C05630Jz.LJFF(jSONObject, "current_anchor_id", j2);
        if (!jSONObject.has("guest_anchor_id")) {
            C05630Jz.LJFF(jSONObject, "guest_anchor_id", LIZIZ2.LJI);
        }
        if (!jSONObject.has("role_type")) {
            if (j > 0 && j2 > 0 && j == j2) {
                if (battleDataModel.LJIILIIL) {
                    str2 = "inviter";
                } else {
                    str2 = "invitee";
                }
            } else {
                str2 = "audience";
            }
            C05630Jz.LJI(jSONObject, "role_type", str2);
        }
        if (!jSONObject.has("battle_time")) {
            C05630Jz.LJFF(jSONObject, "battle_time", battleDataModel.LJJ);
        }
        if (!jSONObject.has("punish_time")) {
            C05630Jz.LJFF(jSONObject, "punish_time", battleDataModel.LJJI);
        }
        C05630Jz.LJI(jSONObject, "uid_list", ORZ.LLD(C8E.LIZLLL().LJIILJJIL(), ",", null, null, C76269TwX.LJLIL, 30));
        C75192TfA.LJIILIIL(jSONObject);
    }

    public final void LJIJJLI(JSONObject jSONObject, boolean z) {
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

    public final void LJJI(long j, long j2) {
        long j3 = LJIILJJIL;
        if (j3 > 0 && j3 == j) {
            return;
        }
        LJIILJJIL = j;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "channel_id", j2);
        C05630Jz.LJFF(jSONObject, "server_battle_id", j);
        LJIJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "duration", C30725C4b.LIZ() - LJIILIIL);
        LJJJLZIJ("sei_identify_succeed", jSONObject, jSONObject2, jSONObject3);
    }

    public final void LJJJJZ(String str, boolean z) {
        JSONObject LIZLLL2 = FT5.LIZLLL("case_type", str);
        if (z) {
            LJJJLIIL(this, "update_result_issue", LIZLLL2, false, null, 60);
        } else {
            LJJJLL(0, "update_result_issue", LIZLLL2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(org.json.JSONObject r12, com.bytedance.android.livesdk.model.message.battle.BattleResult r13, com.bytedance.android.livesdk.model.message.battle.BattleResult r14) {
        /*
            r2 = 0
            if (r13 == 0) goto L84
            long r0 = r13.score
        L6:
            if (r14 == 0) goto La
            long r2 = r14.score
        La:
            if (r13 == 0) goto L82
            int r4 = r13.result
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
        L12:
            java.lang.String r7 = "none"
            java.lang.String r11 = "lost"
            java.lang.String r10 = "win"
            java.lang.String r9 = "draw"
            r6 = 1
            r5 = 2
            if (r8 != 0) goto L6a
        L1e:
            r8 = r7
        L1f:
            java.lang.String r4 = "result"
            X.C05630Jz.LJI(r12, r4, r8)
            java.lang.String r4 = "left_score"
            X.C05630Jz.LJFF(r12, r4, r0)
            java.lang.String r0 = "right_score"
            X.C05630Jz.LJFF(r12, r0, r2)
            java.lang.String r0 = "final_result"
            X.C05630Jz.LJI(r12, r0, r8)
            X.Twi r1 = X.C76265TwT.LIZ
            com.bytedance.android.livesdk.model.message.battle.BattleResult r0 = r1.LJIJI
            if (r0 == 0) goto L46
            int r0 = r0.result
            if (r0 == 0) goto L68
            if (r0 == r6) goto L66
            if (r0 == r5) goto L64
        L41:
            java.lang.String r0 = "current_result"
            X.C05630Jz.LJI(r12, r0, r7)
        L46:
            X.Tv4 r0 = r1.LJ()
            int[] r1 = X.C76274Twc.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L61
            if (r0 == r5) goto L5e
            java.lang.String r1 = "other"
        L58:
            java.lang.String r0 = "current_status"
            X.C05630Jz.LJI(r12, r0, r1)
            return
        L5e:
            java.lang.String r1 = "punishing"
            goto L58
        L61:
            java.lang.String r1 = "linked"
            goto L58
        L64:
            r7 = r9
            goto L41
        L66:
            r7 = r11
            goto L41
        L68:
            r7 = r10
            goto L41
        L6a:
            int r4 = r8.intValue()
            if (r4 != r5) goto L72
            r8 = r9
            goto L1f
        L72:
            int r4 = r8.intValue()
            if (r4 != 0) goto L7a
            r8 = r10
            goto L1f
        L7a:
            int r4 = r8.intValue()
            if (r4 != r6) goto L1e
            r8 = r11
            goto L1f
        L82:
            r8 = 0
            goto L12
        L84:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76272Twa.LJIIZILJ(org.json.JSONObject, com.bytedance.android.livesdk.model.message.battle.BattleResult, com.bytedance.android.livesdk.model.message.battle.BattleResult):void");
    }

    public static final void LJJIIJZLJL(String scene, Throwable th, boolean z) {
        o.LJIIIZ(scene, "scene");
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJIIJJI);
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "battle_info_failed", jSONObject, z, null, 48);
    }

    public static final void LJJIJIIJI(long j, String scene, boolean z) {
        long j2;
        o.LJIIIZ(scene, "scene");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "count", j);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, false);
        c76272Twa.LJIJJLI(jSONObject, z);
        C05630Jz.LJFF(jSONObject, "time_before_calibrated", System.currentTimeMillis());
        C05630Jz.LJFF(jSONObject, "time_after_calibrated", C76273Twb.LIZ());
        C05630Jz.LJFF(jSONObject, "calibrated_diff", C76273Twb.LIZ() - System.currentTimeMillis());
        C05630Jz.LJFF(jSONObject, "t3_current_diff_time", C76273Twb.LJ - C76273Twb.LJFF);
        C05630Jz.LJI(jSONObject, "calibrated_log_id", C76273Twb.LIZJ);
        C05630Jz.LJI(jSONObject, "calibrated_path", C76273Twb.LIZLLL);
        C05630Jz.LJFF(jSONObject, "calibrated_t3_time", C76273Twb.LJ);
        BattleSetting battleSetting = C76265TwT.LIZ.LIZLLL;
        if (battleSetting != null) {
            j2 = battleSetting.startTimeMs;
        } else {
            j2 = 0;
        }
        C05630Jz.LJFF(jSONObject, "server_start_time", j2);
        if (z) {
            if (scene.length() > 0) {
                C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, scene);
            }
            LJJJLIIL(c76272Twa, "battle_start", jSONObject, false, null, 60);
        } else {
            if (scene.length() > 0) {
                C05630Jz.LJI(jSONObject, "identify_scene", scene);
            }
            c76272Twa.LJJJLL(0, "battle_start", jSONObject);
        }
    }

    public static final void LJJIZ(String str, Throwable th, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C76272Twa c76272Twa = LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJ);
        if (!C38354F3m.LJ(str)) {
            C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        }
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "invite_failed", jSONObject, z, null, 48);
    }

    public static final void LJJJIL(long j, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "open_request", jSONObject, z, null, 56);
        LJI = System.currentTimeMillis();
    }

    public static final void LJJJJ(long j, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJI);
        C76272Twa c76272Twa = LIZ;
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "open_succeed", jSONObject, z, null, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJIZL(long r11, java.lang.String r13, boolean r14) {
        /*
            java.lang.String r1 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r13, r1)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r0 = "count"
            X.C05630Jz.LJFF(r10, r0, r11)
            X.C05630Jz.LJI(r10, r1, r13)
            X.Twa r8 = X.C76272Twa.LIZ
            r0 = 0
            LJIJJ(r10, r0)
            com.bytedance.android.livesdk.model.message.battle.BattleResult r0 = X.C76265TwT.LIZJ
            if (r0 == 0) goto L24
            int r0 = r0.result
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 != 0) goto L65
        L24:
            java.lang.String r7 = "none"
        L26:
            com.bytedance.android.livesdk.model.message.battle.BattleResult r0 = X.C76265TwT.LIZJ
            r2 = 0
            if (r0 == 0) goto L62
            long r0 = r0.score
        L2e:
            com.bytedance.android.livesdk.model.message.battle.BattleResult r4 = X.C76265TwT.LIZLLL
            if (r4 == 0) goto L34
            long r2 = r4.score
        L34:
            java.lang.String r6 = "result"
            X.C05630Jz.LJI(r10, r6, r7)
            java.lang.String r5 = "left_score"
            X.C05630Jz.LJFF(r10, r5, r0)
            java.lang.String r4 = "right_score"
            X.C05630Jz.LJFF(r10, r4, r2)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            X.C05630Jz.LJI(r12, r6, r7)
            X.C05630Jz.LJFF(r12, r5, r0)
            X.C05630Jz.LJFF(r12, r4, r2)
            if (r14 == 0) goto L5c
            java.lang.String r9 = "punish_start"
            r11 = 0
            r13 = 44
            LJJJLIIL(r8, r9, r10, r11, r12, r13)
        L5b:
            return
        L5c:
            java.lang.String r0 = "punish_start"
            LJJJZ(r0, r10, r12)
            goto L5b
        L62:
            r0 = 0
            goto L2e
        L65:
            int r0 = r1.intValue()
            if (r0 != 0) goto L6e
            java.lang.String r7 = "win"
            goto L26
        L6e:
            int r1 = r1.intValue()
            r0 = 1
            if (r1 != r0) goto L24
            java.lang.String r7 = "lost"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76272Twa.LJJJJIZL(long, java.lang.String, boolean):void");
    }

    public static final void LJJJJJL(String str, java.util.Map map, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C75192TfA.LJIIIIZZ(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "reject_request", jSONObject, z, null, 56);
        LJII = System.currentTimeMillis();
    }

    public static final void LJJJJL(String str, java.util.Map map, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C75192TfA.LJIIIIZZ(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJII);
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "reject_succeed", jSONObject, z, null, 56);
    }

    public static final void LJJJJZI(boolean z, String str, LinkMicBattleArmiesMessage message) {
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", message.battleId);
        C05630Jz.LJI(jSONObject, "sub_type", str);
        C05630Jz.LJFF(jSONObject, "current_battle_id", C76265TwT.LIZ.LIZIZ());
        C76272Twa c76272Twa = LIZ;
        if (z) {
            LJJJLIIL(c76272Twa, "score_not_add_issue", jSONObject, false, null, 56);
        } else {
            c76272Twa.LJJJLL(0, "score_not_add_issue", jSONObject);
        }
    }

    public static /* synthetic */ void LJJJZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        LIZ.LJJJLZIJ(str, jSONObject, jSONObject2, new JSONObject());
    }

    public final void LJJ(long j, long j2, long j3) {
        StringBuilder LIZJ2 = V10.LIZJ("battleId = ", j, " lastBattleId = ");
        LIZJ2.append(LJIIL);
        LIZJ2.append(" and lastSuccess = ");
        LIZJ2.append(LJIILJJIL);
        C0NB.LJ("TestIdentify", X1D.LIZIZ(LIZJ2));
        long j4 = LJIIL;
        if (j4 > 0 && (j4 == j || LJIILJJIL == j4)) {
            return;
        }
        LJIILIIL = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "server_battle_id", j2);
        C05630Jz.LJFF(jSONObject, "channel_id", j3);
        if (LJIIL != j) {
            C05630Jz.LIZ(1, "is_first_sei", jSONObject);
        } else {
            C05630Jz.LIZ(0, "is_first_sei", jSONObject);
        }
        LJIJJ(jSONObject, false);
        LJIIL = j;
        LJJJLL(0, "sei_identify_start", jSONObject);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJ().compareTo(EnumC76178Tv4.START) >= 0 && j == j2) {
            LJJI(c76280Twi.LIZIZ(), B5G.LIZIZ().LJFF);
        }
    }

    public final void LJJII(String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "source", str);
        LJIJJ(jSONObject, z2);
        if (z) {
            LJJJLIIL(this, "data_reset", jSONObject, z2, null, 56);
        } else {
            LJJJLL(0, "data_reset", jSONObject);
        }
    }

    public final void LJJJLL(int i, String str, JSONObject jSONObject) {
        LJIILLIIL(jSONObject, C76265TwT.LIZ);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LIZ(LIZIZ ? 1 : 0, "is_sdk", jSONObject);
        LJIJ(jSONObject);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_audience_battle_monitor")) {
            C0K2.LJIIIIZZ("ttlive_client_audience_battle_monitor", i, jSONObject);
        }
        CL5.LIZIZ(str, jSONObject, null, null, false, 1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r13 == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJ(java.lang.String r19, com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76272Twa.LJJIJ(java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse, boolean, boolean):void");
    }

    public static final void LJJIJLIJ(String str, boolean z, int i, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "match_item_type", LJIL(i));
        C05630Jz.LIZ(z2 ? 1 : 0, "is_opposite", jSONObject);
        C05630Jz.LJI(jSONObject, "sender_uid", str);
        C76272Twa c76272Twa = LIZ;
        if (z) {
            LJJJLIIL(c76272Twa, "match_item_effect_end", jSONObject, false, null, 60);
        } else {
            c76272Twa.LJJJLL(0, "match_item_effect_end", jSONObject);
        }
    }

    public static final void LJJIL(int i, String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "match_item_type", LJIL(i));
        C05630Jz.LIZ(z2 ? 1 : 0, "is_opposite", jSONObject);
        C05630Jz.LJI(jSONObject, "sender_uid", str);
        C76272Twa c76272Twa = LIZ;
        if (z) {
            LJJJLIIL(c76272Twa, "match_item_effect_start", jSONObject, false, null, 60);
        } else {
            c76272Twa.LJJJLL(0, "match_item_effect_start", jSONObject);
        }
    }

    public static final void LJJJJJ(boolean z, String str, Throwable th, java.util.Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                C75192TfA.LJIIIIZZ(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJII);
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "reject_failed", jSONObject, z, null, 48);
    }

    public final void LJJJLZIJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJIILLIIL(jSONObject, C76265TwT.LIZ);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LIZ(LIZIZ ? 1 : 0, "is_sdk", jSONObject);
        LJIJI(jSONObject3, jSONObject);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_audience_battle_monitor")) {
            C0K2.LIZLLL("ttlive_client_audience_battle_monitor", jSONObject2, jSONObject3, jSONObject);
        }
        CL5.LIZIZ(str, jSONObject, jSONObject2, jSONObject3, false, 1, false);
    }

    public static final void LJJJ(long j, long j2, String str, Throwable th, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJFF(jSONObject, "own_battle_id", j2);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - LJI);
        if (!C38354F3m.LJ(str)) {
            C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
        }
        LJIJJ(jSONObject, z);
        LJJJLIIL(c76272Twa, "open_failed", jSONObject, z, null, 48);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJJJLIIL(C76272Twa c76272Twa, String str, JSONObject jSONObject, boolean z, JSONObject jSONObject2, int i) {
        JSONObject jSONObject3;
        C76280Twi c76280Twi;
        JSONObject jSONObject4 = jSONObject2;
        ?? r9 = z;
        if ((i & 4) != 0) {
            r9 = 0;
        }
        if ((i & 16) != 0) {
            jSONObject4 = new JSONObject();
        }
        if ((i & 32) != 0) {
            jSONObject3 = new JSONObject();
        } else {
            jSONObject3 = null;
        }
        c76272Twa.getClass();
        if (r9 != 0) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (!jSONObject.has("invite_type")) {
            C05630Jz.LJI(jSONObject, "invite_type", String.valueOf((int) r9));
        }
        c76272Twa.LJIILLIIL(jSONObject, c76280Twi);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C05630Jz.LJI(jSONObject4, "event_id", str);
        C05630Jz.LIZ(LIZIZ ? 1 : 0, "is_sdk", jSONObject);
        LJIJI(jSONObject3, jSONObject);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("eventId:");
        LIZ2.append(str);
        LIZ2.append(" extra:");
        LIZ2.append(jSONObject);
        LIZ2.append(" category:");
        LIZ2.append(jSONObject4);
        TYQ.LIZLLL("livesdk_double_match", X1D.LIZIZ(LIZ2));
        C0K2.LIZLLL("ttlive_client_anchor_battle_monitor", jSONObject4, jSONObject3, jSONObject);
        CL5.LIZIZ(str, jSONObject, jSONObject4, jSONObject3, false, 1, true);
    }
}
