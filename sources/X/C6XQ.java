package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6XQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XQ {
    public static final /* synthetic */ int LIZ = 0;

    public static C145995oB LIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "enter_from", "video_post_page", videoPublishEditModel, "creation_id");
        c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c145995oB.LIZ(z ? 1 : 0, "is_virtual_feed");
        c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        c145995oB.LJI("from_group_id", C78983UzD.LJJIJL());
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("last_group_id", str);
        return c145995oB;
    }

    public static final void LIZJ(VideoPublishEditModel mModel, String str, boolean z) {
        o.LJIIIZ(mModel, "mModel");
        FMX.LJIIL("click_on_preview_page", LIZ(mModel, str, z).LIZ);
    }

    public static final void LIZIZ(VideoPublishEditModel mModel, String str, String previewEntranceTime, boolean z) {
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(previewEntranceTime, "previewEntranceTime");
        C145995oB LIZ2 = LIZ(mModel, str, z);
        LIZ2.LIZLLL("click_preview_entrance_time", previewEntranceTime);
        FMX.LJIIL("click_preview_back_page_button", LIZ2.LIZ);
    }
}
