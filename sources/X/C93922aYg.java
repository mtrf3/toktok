package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.aYg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93922aYg {
    public static HashSet<String> LJIJJLI;
    public static HashMap<String, SongVideoShownRecord> LJIL;
    public static final Keva LIZ = Keva.getRepo("music_dsp_authorization_repo");
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C94701alF.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C94702alG.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C94703alH.LJLIL);
    public static String LJ = "";
    public static String LJFF = "";
    public static long LJI = -1;
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static long LJIIIZ = -1;
    public static String LJIIJ = "";
    public static String LJIIJJI = "";
    public static long LJIIL = -1;
    public static int LJIILIIL = -1;
    public static HashSet<String> LJIILJJIL = new HashSet<>();
    public static int LJIILL = -1;
    public static HashSet<String> LJIILLIIL = new HashSet<>();
    public static int LJIIZILJ = -1;
    public static HashSet<String> LJIJ = new HashSet<>();
    public static int LJIJI = -1;
    public static long LJIJJ = -1;
    public static HashSet<String> LJJ = new HashSet<>();

    public static int LIZIZ() {
        int i = LJIIZILJ;
        if (i == -1) {
            int i2 = LIZ.getInt("all_button_show_time", 0);
            LJIIZILJ = i2;
            return i2;
        }
        return i;
    }

    public static long LIZJ() {
        INetwork iNetwork = (INetwork) LIZJ.getValue();
        if (iNetwork != null) {
            return iNetwork.LIZ();
        }
        return System.currentTimeMillis();
    }

    public static void LJI() {
        HashSet<String> LJJLIL;
        Keva keva = LIZ;
        String[] stringArray = keva.getStringArray("saved_songs", new String[0]);
        if (stringArray.length >= C53206KuQ.LIZJ().savedSongsCacheMaxSize) {
            keva.erase("saved_songs");
            LJJLIL = new HashSet<>();
        } else {
            LJJLIL = ORY.LJJLIL(stringArray);
        }
        LJIJJLI = LJJLIL;
    }

    public static void LJII() {
        HashMap<String, SongVideoShownRecord> hashMap;
        try {
            Object LJII2 = ((Gson) LIZIZ.getValue()).LJII(LIZ.getString("song_video_show_record", ""), new C94329afF().getType());
            o.LJIIIIZZ(LJII2, "gson.fromJson(cacheData, type)");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((java.util.Map) LJII2).entrySet()) {
                Long l = ((SongVideoShownRecord) entry.getValue()).lastShowTimestamp;
                if (l != null && SU4.LIZLLL(l.longValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LIZ.storeString("song_video_show_record", ((Gson) LIZIZ.getValue()).LJIILL(linkedHashMap));
            hashMap = new HashMap<>(linkedHashMap);
        } catch (Exception unused) {
            hashMap = new HashMap<>();
        }
        LJIL = hashMap;
    }

    public static void LIZ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIIJ = "";
                Keva keva = LIZ;
                keva.erase("spotify_access_token");
                LJIIJJI = "";
                keva.erase("spotify_refresh_token");
                return;
            }
            LJII = "";
            Keva keva2 = LIZ;
            keva2.erase("amazon_music_access_token");
            LJIIIIZZ = "";
            keva2.erase("amazon_music_refresh_token");
            return;
        }
        LJ = "";
        String LJ2 = LJ("apple_music_user_token_%s");
        Keva keva3 = LIZ;
        keva3.erase(LJ2);
        keva3.erase("apple_music_user_token");
    }

    public static String LIZLLL(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                String str2 = LJIIJ;
                if (str2.length() == 0) {
                    String string = LIZ.getString("spotify_access_token", "");
                    o.LJIIIIZZ(string, "keva.getString(KEY_MUSIC_SPOTIFY_ACCESS_TOKEN, \"\")");
                    LJIIJ = string;
                    return string;
                }
                return str2;
            }
            String str3 = LJII;
            if (str3.length() == 0) {
                String string2 = LIZ.getString("amazon_music_access_token", "");
                o.LJIIIIZZ(string2, "keva.getString(KEY_MUSIC_AMAZON_ACCESS_TOKEN, \"\")");
                LJII = string2;
                return string2;
            }
            return str3;
        }
        Keva keva = LIZ;
        String realToken = keva.getString("apple_music_user_token", "");
        if (realToken.length() == 0) {
            String LJ2 = LJ("apple_music_user_token_%s");
            if (LJ2.length() != 0) {
                str = keva.getString(LJ2, "");
                keva.storeString("apple_music_user_token", str);
                keva.erase(LJ2);
            }
            realToken = str;
        }
        String str4 = LJ;
        if (str4.length() == 0) {
            o.LJIIIIZZ(realToken, "realToken");
            LJ = realToken;
            return realToken;
        }
        return str4;
    }

    public static String LJ(String str) {
        String curSecUserId;
        IAccountUserService iAccountUserService = (IAccountUserService) LIZLLL.getValue();
        if (iAccountUserService == null || (curSecUserId = iAccountUserService.getCurSecUserId()) == null || curSecUserId.length() == 0) {
            return "";
        }
        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(new Object[]{curSecUserId}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        return LLLZ;
    }

    public static String LJFF(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return "";
            }
            String str = LJIIJJI;
            if (str.length() == 0) {
                String string = LIZ.getString("spotify_refresh_token", "");
                o.LJIIIIZZ(string, "keva.getString(KEY_MUSIC…POTIFY_REFRESH_TOKEN, \"\")");
                LJIIJJI = string;
                return string;
            }
            return str;
        }
        String str2 = LJIIIIZZ;
        if (str2.length() == 0) {
            String string2 = LIZ.getString("amazon_music_refresh_token", "");
            o.LJIIIIZZ(string2, "keva.getString(KEY_MUSIC_AMAZON_REFRESH_TOKEN, \"\")");
            LJIIIIZZ = string2;
            return string2;
        }
        return str2;
    }

    public static boolean LJIIIIZZ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                long j = LJIIL;
                if (j == -1) {
                    j = LIZ.getLong("spotify_get_token_time", 0L);
                    LJIIL = j;
                }
                long LIZJ2 = LIZJ() - j;
                FFL.LJIIIZ().getClass();
                if (LIZJ2 <= FFL.LJIILIIL(31744, 3000L, "ttkmusic_spotify_user_token_valid_duration") * 1000) {
                    return false;
                }
                return true;
            }
            long j2 = LJIIIZ;
            if (j2 == -1) {
                j2 = LIZ.getLong("amazon_music_get_token_time", 0L);
                LJIIIZ = j2;
            }
            long LIZJ3 = LIZJ() - j2;
            FFL.LJIIIZ().getClass();
            if (LIZJ3 <= FFL.LJIILIIL(31744, 3000L, "ttkmusic_amazon_user_token_valid_duration") * 1000) {
                return false;
            }
            return true;
        }
        long j3 = LJI;
        if (j3 == -1) {
            j3 = LIZ.getLong("apple_music_get_token_time", 0L);
            LJI = j3;
        }
        long LIZJ4 = LIZJ() - j3;
        FFL.LJIIIZ().getClass();
        if (LIZJ4 <= FFL.LJIILIIL(31744, 12960000L, "ttkmusic_apple_user_token_valid_duration") * 1000) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(int i) {
        long LIZJ2 = LIZJ();
        LJIJJ = LIZJ2;
        Keva keva = LIZ;
        keva.storeLong("last_all_button_show_date", LIZJ2);
        LJIJI = i;
        keva.storeInt("all_button_show_time_per_day", i);
    }

    public static void LJIIJ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                long LIZJ2 = LIZJ();
                LJIIL = LIZJ2;
                LIZ.storeLong("spotify_get_token_time", LIZJ2);
                return;
            }
            long LIZJ3 = LIZJ();
            LJIIIZ = LIZJ3;
            LIZ.storeLong("amazon_music_get_token_time", LIZJ3);
            return;
        }
        long LIZJ4 = LIZJ();
        LJI = LIZJ4;
        LIZ.storeLong("apple_music_get_token_time", LIZJ4);
    }

    public static void LJIIJJI(String str, DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIIJ = str;
                LIZ.storeString("spotify_access_token", str);
                return;
            }
            LJII = str;
            LIZ.storeString("amazon_music_access_token", str);
            return;
        }
        LJ = str;
        LIZ.storeString("apple_music_user_token", str);
    }

    public static void LJIIL(String str, DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        int i = C93921aYf.LIZ[dspPlatform.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            LJIIJJI = str;
            LIZ.storeString("spotify_refresh_token", str);
            return;
        }
        LJIIIIZZ = str;
        LIZ.storeString("amazon_music_refresh_token", str);
    }
}
