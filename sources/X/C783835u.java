package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.35u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783835u {
    public static final C783835u LIZ = new C783835u();
    public static final C64962gm LIZIZ = C48841JEv.LIZ(C78613UtF.LIZ);

    public final void LJI() {
        C772831o.LIZ().LIZIZ("tns_show", C51029K0z.LJJIIZI(new OSZ("page_name", "album_page")));
    }

    public final void LJII() {
        C772831o.LIZ().LIZIZ("toast_show", C113554cx.LJJL(new OSZ("page_name", "album_page"), new OSZ("toast_type", "chat_upload_video_reminder")));
    }

    public static void LIZJ(C99033ud sessionInfo) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("click_album_entrance", LJ(sessionInfo));
    }

    public static void LIZLLL(C99033ud sessionInfo) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("click_camera_entrance", LJ(sessionInfo));
    }

    public static C1HQ LJ(C99033ud c99033ud) {
        C1HQ LIZIZ2 = C48339Iy7.LIZIZ("enter_from", "chat");
        LIZIZ2.put("chat_type", C98583tu.LIZIZ(c99033ud.getChatType()));
        LIZIZ2.put("conversation_id", c99033ud.getConversationId());
        LIZIZ2.put("to_user_id", c99033ud.getSingleChatFromUserId());
        return LIZIZ2;
    }

    public static void LIZ(C1HQ c1hq, String str) {
        int i;
        Object obj;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(str);
        if (LIZ2 != null) {
            IMUser LJIIJ = C80533Eb.LJIIJ(C79004UzY.LJIILL(LIZ2), null);
            if (LJIIJ != null) {
                i = LJIIJ.getFollowStatus();
            } else {
                i = -1;
            }
            c1hq.put("relation_tag", String.valueOf(i));
            if (LJIIJ == null || (obj = LJIIJ.getRecType()) == null) {
                obj = -1;
            }
            c1hq.put("rec_type", obj.toString());
        }
    }

    public final void LIZIZ(int i, String str, String str2) {
        C772831o.LIZ().LIZIZ("click_album_access_setting", C113554cx.LJJL(new OSZ("page_name", "album_page"), new OSZ("click_type", str2), new OSZ("chat_type", String.valueOf(i)), new OSZ("conversation_id", str)));
    }

    public final void LJFF(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        HH1.LIZ(str, "conversationId", str2, "msgId", str3, "serverMsgId");
        if (i != 501) {
            if (i != 502) {
                return;
            }
            XKX.LIZLLL(LIZIZ, null, null, new C783735t(i2, C772831o.LIZ(), str, str2, str3, null, z, z2), 3);
            return;
        }
        XKX.LIZLLL(LIZIZ, null, null, new C783635s(i2, C772831o.LIZ(), str, str2, str3, null, z, z2), 3);
    }
}
