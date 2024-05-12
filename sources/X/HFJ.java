package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFJ implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        int i2;
        o.LJIIIZ(editModel, "editModel");
        List<EditVideoSegment> list = editModel.cutSameEditData.videoSegmentDataList;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return new OSZ(-1, "");
        }
        return new OSZ(21, C48263Iwt.LIZLLL("frame count:", i, ", cal count:", i2));
    }
}
