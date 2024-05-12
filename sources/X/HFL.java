package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFL implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        HFB hfb = C43753HFd.LIZ;
        if (hfb == null) {
            return new OSZ(1, "");
        }
        if (!hfb.getCheckAudioFrame()) {
            return new OSZ(2, "");
        }
        if (!C44687HgJ.LIZIZ(editModel.getOutputFile())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("output file:");
            LIZ.append(editModel.mOutputFile);
            return new OSZ(3, X1D.LIZIZ(LIZ));
        }
        if (!C44687HgJ.LIZIZ(editModel.mEncodedAudioOutputFile)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("auido file:");
            LIZ2.append(editModel.mEncodedAudioOutputFile);
            return new OSZ(4, X1D.LIZIZ(LIZ2));
        }
        return new OSZ(-2, "");
    }
}
