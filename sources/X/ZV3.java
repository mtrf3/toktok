package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.bytedance.realx.video.CameraSession;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZV3 {
    public static int LIZIZ(Context context) {
        int rotation = ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return CameraSession.UIDeviceOrientation.Portrait.value();
                }
                return CameraSession.UIDeviceOrientation.LandscapeLeft.value();
            }
            return CameraSession.UIDeviceOrientation.PortraitUpsideDown.value();
        }
        return CameraSession.UIDeviceOrientation.LandscapeRight.value();
    }

    public static VideoFrame.TextureBuffer LIZ(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }
}
