package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFS implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (editModel.getImageAlbumData().getImageList().size() != i) {
            StringBuilder LJ = C7MY.LJ("frame count:", i, ", select size:");
            LJ.append(editModel.getImageAlbumData().getImageList().size());
            return new OSZ(12, X1D.LIZIZ(LJ));
        }
        return new OSZ(-1, "");
    }
}
