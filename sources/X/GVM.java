package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public final class GVM {
    public static final void LIZIZ(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LIZ(GVX.LIZ(), "retry_type");
            FMX.LJIIL("quit_auto_uploading_show", c145995oB.LIZ);
        }
    }

    public static final void LIZ(Object obj, String str) {
        if (obj instanceof VideoPublishEditModel) {
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LJI("action_type", str);
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LIZ(GVX.LIZ(), "retry_type");
            FMX.LJIIL("quit_auto_uploading", c145995oB.LIZ);
        }
    }
}
