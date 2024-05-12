package X;

import java.util.List;

/* renamed from: X.0s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21040s8 {
    public static final java.util.Map<Integer, String> LIZ = C113554cx.LJJL(new OSZ(0, "normal"), new OSZ(1, "status_exception"), new OSZ(2, "video_capture_fail"), new OSZ(3, "audio_capture_fail"), new OSZ(4, "retry_max_times"), new OSZ(5, "video_encoder_fail"), new OSZ(6, "audio_encoder_fail"), new OSZ(7, "adm_recoder_fail"), new OSZ(8, "adm_play_fail"), new OSZ(10001, "click"), new OSZ(10002, "kick_out"), new OSZ(10003, "banned"), new OSZ(10004, "force_or_illegal"), new OSZ(10005, "room_not_exist"), new OSZ(10006, "user_not_in_room"), new OSZ(10007, "room_live_finish"), new OSZ(10008, "background_time_out"), new OSZ(10009, "back_main"), new OSZ(100, "lite_default"), new OSZ(101, "lite_invalid_license"), new OSZ(102, "lite_invalid_parameter"), new OSZ(103, "lite_video_capture"), new OSZ(104, "lite_audio_capture"), new OSZ(105, "lite_video_encoder"), new OSZ(106, "lite_audio_encoder"), new OSZ(107, "lite_transport"), new OSZ(108, "lite_transport"), new OSZ(109, "lite_audio_device_error"), new OSZ(110, "lite_pusher"));
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJIIJI(0, 4);

    public static final boolean LIZJ(int i) {
        if (1 <= i) {
            return i < 9 || (100 <= i && i < 111);
        }
        return false;
    }

    public static final String LIZ(int i) {
        String str = LIZ.get(Integer.valueOf(i));
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public static final boolean LIZIZ(int i, Integer num) {
        boolean z;
        if (num == null || (num.intValue() != -201 && num.intValue() != -202 && num.intValue() != -203)) {
            z = false;
        } else {
            z = true;
        }
        if (i != 2 || !z) {
            return false;
        }
        return true;
    }
}
