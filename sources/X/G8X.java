package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public final class G8X {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        if (videoPublishEditModel == null) {
            return C40982G6o.LIZ();
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.draftInfoModel.isDraft && ((str = creativeModel.postPageModel.captionModel.markupText) == null || str.length() == 0)) {
            z = true;
        } else {
            z = false;
        }
        if (C40982G6o.LIZ() && !z) {
            return true;
        }
        return false;
    }
}
