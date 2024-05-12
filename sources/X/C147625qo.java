package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147625qo {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
        c188727au.LJIIIZ("shoot_way", videoPublishEditModel.mShootWay);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(videoPublishEditModel));
        GXR.LIZ("change_background_color", c188727au.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String inputText) {
        o.LJIIIZ(inputText, "inputText");
        if (videoPublishEditModel == null || !H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
        c188727au.LJIIIZ("shoot_way", videoPublishEditModel.mShootWay);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(videoPublishEditModel));
        c188727au.LIZLLL(!TextUtils.isEmpty(inputText) ? 1 : 0, "is_text_added");
        c188727au.LIZLLL(inputText.length(), "input_text_length");
        c188727au.LJ(SystemClock.elapsedRealtime() - LIZ, "page_stay_time");
        GXR.LIZ("leave_text_mode_input_page", c188727au.LIZ);
    }
}
