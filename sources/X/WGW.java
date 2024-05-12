package X;

import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* loaded from: classes15.dex */
public final class WGW {
    public static final OSZ<PointF, PointF> LIZ = new OSZ<>(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));

    /* JADX WARN: Multi-variable type inference failed */
    public static final WGR LIZ(View view) {
        if (view == 0 || !(view instanceof WGR)) {
            return null;
        }
        return (WGR) view;
    }

    public static final boolean LIZIZ(MediaModel mediaModel) {
        int i;
        if (mediaModel == null || !mediaModel.LJI()) {
            return false;
        }
        int i2 = mediaModel.width;
        int i3 = mediaModel.height;
        if (i2 < i3) {
            i = i3;
        } else {
            i = i2;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        if ((i < 4096 && i2 < 2160) || C52243Ket.LIZ()) {
            return false;
        }
        return true;
    }
}
