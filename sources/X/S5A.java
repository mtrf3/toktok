package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5A {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZLLL(long j, String str, String previousPage) {
        o.LJIIIZ(previousPage, "previousPage");
        b.LJJIJIIJIL("rd_ec_enter_page", new OSZ("page_name", str), new OSZ("previous_page", previousPage), new OSZ("start_click_to_now", Long.valueOf(j)));
    }

    public static final void LIZIZ(long j, String str, String previousPage, String str2, String str3) {
        o.LJIIIZ(previousPage, "previousPage");
        b.LJJIJIIJIL("rd_ec_duration_debugger", new OSZ("page_name", str), new OSZ("previous_page", previousPage), new OSZ("stage", str2), new OSZ(WM7.SCENE_SERVICE, str3), new OSZ("duration", Long.valueOf(j)));
    }

    public static void LIZ(String str, String str2, Boolean bool, String str3, Long l, int i) {
        String str4;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("stage", str), new OSZ(WM7.SCENE_SERVICE, str2));
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LJJLIIIIJ.put("is_success", str4);
        }
        if (l != null) {
            l.longValue();
            LJJLIIIIJ.put("duration", l);
        }
        if (str3 != null) {
            LJJLIIIIJ.put("error_msg", str3);
        }
        b.LJJIJIIJI("rd_ec_billboard_image_monitor", LJJLIIIIJ);
    }

    public static void LIZJ(long j, String str, String str2, String str3, String str4, boolean z) {
        HH1.LIZ(str, "roomId", str2, "authorId", str3, "uploadHost");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("room_id", str), new OSZ("author_id", str2), new OSZ("image_upload_host", str3), new OSZ("duration", Long.valueOf(j)));
        LJJLIIIIJ.put("is_success", Integer.valueOf(z ? 1 : 0));
        if (str4 != null) {
            LJJLIIIIJ.put("fail_reason", str4);
        }
        b.LJJIJIIJI("rd_ec_live_end_upload_image", LJJLIIIIJ);
    }

    public static void LJ(String roomId, String authorId, boolean z, String str, String pageName, String resourceId, String scene, String str2, Integer num, String str3) {
        java.util.Map LIZ2;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(scene, "scene");
        LIZ2 = S5F.LIZ(roomId, authorId, null, str, pageName, z);
        LIZ2.put("resource_id", resourceId);
        LIZ2.put(WM7.SCENE_SERVICE, scene);
        LIZ2.put("step", str2);
        if (num != null) {
            num.intValue();
            LIZ2.put("error_code", num);
        }
        if (str3 != null) {
            LIZ2.put("error_info", str3);
        }
        b.LJJIJIIJI("rd_ttec_billboard_effect_step_event", LIZ2);
    }
}
