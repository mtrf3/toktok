package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tkr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75545Tkr {
    public static final void LJ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_connection_overtime");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(RandomLinkMicManager.LL.getType(), "invitee_list");
        LIZ.LJIJJ("anchor", "connection_type");
        LIZ.LJJIIJZLJL();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "end_reason", "auto_match_overtime");
        C58416MwG.LIZLLL.LIZIZ(2, jSONObject);
    }

    public static final void LIZ(java.util.Map<String, String> map) {
        java.util.Map<String, String> map2 = B5G.LIZIZ().LJJJJZI;
        if (map2 != null && map2.containsKey("rank_period")) {
            String str = map2.get("rank_period");
            if (str == null) {
                str = "";
            }
            map.put("rank_period", str);
        }
    }

    public static final String LIZIZ(EnumC75614Tly enumC75614Tly) {
        if (enumC75614Tly != null) {
            switch (C75611Tlv.LIZ[enumC75614Tly.ordinal()]) {
                case 1:
                    return "mutual_follow";
                case 2:
                    return "recommend";
                case 3:
                    return CM9.WEEKLY_RANK.getRankName();
                case 4:
                    return CM9.DAILY_RANK.getRankName();
                case 5:
                    return CM9.DAILY_RANK_HALL_OF_FAME.getRankName();
                case 6:
                    return CM9.HOURLY_RANK.getRankName();
                case 7:
                    return RankTypeV2.LJIIIIZZ.rankName;
                case 8:
                    return RankTypeV2.LJIIIZ.rankName;
                case 9:
                    return RankTypeV2.LJIIJ.rankName;
                case 10:
                    return RankTypeV2.LJIIJJI.rankName;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                    if (RandomLinkMicManager.LL == EnumC75546Tks.RANDOM_MATCH || RandomLinkMicManager.LL == EnumC75546Tks.RANDOM_RECOMMEND) {
                        return "random_match";
                    }
                    return RandomLinkMicManager.LL.getType();
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return CM9.WEEKLY_ROOKIE_RANK.getRankName();
            }
        }
        return "";
    }

    public static final void LJFF(java.util.Map<String, String> map) {
        try {
            if (B5G.LIZIZ().LJIIL) {
                RandomLinkMicManager.LJLIL.getClass();
                if (!TextUtils.isEmpty(RandomLinkMicManager.LJLLLL)) {
                    ((HashMap) map).put("match_id", RandomLinkMicManager.LJLLLL);
                    return;
                } else {
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public static final void LIZJ(java.util.Map<String, String> map, EnumC75614Tly inviteType, boolean z) {
        String str;
        o.LJIIIZ(inviteType, "inviteType");
        int i = 0;
        String str2 = "";
        switch (C75611Tlv.LIZ[inviteType.ordinal()]) {
            case 1:
                map.put("invitee_list", "mutual_follow");
                break;
            case 2:
            case 14:
                map.put("invitee_list", "recommend");
                break;
            case 3:
                map.put("invitee_list", CM9.WEEKLY_RANK.getRankName());
                LIZ(map);
                break;
            case 4:
                map.put("invitee_list", CM9.DAILY_RANK.getRankName());
                LIZ(map);
                break;
            case 5:
                map.put("invitee_list", CM9.DAILY_RANK_HALL_OF_FAME.getRankName());
                LIZ(map);
                break;
            case 6:
                map.put("invitee_list", CM9.HOURLY_RANK.getRankName());
                LIZ(map);
                break;
            case 7:
                map.put("invitee_list", RankTypeV2.LJIIIIZZ.rankName);
                LIZ(map);
                break;
            case 8:
                map.put("invitee_list", RankTypeV2.LJIIIZ.rankName);
                LIZ(map);
                break;
            case 9:
                map.put("invitee_list", RankTypeV2.LJIIJ.rankName);
                LIZ(map);
                break;
            case 10:
                map.put("invitee_list", RankTypeV2.LJIIJJI.rankName);
                LIZ(map);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                map.put("invitee_list", "random_match");
                map.put("is_system_rematching", CardStruct.IStatusCode.DEFAULT);
                if (C75611Tlv.LIZIZ[RandomLinkMicManager.LL.ordinal()] == 1) {
                    map.put("is_system_rematching", "1");
                }
                if (C75547Tkt.LIZIZ || B5G.LIZIZ().LJJIJLIJ) {
                    map.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
                    C75547Tkt.LIZIZ = false;
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                map.put("invitee_list", CM9.WEEKLY_ROOKIE_RANK.getRankName());
                LIZ(map);
                break;
            case 15:
                map.put("invitee_list", "official_channel_allowlist");
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
                map.put("invitee_list", "reservation_card");
                break;
            case 18:
                map.put("invitee_list", "scheduled");
                break;
            case 19:
                map.put("invitee_list", "scheduled");
                break;
            case 20:
            case 21:
                map.put("invitee_list", "topic");
                break;
            default:
                map.put("invitee_list", "");
                break;
        }
        map.put("event_type", String.valueOf(inviteType.getType()));
        if (!TextUtils.isEmpty(B5G.LIZIZ().LJJIIZ.rankType)) {
            String str3 = B5G.LIZIZ().LJJIIZ.rankType;
            o.LJIIIIZZ(str3, "inst().topHostInfo.rankType");
            map.put("rank_type", str3);
        }
        if (B5G.LIZIZ().LJJIIZ.topIndex > 0) {
            i = 1;
        }
        String valueOf = String.valueOf(i);
        o.LJIIIIZZ(valueOf, "LinkCrossRoomDataHolder.…ankingOppositeAnchorValue");
        map.put("is_ranking_opposite_anchor", valueOf);
        if (z) {
            C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
            if (c75648TmW != null && (str = c75648TmW.LIZ) != null) {
                str2 = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                map.put("enter_from", str2);
            }
        }
    }

    public static final void LIZLLL(java.util.Map<String, String> map, EnumC75614Tly inviteType, boolean z) {
        String str;
        o.LJIIIZ(inviteType, "inviteType");
        LIZJ(map, inviteType, z);
        RandomLinkMicManager.LJLIL.getClass();
        if (RandomLinkMicManager.LJLLLLLL && RandomLinkMicManager.LJZL) {
            if (RandomLinkMicManager.LL == EnumC75546Tks.RANDOM_MATCH || RandomLinkMicManager.LL == EnumC75546Tks.RANDOM_RECOMMEND) {
                str = "random_match";
            } else {
                str = RandomLinkMicManager.LL.getType();
            }
            ((HashMap) map).put("invitee_list", str);
        }
    }
}
