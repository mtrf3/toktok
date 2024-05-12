package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFX implements HFZ {
    public static final HFX LIZ = new HFX();

    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        int i2;
        List<Integer> photoDurationList;
        o.LJIIIZ(editModel, "editModel");
        HFB hfb = C43753HFd.LIZ;
        if (hfb != null && (photoDurationList = hfb.getPhotoDurationList()) != null) {
            i2 = photoDurationList.size();
        } else {
            i2 = 1;
        }
        if (i != i2) {
            return new OSZ(20, C48263Iwt.LIZLLL("CanvasChecker: frame count:", i, ", expect size:", i2));
        }
        return new OSZ(-1, "");
    }
}
