package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import kotlin.jvm.internal.o;

/* renamed from: X.6BJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(Exception exc, boolean z) {
        int i;
        String LJII;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C6BK c6bk = new C6BK();
        if (exc == null) {
            LJII = "";
        } else {
            LJII = J7I.LJII(exc);
        }
        c6bk.LIZ.put("exception", LJII);
        C43882HKc.LIZLLL(i, "stickpoint_musiclist", c6bk.LJ(), true);
    }

    public static void LIZJ(boolean z, AVMusic aVMusic, Exception exc) {
        String path;
        String str;
        int i = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        String str2 = "";
        if (aVMusic == null) {
            path = "";
        } else {
            path = aVMusic.getPath();
        }
        c6bk.LIZ.put("url", path);
        if (aVMusic == null || (str = aVMusic.getMusicId()) == null) {
            str = "";
        }
        c6bk.LIZ.put("music_id", str);
        if (exc != null) {
            str2 = J7I.LJII(exc);
        }
        c6bk.LIZ.put("exception", str2);
        C43882HKc.LIZLLL(i, "stickpoint_download_music", c6bk.LJ(), true);
    }

    public static void LIZ(Exception exc, String str, String str2, boolean z) {
        int i;
        String LJII;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("url", str);
        c6bk.LIZ.put("alg_type", str2);
        if (exc == null) {
            LJII = "";
        } else {
            LJII = J7I.LJII(exc);
        }
        c6bk.LIZ.put("exception", LJII);
        C43882HKc.LIZLLL(i, "stickpoint_download_alg", c6bk.LJ(), true);
    }

    public static void LIZIZ(boolean z, int i, int i2, String str, String extraMsg, Exception exc, C143235jj c143235jj, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            extraMsg = "";
        }
        if ((i3 & 32) != 0) {
            exc = null;
        }
        if ((i3 & 64) != 0) {
            c143235jj = null;
        }
        o.LJIIIZ(extraMsg, "extraMsg");
        int i4 = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i2));
        c6bk.LIZ.put("type", Integer.valueOf(i));
        c6bk.LIZ.put("music_id", str);
        if (C78685UuP.LJJJZ(extraMsg)) {
            c6bk.LIZLLL("extra_msg", extraMsg);
        }
        if (exc != null) {
            c6bk.LIZLLL("exception", J7I.LJII(exc));
        }
        if (c143235jj != null) {
            String str2 = c143235jj.LIZIZ;
            if (str2 != null) {
                c6bk.LIZLLL("music_path", str2);
            }
            Integer num = c143235jj.LIZJ;
            if (num != null) {
                c6bk.LIZIZ(Integer.valueOf(num.intValue()), "video_length");
            }
            VEAlgorithmPath vEAlgorithmPath = c143235jj.LIZLLL;
            if (vEAlgorithmPath != null) {
                c6bk.LIZLLL("veAlgorithmPath", vEAlgorithmPath.toString());
            }
            Integer num2 = c143235jj.LJ;
            if (num2 != null) {
                c6bk.LIZIZ(Integer.valueOf(num2.intValue()), "music_start");
            }
            Integer num3 = c143235jj.LJFF;
            if (num3 != null) {
                c6bk.LIZIZ(Integer.valueOf(num3.intValue()), "trim_out");
            }
            Integer num4 = c143235jj.LJI;
            if (num4 != null) {
                c6bk.LIZIZ(Integer.valueOf(num4.intValue()), "music_length");
            }
            String str3 = c143235jj.LJII;
            if (str3 != null) {
                c6bk.LIZLLL("sync_type", str3);
            }
            String str4 = c143235jj.LJIIIIZZ;
            if (str4 != null) {
                c6bk.LIZLLL("extra_info", str4);
            }
        }
        C43882HKc.LIZLLL(i4, "editor_pro_beat_error", c6bk.LJ(), true);
    }
}
