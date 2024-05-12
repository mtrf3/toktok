package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.5Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135015Rp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        FMX.LJIIL("sts_entrance_show", LIZIZ(publishEditModel).LIZ);
    }

    public static C145995oB LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        Integer num;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c145995oB.LJI("enter_from", "video_edit_page");
        Q8U.LIZJ(c145995oB, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
        c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            num = Integer.valueOf(previewInfo.getPreviewVideoLength());
        } else {
            num = null;
        }
        c145995oB.LIZJ(num, "creation_duration");
        c145995oB.LJI("enter_method", "click_music_entrance");
        return c145995oB;
    }
}
