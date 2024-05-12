package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107234It implements C4R6 {
    public static final C107234It LIZ = new C107234It();
    public static int LIZIZ = 1;

    public static void LJIIJJI(SharePackage sharePackage) {
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(onEventV3, "onEventV3");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        String string = sharePackage.extras.getString("user_type", "");
        o.LJIIIIZZ(string, "sharePackage.extras.getS…(ShareKeys.USER_TYPE, \"\")");
        linkedHashMap.put("user_type", string);
        String string2 = sharePackage.extras.getString("request_page", "");
        o.LJIIIIZZ(string2, "sharePackage.extras.getS…eys.KEY_REQUEST_PAGE, \"\")");
        linkedHashMap.put("request_page", string2);
        Aweme aweme = C107264Iw.LIZ;
        String str2 = null;
        if (aweme != null) {
            linkedHashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                num = Integer.valueOf(imageList.size());
            } else {
                num = null;
            }
            linkedHashMap.put("pic_cnt", String.valueOf(num));
        }
        String string3 = sharePackage.extras.getString("panel_source");
        if (string3 == null) {
            string3 = "";
        }
        if (C78685UuP.LJJJZ(string3)) {
            linkedHashMap.put("panel_source", string3);
        }
        String string4 = sharePackage.extras.getString("aid");
        if (string4 == null) {
            string4 = "";
        }
        linkedHashMap.put("group_id", string4);
        String string5 = sharePackage.extras.getString("enter_from");
        if (string5 != null) {
            str = string5;
        }
        linkedHashMap.put("enter_from", str);
        onEventV3.LIZIZ("im_share_head_show", linkedHashMap);
        if (C107244Iu.LIZ(sharePackage.itemType, "product")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(C107184Io.LJIIIIZZ(sharePackage.extras.getString("product_query_params")));
            Object obj = linkedHashMap2.get("author_id");
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            linkedHashMap2.put("user_type", C107184Io.LJFF(str2));
            FMX.LJIILJJIL("tiktokec_im_share_head_show", C107184Io.LJII(linkedHashMap2));
        }
    }

    public static void LIZIZ(C1HQ c1hq, IMContact iMContact) {
        String LIZJ = C3K0.LIZJ(iMContact);
        if (LIZJ == null) {
            LIZJ = "";
        }
        c1hq.put("conversation_id", LIZJ);
        if (iMContact instanceof IMUser) {
            c1hq.put("to_user_id", ((IMUser) iMContact).getUid());
            c1hq.put("chat_type", "private");
        } else {
            if (!(iMContact instanceof IMConversation)) {
                return;
            }
            c1hq.put("chat_type", "group");
        }
    }

    public static void LIZJ(SharePackage sharePackage, String str) {
        String str2;
        Bundle bundle;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (str2 = bundle.getString("enter_from")) == null) {
            str2 = "";
        }
        LIZ3.put("enter_from", str2);
        LIZ3.put("action", str);
        LIZ2.LIZIZ("create_group_intermediate_button", LIZ3);
    }

    public static String LIZLLL(IMContact iMContact, String str) {
        String str2;
        String str3 = "";
        if (iMContact == null) {
            return "";
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            str2 = iMUser.getUid();
            o.LJIIIIZZ(str2, "contact.uid");
            if (o.LJ(iMUser.getUid(), str)) {
                if ((iMContact instanceof MAFIMUser) || (iMUser.getFollowStatus() != 2 && C78685UuP.LJJJZ(iMUser.getRecType()))) {
                    return "creator/maf";
                }
                return "creator";
            }
            if (iMUser.getFollowStatus() == 2) {
                str3 = "muf";
            } else if (iMContact instanceof MAFIMUser) {
                str3 = "maf";
            }
        } else if (!(iMContact instanceof IMConversation)) {
            str2 = "";
        } else {
            str2 = ((IMConversation) iMContact).getConversationId();
            o.LJIIIIZZ(str2, "contact.conversationId");
        }
        if (iMContact.getType() == 1) {
            if (C3WB.LIZIZ.contains(str2)) {
                return "recent link share";
            }
            if (C3WB.LIZ.contains(str2)) {
                return "recent share";
            }
            if (C3WB.LIZJ.contains(str2)) {
                return "recent send to";
            }
            return "recent chat";
        }
        return str3;
    }

    public static void LJFF(SharePackage sharePackage, int i) {
        String str;
        Bundle bundle;
        String string;
        Bundle bundle2;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        String str2 = "";
        if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str = bundle2.getString("enter_from")) == null) {
            str = "";
        }
        LIZ3.put("enter_from", str);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("panel_style")) != null) {
            str2 = string;
        }
        LIZ3.put("panel_style", str2);
        LIZ3.put("show_cnt", String.valueOf(i));
        LIZ2.LIZIZ("share_emoji_show", LIZ3);
    }

    public static void LJI(String str, String str2) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (C3PG.LIZIZ.LIZ("message_icon_status")) {
            return;
        }
        onEventV3.LIZIZ("message_icon_status", HXX.LIZJ("position", str, "action_type", str2));
    }

    public static void LJIIJ(SharePackage sharePackage, IMContact iMContact) {
        String str;
        String str2;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(eventSender, "eventSender");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (o.LJ(sharePackage.itemType, "comment")) {
            linkedHashMap.put("enter_from", "comment_panel");
            if (iMContact instanceof IMUser) {
                str2 = ((IMUser) iMContact).getUid();
                o.LJIIIIZZ(str2, "contact.uid");
                str = "private";
            } else if (iMContact instanceof IMConversation) {
                str = "group";
                str2 = "";
            } else {
                str = "other";
                str2 = "unknow";
            }
            linkedHashMap.put("chat_type", str);
            linkedHashMap.put("to_user_id", str2);
            eventSender.LIZIZ("share_head_click", linkedHashMap);
        }
    }

    @Override // X.C4R6
    public final void LIZ(String str, String str2) {
        LJI(str, str2);
    }

    public static void LJ(SharePackage sharePackage, int i, String str) {
        String str2;
        Bundle bundle;
        String string;
        Bundle bundle2;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "emojiUnicode", "onEventV3");
        C1HQ c1hq = new C1HQ();
        String str3 = "";
        if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str2 = bundle2.getString("enter_from")) == null) {
            str2 = "";
        }
        c1hq.put("enter_from", str2);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("panel_style")) != null) {
            str3 = string;
        }
        c1hq.put("panel_style", str3);
        c1hq.put("rank_num", String.valueOf(i + 1));
        c1hq.put("emoji_id", str);
        LIZJ.LIZIZ("share_emoji_click", c1hq);
    }

    public static void LJII(String str, String str2, String str3) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("rec_friends_on_share_panel", C113554cx.LJJL(new OSZ("panel_style", str), new OSZ("action_type", str2), new OSZ("to_user_id", str3)));
    }

    public static void LJIIIZ(long j, String str, String str2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        LIZ3.put("duration", String.valueOf(j));
        LIZ3.put("enter_from", str);
        LIZ3.put("enter_method", str2);
        LIZ3.put("is_first_open_after_launch", String.valueOf(LIZIZ));
        LIZ2.LIZIZ("share_head_show_performance", LIZ3);
        LIZIZ = 0;
    }

    public static void LJIIIIZZ(IMContact contact, int i, String str, SharePackage sharePackage, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Bundle bundle;
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        String str10;
        String str11;
        Bundle bundle5;
        Object obj;
        Object obj2;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            str2 = ((RBX) LJIILL).getCurUserId();
        } else {
            str2 = null;
        }
        String str12 = "";
        if (str2 == null) {
            str2 = "";
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(onEventV3, "onEventV3");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = contact instanceof IMUser;
        String str13 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            linkedHashMap.put("chat_type", "private");
            IMUser iMUser = (IMUser) contact;
            linkedHashMap.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
            linkedHashMap.put("rec_type", iMUser.getRecType());
            linkedHashMap.put("to_user_id", iMUser.getUid());
            if (iMUser.getFriendRecType() != 1) {
                str10 = "";
            } else {
                str10 = "share_link_match";
            }
            linkedHashMap.put("rec_reason", str10);
            if (o.LJ(iMUser.getUid(), str2)) {
                if (iMUser.getIsAtLastInSharePanel()) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_chat_list_bottom", obj2);
            }
            if (C107454Jp.LIZ()) {
                if (iMUser.isOnline()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_active", obj);
            }
            if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
                str11 = bundle5.getString("author_id");
            } else {
                str11 = null;
            }
            String LIZLLL = LIZLLL(contact, str11);
            iMUser.setShareRelationType(LIZLLL);
            linkedHashMap.put("share_relation_type", LIZLLL);
        } else if (contact instanceof IMConversation) {
            linkedHashMap.put("chat_type", "group");
            String LIZLLL2 = LIZLLL(contact, "");
            contact.setShareRelationType(LIZLLL2);
            linkedHashMap.put("share_relation_type", LIZLLL2);
        } else if (contact instanceof C4Q7) {
            linkedHashMap.put("group_button_type", "recommended");
        } else if (contact instanceof C108724Om) {
            linkedHashMap.put("group_button_type", "more");
        }
        linkedHashMap.put("rank_index", String.valueOf(i));
        linkedHashMap.put("show_type", str);
        linkedHashMap.put("is_recent_contact", String.valueOf(contact.getIsRecentContact()));
        linkedHashMap.put("is_chat_list_top5", String.valueOf(contact.getIsRecentTop5Contact()));
        if (z) {
            str13 = "1";
        }
        linkedHashMap.put("is_in_group", str13);
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            str3 = bundle4.getString("enter_from");
        } else {
            str3 = null;
        }
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            str4 = bundle3.getString("enter_method");
        } else {
            str4 = null;
        }
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            str5 = bundle2.getString("panel_source");
        } else {
            str5 = null;
        }
        if (C78685UuP.LJJJZ(str5)) {
            linkedHashMap.put("panel_source", str5);
        }
        if (sharePackage != null) {
            Bundle bundle6 = sharePackage.extras;
            if (bundle6 != null && (string = bundle6.getString("position")) != null) {
                linkedHashMap.put("position", string);
            }
            str6 = sharePackage.itemType;
        } else {
            str6 = null;
        }
        if (o.LJ(str6, "comment")) {
            linkedHashMap.put("enter_from", "comment_panel");
        } else {
            if (sharePackage != null) {
                str7 = sharePackage.itemType;
            } else {
                str7 = null;
            }
            if (o.LJ(str7, "aigc_avatar")) {
                linkedHashMap.put("enter_from", str3);
                linkedHashMap.put("enter_method", str4);
            } else if (o.LJ("publish_share_panel", str3)) {
                linkedHashMap.put("enter_from", str3);
            } else if (o.LJ("download", str4)) {
                linkedHashMap.put("enter_from", "download");
            } else if (o.LJ("chat", str3)) {
                linkedHashMap.put("enter_from", str3);
                linkedHashMap.put("enter_method", str4);
            } else if (str3 == null || str3.length() == 0) {
                linkedHashMap.put("enter_from", "share_panel");
            } else {
                linkedHashMap.put("enter_from", str3);
            }
        }
        Aweme aweme = C107264Iw.LIZ;
        if (aweme != null) {
            linkedHashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                num = Integer.valueOf(imageList.size());
            } else {
                num = null;
            }
            linkedHashMap.put("pic_cnt", String.valueOf(num));
        }
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str8 = bundle.getString("is_private_profile");
        } else {
            str8 = null;
        }
        if (!C107244Iu.LIZIZ(str8)) {
            linkedHashMap.put("is_private_profile", str8);
        }
        if (sharePackage != null) {
            linkedHashMap.put("resource_type", sharePackage.itemType);
            linkedHashMap.put("resource_id", sharePackage.identifier);
            String string2 = sharePackage.extras.getString("aid");
            if (string2 != null) {
                str12 = string2;
            }
            linkedHashMap.put("group_id", str12);
            linkedHashMap.put("author_follow_status", String.valueOf(sharePackage.extras.getInt("follow_status", -1)));
        }
        onEventV3.LIZIZ("share_head_show", linkedHashMap);
        if (sharePackage != null && C107244Iu.LIZ(sharePackage.itemType, "product")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(C107184Io.LJIIIIZZ(sharePackage.extras.getString("product_query_params")));
            Object obj3 = linkedHashMap2.get("author_id");
            if (obj3 instanceof String) {
                str9 = (String) obj3;
            } else {
                str9 = null;
            }
            linkedHashMap2.put("user_type", C107184Io.LJFF(str9));
            linkedHashMap2.put("chat_type", C107184Io.LIZ(contact));
            linkedHashMap2.put("is_recent_contact", Integer.valueOf(contact.getIsRecentContact()));
            linkedHashMap2.put("is_chat_list_top5", Integer.valueOf(contact.getIsRecentTop5Contact()));
            linkedHashMap2.put("rank_index", Integer.valueOf(i));
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
            linkedHashMap2.put("from_user_id", currentUserID);
            linkedHashMap2.put("to_user_id", C107184Io.LIZLLL(contact));
            FMX.LJIILJJIL("tiktokec_share_head_show", C107184Io.LJII(linkedHashMap2));
        }
    }

    public static void LJIIL(SharePackage sharePackage, BaseContent baseContent, int i, Boolean bool, Boolean bool2, int i2) {
        String str;
        boolean z;
        C85323Wm onEventV3 = null;
        if ((i2 & 8) != 0) {
            bool = null;
        }
        if ((i2 & 16) != 0) {
            bool2 = null;
        }
        if ((i2 & 32) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(onEventV3, "onEventV3");
        String LJIIIZ = C106674Gp.LJIIIZ(sharePackage.itemType);
        if (LJIIIZ.length() == 0) {
            return;
        }
        if (baseContent == null) {
            str = "share";
        } else {
            str = "forward";
        }
        C1HQ LIZIZ2 = C48339Iy7.LIZIZ("message_category", LJIIIZ);
        LIZIZ2.put("contact_number", String.valueOf(i));
        LIZIZ2.put("action_type", str);
        String string = sharePackage.extras.getString("enter_method", "");
        o.LJIIIIZZ(string, "sharePackage.extras.getS…ing(Mob.ENTER_METHOD, \"\")");
        LIZIZ2.put("enter_method", string);
        String string2 = sharePackage.extras.getString("enter_from", "");
        o.LJIIIIZZ(string2, "sharePackage.extras.getString(Mob.ENTER_FROM, \"\")");
        LIZIZ2.put("enter_from", string2);
        if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (o.LJ(bool2, Boolean.TRUE)) {
                LIZIZ2.put("version", CardStruct.IStatusCode.DEFAULT);
            } else if (C108514Nr.LIZ()) {
                LIZIZ2.put("version", "3");
            }
        } else if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 2) {
            if (o.LJ(bool, Boolean.TRUE)) {
                LIZIZ2.put("version", "2");
            } else if (o.LJ(bool, Boolean.FALSE)) {
                LIZIZ2.put("version", "1");
            }
        }
        onEventV3.LIZIZ("multi_send_message", LIZIZ2);
    }
}
