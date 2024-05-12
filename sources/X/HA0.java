package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HA0 {
    public final int LIZ;
    public final int LIZIZ;

    public final EditPreviewInfo LIZ(MvCreateVideoData data) {
        o.LJIIIZ(data, "data");
        C149505tq c149505tq = new C149505tq(this.LIZ, this.LIZIZ, 12);
        String str = data.contactVideoPath;
        str.toString();
        return c149505tq.LIZ(new EditVideoSegment(str, null, new VideoFileInfo(this.LIZ, this.LIZIZ, 0L, 30, 0, 0, 0, 0, 0.0f, 496, null), 2, null));
    }

    public HA0(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
