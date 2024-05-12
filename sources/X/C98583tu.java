package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.3tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98583tu {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(int i) {
        return i != 1 ? i != 3 ? i != 5 ? "private" : "tikbot" : "group" : "stranger";
    }

    public static String LIZJ(C99033ud c99033ud) {
        int i;
        C98523to c98523to;
        if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && c98523to.isTCM()) {
            return "tcm";
        }
        if (c99033ud != null) {
            i = c99033ud.getChatType();
        } else {
            i = -1;
        }
        return LIZIZ(i);
    }

    public static void LJ(C99033ud c99033ud, long j, String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("leave_chat", C113554cx.LJJL(new OSZ("conversation_id", c99033ud.getConversationId()), new OSZ("chat_type", LIZJ(c99033ud)), new OSZ("enter_method", str), new OSZ("duration", String.valueOf(j))));
    }

    public static void LIZ(C98593tv params, int i, AbstractC90763hI conversationModel, int i2) {
        String processId;
        C4WC conversationListModel;
        C85323Wm onEventV3;
        boolean z;
        XIA dispatcher;
        int i3 = i;
        if ((i2 & 2) != 0) {
            processId = C3Y4.LIZ();
        } else {
            processId = null;
        }
        if ((i2 & 4) != 0) {
            i3 = -1;
        }
        if ((i2 & 8) != 0) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            conversationListModel = C4WC.LIZIZ;
        } else {
            conversationListModel = null;
        }
        if ((i2 & 32) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        if ((i2 & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 128) != 0) {
            dispatcher = C78613UtF.LIZJ;
        } else {
            dispatcher = null;
        }
        o.LJIIIZ(params, "params");
        o.LJIIIZ(processId, "processId");
        o.LJIIIZ(conversationListModel, "conversationListModel");
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(onEventV3, "onEventV3");
        o.LJIIIZ(dispatcher, "dispatcher");
        C1HQ c1hq = new C1HQ();
        String groupId = params.getGroupId();
        String str = "";
        if (groupId == null) {
            groupId = "";
        }
        c1hq.put("group_id", groupId);
        c1hq.put("follow_status", String.valueOf(params.getFollowStatus()));
        String storyType = params.getStoryType();
        if (storyType == null) {
            storyType = "";
        }
        c1hq.put("story_type", storyType);
        String storyCollectionId = params.getStoryCollectionId();
        if (storyCollectionId != null) {
            str = storyCollectionId;
        }
        c1hq.put("story_collection_id", str);
        c1hq.put("active_status", String.valueOf(params.getActivityStatus().getValue()));
        XKX.LIZLLL(C48841JEv.LIZ(dispatcher), null, null, new C784035w(params, i3, processId, c1hq, conversationListModel, conversationModel, onEventV3, z, null), 3);
    }

    public static void LJI(int i, String str, boolean z, boolean z2) {
        Object obj;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "conversationId", "onEventV3");
        C1HQ c1hq = new C1HQ();
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_initial_load", obj);
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("contains_duplicate", str2);
        c1hq.put("aweme_list_size", String.valueOf(i));
        c1hq.put("conversation_id", str);
        LIZJ.LIZIZ("dm_filter_aweme", c1hq);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r13 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r13.isReportPage() != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r2.put("conversation_id", r5);
        r5 = LIZJ(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, "group") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r15 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r1 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r2.put("using_new_logger", r1);
        r2.put("to_user_id", r8);
        r2.put("chat_type", r5);
        r2.put("enter_method", r7);
        r2.put("enter_from", r6);
        r2.put("msg_list_size", java.lang.String.valueOf(r14));
        r2.put("is_report_page", java.lang.String.valueOf(r10));
        r2.put("process_id", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r9 = java.lang.Integer.valueOf(r13.getUnreadCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2.put("unread_cnt", java.lang.String.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r15 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        r3.LIZIZ("enter_chat_performance_v2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        r3.LIZIZ("enter_chat_performance", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r1 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r13 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        r0 = r13.getSingleChatFromUserId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0043, code lost:
    
        r7 = r13.getEnterMethod();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        if (r13 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(long r11, X.C99033ud r13, int r14, boolean r15, int r16) {
        /*
            r0 = r16 & 8
            r10 = 0
            if (r0 == 0) goto L6
            r15 = 0
        L6:
            r0 = r16 & 16
            r9 = 0
            if (r0 == 0) goto Lcb
            java.lang.String r4 = X.C3Y4.LIZJ
        Ld:
            r0 = r16 & 32
            if (r0 == 0) goto Lc8
            X.3Wm r3 = X.C772831o.LIZ()
        L15:
            java.lang.String r0 = "processId"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "onEventV3"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.1HQ r2 = new X.1HQ
            r2.<init>()
            java.lang.String r1 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r2.put(r1, r0)
            java.lang.String r8 = ""
            if (r13 == 0) goto L37
            java.lang.String r5 = r13.getConversationId()
            if (r5 != 0) goto L3a
        L37:
            r5 = r8
            if (r13 == 0) goto L40
        L3a:
            java.lang.String r6 = r13.getEnterFromForMob()
            if (r6 != 0) goto L43
        L40:
            r6 = r8
            if (r13 == 0) goto L49
        L43:
            java.lang.String r7 = r13.getEnterMethod()
            if (r7 != 0) goto L4c
        L49:
            r7 = r8
            if (r13 == 0) goto L54
        L4c:
            boolean r1 = r13.isReportPage()
            r0 = 1
            if (r1 != r0) goto L54
            r10 = 1
        L54:
            java.lang.String r0 = "conversation_id"
            r2.put(r0, r5)
            java.lang.String r5 = LIZJ(r13)
            java.lang.String r0 = "group"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto Lbd
        L65:
            if (r15 == 0) goto Lba
            java.lang.String r1 = "1"
        L69:
            java.lang.String r0 = "using_new_logger"
            r2.put(r0, r1)
            java.lang.String r0 = "to_user_id"
            r2.put(r0, r8)
            java.lang.String r0 = "chat_type"
            r2.put(r0, r5)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r7)
            java.lang.String r0 = "enter_from"
            r2.put(r0, r6)
            java.lang.String r1 = "msg_list_size"
            java.lang.String r0 = java.lang.String.valueOf(r14)
            r2.put(r1, r0)
            java.lang.String r1 = "is_report_page"
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r2.put(r1, r0)
            java.lang.String r0 = "process_id"
            r2.put(r0, r4)
            if (r13 == 0) goto La3
            int r0 = r13.getUnreadCount()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        La3:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "unread_cnt"
            r2.put(r0, r1)
            if (r15 == 0) goto Lb4
            java.lang.String r0 = "enter_chat_performance_v2"
            r3.LIZIZ(r0, r2)
        Lb3:
            return
        Lb4:
            java.lang.String r0 = "enter_chat_performance"
            r3.LIZIZ(r0, r2)
            goto Lb3
        Lba:
            java.lang.String r1 = "0"
            goto L69
        Lbd:
            if (r13 == 0) goto L65
            java.lang.String r0 = r13.getSingleChatFromUserId()
            if (r0 != 0) goto Lc6
            goto L65
        Lc6:
            r8 = r0
            goto L65
        Lc8:
            r3 = r9
            goto L15
        Lcb:
            r4 = r9
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98583tu.LJFF(long, X.3ud, int, boolean, int):void");
    }

    public static void LIZLLL(C98593tv c98593tv, int i, String str, java.util.Map map, C3Q9 c3q9, AbstractC90763hI abstractC90763hI, InterfaceC75532xp interfaceC75532xp, boolean z) {
        String LIZIZ;
        String userId;
        Object obj;
        String str2;
        String str3;
        boolean z2;
        int i2;
        Integer M;
        int i3;
        String sessionId = c98593tv.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        String enterFromForMob = c98593tv.getEnterFromForMob();
        if (enterFromForMob == null) {
            enterFromForMob = "";
        }
        String enterMethodForMob = c98593tv.getEnterMethodForMob();
        if (enterMethodForMob == null) {
            enterMethodForMob = "";
        }
        String enterFromSubPage = c98593tv.getEnterFromSubPage();
        String buttonType = c98593tv.getButtonType();
        String previousPage = c98593tv.getPreviousPage();
        String searchId = c98593tv.getSearchId();
        Integer isSearchScene = c98593tv.isSearchScene();
        String searchType = c98593tv.getSearchType();
        String searchResultId = c98593tv.getSearchResultId();
        String lastVideoPlayDuration = c98593tv.getLastVideoPlayDuration();
        String recType = c98593tv.getRecType();
        String toUserType = c98593tv.getToUserType();
        if (toUserType == null) {
            toUserType = "";
        }
        map.put("conversation_id", sessionId);
        if (c98593tv.isTCM()) {
            LIZIZ = "tcm";
        } else {
            LIZIZ = LIZIZ(c98593tv.getChatType());
        }
        if (o.LJ(LIZIZ, "group") || (userId = c98593tv.getUserId()) == null) {
            userId = "";
        }
        map.put("to_user_id", userId);
        map.put("chat_type", LIZIZ);
        map.put("enter_method", enterMethodForMob);
        map.put("enter_from", enterFromForMob);
        map.put("to_user_type", toUserType);
        String str4 = "1";
        if (c98593tv.isRecommendedChat()) {
            obj = "1";
        } else {
            obj = "1";
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_recommended_chat", str4);
        if (!c98593tv.getHasCameraIcon()) {
            str2 = "";
        } else {
            str2 = "camera";
        }
        map.put("has_icon", str2);
        if (z) {
            Iterator<InterfaceC98683u4> it = C98693u5.LJ.iterator();
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                InterfaceC98683u4 next = it.next();
                if (next.LJLIIIL()) {
                    if (o.LJ(next.getSessionId(), sessionId)) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                }
            }
            if (z3) {
                i3 = 1;
            } else if (z4) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            map.put("while_typing", String.valueOf(i3));
        }
        if (enterFromSubPage != null) {
            map.put("sub_page", enterFromSubPage);
        }
        if (buttonType != null) {
            map.put("button_type", buttonType);
        }
        if (previousPage != null) {
            map.put("previous_page", previousPage);
        }
        if (searchId != null) {
            map.put("search_id", searchId);
        }
        if (searchType != null) {
            map.put("search_type", searchType);
        }
        if (isSearchScene != null) {
            map.put("is_search_scene", String.valueOf(isSearchScene.intValue()));
        }
        if (searchResultId != null) {
            map.put("search_result_id", searchResultId);
        }
        if (lastVideoPlayDuration != null) {
            map.put("last_feed_duration", lastVideoPlayDuration);
        }
        map.put("process_id", str);
        if (recType != null) {
            map.put("rec_type", recType);
        }
        String sectionType = c98593tv.getSectionType();
        if (sectionType != null) {
            map.put("section_type", sectionType);
        }
        map.put("relation_tag", String.valueOf(i));
        C63120Opw LIZ2 = c3q9.LIZ(sessionId);
        if (LIZIZ == "group") {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            LIZ3.append(C84283Sm.LJIIIIZZ(LIZ2) ? 1 : 0);
            map.put("is_master", X1D.LIZIZ(LIZ3));
        }
        C3Y4.LJ("enter_from", enterFromForMob);
        C3Y4.LJ("enter_method", enterMethodForMob);
        C3Y4.LJ("search_id", searchId);
        C3Y4.LJ("relation_tag", String.valueOf(i));
        Object obj2 = obj;
        if (!c98593tv.isStickyTop()) {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_top", obj2);
        map.put("unread_cnt", String.valueOf(c98593tv.getUnreadCount()));
        AbstractC82843My unreadViewState = c98593tv.getUnreadViewState();
        if (unreadViewState instanceof C82493Lp) {
            str3 = "number_dot";
        } else if (unreadViewState instanceof C82483Lo) {
            str3 = "yellow_dot";
        } else {
            str3 = "report_null";
        }
        map.put("notice_type", str3);
        if (C55888Lwa.LIZIZ.LJJI(true)) {
            String str5 = "primary";
            if (LIZ2 != null) {
                if (LIZ2.isStranger()) {
                    str5 = "request";
                } else if (!u.LJJII(LIZ2)) {
                    str5 = "secondary";
                }
            }
            map.put("tab_name", str5);
        }
        map.putAll(c98593tv.getExtraMobParams());
        C792239a LJI = abstractC90763hI.LJI();
        java.util.Map<Boolean, String> map2 = C98033t1.LIZ;
        if (C78685UuP.LJJJZ(LJI.LIZ) || LJI.LIZIZ != null || C1GE.LJIILIIL(LJI.LIZJ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str6 = map2.get(Boolean.valueOf(z2));
        if (str6 != null) {
            map.put("if_draft", str6);
        }
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null) {
            i2 = M.intValue();
        } else {
            i2 = -1;
        }
        map.put("sender_permission", String.valueOf(i2));
        interfaceC75532xp.LIZIZ("enter_chat", map);
    }
}
