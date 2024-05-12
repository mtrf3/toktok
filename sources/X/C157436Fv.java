package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.6Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157436Fv {
    public final VideoPublishEditModel LIZ;

    public final C145995oB LIZ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("shoot_entrance", videoPublishEditModel.mShootWay);
            return c145995oB;
        }
        return new C145995oB();
    }

    public C157436Fv(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }
}
