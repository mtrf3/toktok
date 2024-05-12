package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.35U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35U {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String scene, String str, String str2) {
        o.LJIIIZ(scene, "scene");
        C1HQ c1hq = new C1HQ();
        c1hq.put(WM7.SCENE_SERVICE, scene);
        c1hq.put("result", str);
        c1hq.put("sticker_set_id", str2);
        FMX.LJIIL("fetch_sticker_store_data", c1hq);
    }

    public static void LIZ(Integer num, Long l, Long l2, Long l3, Long l4, String str, Long l5, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String l6;
        C1HQ c1hq = new C1HQ();
        if (num == null || (str4 = num.toString()) == null) {
            str4 = "";
        }
        c1hq.put("status", str4);
        String str9 = CardStruct.IStatusCode.DEFAULT;
        if (l == null || (str5 = l.toString()) == null) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("total_duration", str5);
        if (l2 == null || (str6 = l2.toString()) == null) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("check_video_permission_duration", str6);
        if (l3 == null || (str7 = l3.toString()) == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("upload_image_duration", str7);
        if (l4 != null && (l6 = l4.toString()) != null) {
            str9 = l6;
        }
        c1hq.put("create_request_duration", str9);
        if (str == null) {
            str = "";
        }
        c1hq.put("group_id", str);
        if (l5 == null || (str8 = l5.toString()) == null) {
            str8 = "";
        }
        c1hq.put("video_sticker_id", str8);
        if (str2 == null) {
            str2 = "";
        }
        c1hq.put("error_code", str2);
        if (str3 == null) {
            str3 = "";
        }
        c1hq.put("error_description", str3);
        FMX.LJIIL("create_video_sticker_performance", c1hq);
    }

    public static void LIZIZ(Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        String l4;
        C1HQ c1hq = new C1HQ();
        if (num == null || (str6 = num.toString()) == null) {
            str6 = "";
        }
        c1hq.put("status", str6);
        String str9 = CardStruct.IStatusCode.DEFAULT;
        if (l == null || (str7 = l.toString()) == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("total_duration", str7);
        if (l2 == null || (str8 = l2.toString()) == null) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("video_request_duration", str8);
        if (l3 != null && (l4 = l3.toString()) != null) {
            str9 = l4;
        }
        c1hq.put("video_download_duration", str9);
        if (str == null) {
            str = "";
        }
        c1hq.put("group_id", str);
        if (str2 == null) {
            str2 = "";
        }
        c1hq.put("enter_from", str2);
        if (str3 == null) {
            str3 = "";
        }
        c1hq.put("enter_method", str3);
        if (str4 == null) {
            str4 = "";
        }
        c1hq.put("error_code", str4);
        if (str5 == null) {
            str5 = "";
        }
        c1hq.put("error_description", str5);
        FMX.LJIIL("enter_video_sticker_creation_performance", c1hq);
    }
}
