package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.IlF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47541IlF {
    public static String LIZ;
    public static boolean LIZIZ;
    public static Long LIZJ;
    public static Long LIZLLL;
    public static Long LJ;
    public static Long LJFF;
    public static boolean LJI;

    public static void LIZ() {
        Long l = LIZJ;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = LIZLLL;
            if (l2 != null) {
                LIZLLL = Long.valueOf((System.currentTimeMillis() - longValue) + l2.longValue());
                LIZJ = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public static String LIZIZ() {
        if (C47957Irx.LIZIZ()) {
            return C46416IJo.LIZ().toMobString();
        }
        return C46416IJo.LIZ().toMobString();
    }

    public static String LIZJ() {
        if (C47957Irx.LIZIZ()) {
            boolean LIZJ2 = C46416IJo.LIZJ();
            if (LIZJ2) {
                return "on";
            }
            if (!LIZJ2) {
                return "off";
            }
            throw new C162476Zf();
        }
        boolean LIZJ3 = C46416IJo.LIZJ();
        if (LIZJ3) {
            return "on";
        }
        if (!LIZJ3) {
            return "off";
        }
        throw new C162476Zf();
    }

    public static final void LJII(String str) {
        if (str != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("status", LIZJ());
            c188727au.LJIIIZ("play_order", LIZIZ());
            FMX.LJIIL("audio_panel_show", c188727au.LIZ);
        }
    }

    public static final void LIZLLL(Aweme aweme, String str) {
        String str2;
        Long l = LJ;
        if (l == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        LIZ();
        if (aweme != null && str != null) {
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("duration", String.valueOf(currentTimeMillis));
            Long l2 = LIZLLL;
            if (l2 != null) {
                str2 = l2.toString();
            } else {
                str2 = null;
            }
            oszArr[1] = new OSZ("mute_duration", str2);
            LJFF(aweme, str, "audio_play_duration", C113554cx.LJJL(oszArr));
        }
        LJ = null;
        LIZLLL = null;
    }

    public static final void LJ(Aweme aweme, String enterFrom, boolean z) {
        String str;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJFF(aweme, enterFrom, "audio_play_finish", C51029K0z.LJJIIZI(new OSZ("is_mute", str)));
    }

    public static final void LJFF(Aweme aweme, String str, String str2, java.util.Map<String, String> map) {
        String str3;
        Long l;
        String str4;
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        User author = aweme.getAuthor();
        if (author != null) {
            str3 = author.getUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        Music music = aweme.getMusic();
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        c188727au.LJIIIZ("music_id", String.valueOf(l));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(aweme.getRequestId()));
        c188727au.LJIIIZ("status", LIZJ());
        c188727au.LJIIIZ("play_order", LIZIZ());
        String str5 = "1";
        if (C84763XOl.LJIIJJI) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_background", str4);
        Boolean isOnThisDayVideo = aweme.isOnThisDayVideo();
        o.LJIIIIZZ(isOnThisDayVideo, "aweme.isOnThisDayVideo");
        if (!isOnThisDayVideo.booleanValue()) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_on_this_day", str5);
        c188727au.LJIIIIZZ(map);
        Object LJII = c220488l2.LJII(aweme, c188727au);
        C222578oP.LIZJ(LJII, aweme, null, null, 14);
        FMX.LJIIL(str2, ((C188727au) LJII).LIZ);
    }

    public static void LJI(Aweme aweme, Aweme aweme2, String str, String str2) {
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(aweme.getRequestId()));
        c188727au.LJIIIZ("status", LIZJ());
        c188727au.LJIIIZ("play_order", LIZIZ());
        c188727au.LJIIIZ("from_group_id", aweme.getFromGroupId());
        Music music = aweme.getMusic();
        Object obj = "";
        if (music == null || (str3 = Long.valueOf(music.getId()).toString()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("from_music_id", str3);
        c188727au.LJIIIZ("to_group_id", aweme2.getFromGroupId());
        Music music2 = aweme2.getMusic();
        if (music2 != null) {
            obj = Long.valueOf(music2.getId());
        }
        c188727au.LJFF(obj, "to_music_id");
        FMX.LJIIL(str2, c188727au.LIZ);
    }
}
