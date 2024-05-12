package X;

import android.content.Context;
import com.ss.android.ugc.aweme.component.music.MusicService;

/* renamed from: X.Iur, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48137Iur {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("url", str3);
        c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJJLI(), "download_strategy");
        c188727au.LJIIIZ("musicEffectsUrl", str4);
        c188727au.LJFF(Boolean.FALSE, "is_use_tt_player");
        FMX.LJIIL("download_music", c188727au.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, Context context) {
        boolean z;
        double d;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("url", str3);
        c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJJLI(), "download_strategy");
        c188727au.LJIIIZ("fail_reason", str4);
        c188727au.LJFF(Boolean.FALSE, "is_use_tt_player");
        c188727au.LJFF(Boolean.valueOf(z), "isNetworkAvailable");
        if (!C47485IkL.LIZ()) {
            C48138Ius c48138Ius = C48096IuC.LIZ;
            synchronized (c48138Ius) {
                C48141Iuv c48141Iuv = c48138Ius.LIZ;
                if (c48141Iuv != null) {
                    d = c48141Iuv.LIZIZ;
                } else {
                    d = -1.0d;
                }
            }
            c188727au.LIZLLL((int) d, "net_speed");
        }
        FMX.LJIIL("download_music_failed", c188727au.LIZ);
    }

    public static void LIZJ(String str, Long l, Long l2, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("url", str3);
        c188727au.LJFF(l, "time");
        c188727au.LJFF(l2, "size");
        c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJJLI(), "download_strategy");
        c188727au.LJFF(Boolean.FALSE, "is_use_tt_player");
        FMX.LJIIL("download_music_succeed", c188727au.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("url", str4);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("fail_reason", str5);
        c188727au.LJIIIZ("url_list", str2);
        c188727au.LJFF(Boolean.TRUE, "is_use_tt_player");
        FMX.LJIIL("download_play_failed", c188727au.LIZ);
    }

    public static void LJ(String str, String str2, Long l, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("url", str4);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJFF(l, "time");
        c188727au.LJIIIZ("url_list", str2);
        c188727au.LJFF(Boolean.TRUE, "is_use_tt_player");
        FMX.LJIIL("download_play_start", c188727au.LIZ);
    }

    public static void LJFF(String str, String str2, Long l, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("url", str4);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJFF(l, "time");
        c188727au.LJIIIZ("url_list", str2);
        c188727au.LJFF(Boolean.TRUE, "is_use_tt_player");
        FMX.LJIIL("download_play_succeed", c188727au.LIZ);
    }

    public static void LJI(Long l, String str, String str2, Integer num, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJFF(l, "prepare_time");
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJFF(num, "time");
        c188727au.LJIIIZ("url", str3);
        FMX.LJIIL("audio_first_frame", c188727au.LIZ);
    }
}
