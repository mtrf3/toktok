package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.5pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146915pf {
    public static final C146915pf LIZ = new C146915pf();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("group_id", C78983UzD.LJJIJL());
        int i = videoPublishEditModel.draftId;
        if (i != 0) {
            LIZ2.LIZ(i, "draft_id");
        }
        GXR.LIZ("click_text_entrance", LIZ2.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ2.LJI("enter_method", str);
        FMX.LJIIL("edit_music", LIZ2.LIZ);
    }
}
