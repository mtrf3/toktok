package X;

import android.content.Context;
import android.content.DialogInterface;
import com.google.gson.internal.h;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Skl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72991Skl {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static C188727au LJ;

    public static void LIZIZ(String str, String clipId) {
        int i;
        o.LJIIIZ(clipId, "clipId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("try report: ");
        LIZ2.append(LJ);
        C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ2));
        C188727au c188727au = LJ;
        if (c188727au != null) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = (int) (currentTimeMillis - LIZ);
            long j = LIZIZ;
            int i3 = 0;
            if (j == -1) {
                i = 0;
            } else {
                i = (int) (LIZJ - j);
            }
            long j2 = LIZLLL;
            if (j2 != -1) {
                i3 = (int) (currentTimeMillis - j2);
            }
            c188727au.LIZLLL(i2 / 1000, "total_processing_duration");
            c188727au.LIZLLL(i / 1000, "video_cloud_duration");
            c188727au.LIZLLL(i3 / 1000, "mp4_duration");
            c188727au.LJIIIZ("clip_id", clipId);
            c188727au.LJIIIZ("status", str);
            FMX.LJIIL("livesdk_live_replay_clip_processing_duration", c188727au.LIZ);
        }
    }

    public static void LIZ(Float f, A90 a90, DialogInterface.OnCancelListener onCancelListener) {
        if (f != null) {
            a90.LIZLLL(f.floatValue());
        }
        a90.LIZJ(C15380j0.LJIILJJIL(R.string.nx4));
        a90.LIZ(true);
        a90.LIZIZ(false);
        a90.setOnCancelListener(onCancelListener);
        a90.setOnDismissListener(null);
    }

    public static void LIZJ(Context context, float f, A90 a90, String str, String str2, String str3, String str4, String str5) {
        String name;
        A90 a902 = a90;
        HH1.LIZ(str, "roomId", str2, "clipId", str3, "url");
        if (a902 == null) {
            C0NB.LIZIZ("LiveReplayVideoClip", "try download clip from JSB");
            a902 = new A90(context);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("room_id", str);
            c188727au.LJIIIZ("clip_id", str2);
            c188727au.LJIIIZ("event_page", "clip_list_page");
            LJ = c188727au;
            LIZ = System.currentTimeMillis();
            LIZIZ = -1L;
            LIZJ = -1L;
            LIZLLL = -1L;
            LIZ(null, a902, new DialogInterfaceOnCancelListenerC72992Skm(a902, c188727au, str3));
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a902, new Object[0], "void", new C65300Pk0(false, "()V", "-7025421254513821745")).LIZ) {
                a902.show();
            }
        } else {
            C0NB.LIZIZ("LiveReplayVideoClip", "try download clip from NATIVE");
        }
        LIZLLL = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(str2);
        String LJIIIIZZ = h.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        if (LJIIIIZZ == null || LJIIIIZZ.length() == 0) {
            LJIIIIZZ = i0.LJFF(str, str2);
        }
        if (str4 == null) {
            name = i0.LJFF(LJIIIIZZ, ".mp4");
        } else {
            name = i0.LJFF(LJIIIIZZ, str4);
        }
        o.LJIIIIZZ(name, "name");
        C31824CeK c31824CeK = new C31824CeK(name, EnumC31874Cf8.LIVE_REPLAY_CLIP_VIDEO, null, null, str3, null, false, 1, false, 748);
        C79258V8s.LIZ.LIZIZ(c31824CeK, new C72994Sko(c31824CeK, a902, str2, context, str5, f));
    }
}
