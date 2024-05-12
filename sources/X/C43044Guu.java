package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* renamed from: X.Guu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43044Guu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Integer num, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        C6BK c6bk = new C6BK();
        if (num != null) {
            num.intValue();
            c6bk.LIZIZ(num, "photo_to_video_assets_count");
        }
        if (imageUploadInfo != null) {
            c6bk.LIZJ(Long.valueOf(imageUploadInfo.getMErrorCode()), "error_code");
            c6bk.LIZLLL("extra_msg", imageUploadInfo.getMExtra());
        }
        C43882HKc.LIZLLL(1, "ies_ai_recommend_video_frames_upload_monitor", c6bk.LJ(), true);
    }

    public static void LIZJ(int i, Integer num) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("time_cost_ms", Integer.valueOf(i));
        if (num != null) {
            num.intValue();
            c6bk.LIZIZ(num, "photo_to_video_assets_count");
        }
        C43882HKc.LIZLLL(0, "ies_ai_recommend_video_frames_upload_monitor", c6bk.LJ(), true);
    }

    public static void LIZ(int i, int i2, boolean z, String str, long j, String str2) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "type");
        c145995oB.LIZLLL("upload_type", str);
        c145995oB.LIZIZ(j, "time");
        c145995oB.LIZLLL("status", str2);
        if (i != 1) {
            c145995oB.LJ("is_force", z);
        }
        if (i2 > 0) {
            c145995oB.LIZ(i2, "count");
        }
        c145995oB.LIZLLL("is_login", String.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
        FMX.LJIIL("tool_performance_ai_music_panel_request", c145995oB.LIZ);
    }
}
