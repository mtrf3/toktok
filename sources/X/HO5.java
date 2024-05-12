package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HO5 {
    public static boolean LIZ(Size itemSize, MyMediaModel mediaModel, boolean z) {
        int i;
        o.LJIIIZ(itemSize, "itemSize");
        o.LJIIIZ(mediaModel, "mediaModel");
        if (z) {
            if (mediaModel.height / mediaModel.width < 1.3333334f) {
                return true;
            }
            return false;
        }
        if (HOC.LIZIZ() && (i = mediaModel.width) > 0 && mediaModel.height / i < itemSize.getHeight() / itemSize.getWidth()) {
            return true;
        }
        return false;
    }
}
