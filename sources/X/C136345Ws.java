package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136345Ws {
    public static final boolean LIZ(VideoPublishEditModel model, boolean z) {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        o.LJIIIZ(model, "model");
        if (z || C79004UzY.LJJIIZI(model.canvasVideoData) || model.isPhotoMvMode || model.isMvThemeVideoType() || H7R.LJJJJL(model) || (previewInfo = model.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || videoList.size() != 1 || !e1.LIZ(31744, "enable_creative_edit_hdr_v2", true, false) || model.getEditorProModel().isAdvancedEditDraft()) {
            return false;
        }
        return true;
    }
}
