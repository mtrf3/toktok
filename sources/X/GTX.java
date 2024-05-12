package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTX {
    public static final String LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (editModel.mOrigin == 1) {
            return "shoot";
        }
        return "upload";
    }
}
