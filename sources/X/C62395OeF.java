package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.OeF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62395OeF {
    public static void LJ(long j, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click");
        c188727au.LJ(System.currentTimeMillis() - j, "duration");
        c188727au.LJIIIZ("creation_id", str);
        FMX.LJIIL("video_shoot_page_music_load_time", c188727au.LIZ);
    }

    public static void LIZ(int i, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LIZLLL(i, "status");
        FMX.LJIIL("click_feature_video_button", c188727au.LIZ);
    }

    public static void LJFF(String str, String channel, String processId) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(processId, "processId");
        if (TextUtils.isEmpty(channel)) {
            return;
        }
        if (!TextUtils.equals(channel, "qr_code")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("platform", channel);
            c188727au.LJIIIZ("process_id", processId);
            c188727au.LJIIIZ("share_mode", "normal_share");
            FMX.LJIIL("share_music", c188727au.LIZ);
        }
        C4LD.LIZIZ.LJJIL(2, channel);
    }

    public static void LJI(String str, String channelKey, boolean z) {
        o.LJIIIZ(channelKey, "channelKey");
        if (!z) {
            return;
        }
        C8BR c8br = new C8BR();
        c8br.LJJ(new C43169Gwv());
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = str;
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJ = -1;
        c62683Oit.LJI = 2;
        c62683Oit.LJII = channelKey;
        c8br.LJIILL(c62683Oit.LIZ());
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LIZLLL(1, "status");
        c188727au.LJIIIZ("button_name", str4);
        FMX.LJIIL("click_feature_video_edit_sheet", c188727au.LIZ);
    }

    public static void LIZLLL(int i, int i2, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LIZLLL(i, "status");
        c188727au.LIZLLL(i2, "is_self");
        FMX.LJIIL("mdp_video_show", c188727au.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2, String str3, java.util.Map map) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("process_id", str2);
        if (map != null) {
            c188727au.LJIIIIZZ(map);
        }
        c188727au.LJI("group_id", str3);
        FMX.LJIIL("show_music_feedback_entrance", c188727au.LIZ);
    }

    public static void LIZJ(String str, String str2, boolean z, String str3, boolean z2) {
        String str4;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("enter_method", "music_feedback");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("from_music_id", str2);
        c188727au.LJIIIZ("process_id", str3);
        String str5 = "1";
        c188727au.LJIIIZ("ugc_to_pgc_meta", "1");
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("music_new_flag", str4);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("music_new_show", str5);
        FMX.LJIIL("enter_music_detail", c188727au.LIZ);
    }

    public static void LJII(long j, String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("enter_method", "click_play_music");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("process_id", str2);
        c188727au.LJIIIZ("creation_id", str3);
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("shoot_way", "more_sounds");
        c188727au.LJIIIZ("group_id", str4);
        FMX.LJIIL("shoot_initiate_duration", c188727au.LIZ);
    }
}
