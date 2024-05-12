package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5SH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SH {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        C145995oB LIZ = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ.LJI("shoot_way", videoPublishEditModel.mShootWay);
        int i = videoPublishEditModel.draftId;
        if (i != 0) {
            LIZ.LIZ(i, "draft_id");
        }
        o.LJIIIIZZ(videoPublishEditModel.newDraftId, "model.newDraftId");
        if (!ujb.o.LJJJJJL(r1)) {
            LIZ.LIZLLL("new_draft_id", videoPublishEditModel.newDraftId);
        }
        FMX.LJIIL("cover_click", LIZ.LIZ);
    }
}
