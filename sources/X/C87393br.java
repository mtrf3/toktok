package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87393br implements C32U {
    public static final C87393br LIZ = new C87393br();
    public static final ConcurrentHashMap<String, InterfaceC84703Uc> LIZIZ = new ConcurrentHashMap<>();

    public static void LJIIJ() {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("enter_method", "click");
        onEventV3.LIZIZ("click_dm_sticker_panel", c1hq);
    }

    public static Long LJFF(String key) {
        o.LJIIIZ(key, "key");
        ConcurrentHashMap<String, InterfaceC84703Uc> concurrentHashMap = LIZIZ;
        InterfaceC84703Uc interfaceC84703Uc = concurrentHashMap.get(key);
        if (interfaceC84703Uc == null || !interfaceC84703Uc.isRunning()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopwatch ");
            LIZ2.append(key);
            LIZ2.append(" has already stopped.");
            C34B.LJIIIIZZ("StickerStoreAnalytics", X1D.LIZIZ(LIZ2));
            return null;
        }
        interfaceC84703Uc.stop();
        long LIZ3 = interfaceC84703Uc.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("reported duration for ");
        LIZ4.append(key);
        C34B.LIZIZ("StickerStoreAnalytics", X1D.LIZIZ(LIZ4));
        concurrentHashMap.remove(key);
        return Long.valueOf(LIZ3);
    }

    public static void LJI(String key) {
        InterfaceC84703Uc interfaceC84703Uc;
        o.LJIIIZ(key, "key");
        ConcurrentHashMap<String, InterfaceC84703Uc> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(key) != null && (interfaceC84703Uc = concurrentHashMap.get(key)) != null && interfaceC84703Uc.isRunning()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopwatch ");
            LIZ2.append(key);
            LIZ2.append(" has already started.");
            C34B.LJIIIIZZ("StickerStoreAnalytics", X1D.LIZIZ(LIZ2));
            return;
        }
        C98313tT c98313tT = new C98313tT(0);
        c98313tT.start();
        concurrentHashMap.put(key, c98313tT);
    }

    public static void LJIIIIZZ(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("tab", str);
        onEventV3.LIZIZ("show_video_selection_panel", c1hq);
    }

    public static void LJIIJJI(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "store_sticker_set_page");
        c1hq.put("status", str);
        onEventV3.LIZIZ("click_filter_sticker_set", c1hq);
    }

    public static void LJIIZILJ(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", str);
        c1hq.put("enter_method", "click_use_sticker_button");
        onEventV3.LIZIZ("enter_chat", c1hq);
    }

    public static void LJJII(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "complete_video_sticker_page");
        c1hq.put("action", str);
        onEventV3.LIZIZ("share_video_sticker_action", c1hq);
    }

    public static void LJIIL(String str, String str2) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("sticker_set_id", str);
        c1hq.put("enter_from", str2);
        onEventV3.LIZIZ("click_use_sticker_set", c1hq);
    }

    public static void LJIILL(String str, String str2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", "personal_homepage", "enter_method", "long_press");
        LIZ3.put("video_sticker_id", str);
        LIZ3.put("action", str2);
        LIZ2.LIZIZ("delete_video_sticker", LIZ3);
    }

    public static void LJIILLIIL(String str, boolean z) {
        String str2;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", "create_video_sticker", "action_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_success", str2);
        LIZ2.LIZIZ("edit_video_sticker_keyword", LIZ3);
    }

    public static void LJIJJ(String str, String str2) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", str);
        c1hq.put("enter_method", str2);
        onEventV3.LIZIZ("enter_sticker_store", c1hq);
    }

    public static void LJIJJLI(Long l, String str) {
        String str2;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        if (l != null) {
            str2 = l.toString();
        } else {
            str2 = null;
        }
        LIZ3.put("duration", str2);
        LIZ3.put("exit_method", str);
        LIZ2.LIZIZ("exit_sticker_store", LIZ3);
    }

    public static void LJIJI(String str, String str2, boolean z) {
        String str3;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", str, "sticker_set_id", str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_added", str3);
        LIZ2.LIZIZ("enter_sticker_set_details", LIZ3);
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", "chat", "tab", str);
        LIZ3.put("group_id", str2);
        LIZ3.put("author_id", str3);
        LIZ3.put("action", str4);
        LIZ2.LIZIZ("click_video_selection_panel", LIZ3);
    }

    @Override // X.C32U
    public final void LIZ(String str, String str2, String str3, String str4) {
        LJIJ(this, str, str2, str3, str4);
    }

    public static void LJII(String str, String str2, String str3, boolean z, boolean z2) {
        Object obj;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "sticker_set_id", str, "sticker_creator_user_id", str2);
        LIZ3.put("enter_from", str3);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_sticker_animated", obj);
        if (!z2) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_success", str4);
        LIZ2.LIZIZ("add_sticker_set", LIZ3);
    }

    public static void LJIJ(C87393br c87393br, String str, String str2, String str3, String str4) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c87393br.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("enter_from", str, "enter_method", str2);
        LIZJ.put("group_id", str3);
        LIZJ.put("author_id", str4);
        onEventV3.LIZIZ("enter_video_sticker_creation", LIZJ);
    }

    @Override // X.C32U
    public final void LIZIZ(String str, String str2, String str3, boolean z, String str4) {
        LJJI(this, String.valueOf(str3), str4, str2, z, str, "long_press");
    }

    @Override // X.C32U
    public final void LIZLLL(String str, String str2, String str3, boolean z, boolean z2) {
        LJJ(this, "favourite_tab", str, str2, null, z, str3, z2);
    }

    public static void LJIL(String str, String str2, String str3, String str4, Boolean bool, String str5) {
        String str6;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", str, "enter_method", str2);
        LIZ3.put("video_sticker_id", str3);
        LIZ3.put("group_id", str4);
        if (o.LJ(bool, Boolean.TRUE)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("im_sticker_store", str6);
        LIZ3.put("action", str5);
        LIZ2.LIZIZ("dm_video_sticker_options", LIZ3);
    }

    @Override // X.C32U
    public final void LIZJ(String str, String str2, String str3, String str4, String str5, boolean z) {
        LJIIIZ(this, str, str2, str3, str4, Boolean.valueOf(z), str5);
    }

    public static void LJIIIZ(C87393br c87393br, String str, String str2, String str3, String str4, Boolean bool, String str5) {
        String str6;
        C85323Wm onEventV3 = C772831o.LIZ();
        c87393br.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("enter_from", str, "enter_method", str2);
        LIZJ.put("group_id", str3);
        LIZJ.put("author_id", str4);
        if (o.LJ(bool, Boolean.TRUE)) {
            str6 = "enabled";
        } else {
            str6 = "disabled";
        }
        LIZJ.put("button_status", str6);
        LIZJ.put("toast", str5);
        onEventV3.LIZIZ("click_create_video_sticker", LIZJ);
    }

    public static void LJJI(C87393br c87393br, String str, String str2, String str3, boolean z, String str4, String str5) {
        String str6;
        C85323Wm onEventV3 = C772831o.LIZ();
        c87393br.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("sticker_id", str, "sticker_creator_user_id", str2);
        LIZJ.put("sticker_type", str3);
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_sticker_animated", str6);
        LIZJ.put("enter_from", str4);
        LIZJ.put("enter_method", str5);
        onEventV3.LIZIZ("save_sticker", LIZJ);
    }

    public static void LJJ(C87393br c87393br, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        Object obj;
        C85323Wm onEventV3 = C772831o.LIZ();
        c87393br.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("enter_from", str, "sticker_type", str2);
        LIZJ.put("sticker_id", str3);
        LIZJ.put("sticker_set_id", str4);
        String str6 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_sticker_animated", obj);
        LIZJ.put("video_sticker_id", str5);
        if (!z2) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_success", str6);
        onEventV3.LIZIZ("remove_sticker", LIZJ);
    }

    public static void LJIILJJIL(Long l, Boolean bool, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "create_video_sticker");
        if (l != null) {
            str4 = l.toString();
        } else {
            str4 = null;
        }
        c1hq.put("total_duration", str4);
        Boolean bool5 = Boolean.TRUE;
        String str5 = "1";
        if (o.LJ(bool, bool5)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("add_to_sticker_store", obj);
        c1hq.put("group_id", str);
        c1hq.put("author_id", str2);
        c1hq.put("video_sticker_id", str3);
        if (o.LJ(bool2, bool5)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("has_text", obj2);
        if (o.LJ(bool3, bool5)) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("has_crop", obj3);
        if (!o.LJ(bool4, bool5)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_success", str5);
        c1hq.put("keyword_cnt", String.valueOf(i));
        onEventV3.LIZIZ("create_video_sticker_complete", c1hq);
    }

    @Override // X.C32U
    public final void LJ(Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5) {
        C35U.LIZIZ(num, l, l2, l3, str3, str, str2, str4, str5);
    }

    public static void LJJIFFI(SharePackage sharePackage, String str, String panelStyle, String conversationId, String rankNum, String str2, String recReason, String str3, String chatType, int i) {
        C85323Wm onEventV3;
        String str4;
        String str5;
        String str6;
        SendMessageTemplateTask sendMessageTemplateTask;
        BaseTemplate baseTemplate;
        BaseRequestComponent LLLL;
        QueryDataComponent queryDataComponent;
        java.util.Map<String, String> map = null;
        if ((i & 2) != 0) {
            sharePackage = null;
        }
        String str7 = "";
        if ((i & 16) != 0) {
            panelStyle = "";
        }
        if ((i & 32) != 0) {
            conversationId = "";
        }
        if ((i & 64) != 0) {
            rankNum = "";
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            recReason = "";
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            chatType = "";
        }
        if ((i & 2048) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        o.LJIIIZ(panelStyle, "panelStyle");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(rankNum, "rankNum");
        o.LJIIIZ(recReason, "recReason");
        o.LJIIIZ(chatType, "chatType");
        o.LJIIIZ(onEventV3, "onEventV3");
        if (sharePackage != null && (sendMessageTemplateTask = sharePackage.sendMessageTemplateTask) != null && (baseTemplate = sendMessageTemplateTask.template) != null && (LLLL = baseTemplate.LLLL()) != null && (queryDataComponent = LLLL.queryData) != null) {
            map = queryDataComponent.extras;
        }
        C1HQ c1hq = new C1HQ();
        if (map == null || (str4 = map.get("enter_from")) == null) {
            str4 = "";
        }
        c1hq.put("enter_from", str4);
        c1hq.put("enter_method", "send_to_friend_button");
        if (map == null || (str5 = map.get("a:sticker_id")) == null) {
            str5 = "";
        }
        c1hq.put("video_sticker_id", str5);
        if (map != null && (str6 = map.get("a:sticker_creator_user_id")) != null) {
            str7 = str6;
        }
        c1hq.put("sticker_creator_user_id", str7);
        c1hq.put("panel_source", "share_panel");
        c1hq.put("platform", str);
        c1hq.put("panel_style", panelStyle);
        c1hq.put("conversation_id", conversationId);
        c1hq.put("rank_num", rankNum);
        c1hq.put("relation_tag", str2);
        c1hq.put("rec_reason", recReason);
        c1hq.put("rec_type", str3);
        c1hq.put("chat_type", chatType);
        onEventV3.LIZIZ("share_video_sticker", c1hq);
    }
}
