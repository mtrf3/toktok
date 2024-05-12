package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V8U {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(EnumC40671Fxj position, EnumC40673Fxl displayType, IMUser iMUser, C63120Opw c63120Opw, int i) {
        String conversationId;
        String value;
        String str;
        int i2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(position, "position");
        o.LJIIIZ(displayType, "displayType");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", "dm_search_page");
        LIZIZ.put("position", position.getValue());
        LIZIZ.put("cell_type", "user_cell");
        LIZIZ.put("display_type", displayType.getValue());
        if (iMUser != null) {
            LIZIZ.put("to_user_id", iMUser.getUid());
            C3ZD c3zd = C3ZD.LIZ;
            Integer valueOf = Integer.valueOf(iMUser.getFollowStatus());
            c3zd.getClass();
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = 0;
            }
            LIZIZ.put("relation_tag", String.valueOf(i2));
            LIZIZ.put("rec_type", iMUser.getRecType());
            LIZIZ.get("chat_type");
        }
        LIZIZ.put("rank_num", String.valueOf(i));
        if (c63120Opw == null) {
            if (iMUser != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            conversationId = C81273Gx.LIZJ(str);
        } else {
            conversationId = c63120Opw.getConversationId();
        }
        LIZIZ.put("conversation_id", conversationId);
        if (c63120Opw != null) {
            if (C79004UzY.LJJIIJZLJL(c63120Opw)) {
                value = V8T.TYPE_TCM.getValue();
            } else if (c63120Opw.isGroupChat()) {
                value = V8T.TYPE_GROUP.getValue();
            }
            LIZIZ.put("chat_type", value);
            onEventV3.LIZIZ("show_dm_search_cell", LIZIZ);
        }
        value = V8T.TYPE_PRIVATE.getValue();
        LIZIZ.put("chat_type", value);
        onEventV3.LIZIZ("show_dm_search_cell", LIZIZ);
    }

    public static void LIZ(EnumC40671Fxj position, EnumC40673Fxl displayType, IMUser iMUser, C63120Opw c63120Opw, int i, EnumC57385Mfd action) {
        String conversationId;
        String value;
        String str;
        int i2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(position, "position");
        o.LJIIIZ(displayType, "displayType");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", "dm_search_page");
        LIZIZ.put("position", position.getValue());
        LIZIZ.put("cell_type", "user_cell");
        LIZIZ.put("display_type", displayType.getValue());
        if (iMUser != null) {
            LIZIZ.put("to_user_id", iMUser.getUid());
            C3ZD c3zd = C3ZD.LIZ;
            Integer valueOf = Integer.valueOf(iMUser.getFollowStatus());
            c3zd.getClass();
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = 0;
            }
            LIZIZ.put("relation_tag", String.valueOf(i2));
            LIZIZ.put("rec_type", iMUser.getRecType());
        }
        LIZIZ.put("rank_num", String.valueOf(i));
        if (c63120Opw == null) {
            if (iMUser != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            conversationId = C81273Gx.LIZJ(str);
        } else {
            conversationId = c63120Opw.getConversationId();
        }
        LIZIZ.put("conversation_id", conversationId);
        if (c63120Opw != null) {
            if (C79004UzY.LJJIIJZLJL(c63120Opw)) {
                value = V8T.TYPE_TCM.getValue();
            } else if (c63120Opw.isGroupChat()) {
                value = V8T.TYPE_GROUP.getValue();
            }
            LIZIZ.put("chat_type", value);
            LIZIZ.put("action", action.getValue());
            onEventV3.LIZIZ("click_dm_search_cell", LIZIZ);
        }
        value = V8T.TYPE_PRIVATE.getValue();
        LIZIZ.put("chat_type", value);
        LIZIZ.put("action", action.getValue());
        onEventV3.LIZIZ("click_dm_search_cell", LIZIZ);
    }
}
