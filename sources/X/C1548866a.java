package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.66a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548866a {
    public final VideoPublishEditModel LIZ;

    public C1548866a() {
        this(null);
    }

    public C1548866a(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final C145995oB LIZ(int i) {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LJI("sticker_type", String.valueOf(i));
            C78929UyL.LIZJ(videoPublishEditModel, c145995oB);
            return c145995oB;
        }
        return new C145995oB();
    }

    public final void LIZIZ(Integer num) {
        if (num != null) {
            FMX.LJIIL("prop_adjust", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LIZJ(int i) {
        FMX.LJIIL("prop_more_click_edit", LIZ(i).LIZ);
    }

    public final void LIZLLL(Integer num) {
        if (num != null) {
            FMX.LJIIL("prop_duration_adjust", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LJ(Integer num) {
        if (num != null) {
            FMX.LJIIL("prop_timeset_cancel", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LJFF(int i) {
        FMX.LJIIL("prop_time_set", LIZ(i).LIZ);
    }
}
