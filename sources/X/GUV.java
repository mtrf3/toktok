package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUV {
    public final GUQ LIZ;

    public GUV(GUQ task) {
        o.LJIIIZ(task, "task");
        this.LIZ = task;
    }

    public final void LIZ(boolean z) {
        BaseShortVideoContext baseShortVideoContext = this.LIZ.LJLJJL.LIZ.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            videoPublishEditModel.isOpenForegroundPublish = true;
            videoPublishEditModel.isBackgroundPublish = z;
        }
    }
}
