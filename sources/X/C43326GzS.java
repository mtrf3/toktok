package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import java.util.List;

/* renamed from: X.GzS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43326GzS {
    public static final List<Integer> LIZ = C47261Igj.LJJIJ(0);
    public static int LIZIZ;

    public static boolean LIZ() {
        UploadSingleSelectData LIZ2;
        if (!LIZ.contains(Integer.valueOf(LIZIZ))) {
            return false;
        }
        UploadSingleSelectData LIZ3 = HRV.LIZ();
        if ((LIZ3 == null || !LIZ3.getUploadSingleSelect() || !HRV.LIZJ()) && ((LIZ2 = HRV.LIZ()) == null || !LIZ2.getUploadSingleSelectNonStory() || !HRV.LIZIZ())) {
            return false;
        }
        return true;
    }
}
