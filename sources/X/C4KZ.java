package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4KZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KZ {
    public static final C4KZ LIZ = new C4KZ();

    public static String LIZJ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == 1) {
                return "private";
            }
            if (iMConversation.getConversationType() == 2) {
                return "group";
            }
            return "";
        }
        return "";
    }

    public static void LIZ(C1HQ c1hq, IMContact iMContact) {
        if (iMContact == null) {
            c1hq.put("to_user_id", "null");
            c1hq.put("conversation_id", "null");
            return;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            c1hq.put("to_user_id", iMUser.getUid());
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "contact.uid");
            c1hq.put("conversation_id", C81273Gx.LIZIZ(CastLongProtector.parseLong(uid)));
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        c1hq.put("conversation_id", ((IMConversation) iMContact).getConversationId());
        c1hq.put("to_user_id", "null");
    }

    public static String LIZIZ(long j, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(j);
        return h.LJIIIIZZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJI(SharePackage sharePackage, IMContact iMContact) {
        LJFF("livesdk_live_event_share", sharePackage, iMContact, false, System.currentTimeMillis(), C772831o.LIZ());
    }

    public static void LJ(C4KZ c4kz, String str, SharePackage sharePackage) {
        String str2;
        String str3;
        Integer num;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C85323Wm LIZ2 = C772831o.LIZ();
        c4kz.getClass();
        C1HQ c1hq = new C1HQ();
        String str4 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            str2 = bundle3.getString("enter_from");
        } else {
            str2 = null;
        }
        c1hq.put("enter_from", str2);
        if (sharePackage != null) {
            Bundle bundle4 = sharePackage.extras;
            if (bundle4 == null || (str3 = bundle4.getString("button_source", null)) == null) {
                Bundle bundle5 = sharePackage.extras;
                if (bundle5 != null) {
                    str3 = bundle5.getString("enter_method");
                }
            }
            c1hq.put("panel_source", str3);
            if (sharePackage == null && (bundle2 = sharePackage.extras) != null) {
                num = Integer.valueOf(bundle2.getInt("rank_num"));
            } else {
                num = null;
            }
            c1hq.put("rank_num", String.valueOf(num));
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                str4 = bundle.getString("button_type");
            }
            c1hq.put("button_type", str4);
            c1hq.put("action_type", str);
            LIZ2.LIZIZ("share_friend_search", c1hq);
        }
        str3 = null;
        c1hq.put("panel_source", str3);
        if (sharePackage == null) {
        }
        num = null;
        c1hq.put("rank_num", String.valueOf(num));
        if (sharePackage != null) {
            str4 = bundle.getString("button_type");
        }
        c1hq.put("button_type", str4);
        c1hq.put("action_type", str);
        LIZ2.LIZIZ("share_friend_search", c1hq);
    }

    public static void LIZLLL(SharePackage sharePackage, IMContact iMContact, boolean z, String str, int i) {
        long j;
        C85323Wm onEventV3;
        C85323Wm c85323Wm;
        java.util.Map<String, String> locationCommonParamsIfHave;
        java.util.Set<String> keySet;
        String str2;
        String str3;
        String str4 = str;
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if ((i & 32) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        if ((i & 64) != 0) {
            c85323Wm = C772831o.LIZ();
        } else {
            c85323Wm = null;
        }
        String platform = str4;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(onEventV3, "onEventV3");
        C85323Wm onEventV3Json = c85323Wm;
        o.LJIIIZ(onEventV3Json, "onEventV3Json");
        if (sharePackage == null) {
            return;
        }
        String str5 = sharePackage.itemType;
        String str6 = "chat_merge";
        String str7 = "chat";
        switch (str5.hashCode()) {
            case -2091181238:
                if (!str5.equals("paid_series") || !o.LJ(sharePackage.itemType, "paid_series")) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C4KY.LIZ(linkedHashMap, sharePackage, C47261Igj.LJJIJIIJIL(iMContact));
                FMX.LJIIL("share_series", linkedHashMap);
                return;
            case -1890252483:
                if (!str5.equals("sticker")) {
                    return;
                }
                C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", "prop_page");
                LIZIZ.put("group_id", sharePackage.extras.getString("group_id"));
                LIZIZ.put("author_id", sharePackage.extras.getString("user_id"));
                LIZIZ.put("prop_id", sharePackage.extras.getString("sticker_id"));
                LIZIZ.put("log_pb", sharePackage.extras.getString("log_pb"));
                LIZIZ.put("platform", "chat");
                LIZIZ.put("chat_type", LIZJ(iMContact));
                C1HQ c1hq = new C1HQ();
                String LIZIZ2 = LIZIZ(j, "share_prop");
                if (LIZIZ2 != null) {
                    LIZIZ.put("bind_id", LIZIZ2);
                    c1hq.put("bind_id", LIZIZ2);
                }
                onEventV3.LIZIZ("share_prop", LIZIZ);
                LIZ(c1hq, iMContact);
                onEventV3.LIZIZ("share_prop_info", c1hq);
                return;
            case -1103912169:
                if (!str5.equals("now_others_video_post")) {
                    return;
                }
                break;
            case -906336856:
                if (!str5.equals("search")) {
                    return;
                }
                HashMap LIZJ = C03660Ck.LIZJ("enter_from", "webview");
                if (z) {
                    str7 = "chat_merge";
                }
                LIZJ.put("platform", str7);
                C67142kI.LIZ(sharePackage.extras.getString("track_info"), LIZJ);
                if (iMContact instanceof IMUser) {
                    String uid = ((IMUser) iMContact).getUid();
                    o.LJIIIIZZ(uid, "contact.uid");
                    LIZJ.put("to_user_id", uid);
                }
                onEventV3.LIZIZ("share_search_result", LIZJ);
                return;
            case -439827310:
                if (!str5.equals("now_invite")) {
                    return;
                }
                break;
            case -309474065:
                if (!str5.equals("product")) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(C107184Io.LJIIIIZZ(sharePackage.extras.getString("product_query_params")));
                Object obj = linkedHashMap2.get("author_id");
                if (obj instanceof String) {
                    str3 = (String) obj;
                } else {
                    str3 = null;
                }
                linkedHashMap2.put("user_type", C107184Io.LJFF(str3));
                linkedHashMap2.put("chat_type", C107184Io.LIZ(iMContact));
                linkedHashMap2.put("conversation_id", C107184Io.LIZJ(iMContact));
                if (!z) {
                    if (TextUtils.isEmpty(str4)) {
                        str6 = "chat_head";
                    } else {
                        str6 = str4;
                    }
                }
                linkedHashMap2.put("platform", str6);
                String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
                linkedHashMap2.put("from_user_id", currentUserID);
                linkedHashMap2.put("to_user_id", C107184Io.LIZLLL(iMContact));
                if (iMContact != null) {
                    linkedHashMap2.put("is_chat_list_top5", Integer.valueOf(iMContact.getIsRecentTop5Contact()));
                    linkedHashMap2.put("is_recent_contact", Integer.valueOf(iMContact.getIsRecentContact()));
                }
                linkedHashMap2.put("rank_index", Integer.valueOf(sharePackage.extras.getInt("rank_num")));
                FMX.LJIILJJIL("tiktokec_share_product", C107184Io.LJII(linkedHashMap2));
                return;
            case -173657445:
                if (!str5.equals("mix_videos")) {
                    return;
                }
                OSZ[] oszArr = new OSZ[5];
                oszArr[0] = new OSZ("enter_from", sharePackage.extras.getString("enter_from"));
                oszArr[1] = new OSZ("author_id", sharePackage.extras.getString("user_id"));
                oszArr[2] = new OSZ("playlist_id", sharePackage.extras.getString("compilation_id"));
                if (sharePackage.extras.getBoolean("is_creator")) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                oszArr[3] = new OSZ("is_self", str2);
                oszArr[4] = new OSZ("platform", "chat_head");
                onEventV3.LIZIZ("share_playlist", C113554cx.LJJL(oszArr));
                return;
            case -84391837:
                if (!str5.equals("point_of_interest")) {
                    return;
                }
                C1HQ c1hq2 = new C1HQ();
                c1hq2.put("enter_from", sharePackage.extras.getString("enter_from"));
                if (str4.length() == 0) {
                    if (!z) {
                        str6 = "chat_head";
                    }
                } else {
                    str6 = str4;
                }
                c1hq2.put("platform", str6);
                c1hq2.put("poi_id", sharePackage.extras.getString("poi_id", ""));
                c1hq2.put("poi_city", sharePackage.extras.getString("poi_city", ""));
                c1hq2.put("poi_region_code", sharePackage.extras.getString("poi_region_code", ""));
                c1hq2.put("poi_info_source", sharePackage.extras.getString("poi_info_source", ""));
                c1hq2.put("enable_location", sharePackage.extras.getString("enable_location", ""));
                c1hq2.put("previous_page", sharePackage.extras.getString("previous_page", ""));
                Bundle bundle = (Bundle) sharePackage.extras.getParcelable("poi_extras");
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    for (String key : keySet) {
                        o.LJIIIIZZ(key, "key");
                        c1hq2.put(key, String.valueOf(C16880lQ.LLJJIII(bundle, key)));
                    }
                }
                ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
                if (LJIJJ != null && (locationCommonParamsIfHave = LJIJJ.getLocationCommonParamsIfHave()) != null) {
                    c1hq2.putAll(locationCommonParamsIfHave);
                }
                onEventV3.LIZIZ("share_poi", c1hq2);
                return;
            case -2348590:
                if (!str5.equals("now_video")) {
                    return;
                }
                break;
            case 112100:
                if (!str5.equals("qna")) {
                    return;
                }
                C1HQ LIZJ2 = HXX.LIZJ("enter_from", "qa_detail", "platform", "chat");
                LIZJ2.put("question_id", sharePackage.extras.getString("qna_id", ""));
                onEventV3.LIZIZ("share_question", LIZJ2);
                return;
            case 117588:
                if (!str5.equals("web")) {
                    return;
                }
                C1HQ LIZIZ3 = C48339Iy7.LIZIZ("enter_from", "webview");
                LIZIZ3.put("group_id", sharePackage.extras.getString("group_id"));
                LIZIZ3.put("webview_type", sharePackage.extras.getString("webview_type"));
                LIZIZ3.put("previous_page", sharePackage.extras.getString("previous_type"));
                if (z) {
                    str7 = "chat_merge";
                }
                LIZIZ3.put("platform", str7);
                String LIZIZ4 = LIZIZ(j, "share_webview");
                LIZIZ3.put("bind_id", LIZIZ4);
                onEventV3.LIZIZ("share_webview", LIZIZ3);
                C1HQ c1hq3 = new C1HQ();
                c1hq3.put("bind_id", LIZIZ4);
                LIZ(c1hq3, iMContact);
                onEventV3.LIZIZ("share_webview_info", c1hq3);
                return;
            case 3322092:
                if (!str5.equals("live")) {
                    return;
                }
                C1HQ c1hq4 = new C1HQ();
                LIZ(c1hq4, iMContact);
                c1hq4.put("anchor_id", sharePackage.extras.getString("live_id"));
                c1hq4.put("room_id", sharePackage.identifier);
                c1hq4.put("request_id", sharePackage.extras.getString("request_id"));
                c1hq4.put("user_type", sharePackage.extras.getString("user_type"));
                c1hq4.put("previous_page", sharePackage.extras.getString("previous_type"));
                if (z) {
                    str7 = "chat_merge";
                }
                c1hq4.put("platform", str7);
                onEventV3.LIZIZ("share_live", c1hq4);
                return;
            case 3599307:
                if (!str5.equals("user")) {
                    return;
                }
                C1HQ c1hq5 = new C1HQ();
                LIZ(c1hq5, iMContact);
                c1hq5.put("user_id", sharePackage.identifier);
                if (z) {
                    str7 = "chat_merge";
                }
                c1hq5.put("platform", str7);
                onEventV3.LIZIZ("share_profile", c1hq5);
                return;
            case 93227207:
                if (!str5.equals("aweme")) {
                    return;
                }
                break;
            case 104263205:
                if (!str5.equals("music")) {
                    return;
                }
                C1HQ c1hq6 = new C1HQ();
                LIZ(c1hq6, iMContact);
                c1hq6.put("music_id", sharePackage.extras.getString("music_id"));
                if (z) {
                    str7 = "chat_merge";
                }
                c1hq6.put("platform", str7);
                c1hq6.put("process_id", sharePackage.extras.getString("process_id", ""));
                onEventV3.LIZIZ("share_music", c1hq6);
                return;
            case 361630739:
                if (!str5.equals("now_others_post")) {
                    return;
                }
                break;
            case 972568762:
                if (!str5.equals("aweme_photo")) {
                    return;
                }
                break;
            case 978111542:
                if (!str5.equals("ranking")) {
                    return;
                }
                C1HQ c1hq7 = new C1HQ();
                LIZ(c1hq7, iMContact);
                switch (sharePackage.extras.getInt("aweme_type")) {
                    case 1801:
                        c1hq7.put("hot_search_type", "general");
                        break;
                    case 1802:
                        c1hq7.put("hot_search_type", "video");
                        break;
                    case 1803:
                        c1hq7.put("hot_search_type", "music");
                        break;
                }
                if (z) {
                    str7 = "chat_merge";
                }
                c1hq7.put("platform", str7);
                c1hq7.put("parent_tag_id", sharePackage.extras.getString("extra_parent_tag_id"));
                onEventV3.LIZIZ("share_tag", c1hq7);
                return;
            case 1200629127:
                if (!str5.equals("live_event")) {
                    return;
                }
                LJFF("livesdk_live_event_share_info", sharePackage, iMContact, z, j, onEventV3);
                return;
            case 1402633315:
                if (!str5.equals("challenge")) {
                    return;
                }
                C1HQ c1hq8 = new C1HQ();
                LIZ(c1hq8, iMContact);
                c1hq8.put("tag_id", sharePackage.extras.getString("challenge_id"));
                if (z) {
                    str7 = "chat_merge";
                }
                c1hq8.put("platform", str7);
                c1hq8.put("process_id", sharePackage.extras.getString("process_id", ""));
                c1hq8.put("parent_tag_id", sharePackage.extras.getString("extra_parent_tag_id"));
                onEventV3.LIZIZ("share_tag", c1hq8);
                return;
            case 1662319721:
                if (!str5.equals("now_post")) {
                    return;
                }
                break;
            default:
                return;
        }
        C57428MgK.LJI(sharePackage, iMContact, z, str4, j, c85323Wm, -1);
    }

    public static void LJFF(String str, SharePackage sharePackage, IMContact iMContact, boolean z, long j, InterfaceC75532xp onEventV3) {
        String str2;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        LIZ(c1hq, iMContact);
        c1hq.put("live_event_id", sharePackage.extras.getString("live_event_id"));
        c1hq.put("author_id", sharePackage.extras.getString("live_event_author_id"));
        Bundle bundle = sharePackage.extras;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        c1hq.put("is_anchor", bundle.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT));
        c1hq.put("chat_type", LIZJ(iMContact));
        if (z) {
            str2 = "chat_merge";
        } else {
            str2 = "chat_head";
        }
        c1hq.put("platform", str2);
        c1hq.put("enter_from", sharePackage.extras.getString("enter_from", ""));
        if (!sharePackage.extras.getBoolean("is_paid_event", false)) {
            str3 = "1";
        }
        c1hq.put("is_free_event", str3);
        if (iMContact == null) {
            c1hq.put("follow_status", "null");
        } else if (iMContact instanceof IMUser) {
            c1hq.put("follow_status", String.valueOf(((IMUser) iMContact).getFollowStatus()));
        }
        c1hq.put("bind_id", LIZIZ(j, "livesdk_live_event_share"));
        onEventV3.LIZIZ(str, c1hq);
    }
}
