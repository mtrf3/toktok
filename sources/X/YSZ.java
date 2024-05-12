package X;

import com.ss.android.videoshop.controller.VideoController;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class YSZ implements InterfaceC47895Iqx {
    public final WeakReference<VideoController> LIZ;

    public YSZ(VideoController videoController) {
        this.LIZ = new WeakReference<>(videoController);
    }

    @Override // X.InterfaceC47895Iqx
    public final void LIZJ(int i, int i2, String str) {
        VideoController videoController;
        WeakReference<VideoController> weakReference = this.LIZ;
        if (weakReference != null && (videoController = weakReference.get()) != null) {
            videoController.handleMaskInfoCallback(i, i2, str);
        }
    }
}
