package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173826ry {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc);
        if (LJIIJJI.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = LJIIJJI.iterator();
        while (it.hasNext()) {
            if (it.next().isUploadTypeSticker()) {
                return true;
            }
        }
        return false;
    }

    public static String LIZ(String str, String str2, CreativeInfo creativeInfo) {
        String str3;
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJ(creativeInfo);
        if (str2 != null && s.LJJJLZIJ(str2, LJJ, false)) {
            return null;
        }
        if (str == null || str.length() == 0) {
            str3 = "";
        } else {
            str3 = QZZ.LIZIZ('-', str);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJJ);
        LIZ2.append(C43075GvP.LIZ(str3));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C78966Uyw.LJJJJZ(new File(LIZIZ));
        C44694HgQ.LIZJ(str2, LIZIZ);
        return LIZIZ;
    }
}
