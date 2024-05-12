package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFK implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        String str;
        o.LJIIIZ(editModel, "editModel");
        HFB hfb = C43753HFd.LIZ;
        if (hfb == null) {
            return new OSZ(1, "");
        }
        if (!hfb.getCheckVideoFrame()) {
            return new OSZ(2, "");
        }
        ExtractFramesModel extractFramesModel = editModel.extractFramesModel;
        String str2 = null;
        if (extractFramesModel != null) {
            str = extractFramesModel.getExtractFramesDir();
        } else {
            str = null;
        }
        if (!C44687HgJ.LIZIZ(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("frame dir:");
            ExtractFramesModel extractFramesModel2 = editModel.extractFramesModel;
            if (extractFramesModel2 != null) {
                str2 = extractFramesModel2.getExtractFramesDir();
            }
            LIZ.append(str2);
            return new OSZ(8, X1D.LIZIZ(LIZ));
        }
        if (!C44687HgJ.LIZIZ(editModel.getOutputFile())) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("output file:");
            LIZ2.append(editModel.mOutputFile);
            return new OSZ(3, X1D.LIZIZ(LIZ2));
        }
        return new OSZ(-2, "");
    }
}
