package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.widget.multi.RedPoint;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MPk */
/* loaded from: classes10.dex */
public final class C56760MPk {
    public static final java.util.Map<String, String> LIZ(String str) {
        JSONObject jSONObject;
        if (str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                if (o.LJ(key, "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(key));
                    Iterator<String> keys2 = jSONObject2.keys();
                    o.LJIIIIZZ(keys2, "business.keys()");
                    while (keys2.hasNext()) {
                        String businessKey = keys2.next();
                        o.LJIIIIZZ(businessKey, "businessKey");
                        String optString = jSONObject2.optString(businessKey);
                        o.LJIIIIZZ(optString, "business.optString(businessKey)");
                        linkedHashMap.put(businessKey, optString);
                    }
                } else if (!linkedHashMap.containsKey(key)) {
                    o.LJIIIIZZ(key, "key");
                    String optString2 = jSONObject.optString(key);
                    o.LJIIIIZZ(optString2, "json.optString(key)");
                    linkedHashMap.put(key, optString2);
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return linkedHashMap;
    }

    public static final void LIZIZ(EnumC56648MLc location) {
        String str;
        o.LJIIIZ(location, "location");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", "contact");
        linkedHashMap.put("enter_method", "long_press");
        if (location == EnumC56648MLc.TOP) {
            str = "top";
        } else {
            str = "bottom";
        }
        linkedHashMap.put("position", str);
        FMX.LJIIL("authorize_card_close", linkedHashMap);
    }

    public static final void LJ(MusNotice notice) {
        User user;
        JSONObject jSONObject;
        String str;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        o.LJIIIZ(notice, "notice");
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.CLOSE;
        c57362MfG.LJJIIZI("notification_page");
        c57362MfG.LJJLI = EnumC57366MfK.INBOX_NOTICE;
        c57362MfG.LJJJJI();
        String str2 = AX5.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        c57362MfG.LJJJ(str2);
        GeneralTemplateNotice generalTemplateNotice = notice.templateNotice;
        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
            user = (User) ORZ.LJLLLL(list);
        } else {
            user = null;
        }
        c57362MfG.LJJJJIZL(user);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GeneralTemplateNotice generalTemplateNotice2 = notice.templateNotice;
        if (generalTemplateNotice2 != null && (str = generalTemplateNotice2.messageExtra) != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                if (o.LJ(key, "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(key));
                    Iterator<String> keys2 = jSONObject2.keys();
                    o.LJIIIIZZ(keys2, "business.keys()");
                    while (keys2.hasNext()) {
                        String businessKey = keys2.next();
                        o.LJIIIIZZ(businessKey, "businessKey");
                        String optString = jSONObject2.optString(businessKey);
                        o.LJIIIIZZ(optString, "business.optString(businessKey)");
                        linkedHashMap.put(businessKey, optString);
                    }
                } else if (!linkedHashMap.containsKey(key)) {
                    o.LJIIIIZZ(key, "key");
                    String optString2 = jSONObject.optString(key);
                    o.LJIIIIZZ(optString2, "json.optString(key)");
                    linkedHashMap.put(key, optString2);
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        c57362MfG.LIZ(linkedHashMap);
        c57362MfG.LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r4.getFollowerStatus() == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            if (r4 == 0) goto Le
            int r0 = r4.getFollowStatus()
            if (r0 != 0) goto L5b
            int r0 = r4.getFollowerStatus()
            if (r0 != 0) goto L62
        Le:
            java.lang.String r2 = ""
        L10:
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r3.LJIIIZ(r1, r0)
            java.lang.String r0 = "follow_type"
            r3.LJIIIZ(r0, r2)
            r2 = 0
            if (r4 == 0) goto L59
            java.lang.String r1 = r4.getUid()
        L28:
            java.lang.String r0 = "to_user_id"
            r3.LJIIIZ(r0, r1)
            if (r4 == 0) goto L57
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r4.getMatchedFriendStruct()
            if (r0 == 0) goto L57
            java.lang.String r1 = r0.getRecType()
        L39:
            java.lang.String r0 = "rec_type"
            r3.LJIIIZ(r0, r1)
            if (r4 == 0) goto L4a
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r4.getMatchedFriendStruct()
            if (r0 == 0) goto L4a
            java.lang.String r2 = r0.getRelationType()
        L4a:
            java.lang.String r0 = "relation_type"
            r3.LJIIIZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "follow"
            X.FMX.LJIIL(r0, r1)
            return
        L57:
            r1 = r2
            goto L39
        L59:
            r1 = r2
            goto L28
        L5b:
            int r1 = r4.getFollowStatus()
            r0 = 1
            if (r1 != r0) goto L65
        L62:
            java.lang.String r2 = "single"
            goto L10
        L65:
            int r1 = r4.getFollowStatus()
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r2 = "mutual"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56760MPk.LJIIJJI(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static final void LIZJ(String str, EnumC56648MLc location) {
        String str2;
        String str3;
        o.LJIIIZ(location, "location");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("platform", "contact");
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        String str4 = "on";
        if (c77266UUc.LJIILLIIL().LJ()) {
            str2 = "on";
        } else {
            str2 = "unknown";
        }
        linkedHashMap.put("did_status", str2);
        if (!c77266UUc.LJIILLIIL().LIZIZ()) {
            str4 = "off";
        }
        linkedHashMap.put("uid_status", str4);
        if (location == EnumC56648MLc.TOP) {
            str3 = "top";
        } else {
            str3 = "bottom";
        }
        linkedHashMap.put("position", str3);
        FMX.LJIIL(str, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006f A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:2:0x0000, B:7:0x0006, B:9:0x000a, B:11:0x0011, B:13:0x0015, B:19:0x0024, B:21:0x0028, B:26:0x0038, B:28:0x003c, B:30:0x0040, B:32:0x0046, B:33:0x004a, B:36:0x0056, B:38:0x006f, B:39:0x0073, B:42:0x00a7, B:44:0x00bd, B:45:0x00c2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:2:0x0000, B:7:0x0006, B:9:0x000a, B:11:0x0011, B:13:0x0015, B:19:0x0024, B:21:0x0028, B:26:0x0038, B:28:0x003c, B:30:0x0040, B:32:0x0046, B:33:0x004a, B:36:0x0056, B:38:0x006f, B:39:0x0073, B:42:0x00a7, B:44:0x00bd, B:45:0x00c2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(X.C56767MPr r13, int r14) {
        /*
            com.ss.android.ugc.aweme.profile.model.User r9 = r13.LIZ     // Catch: java.lang.Exception -> Lc8
            if (r9 != 0) goto L6
            goto Lcc
        L6:
            com.ss.android.ugc.aweme.notification.bean.RoomInfo r10 = r13.LIZJ     // Catch: java.lang.Exception -> Lc8
            if (r10 == 0) goto Lcc
            long r3 = r10.roomId     // Catch: java.lang.Exception -> Lc8
            com.ss.android.ugc.aweme.notification.bean.LinkMic r7 = r10.linkMic     // Catch: java.lang.Exception -> Lc8
            r6 = 0
            if (r7 == 0) goto L1a
            java.util.List<java.lang.Long> r0 = r7.audienceIdList     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto L1a
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lc8
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r5 = 1
            if (r0 <= 0) goto L22
            r12 = 1
        L1f:
            if (r7 == 0) goto L2d
            goto L24
        L22:
            r12 = 0
            goto L1f
        L24:
            java.util.List<java.lang.Long> r0 = r7.audienceIdList     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto L2d
            int r2 = r0.size()     // Catch: java.lang.Exception -> Lc8
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r0 = 0
            if (r2 <= 0) goto L35
            if (r7 == 0) goto L35
            goto L38
        L35:
            java.lang.String r5 = "anchor"
            goto L56
        L38:
            java.util.List<java.lang.Long> r11 = r7.audienceIdList     // Catch: java.lang.Exception -> Lc8
            if (r11 == 0) goto L35
            com.ss.android.ugc.aweme.profile.model.User r2 = r13.LIZ     // Catch: java.lang.Exception -> Lc8
            if (r2 == 0) goto Lb8
            java.lang.String r2 = r2.getUid()     // Catch: java.lang.Exception -> Lc8
            if (r2 == 0) goto Lb8
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r2)     // Catch: java.lang.Exception -> Lc8
        L4a:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> Lc8
            boolean r2 = r11.contains(r2)     // Catch: java.lang.Exception -> Lc8
            if (r2 != r5) goto L35
            java.lang.String r5 = "guest"
        L56:
            X.7au r2 = new X.7au     // Catch: java.lang.Exception -> Lc8
            r2.<init>()     // Catch: java.lang.Exception -> Lc8
            java.lang.String r8 = "enter_from_merge"
            java.lang.String r7 = "message"
            r2.LJIIIZ(r8, r7)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r8 = "enter_method"
            java.lang.String r7 = "live_cell"
            r2.LJIIIZ(r8, r7)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r8 = "anchor_id"
            java.lang.Long r7 = r10.ownerUserId     // Catch: java.lang.Exception -> Lc8
            if (r7 == 0) goto L73
            long r0 = r7.longValue()     // Catch: java.lang.Exception -> Lc8
        L73:
            r2.LJ(r0, r8)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "click"
            r2.LJIIIZ(r1, r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "room_id"
            r2.LJ(r3, r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r9.getRequestId()     // Catch: java.lang.Exception -> Lc8
            r2.LJIIIZ(r1, r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "follow_status"
            com.ss.android.ugc.aweme.profile.model.User r0 = r13.LIZ     // Catch: java.lang.Exception -> Lc8
            int r0 = X.C54740Le4.LIZIZ(r0)     // Catch: java.lang.Exception -> Lc8
            r2.LIZLLL(r0, r1)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "initial_follow_status"
            com.ss.android.ugc.aweme.profile.model.User r0 = r13.LIZ     // Catch: java.lang.Exception -> Lc8
            int r0 = X.C54740Le4.LIZIZ(r0)     // Catch: java.lang.Exception -> Lc8
            r2.LIZLLL(r0, r1)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "is_guest_connection"
            if (r12 == 0) goto Lb5
            java.lang.String r0 = "1"
        La7:
            r2.LJIIIZ(r1, r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "room_position"
            r2.LIZLLL(r14, r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "is_from_draw_req"
            r2.LIZLLL(r6, r0)     // Catch: java.lang.Exception -> Lc8
            goto Lbb
        Lb5:
            java.lang.String r0 = "0"
            goto La7
        Lb8:
            r7 = 0
            goto L4a
        Lbb:
            if (r12 == 0) goto Lc2
            java.lang.String r0 = "distribution_type"
            r2.LJI(r0, r5)     // Catch: java.lang.Exception -> Lc8
        Lc2:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LIZ     // Catch: java.lang.Exception -> Lc8
            X.C78688UuS.LJJJJZ(r0)     // Catch: java.lang.Exception -> Lc8
            goto Lcc
        Lc8:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56760MPk.LJFF(X.MPr, int):void");
    }

    public static final void LJI(LiveNoticeMessageResponse liveNoticeMessageResponse, long j) {
        int i;
        LiveMessage liveMessage;
        List<CombineLiveNotice> list;
        LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        if (!C62046OWs.LJFF("livesdk_live_request_response", 0.01d)) {
            return;
        }
        C188727au c188727au = new C188727au();
        if (liveNoticeMessageResponse != null && (liveMessage = liveNoticeMessageResponse.liveMessage) != null && (list = liveMessage.liveNotice) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "room_num");
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("enter_from_merge", "message");
        c188727au.LJIIIZ("enter_method", "live_cell");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("request_api", "/aweme/janus/v1/notice/multi/feed/");
        FMX.LJIIL("livesdk_live_request_response", c188727au.LIZ);
    }

    public static final void LIZLLL(BaseNotice notice, BaseResponse baseResponse, Throwable th) {
        o.LJIIIZ(notice, "notice");
        MS5.LIZ(new AqS98S0300000_9(notice, baseResponse, th, 20));
    }

    public static final void LJIIJ(String str, String tabName, String str2) {
        o.LJIIIZ(tabName, "tabName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("to_tab_name", tabName);
        linkedHashMap.put("type", str2);
        FMX.LJIIL("change_notification_tab", linkedHashMap);
    }

    public static final void LJIILIIL(String str, String str2, boolean z) {
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("tab_name", str);
        c188727au.LJIIIZ("notice_type", "all");
        c188727au.LIZLLL(0, "show_cnt");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_recommend_connect", str3);
        if (str2 != null) {
            c188727au.LJI("sort_option_name", str2);
        }
        FMX.LJIIL("click_see_all_activities", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r7.getFollowerStatus() == 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.ss.android.ugc.aweme.profile.model.User r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r7 == 0) goto L13
            int r0 = r7.getFollowStatus()
            if (r0 != 0) goto L8d
            int r0 = r7.getFollowerStatus()
            if (r0 != 0) goto L94
        L13:
            java.lang.String r2 = ""
        L15:
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r3.LJIIIZ(r1, r0)
            java.lang.String r0 = "follow_type"
            r3.LJIIIZ(r0, r2)
            java.lang.String r0 = "scene_type"
            r3.LJIIIZ(r0, r6)
            java.lang.String r0 = "action_type"
            r3.LJIIIZ(r0, r4)
            r2 = 0
            if (r7 == 0) goto L8b
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L8b
            java.lang.String r1 = r0.getRecType()
        L3d:
            java.lang.String r0 = "rec_type"
            r3.LJIIIZ(r0, r1)
            java.lang.String r0 = "enter_method"
            r3.LJIIIZ(r0, r5)
            if (r7 == 0) goto L89
            java.lang.String r1 = r7.getUid()
        L4d:
            java.lang.String r0 = "to_user_id"
            r3.LJIIIZ(r0, r1)
            if (r7 == 0) goto L5e
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L5e
            java.lang.String r2 = r0.getRelationType()
        L5e:
            java.lang.String r0 = "relation_type"
            r3.LJIIIZ(r0, r2)
            if (r8 == 0) goto La3
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L6d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.LJI(r1, r0)
            goto L6d
        L89:
            r1 = r2
            goto L4d
        L8b:
            r1 = r2
            goto L3d
        L8d:
            int r1 = r7.getFollowStatus()
            r0 = 1
            if (r1 != r0) goto L98
        L94:
            java.lang.String r2 = "single"
            goto L15
        L98:
            int r1 = r7.getFollowStatus()
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r2 = "mutual"
            goto L15
        La3:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "follow_recommend"
            X.FMX.LJIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56760MPk.LJIIL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }

    public static final void LJIILJJIL(String str, int i, String messageType, long j, RedPoint redPoint) {
        o.LJIIIZ(messageType, "messageType");
        o.LJIIIZ(redPoint, "redPoint");
        MS5.LIZ(new MND(str, i, messageType, j, redPoint));
    }

    public static /* synthetic */ void LJIIIIZZ(String str, int i, String str2, int i2, String str3, Integer num, String str4, MWH mwh) {
        LJII(str, i, str2, i2, str3, num, null, str4, mwh);
    }

    public static final void LJII(String str, int i, String str2, int i2, String str3, Integer num, String str4, String str5, MWH mwh) {
        HH1.LIZ(str, "accountType", str2, "timeLineType", str3, "nid");
        LJIIIZ(str, i, str2, i2, str3, num, str4, str5, null, null, mwh, 512);
    }

    public static void LJIIIZ(String accountType, int i, String timeLineType, int i2, String nid, Integer num, String str, String str2, User user, Long l, MWH mwh, int i3) {
        if ((i3 & 64) != 0) {
            str = null;
        }
        if ((i3 & 128) != 0) {
            str2 = null;
        }
        if ((i3 & 256) != 0) {
            user = null;
        }
        if ((i3 & 512) != 0) {
            l = null;
        }
        if ((i3 & 1024) != 0) {
            mwh = null;
        }
        o.LJIIIZ(accountType, "accountType");
        o.LJIIIZ(timeLineType, "timeLineType");
        o.LJIIIZ(nid, "nid");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", accountType);
        c188727au.LJIIIZ("client_order", String.valueOf(i));
        c188727au.LJIIIZ("tab_name", MDT.LIZIZ(Integer.valueOf(i2)));
        c188727au.LJIIIZ("timeline", timeLineType);
        c188727au.LJIIIZ("content_id", nid);
        c188727au.LJIIIZ("template_id", str2);
        c188727au.LJIIIZ("scene_id", "1002");
        c188727au.LJFF(l, "message_time");
        if (user != null) {
            c188727au.LJI("follow_status_to_user", C56923MVr.LIZLLL(user));
        }
        if (str != null && str.length() > 0) {
            c188727au.LJI("button_type", str);
        }
        if (num != null) {
            int intValue = num.intValue();
            if (Integer.valueOf(intValue) != null && intValue != -1) {
                c188727au.LJI("is_read", String.valueOf(num.intValue()));
            }
        }
        String str3 = AX5.LIZ;
        if (str3 != null) {
            c188727au.LJI("position", str3);
        }
        if (mwh != null) {
            C78886Uxe.LIZIZ(c188727au, mwh);
        }
        FMX.LJIIL("notification_message_inner_message", c188727au.LIZ);
    }
}
