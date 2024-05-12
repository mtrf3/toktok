package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Xx6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86496Xx6 {
    public static final /* synthetic */ int LIZ = 0;

    public static Aweme LIZ() {
        String str;
        Aweme aweme;
        String LJFF = C12460eI.LJFF();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && LJFF != null) {
            if (s.LJJJLZIJ(LJFF, "b2878", false)) {
                Intent intent = LJIIIIZZ.getIntent();
                if (intent != null) {
                    str = C16880lQ.LLJJIJIIJIL(intent, "id");
                }
            } else if (s.LJJJLZIJ(LJFF, "b2001", false) && (aweme = C3SZ.LIZ((ActivityC45651qj) LJIIIIZZ).LJLJLLL) != null) {
                str = aweme.getAid();
            }
            return AwemeService.LIZ().i6(str);
        }
        str = null;
        return AwemeService.LIZ().i6(str);
    }

    public static String LIZJ() {
        ComponentCallbacks2 LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof InterfaceC55058LjC) {
            String enterFrom = ((InterfaceC55058LjC) LJIIIIZZ).getEnterFrom();
            o.LJI(enterFrom);
            return enterFrom;
        }
        if (LJIIIIZZ instanceof InterfaceC27853AwT) {
            return ((InterfaceC27853AwT) LJIIIIZZ).getPageName();
        }
        if (LJIIIIZZ instanceof KMV) {
            InterfaceC36571c5 rootFragment = ((KMV) LJIIIIZZ).getRootFragment();
            if (rootFragment instanceof InterfaceC27853AwT) {
                return ((InterfaceC27853AwT) rootFragment).getPageName();
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r1) {
        /*
            int r1 = r1.getType()
            r0 = 32
            if (r1 == r0) goto L30
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r1 == r0) goto L30
            switch(r1) {
                case 1: goto L2d;
                case 2: goto L2d;
                case 3: goto L2d;
                case 4: goto L2d;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 22: goto L2a;
                case 23: goto L27;
                case 24: goto L2a;
                case 25: goto L2d;
                case 26: goto L2d;
                case 27: goto L30;
                default: goto L12;
            }
        L12:
            switch(r1) {
                case 100: goto L24;
                case 101: goto L21;
                case 102: goto L2a;
                default: goto L15;
            }
        L15:
            switch(r1) {
                case 1000: goto L1e;
                case 1001: goto L1b;
                case 1002: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.String r0 = ""
        L1a:
            return r0
        L1b:
            java.lang.String r0 = "Product"
            goto L1a
        L1e:
            java.lang.String r0 = "Creator_tool"
            goto L1a
        L21:
            java.lang.String r0 = "PnS"
            goto L1a
        L24:
            java.lang.String r0 = "Monetization"
            goto L1a
        L27:
            java.lang.String r0 = "UG"
            goto L1a
        L2a:
            java.lang.String r0 = "Live"
            goto L1a
        L2d:
            java.lang.String r0 = "Social"
            goto L1a
        L30:
            java.lang.String r0 = "DM"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86496Xx6.LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):java.lang.String");
    }

    public static String LIZLLL(InnerPushMessage innerPushMessage) {
        if (innerPushMessage.getFrom() == EnumC86508XxI.FROM_LOCAL) {
            String label = innerPushMessage.getLabel();
            if (label == null) {
                return "";
            }
            return label;
        }
        int type = innerPushMessage.getType();
        if (type != 22) {
            if (type != 27) {
                if (type != 32) {
                    if (type != 24) {
                        if (type != 25) {
                            switch (type) {
                                case 1:
                                    return "SOCIAL_INAPP_PUSH_LIKE_VIDEO";
                                case 2:
                                    return "SOCIAL_INAPP_PUSH_LIKE_STORY";
                                case 3:
                                    return "SOCIAL_INAPP_PUSH_COMMENT";
                                case 4:
                                    return "SOCIAL_INAPP_PUSH_COMMENT_REPLY";
                                case 5:
                                    return "SOCIAL_INAPP_PUSH_MENTION_IN_VIDEO";
                                case 6:
                                    return "SOCIAL_INAPP_PUSH_MENTION_IN_COMMENT";
                                case 7:
                                    return "SOCIAL_INAPP_PUSH_DUET_WITH_ME";
                                case 8:
                                    return "SOCIAL_INAPP_PUSH_FOLLOW_USER";
                                case 9:
                                    return "SOCIAL_INAPP_PUSH_FOLLOW_REQUEST";
                                case 10:
                                    return "SOCIAL_INAPP_PUSH_FOLLOW_ACCEPT_REQUEST";
                                default:
                                    return "";
                            }
                        }
                        return "now_post";
                    }
                    return "live_encourage";
                }
                return "dm_permissions_receiver_open";
            }
            return "inner_im_active_status";
        }
        return "live";
    }

    public static String LJFF(InnerPushMessage innerPushMessage) {
        String globalSchemaUrl;
        String label = innerPushMessage.getLabel();
        if (label != null && label.length() > 0) {
            return label;
        }
        int type = innerPushMessage.getType();
        if (type == 22) {
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null && (globalSchemaUrl = uiTemplate.getGlobalSchemaUrl()) != null) {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(globalSchemaUrl), "gd_label");
                if (queryParameter != null) {
                    return queryParameter;
                }
                return "unknown";
            }
        } else {
            switch (type) {
                case 1:
                case 2:
                    return "click_push_digg";
                case 3:
                    return "click_push_comment";
                case 4:
                    return "click_push_replycomment";
                case 5:
                    return "click_push_videoat";
                case 6:
                    return "click_push_commentat";
                case 7:
                    return "click_push_duet";
                case 8:
                    return "click_push_follow";
                case 9:
                    return "click_push_follow_request";
                case 10:
                    return "click_push_follow_approve";
            }
        }
        return "";
    }

    public static void LJIIJ(InnerPushMessage msg) {
        String str;
        o.LJIIIZ(msg, "msg");
        try {
            JSONObject jSONObject = new JSONObject();
            if (msg.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(msg.getRid()));
            }
            EnumC86508XxI enumC86508XxI = msg.getTracker().LIZ;
            if (enumC86508XxI != null) {
                str = enumC86508XxI.getValue();
            } else {
                str = null;
            }
            jSONObject.put("push_from", str);
            jSONObject.put("push_type", msg.getType());
            jSONObject.put("push_id", String.valueOf(msg.getId()));
            jSONObject.put("push_label", LJFF(msg));
            jSONObject.put("business_tag", LIZIZ(msg));
            String mobEventJsonStr = msg.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJ(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LIZLLL(msg));
            }
            FMX.LJIILJJIL("inner_push_receive", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJIIJJI(InnerPushMessage msg) {
        String str;
        String str2;
        String str3;
        String str4;
        User user;
        List<User> fromUsers;
        o.LJIIIZ(msg, "msg");
        if (ORY.LJJIJ(msg.getType(), C86485Xwv.LIZ)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Aweme LIZ2 = LIZ();
            jSONObject.put("enter_from", LIZJ());
            String str5 = null;
            if (LIZ2 != null) {
                str = LIZ2.getAuthorUid();
            } else {
                str = null;
            }
            jSONObject.put("author_id", str);
            if (LIZ2 != null) {
                str2 = LIZ2.getGroupId();
            } else {
                str2 = null;
            }
            jSONObject.put("group_id", str2);
            jSONObject.put("push_label", LJFF(msg));
            EnumC86508XxI enumC86508XxI = msg.getTracker().LIZ;
            if (enumC86508XxI != null) {
                str3 = enumC86508XxI.getValue();
            } else {
                str3 = null;
            }
            jSONObject.put("push_from", str3);
            jSONObject.put("business_tag", LIZIZ(msg));
            if (msg.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(msg.getRid()));
            }
            jSONObject.put("receive_interval", msg.getTracker().LJIILIIL);
            jSONObject.put("show_interval", msg.getTracker().LJIILJJIL);
            if (msg.getType() == 1004) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", str4);
            InnerPushUITemplate uiTemplate = msg.getUiTemplate();
            if (uiTemplate != null) {
                List<User> fromUsers2 = uiTemplate.getFromUsers();
                if (fromUsers2 != null && !fromUsers2.isEmpty()) {
                    InnerPushUITemplate uiTemplate2 = msg.getUiTemplate();
                    if (uiTemplate2 != null && (fromUsers = uiTemplate2.getFromUsers()) != null) {
                        user = (User) ListProtector.get(fromUsers, 0);
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str5 = user.getUid();
                    }
                    jSONObject.put("from_user_id", str5);
                }
            }
            String mobEventJsonStr = msg.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJ(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LIZLLL(msg));
            }
            FMX.LJIILJJIL("inner_push_show", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.optString(next));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJI(InnerPushMessage innerPushMessage, String actionType) {
        String str;
        String str2;
        String str3;
        String str4;
        User user;
        List<User> fromUsers;
        o.LJIIIZ(actionType, "actionType");
        if (ORY.LJJIJ(innerPushMessage.getType(), C86485Xwv.LIZ)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Aweme LIZ2 = LIZ();
            jSONObject.put("enter_from", LIZJ());
            String str5 = null;
            if (LIZ2 != null) {
                str = LIZ2.getAid();
            } else {
                str = null;
            }
            jSONObject.put("author_id", str);
            if (LIZ2 != null) {
                str2 = LIZ2.getGroupId();
            } else {
                str2 = null;
            }
            jSONObject.put("group_id", str2);
            jSONObject.put("push_label", LJFF(innerPushMessage));
            jSONObject.put("business_tag", LIZIZ(innerPushMessage));
            jSONObject.put("action_type", actionType);
            if (innerPushMessage.getType() == 1004) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", str3);
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            EnumC86508XxI enumC86508XxI = innerPushMessage.getTracker().LIZ;
            if (enumC86508XxI != null) {
                str4 = enumC86508XxI.getValue();
            } else {
                str4 = null;
            }
            jSONObject.put("push_from", str4);
            jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIILIIL);
            jSONObject.put("show_interval", innerPushMessage.getTracker().LJIILJJIL);
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                List<User> fromUsers2 = uiTemplate.getFromUsers();
                if (fromUsers2 != null && !fromUsers2.isEmpty()) {
                    InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                    if (uiTemplate2 != null && (fromUsers = uiTemplate2.getFromUsers()) != null) {
                        user = (User) ListProtector.get(fromUsers, 0);
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str5 = user.getUid();
                    }
                    jSONObject.put("from_user_id", str5);
                }
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJ(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LIZLLL(innerPushMessage));
            }
            FMX.LJIILJJIL("inner_push_click", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJII(InnerPushMessage innerPushMessage, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        User user;
        List<User> fromUsers;
        if (ORY.LJJIJ(innerPushMessage.getType(), C86485Xwv.LIZ)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Aweme LIZ2 = LIZ();
            jSONObject.put("enter_from", LIZJ());
            String str7 = null;
            if (LIZ2 != null) {
                str = LIZ2.getAid();
            } else {
                str = null;
            }
            jSONObject.put("author_id", str);
            if (LIZ2 != null) {
                str2 = LIZ2.getGroupId();
            } else {
                str2 = null;
            }
            jSONObject.put("group_id", str2);
            jSONObject.put("push_label", LJFF(innerPushMessage));
            jSONObject.put("business_tag", LIZIZ(innerPushMessage));
            EnumC86508XxI enumC86508XxI = innerPushMessage.getTracker().LIZ;
            if (enumC86508XxI != null) {
                str3 = enumC86508XxI.getValue();
            } else {
                str3 = null;
            }
            jSONObject.put("push_from", str3);
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIILIIL);
            jSONObject.put("show_interval", innerPushMessage.getTracker().LJIILJJIL);
            if (innerPushMessage.getType() == 1004) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", str4);
            if (z) {
                str5 = "slide_up";
            } else {
                str5 = "auto";
            }
            jSONObject.put("action_type", str5);
            if (C54838Lfe.LJJI(LIZ2)) {
                str6 = "story";
            } else {
                str6 = "post";
            }
            jSONObject.put("story_type", str6);
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                List<User> fromUsers2 = uiTemplate.getFromUsers();
                if (fromUsers2 != null && !fromUsers2.isEmpty()) {
                    InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                    if (uiTemplate2 != null && (fromUsers = uiTemplate2.getFromUsers()) != null) {
                        user = (User) ListProtector.get(fromUsers, 0);
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str7 = user.getUid();
                    }
                    jSONObject.put("from_user_id", str7);
                }
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJ(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LIZLLL(innerPushMessage));
            }
            FMX.LJIILJJIL("inner_push_disappear", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJIIL(InnerPushMessage innerPushMessage, EnumC86511XxL status) {
        Object LIZ2;
        String str;
        o.LJIIIZ(status, "status");
        JSONObject jSONObject = new JSONObject();
        if (innerPushMessage != null) {
            try {
                jSONObject.put("push_id", String.valueOf(innerPushMessage.getId()));
                if (innerPushMessage.getRid() > 0) {
                    jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
                }
                jSONObject.put("push_type", innerPushMessage.getType());
                EnumC86508XxI enumC86508XxI = innerPushMessage.getTracker().LIZ;
                if (enumC86508XxI != null) {
                    str = enumC86508XxI.getValue();
                } else {
                    str = null;
                }
                jSONObject.put("push_from", str);
                jSONObject.put("push_label", LJFF(innerPushMessage));
                jSONObject.put("business_tag", LIZIZ(innerPushMessage));
                jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIILIIL);
                jSONObject.put("show_interval", innerPushMessage.getTracker().LJIILJJIL);
                jSONObject.put("client_interval", innerPushMessage.getTracker().LJIILL);
                jSONObject.put("queue_interval", innerPushMessage.getTracker().LJIJ);
                jSONObject.put("has_waited", innerPushMessage.getHasAvoidanceWaited());
                jSONObject.put("display_duration", innerPushMessage.getTracker().LIZLLL);
                jSONObject.put("preloaded", innerPushMessage.getTracker().LJ);
                jSONObject.put("preloaded_loop_times", innerPushMessage.getTracker().LJJIL);
                jSONObject.put("preload_api_duration", innerPushMessage.getTracker().LJI);
                jSONObject.put("preloaded_xml", innerPushMessage.getTracker().LJJJ);
                jSONObject.put("preloaded_pic", innerPushMessage.getTracker().LJJJI);
                jSONObject.put("preloaded_xml_loop_times", innerPushMessage.getTracker().LJJIZ);
                jSONObject.put("block_background_duration", innerPushMessage.getTracker().LJJIIJZLJL);
                jSONObject.put("block_live_duration", innerPushMessage.getTracker().LJJIIZ);
                jSONObject.put("block_shooting_duration", innerPushMessage.getTracker().LJJIIZI);
                jSONObject.put("block_album_duration", innerPushMessage.getTracker().LJJIJ);
                jSONObject.put("block_keyboard_duration", innerPushMessage.getTracker().LJJIJIIJI);
                jSONObject.put("block_commercead_duration", innerPushMessage.getTracker().LJJIJIIJIL);
                jSONObject.put("block_popup_duration", innerPushMessage.getTracker().LJJIJIL);
                jSONObject.put("block_external_handler_duration", innerPushMessage.getTracker().LJJIJL);
                LIZ2 = jSONObject.put("block_by_orientation", innerPushMessage.getTracker().LJJIJLIJ);
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            C3C5.m6boximpl(LIZ2);
        }
        jSONObject.put("status", status.getValue());
        FMX.LJIILJJIL("inner_push_tracker", jSONObject);
    }

    public static void LJIIIIZZ(InnerPushMessage innerPushMessage, String str, String str2) {
        String str3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mobInnerPushErrorMsg msg:");
        LIZ2.append(innerPushMessage);
        LIZ2.append(" scene:");
        LIZ2.append(str);
        LIZ2.append(" error:");
        LIZ2.append(str2);
        LIZ2.append(' ');
        C86478Xwo.LIZIZ("inner_push", X1D.LIZIZ(LIZ2));
        JSONObject jSONObject = new JSONObject();
        if (innerPushMessage != null) {
            jSONObject.put("push_id", innerPushMessage.getId());
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            jSONObject.put("push_type", innerPushMessage.getType());
            EnumC86508XxI enumC86508XxI = innerPushMessage.getTracker().LIZ;
            if (enumC86508XxI != null) {
                str3 = enumC86508XxI.getValue();
            } else {
                str3 = null;
            }
            jSONObject.put("push_from", str3);
        }
        jSONObject.put(WM7.SCENE_SERVICE, str);
        jSONObject.put("error_msg", str2);
        FMX.LJIILJJIL("inner_push_error", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(java.lang.String r5, long r6, java.lang.Throwable r8, com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse r9) {
        /*
            java.lang.String r1 = "in_app_push_get_v1"
            java.lang.String r0 = "path"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "scenario"
            java.lang.String r4 = ""
            if (r5 != 0) goto L13
            r5 = r4
        L13:
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "duration"
            r2.put(r0, r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "success"
            r3 = 0
            if (r8 == 0) goto L22
            r0 = 0
            goto L23
        L22:
            r0 = 1
        L23:
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "response"
            if (r9 == 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage> r0 = r9.messages     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L32
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L64
        L32:
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "log_id"
            if (r9 == 0) goto L40
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r9.extra     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.logid     // Catch: java.lang.Throwable -> L64
            goto L58
        L40:
            boolean r0 = r8 instanceof X.C38333F2r     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5c
            X.F2r r8 = (X.C38333F2r) r8     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r8.getRawResponse()     // Catch: java.lang.Throwable -> L64
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.api.BaseResponse     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L5c
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r1.extra     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.logid     // Catch: java.lang.Throwable -> L64
        L58:
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r0
        L5c:
            org.json.JSONObject r0 = r2.put(r3, r4)     // Catch: java.lang.Throwable -> L64
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L64
            goto L6c
        L64:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L6c:
            java.lang.String r0 = "inner_push_api"
            X.FMX.LJIILJJIL(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86496Xx6.LJIIIZ(java.lang.String, long, java.lang.Throwable, com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse):void");
    }
}
